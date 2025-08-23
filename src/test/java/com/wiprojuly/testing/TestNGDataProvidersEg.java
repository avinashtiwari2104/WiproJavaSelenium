package com.wiprojuly.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(TestNGListnersEg.class)
public class TestNGDataProvidersEg {
	
	@DataProvider(name="logindata", parallel = true)
	public Object[][] getData(){
		
		return new Object[][]{
		
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"}
		};
	}
	
	@Test(dataProvider = "logindata")
	public void logintest(String username, String password) throws InterruptedException {
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Enter text in username
		WebElement user = driver.findElement(By.name("user-name"));
		user.sendKeys(username);
		
		Thread.sleep(2000);
		
		//Enter test in password
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		
		Thread.sleep(2000);
		
		//Click on login button
		WebElement login_button = driver.findElement(By.xpath("//input[@type='submit']"));
		login_button.click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
