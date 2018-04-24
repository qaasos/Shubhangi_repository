package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommanUtility;

public class TrivagoHomePage extends CommanUtility {
	
	public WebDriver driver;
	public WebDriverWait wait;
	By search=By.id("horus-querytext");
	
	By FromDate=By.xpath("//time[@datetime='2018-04-21']");
	By ToDate=By.xpath("//time[@datetime='2018-04-22']");
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
	
	public void SelectLocationsDatesAndRoomeType(int adultnum,int childnum,int childage1,String fromday,String frommonth,String today1,String tomonth1) throws Exception
	{
		
		WebDriverWait d=new WebDriverWait(driver,10);
		
		//Thread.sleep(2000);
		System.out.println(fromday+frommonth);
		System.out.println(today1+tomonth1);
		CommanUtility.Calendar(fromday, frommonth);
		
		CommanUtility.Calendar(today1, tomonth1);
		/*driver.findElement(FromDate).click();
		//Thread.sleep(2000);
		driver.findElement(ToDate).click();*/
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='js-fullscreen-hero']/div/form/div[1]/div[2]/div/div[3]/button")).click();
		
		String adultnumStr=Integer.toString(adultnum);
		String childnumStr=Integer.toString(childnum);
		String childage1Str=Integer.toString(childage1);
		//d.until(ExpectedConditions.visibilityOfElementLocated(fimilyRoom)).get(2).click();
	d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fimilyRoom)).get(2).click();
		//driver.findElements(fimilyRoom).get(2).click();
	
	Select adultDP=new Select(driver.findElement(adult));
	System.out.println(adultnum);
	adultDP.selectByVisibleText(adultnumStr);
	
	Select childDP=new Select(driver.findElement(child));
	childDP.selectByValue(childnumStr);	
	
	//Thread.sleep(2000);
	
	Select childAgeDP=new Select(driver.findElement(ChildAge));
	childAgeDP.selectByValue(childage1Str);
	
	driver.findElement(Confirm).click();
	
	
	
	
		
	
		
		
		
		
	}

}
