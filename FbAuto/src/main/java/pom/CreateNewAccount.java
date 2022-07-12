package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {
	
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy (xpath = "//input[@aria-label='Surname']")
	private WebElement surname;
	
	@FindBy (xpath = "//input[@aria-label='Mobile number or email address']")
	private WebElement moboremail;
	
	@FindBy (xpath = "//input[@aria-label='Re-enter email address']")
	private WebElement remoboremail;
	
	@FindBy (xpath = "//select[@title='Day']")
	private WebElement day;
	
	@FindBy (xpath = "//select[@title='Month']")
	private WebElement month;
	
	@FindBy (xpath = "//select[@title='Year']")
	private WebElement year;
	
	@FindBy (xpath = "(//input[@class='_8esa'])[1]")
	private WebElement female;
	
	@FindBy (xpath = "//label[text()='Male']")
	private WebElement male;
	
	@FindBy (xpath = "//label[text()='Custom']")
	private WebElement custom;
	
	@FindBy (xpath = "//select[@aria-label='Select your pronoun']")
	private WebElement pronoun;
	
	//@FindBy (xpath = "//option[text()='He: \\\"Wish him a happy birthday!\\\"']")
	//private WebElement option;
	
	@FindBy (xpath = "//input[@name='custom_gender']")
	private WebElement optional;
	
	@FindBy (xpath = "//button[text()='Sign Up']")
	private WebElement signup;
	
	private WebDriver driver;
	
	public CreateNewAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	    this.driver = driver;
	    
	}
	
    public void createNewAcc()
    {
    	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	
    	firstname.sendKeys("dhanu");
    	surname.sendKeys("pass");
    	moboremail.sendKeys("dhanashri@gmail.com");
    	remoboremail.sendKeys("dhanashri@gmail.com");
    	
    	day.click();
    	Select selday = new Select(day);
    	selday.selectByValue("4");
    	
    	month.click();
    	Select selmonth = new Select(month);
    	selmonth.selectByValue("5");
    	
    	year.click();
    	Select selyear = new Select(year);
    	selyear.selectByValue("1999");
    	
    	female.click();
    	male.click();
    	custom.click();
    	
    	//pronoun.click();
    	Select selpronoun = new Select(pronoun);
    	selpronoun.selectByIndex(1);
    	
    	//option.click();
    	optional.sendKeys("xyz");
    	signup.click();
    	
    }
	
    
}
