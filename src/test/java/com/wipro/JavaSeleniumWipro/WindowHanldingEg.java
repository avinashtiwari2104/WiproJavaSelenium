package com.wipro.JavaSeleniumWipro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHanldingEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(2000);
		WebElement clickhere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		clickhere.click();
		
		Thread.sleep(2000);
		Object[] windowhandles = driver.getWindowHandles().toArray();
		System.out.println(windowhandles);
		driver.switchTo().window((String) windowhandles[1]);
		
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window((String) windowhandles[0]);
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
