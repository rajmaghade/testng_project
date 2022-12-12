package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	
	public WebDriver driver;
	
	By Firstname = By.xpath("//input[@name='UserFirstName'");
	By selectJobTitle = By.xpath("//select[@name='CompanyEmployees'");



		// TODO Auto-generated constructor stub
	

public void SighUpPageObject(WebDriver driver2){
	
	this.driver=driver2;
	
	}

public WebElement enterFirstName() {
	return driver.findElement(Firstname);	
}
public WebElement selectCompanyEmployees() {
	return driver.findElement(selectJobTitle);	
}


}