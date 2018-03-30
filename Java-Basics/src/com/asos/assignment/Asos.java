package com.asos.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Asos {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://shop.demoqa.com");
		driver.manage().window().maximize();
		WebElement woman=driver.findElement(By.xpath("//*[@id='menu-item-2213']/a")); 
		Actions a1=new Actions(driver);
		a1.moveToElement(woman).build().perform();
		driver.findElement(By.linkText("Jackets")).click();;
		Select s1=new Select(driver.findElement(By.name("filter_color")));
		s1.selectByVisibleText("Black");
		
		
		Select s2=new Select(driver.findElement(By.className("orderby")));
		s2.selectByValue("date");
		WebElement pricebar=driver.findElement(By.xpath("//span[@style='left: 100%;']"));
		Actions a2=new Actions(driver);
		a2.clickAndHold(pricebar).moveByOffset(-138, 0).release(pricebar).build().perform();
		driver.findElement(By.xpath("//*[@id='woocommerce_price_filter-1']/form/div/div[2]/button")).click();
		//String Price =driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/span/ins/span")).getText();
		//System.out.println(Price);
		driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div[1]/div/h3/a")).click();
		driver.findElement(By.xpath("//*[@id='product-2034']/div[1]/div[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div/div/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/a")).click();
		driver.findElement(By.name("billing_first_name")).sendKeys("Shubhangi");
		driver.findElement(By.name("billing_last_name")).sendKeys("Bidwai");
		driver.findElement(By.id("billing_email")).sendKeys("Shubhu.bh2001@gmail.com");
		driver.findElement(By.id("billing_phone")).sendKeys("1234532347");
		//WebElement country=driver.findElement(By.xpath("//*[@id='s2id_autogen1_search']"));
		//Select ctrylist=new Select(country);
		
		//ctrylist.selectByVisibleText("Russia");
		
		driver.findElement(By.xpath("//*[@id='select2-chosen-1']")).click();
		driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li[103]/div")).click();
		driver.findElement(By.xpath("//*[@id='billing_address_1']")).sendKeys("F 104 Rosewoods");
		driver.findElement(By.id("billing_city")).sendKeys("Pune");
		//driver.findElement(By.id("billing_state")).sendKeys("Maharashtra");
		
		//WebElement textBoxElement = driver.findElement(By.xpath("//*[@id='select2-chosen-2']"));
		//textBoxElement.sendKeys("m");
		//driver.findElement(By.id("s2id_autogen2_search")).click();
		//driver.findElement(By.id("s2id_autogen2_search")).sendKeys("Maharashtra");
		
		driver.findElement(By.xpath("//*[@id='select2-chosen-2']")).click();
		driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li[3]/div")).click();
		
		
		
		driver.findElement(By.id("billing_postcode")).sendKeys("411037");
		boolean x=driver.findElement(By.xpath("//input[@name='ship_to_different_address']")).isSelected();
		
		if (x==true)
		{
			driver.findElement(By.xpath("//input[@name='ship_to_different_address']")).click();
		}
	     Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='payment_method_cod']")).click();
		
		boolean y=driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
		if (y==false)
		{
			driver.findElement(By.xpath("//input[@id='terms']")).click();	
		}
		
		driver.findElement(By.id("place_order")).click();
		
		
		
		
	
		
		
		

	}

}
