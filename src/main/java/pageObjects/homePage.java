package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends basePage {

    public homePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='gh-logo']")
    public static WebElement title;

}
