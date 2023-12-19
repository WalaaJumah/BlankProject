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

import java.io.IOException;

@Getter
public class VitaminsAndHealthCategoryPage extends BasePage {
    public VitaminsAndHealthCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

//    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[1]")
    @FindBy(id = "ShopByCategoryItemtitle0")
    private WebElement fishOilAndOmegasCategory;
//    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[2]")
    @FindBy(id = "ShopByCategoryItemtitle1")
    private WebElement multiVitaminsCategory;
//    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[3]")
    @FindBy(id = "ShopByCategoryItemtitle2")
    private WebElement vitaminsAZCategory;
       @FindBy(id = "Swiper_6")
    private WebElement vitaminsAZSection;

//    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']//a[2])[4]")
    @FindBy(id = "ShopByCategoryItemtitle3")
    private WebElement mineralsCategory;
       @FindBy(id = "Swiper_7")
    private WebElement mineralsSection;

    @FindBy(id = "ShopByCategoryItemtitle4")
    private WebElement antioxidantsCategory;
    @FindBy(id = "ShopByCategoryItemtitle5")
    private WebElement superFoodsCategory;
    @FindBy(id = "ShopByCategoryItemtitle6")
    private WebElement collagenCategory;
    @FindBy(id = "ShopByCategoryItemtitle7")
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
    @FindBy(xpath = "(//div[@id='TrendItem_0']/a)[1]")
    private WebElement beautyCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_1']/a)[1]")
    private WebElement boneAndJointCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_2']/a)[1]")
    private WebElement brainSupportCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_3']/a)[1]")
    private WebElement detoxAndLiverSupportCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_4']/a)[1]")
    private WebElement digestiveSupportCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_5']/a)[1]")
    private WebElement energyFormulasCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_6']/a)[1]")
    private WebElement hairAndSkinAndNailsCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_7']/a)[1]")
    private WebElement heartHealthCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_8']/a)[1]")
    private WebElement immunitySupportCategory;
    @FindBy(xpath = "(//div[@id='TrendItem_9']/a)[1]")
    private WebElement kidsHealthCategory;
    @FindBy(xpath = "(//img[@id='TrendItemImg_10'])[2]")
    private WebElement mensHealthCategory;
    @FindBy(xpath = "(//img[@id='TrendItemImg_11'])[2]")
    private WebElement sexualHealthCategory;
    @FindBy(xpath = "(//img[@id='TrendItemImg_12'])[2]")
    private WebElement sleepSupportCategory;
    @FindBy(xpath = "(//img[@id='TrendItemImg_13'])[2]")
    private WebElement dietWeightManagementCategory;
    @FindBy(xpath = "(//img[@id='TrendItemImg_14'])[2]")
    private WebElement womenHealthCategory;
//    @FindBy(xpath = "//div[@class='trending-swiper-button-next']")
    @FindBy(id = "ControllersrtArrow_trends")
    private WebElement nextIconInShopByHealthNeedSection;
//    @FindBy(id = "tab-296-all296")
    @FindBy(xpath = "(//div[starts-with(@class,'swiper-wrapper')])[8]")
    private WebElement antioxodantsSection;
    @FindBy(xpath = "(//div[starts-with(@class,'swiper-wrapper')])[9]")
    private WebElement superFoodsSection;
    @FindBy(xpath = "(//div[starts-with(@class,'swiper swiper-initialized') and //div[starts-with(@class,'swiper-wrapper')]])[9]")
    private WebElement melatoninSection;
    @FindBy(xpath = "(//div[starts-with(@class,'swiper-wrapper')])[10]")
    private WebElement collagenSection;

    @FindBy(xpath = "//li[@id='OptionsContainerOptions_all5']/a")
    private WebElement viewAllFishOil;
    @FindBy(xpath = "//li[@id='OptionsContainerOptions_all5']/a")
    private WebElement viewAllMultivitamins;
   @FindBy(xpath = "//li[@id='OptionsContainerOptions_all6']/a")
    private WebElement viewAllVitaminsA_Z;
   @FindBy(xpath = "//li[@id='OptionsContainerOptions_all7']/a")
    private WebElement viewAllMinerals;
   @FindBy(xpath = "//li[@id='OptionsContainerOptions_all8']/a")
    private WebElement viewAllAntioxidants;
   @FindBy(xpath = "//li[@id='OptionsContainerOptions_all9']/a")
    private WebElement viewAllSuperFoods;
   @FindBy(xpath = "//li[@id='OptionsContainerOptions_all7']/a")
    private WebElement viewAllMelatonin;
   @FindBy(xpath = "//li[@id='OptionsContainerOptions_all11']/a")
    private WebElement viewAllCollagen;


    public void clickOnNextIconInShopByHealthNeedSection() {

        DataHelperAndWait.waitToBeClickable(this.nextIconInShopByHealthNeedSection, webDriver);
        this.nextIconInShopByHealthNeedSection.click();
    }

    public void navigateToVitaminsAndHealthPage() throws IOException {
        webDriver.navigate().to(BaseURL + healthVitaminsUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
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
            DataHelperAndWait.waitForTime(500);
        }
        while (!energyFormulasCategory.isDisplayed());
        DataHelperAndWait.waitToBeVisible(energyFormulasCategory, webDriver);
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
