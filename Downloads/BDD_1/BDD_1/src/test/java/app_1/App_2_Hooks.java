package app_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.Before;
public class App_2_Hooks {
	
	driver__factory df ;
	
	@Before
	public void lounchbrowser() throws IOException {
		
		
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\app_1\\dd.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String browsername = prop.getProperty("browser");
		
		 df = new driver__factory();
	       df.lounchbrouser(browsername);
		
	}

}
