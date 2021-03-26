package testNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngDemoSoftAssert {
	@Test
	public void testGoogle() {
		SoftAssert s = new SoftAssert();
		Reporter.log("Step1", true);
		s.assertEquals("xyz", "abc");
		Reporter.log("Step2", true);
		Reporter.log("Step3", true);
		s.assertAll();
		Reporter.log("Step4", true);
	}
}
