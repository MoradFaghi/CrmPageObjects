package comCrmQaBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import comCrmQaUtility.TestUtil;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/moradfaghi/eclipse-workspace/CrmPageObjects/src/main/java/comCrmQaConfig/config.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();	
		}
		
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.getProperty("webdriver.chrome.driver", "/Users/moradfaghi/Documents/chromedriver");
			driver = new ChromeDriver();

		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	}	
}