package execution_process;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverfactorys.driverclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class apphooks_k {
	
	WebDriver driver ;
	 driverclass jj ;
	 
	 @Before
	public void lounchesbrowser() throws IOException, InterruptedException {
		
		
		Properties prop = new Properties();
		
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\appfetures\\apps.properties";
	
	FileInputStream fs = new FileInputStream(path);
	
	prop.load(fs);
	
	
	 String browsername = prop.getProperty("browser");
	 
	 driverclass jj = new driverclass();
	 

	driver = jj.browserinitialize(browsername);
	// driver.manage().window().maximize();
	 Thread.sleep(20);
	 
	
	}
	 
	 @After
	 
	 public void quit() throws InterruptedException {
		Thread.sleep(3000); 
		 driver.quit();
	 }

}
