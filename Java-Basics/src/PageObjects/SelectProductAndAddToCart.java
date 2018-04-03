package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProductAndAddToCart {
	
	public WebDriver driver=null;
	public WebDriverWait wait;
	
	/*driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div[1]/div/h3/a")).click();
	driver.findElement(By.xpath("//*[@id='product-2034']/div[1]/div[2]/form/button")).click();
	driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div/div/div[1]/a")).click();*/
	
	By SelectProduct=By.xpath("//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div[2]/div/h3/a");
	By AddToCart=By.xpath("//*[@id='product-2004']/div[1]/div[2]/form/button");
	By ViewCart=By.xpath("//*[@id='noo-site']/div[2]/div/div/div[1]/a");
	
	public SelectProductAndAddToCart(WebDriver driver) throws Exception 
 	{ 
	  this.driver = driver; 
	  this.wait = new WebDriverWait(this.driver, 180); 
			  
	} 
	
	public void AddToCart()
	{
		driver.findElement(SelectProduct).click();
		driver.findElement(AddToCart).click();
		driver.findElement(ViewCart).click();
	}

}
