package com.seleniumprograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Handler {
	public static String find_company="UCO Bank";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> table_size=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		ArrayList<String> col_name = new ArrayList<String>(100);
		
		for(int i=0;i<table_size.size();i++)
		{
			//System.out.println(table_size.get(i).getText());
			col_name.add(table_size.get(i).getText());
			
		}
		System.out.println(col_name.size());
		try
		{
		for(int i=0;i<col_name.size();i++)
		{
			System.out.println(col_name.get(i));
			
			if(col_name.contains(find_company))
			{
				//System.out.println("True");
				String xpath="//a[contains(text(),'"+find_company+"')]";
				System.out.println(xpath);
				driver.findElement(By.xpath(xpath)).click();
				
			}
		}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found:"+e.getMessage());
		}
		//driver.close();
		}
	
		
	}


