package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.crypto.Data;
import java.util.List;

public class AeSportSupplementsCategoryPage {
    public AeSportSupplementsCategoryPage(WebDriver webDriver) {
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



    @FindBy(xpath = "(//div[@class='advertise-banner-3 imagewidgetclass'])[1]")
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

    @FindBy(id="sorter")
    private WebElement sortByMenu;



    @FindBy(xpath="//div[@class='category-description']/p/strong")
    private WebElement sportSupplementsTitleInFooterSection;
    @FindBy(xpath="(//div[@class='category-description']/p[2])[2]")
    private WebElement sportSupplementsDescriptionInFooterSection;
    @FindBy(xpath="//div[@class='category-info']")
    private WebElement sportSupplementsFooterSection;
    @FindBy(xpath = "//*[@id=\"algolia-searchbox\"]/button")
    private WebElement searchBtn;
    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchField;




    //Getter Methods
    public WebElement getSportSupplementsCategoryImage() {
        return sportSupplementsCategoryImage;
    }
    public WebElement getSportSupplementsTitleInCategoryImage() {
        return sportSupplementsTitleInSportSupplementsCategoryImage;
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
        return searchResultValue;
    }
    public WebElement getSortByLabel() {
        return sortByLabel;
    }
    public WebElement getSortByMenu() {
        return sortByMenu;
    }

    public WebElement getMainBannersInTheSportSupplementsSection() {
        return mainBannersInTheSportSupplementsSection;
    }
    public WebElement getSportSupplementsTitleInFooterSection() {
        return sportSupplementsTitleInFooterSection;
    }

    public WebElement getSportSupplementsDescriptionInFooterSection() {
        return sportSupplementsDescriptionInFooterSection;
    }

    public WebElement getSportSupplementsFooterSection() {
        return sportSupplementsFooterSection;
    }











    //Define the main actions we need to execute our TCs
    public void switchToAeCountry() {
        try {
            DataHelperAndWait.waitToBeVisible(countryList, 20);
            this.countryList.click();
            DataHelperAndWait.implicitWait(10);
            this.aeCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(countryList, 20);
            this.countryList.click();
            DataHelperAndWait.implicitWait(10);
            this.aeCountry.click();
        }
    }
    public void clickOnBreadcrumbHomePage() {
        DataHelperAndWait.waitToBeVisible(homeBreadcrumbs, 5);
        this.homeBreadcrumbs.click();
    }
    public void clickOnSearchBtn(){
        DataHelperAndWait.waitToBeClickable(searchBtn,5);
        searchBtn.click();
    }

    public void fillInSearchField(String text) {
        DataHelperAndWait.waitToBeVisible(searchField, 5);
        searchField.sendKeys(text);
    }
}
