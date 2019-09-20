package com.seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.Reusable.Reusable;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File Source=ts.getScreenshotAs(OutputType.FILE);
//		String Dest="C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Screenshots\\img.jpeg";
//		FileHandler.copy(Source, new File(Dest));
//		//copy(Source, new File(Dest));
//		
		Reusable reuse=new Reusable();
		reuse.screenshot("https://www.google.com");
		

	}

}
