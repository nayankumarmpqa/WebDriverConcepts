package waitConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver88.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("[id*='email']")).sendKeys("Nayan");
		driver.close();
	}

}
