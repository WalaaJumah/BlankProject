package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AeSportSupplementsCategoryPage extends BasePage {
    public AeSportSupplementsCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //declare all locators related to the AeSportSupplementsCategoryPage
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    // This for the Horizontal Banner appears in the sport Supplements landing Page
    @FindBy(className = "container-category")
    private WebElement sportSupplementsCategoryImage;
    @FindBy(xpath = "//div[@class='category-details']/h1")
    private WebElement sportSupplementsTitleInSportSupplementsCategoryImage;
    @FindBy(xpath = "//div[@class='advertise-banner-3 imagewidgetclass']/ul/li")
    private List<WebElement> mainBannersInTheSportSupplementsScreen;
    @FindBy(xpath = "(//div[@class='advertise-banner-3 imagewidgetclass'])[1]/div[@class='category-description']")
    private WebElement mainBannersInTheSportSupplementsSection;
    @FindBy(xpath = "//div[@class='category-details']/p")
    private WebElement paragraphInInSportSupplementsCategoryImage;
    @FindBy(xpath = "(//a[@href='sport-supplements'])[3]")
    private WebElement sportSupplementsCategoryInHomePage;
    @FindBy(xpath = "//a[normalize-space()='Home']")
    private WebElement homeBreadcrumbs;
    @FindBy(xpath = "(//label[@class='sorter-label'])[1]")
    private WebElement sortByLabel;
    @FindBy(xpath = "(//p[@class='count-container-item amount amount--has-pages'])[1]/span")
    private WebElement resultLabel;
    @FindBy(xpath = "(//p[@class='count-container-item amount amount--has-pages'])[1]")
    private WebElement searchResultValue;
    @FindBy(id = "sorter")
    private WebElement sortByMenu;
    @FindBy(xpath = "//div[@class='category-description']/p/strong")
    private WebElement sportSupplementsTitleInFooterSection;
    @FindBy(xpath = "(//div[@class='category-description']/p[2])[2]")
    private WebElement sportSupplementsDescriptionInFooterSection;
    @FindBy(xpath = "//div[@class='category-info']")
    private WebElement sportSupplementsFooterSection;
    @FindBy(xpath = "//*[@id=\"algolia-searchbox\"]/button")
    private WebElement searchBtn;
    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchField;
    @FindBy(xpath = "(//li[@class='item pages-item-previous']/a)[2]")
    private WebElement previousPageBtn;
    @FindBy(xpath = "(//li[@class='item pages-item-next']/a)[2]")
    private WebElement NextPageBtn;
    @FindBy(xpath = "(//ul[@class='items pages-items']//li[3])[2]")
    private WebElement pageTwoBtn;
    @FindBy(xpath = "(//ul[@class='items pages-items']//li[4])[2]")
    private WebElement pageThreeBtn;
    @FindBy(xpath = "(//a[@class='action  previous arrow-disable'])[2]")
    private WebElement disabledPreviousPageBtn;
    @FindBy(xpath = "(//form[@class='am-ranges'])[1]/ol/li/a/span[1]")
    private List<WebElement> formFiltrationSection;
    @FindBy(xpath = "(//a[@title='See All'])[1]")
    private WebElement seeAllBtnInFormSection;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[2]/a")
    private WebElement sportSupplementsMainMenu;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[1]")
    private WebElement shopeByMenu;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[1]/a")
    private WebElement sportsSupplementsOption;
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

    //Getter Methods
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
        return pageBottomBlocksList;
    }
    public WebElement getSportSupplementsCategoryImage() {
        return sportSupplementsCategoryImage;
    }
    public WebElement getSportSupplementsTitleInCategoryImage() {
        return sportSupplementsTitleInSportSupplementsCategoryImage;
    }
    public WebElement getShopeByMenu() {
        return shopeByMenu;
    }
    public WebElement getSportsSupplementsOption() {
        return sportsSupplementsOption;
    }

    public WebElement getParagraphInSportSupplementsCategoryImage() {
        return paragraphInInSportSupplementsCategoryImage;
    }
    public List<WebElement> getMainBannersInTheSportSupplementsScreen() {
        return mainBannersInTheSportSupplementsScreen;
    }
    public WebElement getSportSupplementsCategoryInHomePage() {
        return sportSupplementsCategoryInHomePage;
    }
    public WebElement getResultLabel() {
        return resultLabel;
    }
    public WebElement getSearchResultValue() {
        DataHelperAndWait.waitToBeVisible(searchResultValue,2,webDriver);
        return searchResultValue;
    }
    public WebElement getSortByLabel() {
        return sortByLabel;
    }
    public WebElement getSortByMenu() {
        return sortByMenu;
    }
    public WebElement getMainBannersInTheSportSupplementsSection() {
        DataHelperAndWait.waitToBeVisible(mainBannersInTheSportSupplementsSection,5,webDriver);
        return mainBannersInTheSportSupplementsSection;
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
        return sportSupplementsFooterSection;
    }
    public WebElement getDisabledPreviousPageBtn() {
        DataHelperAndWait.waitToBeVisible(disabledPreviousPageBtn,3,webDriver);
        return disabledPreviousPageBtn;
    }
    public WebElement getCountryList() {
        return countryList;
    }
    public WebElement getPreviousPageBtn() {
        return previousPageBtn;
    }
    public WebElement getNextPageBtn() {
        DataHelperAndWait.waitToBeVisible(NextPageBtn,5,webDriver);
        return NextPageBtn;
    }
    public WebElement getPageTwoBtn() {
        return pageTwoBtn;
    }
    public WebElement getPageThreeBtn() {
        return pageThreeBtn;
    }
    public List<WebElement> getFormFiltrationSection() {
        return formFiltrationSection;
    }
    public WebElement getSportSupplementsMainMenu() {
        return sportSupplementsMainMenu;
    }
    //Define the main actions we need to execute our TCs
    public void switchToAECountry() {
        try {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 3,webDriver);
            this.aeCountry.click();
        } catch (Exception e) {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 5,webDriver);
            this.aeCountry.click();
        }
    }
    public void clickOnBreadcrumbHomePage() {
        DataHelperAndWait.waitToBeVisible(homeBreadcrumbs, 6,webDriver);
        this.homeBreadcrumbs.click();
    }

    public void clickOnSearchBtn() {
        DataHelperAndWait.waitToBeClickable(searchBtn, 3,webDriver);
        searchBtn.click();
    }

    public void fillInSearchField(String text) {
        DataHelperAndWait.waitToBeVisible(searchField, 3,webDriver);
        searchField.sendKeys(text);
    }

    public void navigateToPage2() {
        DataHelperAndWait.waitToBeVisible(pageTwoBtn, 5,webDriver);
        pageTwoBtn.click();
    }

    public void navigateToPage3() {
        DataHelperAndWait.waitToBeVisible(pageThreeBtn, 3,webDriver);
        pageThreeBtn.click();
    }

    public void clickOnPreviousPageBtn() {
        try{
        DataHelperAndWait.waitToBeVisible(previousPageBtn, 5,webDriver);
        previousPageBtn.click();}
        catch(Exception e){        DataHelperAndWait.waitToBeVisible(previousPageBtn, 2,webDriver);
            previousPageBtn.click();}
    }

    public void clickOnNextPageBtn() {
        try{
        DataHelperAndWait.waitToBeVisible(NextPageBtn, 5,webDriver);
        NextPageBtn.click();}
        catch(Exception e){        DataHelperAndWait.waitToBeVisible(NextPageBtn, 5,webDriver);
            NextPageBtn.click();}
    }

    public void clickOnSeeAllBtnInFormSection() {
        DataHelperAndWait.waitToBeVisible(seeAllBtnInFormSection, 5,webDriver);
        seeAllBtnInFormSection.click();
    }
    public WebElement getHomeBreadcrumbs() {
        DataHelperAndWait.waitToBeVisible(homeBreadcrumbs,3,webDriver);
        return homeBreadcrumbs;
    }
    public void navigate(){webDriver.navigate().to(siteURL +aeDomain+sportSupplementsUrl);}

}
