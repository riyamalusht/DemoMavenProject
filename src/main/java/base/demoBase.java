package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoBase {
	
	public WebDriver driver;

	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "/home/rmalusht/Downloads/chromedriver");

		 driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	
		

	}
}
