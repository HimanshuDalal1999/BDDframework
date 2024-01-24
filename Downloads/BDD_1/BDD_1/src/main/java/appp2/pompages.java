package appp2;

import java.time.Duration;

import javax.print.attribute.standard.JobHoldUntil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pompages {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "") private WebElement cart;
	@FindBy(xpath = "") private WebElement moushowersignin;
	@FindBy(xpath = "") private WebElement clksign;
	@FindBy(xpath = "") private WebElement username;
    @FindBy(xpath = "") private WebElement continuebtn;
    @FindBy(xpath = "") private WebElement password;
    @FindBy(xpath = "") private WebElement createbtn;
    
    
    
    
    
    public void pompage(WebDriver driver) {
    	
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
     wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
    
    
    public void gettitel(String titles) {
    	
    	driver.getTitle();
    }
    
    public void carticon() {
    	
    	cart.isDisplayed();
    }
    
    public void signin() {
    	
    	Actions act= new Actions(driver);
    	
    	act.moveToElement(clksign).build().perform();
    	
    	
    	
    }
    
    public void username(String username1) {
    	username.sendKeys(username1);
    	
    	continuebtn.click();
    }
}