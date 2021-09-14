package com.ctrend.assignment.xPath_Pages;

import com.ctrend.assignment.BaseClass;
import com.ctrend.assignment.exceptions.ElementNotFoundException;
import com.ctrend.assignment.model.UserForm;
import com.ctrend.assignment.repository.FormRepository;
import com.ctrend.assignment.ui.Ui;
import org.openqa.selenium.By;

public class RoutForm extends BaseClass {
    private By placeHolder_code = By.xpath("//input[@id='route_code' and @name='route_code']");
    private By placeHolder_name = By.xpath("//input[@id='route_name' and @name='route_name']");
    private By placeHolder_description = By.xpath("//textarea[@id='desc' and @name='desc']");
    private By find_road_type = By.xpath("//*[text()='Pavement ']");
    private By find_vehicle_type = By.xpath("//*[text()='Walk ']");
    private By find_save_button = By.xpath("//button[@type='submit' and @class='btn btn-save pull-right']");

    UserForm userForm = new UserForm();
    public RoutForm() throws ElementNotFoundException {
    }


    // ALL SET METHOD
    public void codePlaceHolderSearch(String text) throws ElementNotFoundException {
        Ui.enterTextBy(placeHolder_code, text);
    }
    public void namePlaceHolderSearch(String text) throws ElementNotFoundException {
        Ui.enterTextBy(placeHolder_name, text);
    }
    public void descriptionPlaceHolderSearch(String text) throws ElementNotFoundException {
        Ui.enterTextBy(placeHolder_description, text);
    }

    public void clickRoadTypeButton() throws ElementNotFoundException {
        Ui.clickByXpath(find_road_type);
    }

    public void clickVehicleTypeButton() throws ElementNotFoundException {
        Ui.clickByXpath(find_vehicle_type);
    }

    public void clickSaveButton() throws ElementNotFoundException {
        Ui.clickByXpath(find_save_button);
    }



//    ALL GET METHOD

    public String getCode() throws ElementNotFoundException {
        return Ui.getTextByAttribute(placeHolder_code);
    }

    public String getName() throws ElementNotFoundException {
        return Ui.getTextByAttribute(placeHolder_name);
    }
    public String getDiscription() throws ElementNotFoundException {
        return Ui.getTextByAttribute(placeHolder_description);
    }
    public String getRoadType() throws ElementNotFoundException {
        return Ui.getTextBy(find_road_type);
    }
    public String getVehicalType() throws ElementNotFoundException {
        return Ui.getTextBy(find_vehicle_type);
    }


//        Save data
    public void save() throws ElementNotFoundException{
        UserForm userForm = new UserForm();
        userForm.setCode(getCode());
        userForm.setName(getName());
        userForm.setDescription(getDiscription());
        userForm.setRoadType(getRoadType());
        userForm.setVehicleType(getVehicalType());
        FormRepository.getInstance().saveUserForm(userForm);
    }


}
