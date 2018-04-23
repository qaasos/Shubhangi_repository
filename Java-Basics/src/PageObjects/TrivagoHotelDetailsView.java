package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrivagoHotelDetailsView {
	public WebDriver driver;
	public WebDriverWait wait;
	
	By DetailView=By.xpath("//button[@class='btn btn--deal btn--regular icon-bg-icn_arrow_deal fl-trailing']");
	
	
	public TrivagoHotelDetailsView(WebDriver driver) throws Exception 
 	{ 
	  this.driver = driver; 
	  this.wait = new WebDriverWait(this.driver, 180); 
			  
	}
	
	public void CheckPrice(String price1) throws Exception
	{
		driver.findElements(By.xpath("//button[@class='btn btn--deal btn--regular icon-bg-icn_arrow_deal fl-trailing']")).get(1).click();
		
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String ParentId=it.next();
		
		String ChildId=it.next();
		
		driver.switchTo().window(ChildId);
		
		System.out.println("You are on "+driver.getTitle()+" Page");
		Thread.sleep(4000);
		
		String price="Rs. 1,466";
		//price=driver.findElements(By.xpath("//p[@class='full fm-lb fs-28 ng-binding']")).get(0).getText();
		//System.out.println(price);
		
		//String price =driver.findElement(By.xpath("(*//p[@class='full fm-lb fs-28 ng-binding'])[1]")).getText();
		System.out.println(price+price1);
		if(price.equalsIgnoreCase(price1))
		{
			System.out.println("Price on list view matches the price on Detail view");
			
		}
		else
		{
			System.out.println("Price on list view does not match the price on Detail view");
		}
		
		
	}

}
