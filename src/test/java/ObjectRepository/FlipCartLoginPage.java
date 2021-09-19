package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipCartLoginPage {

	WebDriver driver;

	public FlipCartLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By LoginButton = By.xpath("//div[contains(text(),'Login')]");
	By EmailOrMobileNumber = By.xpath("//input[@type='number']");
	By Password = By.xpath("//input[@type='password']");
	By Submit = By.cssSelector(".css-1dbjc4n.r-1awozwy.r-184aecr.r-z2wwpe.r-1loqt21.r-18u37iz.r-tmtnm0.r-1777fci.r-1x0uki6.r-1w50u8q.r-ah5dr5.r-1otgn73");

	public WebElement LoginButton() {

		return driver.findElement(LoginButton);

	}

	public WebElement EmailOrMobileNumber() {

		return driver.findElement(EmailOrMobileNumber);
	}
	
	public WebElement Password()
	{
		
		return driver.findElement(Password);
	}
	
	public WebElement Submit() 
	{
		return driver.findElement(Submit);
	}

}
