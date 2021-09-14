package com.ctrend.assignment.driverconection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverConection {

    @SuppressWarnings("deprecation")
	public static WebDriver getDriver(String br){
        if(br.equals("chrome"))
        {
        System.setProperty("webdriver.chrome.driver", "/home/kanon/Work_space/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        return driver;
        }
        else if(br.equals("firefox"))
        {
//            System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
//            driver = new FirefoxDriver();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.manage().window().fullscreen();
//            return driver;
        }
        else if(br.equals("ie"))
        {
//            System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
//            driver = new InternetExplorerDriver();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.manage().window().fullscreen();
//            return driver;
        }
        return null;
    } 
}
