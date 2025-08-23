package com.wipro.JavaSeleniumWipro;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFileEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://the-internet.herokuapp.com/download");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
        WebElement dwnlfile = driver.findElement(By.xpath("//a[@href='download/test-file.txt']"));
        dwnlfile.click();
        
        File f = new File("\"C:\\Users\\avina\\Downloads\\test-file.txt(1)\"");
        
        if (f.exists()) {
        	System.out.println("File is present");
        }else {
        	System.out.println("File is not present");
        }
        
        driver.quit();
        
	}

}
