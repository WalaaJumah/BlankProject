/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.vitamins_and_health_category_pages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class VitaminsAndHealthCategoryPage extends BasePage {
    public VitaminsAndHealthCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[1]")
    private WebElement fishOilAndOmegasCategory;
    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[2]")
    private WebElement multiVitaminsCategory;
    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[3]")
    private WebElement vitaminsAZCategory;
    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[4]")
    private WebElement mineralsCategory;
    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[5]")
    private WebElement antioxidantsCategory;
    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[6]")
    private WebElement superFoodsCategory;
    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[7]")
    private WebElement collagenCategory;
    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[8]")
    private WebElement melatoninCategory;
    @FindBy(xpath = "(//ul[@class='trending-products']/li//a)[1]")
    private WebElement tumericCategory;
    @FindBy(xpath = "(//ul[@class='trending-products']/li//a)[2]")
    private WebElement dandelionCategory;
    @FindBy(xpath = "(//ul[@class='trending-products']/li//a)[3]")
    private WebElement ginsengCategory;
    @FindBy(xpath = "(//ul[@class='trending-products']/li//a)[4]")
    private WebElement milkThistleCategory;
    @FindBy(xpath = "(//ul[@class='trending-products']/li//a)[5]")
    private WebElement alfalfaCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='0']//a)[1]")
    private WebElement beautyCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='1']//a)[1]")
    private WebElement boneAndJointCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='2']//a)[1]")
    private WebElement brainSupportCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='3']//a)[1]")
    private WebElement detoxAndLiverSupportCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='4']//a)[1]")
    private WebElement digestiveSupportCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='5']//a)[1]")
    private WebElement energyFormulasCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='6']//a)[1]")
    private WebElement hairAndSkinAndNailsCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='7']//a)[1]")
    private WebElement heartHealthCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='8']//a)[1]")
    private WebElement immunitySupportCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='9']//a)[1]")
    private WebElement kidsHealthCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='10']//a)[2]")
    private WebElement mensHealthCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='11']//a)[2]")
    private WebElement sexualHealthCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='12']//a)[2]")
    private WebElement sleepSupportCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='13']//a)[2]")
    private WebElement dietWeightManagementCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='14']//a)[2]")
    private WebElement womenHealthCategory;
    @FindBy(xpath = "//div[@class='trending-swiper-button-next']")
    private WebElement nextIconInShopByHealthNeedSection;
    @FindBy(xpath = "((//div[@class='swiper-container swiper-product-slider top-seller-slider swiper-container-horizontal'])[5]//a)[1]")
    private WebElement antioxodantsSection;
    @FindBy(xpath = "((//div[@class='swiper-container swiper-product-slider top-seller-slider swiper-container-horizontal'])[6]//a)[1]")
    private WebElement superFoodsSection;
    @FindBy(xpath = "((//div[@class='swiper-container swiper-product-slider top-seller-slider swiper-container-horizontal'])[7]//a)[1]")
    private WebElement melatoninSection;
    @FindBy(xpath = "((//div[@class='swiper-container swiper-product-slider top-seller-slider swiper-container-horizontal'])[7]//a)[1]")
    private WebElement collagenSection;

    @FindBy(xpath = "(//ul/li/a[@class='view-all'])[1]")
    private WebElement viewAllFishOil;
    @FindBy(xpath = "(//ul/li/a[@class='view-all'])[2]")
    private WebElement viewAllMultivitamins;
   @FindBy(xpath = "(//ul/li/a[@class='view-all'])[3]")
    private WebElement viewAllVitaminsA_Z;
   @FindBy(xpath = "(//ul/li/a[@class='view-all'])[4]")
    private WebElement viewAllMinerals;
   @FindBy(xpath = "(//ul/li/a[@class='view-all'])[5]")
    private WebElement viewAllAntioxidants;
   @FindBy(xpath = "(//ul/li/a[@class='view-all'])[6]")
    private WebElement viewAllSuperFoods;
   @FindBy(xpath = "(//ul/li/a[@class='view-all'])[7]")
    private WebElement viewAllMelatonin;
   @FindBy(xpath = "(//ul/li/a[@class='view-all'])[7]")
    private WebElement viewAllCollagen;


    public void clickOnNextIconInShopByHealthNeedSection() {

        DataHelperAndWait.waitToBeClickable(this.nextIconInShopByHealthNeedSection, webDriver);
        this.nextIconInShopByHealthNeedSection.click();
    }

    public void navigateToVitaminsAndHealthPage() {
        webDriver.navigate().to(BaseURL + healthVitaminsUrl);
        DataHelperAndWait.waitForUrlContains(healthVitaminsUrl, webDriver);
    }

    public void clickOnHairAndSkinAndNailsCategory() {

        do {
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while (!hairAndSkinAndNailsCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(hairAndSkinAndNailsCategory, webDriver);
    }

    public void clickOnEnergyFormulasCategoryCategory() {

        do {
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while (!energyFormulasCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(energyFormulasCategory, webDriver);
    }

    public void clickOnImmunitySupportCategoryCategory() {

        do {
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while (!immunitySupportCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(immunitySupportCategory, webDriver);
    }

    public void clickOnKidsHealthCategoryCategory() {

        do {
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while (!kidsHealthCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(kidsHealthCategory, webDriver);
    }


    public void clickOnHeartHealthCategory() {
        do {
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while (!heartHealthCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(heartHealthCategory, webDriver);
    }

    public void clickOnMensHealthCategory() {
        do {
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while (!mensHealthCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(mensHealthCategory, webDriver);
    }

    public void clickOnSexualHealthCategory() {
        do {
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while (!sexualHealthCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(sexualHealthCategory, webDriver);
    }

    public void clickOnSleepSupportCategory() {
        do {
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while (!sleepSupportCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(sleepSupportCategory, webDriver);
    }

    public void clickOnDietWeightManagementCategoryCategory() {
        do {
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while (!dietWeightManagementCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(dietWeightManagementCategory, webDriver);
    }

    public void clickOnWomenHealthCategoryCategoryCategory() {
        do {
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while (!womenHealthCategory.isDisplayed());
        DataHelperAndWait.clickOnElement(womenHealthCategory, webDriver);
    }


}
