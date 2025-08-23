package com.wipro.JavaSeleniumWipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		WebElement drdwn = driver.findElement(By.xpath("//select[@id = 'dropdown-class-example']"));
		Select sel = new Select(drdwn);
		
		//Select by visible text
		Thread.sleep(2000);
		sel.selectByVisibleText("Option1");
		
		//Select by value
		Thread.sleep(2000);
		sel.selectByValue("option2");
		
		//Select by index
		Thread.sleep(2000);
		sel.selectByIndex(3);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
