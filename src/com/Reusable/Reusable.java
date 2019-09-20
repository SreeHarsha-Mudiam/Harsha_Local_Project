package com.Reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Reusable 
{
	
	public static void screenshot(String URL) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		String img_name=driver.getWindowHandle();
		String Dest="C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Screenshots\\"+img_name+".jpeg";
		FileHandler.copy(Source, new File (Dest));
		
	}
	
	public static String getCellData(String file,String Sheet_name,int rownum,int cellnum) throws IOException
	{
		File file_loc=new File(file);
		FileInputStream fis=new FileInputStream(file_loc);
		XSSFWorkbook xsb=new XSSFWorkbook(fis);
		XSSFSheet xss=xsb.getSheet(Sheet_name);
		String cell_data=xss.getRow(rownum).getCell(cellnum).getStringCellValue();
		System.out.println(cell_data);
		return cell_data;
		
	}
	
	public static void WritedataintoCell(String file,String Sheet_name,int rownum,int cellnum,String cellvalue) throws InvalidFormatException, IOException
	{
		File file_loc=new File(file);
		FileInputStream fis=new FileInputStream(file_loc);
		
		XSSFWorkbook xsb=new XSSFWorkbook(fis);
		XSSFSheet xss=xsb.getSheet(Sheet_name);
		//String celldata=xss.getRow(rownum).getCell(cellnum).getStringCellValue();
		//System.out.println(celldata);
		Cell c1=xss.getRow(rownum).getCell(cellnum);
		
		//c1.getRow(rownum)
		if(c1==null)
		{
			c1=xss.getRow(rownum).createCell(cellnum);
		}
		c1.setCellValue(cellvalue);
		fis.close();
		FileOutputStream fos=new FileOutputStream(file_loc);
		xsb.write(fos);
		fos.close();
		xsb.close();
		
		
		
	}
	
		
		
}