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
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[1]")
    private WebElement trendingInSportsSectionTitle;
    @FindBy(xpath = "//div[@class='swiper-container swiper-container-horizontal trending']")
    private WebElement trendingInSportsSection;
    @FindBy(xpath = "(//div[@class='product-img']/a)[6]")
    private WebElement mensApparelCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[7]")
    private WebElement womenApparelCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[8]")
    private WebElement shakersAndBottelsCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[9]")
    private WebElement swimmingCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[10]")
    private WebElement boxingAndMMACategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[11]")
    private WebElement capsAndHatCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[12]")
    private WebElement bagsAndBackpacksCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[13]")
    private WebElement sportsTechCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[14]")
    private WebElement MensPersonalCareCategory;
    @FindBy(xpath = "//div[@class='trending-swiper-button-next']")
    private WebElement nextIconInShopByHealthNeedSection;
    @FindBy(xpath = "(//ul[@class='clearfix']/li[1]/a)[1]")
    private WebElement menCategory;
    @FindBy(xpath = "(//ul[@class='clearfix']/li[2]/a)[1]")
    private WebElement womenCategory;
    @FindBy(xpath = "(//ul[@class='clearfix']/li[1]/a)[2]")
    private WebElement sportsTechMainCategory;
    @FindBy(xpath = "(//ul[@class='clearfix']/li[1]/a)[3]")
    private WebElement kidsCategory;
    @FindBy(xpath = "(//ul[@class='clearfix']/li[2]/a)[2]")
    private WebElement sportsCategory;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[2]")
    private WebElement recommendedProductsTitleSection;
    @FindBy(xpath = "(//div[@class='swiper-wrapper'])[2]")
    private WebElement recommendedProductsSection;
    public void clickOnSportsMainMenu() {
        Actions actions = new Actions(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        DataHelperAndWait.waitToBeVisible(megaMenuPage.getSportsMainMenu(), webDriver);
        actions.moveToElement(megaMenuPage.getSportsMainMenu()).perform();
        DataHelperAndWait.clickOnElement(megaMenuPage.getSportsMainMenu(), webDriver);
    }
    public void navigateToSportsPage() throws IOException {
        webDriver.navigate().to(BaseURL + sportsUrl);
        DataHelperAndWait.waitForUrlContains(sportsUrl, webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
    public void clickOnCapsAndHatsCategory() {

        do {
            DataHelperAndWait.clickOnElement(capsAndHatCategory,webDriver);
        }
        while (!capsAndHatCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(capsAndHatCategory, webDriver);
    }
      public void clickOnBagsAndBackpacksCategory() {

        do {
            DataHelperAndWait.clickOnElement(bagsAndBackpacksCategory,webDriver);
        }
        while (!bagsAndBackpacksCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(bagsAndBackpacksCategory, webDriver);
    }
      public void clickOnSportsTechCategory() {

        do {
            DataHelperAndWait.clickOnElement(sportsTechCategory,webDriver);
        }
        while (!sportsTechCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(sportsTechCategory, webDriver);
    }
      public void clickOnMensPersonalCareCategory() {

        do {
            DataHelperAndWait.clickOnElement(getMensPersonalCareCategory(),webDriver);
        }
        while (!getMensPersonalCareCategory().isDisplayed());
        DataHelperAndWait.clickOnElement(getMensPersonalCareCategory(), webDriver);
    }

}
