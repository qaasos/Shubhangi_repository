package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FiltersOnProduct {
	
	public WebDriver driver=null;
	public WebDriverWait wait;
	By ColorFilter= By.name("filter_color");
	By FilterByNewness=By.className("orderby");
	By PriceFilter=By.xpath("//span[@style='left: 100%;']");
	
	By PriceFilterButton= By.xpath("//*[@id='woocommerce_price_filter-1']/form/div/div[2]/button");
	
	public FiltersOnProduct(WebDriver driver) throws Exception 
 	{ 
	  this.driver = driver; 
	  this.wait = new WebDriverWait(this.driver, 180); 
			  
	} 
	
	public void FilterByColor()
	{
	  
		Select s1=new Select(driver.findElement(ColorFilter));
	    s1.selectByVisibleText("Black");
	}
	
	public void FilterByNewness()
	{
		Select s1=new Select(driver.findElement(FilterByNewness));
	    s1.selectByValue("date");	
	}
	public void PriceFilter()
	{
		WebElement pricebar=driver.findElement(PriceFilter);
		Actions a2=new Actions(driver);
		a2.clickAndHold(pricebar).moveByOffset(-138, 0).release(pricebar).build().perform();
		this.driver.findElement(PriceFilterButton).click();
	}


}
