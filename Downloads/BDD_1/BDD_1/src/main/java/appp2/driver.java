package appp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
	static WebDriver driver;
	
	public WebDriver lounchbrowser(String browser) {
		
		
		if(browser.contains("chrome")) {
			
			 driver = new ChromeDriver();
			
			
		}
		
		else if (browser.contains("firfox")) {
			
			driver = new ChromeDriver();
		}
		
		return driver;
		
		
	}
	
	
	public static WebDriver getdriver() {
		
		return driver;
	}

}
