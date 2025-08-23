package com.wiprojuly.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExcelWrite {
	
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

            // Start WebDriver for each test
            ChromeOptions chromeOption = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(chromeOption);
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            Thread.sleep(2000);

            //Get the title of the page
            String title = driver.getTitle();
            System.out.println(title);
            
            //Write in every cell
            sheet.getRow(i).createCell(2).setCellValue(title);
            
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
