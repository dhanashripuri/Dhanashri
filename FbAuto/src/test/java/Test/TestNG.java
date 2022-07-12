package Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.CreateNewAccount;
import pom.LoginOrSignUp;

public class TestNG {
	
	WebDriver driver;
	LoginOrSignUp loginorSignUp;
	CreateNewAccount createNewAccount;
	SoftAssert soft;
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openUrl()
	{
		System.out.println("before method");
		
		driver.get("https://www.facebook.com/");
		
		loginorSignUp = new LoginOrSignUp(driver);
		
		createNewAccount = new CreateNewAccount(driver);
		soft = new SoftAssert();
	}
	
	@Test 
	public void login()
	{
		System.out.println("test");
		
		loginorSignUp.sendUsername();
		loginorSignUp.sendPassword();
		loginorSignUp.clickLoginbutton();
	}
	
	@Test (priority = 1)
	public void createNewAcc() throws InterruptedException
	{
		Thread.sleep(2000);
		loginorSignUp.clickCreatenewacc();
		createNewAccount.createNewAcc();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		soft.assertEquals(url, "https://www.facebook.c");
		soft.assertAll();
		
	}
	
	@Test (priority =2)
	public void forgetPass()
	{
		loginorSignUp.clickForgetpassword();
		
		String url2 = driver.getCurrentUrl();
		Assert.assertEquals(url2, "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	}
	
	@Test (priority = 3)
	public void language() throws InterruptedException
	{
        loginorSignUp.clickMarathi();
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		soft.assertEquals(url1, "https://mr-in.facebook.c");
		soft.assertAll();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
		driver.navigate().back();
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
		driver.quit();
	}

}
