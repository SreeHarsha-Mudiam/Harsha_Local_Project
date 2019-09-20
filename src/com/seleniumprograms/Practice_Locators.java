package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Locators {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstname")).sendKeys("Harsha");
		driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Mudiam");
	driver.findElement(By.xpath("(//label[@class=\"radio-inline\"])[2]")).click();
	driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
	WebElement dropdown=driver.findElement(By.id("sel1"));
	Select sel=new Select(dropdown);
	sel.selectByVisibleText("India");
	driver.findElement(By.id("datepicker")).click();
	WebElement DOB_Year=driver.findElement(By.className("ui-datepicker-year"));
	Select Year_select=new Select(DOB_Year);
	Year_select.selectByVisibleText("1995");
	WebElement DOB_Month=driver.findElement(By.className("ui-datepicker-month"));
	Select Month_Select=new Select(DOB_Month);
	Month_Select.selectByVisibleText("Mar");
	//driver.findElement(By.xpath("(//a[contains(@class,'ui-state-default')])[26])")).click();
	
	driver.findElement(By.xpath("(//a[contains(@class,'ui-state-default')])[26]")).click();
	
	
	
	
	//DOB_Day.click();
	
	//driver.findElement(By.className("ui-state-default ui-state-active").linkText("26")).click();
	
	driver.findElement(By.id("phonenumber")).sendKeys("9791052695");
	driver.findElement(By.id("username")).sendKeys("Harsha");
	driver.findElement(By.id("email")).sendKeys("sreeharsha.mudiam@gmail.com");
	driver.findElement(By.id("comment")).sendKeys("Testing an application");
	driver.findElement(By.id("pwd")).sendKeys("Application1!");
	Thread.sleep(2000);
	//driver.findElement(By.linkText("Submit")).click();
	driver.findElement(By.xpath("//button[contains(@class,'btn btn-default')]")).click();
	
	
	
	
	
	}

}
