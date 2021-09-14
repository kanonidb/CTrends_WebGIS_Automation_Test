package com.ctrend.assignment.ui;

import com.ctrend.assignment.BaseClass;
import com.ctrend.assignment.exceptions.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;


public class Ui extends BaseClass {


    public static void openURL(String url){
        driver.get(url);
        Reporter.log("Navigated to" + url);
    }


    //ALL ELEMENT FINDING
    public static WebElement findElementBy(By by) throws ElementNotFoundException {
        WebElement e = null;
        try{
            e = driver.findElement(by);
        }catch (Exception e1){
            throw new ElementNotFoundException(by +"This Element is not Found");
        }
            return e;
    }


    //ALL METHOD CLICK
    public static void clickByXpath(By by) throws ElementNotFoundException {
        findElementBy(by).click();
    }

    public static void enterTextBy(By by, String text) throws ElementNotFoundException {
        findElementBy(by).sendKeys(text);
    }

    public static String getTextByAttribute(By by) throws ElementNotFoundException{
      return findElementBy(by).getAttribute("value");
    }
    public static String getTextBy(By by) throws ElementNotFoundException{
        return findElementBy(by).getText();
    }
}
