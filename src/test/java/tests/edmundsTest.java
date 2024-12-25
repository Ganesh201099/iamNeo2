package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.basePage;
import pageObjects.homePage;
import utility.Log;
import utility.Report;

import java.io.IOException;

public class edmundsTest extends basePage {

    static ExtentReports report;
    public static ExtentTest test;

    @BeforeSuite
    public void setScenario() {

    }

    @BeforeTest
    public static void browserLaunch() throws IOException {
        initateBrowser();
        report = Report.generateExtentReport("Iam Neo Report");
        Report.attachScreenshotToReport("Screenshot", test, "Execution Screenshot");
    }

    @AfterSuite
    public static void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test1(){
        Log.info("Application Launched");
        waitTillElementPresent(homePage.title);
        Assert.assertTrue(isElementDisplayed(homePage.title));
        Log.info("Title is present");
    }

    @Test
    public void test2(){
        homePage.title.sendKeys("Tata Suv");
    }

    @Test
    public void test3(){

    }

}
