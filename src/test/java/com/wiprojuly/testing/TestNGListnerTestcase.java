package com.wiprojuly.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGListnersEg.class)
public class TestNGListnerTestcase {
	
	@Test
	public void Login() throws InterruptedException {
		
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
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
