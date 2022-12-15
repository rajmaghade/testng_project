package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import PageObjectModel.LoginPageObject;
import java.io.IOException;
import Resources.basicClass;
import Resources.commonMethods;
import Resources.constant;


public class LoginTestCase extends basicClass {
	
@Test

	public void login() throws IOException {
		
		LoginPageObject LPO = new LoginPageObject(driver);
		
		LPO.enterUsername().sendKeys(constant.username);
		
		LPO.enterPassword().sendKeys(constant.password);
		
		LPO.clickOnLogin().click();
		
		commonMethods.handleAssertion(LPO.errorMessage().getText(),constant.errormessage);
		
	}
	
	
}
