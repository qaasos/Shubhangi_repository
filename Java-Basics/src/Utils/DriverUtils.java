package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtils {
	
	
	static WebDriver driver;
	
	public  WebDriver getDriver(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-extensions");
			options.addArguments("disable-infobars");
			options.addArguments("incognito");
		
			driver = new ChromeDriver(options);
			
			return driver;
			
		}
		
		else if(browser.equalsIgnoreCase("internet explorer"))
		{
			return driver;
		}
		
		else
		{
			return driver;
		}
		
				
	}

}