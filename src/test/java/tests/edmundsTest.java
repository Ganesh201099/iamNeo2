package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.basePage;
import pageObjects.homePage;
import utility.Report;

import java.io.IOException;

public class edmundsTest extends basePage {
    homePage homePage =new homePage();
    static ExtentReports report;
    public static ExtentTest test;
    public edmundsTest() {
        PageFactory.initElements(driver, this);
    }

    @BeforeSuite
    public void setScenario() throws IOException {

    }

    @BeforeTest
    public static void browserLaunch() throws IOException {
        initateBrowser();
        report = Report.generateExtentReport("Iam Neo Report");
        Report.attachScreenshotToReport("Screenshot", test, "Execution Screenshot");
    }

    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();
    }


    @Test(priority = 1)
    public void testHoverAndClick() {
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
    public void testSearchForToyota(){
        // Search for 'Toyota' in the search box
        clickOnElement(homePage.title);
        clickOnElement(homePage.searchTextBox);
        String toyota="Toyota";
        homePage.searchTextBox.sendKeys(toyota);
        //waitTillElementPresent(newCarsSection);
        clickOnElement(homePage.allToyotaModels);


    }

    @Test(priority = 3)
    public void testCarSectionsAndSelectEvCars() {
        // Hover over a "Menu Item"
        hoverOverElement(homePage.usedCarsSection);
        clickOnElement(homePage.usedCarsSection);
        clickOnElement(homePage.newCarAnyMakeDropdown);
        clickOnElement(homePage.newCarGoButton);
        clickOnElement(homePage.ev);

    }
}
