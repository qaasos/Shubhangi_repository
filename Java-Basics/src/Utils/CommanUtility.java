package Utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommanUtility extends DriverUtils {
	
	public void webDriver(WebDriver driver)
	{
		super.driver=driver;
	}
	
	public static void Calendar(String day,String month)
	{
		int calnum=driver.findElements(By.id("cal-heading-month-first")).size();
		if(calnum==0)
		{
			String monthyear=driver.findElement(By.xpath("//th[@id='cal-heading-month']")).getText();
			
			By caldays=By.xpath("//time[contains(@class,'cal-day cal-is-selectable') or contains(@class,'cal-day cal-is-weekend cal-is-selectable') or contains(@class, 'cal-day cal-is-today cal-is-selectable')]");
			while(!driver.findElement(By.xpath("//th[@id='cal-heading-month']")).getText().contains(month))
			{
				driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
			}
			List<WebElement> dates=driver.findElements(caldays);
		
//		int count =driver.findElements(caldays).size();
			
			for(WebElement date: dates)
			{
			
				String text1=date.getText();
				
					if(text1.equalsIgnoreCase(day))
					{
						date.click();
						break;
					}
					
			}
			
		}
		
		else
		{	
			//System.out.println(calnum);
			Boolean month1=driver.findElement(By.xpath("//th[@id='cal-heading-month-first']")).getText().contains(month);
			Boolean month2=driver.findElement(By.xpath("//th[@id='cal-heading-month-second']")).getText().contains(month);
			By month1path=By.xpath("//th[@id='cal-heading-month-first']");
			By month2path=By.xpath("//th[@id='cal-heading-month-second']");
			
								
			while(!((driver.findElement(month1path).getText().contains(month)) || (driver.findElement(month2path).getText().contains(month))))
			{
				driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
			}
			
			
			if(month1==true)
			{
				//System.out.println("month1"+month1);
			By caldays1=By.xpath("//td[contains(@headers, 'cal-heading-month-first')]");
			List<WebElement> dates1=driver.findElements(caldays1);
			

	        
			for(WebElement date: dates1)
			{
				
				String text1=date.getText();
				
				if(text1.equalsIgnoreCase(day))
				{
					date.click();
					break;
				}
				
			}
			}
			else
			{
				By caldays2=By.xpath("//td[contains(@headers, 'cal-heading-month-second')]");
				List<WebElement> dates2=driver.findElements(caldays2);				

		       
				for(WebElement date: dates2)
				{
					
					String text1=date.getText();
				
					if(text1.equalsIgnoreCase(day))
					{
						date.click();
						break;
					}
					
				}
			}
			
			
			
		}
	}

}
