package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homePage;
import utility.Log;
import pageObjects.basePage;

public class ebayStepDef extends basePage {
    homePage homePage = new homePage();
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
        
    }

    @When("Hover on the {string} section")
    public void hoverOnTheSection(String arg0) {

    }

    @And("Navigate to {string} category")
    public void navigateToCategory(String arg0) {


    }

    @Then("Validate that {string} category screen is displayed")
    public void validateThatCategoryScreenIsDisplayed(String arg0) {
        
    }

    @And("Validate the number of results available")
    public void validateTheNumberOfResultsAvailable() {
    }
}
