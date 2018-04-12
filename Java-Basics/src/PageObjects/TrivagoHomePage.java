package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrivagoHomePage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	By search=By.id("horus-querytext");
	
	By FromDate=By.xpath("//time[@datetime='2018-04-17']");
	By ToDate=By.xpath("//time[@datetime='2018-04-19']");
	By fimilyRoom=By.xpath("//span[@class='df_component df_label']");
	//driver.findElements(By.xpath("//span[@class='df_component df_label']")).get(2).click();
	By adult=By.id("select-num-adults-1");
	By child=By.id("select-num-children-1");
	By ChildAge=By.xpath("//select[contains(@id,'select-ages-children-1-')]");
	By Confirm=By.xpath("//*[@id='dealform_extRooms']/div[2]/button[2]/span");
			
	
			
	
	public TrivagoHomePage(WebDriver driver) throws Exception 
 	{ 
	  this.driver = driver; 
	  this.wait = new WebDriverWait(this.driver, 180); 
			  
	} 
	
	public void goToHomePageURL(String trivagourl)
	{
	  driver.get(trivagourl);
	  driver.manage().window().maximize();
	}
	
	public void SelectLocationsDatesAndRoomeType(String city, String areaname) throws Exception
	{
		driver.findElement(search).sendKeys(city);
		
		Thread.sleep(2000);
		driver.findElement(search).sendKeys(Keys.DOWN);
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		
		String script="return document.getElementById(\"horus-querytext\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
		while(!text.equalsIgnoreCase(areaname))
		{
			driver.findElement(search).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			
		}
		driver.findElement(search).sendKeys(Keys.ENTER);
		
		driver.findElement(FromDate).click();
		driver.findElement(ToDate).click();
		Thread.sleep(3000);
		
	driver.findElements(fimilyRoom).get(2).click();
	
	Select adultDP=new Select(driver.findElement(adult));
	adultDP.selectByVisibleText("2");
	
	Select childDP=new Select(driver.findElement(child));
	childDP.selectByValue("1");	
	
	Thread.sleep(2000);
	
	Select childAgeDP=new Select(driver.findElement(ChildAge));
	childAgeDP.selectByValue("8");
	
	driver.findElement(Confirm).click();
	
	
	
	
		
	
		
		
		
		
	}

}
