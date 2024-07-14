package base;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class FormCreation extends BaseTest {
	public static String  Name ="Ashoka";
   public static	String surname ="Garla";
@BeforeMethod
	public static void userdetails() throws InterruptedException, AWTException
	{
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement 	firstname = driver.findElement(By.xpath("//input[@placeholder=\"e.g. John\"]"));
	WebElement lastname = driver.findElement(By.xpath("//input[@placeholder=\"e.g. smith\"]"));
	WebElement useremail =driver.findElement(By.xpath("//input[@placeholder=\"e.g. johnsmith@gmail.com\"]"));
	WebElement  mobileno =driver.findElement(By.xpath("//input[@placeholder=\"e.g. +1 408 600 1338\"]"));
	WebElement location =driver.findElement(By.xpath("//p[(text()=\"LOCATION\")]//following-sibling::input[@placeholder=\"Search location...\"]"));
	WebElement streetaddress1= driver.findElement(By.xpath("//input[@placeholder=\"Street address I\"]"));
	WebElement streetaddress2= driver.findElement(By.xpath("//input[@placeholder=\"Street address II\"]"));
	WebElement City =driver.findElement(By.xpath("//input[@placeholder=\"City...\"]"));
	WebElement state =driver.findElement(By.xpath("//input[@placeholder=\"State...\"]"));
	WebElement Country =driver.findElement(By.xpath("//input[@placeholder=\"Country...\"]"));
	WebElement zipcode =driver.findElement(By.xpath("//input[@placeholder=\"Zip code...\"]"));
	WebElement companyname = driver.findElement(By.xpath("(//input[@placeholder=\"Enter company name\"])[1]"));
	WebElement title =driver.findElement(By.xpath("//input[@placeholder=\"Enter title\"]"));
	WebElement Schoolname =driver.findElement(By.xpath("(//input[@placeholder=\"Enter school name\"])[1]"));
	WebElement degree =driver.findElement(By.xpath("(//input[@placeholder=\"Enter degree\"])[1]"));
	WebElement specialisation =driver.findElement(By.xpath("(//input[@placeholder=\"Enter specialization\"])[1]"));
    WebElement source=driver.findElement(By.xpath("//input[@id=\"react-select-4-input\"]"));
	WebElement tags =driver.findElement(By.xpath("//*[@id=\"react-select-5-input\"]"));
	WebElement skills =driver.findElement(By.xpath("//*[@id=\"react-select-6-input\"]"));
	WebElement Linkedin =driver.findElement(By.xpath("//input[@placeholder=\"Linkedin link\"]"));	
	WebElement createcandidate =driver.findElement(By.xpath("//button[text()=\"Create candidate\"]"));

    firstname.sendKeys(Name);
	
	lastname.sendKeys(surname);
	
	
	useremail.sendKeys("Ashoka.bhargav@gmail.com");
	
	mobileno.sendKeys("8504303606");

	location.sendKeys("Bangalore, Karnataka, India",Keys.ARROW_DOWN);
	Thread.sleep(1000);
	
	//UploadFile.fileupload();
	
	location.click();
	streetaddress1.sendKeys("33,Elite series,Pionier Lake District");
	streetaddress2.sendKeys("gattahalli,Bangalore");
	City.sendKeys("Bangalore");
	state.sendKeys("karnataka");
	Country.sendKeys("India");
	zipcode.sendKeys("560099");
	companyname.sendKeys("Odessa Technologies Pvt Ltd");
	title.sendKeys("Quality Engineer");
    Schoolname.sendKeys("A.I.T.S");
    degree.sendKeys("M.C.A");
    specialisation.sendKeys("Computers");
    Thread.sleep(2000);
    Actions act =new Actions(driver);
    act.moveToElement(Linkedin);
    act.perform();
    Thread.sleep(2000);
    source.click();
	source.sendKeys("Email");
	Thread.sleep(1000);
	source.sendKeys(Keys.ENTER);
	tags.sendKeys("Testing");
	Thread.sleep(1000);
	tags.sendKeys(Keys.ENTER);
	skills.sendKeys("Automation testing");
	Thread.sleep(1000);
	skills.sendKeys(Keys.ENTER);
    Linkedin.sendKeys("https://www.linkedin.com/in/suma-latha-vankadara-66ba101ba/");
	Thread.sleep(1000);
	createcandidate.click();
	Thread.sleep(1000);

	}
}
