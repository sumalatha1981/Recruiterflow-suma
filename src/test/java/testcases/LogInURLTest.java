package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LogInURLTest extends BaseTest {


	@Test
	public void login()
	{
		
		String ExpectedTitle =driver.getTitle();
		System.out.println(ExpectedTitle );;
	 String ActualTitle ="The Best ATS & CRM for Recruiting & Staffing Agencies | Recruiterflow";
	 Assert.assertEquals(ActualTitle,ExpectedTitle);
		
	}
}
