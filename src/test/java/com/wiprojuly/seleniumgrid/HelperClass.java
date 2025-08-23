package com.wiprojuly.seleniumgrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class HelperClass {

    // Thread-safe driver instance
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public static String remote_url = "http://192.168.56.1:4444";  // Hub URL

    @BeforeTest
    public void setDriver() throws MalformedURLException {
    	
    	//For Chrome
        ChromeOptions options = new ChromeOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url), options));
        getDriver().get("https://www.saucedemo.com/");
        getDriver().manage().window().maximize();
        
        //For Firefox
        FirefoxOptions options1 = new FirefoxOptions();
		driver.set(new RemoteWebDriver(new URL(remote_url), options1));
		getDriver().get("https://www.saucedemo.com/");
		driver.get().manage().window().maximize();
		
		/*//For Edge
		EdgeOptions options2 = new EdgeOptions();
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		driver.set(new RemoteWebDriver(new URL(remote_url), options2));
		getDriver().get("https://www.saucedemo.com/");
		driver.get().manage().window().maximize();*/
		
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        
    }

    public static RemoteWebDriver getDriver() {
        return driver.get();
    }

    /*@AfterTest
    public void close() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
    }*/
}
