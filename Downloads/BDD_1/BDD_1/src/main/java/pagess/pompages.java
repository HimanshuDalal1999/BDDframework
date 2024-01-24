package pagess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pompages {
	WebDriver driver;
	
	@FindBy(xpath = "//a[@id='nav-cart']" ) private WebElement cartsicon;
	
	
	
	
	public pompages(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean cheakcarticon() {
		
		boolean disp = cartsicon.isDisplayed();
		
		
		return disp;
	}

}
