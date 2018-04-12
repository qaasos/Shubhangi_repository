package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrivagoFilterHotels {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	By score=By.xpath("//span[@class='fl-score']");
	
	public TrivagoFilterHotels(WebDriver driver) throws Exception 
 	{ 
	  this.driver = driver; 
	  this.wait = new WebDriverWait(this.driver, 180); 
			  
	} 
	
	
	public void filterHotelrooms() throws Exception
	{
        driver.findElements(score).get(4).click();
		
		Select sortBy= new Select(driver.findElement(By.id("mf-select-sortby")));
		sortBy.selectByVisibleText("Distance only");
		Thread.sleep(2000);
		
		
	}
	
	

}
