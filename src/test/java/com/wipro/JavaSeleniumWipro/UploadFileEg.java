package com.wipro.JavaSeleniumWipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement upfile = driver.findElement(By.xpath("//input[@id='file-upload']"));
		upfile.sendKeys("C:\\Users\\avina\\Downloads\\MCQtext.txt");
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//input[@id='file-submit']"));
		submit.click();
		
		Thread.sleep(2000);
		WebElement validate = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
		
		if (validate.isDisplayed()) {
			System.out.println("Message is displayed Properly");
		}else {
			System.out.println("Message is not displayed Properly");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
