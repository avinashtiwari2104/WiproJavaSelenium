package com.wipro.JavaSeleniumWipro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeFirefoxBrowser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxOptions firefoxOption = new FirefoxOptions();
		//WebDriverManager.edgedriver().setup();
		//Manual EdgeDriver Setup
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver(firefoxOption);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
