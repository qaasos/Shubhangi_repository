package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.TrivagoFilterHotels;
import PageObjects.TrivagoHomePage;
import PageObjects.TrivagoHotelDetailsView;
import PageObjects.TrivagoListHotelNames;
import Utils.DriverUtils;
import Utils.GetExcelData;
import Utils.JavaScriptExecutor;
import Utils.TakeScreenshots;

public class TrivagoHotelBookings {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		Properties Po= new Properties();
		
		DriverUtils DU = new  DriverUtils();
		Po.load(new FileInputStream(new File(System.getProperty("user.dir") +"\\config\\config.properties")));
		
		driver = DU.getDriver(Po.getProperty("browser"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		/*String String1=Po.getProperty("city");
		String String2=Po.getProperty("areaname");
		String adultnum=Po.getProperty("Adult");
		String childnum=Po.getProperty("child");
		String childAge=Po.getProperty("ChildAge");*/
		
		String fromday=Po.getProperty("fromday");
		String frommonth=Po.getProperty("frommonth");
		String today=Po.getProperty("today");
		String tomonth=Po.getProperty("tomonth");
		System.out.println(fromday+frommonth+today+tomonth);
		
		
		String String1=GetExcelData.GetDataString(0, 0);
		String String2=GetExcelData.GetDataString(1, 0);
		double adultnumD=GetExcelData.GetDataInt(3,0);
		double childnumD=GetExcelData.GetDataInt(4,0);
		double childAgeD=GetExcelData.GetDataInt(5,0);
		TrivagoHomePage HP = new TrivagoHomePage(driver);
		int adultnum=(int)adultnumD;
		int childnum=(int)childnumD;
		int childAge=(int)childAgeD;
		
		HP.goToHomePageURL(Po.getProperty("trivagourl"));
		JavaScriptExecutor.Autosuggest(String1, String2);
		HP.SelectLocationsDatesAndRoomeType(adultnum,childnum,childAge,fromday, frommonth,today,tomonth);
		//String path = Po.getProperty("path");
		//TakeScreenshots.getScreenshot(path);
		
		TrivagoFilterHotels FH=new TrivagoFilterHotels(driver);
		FH.filterHotelrooms();
		
		TrivagoListHotelNames LH=new TrivagoListHotelNames(driver);
		String priceofFirstHotel=LH.ListHotelNamesAndPrices();
		
		//TrivagoHotelDetailsView DH=new TrivagoHotelDetailsView(driver);
		//DH.CheckPrice(priceofFirstHotel);
		
		
		

	}

}
