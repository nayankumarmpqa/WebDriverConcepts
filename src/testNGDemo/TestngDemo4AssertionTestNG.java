package testNGDemo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo4AssertionTestNG {

	public WebDriver driver;
	public String eTitle;

	@BeforeMethod
	public void preCondition() {
		System.out.println("Enter expected title:");
		Scanner sc = new Scanner(System.in);
		eTitle = sc.next();
		Reporter.log("eTitle: " + eTitle, true);
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void testGoogle() {
		driver.get("https://www.google.com");
		String aTitle = driver.getTitle();
		Reporter.log("aTitle: " + aTitle, true);
		Assert.assertEquals(aTitle, eTitle);
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
