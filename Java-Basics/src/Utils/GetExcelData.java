package Utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GetExcelData extends DriverUtils {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static FileInputStream fis;
	
	public void webDriver(WebDriver driver)
	{
		super.driver=driver;
	}
	
	
	public static String GetDataString(int rowcount,int colcount) throws Exception {
		// TODO Auto-generated method stub
		
		fis=new FileInputStream("D:\\Test_Data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(rowcount);
		XSSFCell cell=row.getCell(colcount);
		return cell.getStringCellValue();
		
	}
	
	public static double GetDataInt(int rowcount,int colcount) throws Exception {
		// TODO Auto-generated method stub
		
		fis=new FileInputStream("D:\\Test_Data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(rowcount);
		XSSFCell cell=row.getCell(colcount);
		return cell.getNumericCellValue();
		//return cell.get
		
	}


}
