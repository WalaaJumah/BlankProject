package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
//import sporter_test.AEMegaMenuTestCases;

public class AeHealthyFoodCategoryPage extends BasePage {
    public AeHealthyFoodCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    //declare all locators related to the AeSportSupplementsCategoryPage
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;




    @FindBy(xpath = "//div[@class='category-description']/p[2]")
    private WebElement healthyFoodDescriptionP1InFooterSection;
    @FindBy(xpath = "//div[@class='category-description']/p[3]")
    private WebElement healthyFoodDescriptionP2InFooterSection;
    @FindBy(xpath = "//div[@class='category-description']/p[4]")
    private WebElement healthyFoodDescriptionP3InFooterSection;



    @FindBy(xpath = "//div[@class='category-description']/p[4]/br")
    private WebElement healthyFoodDescriptionP4InFooterSection;
    @FindBy(xpath = "(//a[@href='healthy-food'])[3]")
    private WebElement healthyFoodCategoryInHomePage;


    //Getter Methods
    public WebElement getHealthyFoodCategoryInHomePage() {
        return healthyFoodCategoryInHomePage;
    }

    public WebElement getHealthyFoodDescriptionP1InFooterSection() {
        return healthyFoodDescriptionP1InFooterSection;
    }

    public WebElement getHealthyFoodDescriptionP2InFooterSection() {
        return healthyFoodDescriptionP2InFooterSection;
    }

    public WebElement getHealthyFoodDescriptionP3InFooterSection() {
        return healthyFoodDescriptionP3InFooterSection;
    }
    public WebElement getHealthyFoodDescriptionP4InFooterSection() {
        return healthyFoodDescriptionP4InFooterSection;
    }

    //Define the main actions we need to execute our TCs
    public void switchToAECountry() {
        try {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 1,webDriver);
            this.aeCountry.click();
        } catch (Exception e) {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 1,webDriver);
            this.aeCountry.click();
        }
    }
}
