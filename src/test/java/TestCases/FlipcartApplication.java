package TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.FlipCartLoginPage;

public class FlipcartApplication {
		
	
	@Test
	public void Login() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://beta.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FlipCartLoginPage flipcartLoginPage = new FlipCartLoginPage(driver);
		flipcartLoginPage.LoginButton().click(); 
		flipcartLoginPage.EmailOrMobileNumber().sendKeys("8886108410");
		flipcartLoginPage.Password().sendKeys("jagan123");
		flipcartLoginPage.Submit();
	}

}
