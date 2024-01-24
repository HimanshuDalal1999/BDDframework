package driverfactorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverclass {
	
	static WebDriver driver;
	
	public WebDriver browserinitialize(String browser) {
		
		
		if(browser.contains("chrome")) {
			
			
			 driver = new ChromeDriver();
			
			
			
			
			
		}
		
		else if (browser.contains("firefox")) {
			
			 driver= new FirefoxDriver();
		}
		
		return driver;
	}
	
	
	public static WebDriver  getsdriver() {
		
		return driver;
	}
	

}
