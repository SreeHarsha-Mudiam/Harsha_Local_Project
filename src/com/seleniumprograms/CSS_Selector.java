package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Form");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("Harsha");
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mudiam");
		//driver.close();
		

	}

}
