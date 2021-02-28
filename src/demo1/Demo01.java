package demo1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Demo01 {

	public static void main(String[] args) throws IOException {

		{

			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://www.google.com");
			String title=driver.getTitle();
			if(title.equals("Google"))
			{
			System.out.println("Pass:Title is Google");
			}
			else
			{
			System.out.println("Fail:Title is not Google: actual title is"+title);
			}
			String url=driver.getCurrentUrl();
			if(url.contains("google.co.in"))
			{
			System.out.println("Pass: url has co.in");
			}
			else
			{
			System.out.println("Fail:url dont have co.in"+url);
			}

			EventFiringWebDriver e = new EventFiringWebDriver(driver);
			File srcfile = e.getScreenshotAs(OutputType.FILE);
			File destfile = new File("E:\\actitime1.png");
			Files.copy(srcfile, destfile);

			driver.close();
	}

	}
}
