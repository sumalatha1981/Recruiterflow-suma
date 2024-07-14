package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.SignIn;

public class SigninTest extends BaseTest {

	@Test
	public void signin()
	{SignIn.signIn();
		String ExpectedTitle =driver.getTitle();
		System.out.println(ExpectedTitle);
		Assert.assertEquals(ExpectedTitle, "Add candidate");
	}
}
