package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openBrowser {

	public WebDriver driver;
	

	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/rmalusht/Downloads/chromedriver");

		 driver = new ChromeDriver();
		 

	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	

		driver.manage().window().maximize();

	}
	
//	public void openHappyeasygo() {
//		
//		 driver.get("https://hotel.happyeasygo.com/");	
//	      
//	      
//	    
//		
//		
//	}
//	
//	public void verifyLoginButoonIsEnable() {
//		
//		Actions actions = new Actions(driver);
//
//
////	driver.findElement(By.xpath("//p[contains(text(),'FLIGHT')]"))
//	
//	WebElement source = driver.findElement(By.xpath("//p[contains(text(),'FLIGHT')]"));
//	
//	source.click();
//	
//	actions.contextClick(source).build().perform();
//	
//
//	}
//	
//	public void login() {
//		driver.findElement(By.id("login-btn")).click();
//		
//	}
}