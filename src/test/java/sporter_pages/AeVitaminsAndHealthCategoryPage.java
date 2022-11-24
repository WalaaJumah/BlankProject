package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AeVitaminsAndHealthCategoryPage {
    public AeVitaminsAndHealthCategoryPage(WebDriver webDriver) {
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
    private WebElement immunitySupporCategory;
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
    @FindBy(xpath = "(//div[@class='swiper-slide'])[38]")
    private WebElement productCardInAntioxidantsSection;
    @FindBy(xpath = "(//div[@class='swiper-slide'])[45]")
    private WebElement productCardInSuperFoodSection;
    @FindBy(xpath = "(//div[@class='swiper-slide'])[52]")
    private WebElement productCardInMelatoninSection;
    @FindBy(xpath = "(//div[@class='swiper-slide'])[58]")
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
        return vitaminsAndHealthCategoryInHomePage;
    }
    public WebElement getPreviousIconInSuperFoodSection() {
        return previousIconInSuperFoodSection;
    }
    public WebElement getProductCardInCollagenSection() {
        return productCardInCollagenSection;
    }
    public WebElement getViewAllInCollagenSection() {
        return viewAllInCollagenSection;
    }
    public WebElement getNextIconInCollagenSection() {
        return nextIconInCollagenSection;
    }
    public WebElement getMelatoninSectionTitle() {
        return melatoninSectionTitle;
    }
    public WebElement getSuperFoodSectionTitle() {
        return superFoodSectionTitle;
    }
    public WebElement getPreviousIconInCollagenSection() {
        return previousIconInCollagenSection;
    }
    public WebElement getViewAllInMelatoninSection() {
        return viewAllInMelatoninSection;
    }
    public WebElement getNextIconInMelatoninSection() {
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
        return previousIconInMelatoninSection;
    }
    public WebElement getProductCardInMelatoninSection() {
        return productCardInMelatoninSection;
    }
    public WebElement getNextIconInSuperFoodSection() {
        return nextIconInSuperFoodSection;
    }
    public WebElement getAntioxidantsSectionTitle() {
        return antioxidantsSectionTitle;
    }
    public WebElement getNextIconInAntioxidantsSection() {
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
        return previousIconInVitaminsAZSection;
    }
    public WebElement getProductCardInMineralsSection() {
        return productCardInMineralsSection;
    }
    public WebElement getProductCardInAntioxidantsSection() {
        return productCardInAntioxidantsSection;
    }
    public WebElement getPreviousIconInAntioxidantsSection() {
        return previousIconInAntioxidantsSection;
    }
    public WebElement getMineralsSection() {
        return mineralsSection;
    }
    public WebElement getFishOilAndOmegasFooterSection() {
        return fishOilAndOmegasFooterSection;
    }
    public WebElement getViewAllInSuperFoodSection() {
        return viewAllInSuperFoodSection;
    }
    public WebElement getNextIconInMineralsSection() {
        return nextIconInMineralsSection;
    }
    public WebElement getProductCardInSuperFoodSection() {
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
        return beautyCategory;
    }

    public WebElement getBoneAndJointCategory() {
        return boneAndJointCategory;
    }

    public WebElement getBrainSupportCategory() {
        return brainSupportCategory;
    }

    public WebElement getDetoxAndLiverSupportCategory() {
        return detoxAndLiverSupportCategory;
    }
    public WebElement getCollagenSection() {
        return collagenSection;
    }

    public WebElement getDigestiveSupportCategory() {
        return digestiveSupportCategory;
    }

    public WebElement getEnergyFormulasCategory() {
        return energyFormulasCategory;
    }

    public WebElement getHairAndSkinAndNailsCategory() {
        return hairAndSkinAndNailsCategory;
    }

    public WebElement getHeartHealthCategory() {
        return heartHealthCategory;
    }

    public WebElement getImmunitySupporCategory() {
        return immunitySupporCategory;
    }

    public WebElement getKidsHealthCategory() {
        return kidsHealthCategory;
    }
    public WebElement getMultiVitaminsSection() {
        return multiVitaminsSection;
    }

    public WebElement getMensHealthCategory() {
        return mensHealthCategory;
    }

    public WebElement getSexualHealthCategory() {
        return sexualHealthCategory;
    }

    public WebElement getSleepSupportCategory() {
        return sleepSupportCategory;
    }

    public WebElement getDietWeightManagementCategory() {
        return dietWeightManagementCategory;
    }

    public WebElement getWomenHealthCategory() {
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
        return filtrationSection;
    }

    public WebElement getPreviousIconInShopByHealthNeedSection() {
        return previousIconInShopByHealthNeedSection;
    }
    public WebElement getPreviousIconInMultiVitaminsSection() {
        return previousIconInMultiVitaminsSection;
    }

    public WebElement getFishOilAndOmegasSectionTitle() {
        return fishOilAndOmegasSectionTitle;
    }

    public WebElement getFishOilAndOmegasSection() {
        return fishOilAndOmegasSection;
    }

    public WebElement getNextIconInFishOilAndOmegasSection() {
        return nextIconInFishOilAndOmegasSection;
    }

    public WebElement getPreviousIconInFishOilAndOmegasSection() {
        return previousIconInFishOilAndOmegasSection;
    }
    public WebElement getViewAllInFishOilAndOmegasSection() {
        return viewAllInFishOilAndOmegasSection;
    }
    public WebElement getProductCardInFishOilAndOmegasSection() {
        return productCardInFishOilAndOmegasSection;
    }
    public WebElement getFishOilAndOmegasSectionDefaultPosition() {
        return fishOilAndOmegasSectionDefaultPosition;
    }
    public WebElement getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon() {
        return fishOilAndOmegasSectionPositionAfterClickingOnNextIcon;
    }
    public WebElement getProductCardInMultiVitaminsSection() {
        return productCardInMultiVitaminsSection;
    }
    public WebElement getNextIconInMultiVitaminsSection() {
        return nextIconInMultiVitaminsSection;
    }
    public WebElement getMultiVitaminsSectionDefaultPosition() {
        return multiVitaminsSectionDefaultPosition;
    }

    //Define the main actions we need to execute our TCs
    public void clickOnNextIconInShopByHealthNeedSection() {
        try {
            DataHelperAndWait.waitToBeClickable(this.nextIconInShopByHealthNeedSection, 5);
            this.nextIconInShopByHealthNeedSection.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeClickable(this.nextIconInShopByHealthNeedSection, 5);
            this.nextIconInShopByHealthNeedSection.click();
        }
    }

    public void clickOnPreviousIconInShopByHealthNeedSection() {
        try {
            DataHelperAndWait.waitToBeClickable(this.previousIconInShopByHealthNeedSection, 5);
            this.previousIconInShopByHealthNeedSection.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeClickable(this.previousIconInShopByHealthNeedSection, 5);
            this.previousIconInShopByHealthNeedSection.click();
        }
    }

    public void clickOnPreviousPage() {
        try {
            DataHelperAndWait.waitToBeClickable(this.previousPageIcon, 5);
            this.previousPageIcon.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeClickable(this.previousPageIcon, 5);
            this.previousPageIcon.click();
        }
    }

    public void clickOnImmunitySupportCategory() {
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.immunitySupporCategory.click();
    }

    public void clickOnKidsHealthCategory() {
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.kidsHealthCategory.click();
    }

    public void clickOnMensHealthCategory() {
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.mensHealthCategory.click();
    }

    public void clickOnSexualHealthCategory() {
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
        this.clickOnNextIconInShopByHealthNeedSection();
        this.sexualHealthCategory.click();
    }

    public void clickOnSleepSupportCategory() {
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
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.sleepSupportCategory.click();
    }

    public void clickOnDietWeightManagementCategory() {
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
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.dietWeightManagementCategory.click();
    }

    public void clickOnWomenHealthCategory() {
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
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.clickOnNextIconInShopByHealthNeedSection();
        this.womenHealthCategory.click();
    }

    public void clickOnNextIconInFishOilAndOmegasSection() {
        try {
            DataHelperAndWait.waitToBeClickable(this.nextIconInFishOilAndOmegasSection, 5);
            this.nextIconInFishOilAndOmegasSection.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeClickable(this.nextIconInFishOilAndOmegasSection, 5);
            this.nextIconInFishOilAndOmegasSection.click();
        }

    }
    public void clickOnPreviousIconInFishOilAndOmegasSection(){
        try{
            DataHelperAndWait.waitToBeClickable(this.previousIconInFishOilAndOmegasSection,5);
            this.previousIconInFishOilAndOmegasSection.click();}
        catch(Exception e){
            DataHelperAndWait.waitToBeClickable(this.previousIconInFishOilAndOmegasSection,5);
            this.previousIconInFishOilAndOmegasSection.click();
        }
    }
}
