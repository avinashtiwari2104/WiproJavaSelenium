package com.wipro.JavaSeleniumWipro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioCheckboxEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement radio3 = driver.findElement(By.xpath("//input[@value='radio3'] "));
		radio3.click();
		
		Thread.sleep(2000);
		
		//For single select checkbox
		/*WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkbox1.click();*/
		
		//For multiple select checkbox
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int size = checkboxes.size();
		System.out.println(size);
		
		for(int i =0; i<size; i++) {
			Thread.sleep(1000);
			checkboxes.get(i).click();
		}
		
	}

}
