package com.wipro.JavaSeleniumWipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		//Enter text in username
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		//Enter test in password
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		
		Thread.sleep(2000);
		
		//Click on login button
		WebElement login_button = driver.findElement(By.xpath("//button[@type='submit']"));
		login_button.click();
		
	}

}

/*
	locators in selenium
	id - unique attribute
	name - name attribute - name of the element
	classname - common class name applied for multiple elements  grouped together
	linktext - text present on the link
	partial link text - partial link text text on the web element
	tagname - the first word in the web element after the opening tag - this is applied for mutlipel web elements in the page
	css selector - #name
	div.oxd-form-row:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)
 */