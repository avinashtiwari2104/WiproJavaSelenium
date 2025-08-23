package com.wipro.JavaSeleniumWipro;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Simple Alert
		WebElement simplealert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		simplealert.click();
		
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		alt.accept();

		Thread.sleep(4000);
		
		//Confirmational Alert
		WebElement confalert = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		confalert.click();
				
		Thread.sleep(2000);
		Alert alt1 = driver.switchTo().alert();
				
		Thread.sleep(2000);
		alt1.dismiss();
				
		Thread.sleep(2000);	
		
		
		//Prompt Alert
		WebElement promptalert = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
		promptalert.click();
				
		Thread.sleep(2000);
		Alert alt2 = driver.switchTo().alert();
		
		String alerttext = alt2.getText();
		System.out.println(alerttext);
				
		Thread.sleep(2000);
		alt2.sendKeys("Avinash");
		
		Thread.sleep(2000);
		alt2.accept();
				
		Thread.sleep(2000);
		driver.quit();
	}

}
