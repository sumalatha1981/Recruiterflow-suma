package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class UploadFile extends BaseTest  {

	
	@BeforeMethod
	
	public static void fileupload() throws AWTException, InterruptedException
	{      
		 SignIn.signIn();
		   driver.findElement(By.xpath("//button[text()=\"Upload resume\"]")).click();
		  Thread.sleep(2000);
		   Robot rb =new Robot();
		   StringSelection str =new StringSelection("C:\\Users\\SUMA LATHA\\Documents\\Suma_Resume.pdf");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		   
		   rb.keyPress(KeyEvent.VK_CONTROL);
		   rb.keyPress(KeyEvent.VK_V);
		   
		   rb.keyRelease(KeyEvent.VK_CONTROL);
		   rb.keyRelease(KeyEvent.VK_V);
		  
		   rb.keyPress(KeyEvent.VK_ENTER);
		   rb.keyRelease(KeyEvent.VK_ENTER);
		  
		
	}

	private Object findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}
}