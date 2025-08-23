package com.wipro.JavaSeleniumWipro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://the-internet.herokuapp.com/tables");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Find rows
		Thread.sleep(2000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'table1']/thead/tr[1]/th"));
		int nrows = rows.size();
		System.out.println(nrows);
		
		//Find cols
		Thread.sleep(2000);
		List <WebElement> cols = driver.findElements(By.xpath("//table[@id = 'table1']/thead/tr[1]/th"));
		int ncols = cols.size();
		System.out.println(ncols);
		
		//text of a cell
		Thread.sleep(2000);
		WebElement celltext = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[3]"));
		String actualcelltext = celltext.getText();
		System.out.println(actualcelltext);
		String expectcelltext = "tconway@earthlink.net";
		
		if (actualcelltext.equalsIgnoreCase(expectcelltext)) {
			System.out.println("The text matches");
		}else {
			System.out.println("The text didn't matches");

		}

		Thread.sleep(2000);
		driver.quit();

	}

}
