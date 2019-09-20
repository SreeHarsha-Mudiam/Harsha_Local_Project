package com.seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestData_Reader {

	public static void main(String[] args) throws InvalidFormatException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		File test_data=new File("C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Test_Data.xlsx");
		
		XSSFWorkbook xws=new XSSFWorkbook(test_data);
		XSSFSheet xss=xws.getSheet("Sheet1");
		int row_count=xss.getLastRowNum();
		System.out.println(row_count);
		int col_count=xss.getRow(0).getLastCellNum();
		System.out.println(col_count);
		
		String URL=xss.getRow(1).getCell(0).getStringCellValue();
		System.out.println(URL);
		driver.get(URL);
		Thread.sleep(2000);
		String username=xss.getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		driver.findElement(By.name("uName")).sendKeys(username);
		
		String password=xss.getRow(1).getCell(2).getStringCellValue();
		System.out.println(password);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.id("login_sub")).click();
	}

}
