package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QatarHomePage extends BasePage {
    public QatarHomePage( WebDriver webDriver ){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public String contactUsUrl = "/contacts-us/#contact-form";

    //declare all locators related to the Cart Page
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;

    public WebElement getContactUsBox() {
        return contactUsBox;
    }

    @FindBy(xpath = "//div[@class='contact-us-box']")
    private WebElement contactUsBox;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='QA']")
    private WebElement qatarCountry;
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
    @FindBy(xpath = "(//ul[@class='clearfix'])[2]/li/a")
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
    @FindBy(xpath = "//*[@class='tab_content tab_content41']")
    private WebElement topSellingStacksSections;
    @FindBy(id = "tab-75-all75")
    private WebElement topSellerSections;
    @FindBy(xpath = "(//a[@class='view-all'])[1]")
    private WebElement viewAllBtnInTopSellingStacksSection;
    @FindBy(xpath = "//li[@class='tabli-75-583']")
    private WebElement sportSupplementsLink;
    @FindBy(xpath = "//*[@href='#tab-75-all75']")
    private WebElement allLink;
    @FindBy(xpath = "//li[@class='tabli-75-618']")
    private WebElement healthyFoodLink;
    @FindBy(xpath = "//li[@class='tabli-75-686']")
    private WebElement vitaminsAndHealthLink;
    @FindBy(xpath = "//li[@class='tabli-75-736']")
    private WebElement sportswearAndAccessoriesLink;
    @FindBy(xpath = "//li[@class='tabli-75-583 active']")
    private WebElement sportSupplementsActiveLink;
    @FindBy(xpath = "//ul[@class='tabs tabs75']/li[@class='active']")
    private WebElement allActiveLink;
    @FindBy(xpath = "//li[@class='tabli-75-618 active']")
    private WebElement healthyFoodActiveLink;
    @FindBy(xpath = "//li[@class='tabli-75-686 active']")
    private WebElement vitaminsAndHealthActiveLink;
    @FindBy(xpath = "//li[@class='tabli-6-686 active']")
    private WebElement newArrivalVitaminsAndHealthActiveLink;
    @FindBy(xpath = "//li[@class='tabli-75-736 active']")
    private WebElement sportswearAndAccessoriesActiveLink;
    @FindBy(xpath = "(//div[@class='swiper-button-next top-sellers-swiper-button-next']/i)[1]")
    private WebElement nextButtonInTopSellerSection;
    @FindBy(xpath = "(//div[@class='swiper-button-prev top-sellers-swiper-button-prev']/i)[1]")
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
    @FindBy(xpath = "//div[@style='transform: translate3d(0px, 0px, 0px); transition-duration: 0ms;']")
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
    private WebElement newArrivalsSportSupplementsLink;
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
    @FindBy(xpath = "(//div[@class='swiper-button-next top-sellers-swiper-button-next']/i)[5]")
    private WebElement nextBtnInNewArrivalsSection;
    @FindBy(xpath = "((//div[@class='swiper-button-prev top-sellers-swiper-button-prev']/i))[1]")
    private WebElement previousBtnInNewArrivalsSection;
    @FindBy(xpath = "//div[@class='left-quetion-block quetion-inner']")
    private WebElement getQuestionBlock;
    @FindBy(xpath = "//*[@title='Call']")
    private WebElement phoneBtn;
    @FindBy(xpath = "//a[@title='Email']")
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
    private List<WebElement> firstProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-41-all41']/div/div/div/div/a)[2]")
    private WebElement secondProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-41-all41']/div/div/div/div/a)[3]")
    private WebElement thirdProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-41-all41']/div/div/div/div/a)[4]")
    private WebElement fourthProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-41-all41']/div/div/div/div/a)[5]")
    private WebElement fiveProductInTopSellingStacksSection;
    @FindBy(xpath = "(//div[@id='tab-75-all75']/div/div/div/div/a)[1]")
    private WebElement firstProductInTopSellersSection;

    @FindBy(xpath = "//div[@id='tab-75-all75']/div/div/div/div/a")
    private List<WebElement> productListInTopSellersSection;

    @FindBy(xpath = "(//div[@id='tab-75-all75']/div/div/div/div/a)[2]")
    private WebElement secondProductInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-75-all75']/div/div/div/div/a)[3]")
    private WebElement thirdProductInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-75-all75']/div/div/div/div/a)[4]")
    private WebElement fourthProductInTopSellersSection;
    @FindBy(xpath = "(//div[@id='tab-75-all75']/div/div/div/div/a)[5]")
    private WebElement fiveProductInTopSellersSection;
    @FindBy(xpath = "//div[@id='tab-6-all6']/div/div/div/div/a")
    private WebElement firstProductInNewArrivalsSection;

    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[2]")
    private WebElement secondProductInNewArrivalsSection;

    @FindBy(xpath = "//div[@id='tab-6-all6']/div/div/div/div/a")
    private List<WebElement> productsListInNewArrivalsSection;

    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[3]")
    private WebElement thirdProductInNewArrivalsSection;
    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[4]")
    private WebElement fourthProductInNewArrivalsSection;
    @FindBy(xpath = "(//div[@id='tab-6-all6']/div/div/div/div/a)[5]")
    private WebElement fiveProductInNewArrivalsSection;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='5'])[2]")
    private WebElement vitmainsForKidsCategory;
    @FindBy(xpath = "(//div[@data-swiper-slide-index='0'])[2]")
    private WebElement gamingAndFocusCategory;


    //Getter Methods
    public WebElement getGamingAndFocusCategory() {
        DataHelperAndWait.waitToBeVisible(gamingAndFocusCategory,8,webDriver);
        return gamingAndFocusCategory;
    }
    public WebElement getVitmainsForKidsCategory() {
        return vitmainsForKidsCategory;
    }
    public WebElement getNextArrowInHomePageRotatingSlider() {
        return nextArrowInHomePageRotatingSlider;
    }
    public List<WebElement> getProductListInTopSellersSection() {
        return productListInTopSellersSection;
    }
    public List<WebElement> getProductsListInNewArrivalsSection() {
        return productsListInNewArrivalsSection;
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

    public WebElement getShopByCategoryHeader() {
        return shopByCategoryHeader;
    }

    public WebElement getTopSellingStacksHeader() {
        return topSellingStacksHeader;
    }

    public WebElement getTopSellerHeader() {
        return topSellerHeader;
    }

    public WebElement getShopByCategorySections(  ) {
        DataHelperAndWait.waitToBeVisible(shopByCategorySections,10,webDriver);
        return shopByCategorySections;
    }

    public WebElement getTopSellerSections() {
        return topSellerSections;
    }
    public WebElement getViewAllBtnInTopSellingStacksSection() {
        return viewAllBtnInTopSellingStacksSection;
    }
    public WebElement getFirstSideBanner() {
        DataHelperAndWait.waitToBeVisible(firstSideBanner,10,webDriver);
        return firstSideBanner;
    }
    public List<WebElement> getFirstProductInTopSellingStacksSection(  ) {
        return firstProductInTopSellingStacksSection;
    }

    public WebElement getSecondProductInTopSellingStacksSection(  ) {
        DataHelperAndWait.waitToBeVisible(secondProductInTopSellingStacksSection,10,webDriver);
        return secondProductInTopSellingStacksSection;
    }

    public WebElement getThirdProductInTopSellingStacksSection(  ) {
        DataHelperAndWait.waitToBeVisible(thirdProductInTopSellingStacksSection,10,webDriver);
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
        DataHelperAndWait.waitToBeVisible(secondSideBanner,8,webDriver);
        return secondSideBanner;
    }
    public WebElement getTopSellingStacksSections() {
        return topSellingStacksSections;
    }

    public WebElement getMegaMenuMainComponent() {
        return megaMenuMainComponent;
    }

    public WebElement getHorizontalBanner(  ) {
        DataHelperAndWait.waitToBeVisible(homePageHorizontalBanner,8,webDriver);
        return homePageHorizontalBanner;
    }

    public List<WebElement> getHomePageRotatingSliderList() {
        return homePageRotatingSliderList;
    }

    public WebElement getShopByOption() {
        return shopByOption;
    }
    public WebElement getBannerInRotatingSliderSection(  ) {
        DataHelperAndWait.waitToBeVisible(bannerInRotatingSliderSection,10,webDriver);
        return bannerInRotatingSliderSection;
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

    public WebElement getNewArrivalVitaminsAndHealthActiveLink() {
        return newArrivalVitaminsAndHealthActiveLink;
    }

    public WebElement getSportswearAndAccessoriesActiveLink() {
        return sportswearAndAccessoriesActiveLink;
    }

    public WebElement getNextButtonInTopSellerSection() {
        return nextButtonInTopSellerSection;
    }

    public WebElement getPreviousButtonInTopSellerSection() {
        DataHelperAndWait.waitToBeVisible(previousButtonInTopSellerSection,10,webDriver);
        return previousButtonInTopSellerSection;
    }

    public WebElement getTrendingOnSporterHeader() {
        return trendingOnSporterHeader;
    }

    public WebElement getTrendingOnSporterSection() {
        return trendingOnSporterSection;
    }

    public WebElement getTrendingOnSporterSectionPositionAfterClickingOnNext(  ) {
        DataHelperAndWait.waitToBeVisible(trendingOnSporterSectionPositionAfterClickingOnNext,10,webDriver);
        return trendingOnSporterSectionPositionAfterClickingOnNext;
    }

    public WebElement getTrendingOnSporterSectionPositionAfterClickingOnPrevious(  ) {
        DataHelperAndWait.waitToBeVisible(trendingOnSporterSectionPositionAfterClickingOnPrevious,10,webDriver);
        return trendingOnSporterSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getTopSellerSectionPositionAfterClickingOnPrevious(  ) {
        DataHelperAndWait.waitToBeVisible(topSellerSectionPositionAfterClickingOnPrevious,10,webDriver);
        return topSellerSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getTopSellerSectionPositionAfterClickingOnNext(  ) {
        DataHelperAndWait.waitToBeVisible(topSellerSectionPositionAfterClickingOnNext,10,webDriver);
        return topSellerSectionPositionAfterClickingOnNext;
    }

    public WebElement getNewArrivalsHeader() {
        return newArrivalsHeader;
    }

    public WebElement getNewArrivalsSection() {
        return newArrivalsSection;
    }

    public WebElement getNewArrivalsAllLink(  ) {
        DataHelperAndWait.waitToBeVisible(newArrivalsAllLink,10,webDriver);
        return newArrivalsAllLink;
    }

    public WebElement getNewArrivalsSportSupplementsLink() {
        return newArrivalsSportSupplementsLink;
    }

    public WebElement getNewArrivalsHealthyFoodLinkLink() {
        return newArrivalsHealthyFoodLink;
    }

    public WebElement getNewArrivalsVitaminsAndHealthLink(  ) {
        DataHelperAndWait.waitToBeVisible(newArrivalsVitaminsAndHealthLink,8,webDriver);
        return newArrivalsVitaminsAndHealthLink;
    }

    public WebElement getNewArrivalsSportWearAndAccessoriesLink(  ) {
        DataHelperAndWait.waitToBeVisible(newArrivalsSportWearAndAccessoriesLink,8,webDriver);
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

    public WebElement getNewArrivalsSectionPositionAfterClickingOnPrevious(  ) {
        DataHelperAndWait.waitToBeVisible(NewArrivalSectionPositionAfterClickingOnPrevious,8,webDriver);
        return NewArrivalSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getNewArrivalsSectionPositionAfterClickingOnNext(  ) {
        DataHelperAndWait.waitToBeVisible(NewArrivalSectionPositionAfterClickingOnNext,8,webDriver);
        return NewArrivalSectionPositionAfterClickingOnNext;
    }

    public WebElement getPreviousBtnInNewArrivalsSection() {
        DataHelperAndWait.waitToBeVisible(previousBtnInNewArrivalsSection,10,webDriver);
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
    public void switchToQatarCountry(  ) {
        try {
            DataHelperAndWait.isDisplayed(countryList, 7,webDriver);
            this.countryList.click();
            DataHelperAndWait.waitToBeVisible(qatarCountry, 10,webDriver);
            this.qatarCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 10,webDriver);
            this.countryList.click();
            DataHelperAndWait.waitToBeVisible(qatarCountry, 10,webDriver);
            this.qatarCountry.click();
        }
    }

    public void clickOnViewAllBtnInTopSellingStacksSection(  ) {
        DataHelperAndWait.isDisplayed(viewAllBtnInTopSellingStacksSection, 10,webDriver);
        this.viewAllBtnInTopSellingStacksSection.click();
    }

    public void clickOnAllLinkInTopSellerSection(  ) {
        try {
        DataHelperAndWait.isDisplayed(allLink, 8,webDriver);
        this.allLink.click();}
        catch (Exception e){
            DataHelperAndWait.isDisplayed(allLink, 1,webDriver);
            this.allLink.click();
        }
    }

    public void clickOnSportSupplementsLinkInTopSellerSection(  ) {
        try{
        DataHelperAndWait.isDisplayed(sportSupplementsLink, 8,webDriver);
        this.sportSupplementsLink.click();}
        catch (Exception e){
            DataHelperAndWait.isDisplayed(sportSupplementsLink, 1,webDriver);
            this.sportSupplementsLink.click();}
    }

    public void clickOnHealthyFoodLinkInTopSellerSection(  ) {
        try{
            DataHelperAndWait.isDisplayed(healthyFoodLink, 8,webDriver);
            this.healthyFoodLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(healthyFoodLink, 1,webDriver);
            this.healthyFoodLink.click();
        }
    }

    public void clickOnVitaminsAndHealthLinkInTopSellerSection() {
        try {
            DataHelperAndWait.waitToBeVisible(vitaminsAndHealthLink, 8,webDriver);
            this.vitaminsAndHealthLink.click();
        }
        catch (Exception e){
        DataHelperAndWait.waitToBeVisible(vitaminsAndHealthLink, 1,webDriver);
        this.vitaminsAndHealthLink.click();
    }}

    public void clickOnSportswearAndAccessoriesLinkInTopSellerSection(  ) {
        try {
            DataHelperAndWait.isDisplayed(sportswearAndAccessoriesLink, 8,webDriver);
            this.sportswearAndAccessoriesLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(sportswearAndAccessoriesLink, 1,webDriver);
            this.sportswearAndAccessoriesLink.click();
        }
    }

    public void clickOnNextButtonInTopSellerSectionInTopSellerSection(  ) {
        try{
        DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 15,webDriver);
        this.nextButtonInTopSellerSection.click();
    }catch (Exception e){
            DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 5,webDriver);
            this.nextButtonInTopSellerSection.click();
        }}

    public void clickOnNextButtonInTrendingOnSporterSection(  ) {
        try {
            DataHelperAndWait.isDisplayed(nextBtnInTrendingOnSporterSection, 10,webDriver);
            this.nextBtnInTrendingOnSporterSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(nextBtnInTrendingOnSporterSection, 6,webDriver);
            this.nextBtnInTrendingOnSporterSection.click();
        }
    }

    public void clickOnPreviousButtonInTrendingOnSporterSection(  ) {
        try {
            DataHelperAndWait.isDisplayed(previousBtnInTrendingOnSporterSection, 10,webDriver);
            this.previousBtnInTrendingOnSporterSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(previousBtnInTrendingOnSporterSection, 6,webDriver);
            this.previousBtnInTrendingOnSporterSection.click();
        }
    }

    public void clickOnPreviousButtonInTopSellersSection(  ) {
        try {
            DataHelperAndWait.isDisplayed(previousButtonInTopSellerSection, 8,webDriver);
            this.previousButtonInTopSellerSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(previousButtonInTopSellerSection, 1,webDriver);
            this.previousButtonInTopSellerSection.click();
        }
    }
    public void clickOnNextButtonInTopSellersSection(  ) {
        try {
            DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 8,webDriver);
            this.nextButtonInTopSellerSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 1,webDriver);
            this.nextButtonInTopSellerSection.click();
        }
    }

    public void clickOnAllLinkInNewArrivalsSection(  ) {
        try {
            DataHelperAndWait.isDisplayed(newArrivalsAllLink, 8,webDriver);
            this.newArrivalsAllLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(newArrivalsAllLink, 1,webDriver);
            this.newArrivalsAllLink.click();
        }
    }
    public void clickOnSportSupplementsLinkInNewArrivalsSection(  ) {
        try {
//            DataHelperAndWait.isDisplayed(newArrivalsSportSupplementsLink, 3);
            DataHelperAndWait.fluentWait(this.newArrivalsSportSupplementsLink,8,10,webDriver);
            this.newArrivalsSportSupplementsLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(newArrivalsSportSupplementsLink, 1,webDriver);
            this.newArrivalsSportSupplementsLink.click();
        }
    }

    public void clickOnHealthyFoodLinkInNewArrivalsSection(  ) {
        try {
//            DataHelperAndWait.isDisplayed(newArrivalsHealthyFoodLink, 2);
            DataHelperAndWait.fluentWait(this.newArrivalsHealthyFoodLink,8,10,webDriver);

            this.newArrivalsHealthyFoodLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(newArrivalsHealthyFoodLink, 1,webDriver);
            this.newArrivalsHealthyFoodLink.click();
        }
    }

    public void clickOnVitaminsAndHealthLinkInNewArrivalsSection(  ) {
        try {
//            DataHelperAndWait.isDisplayed(newArrivalsVitaminsAndHealthLink, 2);
            DataHelperAndWait.fluentWait(this.newArrivalsVitaminsAndHealthLink,8,10,webDriver);

            this.newArrivalsVitaminsAndHealthLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(newArrivalsVitaminsAndHealthLink, 1,webDriver);
            this.newArrivalsVitaminsAndHealthLink.click();
        }
    }
    public void clickOnSportswearAndAccessoriesLinkInNewArrivalsSection(  ) {
        try {
//            DataHelperAndWait.isDisplayed(newArrivalsSportWearAndAccessoriesLink, 2);
            DataHelperAndWait.fluentWait(this.newArrivalsSportWearAndAccessoriesLink,8,10,webDriver);

            this.newArrivalsSportWearAndAccessoriesLink.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(newArrivalsSportWearAndAccessoriesLink, 1,webDriver);
            this.newArrivalsSportWearAndAccessoriesLink.click();
        }
    }

    public void clickOnPreviousButtonInNewArrivalSection(  ) {
        try {
            DataHelperAndWait.isDisplayed(previousBtnInNewArrivalsSection, 8,webDriver);
            this.previousBtnInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(previousBtnInNewArrivalsSection, 1,webDriver);
            this.previousBtnInNewArrivalsSection.click();
        }
    }

    public void clickOnNextButtonInNewArrivalSection(  ) {
        try {
            DataHelperAndWait.waitToBeVisible(nextBtnInNewArrivalsSection,10,webDriver);

            this.nextBtnInNewArrivalsSection.click();
        }
        catch (Exception e){
            this.navigate();
            DataHelperAndWait.waitToBeVisible(nextBtnInNewArrivalsSection,8,webDriver);
            this.nextBtnInNewArrivalsSection.click();
        }
    }

    public void clickOnPhoneBtn(  ) {
        try {
            DataHelperAndWait.isDisplayed(phoneBtn, 15,webDriver);
            this.phoneBtn.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(phoneBtn, 10,webDriver);
            this.phoneBtn.click();
        }
    }
    public void clickOnEmailBtn(  ) {
        try {
            DataHelperAndWait.isDisplayed(emailBtn, 10,webDriver);
            this.emailBtn.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(emailBtn, 3,webDriver);
            this.emailBtn.click();
        }
    }

    public void clickOnHomePageHorizontalBanner(  ) {
        try {
            DataHelperAndWait.isDisplayed(homePageHorizontalBanner, 8,webDriver);
            this.homePageHorizontalBanner.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(homePageHorizontalBanner, 1,webDriver);
            this.homePageHorizontalBanner.click();
        }
    }

    public void clickOnSportsSupplementsCategory(  ) {
        try {
            DataHelperAndWait.isDisplayed(sportsSupplementsCategory, 8,webDriver);
            this.sportsSupplementsCategory.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(sportsSupplementsCategory, 1,webDriver);
            this.sportsSupplementsCategory.click();
        }
    }

    public void clickOnHealthyFoodCategory(  ) {
        try {
            DataHelperAndWait.isDisplayed(healthyFoodCategory, 8,webDriver);
            this.healthyFoodCategory.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(healthyFoodCategory, 1,webDriver);
            this.healthyFoodCategory.click();
        }
    }

    public void clickOnVitaminsAndHealthCategory(  ) {
        try {
            DataHelperAndWait.isDisplayed(vitaminsAndHealthCategory, 8,webDriver);
            this.vitaminsAndHealthCategory.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(vitaminsAndHealthCategory, 1,webDriver);
            this.vitaminsAndHealthCategory.click();
        }
    }

    public void clickOnSportswearAndAccessoriesCategory(  ) {
        try {
            DataHelperAndWait.isDisplayed(sportswearAndAccessoriesCategory, 8,webDriver);
            this.sportswearAndAccessoriesCategory.click();
        }
        catch (Exception e){
            DataHelperAndWait.isDisplayed(sportswearAndAccessoriesCategory, 1,webDriver);
            this.sportswearAndAccessoriesCategory.click();
        }
    }
//    public void clickOnFirstProductInTheTopSellingStacksSection(  ){
//        try{
//            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellingStacksSection,8,webDriver);
//            this.firstProductInTopSellingStacksSection.click();
//        }
//        catch (Exception e){
//            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellingStacksSection,1,webDriver);
//            this.firstProductInTopSellingStacksSection.click();
//        }
//    }

    public void clickOnSecondProductInTheTopSellingStacksSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellingStacksSection,8,webDriver);
            this.secondProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellingStacksSection,1,webDriver);
            this.secondProductInTopSellingStacksSection.click();
        }
    }
    public void clickOnThirdProductInTheTopSellingStacksSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellingStacksSection,8,webDriver);
            this.thirdProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellingStacksSection,1,webDriver);
            this.thirdProductInTopSellingStacksSection.click();
        }
    }
    public void clickOnFourthProductInTheTopSellingStacksSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellingStacksSection,8,webDriver);
            this.fourthProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellingStacksSection,1,webDriver);
            this.fourthProductInTopSellingStacksSection.click();
        }
    }
    public void clickOnFifthProductInTheTopSellingStacksSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellingStacksSection,8,webDriver);
            this.fiveProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellingStacksSection,1,webDriver);
            this.fiveProductInTopSellingStacksSection.click();
        }
    }
    public void clickOnFirstProductInTheTopSellersSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellersSection,8,webDriver);
            this.firstProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellersSection,1,webDriver);
            this.firstProductInTopSellersSection.click();
        }
    }

    public void clickOnSecondProductInTheTopSellersSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellersSection,8,webDriver);
            this.secondProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellersSection,1,webDriver);
            this.secondProductInTopSellersSection.click();
        }
    }
    public void clickOnThirdProductInTheTopSellersSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellersSection,8,webDriver);
            this.thirdProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellersSection,1,webDriver);
            this.thirdProductInTopSellersSection.click();
        }
    }
    public void clickOnFourthProductInTheTopSellersSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellersSection,8,webDriver);
            this.fourthProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellersSection,1,webDriver);
            this.fourthProductInTopSellersSection.click();
        }
    }
    public void clickOnFifthProductInTheTopSellersSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellersSection,8,webDriver);
            this.fiveProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellersSection,1,webDriver);
            this.fiveProductInTopSellersSection.click();
        }
    }
    public void clickOnFirstProductInTheNewArrivalsSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.firstProductInNewArrivalsSection,8,webDriver);
            this.firstProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.firstProductInNewArrivalsSection,1,webDriver);
            this.firstProductInNewArrivalsSection.click();
        }
    }

    public void clickOnSecondProductInTheNewArrivalsSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.secondProductInNewArrivalsSection,8,webDriver);
            this.secondProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.secondProductInNewArrivalsSection,1,webDriver);
            this.secondProductInNewArrivalsSection.click();
        }
    }
    public void clickOnThirdProductInTheNewArrivalsSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.thirdProductInNewArrivalsSection,8,webDriver);
            this.thirdProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.thirdProductInNewArrivalsSection,1,webDriver);
            this.thirdProductInNewArrivalsSection.click();
        }
    }
    public void clickOnFourthProductInTheNewArrivalsSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.fourthProductInNewArrivalsSection,8,webDriver);
            this.fourthProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fourthProductInNewArrivalsSection,1,webDriver);
            this.fourthProductInNewArrivalsSection.click();
        }
    }
    public void clickOnFifthProductInTheNewArrivalsSection(  ){
        try{
            DataHelperAndWait.waitToBeVisible(this.fiveProductInNewArrivalsSection,8,webDriver);
            this.fiveProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fiveProductInNewArrivalsSection,1,webDriver);
            this.fiveProductInNewArrivalsSection.click();
        }
    }
    public void navigate(){webDriver.navigate().to(BaseURL);}

}