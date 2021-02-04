package DemoTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import DemoSelenium.openBrowser;

public class testNGExample extends openBrowser {

	@Test(priority=1)
	public void verifyTitle() {

		openBrowser();

//		String aTitle = driver.getTitle();
//
//		AssertJUnit.assertEquals(aTitle, "Google");

	}

//	@Test(priority=2)
//	public void verifyUrl() {
//
//		openHappyeasygo();
//
//		String actualUrl = "https://hotel.happyeasygo.com/";
//
//		String expectedUrl = "https://hotel.happyeasygo.com/";
//
//		AssertJUnit.assertEquals(actualUrl, expectedUrl, "Test Passed");
//	}
//
//	@Test(priority=3)
//	public void verifyLoginButton() {
//
//		verifyLoginButoonIsEnable();
//	}
//
//	@Test(priority=4,dependsOnMethods = {"verifyLoginButton"})
//	public void verifyLogin() {
//		
//		login();
//	}
}
