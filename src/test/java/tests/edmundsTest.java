package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.basePage;
import pageObjects.homePage;
import utility.Report;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class edmundsTest extends basePage {
    public static RemoteWebDriver driver;
    static homePage homePage =new homePage();
    static ExtentReports report;
    public static ExtentTest test;
    public edmundsTest() {

        PageFactory.initElements(driver, this);
    }

    @BeforeSuite
    public void setScenario() throws IOException {
//        //public static void initateBrowser() throws IOException {
//            System.out.println("Initializing the web browser");
//            FileInputStream fis = new FileInputStream(ConfigurationFile);
//            Properties prop = new Properties();
//            prop.load(fis);
//            String browserName = prop.getProperty("browser");
//            Browser_Launch(browserName);
//            driver.get(prop.getProperty("url"));
//        //}
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


    @Test(priority = 1)
    public static void testHoverAndClick() {
        // Hover over the "New Cars" menu and click "Car Reviews"
        //waitTillElementPresent(title);
        clickOnElement(homePage.title);
        clickOnElement(homePage.newCarsSection);
        clickOnElement(homePage.title);
        clickOnElement(homePage.carReviewsSection);
        clickOnElement(homePage.title);
        clickOnElement(homePage.ev);
        clickOnElement(homePage.title);
        clickOnElement(homePage.suv);
        clickOnElement(homePage.title);
        clickOnElement(homePage.sedan);
        clickOnElement(homePage.title);
        clickOnElement(homePage.notifyButton);

    }

    @Test(priority = 2)
    public static void testSearchForToyota(){
        // Search for 'Toyota' in the search box
        clickOnElement(homePage.title);
        clickOnElement(homePage.searchTextBox);
        String toyota="Toyota";
        homePage.searchTextBox.sendKeys(toyota);
        //waitTillElementPresent(newCarsSection);
        clickOnElement(homePage.allToyotaModels);


    }

    @Test(priority = 3)
    public static void testCarSectionsAndSelectEvCars() {
        // Hover over a "Menu Item"
        hoverOverElement(homePage.usedCarsSection);
        clickOnElement(homePage.usedCarsSection);
        clickOnElement(homePage.newCarAnyMakeDropdown);
        clickOnElement(homePage.newCarGoButton);
        clickOnElement(homePage.ev);

    }
}
