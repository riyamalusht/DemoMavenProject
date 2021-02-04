package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	WebDriver driver;
	By maintainance = By.xpath("//b[contains(text(),'Maintenance')]");
	By password_ = By.id("confirm_password");
	By verify_Button = By.xpath("//*[@id=\"frmPurgeEmployeeAuthenticate\"]/div/div/input");
	By notifications = By.xpath("//body[1]/div[1]/div[1]/div[1]/span[1]/svg[1]/path[1]");

	public homePage(WebDriver driver) {

		this.driver = driver;

	}

	public void clickMaintainance() {

		driver.findElement(maintainance).click();

	}

	public void setPassword(String strPassword) {

		driver.findElement(password_).sendKeys(strPassword);

	}

	public void clickVerify() {

		driver.findElement(verify_Button).click();

	}

	public void notifications() {

		WebElement msg = driver.findElement(notifications);

		String text = msg.getText();

		System.out.println(text);
	}

	public void home(String strPasword) {

		this.setPassword(strPasword);

		this.clickVerify();
	}

}
