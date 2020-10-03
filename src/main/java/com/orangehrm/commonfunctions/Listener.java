package com.orangehrm.commonfunctions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.orangehrm.commonutils.propertyconfiguration;
import org.apache.log4j.PropertyConfigurator;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class Listener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
// TODO Auto-generated method stub
        PropertyConfigurator.configure("log4j.properties");
        propertyconfiguration.log.info("opening orangeHRM ");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
// TODO Auto-generated method stub
        propertyconfiguration.log.info("Success of test cases and its details are : "
                + result.getInstanceName() + " completed");

    }

    @Override
    public void onTestFailure(ITestResult result) {
// TODO Auto-generated method stub
        propertyconfiguration.log.info("Failure of test cases and its details are : " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
// TODO Auto-generated method stub
        propertyconfiguration.log.info("Skip of test cases and its details are : " + result.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
// TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext context) {
// TODO Auto-generated method stub
        propertyconfiguration.log.info("opening chrome browser");
    }

    @Override
    public void onFinish(ITestContext context) {
// TODO Auto-generated method stub
        propertyconfiguration.log.info("closing chrome browser");
    }


}
