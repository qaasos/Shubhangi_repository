package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutAndPlaceOrder {
	
	public WebDriver driver=null;
	public WebDriverWait wait;
	
	
	By CheckOut=By.xpath("//*[@id='noo-site']/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/a");
	
	
	By FirstName=By.name("billing_first_name");
	By LastName=By.name("billing_last_name");
	By Email=By.id("billing_email");
	By Phone=By.id("billing_phone");
	
	By CountryDropdown=By.xpath("//*[@id='select2-chosen-1']");
	By CountryValue=By.xpath("//div[@id='select2-drop']/ul/li[103]/div");
	By Address=By.xpath("//*[@id='billing_address_1']");
	By City=By.id("billing_city");
	
	By StateDropdown=By.xpath("//*[@id='select2-chosen-2']");
	By StateValue=By.xpath("//div[@id='select2-drop']/ul/li[3]/div");
	By PostalCode=By.id("billing_postcode");
	
	By ShipToDiffAddr=By.xpath("//input[@name='ship_to_different_address']");
	By PaymentMethod=By.xpath("//input[@id='payment_method_cod']");
	By TermsAndCond=By.xpath("//input[@id='terms']");
	By PlaceOrder=By.id("place_order");
			
		
	public CheckoutAndPlaceOrder(WebDriver driver) throws Exception 
 	{ 
	  this.driver = driver; 
	  this.wait = new WebDriverWait(this.driver, 180); 
			  
	} 
	
	public void checkOut()
	{
		driver.findElement(CheckOut).click();
	}
	
	public void FillDetails() throws InterruptedException
	{
	driver.findElement(FirstName).sendKeys("Shubhangi");
	driver.findElement(LastName).sendKeys("Bidwai");
	driver.findElement(Email).sendKeys("shubhu1984@gmail.com");
	driver.findElement(Phone).sendKeys("1234567890");
	driver.findElement(CountryDropdown).click();
	driver.findElement(CountryValue).click();
	driver.findElement(Address).sendKeys("F104 Rosewoods");
	driver.findElement(City).sendKeys("pune");
	driver.findElement(StateDropdown).click();
	driver.findElement(StateValue).click();
	driver.findElement(PostalCode).sendKeys("411037");
	
	boolean x=driver.findElement(ShipToDiffAddr).isSelected();
	
	if (x==true)
	{
		driver.findElement(ShipToDiffAddr).click();
	}
     Thread.sleep(20000);
	
     driver.findElement(PaymentMethod).click();
     
     boolean y=driver.findElement(TermsAndCond).isSelected();
		if (y==false)
		{
			driver.findElement(TermsAndCond).click();
		
		}
	
	}
	
	public void PlaceOrder()
	{
		driver.findElement(PlaceOrder).click();
	}

}
