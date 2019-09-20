package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		//driver.manage().window().fullscreen(); // Full Screen 
		driver.manage().window().maximize();
		System.out.println("URL: "+driver.getCurrentUrl()); //Fetches Current URL in address Bar
		System.out.println("Title: "+driver.getTitle()); // Fetches the title
		//System.out.println("Page_Source"+driver.getPageSource()); //Fetches page source DOM
		driver.findElement(By.id("identifierId")).sendKeys("sreeharsha.mudiam");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("password")).sendKeys("mudiamsreechandan");
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("mudiamsreechandan");
		driver.findElement(By.name("password")).sendKeys("mudiamsreechandan");
		
		
		driver.findElement(By.id("passwordNext")).click();
		
		
		
		
		//driver.close();

	}

}
