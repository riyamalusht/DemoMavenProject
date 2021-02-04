package DemoSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {
	

	@Test
	public void openBrowser() {
	
		System.setProperty("webdriver.chrome.driver", "/home/rmalusht/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
	
		
		{
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		String aTitle = driver.getTitle();
		String eTitle = "Google";

		System.out.println(aTitle);
		
		if (aTitle.equals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		}
		
      driver.get("https://hotel.happyeasygo.com/");	
      System.out.println(driver.getCurrentUrl());
      
     String actualUrl = "https://hotel.happyeasygo.com/";
     
     String expectedUrl = "https://hotel.happyeasygoooooo.com/";
     
     if (actualUrl.equals(expectedUrl)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
     driver.findElement(By.id("cityname")).click();
     
     driver.findElement(By.xpath("//span[contains(text(),'Goa')]")).click();
     
   driver.findElement(By.xpath("//button[contains(text(),'Happy Easy Search')]")).click();
     
     driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/i[1]")).click();
     
     
		}


		//driver.close();

	}


