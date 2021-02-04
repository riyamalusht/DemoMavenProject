package pageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.homePage;
import pages.loginPage;

public class AdminPageTest {

	WebDriver driver;

	AdminPage objHome;

	@BeforeTest

	public void setup() {

		System.setProperty("webdriver.chrome.driver", "/home/rmalusht/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test(priority = 0)

	public void verify_AdminPage() {

		AdminPage objAdmin = new AdminPage(driver);
		loginPage objLogin = new loginPage(driver);

		objLogin.login("Admin", "admin123");

		objAdmin.goToAdminPage();

		objAdmin.systemUsers_Search();

	}

	@Test(priority = 1)
	public void verify_Delete_Username() {
		
		AdminPage objAdmin = new AdminPage(driver);
		
		objAdmin.delete_Username();
		

	}
	
	/*
	 * @Test(priority = 2) public void verify_ok_button_is_enabled() {
	 * 
	 * AdminPage objAdmin = new AdminPage(driver);
	 * 
	 * objAdmin.delete_Username();
	 * 
	 * Assert.assertEquals(true, true);
	 * 
	 * }
	 */
}
