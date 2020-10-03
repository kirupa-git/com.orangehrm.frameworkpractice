package com.orangehrm.commonfunctions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry_Analyzer implements IRetryAnalyzer {

        int initialcount = 0;
        int numberoftimes = 4;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (initialcount==0){
            initialcount++;
            return true;

        }
        return false;
    }
}
