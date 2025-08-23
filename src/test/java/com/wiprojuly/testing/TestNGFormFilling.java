package com.wiprojuly.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(TestNGListnersEg.class)
public class TestNGFormFilling {
	@Test(groups= {"Sanity","Regression"})

	public void practise() throws InterruptedException {
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Avinash");
		
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Tiwari");
		
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//input[@id='sex-0']"));
		gender.click();
		
		Thread.sleep(2000);
		WebElement experience = driver.findElement(By.xpath("//input[@id='exp-0']"));
		experience.click();
		
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("21-04-2003");
		
		Thread.sleep(2000);
		WebElement profession = driver.findElement(By.xpath("(//input[@id='profession-1'])[1]"));
		profession.click();
		
		Thread.sleep(2000);
		WebElement tools = driver.findElement(By.xpath("(//input[@id='tool-2'])[1]"));
		tools.click();
		
		Thread.sleep(2000);
		WebElement continents = driver.findElement(By.xpath("//select[@id='continents']"));
		continents.click();
		
		Thread.sleep(2000);
		WebElement commands = driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']"));
		commands.click();
		
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.xpath("//input[@id='photo' and @name='photo']"));
		upload.sendKeys("C:\\Users\\avina\\Downloads\\image.png");
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}