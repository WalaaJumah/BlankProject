/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.sports_category_pages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.megaMenuPages.MegaMenuPage;

import java.io.IOException;

@Getter
public class SportsCategoryPage extends BasePage {
    public SportsCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(id = "Trendscontainer_title")
    private WebElement trendingInSportsSectionTitle;
    @FindBy(id = "Trendscontainer")
    private WebElement trendingInSportsSection;
        @FindBy(id = "Trendscontainer")
    private WebElement trendingInSportsArabicSection;

    @FindBy(xpath = "(//div[@id='TrendItem_0']/a)[1]")
    private WebElement mensApparelCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_1']/a)[1]")
    private WebElement womenApparelCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_2']/a)[1]")
    private WebElement shakersAndBottelsCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_3']/a)[1]")
    private WebElement swimmingCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_4']/a)[2]")
    private WebElement boxingAndMMACategory;
    @FindBy(xpath = "(//div[@id='TrendItem_5']/a)[2]")
    private WebElement capsAndHatCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_6']/a)[2]")
    private WebElement bagsAndBackpacksCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_7']/a)[2]")
    private WebElement sportsTechCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_8']/a)[2]")
    private WebElement MensPersonalCareCategory;
    @FindBy(id = "ControllersrtArrow_trends")
    private WebElement nextIconInShopByHealthNeedSection;
    @FindBy(id = "AdvertiseLink03")
    private WebElement menCategory;
    @FindBy(id = "AdvertiseLink13")
    private WebElement womenCategory;
    @FindBy(id = "AdvertiseContainer4")
    private WebElement sportsTechMainCategory;
    @FindBy(id = "AdvertiseLink05")
    private WebElement kidsCategory;
    @FindBy(id = "AdvertiseLink15")
    private WebElement sportsCategory;
    @FindBy(id = "CategoryProductsTitle_6")
    private WebElement recommendedProductsTitleSection;
    @FindBy(id = "Swiper_6")
    private WebElement recommendedProductsSection;
    public void clickOnSportsMainMenu() throws IOException {
        Actions actions = new Actions(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsMenu(), webDriver);
        actions.moveToElement(megaMenuPage.getSportsMenu()).perform();
        DataHelperAndWait.clickOnElement(megaMenuPage.getSportsMenu(), webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
    public void navigateToSportsPage() throws IOException {
        try {
            webDriver.navigate().to(BaseURL + sportsUrl);
            DataHelperAndWait.waitForUrlContains(sportsUrl, webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
        catch(Exception e){
            webDriver.navigate().to(BaseURL + sportsUrl);
            DataHelperAndWait.waitForUrlContains(sportsUrl, webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }
    public void clickOnCapsAndHatsCategory() {

        do {
            DataHelperAndWait.clickOnElement(nextIconInShopByHealthNeedSection,webDriver);
        }
        while (!capsAndHatCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(capsAndHatCategory, webDriver);
    }
      public void clickOnBagsAndBackpacksCategory() {

        do {
            DataHelperAndWait.clickOnElement(nextIconInShopByHealthNeedSection,webDriver);
        }
        while (!bagsAndBackpacksCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(bagsAndBackpacksCategory, webDriver);
    }
      public void clickOnSportsTechCategory() {

        do {
            DataHelperAndWait.clickOnElement(nextIconInShopByHealthNeedSection,webDriver);
        }
        while (!sportsTechCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(sportsTechCategory, webDriver);
    }
      public void clickOnMensPersonalCareCategory() {

        do {
            DataHelperAndWait.clickOnElement(nextIconInShopByHealthNeedSection,webDriver);
        }
        while (!getMensPersonalCareCategory().isDisplayed());
        DataHelperAndWait.clickOnElement(getMensPersonalCareCategory(), webDriver);
    }
    public void clickOnSportsFromShopByMenu() throws IOException {
        Actions actions = new Actions(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(), webDriver);
            actions.moveToElement(megaMenuPage.getShopByMenu()).perform();

//            DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsMenuFromShopBy(), webDriver);
            actions.moveToElement(megaMenuPage.getSportsMenuFromShopBy()).click().perform();
            verifyTheDisplayedPageDoesNotHaveErrors();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(megaMenuPage.getShopByMenu(), webDriver);
            actions.moveToElement(megaMenuPage.getShopByMenu()).perform();

//            DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsMenuFromShopBy(), webDriver);
            actions.moveToElement(megaMenuPage.getSportsMenuFromShopBy()).click().perform();
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }
}
