package testcases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import base.SignIn;
import base.UploadFile;

public class FileUploadTest extends UploadFile {
 
	@Test
	public void formupload()
	{
		  System.out.println("File uploaded successfully");
	}
}
