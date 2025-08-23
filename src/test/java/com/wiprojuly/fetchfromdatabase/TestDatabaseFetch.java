package com.wiprojuly.fetchfromdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDatabaseFetch {
	
	private static final Logger log = LogManager.getLogger(TestDatabaseFetch.class);
	
	@Test
	public void readfromdatabase() throws SQLException, InterruptedException {
		
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "root";
		
		//create a connection to database
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		//Create a statement Object
		Statement st = con.createStatement();
		
		//Execute the queries
		String stquery = "SELECT * FROM persons;";
				
		//Pass the select query to resultset
		ResultSet rs = st.executeQuery(stquery);	
				
		//Result set in JDBC
		while (rs.next()) {
		    String fname = rs.getString("FirstName");
		    String lname = rs.getString("LastName");
		    
		    log.info("Starting login test...");

	        ChromeOptions chromeOption = new ChromeOptions();
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(chromeOption);
	        driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();

	        log.info("Opened browser and navigated to saucedemo");

	        Thread.sleep(2000);

	        // Enter text in username
	        WebElement user = driver.findElement(By.name("user-name"));
	        user.sendKeys(fname);
	        log.info("Entered username");

	        Thread.sleep(2000);

	        // Enter text in password
	        WebElement psword = driver.findElement(By.xpath("//input[@name='password']"));
	        psword.sendKeys(lname);
	        log.info("Entered password");

	        Thread.sleep(2000);

	        // Click on login button
	        WebElement login_button = driver.findElement(By.xpath("//input[@type='submit']"));
	        login_button.click();
	        log.info("Clicked login button");

	        Thread.sleep(2000);
	        driver.quit();
	        log.info("Browser closed");
	        
		}
	}
}
