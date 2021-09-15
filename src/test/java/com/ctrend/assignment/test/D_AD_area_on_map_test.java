package com.ctrend.assignment.test;

import com.ctrend.assignment.exceptions.ElementNotFoundException;
import com.ctrend.assignment.model.BaseEntity;
import com.ctrend.assignment.model.Login;
import com.ctrend.assignment.model.Ui_define_administrative_area_on_map;
import com.ctrend.assignment.repository.D_AD_area_on_map_repository;
import com.ctrend.assignment.repository.UserRepository;
import com.ctrend.assignment.ui.Ui;
import com.ctrend.assignment.xPath_Pages.LoginPage;
import com.ctrend.assignment.xPath_Pages.XP_D_Administrative_Area_Map163102.D_AD_area_on_map;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class D_AD_area_on_map_test extends Ui {

    @Test
    public void loginWithUser() throws ElementNotFoundException, InterruptedException, IOException {
        openURL("http://cloud.ctrends-software.com:9016");
        getLog();
        logger.info("page is loading kanon");
        LoginPage loginPage = new LoginPage();

        loginPage.usernamePlaceHolderSearch("AYAAN");
        loginPage.passPlaceHolderSearch("abc123456AA");
        loginPage.clickSignButton();
//        for(int i =1; i<=4; i++) {
//            String url = "http://cloud.ctrends-software.com:9016/";
//            if(!driver.getCurrentUrl().equals(url)) {
//                Login user = UserRepository.getInstance().getUser(i);
//                System.out.println(user.getUserName());
//
//                Thread.sleep(2000);
//                loginPage.usernamePlaceHolderSearch(user.getUserName());
//                logger.info("user name is submit");
//                Thread.sleep(2000);
//                loginPage.passPlaceHolderSearch(user.getPassword());
//                logger.info("password is submit");
//                loginPage.clickSignButton();
//                driver.get(url);
//            }
//        }
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

        D_AD_area_on_map_repository test = D_AD_area_on_map_repository.getInstance();
        List<Ui_define_administrative_area_on_map> t = test.findAll();
        System.out.println(t.get(0).getSeq());
        String kk =" ";

        int k = 0;
        for(int i = 0; i < 2; i++) {
            int a = 1;
            int j ;
            for( j = k; j<test.findAll().size(); j++) {

                if(test.findAll().get(j).getSeq()== 1){
                    Thread.sleep(2000);
                    clickByXpath(By.xpath(test.findAll().get(j).getXpath()));
                    Thread.sleep(2000);
                }

                else if (test.findAll().get(j).equals("H")){
                    System.out.println("Hira");                }

                kk += " " +test.findAll().get(j);
                System.out.println("2nd Iteration: " + test.findAll().get(j));
                a++;
                k++;
                if(a == 6) {
                    break;
                }
            }
            System.out.println("interval");

            a = 1;

        }

//        clickByXpath(dAdAreaOnMap.getRegion_type_click());
//        Thread.sleep(1000);
//        clickByXpath(dAdAreaOnMap.getRegion_type_option_click());
//        Thread.sleep(1000);
//
//        clickByXpath(dAdAreaOnMap.getRegion_level_click());
//        Thread.sleep(1000);
//
//        clickByXpath(dAdAreaOnMap.getRegion_level_option_click());
//        Thread.sleep(1000);
//
//        clickByXpath(dAdAreaOnMap.getSelected_region_click());
//        Thread.sleep(1000);
//
//        clickByXpath(dAdAreaOnMap.getSelected_country_click());
//        Thread.sleep(1000);
//
//        clickByXpath(dAdAreaOnMap.getRegion_country_option_click());
//        Thread.sleep(1000);
//
//        enterTextBy(dAdAreaOnMap.getPlaceHolder_pass_text(), "Dema");
//        Thread.sleep(1000);
//        clickByXpath(dAdAreaOnMap.getSearch_btn_click());



    }
}
