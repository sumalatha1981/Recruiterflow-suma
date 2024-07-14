package testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.FormCreation;
import base.SignIn;
import base.VerifyUserForm;

public class Test1  {

	
	
	@Test(priority=1)
	public void signin() throws InterruptedException, AWTException, IOException
{     
        // LogIn with the given URL and Verifying the given URL is correct or Not
		
		BaseTest.setup();
		System.out.println("Name of the URL :" +BaseTest.URL );
	    String ActualTitle ="The Best ATS & CRM for Recruiting & Staffing Agencies | Recruiterflow";
	    Assert.assertEquals(ActualTitle,BaseTest.URL);
		
	    //Clicking on Sign In Button in to Recruiterflow.com
	   
	     SignIn.signIn();
   		
		
		//Filling the User Details in the Form and Uploading the Resume.
		
		 FormCreation.userdetails();
		 
		 //Verifying the user form
		
		 VerifyUserForm.userForm();
		
		 Assert.assertEquals(FormCreation.Name+" "+FormCreation.surname, VerifyUserForm.expresult);
		 
		
}
	
}
