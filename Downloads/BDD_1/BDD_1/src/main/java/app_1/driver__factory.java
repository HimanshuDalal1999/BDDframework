package app_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driver__factory {
	
	static WebDriver driver;
	public WebDriver lounchbrouser(String browser) {
		
		if(browser.contains("Chrome")) {
		driver = new ChromeDriver();
			
			
		}
		else if(browser.contains("firfox")) {
			
			 driver = new FirefoxDriver();
			driver.get("https://www.amazon.in/");
		}
		
		else if (browser.contains("safari"))
		{
			 driver= new SafariDriver();
		}
		
		else if(browser.contentEquals("tor"))
		{
		 driver= new EdgeDriver();
		}
		return driver;
	}
	
	
	
	
	public static WebDriver getdriver() {
		
		return driver;
	}

}
