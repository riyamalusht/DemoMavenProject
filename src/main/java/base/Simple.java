package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/rmalusht/Downloads/chromedriver");

		
		WebDriver driver = new ChromeDriver();
		 

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		

			driver.manage().window().maximize();
		
	}
		
	}


