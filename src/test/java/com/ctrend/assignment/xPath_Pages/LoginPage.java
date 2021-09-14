package com.ctrend.assignment.xPath_Pages;

import com.ctrend.assignment.BaseClass;
import com.ctrend.assignment.exceptions.ElementNotFoundException;
import com.ctrend.assignment.ui.Ui;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

    private By placeHolder_email = By.xpath("//input[@name='username' and @placeholder='Username']");
    private By placeHolder_pass = By.xpath("//input[@name='password' and @placeholder='Password']");
    private By login_btn = By.xpath("//button[@type='submit' and @class='btn btn-primary pull-right']");
    private By login_btn1 = By.xpath("//button[@type='submit11' and @class='btn btn-primary pull-right']");


    public void usernamePlaceHolderSearch(String text) throws ElementNotFoundException {
        Ui.enterTextBy(placeHolder_email, text);
    }

    public void passPlaceHolderSearch(String text) throws ElementNotFoundException {
        Ui.enterTextBy(placeHolder_pass, text);
    }

    public boolean clickSignButton() throws ElementNotFoundException {
        try{Ui.clickByXpath(login_btn);
            return true;}
        catch(ElementNotFoundException e){
        }
     return false;
    }


}
