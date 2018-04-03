package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	By women = By.xpath("//*[@id='menu-item-2213']/a");
	By jacket = By.linkText("Jackets");
	Actions action = null;
	
	public HomePage(WebDriver driver) throws Exception 
	 	{ 
		  this.driver = driver; 
		  this.wait = new WebDriverWait(this.driver, 180); 
				  
		} 
	
	
	public void goToHomePageURL(String url)
	{
	  driver.get(url);
	  driver.manage().window().maximize();
	}

	
	public void HoverOnWomenAndClickOnJacket(){
	
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(women)).build().perform();
		driver.findElement(jacket).click();
		
	}

}