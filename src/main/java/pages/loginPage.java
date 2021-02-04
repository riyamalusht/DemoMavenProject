package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.demoBase;

public class loginPage extends demoBase {
    WebDriver driver;
    By userName = By.id("txtUsername");
    By password = By.id("txtPassword");
    By titleText =By.className("OrangeHRM");

    By loginButton = By.id("btnLogin");
    
    
    public loginPage(WebDriver driver){

        this.driver = driver;

    }
    
    public void setUserName(String strUserName){

        driver.findElement(userName).sendKeys(strUserName);

    }
    
    public void setPassword(String strPassword){

        driver.findElement(password).sendKeys(strPassword);

   }
    
    public void clickLogin(){

        driver.findElement(loginButton).click();

}

    public void login(String strUserName,String strPasword){


        this.setUserName(strUserName);


        this.setPassword(strPasword);


        this.clickLogin();        
    }
	
}
