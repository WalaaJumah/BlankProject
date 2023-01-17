/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class contains all elements related to the Home Page
 */

package sporter_pages.homepage_classes;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
@Getter
public class HomePage extends BasePage {
    public final String jordanDomain = "/en-jo";

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    //declare all locators related to the Cart Page
    @FindBy(id = "SloderNavigationNext")
    private WebElement nextArrowInHomePageRotatingSlider;
    @FindBy(id = "SloderNavigationPrev")
    private WebElement previousArrowInHomePageRotatingSlider;
    @FindBy(id = "swiperSlideimg_9")
    private List<WebElement> homePageRotatingSliderList;
    @FindBy(id = "crouselContainer")
    private WebElement homePageRotatingSlider;
    @FindBy(className = "swiper-pagination swiper-pagination-clickable swiper-pagination-bullets swiper-pagination-horizontal")
    private List<WebElement> homePageRotatingSliderPagingList;
    @FindBy(id = "AdvertiseContainersecond")
    private List<WebElement> homePageUnderShopByCategoryBanners;
    @FindBy(id = "TopCategoryItem_00_span")
    private WebElement shopByOption;
    @FindBy(id = "TopCategoryItem_0_span")
    private WebElement sportSupplementsOption;
    @FindBy(id = "TopCategoryItem_1_span")
    private WebElement vitaminsAndHealthOption;
    @FindBy(id = "TopCategoryItem_2_span")
    private WebElement healthyFoodOption;
    @FindBy(id = "TopCategoryItem_3_span")
    private WebElement sportsOption;
    @FindBy(id = "TopCategoryItem_4_span")
    private WebElement womenOnlyOption;
    @FindBy(id = "//ul[@class='nav-primary']")
    private WebElement megaMenuMainComponent;
    @FindBy(className = "swiper-pagination swiper-pagination-clickable swiper-pagination-bullets swiper-pagination-horizontal")
    private WebElement homePageRotatingSliderPagingControl;
    @FindBy(id = "crousel_imagesContainer")
    private WebElement homePageSideBanner;
    @FindBy(id = "AdvertiseLink0first")
    private WebElement homePageHorizontalBanner;
    @FindBy(id = "ShopByCategoryTitle")
    private WebElement shopByCategoryHeader;
    @FindBy(id = "CategoryProductsTitle_mostSelling")
    private WebElement topSellingStacksHeader;
    @FindBy(id = "//h2[text()='Top Sellers']")
    private WebElement topSellerHeader;
    @FindBy(className = "swiper swiper-initialized swiper-horizontal swiper-pointer-events swiper-backface-hidden")
    private WebElement shopByCategorySections;
    @FindBy(css = "#Swiper_mostSelling > div.swiper-wrapper")
    private WebElement topSellingStacksSections;
    @FindBy(id = "tab-67-all67")
    private WebElement topSellerSections;
    @FindBy(id = "OptionsContainerOptions_allmostSelling")
    private WebElement viewAllBtnInTopSellingStacksSection;
    @FindBy(id = "//ul[@class='tabs tabs67']/li[2]/a")
    private WebElement sportSupplementsLink;
    @FindBy(id = "//ul[@class='tabs tabs67']/li[1]/a")
    private WebElement allLink;
    @FindBy(id = "//li[@class='tabli-67-618']")
    private WebElement healthyFoodLink;
    @FindBy(id = "//li[@class='tabli-67-686']")
    private WebElement vitaminsAndHealthLink;
    @FindBy(id = "//li[@class='tabli-67-736']")
    private WebElement sportswearAndAccessoriesLink;
    @FindBy(id = "//ul[@class='tabs tabs67']/li[2]/a")
    private WebElement sportSupplementsActiveLink;
    @FindBy(id = "//ul[@class='tabs tabs67']/li[@class='active']")
    private WebElement allActiveLink;
    @FindBy(id = "//ul[@class='tabs tabs67']/li[3]/a")
    private WebElement healthyFoodActiveLink;
    @FindBy(id = "//li[@class='tabli-6-686 active']")
    private WebElement vitaminsAndHealthActiveLink;
    @FindBy(id = "//ul[@class='tabs tabs67']/li[4]/a")
    private WebElement vitaminsAndHealthActiveLinkInTopeSellersSection;
    @FindBy(id = "//ul[@class='tabs tabs67']/li[5]/a")
    private WebElement sportswearAndAccessoriesActiveLink;
    @FindBy(id = "(//div[@class='swiper-button-next top-sellers-swiper-button-next'])[1]")
    private WebElement nextButtonInTopSellerSection;
    @FindBy(id = "(//div[@class='swiper-button-prev top-sellers-swiper-button-prev'])[1]")
    private WebElement previousButtonInTopSellerSection;
    @FindBy(id = "//h2[text()='Trending on Sporter']")
    private WebElement trendingOnSporterHeader;
    @FindBy(id = "//div[@class='swiper-container swiper-container-horizontal trending']")
    private WebElement trendingOnSporterSection;
    @FindBy(id = "//div[@class='trending-swiper-button-next']/i")
    private WebElement nextBtnInTrendingOnSporterSection;


    @FindBy(id = "//div[@class='trending-swiper-button-prev']/i")
    private WebElement previousBtnInTrendingOnSporterSection;
    @FindBy(id = "//div[@style='transform: translate3d(-1482px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement trendingOnSporterSectionPositionAfterClickingOnNext;
    @FindBy(id = "//div[@style='transform: translate3d(-1235px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement trendingOnSporterSectionPositionAfterClickingOnPrevious;
    @FindBy(id = "(//div[@class='swiper-wrapper'])[2]")
    private WebElement topSellerSectionPositionAfterClickingOnPrevious;
    @FindBy(id = "//div[@style='transform: translate3d(-249px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement topSellerSectionPositionAfterClickingOnNext;
    @FindBy(id = "//div[@style='transform: translate3d(0px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement NewArrivalSectionPositionAfterClickingOnPrevious;
    @FindBy(id = "//div[@style='transform: translate3d(-249px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement NewArrivalSectionPositionAfterClickingOnNext;
    @FindBy(id = "//h2[text()='New Arrivals']")
    private WebElement newArrivalsHeader;
    @FindBy(id = "tab-6-all6")
    private WebElement newArrivalsSection;
    @FindBy(id = "//li/a[@href='#tab-6-all6']")
    private WebElement newArrivalsAllLink;
    @FindBy(id = "//li[@class='tabli-6-583']")
    private WebElement newArrivalsSpportSupplementsLink;
    @FindBy(id = "//li[@class='tabli-6-618']")
    private WebElement newArrivalsHealthyFoodLink;
    @FindBy(id = "//li[@class='tabli-6-686']")
    private WebElement newArrivalsVitaminsAndHealthLink;
    @FindBy(id = "//li[@class='tabli-6-736']")
    private WebElement newArrivalsSportWearAndAccessoriesLink;
    @FindBy(id = "//li[@class='tabli-6-583 active']")
    private WebElement newArrivalsSportSupplementsActiveLink;
    @FindBy(id = "//ul[@class='tabs tabs6']/li[@class='active']")
    private WebElement newArrivalsAllActiveLink;
    @FindBy(id = "//li[@class='tabli-6-618 active']")
    private WebElement newArrivalsHealthyFoodActiveLink;
    @FindBy(id = "//li[@class='tabli-6-686 active']")
    private WebElement newArrivalsVitaminsAndHealthActiveLink;
    @FindBy(id = "//li[@class='tabli-6-736 active']")
    private WebElement newArrivalsSportswearAndAccessoriesActiveLink;
    @FindBy(id = "(//div[@class='swiper-button-next top-sellers-swiper-button-next'])[5]")
    private WebElement nextBtnInNewArrivalsSection;
    @FindBy(id = "//div[@id='tab-6-736']/div[3]/i")
    private WebElement previousBtnInNewArrivalsSection;
    @FindBy(id = "//div[@class='left-quetion-block quetion-inner']")
    private WebElement getQuestionBlock;
    @FindBy(id = "//*[@title='Call']")
    private WebElement phoneBtn;
    @FindBy(id = "//*[text()='Email ']")
    private WebElement emailBtn;
    @FindBy(id = "(//a[@title='Start Shopping'])[1]")
    private WebElement sportsSupplementsCategory;
    @FindBy(id = "(//a[@title='Start Shopping'])[2]")
    private WebElement healthyFoodCategory;
    @FindBy(id = "(//a[@title='Start Shopping'])[3]")
    private WebElement vitaminsAndHealthCategory;
    @FindBy(id = "(//a[@title='Start Shopping'])[4]")
    private WebElement sportswearAndAccessoriesCategory;
    @FindBy(id = "//div[@class='flex-viewport']")
    private WebElement bannerInRotatingSliderSection;
    @FindBy(id = "crousel_link1")
    private WebElement firstSideBanner;
    @FindBy(id = "crousel_link2")
    private WebElement secondSideBanner;
    @FindBy(id = "(//div[@class='top-seller-slider']//div[@class='swiper-wrapper'])[1]/div/div/a")
    private List<WebElement> ProductsInTopSellingStacksSection;
    @FindBy(id = "(//div[@id='tab-39-all39']/div/div/div/div/a)[2]")
    private WebElement secondProductInTopSellingStacksSection;
    @FindBy(id = "(//div[@id='tab-39-all39']/div/div/div/div/a)[3]")
    private WebElement thirdProductInTopSellingStacksSection;
    @FindBy(id = "(//div[@id='tab-39-all39']/div/div/div/div/a)[4]")
    private WebElement fourthProductInTopSellingStacksSection;
    @FindBy(id = "(//div[@id='tab-39-all39']/div/div/div/div/a)[5]")
    private WebElement fiveProductInTopSellingStacksSection;
    @FindBy(id = "(//div[@class='top-seller-slider']//div[@class='swiper-wrapper'])[2]/div/div/a")
    private List<WebElement> productsInTopSellersSection;
    @FindBy(id = "(//div[@id='tab-67-all67']/div/div/div/div/a)[2]")
    private WebElement secondProductInTopSellersSection;
    @FindBy(id = "(//div[@id='tab-67-all67']/div/div/div/div/a)[3]")
    private WebElement thirdProductInTopSellersSection;
    @FindBy(id = "(//div[@id='tab-67-all67']/div/div/div/div/a)[4]")
    private WebElement fourthProductInTopSellersSection;
    @FindBy(id = "(//div[@id='tab-67-all67']/div/div/div/div/a)[5]")
    private WebElement fiveProductInTopSellersSection;
    @FindBy(id = "(//div[@class='top-seller-slider new-arrival-slider']//div[@class='swiper-wrapper'])[1]/div/div/a")
    private List<WebElement> productsInNewArrivalsSection;
    @FindBy(id = "(//div[@id='tab-6-all6']/div/div/div/div/a)[2]")
    private WebElement secondProductInNewArrivalsSection;
    @FindBy(id = "(//div[@id='tab-6-all6']/div/div/div/div/a)[3]")
    private WebElement thirdProductInNewArrivalsSection;
    @FindBy(id = "(//div[@id='tab-6-all6']/div/div/div/div/a)[4]")
    private WebElement fourthProductInNewArrivalsSection;
    @FindBy(id = "(//div[@id='tab-6-all6']/div/div/div/div/a)[5]")
    private WebElement fiveProductInNewArrivalsSection;
    @FindBy(id = "(//p[@class='count-container-item amount amount--has-pages'])[1]/span")
    private WebElement resultLabel;
    @FindBy(id = "(//p[@class='count-container-item amount amount--has-pages'])[1]")
    private WebElement searchResultValue;
    @FindBy(id = "(//li[@class='item pages-item-next']/a)[2]")
    private WebElement NextPageBtn;

    //Main WebElement Test Cases
    public void clickOnViewAllBtnInTopSellingStacksSection() {
        DataHelperAndWait.clickOnElement(viewAllBtnInTopSellingStacksSection,webDriver);
    }

    public void clickOnAllLinkInTopSellerSection() {
        DataHelperAndWait.clickOnElement(allLink,webDriver);
    }
    public void clickOnSportSupplementsLinkInTopSellerSection() {
        DataHelperAndWait.clickOnElement(sportSupplementsLink,webDriver);
    }

    public void clickOnHealthyFoodLinkInTopSellerSection() {
        DataHelperAndWait.clickOnElement(healthyFoodLink,webDriver);
    }
    public void clickOnVitaminsAndHealthLinkInTopSellerSection() {
        DataHelperAndWait.clickOnElement(vitaminsAndHealthLink,webDriver);
    }
    public void clickOnSportswearAndAccessoriesLinkInTopSellerSection() {
        DataHelperAndWait.clickOnElement(sportswearAndAccessoriesLink,webDriver);
    }
    public void clickOnNextButtonInTopSellerSectionInTopSellerSection() {
        DataHelperAndWait.clickOnElement(nextButtonInTopSellerSection,webDriver);
    }
    public void clickOnNextButtonInTrendingOnSporterSection() {
        DataHelperAndWait.clickOnElement(nextBtnInTrendingOnSporterSection,webDriver);
    }
    public void clickOnPreviousButtonInTrendingOnSporterSection() {
        DataHelperAndWait.clickOnElement(previousBtnInTrendingOnSporterSection,webDriver);
    }
    public void clickOnPreviousButtonInTopSellersSection() {
        DataHelperAndWait.clickOnElement(previousButtonInTopSellerSection,webDriver);
    }
    public void clickOnNextButtonInTopSellersSection() {
        DataHelperAndWait.clickOnElement(nextButtonInTopSellerSection,webDriver);
    }
    public void clickOnAllLinkInNewArrivalsSection() {
        DataHelperAndWait.clickOnElement(newArrivalsAllLink,webDriver);
    }
    public void clickOnSportSupplementsLinkInNewArrivalsSection() {
        DataHelperAndWait.clickOnElement(newArrivalsSpportSupplementsLink,webDriver);
    }
    public void clickOnHealthyFoodLinkInNewArrivalsSection() {
        DataHelperAndWait.clickOnElement(newArrivalsHealthyFoodLink,webDriver);
    }
    public void clickOnVitaminsAndHealthLinkInNewArrivalsSection() {
        DataHelperAndWait.clickOnElement(newArrivalsVitaminsAndHealthLink,webDriver);
    }
    public void clickOnSportswearAndAccessoriesLinkInNewArrivalsSection() {
        DataHelperAndWait.clickOnElement(newArrivalsSportWearAndAccessoriesLink,webDriver);
    }
    public void clickOnPreviousButtonInNewArrivalSection() {
        DataHelperAndWait.clickOnElement(previousBtnInNewArrivalsSection,webDriver);
    }
    public void clickOnNextButtonInNewArrivalSection() {
        DataHelperAndWait.clickOnElement(nextBtnInNewArrivalsSection,webDriver);
    }
    public void clickOnPhoneBtn() {
        DataHelperAndWait.clickOnElement(phoneBtn,webDriver);
    }
    public void clickOnEmailBtn() {
        DataHelperAndWait.clickOnElement(emailBtn,webDriver);
    }
    public void clickOnHomePageHorizontalBanner() {
        DataHelperAndWait.clickOnElement(homePageHorizontalBanner,webDriver);
    }
    public void clickOnSportsSupplementsCategory() {
        DataHelperAndWait.clickOnElement(sportsSupplementsCategory,webDriver);
    }
    public void clickOnHealthyFoodCategory() {
        DataHelperAndWait.clickOnElement(healthyFoodCategory,webDriver);
    }
    public void clickOnVitaminsAndHealthCategory() {
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategory,webDriver);
    }
    public void clickOnSportswearAndAccessoriesCategory() {
        DataHelperAndWait.clickOnElement(sportswearAndAccessoriesCategory,webDriver);
    }

//    public void clickOnFirstProductInTheTopSellingStacksSection(){
//        try{
//            dataHelperAndWait= new DataHelperAndWait();
//            dataHelperAndWait.waitToBeVisible(this.firstProductInTopSellingStacksSection,webDriver);
//            this.firstProductInTopSellingStacksSection.click();
//        }
//        catch (Exception e){
//            dataHelperAndWait= new DataHelperAndWait();
//            dataHelperAndWait.waitToBeVisible(this.firstProductInTopSellingStacksSection,webDriver);
//            this.firstProductInTopSellingStacksSection.click();
//        }
//    }

    public void clickOnSecondProductInTheTopSellingStacksSection(){
        DataHelperAndWait.clickOnElement(secondProductInTopSellingStacksSection,webDriver);
    }
    public void clickOnThirdProductInTheTopSellingStacksSection(){
        DataHelperAndWait.clickOnElement(thirdProductInTopSellingStacksSection,webDriver);
    }
    public void clickOnFourthProductInTheTopSellingStacksSection(){
        DataHelperAndWait.clickOnElement(fourthProductInTopSellingStacksSection,webDriver);
    }
    public void clickOnFifthProductInTheTopSellingStacksSection(){
        DataHelperAndWait.clickOnElement(fiveProductInTopSellingStacksSection,webDriver);
    }
//    public void clickOnFirstProductInTheTopSellersSection(){
//        try{
//            dataHelperAndWait= new DataHelperAndWait();
//            dataHelperAndWait.waitToBeVisible(this.productsInTopSellersSection,webDriver);
//            this.productsInTopSellersSection.click();
//        }
//        catch (Exception e){
//            dataHelperAndWait= new DataHelperAndWait();
//            dataHelperAndWait.waitToBeVisible(this.productsInTopSellersSection,webDriver);
//            this.productsInTopSellersSection.click();
//        }
//    }

    public void clickOnSecondProductInTheTopSellersSection(){
        DataHelperAndWait.clickOnElement(secondProductInTopSellersSection,webDriver);
    }
    public void clickOnThirdProductInTheTopSellersSection(){
        DataHelperAndWait.clickOnElement(thirdProductInTopSellersSection,webDriver);
    }
    public void clickOnFourthProductInTheTopSellersSection(){
        DataHelperAndWait.clickOnElement(fourthProductInTopSellersSection,webDriver);
    }
    public void clickOnFifthProductInTheTopSellersSection(){
        DataHelperAndWait.clickOnElement(fiveProductInTopSellersSection,webDriver);
    }
//    public void clickOnFirstProductInTheNewArrivalsSection(){
//        try{
//            dataHelperAndWait= new DataHelperAndWait();
//            dataHelperAndWait.waitToBeVisible(this.productsInNewArrivalsSection,webDriver);
//            this.productsInNewArrivalsSection.click();
//        }
//        catch (Exception e){
//            dataHelperAndWait= new DataHelperAndWait();
//            dataHelperAndWait.waitToBeVisible(this.productsInNewArrivalsSection,webDriver);
//            this.productsInNewArrivalsSection.click();
//        }
//    }

    public void clickOnSecondProductInTheNewArrivalsSection(){
        DataHelperAndWait.clickOnElement(secondProductInNewArrivalsSection,webDriver);
    }
    public void clickOnThirdProductInTheNewArrivalsSection(){
        DataHelperAndWait.clickOnElement(thirdProductInNewArrivalsSection,webDriver);
    }
    public void clickOnFourthProductInTheNewArrivalsSection(){
        DataHelperAndWait.clickOnElement(fourthProductInNewArrivalsSection,webDriver);
    }
    public void clickOnFifthProductInTheNewArrivalsSection(){
        DataHelperAndWait.clickOnElement(fiveProductInNewArrivalsSection,webDriver);
    }
    public void clickOnFirstSideBanner(){
        DataHelperAndWait.clickOnElement(firstSideBanner,webDriver);
    }
    public void clickOnSecondSideBanner(){
        DataHelperAndWait.clickOnElement(secondSideBanner,webDriver);
    }
    public void clickOnBannerInRotatingSliderSection(){
        DataHelperAndWait.clickOnElement(bannerInRotatingSliderSection,webDriver);
    }

    public void switchCountry(WebElement countryElement){
        try {
            DataHelperAndWait.isDisplayed(countryList ,webDriver);
            this.countryList.click();
            countryElement.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList ,webDriver);
            this.countryList.click();
            countryElement.click();
        }
    }

}
