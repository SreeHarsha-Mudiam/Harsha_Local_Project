package com.seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		Alert alert=driver.switchTo().alert();
		
		String alert_text=alert.getText();
		System.out.println(alert_text);
		String message="Please select start place.";
		if(message==alert_text)
		{
		System.out.println("True");
		alert.accept();
		
		}
	}

} 