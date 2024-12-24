package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/features"},//Web Features
        glue= {"stepDefs"},
        monochrome=true,
        dryRun=false,
        tags= "@test")

public class Runner extends AbstractTestNGCucumberTests {

}
