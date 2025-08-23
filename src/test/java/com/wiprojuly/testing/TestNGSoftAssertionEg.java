package com.wiprojuly.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGListnersEg.class)
public class TestNGSoftAssertionEg {
	
	@Test
	public void AssertionEg() throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "OrangeHRM"; //If wrong it will capture and execute further and  give failure in Last
		
		// Soft assertion  - the validation is captured  if the assertion is failing and continues with further execution
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actualtitle, expectedtitle);
		
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
		
		soft.assertAll();  //Mandatory to get if any assert operation fails in code Always write at end of method
		
	}

}
