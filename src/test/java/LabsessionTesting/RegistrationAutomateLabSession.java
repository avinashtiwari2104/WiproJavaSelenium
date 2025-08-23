package LabsessionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationAutomateLabSession {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Sending Name
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Avinash Tiwari");
		
		//Sending Email
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("avi.t123@gmail.com");
		
		//Selecting Gender
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		
		//Enter Mobile Number
		Thread.sleep(2000);
		WebElement mnumber = driver.findElement(By.xpath("//input[@id='mobile']"));
		mnumber.sendKeys("9027681589");
		
		//Enter DOB
		Thread.sleep(2000);
		WebElement dob = driver.findElement(By.name("dob"));
		dob.sendKeys("21042003");
		
		//Enter Subject
		Thread.sleep(2000);
		WebElement sub = driver.findElement(By.name("subjects"));
		sub.sendKeys("Java Selenium");
		
		//Hobbies
		Thread.sleep(2000);
		WebElement hobby = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		hobby.click();
		
		//Upload Pic
		Thread.sleep(2000);
		WebElement pic = driver.findElement(By.xpath("//input[@id='picture']"));
		pic.sendKeys("C:\\Users\\avina\\Downloads\\image2.png");
		
		//Enter Address
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.xpath("//textarea[@id='picture']"));
		address.sendKeys("123, SK, UP");
		
		//Select State
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.xpath("//select[@id = 'state']"));
		Select sel = new Select(state);
		
		Thread.sleep(2000);
		sel.selectByVisibleText("Uttar Pradesh");
		
		//Select City
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//select[@id = 'city']"));
		Select sel1 = new Select(city);
				
		Thread.sleep(2000);
		sel1.selectByVisibleText("Agra");
		
		//Login Button
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
		
		Thread.sleep(2000);
		driver.quit();

	}
	
}
