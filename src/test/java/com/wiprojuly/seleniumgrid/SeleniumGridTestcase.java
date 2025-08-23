package com.wiprojuly.seleniumgrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumGridTestcase extends HelperClass {

    @Test
    public void login() throws InterruptedException {
    	    	
        WebElement username = getDriver().findElement(By.name("user-name"));
        username.sendKeys("standard_user");

        Thread.sleep(2000);

        WebElement password = getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("secret_sauce");

        Thread.sleep(2000);

        WebElement login_button = getDriver().findElement(By.xpath("//input[@type='submit']"));
        login_button.click();

        Thread.sleep(2000);
      
    }
}
