package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.TrivagoFilterHotels;
import PageObjects.TrivagoHomePage;
import PageObjects.TrivagoHotelDetailsView;
import PageObjects.TrivagoListHotelNames;
import Utils.DriverUtils;
import Utils.TakeScreenshots;

public class TrivagoHotelBookings {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		Properties Po= new Properties();
		
		DriverUtils DU = new  DriverUtils();
		Po.load(new FileInputStream(new File(System.getProperty("user.dir") +"\\config\\config.properties")));
		
		driver = DU.getDriver(Po.getProperty("browser"));
		
		String city=Po.getProperty("city");
		String areaname=Po.getProperty("areaname");
		TrivagoHomePage HP = new TrivagoHomePage(driver);
		
		HP.goToHomePageURL(Po.getProperty("trivagourl"));
		HP.SelectLocationsDatesAndRoomeType(city, areaname);
		
		TakeScreenshots.getScreenshot();
		
		TrivagoFilterHotels FH=new TrivagoFilterHotels(driver);
		FH.filterHotelrooms();
		
		TrivagoListHotelNames LH=new TrivagoListHotelNames(driver);
		String priceofFirstHotel=LH.ListHotelNamesAndPrices();
		
		TrivagoHotelDetailsView DH=new TrivagoHotelDetailsView(driver);
		DH.CheckPrice(priceofFirstHotel);
		
		
		

	}

}
