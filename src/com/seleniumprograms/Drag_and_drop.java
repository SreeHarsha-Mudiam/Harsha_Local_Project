package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\Manual Testing\\Selenium\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Droppable")).click();
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable, droppable).build().perform();
		//driver.close();
		
	}

}
