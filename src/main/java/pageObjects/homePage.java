package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homePage extends basePage {

    public homePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='logo-section py-1']")
        public WebElement title;

    @FindBy(xpath= "//*[@data-tracking-id='global_nav_select_new_car']")
    public WebElement newCarsSection;

    @FindBy(xpath= "//a[@data-tracking-id='link_select_tool_select']")
    public  WebElement carReviewsSection;

    @FindBy(xpath= "//a[@data-tracking-id='global_nav_select_used_car']")
    public  WebElement usedCarsSection;

    @FindBy(xpath = "//*[@data-tracking-id='home_page_type_select' and @data-tracking-value='Electric Cars']")
    public  WebElement ev;

    @FindBy(xpath = "//*[@data-tracking-id='home_page_type_select' and @data-tracking-value='SUVs']")
    public  WebElement suv;

    @FindBy(xpath = "//*[@data-tracking-id='home_page_type_select' and @data-tracking-value='Sedans']")
    public  WebElement sedan;

    @FindBy(xpath = "//*[@id='insider-notifications-btn']")
    public  WebElement notifyButton;

    @FindBy(xpath= "//*[@data-tracking-id='new_cars_index_mmy_make_select']")
    public  WebElement newCarAnyMakeDropdown;

    @FindBy(xpath= "//*[@data-tracking-id='new_cars_index_mmy_make_model_tab_submit']")
    public  WebElement newCarGoButton;

    @FindBy(xpath= "//a[@data-tracking-value='Appraise My Car']")
    public  WebElement appraiseMyCarSection;

    @FindBy(xpath= "//*[@class='d-flex text-cool-gray-30']")
    public  WebElement allToyotaModels;

    @FindBy(xpath= "//*[@id='autosized-area']")
    public  WebElement searchTextBox;




}
