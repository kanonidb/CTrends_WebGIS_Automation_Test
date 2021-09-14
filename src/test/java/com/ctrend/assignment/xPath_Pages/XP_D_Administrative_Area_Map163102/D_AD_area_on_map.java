package com.ctrend.assignment.xPath_Pages.XP_D_Administrative_Area_Map163102;

import com.ctrend.assignment.BaseClass;
import org.openqa.selenium.By;

public class D_AD_area_on_map  extends BaseClass {
    private By region_type_click = By.xpath("//select[@id='region_type' and @name='region_type']");
    private By region_type_option_click = By.xpath("//option[@value='Country' and text()='Country Unit']");

    private By region_level_click = By.xpath("//select[@id='region_level' and @name='region_level']");
    private By region_level_option_click = By.xpath("//option[@value='4' and text()='4']");

    private By Selected_region_click = By.xpath("//button[@id='btnSelectRoute' and @type='button']");

    private By Selected_country_click = By.xpath("//select[@id='country_name' and @name='country_name']");
    private By region_country_option_click = By.xpath("//option[@value='BD' and text()='Bangladesh']");

    private By placeHolder_pass_text = By.xpath("//input[@name='text' and @placeholder='Search Text ....']");

    private By search_btn_click = By.xpath("//button[@class ='btn btn-search' and @type='submit']");

    private By find_search_result = By.xpath("//a[text()='Dema' and @name='desc']//parent::td[4]//parent::tr[1]");

    public By getRegion_type_click() {
        return region_type_click;
    }

    public By getRegion_type_option_click() {
        return region_type_option_click;
    }

    public By getRegion_level_click() {
        return region_level_click;
    }

    public By getRegion_level_option_click() {
        return region_level_option_click;
    }

    public By getSelected_region_click() {
        return Selected_region_click;
    }

    public By getSelected_country_click() {
        return Selected_country_click;
    }

    public By getRegion_country_option_click() {
        return region_country_option_click;
    }

    public By getPlaceHolder_pass_text() {
        return placeHolder_pass_text;
    }

    public By getSearch_btn_click() {
        return search_btn_click;
    }

    public By getFind_search_result() {
        return find_search_result;
    }
}
