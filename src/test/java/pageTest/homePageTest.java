package pageTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.demoBase;
import pages.homePage;
import pages.loginPage;

public class homePageTest {

	WebDriver driver;

	homePage objHome;

	@BeforeTest

	public void setup() {

		System.setProperty("webdriver.chrome.driver", "/home/rmalusht/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test(priority = 0)

	public void verify_Homepage() {
		
	//	objHome = new homePage(driver);
		
		loginPage objLogin = new loginPage(driver);

		objLogin.login("Admin", "admin123");
		objHome.clickMaintainance();
		objHome.setPassword("Riya@1234");
	
		objHome.clickVerify();




	}
	

	@Test(priority = 1)
	public void test_Verify_Button() {
		objHome.clickVerify();

	}
	
	@Test(priority = 2)
	public void verify_notifications() {
		
		objHome.notifications();

	}

	
}
