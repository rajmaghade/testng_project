package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	
	public WebDriver driver;
	
	By Firstname = By.xpath("//input[@name='UserFirstName'");
	By Lastname = By.xpath("//input[@name='UserLastName'");
	
	By selectJobTitle = By.xpath("//select[@name='CompanyEmployees'");
	By Email=By.xpath("//input[@name='UserEmail']");
	By CompanyName=By.xpath("//input[@name='CompanyName']");


		// TODO Auto-generated constructor stub
	

public SignUpPageObject(WebDriver driver2){
	
	this.driver=driver2;
	
	}

public WebElement enterFirstName() {
	return driver.findElement(Firstname);	
}
public WebElement enterLastName() {
	return driver.findElement(Lastname);	
}
public WebElement selectCompanyEmployees() {
	return driver.findElement(selectJobTitle);	
}
	//Add

public WebElement Email() {
	return driver.findElement(Email);	
}
public WebElement CompanyName() {
	return driver.findElement(CompanyName);	
}

}


