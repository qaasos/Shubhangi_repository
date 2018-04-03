package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.*;
import Tests.*;
import Utils.*;



public class WomenJacket {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver = null;
		Properties Po= new Properties();
		
		DriverUtils DU = new  DriverUtils();
		Po.load(new FileInputStream(new File(System.getProperty("user.dir") +"\\config\\config.properties")));
		
		driver = DU.getDriver(Po.getProperty("browser"));
	
		//Home Page
		HomePage HP = new HomePage(driver);
		
	
		HP.goToHomePageURL(Po.getProperty("url"));
		HP.HoverOnWomenAndClickOnJacket();
		
		//Filters on Product
		FiltersOnProduct FP=new FiltersOnProduct(driver);
		
		FP.FilterByColor();
		FP.FilterByNewness();
		FP.PriceFilter();
		
		//Add To Cart
		
		SelectProductAndAddToCart AC=new SelectProductAndAddToCart(driver);
		
		AC.AddToCart();
		
		//CheckOutandPlaceOrder
		
		CheckoutAndPlaceOrder PL=new CheckoutAndPlaceOrder(driver);
		
		PL.checkOut();
		PL.FillDetails();
		PL.PlaceOrder();
	
		
		
	}
}
