package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeMethod;

public class VerifyUserForm extends FormCreation {
public static String expresult;
	
@BeforeMethod

	public static void userForm() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get("https://recruiterflow.com/prospect");
	    WebElement search =driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]"));
		search.sendKeys(Name);
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		 WebElement value=driver.findElement(By.xpath("//span[@class=\"name\"]"));
		 expresult= value.getText();
		 System.out.println("The Verified Record is :" + value.getText());
	}



}
