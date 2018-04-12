package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshots extends DriverUtils{
	
	public void webDriver(WebDriver driver)
	{
		super.driver=driver;
	}
	
	public static void  getScreenshot () throws Exception
	{
		Thread.sleep(3000);
		File src=((TakesScreenshot)DriverUtils.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,  new File("D://screenshot4.png"));
	}

}
