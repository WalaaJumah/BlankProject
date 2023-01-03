package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AeVitaminsAndHealthCategoryPage extends BasePage {
    public AeVitaminsAndHealthCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //declare all locators related to the AeVitaminsAndHealthCategoryPage
    @FindBy(xpath = "(//a[@href='health-vitamins'])[3]")
    private WebElement vitaminsAndHealthCategoryInHomePage;
    @FindBy(xpath = "//*[@class='flex-control-nav flex-control-paging']/li/a")
    private List<WebElement> pagerOfRotatingSlider;
    @FindBy(xpath = "//div[@class='flex-viewport']")
    private WebElement bannerInRotatingSliderSection;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[2]")
    private WebElement herbalReferenceGuideTitle;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[3]")
    private WebElement shopByHealthNeedTitle;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[4]")
    private WebElement fishOilAndOmegasSectionTitle;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[5]")
    private WebElement multiVitaminsSectionTitle;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[6]")
    private WebElement vitaminsAZSectionTitle;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[7]")
    private WebElement mineralsSectionTitle;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[8]")
    private WebElement antioxidantsSectionTitle;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[9]")
    private WebElement superFoodSectionTitle;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[10]")
    private WebElement melatoninSectionTitle;
    @FindBy(xpath = "(//div[@class='trending-title']/h2)[11]")
    private WebElement collagenSectionTitle;
    @FindBy(xpath = "(//div[@class='masonry'])[1]")
    private WebElement fishOilAndOmegasSection;
    @FindBy(xpath = "(//div[@class='masonry'])[2]")
    private WebElement multiVitaminsSection;
    @FindBy(xpath = "(//div[@class='masonry'])[3]")
    private WebElement vitaminsAZSection;
    @FindBy(xpath = "(//div[@class='masonry'])[4]")
    private WebElement mineralsSection;
    @FindBy(xpath = "(//div[@class='masonry'])[5]")
    private WebElement antioxidantsSection;
    @FindBy(xpath = "(//div[@class='masonry'])[6]")
    private WebElement superFoodSection;
    @FindBy(xpath = "(//div[@class='masonry'])[7]")
    private WebElement melatoninSection;
    @FindBy(xpath = "(//div[@class='masonry'])[8]")
    private WebElement collagenSection;
    @FindBy(xpath = "//ul[@class='trending-products']//a")
    private List<WebElement> herbalReferenceGuideList;
    @FindBy(xpath = "//div[@class='category-description']")
    private WebElement fishOilAndOmegasFooterSection;
    @FindBy(xpath = "//div[@class='category-description']/p[1]")
    private WebElement fishOilAndOmegasFooterParagraph1;
    @FindBy(xpath = "//div[@class='category-description']/p[2]")
    private WebElement fishOilAndOmegasFooterParagraph2;
    @FindBy(xpath = "//div[@class='category-description']/p[3]")
    private WebElement fishOilAndOmegasFooterParagraph3;
    @FindBy(xpath = "//ul[@class='swiper-wrapper clearfix']/li/div/a[1]")
    private List<WebElement> shopByCategoryList;
    @FindBy(xpath = "(//div[@class='nutritious-right'])/a[1]")
    private WebElement firstSideBanner;
    @FindBy(xpath = "(//div[@class='nutritious-right'])/a[2]")
    private WebElement secondSideBanner;
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
    @FindBy(xpath = "(//i[@class='fas fa-chevron-right'])[3]")
    private WebElement nextIconInFishOilAndOmegasSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-right'])[4]")
    private WebElement nextIconInMultiVitaminsSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-right'])[5]")
    private WebElement nextIconInVitaminsAZSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-right'])[6]")
    private WebElement nextIconInMineralsSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-right'])[7]")
    private WebElement nextIconInAntioxidantsSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-right'])[8]")
    private WebElement nextIconInSuperFoodSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-right'])[9]")
    private WebElement nextIconInMelatoninSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-right'])[10]")
    private WebElement nextIconInCollagenSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-left'])[3]")
    private WebElement previousIconInFishOilAndOmegasSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-left'])[4]")
    private WebElement previousIconInMultiVitaminsSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-left'])[5]")
    private WebElement previousIconInVitaminsAZSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-left'])[6]")
    private WebElement previousIconInMineralsSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-left'])[7]")
    private WebElement previousIconInAntioxidantsSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-left'])[8]")
    private WebElement previousIconInSuperFoodSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-left'])[9]")
    private WebElement previousIconInMelatoninSection;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-left'])[10]")
    private WebElement previousIconInCollagenSection;
    @FindBy(xpath = "(//div[@class='swiper-slide'])[13]")
    private WebElement productCardInFishOilAndOmegasSection;
    @FindBy(xpath = "(//div[@class='swiper-slide'])[19]")
    private WebElement productCardInMultiVitaminsSection;
    @FindBy(xpath = "(//div[@class='swiper-slide'])[30]")
    private WebElement productCardIVitaminsAZSection;
    @FindBy(xpath = "(//div[@class='swiper-slide'])[25]")
    private WebElement productCardInMineralsSection;
    @FindBy(css = "#tab-296-all296 > div.swiper-container.swiper-product-slider.top-seller-slider.swiper-container-horizontal > div > div:nth-child(3) > div > a")
    private WebElement productCardInAntioxidantsSection;
    @FindBy(xpath = "(//div[@class='inner-seller-prod wp-id-20305'])[1]")
    private WebElement productCardInSuperFoodSection;
    @FindBy(xpath = "(//div[@class='inner-seller-prod wp-id-24052'])[1]")
    private WebElement productCardInMelatoninSection;
    @FindBy(xpath = "(//div[@class='inner-seller-prod wp-id-22491'])[1]")
    private WebElement productCardInCollagenSection;
    @FindBy(xpath = "//div[@style='transform: translate3d(0px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement fishOilAndOmegasSectionDefaultPosition;
    @FindBy(xpath = "//div[@style='transform: translate3d(0px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement multiVitaminsSectionDefaultPosition;
    @FindBy(xpath = "//div[@style='transform: translate3d(-253px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement fishOilAndOmegasSectionPositionAfterClickingOnNextIcon;
    @FindBy(xpath = "(//a[@class='view-all'])[1]")
    private WebElement viewAllInFishOilAndOmegasSection;
    @FindBy(xpath = "(//a[@class='view-all'])[2]")
    private WebElement viewAllInMultiVitaminsSection;
    @FindBy(xpath = "(//a[@class='view-all'])[3]")
    private WebElement viewAllInVitaminsAZSection;
    @FindBy(xpath = "(//a[@class='view-all'])[4]")
    private WebElement viewAllInMineralsSection;
    @FindBy(xpath = "(//a[@class='view-all'])[5]")
    private WebElement viewAllInAntioxidantsSection;
    @FindBy(xpath = "(//a[@class='view-all'])[6]")
    private WebElement viewAllInSuperFoodSection;
    @FindBy(xpath = "(//a[@class='view-all'])[7]")
    private WebElement viewAllInMelatoninSection;
    @FindBy(xpath = "(//a[@class='view-all'])[8]")
    private WebElement viewAllInCollagenSection;
    @FindBy(xpath = "//div[@class='trending-swiper-button-prev']")
    private WebElement previousIconInShopByHealthNeedSection;
    @FindBy(xpath = "(//li[@class='item pages-item-previous'])[2]")
    private WebElement previousPageIcon;
    @FindBy(id = "narrow-by-list")
    private WebElement filtrationSection;
    @FindBy(xpath = "//div[@class='trending-sporter trending-sporter-crousal']")
    private WebElement ShopByHealthNeedSection;

    //Getter Methods
    public WebElement getVitaminsAndHealthCategoryInHomePage() {
        DataHelperAndWait.waitToBeVisible(vitaminsAndHealthCategoryInHomePage,5,webDriver);
        return vitaminsAndHealthCategoryInHomePage;
    }
    public WebElement getPreviousIconInSuperFoodSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInSuperFoodSection,5,webDriver);
        return previousIconInSuperFoodSection;
    }
    public WebElement getProductCardInCollagenSection() {
        DataHelperAndWait.waitToBeVisible(productCardInCollagenSection,5,webDriver);
        return productCardInCollagenSection;
    }
    public WebElement getViewAllInCollagenSection() {
        return viewAllInCollagenSection;
    }
    public WebElement getNextIconInCollagenSection() {
        DataHelperAndWait.waitToBeVisible(nextIconInCollagenSection,5,webDriver);
        return nextIconInCollagenSection;
    }
    public WebElement getMelatoninSectionTitle() {
        return melatoninSectionTitle;
    }
    public WebElement getSuperFoodSectionTitle() {
        return superFoodSectionTitle;
    }
    public WebElement getPreviousIconInCollagenSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInCollagenSection,5,webDriver);
        return previousIconInCollagenSection;
    }
    public WebElement getViewAllInMelatoninSection() {
        return viewAllInMelatoninSection;
    }
    public WebElement getNextIconInMelatoninSection() {
        DataHelperAndWait.waitToBeVisible(nextIconInMelatoninSection,5,webDriver);
        return nextIconInMelatoninSection;
    }
    public WebElement getCollagenSectionTitle() {
        return collagenSectionTitle;
    }

    public List<WebElement> getPagerOfRotatingSlider() {
        return pagerOfRotatingSlider;
    }

    public WebElement getBannerInRotatingSliderSection() {
        return bannerInRotatingSliderSection;
    }

    public WebElement getFirstSideBanner() {
        DataHelperAndWait.waitToBeVisible(firstSideBanner,3,webDriver);
        return firstSideBanner;
    }
    public WebElement getMineralsSectionTitle() {
        return mineralsSectionTitle;
    }
    public WebElement getSuperFoodSection() {
        return superFoodSection;
    }
    public WebElement getMelatoninSection() {
        return melatoninSection;
    }
    public WebElement getPreviousIconInMelatoninSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInMelatoninSection,5,webDriver);
        return previousIconInMelatoninSection;
    }
    public WebElement getProductCardInMelatoninSection() {
        DataHelperAndWait.waitToBeVisible(productCardInMelatoninSection,5,webDriver);
        return productCardInMelatoninSection;
    }
    public WebElement getNextIconInSuperFoodSection() {
        DataHelperAndWait.waitToBeVisible(nextIconInSuperFoodSection,5,webDriver);
        return nextIconInSuperFoodSection;
    }
    public WebElement getAntioxidantsSectionTitle() {
        return antioxidantsSectionTitle;
    }
    public WebElement getNextIconInAntioxidantsSection() {
        DataHelperAndWait.waitToBeVisible(nextIconInAntioxidantsSection,5,webDriver);
        return nextIconInAntioxidantsSection;
    }
    public WebElement getAntioxidantsSection() {
        return antioxidantsSection;
    }
    public WebElement getViewAllInAntioxidantsSection() {
        return viewAllInAntioxidantsSection;
    }

    public WebElement getSecondSideBanner() {
        return secondSideBanner;
    }

    public List<WebElement> getShopByCategoryList() {
        return shopByCategoryList;
    }
    public WebElement getPreviousIconInVitaminsAZSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInVitaminsAZSection,5,webDriver);
        return previousIconInVitaminsAZSection;
    }
    public WebElement getProductCardInMineralsSection() {
        return productCardInMineralsSection;
    }
    public WebElement getProductCardInAntioxidantsSection() {
        DataHelperAndWait.waitToBeVisible(productCardInAntioxidantsSection,5,webDriver);
        return productCardInAntioxidantsSection;
    }
    public WebElement getPreviousIconInAntioxidantsSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInAntioxidantsSection,5,webDriver);
        return previousIconInAntioxidantsSection;
    }
    public WebElement getMineralsSection() {
        return mineralsSection;
    }
    public WebElement getFishOilAndOmegasFooterSection() {
        DataHelperAndWait.waitToBeVisible(fishOilAndOmegasFooterSection,5,webDriver);
        return fishOilAndOmegasFooterSection;
    }
    public WebElement getViewAllInSuperFoodSection() {
        return viewAllInSuperFoodSection;
    }
    public WebElement getNextIconInMineralsSection() {
        DataHelperAndWait.waitToBeVisible(nextIconInMineralsSection,5,webDriver);
        return nextIconInMineralsSection;
    }
    public WebElement getProductCardInSuperFoodSection() {
        DataHelperAndWait.waitToBeVisible(productCardInSuperFoodSection,5,webDriver);
        return productCardInSuperFoodSection;
    }

    public WebElement getFishOilAndOmegasFooterParagraph1() {
        return fishOilAndOmegasFooterParagraph1;
    }

    public WebElement getFishOilAndOmegasFooterParagraph2() {
        return fishOilAndOmegasFooterParagraph2;
    }

    public WebElement getFishOilAndOmegasFooterParagraph3() {
        return fishOilAndOmegasFooterParagraph3;
    }

    public WebElement getHerbalReferenceGuideTitle() {
        return herbalReferenceGuideTitle;
    }
    public WebElement getProductCardIVitaminsAZSection() {
        return productCardIVitaminsAZSection;
    }
    public WebElement getPreviousIconInMineralsSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInMineralsSection,5,webDriver);
        return previousIconInMineralsSection;
    }
    public List<WebElement> getHerbalReferenceGuideList() {
        return herbalReferenceGuideList;
    }
    public WebElement getViewAllInMineralsSection() {
        return viewAllInMineralsSection;
    }

    public WebElement getShopByHealthNeedTitle() {
        return shopByHealthNeedTitle;
    }
    public WebElement getMultiVitaminsSectionTitle() {
        return multiVitaminsSectionTitle;
    }
    public WebElement getNextIconInVitaminsAZSection() {
        DataHelperAndWait.waitToBeVisible(nextIconInVitaminsAZSection,5,webDriver);
        return nextIconInVitaminsAZSection;
    }
    public WebElement getViewAllInMultiVitaminsSection() {
        return viewAllInMultiVitaminsSection;
    }
    public WebElement getViewAllInVitaminsAZSection() {
        return viewAllInVitaminsAZSection;
    }
    public WebElement getVitaminsAZSectionTitle() {
        return vitaminsAZSectionTitle;
    }
    public WebElement getVitaminsAZSection() {
        return vitaminsAZSection;
    }

    public WebElement getBeautyCategory() {
        DataHelperAndWait.waitToBeVisible(beautyCategory,5,webDriver);
        return beautyCategory;
    }

    public WebElement getBoneAndJointCategory() {
        return boneAndJointCategory;
    }

    public WebElement getBrainSupportCategory() {
        DataHelperAndWait.waitToBeVisible(brainSupportCategory,3,webDriver);
        return brainSupportCategory;
    }

    public WebElement getDetoxAndLiverSupportCategory() {
        DataHelperAndWait.waitToBeVisible(detoxAndLiverSupportCategory,3,webDriver);
        return detoxAndLiverSupportCategory;
    }
    public WebElement getCollagenSection() {
        return collagenSection;
    }

    public WebElement getDigestiveSupportCategory() {
        DataHelperAndWait.waitToBeVisible(digestiveSupportCategory,3,webDriver);
        return digestiveSupportCategory;
    }

    public WebElement getEnergyFormulasCategory() {
        DataHelperAndWait.waitToBeVisible(energyFormulasCategory,3,webDriver);
        return energyFormulasCategory;
    }

    public WebElement getHairAndSkinAndNailsCategory() {
        DataHelperAndWait.waitToBeVisible(hairAndSkinAndNailsCategory,3,webDriver);
        return hairAndSkinAndNailsCategory;
    }

    public WebElement getHeartHealthCategory() {
        DataHelperAndWait.waitToBeVisible(heartHealthCategory,3,webDriver);
        return heartHealthCategory;
    }

    public WebElement getImmunitySupportCategory() {
        do{
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while(!immunitySupportCategory.isDisplayed());
        DataHelperAndWait.waitToBeVisible(immunitySupportCategory,5,webDriver);
        return immunitySupportCategory;
    }
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        DataHelperAndWait.waitToBeVisible(immunitySupportCategory,5,webDriver);
//        return immunitySupportCategory;


    public WebElement getKidsHealthCategory() {
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(kidsHealthCategory,3,webDriver);
        return kidsHealthCategory;
    }
    public WebElement getMultiVitaminsSection() {
        return multiVitaminsSection;
    }

    public WebElement getMensHealthCategory() {
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(mensHealthCategory,3,webDriver);
        return mensHealthCategory;
    }

    public WebElement getSexualHealthCategory() {
        DataHelperAndWait.waitToBeVisible(sexualHealthCategory,3,webDriver);
        return sexualHealthCategory;
    }

    public WebElement getSleepSupportCategory() {
        DataHelperAndWait.waitToBeVisible(sleepSupportCategory,3,webDriver);
        return sleepSupportCategory;
    }

    public WebElement getDietWeightManagementCategory() {
        DataHelperAndWait.waitToBeVisible(dietWeightManagementCategory,3,webDriver);
        return dietWeightManagementCategory;
    }

    public WebElement getWomenHealthCategory() {
        DataHelperAndWait.waitToBeVisible(womenHealthCategory,3,webDriver);
        return womenHealthCategory;
    }

    public WebElement getNextIconInShopByHealthNeedSection() {
        return nextIconInShopByHealthNeedSection;
    }

    public WebElement getPreviousPageIcon() {
        return previousPageIcon;
    }

    public WebElement getShopByHealthNeedSection() {
        return ShopByHealthNeedSection;
    }

    public WebElement getFiltrationSection() {
        DataHelperAndWait.waitToBeVisible(filtrationSection,5,webDriver);
        return filtrationSection;
    }

    public WebElement getPreviousIconInShopByHealthNeedSection() {
        return previousIconInShopByHealthNeedSection;
    }
    public WebElement getPreviousIconInMultiVitaminsSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInMultiVitaminsSection,5,webDriver);
        return previousIconInMultiVitaminsSection;
    }

    public WebElement getFishOilAndOmegasSectionTitle() {
        return fishOilAndOmegasSectionTitle;
    }

    public WebElement getFishOilAndOmegasSection() {
        return fishOilAndOmegasSection;
    }

    public WebElement getNextIconInFishOilAndOmegasSection() {
        try{
        DataHelperAndWait.waitToBeVisible(nextIconInFishOilAndOmegasSection,5,webDriver);
        return nextIconInFishOilAndOmegasSection;}
        catch(Exception e){
            DataHelperAndWait.waitToBeVisible(nextIconInFishOilAndOmegasSection,5,webDriver);
            return nextIconInFishOilAndOmegasSection;
        }
    }

    public WebElement getPreviousIconInFishOilAndOmegasSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInFishOilAndOmegasSection,5,webDriver);
        return previousIconInFishOilAndOmegasSection;
    }
    public WebElement getViewAllInFishOilAndOmegasSection() {
        return viewAllInFishOilAndOmegasSection;
    }
    public WebElement getProductCardInFishOilAndOmegasSection() {
        return productCardInFishOilAndOmegasSection;
    }
    public WebElement getFishOilAndOmegasSectionDefaultPosition() {
        DataHelperAndWait.waitToBeVisible(fishOilAndOmegasSectionDefaultPosition,5,webDriver);
        return fishOilAndOmegasSectionDefaultPosition;
    }
    public WebElement getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon() {
        DataHelperAndWait.waitToBeVisible(fishOilAndOmegasSectionPositionAfterClickingOnNextIcon,5,webDriver);
        return fishOilAndOmegasSectionPositionAfterClickingOnNextIcon;
    }
    public WebElement getProductCardInMultiVitaminsSection() {
        return productCardInMultiVitaminsSection;
    }
    public WebElement getNextIconInMultiVitaminsSection() {
        DataHelperAndWait.waitToBeVisible(nextIconInMultiVitaminsSection,5,webDriver);
        return nextIconInMultiVitaminsSection;
    }
    public WebElement getMultiVitaminsSectionDefaultPosition() {
        DataHelperAndWait.waitToBeVisible(multiVitaminsSectionDefaultPosition,5,webDriver);
        return multiVitaminsSectionDefaultPosition;
    }

    //Define the main actions we need to execute our TCs
    public void clickOnNextIconInShopByHealthNeedSection() {
//        try {
            DataHelperAndWait.waitToBeClickable(this.nextIconInShopByHealthNeedSection, 5,webDriver);
            this.nextIconInShopByHealthNeedSection.click();
//        } catch (Exception e) {
//            DataHelperAndWait.waitToBeClickable(this.nextIconInShopByHealthNeedSection, 3,webDriver);
//            this.nextIconInShopByHealthNeedSection.click();
//        }
    }

    public void clickOnPreviousIconInShopByHealthNeedSection() {
        try {
            DataHelperAndWait.waitToBeClickable(this.previousIconInShopByHealthNeedSection, 5,webDriver);
            this.previousIconInShopByHealthNeedSection.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeClickable(this.previousIconInShopByHealthNeedSection, 3,webDriver);
            this.previousIconInShopByHealthNeedSection.click();
        }
    }

    public void clickOnPreviousPage() {
        try {
            DataHelperAndWait.waitToBeClickable(this.previousPageIcon, 5,webDriver);
            this.previousPageIcon.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeClickable(this.previousPageIcon, 3,webDriver);
            this.previousPageIcon.click();
        }
    }

    public void clickOnImmunitySupportCategory() {
        do{
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while(!immunitySupportCategory.isDisplayed());
        DataHelperAndWait.waitToBeVisible(immunitySupportCategory,5,webDriver);
        this.immunitySupportCategory.click();
    }
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        DataHelperAndWait.waitToBeVisible(immunitySupportCategory,3,webDriver);
//        this.immunitySupportCategory.click();

    public void clickOnKidsHealthCategory() {
        do{
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while(!kidsHealthCategory.isDisplayed());
        DataHelperAndWait.waitToBeVisible(kidsHealthCategory,5,webDriver);
        this.kidsHealthCategory.click();
    }
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        DataHelperAndWait.waitToBeVisible(kidsHealthCategory,5,webDriver);
//        this.kidsHealthCategory.click();


    public void clickOnMensHealthCategory() {
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        DataHelperAndWait.waitToBeVisible(mensHealthCategory,5,webDriver);
//        this.mensHealthCategory.click();
//    }
        do{
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while(!mensHealthCategory.isDisplayed());
        DataHelperAndWait.waitToBeVisible(mensHealthCategory,5,webDriver);
        this.mensHealthCategory.click();
    }


    public void clickOnSexualHealthCategory() {
        do{
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while(!sexualHealthCategory.isDisplayed());

//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(sexualHealthCategory,5,webDriver);
        this.sexualHealthCategory.click();
    }
    public void clickOnHairSkinAndNails() {
        do{
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while(!hairAndSkinAndNailsCategory.isDisplayed());
        DataHelperAndWait.waitToBeVisible(hairAndSkinAndNailsCategory,5,webDriver);
        this.hairAndSkinAndNailsCategory.click();
    }
    public void clickOnHeartHealthCategory() {
        do{
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while(!heartHealthCategory.isDisplayed());
        DataHelperAndWait.waitToBeVisible(heartHealthCategory,5,webDriver);
        this.heartHealthCategory.click();
    }

    public void clickOnSleepSupportCategory() {
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        DataHelperAndWait.waitToBeVisible(sleepSupportCategory,5,webDriver);
//        this.sleepSupportCategory.click();
//    }
        do{
            this.clickOnNextIconInShopByHealthNeedSection();
        }
        while(!sleepSupportCategory.isDisplayed());
        DataHelperAndWait.waitToBeVisible(sleepSupportCategory,5,webDriver);
        this.sleepSupportCategory.click();
    }

    public void clickOnDietWeightManagementCategory() {
        do{
            this.clickOnPreviousIconInShopByHealthNeedSection();        }
        while(!dietWeightManagementCategory.isDisplayed());
        DataHelperAndWait.waitToBeVisible(dietWeightManagementCategory,5,webDriver);
        this.dietWeightManagementCategory.click();
    }

//        this.clickOnPreviousIconInShopByHealthNeedSection();
//        this.clickOnPreviousIconInShopByHealthNeedSection();
//        this.clickOnPreviousIconInShopByHealthNeedSection();
//        this.clickOnPreviousIconInShopByHealthNeedSection();
//        DataHelperAndWait.waitToBeVisible(dietWeightManagementCategory,4,webDriver);
//        this.dietWeightManagementCategory.click();
//    }

    public void clickOnWomenHealthCategory() {
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        this.clickOnNextIconInShopByHealthNeedSection();
//        DataHelperAndWait.waitToBeVisible(womenHealthCategory,5,webDriver);
//        this.womenHealthCategory.click();
//    }
        do{
            this.clickOnPreviousIconInShopByHealthNeedSection();
        }
        while(!womenHealthCategory.isDisplayed());
        DataHelperAndWait.waitToBeVisible(womenHealthCategory,5,webDriver);
        this.womenHealthCategory.click();
    }
    public void clickOnNextIconInFishOilAndOmegasSection() {
        try {
            DataHelperAndWait.waitToBeClickable(this.nextIconInFishOilAndOmegasSection, 5,webDriver);
            this.nextIconInFishOilAndOmegasSection.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeClickable(this.nextIconInFishOilAndOmegasSection, 3,webDriver);
            this.nextIconInFishOilAndOmegasSection.click();
        }

    }
    public void clickOnPreviousIconInFishOilAndOmegasSection(){
        try{
            DataHelperAndWait.waitToBeClickable(this.previousIconInFishOilAndOmegasSection,5,webDriver);
            this.previousIconInFishOilAndOmegasSection.click();}
        catch(Exception e){
            DataHelperAndWait.waitToBeClickable(this.previousIconInFishOilAndOmegasSection,3,webDriver);
            this.previousIconInFishOilAndOmegasSection.click();
        }
    }
    public void navigateToHomePage(){webDriver.navigate().to(BaseURL);}
    public void navigateToVitaminsAndHealthPage(){webDriver.navigate().to(BaseURL +aeDomain+healthVitaminsUrl);}

}
