package com.wipro.JavaSeleniumWipro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdgeBrowser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions edgeOption = new EdgeOptions();
		//WebDriverManager.edgedriver().setup();
		//Manual EdgeDriver Setup
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(edgeOption);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}

