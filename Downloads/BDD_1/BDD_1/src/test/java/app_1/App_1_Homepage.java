package app_1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class App_1_Homepage {
	WebDriver driver;
	
amazon_pom amz = new amazon_pom(driver__factory.getdriver());
	@Given("user should at home pages")
	public void user_should_at_home_pages() {
		
  driver = driver__factory.getdriver();

		driver.get("https://www.amazon.in/");

		
		
	    
	}

	@Then("validate application title")
	public void validate_application_title() {

		String ll = amz.gettitle();
		
	boolean titl = ll.contains("amazon");
	
	assertEquals(ll, titl);
	}

	@Given("user should at home page")
	public void user_should_at_home_page() {

		 driver = driver__factory.getdriver();
			driver.get("https://www.amazon.in/");

		
	}

	@When("user should click")
	public void user_should_click() {
	
		amz.clickelectronicbtn();
		
	}

	@When("click any mobile")
	public void click_any_mobile() {

		amz.audiomoushour();
	}

	@Then("user should see mobile emage")
	public void user_should_see_mobile_emage() {
	 boolean ss = amz.audiomoushour();
	assertTrue(ss);
	

}}
