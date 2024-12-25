package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.homePage;
import utility.Log;
import pageObjects.basePage;

public class ebayStepDef extends homePage {
    @Given("Launch the application")
    public void launchTheApplication() {
        Log.info("Application Launched");
    }

    @And("Wait until application is loaded completely")
    public void waitUntilApplicationIsLoadedCompletely() {
        Log.info("Application Title is present ");
        waitTillElementPresent(homePage.title);
    }

    @Then("Validate the page title")
    public void validateThePageTitle() {
        Assert.assertTrue(isElementDisplayed(homePage.title));
        Log.info("Title is present");
    }

    @When("Hover on the Electronics section")
    public void hoverOnTheElectronicsSection() {
        hoverOverElement(homePage.electronicSection);
        Log.info("Hovered on Electronic Section");
    }

    @And("Navigate to Smart home category")
    public void navigateToSmartHomeCategory() {
        waitTillElementPresent(homePage.smartHomeCategory);
        clickOnElement(homePage.smartHomeCategory);
        Log.info("Clicked on Smart Home Category");
    }

    @Then("Validate that Smart home category screen is displayed")
    public void validateThatSmartHomeCategoryScreenIsDisplayed() {
        
    }

    @And("Validate the number of results available")
    public void validateTheNumberOfResultsAvailable() {
    }

}
