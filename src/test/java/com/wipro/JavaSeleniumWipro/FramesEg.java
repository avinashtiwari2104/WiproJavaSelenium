package com.wipro.JavaSeleniumWipro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://jqueryui.com/droppable/");
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Action class is used to simulate the mouse related activities
		Actions act = new Actions(driver);
		
		//Thread.sleep(2000);
		/*WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(Frame);*/	//By giving element
		
		driver.switchTo().frame(0);			//By giving index 
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
