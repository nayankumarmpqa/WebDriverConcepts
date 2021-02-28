package demo1;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxWithAddOns {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.findElement(By.className("gNO89b")).getAttribute("name"));

		// getting element location (x,y) axis
		Point p1 = driver.findElement(By.className("gNO89b")).getLocation();
		Point p2 = driver.findElement(By.className("RNmpXc")).getLocation();

		// printing element location (x,y) axis

		System.out.println("button1 Point are " + p1);
		System.out.println("button2 point are " + p2);

		// getting elements X axis location into a integer

		int b1 = p1.getX();
		int b2 = p2.getX();
		System.out.println("button1 " + b1);
		System.out.println("button2 " + b2);

		// Checking if the elements are in the same line

		if (b2 - b1 <= 0) {
			System.out.println("buttons are in same line");

		} else {
			System.out.println("buttons are NOT in same line");

		}

		// getting elements Size:dimention (height, width)
		Dimension d1 = driver.findElement(By.className("gNO89b")).getSize();
		Dimension d2 = driver.findElement(By.className("RNmpXc")).getSize();

		// printing element Size:dimention (height, width)

		System.out.println("button d1 dimetions are " + d1);
		System.out.println("button d2 dimetions are " + d2);

		// printing element height, width using Dimentions

		System.out.println("button d1 dimetions are " + d1.getHeight());
		System.out.println("button d2 dimetions are " + d2.getWidth());

		driver.close();

	}

}
