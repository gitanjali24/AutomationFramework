package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	public void basetest() throws IOException{
		
		FileInputStream file=new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/resources/config.properties"));
		Properties prop=new Properties();
		prop.load(file);
		
		System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	
	}

}
