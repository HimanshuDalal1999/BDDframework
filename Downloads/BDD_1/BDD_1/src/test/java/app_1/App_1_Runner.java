package app_1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\app_1\\app_.feature"}
		,
		glue = {"app_1"},
		plugin = {"pretty"}
		
		
		
		)




public class App_1_Runner extends AbstractTestNGCucumberTests {

}
