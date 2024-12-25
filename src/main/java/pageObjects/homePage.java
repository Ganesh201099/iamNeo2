package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends basePage {

    public homePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tag[@css='']")
    public static WebElement title;

    @FindBy(id = "")
    public static WebElement title3;



}
