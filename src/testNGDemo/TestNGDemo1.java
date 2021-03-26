package testNGDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo1 {


	@BeforeClass
	public void openApp() {
		Reporter.log("@BeforeClass OpenApp", true);
	}

	@AfterClass
	public void closeApp() {
		Reporter.log("@AfterClass CloseApp", true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log(" @BeforeMethod Login", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("@AfterMethod Logout", true);
	}

	@Test(priority = 2, invocationCount = 2)
	public void editUser() {
		Reporter.log("@Test(priority = 2, invocationCount = 2)  Edit User", true);
	}

	@Test
	public void register() {
		Reporter.log("@Test Register", true);
	}

	@Test

	public void deleteUser() {
		Reporter.log("@Test Delete User", true);
	}

	@Test(priority = 0)
	public void Zmethod() {
		Reporter.log("@Test(priority = 0)  Zmethod", true);
		Assert.fail();
	}
}
