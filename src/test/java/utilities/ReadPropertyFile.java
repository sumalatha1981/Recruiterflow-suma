package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties p = new Properties();
		FileReader fr =new FileReader("C:\\Users\\SUMA LATHA\\eclipse-workspace\\SeleniumFramework\\testFramework\\src\\test\\resources\\Configfiles\\config.properties");
		p.load(fr);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
		
	}

}
