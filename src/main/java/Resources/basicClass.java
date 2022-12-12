package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicClass {
	
	public void browserIntialization() throws IOException {
			
	FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\MavenProject\\src\\main\\java\\Resources\\data.properties"); 
			
			//To Access the Properties
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
		WebDriver driver =new ChromeDriver();
		
		} else if (browserName.equalsIgnoreCase("Firefox"));{
			
		} 
			System.out.println("Please enter valid browser name");
		
		
		
	}
	
	
	

}
