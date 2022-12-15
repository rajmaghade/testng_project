package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class basicClass {
	
	public WebDriver driver;
	
	public void browserIntialization() throws IOException {
			
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties"); 
			
			//To Read the Properties
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
		 driver =new ChromeDriver();
		
		} else if (browserName.equalsIgnoreCase("Firefox"));{
			
		} 
			System.out.println("Please enter valid browser name");
		
		}
		
	@BeforeMethod
	public void launch()throws IOException{
		
		browserIntialization();
		driver.get("https://login.salesforce.com/");
		
		
		
	}
	
	}
	
