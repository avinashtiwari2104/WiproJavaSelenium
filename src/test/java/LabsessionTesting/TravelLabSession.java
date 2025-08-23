package LabsessionTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TravelLabSession {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://phptravels.net/");
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("(//input[@name='from'])[1]"));
		from.click();
		from.sendKeys("DEL");
		Thread.sleep(2000);
		from.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
        from.sendKeys(Keys.ENTER);
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
