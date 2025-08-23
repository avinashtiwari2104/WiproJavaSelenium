package com.wipro.JavaSeleniumWipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDeselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://grotechminds.com/multiple-select/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		WebElement drdwn = driver.findElement(By.xpath("//select[@id = 'automobiles']"));
		Select sel = new Select(drdwn);
		
		//Select by visible text
		Thread.sleep(2000);
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		sel.selectByIndex(3);
		
		/*Thread.sleep(2000);
		sel.deselectByIndex(2);
		
		Thread.sleep(2000);
		sel.deselectByVisibleText("SUV");*/
		
		Thread.sleep(2000);
		sel.deselectAll();
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
