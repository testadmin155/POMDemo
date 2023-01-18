package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.id("username")).sendKeys("automationtestacademy@gmail.com");
	//PageFactory
	@FindBy(id="username")
	WebElement emailid;
	
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@9999");
	//Page Factory
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	//driver.findElement(By.id("loginBtn")).click();
	@FindBy(id="loginBtn")
	WebElement login;
	
	
	public void login()
	{
		emailid.sendKeys("automationtestacademy@gmail.com");
		password.sendKeys("Test@9999");
		login.click();
	}
}
