package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginOrSignUp {
	
		@FindBy (xpath = "//input[@name='email']")
		private WebElement username;
		
		@FindBy (xpath = "//input[@name='pass']")
		private WebElement password;
		
		@FindBy (xpath = "//button[text()='Log In']")
		private WebElement loginbutton;
		
		@FindBy (xpath = "//a[text()='Forgotten password?']")
		private WebElement forgetpassword;
		
		@FindBy (xpath = "//a[text()='Create New Account']")
		private WebElement createnewacc;
		
		@FindBy (xpath = "//a[text()='Create a Page']")
		private WebElement createpage;
		
		@FindBy (xpath = "//a[text()='मराठी']")
		private WebElement marathi;
		
		private WebDriver driver;
		private WebDriverWait wait;
		
		public LoginOrSignUp(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	    public void sendUsername()
	    {
			//wait = new WebDriverWait(driver,20);
	    	//wait.until(ExpectedConditions.visibilityOf(username));
	    	username.sendKeys("dhanu@gmail.com");
	    }
	    
	    public void sendPassword()
	    {   
	    	//wait = new WebDriverWait(driver, 30);
	    	//wait.until(ExpectedConditions.visibilityOf(password));
	    	password.sendKeys("abcd1234");
	    }
	    
	    public void clickLoginbutton()
	    {
	    	loginbutton.click();
	    }
	    
	    public void clickForgetpassword()
	    {
	    	forgetpassword.click();
	    }
	    
	    public void clickCreatenewacc()
	    {
	    	createnewacc.click();
	    }
	    
	    public void clickCreatepage()
	    {
	    	createpage.click();
	    }
	    
	    public void clickMarathi()
	    {
	    	marathi.click();
	    }
	    
	    //OR
	    
	    public void loginToAccount()
	    {
	    	username.sendKeys("dhanashri@gmail.com");
	    	password.sendKeys("abcd1234");
	    	loginbutton.click();
	    	forgetpassword.click();
	    	createnewacc.click();
	    //	createpage.click();
	    //	marathi.click();
	    }
	    
	    
}