package com.orangehrm.testcases;

import com.aventstack.extentreports.Status;
import com.orangehrm.commonfunctions.open_close_browser_extentreport;
import com.orangehrm.commonutils.propertyconfiguration;
import com.orangehrm.pagefactory.forloginorangehrm;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class getallpendingleaverequest  extends open_close_browser_extentreport  {



    public  void loginorangeHRMwebsite(){

        try {
            driver.navigate().to(config().getProperty("url"));
            PageFactory.initElements(driver,forloginorangehrm.class);
            forloginorangehrm.username.sendKeys(config().getProperty("username"));
            forloginorangehrm.password.sendKeys(config().getProperty("password"));
            forloginorangehrm.loginbutton.click();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void metleaverequest(){
        test = extentreport.createTest("Leave request");
        test.log(Status.INFO,"Pending Leave request");

        PageFactory.initElements(driver,forloginorangehrm.class);
        List<WebElement> listofleaverequests = forloginorangehrm.listofleaverequest;
        for (WebElement listofleaverequest : listofleaverequests) {

            test.log(Status.INFO, listofleaverequest.getText());

            PropertyConfigurator.configure("log4j.properties");
            propertyconfiguration.log.info(listofleaverequest.getText());



        }
    }

    @Test
    public void callmethods(){
     loginorangeHRMwebsite();
     metleaverequest();
    }
}
