package executions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = {"src\\test\\resources\\Executions\\Homepage.feature"},

		glue = {"executions"},

		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)

public class amazonrunner extends AbstractTestNGCucumberTests {

}
