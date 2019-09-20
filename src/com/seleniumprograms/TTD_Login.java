package com.seleniumprograms;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class TTD_Login {

	public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\geckodriver.exe");
		//WebDriver fdriver=new FirefoxDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\IEDriverServer.exe");
		//WebDriver iedriver=new InternetExplorerDriver();
		
		File test_data=new File("C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Test_Data.xlsx");
		
		XSSFWorkbook xsb=new XSSFWorkbook(test_data);
		XSSFSheet xsw=xsb.getSheet("Sheet1");
		int row_count=xsw.getLastRowNum();
		System.out.println(row_count);
		int col_count=xsw.getRow(0).getLastCellNum();
		System.out.println(col_count);
		

		String URL=xsw.getRow(0).getCell(0).getStringCellValue();
		driver.get(URL);
		driver.manage().window().maximize();
		
		for(int i=0;i<=row_count;i++)
		{
			for(int j=0;j<col_count;j++)
			{
				System.out.println(xsw.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		for(int i=0;i<=row_count;i++)
		{
			Thread.sleep(5000);
			String Username=xsw.getRow(i).getCell(1).getStringCellValue();
			String Password=xsw.getRow(i).getCell(2).getStringCellValue();
			driver.findElement(By.name("uName")).sendKeys(Username);
			driver.findElement(By.name("pwd")).sendKeys(Password);
			driver.findElement(By.id("login_sub")).click();
			Thread.sleep(20000); // wait for 5000 millisec
			
			driver.findElement(By.xpath("(//a[contains(text(),'Seva Electronic DIP')])[2]")).click();
			//driver.findElement(By.xpath("//input[@class='ng-pristine ng-untouched ng-valid']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("accept")).click();
			driver.findElement(By.id("sevadipInstruction_continue")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.className("modal-content"));
			driver.findElement(By.xpath("(//a[@class='mstr_lnk'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@name='userList'])[2]")).click();
			driver.findElement(By.className("close")).click();
			driver.findElement(By.xpath("//button[@id='sevadipReg_continue']")).click();
			Thread.sleep(5000);
			List<WebElement> cal=driver.findElements(By.cssSelector(".table_sevadip_calicon.ng-binding"));
			//driver
			
			System.out.println(cal.size());
			Actions acc=new Actions(driver);
			acc.moveToElement(cal.get(0)).click(cal.get(0)).build().perform();						
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", cal.get(0));
			Thread.sleep(5000);
			System.out.println("done");
			//driver.findElement(By.linkText("Logout")).click();
		}
		
}

}
