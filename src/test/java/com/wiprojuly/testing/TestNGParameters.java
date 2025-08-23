package com.wiprojuly.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameters {
	
	@Parameters({"browser","platform"})
	@Test
	public void testparameters(String browser, String platform) throws InterruptedException {
		
		if(browser.equals("chrome") && platform.equals("windows")) {
			
			ChromeOptions chromeOption = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOption);
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			driver.quit();
			
		}
		else {
			
			EdgeOptions edgeOption = new EdgeOptions();
			//WebDriverManager.edgedriver().setup();
			//Manual EdgeDriver Setup
			System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver(edgeOption);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(2000);
			driver.quit();
			
		}
		
	}

}
