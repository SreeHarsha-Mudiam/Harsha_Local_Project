package com.seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class First_Selenium_Program {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.getCurrentUrl();
//		driver.getTitle();
//		driver.navigate().to("https://www.tcs.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.close();
//		
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\geckodriver.exe");
//		WebDriver fdriver=new FirefoxDriver();
//		fdriver.get("https://www.google.com");
//		fdriver.getCurrentUrl();
//		fdriver.getTitle();
//		fdriver.navigate().to("https://www.tcs.com");
//		fdriver.navigate().back();
//		fdriver.navigate().forward();
//		fdriver.navigate().refresh();
//		fdriver.close();
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\IEDriverServer.exe");
		WebDriver iedriver=new InternetExplorerDriver();
		iedriver.get("https://www.google.com");
		iedriver.getCurrentUrl();
		iedriver.getTitle();
		iedriver.navigate().to("http://www.testingmasters.com/hrm/");
//		iedriver.navigate().back();
//		iedriver.navigate().forward();
//		iedriver.navigate().refresh();
//		iedriver.close();
	}

}
