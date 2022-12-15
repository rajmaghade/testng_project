package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.basicClass;
import Resources.commonMethods;
import Resources.constant;

public class SignUpTestCase extends basicClass {
	
	@Test
	public void verifySignUp() throws IOException, InterruptedException {
		
		
		LoginPageObject LPO = new LoginPageObject(driver);
		
		LPO.clickOnTryForFree().click();
		
		SignUpPageObject SPO = new SignUpPageObject(driver);
		
		Thread.sleep(5000);

		SPO.enterFirstName().sendKeys(constant.firstname);
		
		commonMethods.selectDropdown(SPO.selectCompanyEmployees(), 1);
		
		
		
	}

}
