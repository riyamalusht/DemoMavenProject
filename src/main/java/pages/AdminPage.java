package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class AdminPage {
    WebDriver driver;
    By admin = By.xpath("//b[contains(text(),'Admin')]");
    By username = By.id("searchSystemUser_userName");
    By userRole = By.id("searchSystemUser_userType");	
    By employeeName = By.id("searchSystemUser_employeeName_empName");
    By status = By.id("searchSystemUser_status");
    By search = By.id("searchBtn");
    By reset = By.id("resetBtn");
    By selectUsername = By.id("ohrmList_chkSelectRecord_18");
    By delete_Button = By.id("btnDelete");
    By ok_Button = By.id("dialogDeleteBtn");

    public  AdminPage(WebDriver driver) {

		this.driver = driver;

	}
    
    public void goToAdminPage() {

		driver.findElement(admin).click();

	}
    
    public void systemUsers_Search() {
    	
    	driver.findElement(username).click();

    	
    	driver.findElement(username).sendKeys("Riya");

    	
    	Select drpCountry = new Select(driver.findElement(userRole));
    	
		drpCountry.selectByVisibleText("Admin");
		
		driver.findElement(employeeName).click();
		
		driver.findElement(employeeName).sendKeys("Riya Malushte");
		
		Select drpStatus = new Select(driver.findElement(status));
		
		drpStatus.selectByVisibleText("Enabled");
		
		driver.findElement(search).click();
		
		driver.findElement(reset).click();
		




	}
    
    
    public void delete_Username() {
    	
    	driver.findElement(selectUsername).click();
    	
    	driver.findElement(delete_Button).click();
    	
    	driver.findElement(ok_Button);
    	
    boolean ok =	driver.findElement(ok_Button).isEnabled();
    
    System.out.println(ok);
    
	 Assert.assertEquals(true, false);
	 
	// driver.findElement(ok_Button).click();

    
    	
    }
    

}
