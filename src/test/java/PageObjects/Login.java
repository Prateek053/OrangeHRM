package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	// find web elements with the help of locators
	WebDriver d;
	
	@FindBy	(name = "username")
	WebElement username;
	
	@FindBy (name = "password")
	WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy (xpath = "//a[normalize-space()='Logout']")
	WebElement logoutbtn;
	
	public Login (WebDriver driver)
	{
		d = driver;
		PageFactory.initElements(d, this);
		
	}
	
	//method for orientation
	
	public void setUserName(String name)
	{
		username.sendKeys(name);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickBtn()
	{
		loginbtn.submit();
	}
	
	public void clicklogoutbtn()
	{
		logoutbtn.submit();
	}
}
