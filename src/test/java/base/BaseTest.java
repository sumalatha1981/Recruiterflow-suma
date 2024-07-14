package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties p =new Properties();
	public static Properties loc =new Properties();
	public static FileReader fr ;
	public static FileReader ele;
	public static String URL;
	
	
	@BeforeMethod
	public static void setup() throws IOException
	{
		
		if (driver==null)
		{
			System.out.println("The path is"+System.getProperty("user.dir"));
			
			FileReader fr =new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Configfiles\\config.properties");
			FileReader ele =new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Configfiles\\locators.properties");
			p.load(fr);
			loc.load(ele);
		}
		if(p.getProperty("browser").equalsIgnoreCase("chrome"))
			
		{	
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(p.getProperty("testurl"));
			URL=driver.getTitle();
			//System.out.println(driver.getTitle());
		}
		
		else if(p.getProperty("browser").equalsIgnoreCase("firefox"))
			
		{	
			WebDriverManager.firefoxdriver().setup();
		   driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(p.getProperty("testurl"));
		}
	}
	
//	@AfterMethod
//	public void teardown()
//	{
	//	driver.close();
	//	System.out.println("teardown");
	//}
	
	
}
