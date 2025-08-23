package com.wipro.JavaSeleniumWipro;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(2000);
		String ps = driver.getPageSource();
		System.out.println(ps);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
