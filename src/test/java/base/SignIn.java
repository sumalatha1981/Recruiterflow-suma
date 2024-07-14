package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

public class SignIn extends BaseTest{

	@BeforeMethod
	public static void signIn()
	{  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		//driver.findElement(By.partialLinkText("Sign_in")).click();
	driver.findElement(By.xpath(loc.getProperty("email"))).sendKeys("qa_hiring@recruiterflow.com");
	driver.findElement(By.xpath(loc.getProperty("pwd"))).sendKeys("qahiring007!");
	driver.findElement(By.xpath(loc.getProperty("submit"))).click();
	
	WebElement CandidateButton=driver.findElement(By.xpath("//div[@class='header-action-button']//child::button[@class='button-default candidate-create-button']"));
	CandidateButton.click();
		
	}
	
	
}
