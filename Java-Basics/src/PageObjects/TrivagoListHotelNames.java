package PageObjects;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrivagoListHotelNames {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public TrivagoListHotelNames(WebDriver driver) throws Exception 
 	{ 
	  this.driver = driver; 
	  this.wait = new WebDriverWait(this.driver, 180); 
			  
	}

	public String ListHotelNamesAndPrices()
	{
		List<WebElement> Hotelnames=driver.findElements(By.tagName("h3"));
		List<WebElement> FilterHotelNames=new ArrayList<WebElement>();
		
		for(WebElement e: Hotelnames)
		{
			if(!e.getText().equalsIgnoreCase(""))
			{
				FilterHotelNames.add(e);
			}
		}
		
		
		
		List<WebElement> HotelPrices=driver.findElements(By.cssSelector(".item__best-price"));
		List<WebElement> FilterHotelPrices=new ArrayList<WebElement>();
		
		for(WebElement e: HotelPrices)
		{
			if(!e.getText().equalsIgnoreCase(""))
			{
				FilterHotelPrices.add(e);
			}
		}
		
		
		
		int count=0;
		String price1=null;
				for(WebElement ShowHotelnames:FilterHotelNames)
					
				{
					if(count==1)
					{
					price1=FilterHotelPrices.get(count).getText().replace("₹", "Rs. ");	
					}
					
					System.out.println(ShowHotelnames.getText()+" "+FilterHotelPrices.get(count).getText().replace("₹", "Rs. "));
					count++;
				}
				
				System.out.println("You are on "+driver.getTitle()+" Page");
				
				
				
				
				return price1;
		
	}

}
