package TestFramework.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import Utilities.BaseTest;

public class LoginTest extends BaseTest{
	
	@BeforeSuite
	public void setup()
	{
		LaunchApp("chrome");
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	

	@Test
	public void ValidLogin() throws InterruptedException
	{
		
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		lp.login();
		Thread.sleep(2000);
		hp.EnterCode();
		
	}

}
