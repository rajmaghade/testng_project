package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import PageObjectModel.LoginPageObject;
import java.io.IOException;
import Resources.basicClass;

@Test
public class LoginTestCase extends basicClass {
	
	public 	WebDriver driver;


	public void login() throws IOException {
		
		browserIntialization();
		
		//This driver has Scope 
		
		driver.get("https://login.perf1h.pc-rnd.salesforce.com/");
		
		LoginPageObject LPO = new LoginPageObject(driver);
		
		LPO.enterUsername().sendKeys("rahul");
		LPO.enterpassword().sendKeys("test");
		LPO.clickOnlogin().click();
		
		
		
	}
	
	
}
