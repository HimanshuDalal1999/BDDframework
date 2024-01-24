package app_1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon_pom {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),' Electronics ')]")private WebElement electronictab;
	
	@FindBy(xpath = "(//span[contains(text(),'Audio')])[1]")private WebElement Audiobtn;
	
//	@FindBy(xpath = "")private WebElement Nextbtn;
//	@FindBy(xpath = "")private WebElement password;
//	@FindBy(xpath = "")private WebElement nextbtn;
//	@FindBy(xpath = "")private WebElement BrusselsAirlines;
//	@FindBy(xpath = "")private WebElement Economy;
////	@FindBy(xpath = "")private WebElement brussels;
////	@FindBy(xpath = "")private WebElement frankfurt;
////	@FindBy(xpath = "")private WebElement depratureDate;
////	@FindBy(xpath = "")private WebElement returndate;
////	@FindBy(xpath = "")private WebElement travelers;
////	@FindBy(xpath = "")private WebElement addtraveler;
////	@FindBy(xpath = "")private WebElement Enable_debug_pannel;
	
	public amazon_pom(WebDriver driver) 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String gettitle() {
		
		
		String title = driver.getTitle();
		
		return title;
	}
	
	
	public boolean clickelectronicbtn() {
		boolean electronicdisplay = electronictab.isDisplayed();
		
		electronictab.click();
		
		return  electronicdisplay;
	}
	
	public boolean audiomoushour() {
		
		Actions act = new Actions(driver);
		act.moveToElement(Audiobtn).perform();
		boolean btndisp = Audiobtn.isDisplayed();
		
		return btndisp;
	}
}
