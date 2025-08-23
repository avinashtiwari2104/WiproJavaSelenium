package LabsessionTesting;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartLabSession {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.demoblaze.com/index.html");
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.xpath("//a[normalize-space()='Iphone 6 32gb']"));
		phone.click();
		
		Thread.sleep(2000);
		WebElement iphone = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
		iphone.click();
		
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(2000);
		WebElement home = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
		home.click();
		
		Thread.sleep(2000);
		WebElement laptops = driver.findElement(By.xpath("//a[3]"));
		laptops.click();
		
		Thread.sleep(2000);
		WebElement laptop = driver.findElement(By.xpath("//a[normalize-space()='MacBook air']"));
		laptop.click();
		
		Thread.sleep(2000);
		WebElement macbook = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
		macbook.click();
		
		Thread.sleep(2000);
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
		Thread.sleep(2000);
		WebElement adc = driver.findElement(By.xpath("//a[@id='cartur']"));
		adc.click();
		
		Thread.sleep(2000);
		WebElement order = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
		order.click();
		
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Avinash");
		
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
		country.sendKeys("India");
		
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Delhi");
		
		Thread.sleep(2000);
		WebElement creditcard = driver.findElement(By.xpath("//input[@id='card']"));
		creditcard.sendKeys("4581 4455 9999");
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//input[@id='month']"));
		month.sendKeys("August");
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//input[@id='year']"));
		year.sendKeys("2025");
		
		Thread.sleep(2000);
		WebElement purchase = driver.findElement(By.xpath("//button[normalize-space()='Purchase']"));
		purchase.click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}