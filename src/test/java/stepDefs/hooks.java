package stepDefs;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import pageObjects.basePage;

import java.io.IOException;

public class hooks extends basePage {
    Scenario scenario;

    @Before
    public void browserLaunch(Scenario scenario) throws IOException {
        this.scenario = scenario;
        initateBrowser();
    }

    @AfterAll
    public static void tearDown() throws Exception {
        driver.quit();
    }
}
