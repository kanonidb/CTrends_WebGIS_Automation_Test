package com.ctrend.assignment.xPath_Pages;

import com.ctrend.assignment.BaseClass;
import com.ctrend.assignment.exceptions.ElementNotFoundException;
import com.ctrend.assignment.ui.Ui;
import org.openqa.selenium.By;

public class HomePage extends BaseClass {

    private By find_Status1 = By.xpath("//*[text()='Patrol Routes ']");
    private By find_Status = By.xpath("//*[text()=' Create Patrol Route Name']");


    public void clickRoutpopButton() throws ElementNotFoundException {
        Ui.clickByXpath(find_Status1);
    }

    public void clickRoutButton() throws ElementNotFoundException {
        Ui.clickByXpath(find_Status);
    }
}
