package com.orangehrm.testcases;

import com.aventstack.extentreports.Status;
import com.orangehrm.commonfunctions.open_close_browser_extentreport;
import com.orangehrm.commonfunctions.retry_Analyzer;
import com.orangehrm.commonutils.dataprovider.loginpagedatas;
import com.orangehrm.commonutils.propertyconfiguration;
import com.orangehrm.pagefactory.forloginorangehrm;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class loginorangehrms extends open_close_browser_extentreport {

    @Test(priority = 1,retryAnalyzer = retry_Analyzer.class)
    public  void openorangehrm() {

        try {
            driver.navigate().to(config().getProperty("url"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 2,dataProvider = "credentials", dataProviderClass = loginpagedatas.class)
    public  void loginorangehrm(String user, String pass) {

        PropertyConfigurator.configure("log4j.properties");
        propertyconfiguration.log.info("Logging in using username: " + user);
        propertyconfiguration.log.info("Logging in using password: " + pass);
        test = extentreport.createTest("OrangeHRM");
        test.log(Status.INFO,"Logging in using username: " + user);
        test.log(Status.INFO,"Logging in using password: " + pass);
        PageFactory.initElements(driver, forloginorangehrm.class);
        forloginorangehrm.username.sendKeys(user);
        forloginorangehrm.password.sendKeys(pass);
        forloginorangehrm.loginbutton.click();



    }





}
