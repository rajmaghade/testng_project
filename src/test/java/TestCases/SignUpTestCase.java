package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.basicClass;

public class SignUpTestCase extends basicClass {
	
	public 	WebDriver driver;

	
	@Test
	public void verifySignUp() throws IOException {
		
		browserIntialization();
		driver.get("https://login.perf1h.pc-rnd.salesforce.com/");
		
		LoginPageObject LPO = new LoginPageObject(driver);
		LPO.clickOntryForFree().click();
		
		SignUpPageObject SPO = new SignUpPageObject();

		SPO.enterFirstName().sendKeys("Ramesh");
		
		Select s=new Select(SPO.selectCompanyEmployees());
		s.selectByIndex(1);
		
		
		
	}

}
