package pageTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.demoBase;
import pages.loginPage;

public class loginPageTest {

	WebDriver driver;

	loginPage objLogin;

	@BeforeTest

	public void setup() {

		System.setProperty("webdriver.chrome.driver", "/home/rmalusht/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test(priority = 0)

	public void verify_Login() {

		objLogin = new loginPage(driver);

		objLogin.login("Admin", "admin123");

	}
}
