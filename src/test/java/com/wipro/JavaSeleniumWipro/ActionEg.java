package com.wipro.JavaSeleniumWipro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.amazon.in/");
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Action class is used to simulate the mouse related activities
		Actions act = new Actions(driver);
		
		WebElement sell = driver.findElement(By.xpath("(//a[normalize-space()='Sell'])[1]"));
		act.doubleClick(sell).perform();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement mxplayer = driver.findElement(By.xpath("//a[normalize-space()='MX Player']"));
		act.contextClick(mxplayer).perform();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
