package com.ctrend.assignment.test;

import com.ctrend.assignment.exceptions.ElementNotFoundException;
import com.ctrend.assignment.model.BaseEntity;
import com.ctrend.assignment.repository.UserRepository;
import com.ctrend.assignment.ui.Ui;
import com.ctrend.assignment.xPath_Pages.LoginPage;
import com.ctrend.assignment.xPath_Pages.XP_D_Administrative_Area_Map163102.D_AD_area_on_map;
import org.junit.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public class D_AD_area_on_map_test extends Ui {

    @Test
    public void loginWithUser() throws ElementNotFoundException, InterruptedException, IOException {
        openURL("http://cloud.ctrends-software.com:9016");
        getLog();
        logger.info("page is loading kanon");

        LoginPage loginPage = new LoginPage();
        for(int i =1; i<=4; i++) {
            String url = "http://cloud.ctrends-software.com:9016/";
            if(!driver.getCurrentUrl().equals(url)) {
                BaseEntity user = UserRepository.getInstance().getUser(i);
                loginPage.usernamePlaceHolderSearch(user.getUserName());
                logger.info("user name is submit");
                Thread.sleep(2000);
                loginPage.passPlaceHolderSearch(user.getPassword());
                logger.info("password is submit");
                loginPage.clickSignButton();
                driver.get(url);
            }
        }
        String strUrl = driver.getCurrentUrl();
        System.out.println(strUrl);
        URL url = new URL(strUrl);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        int statusCode = http.getResponseCode();
        System.out.println(statusCode);
    }

    @Test
    public void d_AD_area_on_map_test_case() throws ElementNotFoundException, InterruptedException, IOException {
//        loginWithUser();
        openURL("http://cloud.ctrends-software.com:9016/?desturl=/geographic_polygon/define_region_on_map");
        D_AD_area_on_map dAdAreaOnMap = new D_AD_area_on_map();
        clickByXpath(dAdAreaOnMap.getRegion_type_click());
        clickByXpath(dAdAreaOnMap.getRegion_type_option_click());
        clickByXpath(dAdAreaOnMap.getRegion_level_click());
        clickByXpath(dAdAreaOnMap.getRegion_level_option_click());
        clickByXpath(dAdAreaOnMap.getSelected_region_click());
        clickByXpath(dAdAreaOnMap.getSelected_country_click());
        clickByXpath(dAdAreaOnMap.getRegion_country_option_click());
        enterTextBy(dAdAreaOnMap.getPlaceHolder_pass_text(), "Dema");
        clickByXpath(dAdAreaOnMap.getSearch_btn_click());
    }
}
