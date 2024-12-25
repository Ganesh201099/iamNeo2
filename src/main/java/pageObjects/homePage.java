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

    @FindBy(xpath= "(//a[text()='Electronics'])[2]")
    public static WebElement electronicSection;

    @FindBy(xpath= "(//a[text()='Motors'])[1]")
    public static WebElement motorsSection;

    @FindBy(xpath= "(//a[text()='Fashion'])[2]")
    public static WebElement fashionSection;

    @FindBy(xpath= "//a[text()='Smart home']")
    public static WebElement smartHomeCategory;
}
