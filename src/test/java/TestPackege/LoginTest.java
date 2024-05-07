package TestPackege;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Login;

public class LoginTest {
	
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Before test executed");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20, 0));
		
	}
	
	@Test(priority=1, enabled=true)
	public void logintest() throws InterruptedException
	{
		// find username and enter username "Admin"
		Login lg = new Login(driver);
		
		//enter username
		lg.setUserName("Admin");
		
		//enter password
		lg.setPassword("admin123");
		
		//click login button
		lg.clickBtn();
		Thread.sleep(5000);
		
		//click logout button
		lg.clicklogoutbtn();
	}
	
	
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
