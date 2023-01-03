package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
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
    @FindBy(xpath = "//div[@class='block-footer-top']")
    private WebElement pageBottomSection;
    @FindBy(xpath = "//div[@class='container']/ul[@class='clearfix']")
    private List<WebElement> pageBottomBlocksList;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[1]")
    private WebElement securePaymentTitle;
    @FindBy(xpath = "//em[@class='fas fa-unlock']/following-sibling::span")
    private WebElement securePaymentDescription;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[2]")
    private WebElement authenticProductsTitle;
    @FindBy(xpath = "(//a[@title='100% Secure payments']//span)[2]")
    private WebElement authenticProductsDescription;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[3]")
    private WebElement fastDeliveryTitle;
    @FindBy(xpath = "(//a[@title='100% Secure payments']//span)[3]")
    private WebElement fastDeliveryDescription;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[4]/a")
    private WebElement healthyFoodMainMenu;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[1]")
    private WebElement shopeByMenu;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[3]/a")
    private WebElement healthFoodOption;
    @FindBy(className = "container-category")
    private WebElement sportSupplementsCategoryImage;
    @FindBy(xpath = "//div[@class='category-details']/h1")
    private WebElement sportSupplementsTitleInSportSupplementsCategoryImage;
    @FindBy(xpath = "//div[@class='category-details']/p")
    private WebElement paragraphInInSportSupplementsCategoryImage;
    @FindBy(xpath = "(//div[@class='advertise-banner-3 imagewidgetclass'])[1]/div[@class='category-description']")
    private WebElement mainBannersInTheSportSupplementsSection;
    @FindBy(xpath = "//div[@class='category-info']")
    private WebElement sportSupplementsFooterSection;
    @FindBy(xpath = "//div[@class='category-description']/p/strong")
    private WebElement sportSupplementsTitleInFooterSection;
    @FindBy(xpath = "(//div[@class='category-description']/p[2])[2]")
    private WebElement sportSupplementsDescriptionInFooterSection;
    //Getter Methods
    public WebElement getParagraphInSportSupplementsCategoryImage() {
        DataHelperAndWait.waitToBeVisible(paragraphInInSportSupplementsCategoryImage,5,webDriver);
        return paragraphInInSportSupplementsCategoryImage;
    }
    public WebElement getSportSupplementsTitleInFooterSection() {
        DataHelperAndWait.waitToBeVisible(sportSupplementsTitleInFooterSection,5,webDriver);
        return sportSupplementsTitleInFooterSection;
    }
    public WebElement getSportSupplementsDescriptionInFooterSection() {
        DataHelperAndWait.waitToBeVisible(sportSupplementsDescriptionInFooterSection,5,webDriver);
        return sportSupplementsDescriptionInFooterSection;
    }
    public WebElement getSportSupplementsFooterSection() {
        DataHelperAndWait.waitToBeVisible(sportSupplementsFooterSection,5,webDriver);
        return sportSupplementsFooterSection;
    }
    public WebElement getHealthyFoodMainMenu() {
        return healthyFoodMainMenu;
    }
    public WebElement getShopeByMenu() {
        return shopeByMenu;
    }
    public WebElement getHealthFoodOption() {
        return healthFoodOption;
    }
    public WebElement getSecurePaymentDescription() {
        return securePaymentDescription;
    }
    public WebElement getAuthenticProductsTitle() {
        return authenticProductsTitle;
    }
    public WebElement getAuthenticProductsDescription() {
        return authenticProductsDescription;
    }
    public WebElement getFastDeliveryTitle() {
        return fastDeliveryTitle;
    }
    public WebElement getFastDeliveryDescription() {
        return fastDeliveryDescription;
    }
    public WebElement getPageBottomSection() {
        return pageBottomSection;
    }
    public WebElement getSecurePaymentTitle() {
        return securePaymentTitle;
    }
    public List<WebElement> getPageBottomBlocksList() {
        return pageBottomBlocksList;}
        public WebElement getHealthyFoodCategoryInHomePage() {
        DataHelperAndWait.waitToBeVisible(healthyFoodCategoryInHomePage,6,webDriver);
        return healthyFoodCategoryInHomePage;
    }
    public WebElement getSportSupplementsCategoryImage() {
        DataHelperAndWait.waitToBeVisible(sportSupplementsCategoryImage,7,webDriver);
        return sportSupplementsCategoryImage;
    }
    public WebElement getMainBannersInTheSportSupplementsSection() {
        DataHelperAndWait.waitToBeVisible(mainBannersInTheSportSupplementsSection,5,webDriver);
        return mainBannersInTheSportSupplementsSection;
    }
    public WebElement getSportSupplementsTitleInCategoryImage() {
        DataHelperAndWait.waitToBeVisible(sportSupplementsTitleInSportSupplementsCategoryImage,7,webDriver);
        return sportSupplementsTitleInSportSupplementsCategoryImage;
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
            DataHelperAndWait.isDisplayed(countryList, 6,webDriver);
            this.aeCountry.click();
        } catch (Exception e) {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 6,webDriver);
            this.aeCountry.click();
        }
    }
    public void navigateToHomePage(){webDriver.navigate().to(BaseURL);}
    public void navigate(){webDriver.navigate().to(BaseURL +aeDomain+healthyFoodsUrl);}

}
