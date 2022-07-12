package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.CreateNewAccount;
import pom.LoginOrSignUp;

public class TestCreateNewAcc {
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
        LoginOrSignUp loginorSignUp = new LoginOrSignUp(driver);
		loginorSignUp.clickCreatenewacc();
		
		CreateNewAccount createNewAccount = new CreateNewAccount(driver);
		createNewAccount.createNewAcc();
	}
}
