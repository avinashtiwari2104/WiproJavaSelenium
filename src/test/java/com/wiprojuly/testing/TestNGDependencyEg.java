package com.wiprojuly.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDependencyEg {
	
	//Annotation : We can control the flow
	
	@Test
	public void launchbrowser() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
 
		WebDriverManager.chromedriver().setup();
 
		WebDriver driver = new ChromeDriver(chromeOptions);
 
		driver.get("https://the-internet.herokuapp.com/windows");
		// maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test(dependsOnMethods = {"launchbrowser"})
	public static void saucereg() throws InterruptedException {
			
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
			
		Thread.sleep(2000);
		
		//Enter text in username
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		
		Thread.sleep(2000);
			
		//Enter test in password
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
			
		//Click on login button
		WebElement login_button = driver.findElement(By.xpath("//input[@type='submit']"));
		login_button.click();
			
		Thread.sleep(2000);
		driver.quit();

	}
}
