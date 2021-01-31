package waitConcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncroniztninSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver88.exe");

		WebDriver driver = new ChromeDriver();

		// pageLoadTimeout is for webpage loading aftre that do further action
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// thred.sleep is static wait

		// implicitlyWait ans explicitlyWait is dynamic wait
		// it is global - is applicable for all elements for a driver is inetracting
		// we can overwrite the explicitlyWait at any time at any line
		// it is also dynamic
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		WebElement createB = driver.findElement(By.id("u_0_2"));
		clickOn(driver, createB, 5);

		WebElement fname = driver.findElement(By.name("fname"));

		WebElement lname = driver.findElement(By.name("lname"));
		
		sendKeys(driver, fname, 10, "Tom");
		
		
	}
	
	//sendKeys is my custom method
	// no explicit keyword or method
	//with webDriver
	//specific to element 
	//dynamic in nature
	// we should never use implicitlyWait and explicitlyWait togather
	 public static void sendKeys(WebDriver driver, WebElement locator, int timeout, String value) {
		 new WebDriverWait(driver, Duration.ofSeconds(timeout)  )
		 .until(ExpectedConditions.visibilityOf(locator));
		 locator.sendKeys(value);
	 }
	 
	//clickOn is my custom method
		 public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
			 new WebDriverWait(driver, Duration.ofSeconds(timeout)  )
			 .until(ExpectedConditions.elementToBeClickable(locator));
			 locator.click();
		 }
	
}