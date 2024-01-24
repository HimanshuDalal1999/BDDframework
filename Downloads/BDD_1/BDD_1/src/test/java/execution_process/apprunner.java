package execution_process;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features =  {"src\\test\\resources\\appfetures"},
		
		glue = {"execution_process"},
		
		plugin = {"pretty"}
		
		
		
		
		
		)
public class apprunner extends AbstractTestNGCucumberTests {

}
