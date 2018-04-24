package Utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutor extends DriverUtils {
	

	
	public void webDriver(WebDriver driver)
	{
		super.driver=driver;
	}
	
	
	public static void Autosuggest(String String1,String String2) throws Exception {
		// TODO Auto-generated method stub
		
        driver.findElement(By.id("horus-querytext")).sendKeys(String1);
		
		//Thread.sleep(2000);
		driver.findElement(By.id("horus-querytext")).sendKeys(Keys.DOWN);
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		
		String script="return document.getElementById(\"horus-querytext\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
		while(!text.equalsIgnoreCase(String2))
		{
			driver.findElement(By.id("horus-querytext")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			
		}
		driver.findElement(By.id("horus-querytext")).sendKeys(Keys.ENTER);
		
	}

}
