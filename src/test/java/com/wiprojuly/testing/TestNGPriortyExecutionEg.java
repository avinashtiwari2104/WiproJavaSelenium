package com.wiprojuly.testing;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGPriortyExecutionEg {
	
	// Default priority = 0 (if not mentioned).
	// If multiple test methods have the same priority, they run in alphabetical order.
	// Lower priority value = Higher execution order priority = 0 runs before priority = 1.
	
	@Test(priority=2)
	public void testalerts() throws InterruptedException {
		
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

		Thread.sleep(2000);
		
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
			
	@Test(priority=1)
	public void testcheckbox() throws InterruptedException {
		

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement checkbox = driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']"));
		checkbox.click();
		
		Thread.sleep(2000);
		driver.quit();
		 
	}
			
	@Test(priority=0)
	public void testdragdrop() throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		
		// Create EdgeDriver instance
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
			 
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
			 
		// Actions class is used to simiulate the mouse related activites
		Actions act = new Actions(driver);
			 
		WebElement from = driver.findElement(By.id("column-a"));
		WebElement to = driver.findElement(By.id("column-b"));
			 
		act.dragAndDrop(from, to).perform();
			 
		Thread.sleep(2000);
		driver.quit();
		 
	}
			
	@Test
	public void  radiobuttons() throws InterruptedException {
				
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement Radio3 = driver.findElement(By.xpath("//input[@value = 'radio3']"));
		Radio3.click();
				
		Thread.sleep(2000);
		driver.quit();
	}
}
