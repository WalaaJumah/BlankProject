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
    public HomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;

    //declare all locators related to the Cart Page
    @FindBy(xpath = "//a[contains(text(),'Next')]")
    private WebElement nextArrowInHomePageRotatingSlider;
    @FindBy(xpath = "//a[contains(text(),'Previous')]")
    private WebElement previousArrowInHomePageRotatingSlider;
    @FindBy(css = "ul.slides li.flex-active-slide:nth-child(2)")
    private List<WebElement> homePageRotatingSliderList;
    @FindBy(css = "ul.slides li.flex-active-slide:nth-child(2)")
    private WebElement homePageRotatingSlider;
    @FindBy(xpath = "//*[@class='flex-control-nav flex-control-paging']/li/a")
    private List<WebElement> homePageRotatingSliderPagingList;
    @FindBy(css = "#maincontent > div.columns > div > div.advertise-banner-3.imagewidgetclass > ul")
    private List<WebElement> homePageUnderShopByCategoryBanners;
    @FindBy(xpath = "//ul[@class='nav-primary']/li[1]")
    private WebElement shopByOption;
    @FindBy(xpath = "//ul[@class='nav-primary']/li[2]")
    private WebElement sportSupplementsOption;
    @FindBy(xpath = "//ul[@class='nav-primary']/li[3]")
    private WebElement vitaminsAndHealthOption;
    @FindBy(xpath = "//ul[@class='nav-primary']/li[4]")
    private WebElement healthyFoodOption;
    @FindBy(xpath = "//ul[@class='nav-primary']/li[5]")
    private WebElement sportsOption;
    @FindBy(xpath = "//ul[@class='nav-primary']/li[6]")
    private WebElement womenOnlyOption;
    @FindBy(xpath = "//ul[@class='nav-primary']")
    private WebElement megaMenuMainComponent;
    @FindBy(xpath = "//*[@class='flex-control-nav flex-control-paging']")
    private WebElement homePageRotatingSliderPagingControl;
    @FindBy(xpath = "//div[@class='nutritious-right']")
    private WebElement homePageSideBanner;
    @FindBy(xpath = "//div[@class='advertise-banner-1 imagewidgetclass']/ul/li/a")
    private WebElement homePageHorizontalBanner;
    @FindBy(xpath = "//h2[text()='Shop By Category']")
    private WebElement shopByCategoryHeader;
    @FindBy(xpath = "//h2[text()='Top Selling Stacks']")
    private WebElement topSellingStacksHeader;
    @FindBy(xpath = "//h2[text()='Top Sellers']")
    private WebElement topSellerHeader;
    @FindBy(xpath = "//ul[@class='swiper-wrapper clearfix']")
    private WebElement shopByCategorySections;
    @FindBy(xpath = "//*[@class='tab_content tab_content39']")
    private WebElement topSellingStacksSections;
    @FindBy(id = "tab-67-all67")
    private WebElement topSellerSections;
    @FindBy(xpath = "(//a[@class='view-all'])[1]")
    private WebElement viewAllBtnInTopSellingStacksSection;
    @FindBy(xpath = "//ul[@class='tabs tabs67']/li[2]/a")
    private WebElement sportSupplementsLink;
    @FindBy(xpath = "//ul[@class='tabs tabs67']/li[1]/a")
    private WebElement allLink;
    @FindBy(xpath = "//li[@class='tabli-67-618']")
    private WebElement healthyFoodLink;
    @FindBy(xpath = "//li[@class='tabli-67-686']")
    private WebElement vitaminsAndHealthLink;
    @FindBy(xpath = "//li[@class='tabli-67-736']")
    private WebElement sportswearAndAccessoriesLink;
    @FindBy(xpath = "//ul[@class='tabs tabs67']/li[2]/a")
    private WebElement sportSupplementsActiveLink;
    @FindBy(xpath = "//ul[@class='tabs tabs67']/li[@class='active']")
    private WebElement allActiveLink;
    @FindBy(xpath = "//ul[@class='tabs tabs67']/li[3]/a")
    private WebElement healthyFoodActiveLink;
    @FindBy(xpath = "//li[@class='tabli-6-686 active']")
    private WebElement vitaminsAndHealthActiveLink;
    @FindBy(xpath = "//ul[@class='tabs tabs67']/li[4]/a")
    private WebElement vitaminsAndHealthActiveLinkInTopeSellersSection;
    @FindBy(xpath = "//ul[@class='tabs tabs67']/li[5]/a")
    private WebElement sportswearAndAccessoriesActiveLink;
    @FindBy(xpath = "(//div[@class='swiper-button-next top-sellers-swiper-button-next'])[1]")
    private WebElement nextButtonInTopSellerSection;
    @FindBy(xpath = "(//div[@class='swiper-button-prev top-sellers-swiper-button-prev'])[1]")
    private WebElement previousButtonInTopSellerSection;
    @FindBy(xpath = "//h2[text()='Trending on Sporter']")
    private WebElement trendingOnSporterHeader;
    @FindBy(xpath = "//div[@class='swiper-container swiper-container-horizontal trending']")
    private WebElement trendingOnSporterSection;
    @FindBy(xpath = "//div[@class='trending-swiper-button-next']/i")
    private WebElement nextBtnInTrendingOnSporterSection;


    @FindBy(xpath = "//div[@class='trending-swiper-button-prev']/i")
    private WebElement previousBtnInTrendingOnSporterSection;
    @FindBy(xpath = "//div[@style='transform: translate3d(-1482px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement trendingOnSporterSectionPositionAfterClickingOnNext;
    @FindBy(xpath = "//div[@style='transform: translate3d(-1235px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement trendingOnSporterSectionPositionAfterClickingOnPrevious;
    @FindBy(xpath = "(//div[@class='swiper-wrapper'])[2]")
    private WebElement topSellerSectionPositionAfterClickingOnPrevious;
    @FindBy(xpath = "//div[@style='transform: translate3d(-249px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement topSellerSectionPositionAfterClickingOnNext;
    @FindBy(xpath = "//div[@style='transform: translate3d(0px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement NewArrivalSectionPositionAfterClickingOnPrevious;
    @FindBy(xpath = "//div[@style='transform: translate3d(-249px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement NewArrivalSectionPositionAfterClickingOnNext;
    @FindBy(xpath = "//h2[text()='New Arrivals']")
    private WebElement newArrivalsHeader;
    @FindBy(id = "tab-6-all6")
    private WebElement newArrivalsSection;
    @FindBy(xpath = "//li/a[@href='#tab-6-all6']")
    private WebElement newArrivalsAllLink;
    @FindBy(xpath = "//li[@class='tabli-6-583']")
    private WebElement newArrivalsSpportSupplementsLink;
    @FindBy(xpath = "//li[@class='tabli-6-618']")
    private WebElement newArrivalsHealthyFoodLink;
    @FindBy(xpath = "//li[@class='tabli-6-686']")
    private WebElement newArrivalsVitaminsAndHealthLink;
    @FindBy(xpath = "//li[@class='tabli-6-736']")
    private WebElement newArrivalsSportWearAndAccessoriesLink;
    @FindBy(xpath = "//li[@class='tabli-6-583 active']")
    private WebElement newArrivalsSportSupplementsActiveLink;
    @FindBy(xpath = "//ul[@class='tabs tabs6']/li[@class='active']")
    private WebElement newArrivalsAllActiveLink;
    @FindBy(xpath = "//li[@class='tabli-6-618 active']")
    private WebElement newArrivalsHealthyFoodActiveLink;
    @FindBy(xpath = "//li[@class='tabli-6-686 active']")
    private WebElement newArrivalsVitaminsAndHealthActiveLink;
    @FindBy(xpath = "//li[@class='tabli-6-736 active']")
    private WebElement newArrivalsSportswearAndAccessoriesActiveLink;
    @FindBy(xpath = "(//div[@class='swiper-button-next top-sellers-swiper-button-next'])[5]")
    private WebElement nextBtnInNewArrivalsSection;
    @FindBy(xpath = "//div[@id='tab-6-736']/div[3]/i")
    private WebElement previousBtnInNewArrivalsSection;
    @FindBy(xpath = "//div[@class='left-quetion-block quetion-inner']")
    private WebElement getQuestionBlock;
    @FindBy(xpath = "//*[@title='Call']")
    private WebElement phoneBtn;
    @FindBy(xpath = "//*[text()='Email ']")
    private WebElement emailBtn;
    @FindBy(xpath = "(//a[@title='Start Shopping'])[1]")
    private WebElement sportsSupplementsCategory;
    @FindBy(xpath = "(//a[@title='Start Shopping'])[2]")
    private WebElement healthyFoodCategory;
    @FindBy(xpath = "(//a[@title='Start Shopping'])[3]")
    private WebElement vitaminsAndHealthCategory;
    @FindBy(xpath = "(//a[@title='Start Shopping'])[4]")
    private WebElement sportswearAndAccessoriesCategory;
    @FindBy(xpath = "//div[@class='flex-viewport']")
    private WebElement bannerInRotatingSliderSection;
    @FindBy(xpath = "(//div[@class='nutritious-right'])/a[1]")
    private WebElement firstSideBanner;
    @FindBy(xpath = "(//div[@class='nutritious-right'])/a[2]")
    private WebElement secondSideBanner;
    @FindBy(xpath = "(//div[@class='top-seller-slider']//div[@class='swiper-wrapper'])[1]/div/div/a")
    private List<WebElement> ProductsInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-39-all39']/div/div/div/div/a)[2]")
    private WebElement secondProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-39-all39']/div/div/div/div/a)[3]")
    private WebElement thirdProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-39-all39']/div/div/div/div/a)[4]")
    private WebElement fourthProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-39-all39']/div/div/div/div/a)[5]")
    private WebElement fiveProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@class='top-seller-slider']//div[@class='swiper-wrapper'])[2]/div/div/a")
    private List<WebElement> productsInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-67-all67']/div/div/div/div/a)[2]")
    private WebElement secondProductInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-67-all67']/div/div/div/div/a)[3]")
    private WebElement thirdProductInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-67-all67']/div/div/div/div/a)[4]")
    private WebElement fourthProductInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-67-all67']/div/div/div/div/a)[5]")
    private WebElement fiveProductInTopSellersSection;
    @FindBy(xpath = "(//div[@class='top-seller-slider new-arrival-slider']//div[@class='swiper-wrapper'])[1]/div/div/a")
    private List<WebElement> productsInNewArrivalsSection;
    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[2]")
    private WebElement secondProductInNewArrivalsSection;
    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[3]")
    private WebElement thirdProductInNewArrivalsSection;
    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[4]")
    private WebElement fourthProductInNewArrivalsSection;
    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[5]")
    private WebElement fiveProductInNewArrivalsSection;
    @FindBy(xpath = "(//p[@class='count-container-item amount amount--has-pages'])[1]/span")
    private WebElement resultLabel;
    @FindBy(xpath = "(//p[@class='count-container-item amount amount--has-pages'])[1]")
    private WebElement searchResultValue;
    @FindBy(xpath = "(//li[@class='item pages-item-next']/a)[2]")
    private WebElement NextPageBtn;

    //Main WebElement Test Cases
    public void clickOnViewAllBtnInTopSellingStacksSection() {
        try {
            DataHelperAndWait.waitToBeVisible(viewAllBtnInTopSellingStacksSection,webDriver);
            this.viewAllBtnInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(viewAllBtnInTopSellingStacksSection,webDriver);
            this.viewAllBtnInTopSellingStacksSection.click();
        }

    }

    public void clickOnAllLinkInTopSellerSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(allLink,webDriver);
            this.allLink.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(allLink,webDriver);
            this.allLink.click();
        }
    }
    public void clickOnSportSupplementsLinkInTopSellerSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(sportSupplementsLink,webDriver);
            this.sportSupplementsLink.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(sportSupplementsLink,webDriver);
            this.sportSupplementsLink.click();
        }
    }

    public void clickOnHealthyFoodLinkInTopSellerSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(healthyFoodLink,webDriver);
            this.healthyFoodLink.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(healthyFoodLink,webDriver);
            this.healthyFoodLink.click();
        }
    }
    public void clickOnVitaminsAndHealthLinkInTopSellerSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(vitaminsAndHealthLink,webDriver);
            this.vitaminsAndHealthLink.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(vitaminsAndHealthLink,webDriver);
            this.vitaminsAndHealthLink.click();
        }
    }
    public void clickOnSportswearAndAccessoriesLinkInTopSellerSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(sportswearAndAccessoriesLink,webDriver);
            this.sportswearAndAccessoriesLink.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(sportswearAndAccessoriesLink,webDriver);
            this.sportswearAndAccessoriesLink.click();
        }
    }
    public void clickOnNextButtonInTopSellerSectionInTopSellerSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(nextButtonInTopSellerSection,webDriver);
            this.nextButtonInTopSellerSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(nextButtonInTopSellerSection,webDriver);
            this.nextButtonInTopSellerSection.click();
        }
    }
    public void clickOnNextButtonInTrendingOnSporterSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(nextBtnInTrendingOnSporterSection,webDriver);
            this.nextBtnInTrendingOnSporterSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(nextBtnInTrendingOnSporterSection,webDriver);
            this.nextBtnInTrendingOnSporterSection.click();
        }
    }
    public void clickOnPreviousButtonInTrendingOnSporterSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(previousBtnInTrendingOnSporterSection,webDriver);
            this.previousBtnInTrendingOnSporterSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(previousBtnInTrendingOnSporterSection,webDriver);
            this.previousBtnInTrendingOnSporterSection.click();
        }
    }
    public void clickOnPreviousButtonInTopSellersSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(previousButtonInTopSellerSection,webDriver);
            this.previousButtonInTopSellerSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(previousButtonInTopSellerSection,webDriver);
            this.previousButtonInTopSellerSection.click();
        }
    }
    public void clickOnNextButtonInTopSellersSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(nextButtonInTopSellerSection,webDriver);
            this.nextButtonInTopSellerSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(nextButtonInTopSellerSection,webDriver);
            this.nextButtonInTopSellerSection.click();
        }
    }
    public void clickOnAllLinkInNewArrivalsSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(newArrivalsAllLink,webDriver);
            this.newArrivalsAllLink.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(newArrivalsAllLink,webDriver);
            this.newArrivalsAllLink.click();
        }
    }
    public void clickOnSportSupplementsLinkInNewArrivalsSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(newArrivalsSpportSupplementsLink,webDriver);
            this.newArrivalsSpportSupplementsLink.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(newArrivalsSpportSupplementsLink,webDriver);
            this.newArrivalsSpportSupplementsLink.click();
        }
    }
    public void clickOnHealthyFoodLinkInNewArrivalsSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(newArrivalsHealthyFoodLink,webDriver);
            this.newArrivalsHealthyFoodLink.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(newArrivalsHealthyFoodLink,webDriver);
            this.newArrivalsHealthyFoodLink.click();
        }
    }
    public void clickOnVitaminsAndHealthLinkInNewArrivalsSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(newArrivalsVitaminsAndHealthLink,webDriver);
            this.newArrivalsVitaminsAndHealthLink.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(newArrivalsVitaminsAndHealthLink,webDriver);
            this.newArrivalsVitaminsAndHealthLink.click();
        }
    }
    public void clickOnSportswearAndAccessoriesLinkInNewArrivalsSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(newArrivalsSportWearAndAccessoriesLink,webDriver);
            this.newArrivalsSportWearAndAccessoriesLink.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(newArrivalsSportWearAndAccessoriesLink,webDriver);
            this.newArrivalsSportWearAndAccessoriesLink.click();
        }
    }
    public void clickOnPreviousButtonInNewArrivalSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(previousBtnInNewArrivalsSection,webDriver);
            this.previousBtnInNewArrivalsSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(previousBtnInNewArrivalsSection,webDriver);
            this.previousBtnInNewArrivalsSection.click();
        }
    }
    public void clickOnNextButtonInNewArrivalSection() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(nextBtnInNewArrivalsSection,webDriver);
            this.nextBtnInNewArrivalsSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(nextBtnInNewArrivalsSection,webDriver);
            this.nextBtnInNewArrivalsSection.click();
        }
    }
    public void clickOnPhoneBtn() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(phoneBtn,webDriver);
            this.phoneBtn.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(phoneBtn,webDriver);
            this.phoneBtn.click();
        }
    }
    public void clickOnEmailBtn() {
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(emailBtn,webDriver);
            this.emailBtn.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(emailBtn,webDriver);
            this.emailBtn.click();
        }
    }
    public void clickOnHomePageHorizontalBanner() {
        try{        dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(homePageHorizontalBanner,webDriver);
            this.homePageHorizontalBanner.click();}
        catch(Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(homePageHorizontalBanner,webDriver);
            this.homePageHorizontalBanner.click();
        }
    }
    public void clickOnSportsSupplementsCategory() {
        try{        dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(sportsSupplementsCategory,webDriver);
            this.sportsSupplementsCategory.click();}
        catch(Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(sportsSupplementsCategory,webDriver);
            this.sportsSupplementsCategory.click();
        }
    }
    public void clickOnHealthyFoodCategory() {
        try{        dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(healthyFoodCategory,webDriver);
            this.healthyFoodCategory.click();}
        catch(Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(healthyFoodCategory,webDriver);
            this.healthyFoodCategory.click();
        }
    }
    public void clickOnVitaminsAndHealthCategory() {
        try{        dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(vitaminsAndHealthCategory,webDriver);
            this.vitaminsAndHealthCategory.click();}
        catch(Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(vitaminsAndHealthCategory,webDriver);
            this.vitaminsAndHealthCategory.click();
        }
    }
    public void clickOnSportswearAndAccessoriesCategory() {
        try{        dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(sportswearAndAccessoriesCategory,webDriver);
            this.sportswearAndAccessoriesCategory.click();}
        catch(Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.isDisplayed(sportswearAndAccessoriesCategory,webDriver);
            this.sportswearAndAccessoriesCategory.click();
        }
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
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.secondProductInTopSellingStacksSection,webDriver);
            this.secondProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.secondProductInTopSellingStacksSection,webDriver);
            this.secondProductInTopSellingStacksSection.click();
        }
    }
    public void clickOnThirdProductInTheTopSellingStacksSection(){
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellingStacksSection,webDriver);
            this.thirdProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellingStacksSection,webDriver);
            this.thirdProductInTopSellingStacksSection.click();
        }
    }
    public void clickOnFourthProductInTheTopSellingStacksSection(){
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellingStacksSection,webDriver);
            this.fourthProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellingStacksSection,webDriver);
            this.fourthProductInTopSellingStacksSection.click();
        }
    }
    public void clickOnFifthProductInTheTopSellingStacksSection(){
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellingStacksSection,webDriver);
            this.fiveProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellingStacksSection,webDriver);
            this.fiveProductInTopSellingStacksSection.click();
        }
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
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.secondProductInTopSellersSection,webDriver);
            this.secondProductInTopSellersSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.secondProductInTopSellersSection,webDriver);
            this.secondProductInTopSellersSection.click();
        }
    }
    public void clickOnThirdProductInTheTopSellersSection(){
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellersSection,webDriver);
            this.thirdProductInTopSellersSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellersSection,webDriver);
            this.thirdProductInTopSellersSection.click();
        }
    }
    public void clickOnFourthProductInTheTopSellersSection(){
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellersSection,webDriver);
            this.fourthProductInTopSellersSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellersSection,webDriver);
            this.fourthProductInTopSellersSection.click();
        }
    }
    public void clickOnFifthProductInTheTopSellersSection(){
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellersSection,webDriver);
            this.fiveProductInTopSellersSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellersSection,webDriver);
            this.fiveProductInTopSellersSection.click();
        }
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
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.secondProductInNewArrivalsSection,webDriver);
            this.secondProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.secondProductInNewArrivalsSection,webDriver);
            this.secondProductInNewArrivalsSection.click();
        }
    }
    public void clickOnThirdProductInTheNewArrivalsSection(){
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.thirdProductInNewArrivalsSection,webDriver);
            this.thirdProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.thirdProductInNewArrivalsSection,webDriver);
            this.thirdProductInNewArrivalsSection.click();
        }
    }
    public void clickOnFourthProductInTheNewArrivalsSection(){
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fourthProductInNewArrivalsSection,webDriver);
            this.fourthProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fourthProductInNewArrivalsSection,webDriver);
            this.fourthProductInNewArrivalsSection.click();
        }
    }
    public void clickOnFifthProductInTheNewArrivalsSection(){
        try{
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fiveProductInNewArrivalsSection,webDriver);
            this.fiveProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            dataHelperAndWait= new DataHelperAndWait();
            dataHelperAndWait.waitToBeVisible(this.fiveProductInNewArrivalsSection,webDriver);
            this.fiveProductInNewArrivalsSection.click();
        }
    }
    public void clickOnFirstSideBanner(){
        DataHelperAndWait.waitToBeVisible(firstSideBanner,webDriver);
        firstSideBanner.click();
    }
    public void clickOnSecondSideBanner(){
        DataHelperAndWait.waitToBeVisible(secondSideBanner,webDriver);
        secondSideBanner.click();
    }
    public void clickOnBannerInRotatingSliderSection(){
        DataHelperAndWait.waitToBeVisible(bannerInRotatingSliderSection,webDriver);
        bannerInRotatingSliderSection.click();
    }

}

