package com.orangehrm.commonfunctions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.orangehrm.commonutils.configurationfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class open_close_browser_extentreport extends configurationfile {

    public static WebDriver driver;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extentreport;
    public static ExtentTest test;


    @BeforeSuite
    public  void launchbrowser() throws IOException {
        String browser = config().getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", config().getProperty("chromedriverlocation"));
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", config().getProperty("firefoxdriverlocation"));
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        }
        // specify location of the report
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +
                "/test-output/myReport.html");

        htmlReporter.config().setDocumentTitle("Automation Report"); // Tile of report
        htmlReporter.config().setReportName("Functional Testing"); // Name of the report
        htmlReporter.config().setTheme(Theme.DARK);

        extentreport = new ExtentReports();
        extentreport.attachReporter(htmlReporter);

        // Passing General information
        extentreport.setSystemInfo("Host name", "localhost");
        extentreport.setSystemInfo("Environemnt", "QA");
        extentreport.setSystemInfo("user", "kirupaagar");

    }


    @AfterSuite
    public void closebrowser(){
        extentreport.flush();
        driver.close();
    }





}