package com.seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class {
	public static void main(String args[]) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//input[@id='input_resumeParser']")).click();
		StringSelection ss=new StringSelection("C:\\Users\\SAMSUNG\\Desktop\\Rich Dad Poor Dad.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyRelease(KeyEvent.VK_V);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
	}
}