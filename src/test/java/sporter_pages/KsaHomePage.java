package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KsaHomePage {
    public KsaHomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    //declare all locators related to the Cart Page
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//ul[@class='dropdown switcher-dropdown']/li[2]")
    private WebElement saCountry;
//    @FindBy(xpath = "//li[@class='country_switch']/span[@class='SA']")
//    private WebElement saCountry;
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
    @FindBy(xpath = "//h2[text()='Top Selling Stacks']")
    private WebElement topSellerHeader;
    @FindBy(xpath = "//div[@class='shop-category-slider swiper-container swiper-container-horizontal']")
    private WebElement shopByCategorySections;
    @FindBy(xpath = "//*[@class='tab_content tab_content39']")
    private WebElement topSellingStacksSections;
    @FindBy(id = "tab-67-all67")
    private WebElement topSellerSections;
    @FindBy(xpath = "(//a[@class='view-all'])[1]")
    private WebElement viewAllBtnInTopSellingStacksSection;
    @FindBy(xpath = "//li[@class='tabli-67-583']")
    private WebElement sportSupplementsLink;
    @FindBy(xpath = "//*[@href='#tab-67-all67']")
    private WebElement allLink;
    @FindBy(xpath = "//li[@class='tabli-67-618']")
    private WebElement healthyFoodLink;
    @FindBy(xpath = "//li[@class='tabli-67-686']")
    private WebElement vitaminsAndHealthLink;
    @FindBy(xpath = "//li[@class='tabli-67-736']")
    private WebElement sportswearAndAccessoriesLink;
    @FindBy(xpath = "//li[@class='tabli-67-583 active']")
    private WebElement sportSupplementsActiveLink;
    @FindBy(xpath = "//ul[@class='tabs tabs67']/li[@class='active']")
    private WebElement allActiveLink;
    @FindBy(xpath = "//li[@class='tabli-67-618 active']")
    private WebElement healthyFoodActiveLink;
    @FindBy(xpath = "//li[@class='tabli-6-686 active']")
    private WebElement vitaminsAndHealthActiveLink;
    @FindBy(xpath = "//li[@class='tabli-67-686 active']")
    private WebElement vitaminsAndHealthActiveLinkInTopeSellersSection;
    @FindBy(xpath = "//li[@class='tabli-67-736 active']")
    private WebElement sportswearAndAccessoriesActiveLink;
    @FindBy(xpath = "//*[@id=\"tab-67-all67\"]/div[2]")
    private WebElement nextButtonInTopSellerSection;
    @FindBy(xpath = "//*[@id=\"tab-67-all67\"]/div[3]")
    private WebElement previousButtonInTopSellerSection;
    @FindBy(xpath = "//h2[text()='Trending on Sporter']")
    private WebElement trendingOnSporterHeader;
    @FindBy(xpath = "//div[@class='swiper-container swiper-container-horizontal trending']")
    private WebElement trendingOnSporterSection;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[8]/div[3]")
    private WebElement nextBtnInTrendingOnSporterSection;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[8]/div[4]")
    private WebElement previousBtnInTrendingOnSporterSection;
    @FindBy(xpath = "//div[@style='transform: translate3d(-1482px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement trendingOnSporterSectionPositionAfterClickingOnNext;
    @FindBy(xpath = "//div[@style='transform: translate3d(-1235px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement trendingOnSporterSectionPositionAfterClickingOnPrevious;
//    @FindBy(xpath = "//div[@style='transform: translate3d(0px, 0px, 0px); transition-duration: 0ms;']")
//    private WebElement topSellerSectionPositionAfterClickingOnPrevious;//
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
    @FindBy(xpath = "//*[@id=\"tab-6-all6\"]/div[2]")
    private WebElement nextBtnInNewArrivalsSection;
    @FindBy(xpath = "//*[@id=\"tab-6-all6\"]/div[3]")
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
    @FindBy(xpath = "(//div[@id='tab-39-all39']/div/div/div/div/a)[1]")
    private WebElement firstProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-39-all39']/div/div/div/div/a)[2]")
    private WebElement secondProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-39-all39']/div/div/div/div/a)[3]")
    private WebElement thirdProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-39-all39']/div/div/div/div/a)[4]")
    private WebElement fourthProductInTopSellingStacksSection;
  @FindBy(xpath = "(//div[@id='tab-39-all39']/div/div/div/div/a)[5]")
    private WebElement fiveProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-67-all67']/div/div/div/div/a)[1]")
    private WebElement firstProductInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-67-all67']/div/div/div/div/a)[2]")
    private WebElement secondProductInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-67-all67']/div/div/div/div/a)[3]")
    private WebElement thirdProductInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-67-all67']/div/div/div/div/a)[4]")
    private WebElement fourthProductInTopSellersSection;
  @FindBy(xpath = "(//div[@id='tab-67-all67']/div/div/div/div/a)[5]")
    private WebElement fiveProductInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[1]")
    private WebElement firstProductInNewArrivalsSection;
    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[2]")
    private WebElement secondProductInNewArrivalsSection;
    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[3]")
    private WebElement thirdProductInNewArrivalsSection;
    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[4]")
    private WebElement fourthProductInNewArrivalsSection;
  @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[5]")
    private WebElement fiveProductInNewArrivalsSection;



    //Getter Methods
    public WebElement getNextArrowInHomePageRotatingSlider() {
        return nextArrowInHomePageRotatingSlider;
    }

    public WebElement getPreviousArrowInHomePageRotatingSlider() {
        return previousArrowInHomePageRotatingSlider;
    }

    public WebElement getHomePageRotatingSliderPagingControl() {
        return homePageRotatingSliderPagingControl;
    }

    public WebElement getHomePageRotatingSlider() {
        return homePageRotatingSlider;
    }

    public WebElement getHomePageSideBanner() {
        return homePageSideBanner;
    }
    public WebElement getFirstSideBanner() {
        return firstSideBanner;
    }
    public WebElement getViewAllBtnInTopSellingStacksSection() {
        return viewAllBtnInTopSellingStacksSection;
    }
    public WebElement getFirstProductInTopSellingStacksSection() {
        return firstProductInTopSellingStacksSection;
    }

    public WebElement getSecondProductInTopSellingStacksSection() {
        return secondProductInTopSellingStacksSection;
    }

    public WebElement getThirdProductInTopSellingStacksSection() {
        return thirdProductInTopSellingStacksSection;
    }

    public WebElement getFourthProductInTopSellingStacksSection() {
        return fourthProductInTopSellingStacksSection;
    }

    public WebElement getFiveProductInTopSellingStacksSection() {
        return fiveProductInTopSellingStacksSection;
    }

    public WebElement getFirstProductInTopSellersSection() {
        return firstProductInTopSellersSection;
    }

    public WebElement getSecondProductInTopSellersSection() {
        return secondProductInTopSellersSection;
    }

    public WebElement getThirdProductInTopSellersSection() {
        return thirdProductInTopSellersSection;
    }

    public WebElement getFourthProductInTopSellersSection() {
        return fourthProductInTopSellersSection;
    }

    public WebElement getFiveProductInTopSellersSection() {
        return fiveProductInTopSellersSection;
    }

    public WebElement getFirstProductInNewArrivalsSection() {
        return firstProductInNewArrivalsSection;
    }

    public WebElement getSecondProductInNewArrivalsSection() {
        return secondProductInNewArrivalsSection;
    }

    public WebElement getThirdProductInNewArrivalsSection() {
        return thirdProductInNewArrivalsSection;
    }

    public WebElement getFourthProductInNewArrivalsSection() {
        return fourthProductInNewArrivalsSection;
    }

    public WebElement getFiveProductInNewArrivalsSection() {
        return fiveProductInNewArrivalsSection;
    }
    public WebElement getSecondSideBanner() {
        return secondSideBanner;
    }

    public WebElement getShopByCategoryHeader() {
        return shopByCategoryHeader;
    }

    public WebElement getTopSellingStacksHeader() {
        return topSellingStacksHeader;
    }

    public WebElement getTopSellerHeader() {
        return topSellerHeader;
    }

    public WebElement getShopByCategorySections() {
        return shopByCategorySections;
    }

    public WebElement getTopSellerSections() {
        return topSellerSections;
    }

    public WebElement getTopSellingStacksSections() {
        return topSellingStacksSections;
    }

    public WebElement getMegaMenuMainComponent() {
        return megaMenuMainComponent;
    }

    public WebElement getHorizontalBanner() {
        return homePageHorizontalBanner;
    }
    public WebElement getBannerInRotatingSliderSection() {
        return bannerInRotatingSliderSection;
    }

    public List<WebElement> getHomePageRotatingSliderList() {
        return homePageRotatingSliderList;
    }

    public WebElement getShopByOption() {
        return shopByOption;
    }

    public WebElement getSportSupplementsOption() {
        return sportSupplementsOption;
    }

    public WebElement getVitaminsAndHealthOption() {
        return vitaminsAndHealthOption;
    }

    public WebElement getHealthyFoodOption() {
        return healthyFoodOption;
    }

    public WebElement getSportsOption() {
        return sportsOption;
    }

    public WebElement getWomenOnlyOption() {
        return womenOnlyOption;
    }

    public List<WebElement> getHomePageRotatingSliderPagingList() {
        return homePageRotatingSliderPagingList;
    }

    public List<WebElement> getHomePageUnderShopByCategoryBanners() {
        return homePageUnderShopByCategoryBanners;
    }

    public WebElement getSportSupplementsLink() {
        return sportSupplementsLink;
    }

    public WebElement getAllLink() {
        return allLink;
    }

    public WebElement getHealthyFoodLink() {
        return healthyFoodLink;
    }

    public WebElement getVitaminsAndHealthLink() {
        return vitaminsAndHealthLink;
    }

    public WebElement getSportswearAndAccessoriesLink() {
        return sportswearAndAccessoriesLink;
    }

    public WebElement getSportSupplementsActiveLink() {
        return sportSupplementsActiveLink;
    }

    public WebElement getAllLActiveLink() {
        return allActiveLink;
    }

    public WebElement getHealthyFoodActiveLink() {
        return healthyFoodActiveLink;
    }

    public WebElement getVitaminsAndHealthActiveLink() {
        return vitaminsAndHealthActiveLink;
    }

    public WebElement getVitaminsAndHealthActiveLinkInTopSellersSection() {
        return vitaminsAndHealthActiveLinkInTopeSellersSection;
    }

    public WebElement getSportswearAndAccessoriesActiveLink() {
        return sportswearAndAccessoriesActiveLink;
    }

    public WebElement getNextButtonInTopSellerSection() {
        return nextButtonInTopSellerSection;
    }

    public WebElement getPreviousButtonInTopSellerSection() {
        return previousButtonInTopSellerSection;
    }

    public WebElement getTrendingOnSporterHeader() {
        return trendingOnSporterHeader;
    }

    public WebElement getTrendingOnSporterSection() {
        return trendingOnSporterSection;
    }

    public WebElement getPreviousBtnInTrendingOnSporterSection() {
        return previousBtnInTrendingOnSporterSection;
    }

    public WebElement getTrendingOnSporterSectionPositionAfterClickingOnNext() {
        DataHelperAndWait.waitToBeVisible(trendingOnSporterSectionPositionAfterClickingOnNext,3);
        return trendingOnSporterSectionPositionAfterClickingOnNext;
    }

    public WebElement getTrendingOnSporterSectionPositionAfterClickingOnPrevious() {
        DataHelperAndWait.waitToBeVisible(trendingOnSporterSectionPositionAfterClickingOnPrevious, 3);
        return trendingOnSporterSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getTopSellerSectionPositionAfterClickingOnPrevious() {
        return topSellerSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getTopSellerSectionPositionAfterClickingOnNext() {
        DataHelperAndWait.waitToBeVisible(topSellerSectionPositionAfterClickingOnNext,3);
        return topSellerSectionPositionAfterClickingOnNext;
    }

    public WebElement getNewArrivalsHeader() {
        return newArrivalsHeader;
    }

    public WebElement getNewArrivalsSection() {
        return newArrivalsSection;
    }

    public WebElement getNewArrivalsAllLink() {
        DataHelperAndWait.waitToBeVisible(newArrivalsAllLink,3);
        return newArrivalsAllLink;
    }

    public WebElement getNewArrivalsSportSupplementsLink() {
        return newArrivalsSpportSupplementsLink;
    }

    public WebElement getNewArrivalsHealthyFoodLinkLink() {
        return newArrivalsHealthyFoodLink;
    }

    public WebElement getNewArrivalsVitaminsAndHealthLink() {
        return newArrivalsVitaminsAndHealthLink;
    }

    public WebElement getNewArrivalsSportWearAndAccessoriesLink() {
        return newArrivalsSportWearAndAccessoriesLink;
    }

    public WebElement getNewArrivalsAllActiveLink() {
        return newArrivalsAllActiveLink;
    }

    public WebElement getNewArrivalsSportSupplementsActiveLink() {
        return newArrivalsSportSupplementsActiveLink;
    }

    public WebElement getNewArrivalsHealthyFoodActiveLink() {
        return newArrivalsHealthyFoodActiveLink;
    }

    public WebElement getNewArrivalsSportWearAndAccessoriesActiveLink() {
        return newArrivalsSportswearAndAccessoriesActiveLink;
    }

    public WebElement getNewArrivalsSectionPositionAfterClickingOnPrevious() {
        DataHelperAndWait.waitToBeVisible(NewArrivalSectionPositionAfterClickingOnPrevious,3);
        return NewArrivalSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getNewArrivalsSectionPositionAfterClickingOnNext() {
        DataHelperAndWait.waitToBeVisible(NewArrivalSectionPositionAfterClickingOnNext,3);
        return NewArrivalSectionPositionAfterClickingOnNext;
    }

    public WebElement getPreviousBtnInNewArrivalsSection() {
        return previousBtnInNewArrivalsSection;
    }

    public WebElement getQuestionBlock() {
        return getQuestionBlock;
    }

    public WebElement getPhoneBtn() {
        return phoneBtn;
    }

    public WebElement getEmailBtn() {
        return emailBtn;
    }

    //Define the main actions we need to execute our TCs
    public void switchToKsaCountry() {
        try {
            DataHelperAndWait.isDisplayed(countryList, 1);
            this.countryList.click();
            this.saCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 2);
            this.countryList.click();
            this.saCountry.click();
        }
    }

    public void clickOnViewAllBtnInTopSellingStacksSection() {
        try {
            DataHelperAndWait.isDisplayed(viewAllBtnInTopSellingStacksSection, 3);
            this.viewAllBtnInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(viewAllBtnInTopSellingStacksSection, 3);
            this.viewAllBtnInTopSellingStacksSection.click();
        }

    }

    public void clickOnAllLinkInTopSellerSection() {
        try{
        DataHelperAndWait.isDisplayed(allLink, 3);
        this.allLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(allLink, 1);
            this.allLink.click();
        }
    }
    public void clickOnSportSupplementsLinkInTopSellerSection() {
        try{
            DataHelperAndWait.isDisplayed(sportSupplementsLink, 3);
            this.sportSupplementsLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(sportSupplementsLink, 1);
            this.sportSupplementsLink.click();
        }
    }

    public void clickOnHealthyFoodLinkInTopSellerSection() {
        try{
            DataHelperAndWait.isDisplayed(healthyFoodLink, 3);
            this.healthyFoodLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(healthyFoodLink, 1);
            this.healthyFoodLink.click();
        }
    }
    public void clickOnVitaminsAndHealthLinkInTopSellerSection() {
        try{
            DataHelperAndWait.isDisplayed(vitaminsAndHealthLink, 3);
            this.vitaminsAndHealthLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(vitaminsAndHealthLink, 1);
            this.vitaminsAndHealthLink.click();
        }
    }
    public void clickOnSportswearAndAccessoriesLinkInTopSellerSection() {
        try{
            DataHelperAndWait.isDisplayed(sportswearAndAccessoriesLink, 3);
            this.sportswearAndAccessoriesLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(sportswearAndAccessoriesLink, 1);
            this.sportswearAndAccessoriesLink.click();
        }
    }
    public void clickOnNextButtonInTopSellerSectionInTopSellerSection() {
        try{
            DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 3);
            this.nextButtonInTopSellerSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 1);
            this.nextButtonInTopSellerSection.click();
        }
    }
    public void clickOnNextButtonInTrendingOnSporterSection() {
        try{
            DataHelperAndWait.isDisplayed(nextBtnInTrendingOnSporterSection, 3);
            this.nextBtnInTrendingOnSporterSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(nextBtnInTrendingOnSporterSection, 1);
            this.nextBtnInTrendingOnSporterSection.click();
        }
    }
    public void clickOnPreviousButtonInTrendingOnSporterSection() {
        try{
            DataHelperAndWait.isDisplayed(previousBtnInTrendingOnSporterSection, 3);
            this.previousBtnInTrendingOnSporterSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(previousBtnInTrendingOnSporterSection, 1);
            this.previousBtnInTrendingOnSporterSection.click();
        }
    }
    public void clickOnPreviousButtonInTopSellersSection() {
        try{
            DataHelperAndWait.isDisplayed(previousButtonInTopSellerSection, 3);
            this.previousButtonInTopSellerSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(previousButtonInTopSellerSection, 1);
            this.previousButtonInTopSellerSection.click();
        }
    }
    public void clickOnNextButtonInTopSellersSection() {
        try{
            DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 3);
            this.nextButtonInTopSellerSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 1);
            this.nextButtonInTopSellerSection.click();
        }
    }
    public void clickOnAllLinkInNewArrivalsSection() {
        try{
            DataHelperAndWait.isDisplayed(newArrivalsAllLink, 3);
            this.newArrivalsAllLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(newArrivalsAllLink, 1);
            this.newArrivalsAllLink.click();
        }
    }
    public void clickOnSportSupplementsLinkInNewArrivalsSection() {
        try{
            DataHelperAndWait.isDisplayed(newArrivalsSpportSupplementsLink, 3);
            this.newArrivalsSpportSupplementsLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(newArrivalsSpportSupplementsLink, 1);
            this.newArrivalsSpportSupplementsLink.click();
        }
    }
    public void clickOnHealthyFoodLinkInNewArrivalsSection() {
        try{
            DataHelperAndWait.isDisplayed(newArrivalsHealthyFoodLink, 3);
            this.newArrivalsHealthyFoodLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(newArrivalsHealthyFoodLink, 1);
            this.newArrivalsHealthyFoodLink.click();
        }
    }
    public void clickOnVitaminsAndHealthLinkInNewArrivalsSection() {
        try{
            DataHelperAndWait.isDisplayed(newArrivalsVitaminsAndHealthLink, 3);
            this.newArrivalsVitaminsAndHealthLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(newArrivalsVitaminsAndHealthLink, 1);
            this.newArrivalsVitaminsAndHealthLink.click();
        }
    }
    public void clickOnSportswearAndAccessoriesLinkInNewArrivalsSection() {
        try{
            DataHelperAndWait.isDisplayed(newArrivalsSportWearAndAccessoriesLink, 3);
            this.newArrivalsSportWearAndAccessoriesLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(newArrivalsSportWearAndAccessoriesLink, 1);
            this.newArrivalsSportWearAndAccessoriesLink.click();
        }
    }
    public void clickOnPreviousButtonInNewArrivalSection() {
        try{
            DataHelperAndWait.isDisplayed(previousBtnInNewArrivalsSection, 3);
            this.previousBtnInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(previousBtnInNewArrivalsSection, 1);
            this.previousBtnInNewArrivalsSection.click();
        }
    }
    public void clickOnNextButtonInNewArrivalSection() {
        try{
            DataHelperAndWait.isDisplayed(nextBtnInNewArrivalsSection, 3);
            this.nextBtnInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(nextBtnInNewArrivalsSection, 1);
            this.nextBtnInNewArrivalsSection.click();
        }
    }
    public void clickOnPhoneBtn() {
        try{
            DataHelperAndWait.isDisplayed(phoneBtn, 3);
            this.phoneBtn.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(phoneBtn, 1);
            this.phoneBtn.click();
        }
    }
    public void clickOnEmailBtn() {
        try{
            DataHelperAndWait.isDisplayed(emailBtn, 3);
            this.emailBtn.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(emailBtn, 1);
            this.emailBtn.click();
        }
    }
    public void clickOnHomePageHorizontalBanner() {
        try{DataHelperAndWait.isDisplayed(homePageHorizontalBanner, 3);
        this.homePageHorizontalBanner.click();}
        catch(Exception e){
            DataHelperAndWait.isDisplayed(homePageHorizontalBanner, 1);
            this.homePageHorizontalBanner.click();
        }
    }
    public void clickOnSportsSupplementsCategory() {
        try{DataHelperAndWait.isDisplayed(sportsSupplementsCategory, 3);
            this.sportsSupplementsCategory.click();}
        catch(Exception e){
            DataHelperAndWait.isDisplayed(sportsSupplementsCategory, 1);
            this.sportsSupplementsCategory.click();
        }
    }
    public void clickOnHealthyFoodCategory() {
        try{DataHelperAndWait.isDisplayed(healthyFoodCategory, 3);
            this.healthyFoodCategory.click();}
        catch(Exception e){
            DataHelperAndWait.isDisplayed(healthyFoodCategory, 1);
            this.healthyFoodCategory.click();
        }
    }
    public void clickOnVitaminsAndHealthCategory() {
        try{DataHelperAndWait.isDisplayed(vitaminsAndHealthCategory, 3);
            this.vitaminsAndHealthCategory.click();}
        catch(Exception e){
            DataHelperAndWait.isDisplayed(vitaminsAndHealthCategory, 1);
            this.vitaminsAndHealthCategory.click();
        }
    }
    public void clickOnSportswearAndAccessoriesCategory() {
        try{DataHelperAndWait.isDisplayed(sportswearAndAccessoriesCategory, 3);
            this.sportswearAndAccessoriesCategory.click();}
        catch(Exception e){
            DataHelperAndWait.isDisplayed(sportswearAndAccessoriesCategory, 1);
            this.sportswearAndAccessoriesCategory.click();
        }
    }
    public void clickOnFirstProductInTheTopSellingStacksSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellingStacksSection,3);
            this.firstProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellingStacksSection,1);
            this.firstProductInTopSellingStacksSection.click();
        }
    }

  public void clickOnSecondProductInTheTopSellingStacksSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellingStacksSection,3);
            this.secondProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellingStacksSection,1);
            this.secondProductInTopSellingStacksSection.click();
        }
    }
  public void clickOnThirdProductInTheTopSellingStacksSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellingStacksSection,3);
            this.thirdProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellingStacksSection,1);
            this.thirdProductInTopSellingStacksSection.click();
        }
    }
  public void clickOnFourthProductInTheTopSellingStacksSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellingStacksSection,3);
            this.fourthProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellingStacksSection,1);
            this.fourthProductInTopSellingStacksSection.click();
        }
    }
  public void clickOnFifthProductInTheTopSellingStacksSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellingStacksSection,3);
            this.fiveProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellingStacksSection,1);
            this.fiveProductInTopSellingStacksSection.click();
        }
    }
    public void clickOnFirstProductInTheTopSellersSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellersSection,3);
            this.firstProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellersSection,1);
            this.firstProductInTopSellersSection.click();
        }
    }

  public void clickOnSecondProductInTheTopSellersSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellersSection,3);
            this.secondProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellersSection,1);
            this.secondProductInTopSellersSection.click();
        }
    }
  public void clickOnThirdProductInTheTopSellersSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellersSection,3);
            this.thirdProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellersSection,1);
            this.thirdProductInTopSellersSection.click();
        }
    }
  public void clickOnFourthProductInTheTopSellersSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellersSection,3);
            this.fourthProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellersSection,1);
            this.fourthProductInTopSellersSection.click();
        }
    }
  public void clickOnFifthProductInTheTopSellersSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellersSection,3);
            this.fiveProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellersSection,1);
            this.fiveProductInTopSellersSection.click();
        }
    }
    public void clickOnFirstProductInTheNewArrivalsSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.firstProductInNewArrivalsSection,3);
            this.firstProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.firstProductInNewArrivalsSection,1);
            this.firstProductInNewArrivalsSection.click();
        }
    }

  public void clickOnSecondProductInTheNewArrivalsSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.secondProductInNewArrivalsSection,3);
            this.secondProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.secondProductInNewArrivalsSection,1);
            this.secondProductInNewArrivalsSection.click();
        }
    }
  public void clickOnThirdProductInTheNewArrivalsSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.thirdProductInNewArrivalsSection,3);
            this.thirdProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.thirdProductInNewArrivalsSection,1);
            this.thirdProductInNewArrivalsSection.click();
        }
    }
  public void clickOnFourthProductInTheNewArrivalsSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fourthProductInNewArrivalsSection,3);
            this.fourthProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fourthProductInNewArrivalsSection,1);
            this.fourthProductInNewArrivalsSection.click();
        }
    }
  public void clickOnFifthProductInTheNewArrivalsSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fiveProductInNewArrivalsSection,3);
            this.fiveProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fiveProductInNewArrivalsSection,1);
            this.fiveProductInNewArrivalsSection.click();
        }
    }




}