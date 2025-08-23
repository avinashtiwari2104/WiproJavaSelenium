package com.wiprojuly.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExcelReadEg {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	
	@Test
	public void login() throws InterruptedException, IOException {
		
		File src = new File("C:\\Users\\avina\\OneDrive\\Desktop\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(src);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getLastRowNum(); // total rows
		
		for (int i = 1; i <= rowCount; i++) {
            Row row = sheet.getRow(i);

            String usernameExcel = row.getCell(0).getStringCellValue();
            String passwordExcel = row.getCell(1).getStringCellValue();

            // Start WebDriver for each test
            ChromeOptions chromeOption = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(chromeOption);
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            Thread.sleep(2000);

            // Enter username
            WebElement username = driver.findElement(By.name("user-name"));
            username.sendKeys(usernameExcel);

            Thread.sleep(1000);

            // Enter password
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys(passwordExcel);

            Thread.sleep(1000);

            // Click on login button
            WebElement login_button = driver.findElement(By.xpath("//input[@type='submit']"));
            login_button.click();

            Thread.sleep(2000);

            // Simple validation (check if login was successful or not)
            String result;
            if (driver.getCurrentUrl().contains("inventory")) {
                result = "Login Successful";
            } else {
                result = "Login Failed";
            }
            System.out.println("Row " + i + " : " + result);
            
            // Write result back to Excel in column 2
            Cell cell = row.createCell(3);
            cell.setCellValue(result);
            
            Thread.sleep(2000);
            driver.quit();
        }
		
		FileOutputStream fos = new FileOutputStream(src);
        workbook.write(fos);
        fos.close();
        workbook.close();
        fis.close();
		
	}

}
