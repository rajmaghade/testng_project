package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver;      //============= This driver doesn't have scope
	
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='Login']");
	private By tryForFree = By.xpath("//a[@id='signup_link']");
	
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
			
	}
	
	public WebElement enterUsername() {
		return driver.findElement(username);
		
		// driver.findElement(By.xpath"//input[@id='username']");   -------- this is demo for the xpath of username
		
	}
	
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	public WebElement clickOnlogin() {
		return driver.findElement(login);
	}
	public WebElement clickOntryForFree() {
		return driver.findElement(tryForFree);
	}



}
