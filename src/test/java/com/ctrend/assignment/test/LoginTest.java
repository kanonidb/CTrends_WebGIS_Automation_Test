package com.ctrend.assignment.test;
import com.ctrend.assignment.model.Login;
import com.ctrend.assignment.xPath_Pages.HomePage;
import com.ctrend.assignment.xPath_Pages.LoginPage;
import com.ctrend.assignment.xPath_Pages.RoutForm;
import com.ctrend.assignment.exceptions.ElementNotFoundException;
import com.ctrend.assignment.model.BaseEntity;
import com.ctrend.assignment.model.UserData;
import com.ctrend.assignment.repository.UserDataRepository;
import com.ctrend.assignment.repository.UserRepository;
import com.ctrend.assignment.ui.Ui;
import org.junit.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class LoginTest extends Ui {

    @Test
    public void loginWithUser() throws ElementNotFoundException, InterruptedException, IOException {
    openURL("http://cloud.ctrends-software.com:9009/?desturl=/patrol_route/create_name");
        getLog();
        logger.info("page is loading kanon");
        LoginPage loginPage = new LoginPage();
        for(int i =1; i<=4; i++) {
            String url = "http://cloud.ctrends-software.com:9009/";
            if(!driver.getCurrentUrl().equals(url)) {
                Login user = UserRepository.getInstance().getUser(i);
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
    public void homePageRoute() throws ElementNotFoundException, InterruptedException, IOException {
//        loginWithUser();
        HomePage homePage = new HomePage();

//        get url
        String strUrl = driver.getCurrentUrl();
        System.out.println( "home pase Url" + strUrl);
        homePage.clickRoutpopButton();

        //        get url
        String strUr2 = driver.getCurrentUrl();
        System.out.println("click popup menu"+strUr2);

//        test page change
        if(strUr2.equalsIgnoreCase(strUrl)){
            System.out.println("page not change");
        }else {
            System.out.println("page change");
        }


        homePage.clickRoutButton();
        //        get url
        String strUrl3 = driver.getCurrentUrl();
        System.out.println("click rout baton"+strUrl3);

        //        test page change
        if(strUr2.equalsIgnoreCase(strUrl3)){
            System.out.println("page not change");
        }else {

            System.out.println("page change");
        }
        String title1 = driver.getTitle();
        System.out.println(title1);
    }

    @Test
    public void loginWithId1() throws ElementNotFoundException, InterruptedException, IOException {
//        homePageRoute();

//      data form userdata table for set in input filled
        UserData userData = UserDataRepository.getInstance().getUserData();
        RoutForm routForm = new RoutForm();
//      set value
        routForm.codePlaceHolderSearch(userData.getCode());
        routForm.namePlaceHolderSearch(userData.getName());
        routForm.descriptionPlaceHolderSearch(userData.getDescription());
        routForm.clickRoadTypeButton();
        routForm.clickVehicleTypeButton();
        routForm.clickSaveButton();
//      input data save in database
//      Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("CREATE PATROL ROUTE NAME");
        routForm.save();
        String strUrl = driver.getCurrentUrl();
        System.out.println(strUrl);

//Http response catching
        URL url = new URL(strUrl);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        int statusCode = http.getResponseCode();
        System.out.println(statusCode);


        String title1 = driver.getTitle();
        System.out.println("after save : " + title1);
//        if(verifyTitleIsPresent){
//       routForm.save();
//            TestResultPage testResultPage = new TestResultPage();
//            testResultPage.save("test cheque seccessfully", "200", "OK");
//        }
        }
    }


