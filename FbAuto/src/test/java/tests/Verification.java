package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginOrSignUp;

public class Verification {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUp loginorSignUp = new LoginOrSignUp(driver);
		
		loginorSignUp.loginToAccount();

	}

}
