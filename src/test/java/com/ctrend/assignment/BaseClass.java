package com.ctrend.assignment;

import com.ctrend.assignment.driverconection.DriverConection;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;


public class BaseClass extends DriverConection {

   public static String browser = "chrome";

   public static WebDriver driver = getDriver(browser);
   public static Reporter reporter = new Reporter();
   public static  Logger logger;
   public static void getLog(){
      logger = Logger.getLogger("test selenium");
      PropertyConfigurator.configure("src/log4j.properties");
   }
}
