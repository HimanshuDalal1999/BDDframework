package execution_process;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverfactorys.driverclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pagess.pompages;

public class app_steps {
	
	WebDriver driver ;	
	
	pompages ps = new pompages(driverclass.getsdriver());
	@Given("user is at landing page")
	public void user_is_at_landing_page() {
	
		 driver = driverclass.getsdriver();
		 
		 driver.get("https://www.amazon.in/");
	}

	@Then("cart icon should get displa")
	public void cart_icon_should_get_displa() {
		
		boolean diplays = ps.cheakcarticon();
		
		Assert.assertTrue(diplays);

	}
}
