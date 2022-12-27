package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KsaHomePage extends BasePage {
    public KsaHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;

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
    @FindBy(xpath = "(//div[@class='swiper-button-next top-sellers-swiper-button-next'])[4]")
    private WebElement nextButtonInTopSellerSection;
    @FindBy(xpath = "(//div[@class='swiper-button-prev top-sellers-swiper-button-prev'])[1]")
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
    @FindBy(xpath = "(//div[@class='swiper-button-next top-sellers-swiper-button-next']/i)[8]")
    private WebElement nextBtnInNewArrivalsSection;
    @FindBy(xpath = "((//div[@class='swiper-button-prev top-sellers-swiper-button-prev']/i))[1]")
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
    @FindBy(xpath = "(//p[@class='count-container-item amount amount--has-pages'])[1]/span")
    private WebElement resultLabel;
    @FindBy(xpath = "(//p[@class='count-container-item amount amount--has-pages'])[1]")
    private WebElement searchResultValue;
    @FindBy(xpath = "(//li[@class='item pages-item-next']/a)[2]")
    private WebElement NextPageBtn;

    //Getter Methods
    public WebElement getNextArrowInHomePageRotatingSlider() {
        return nextArrowInHomePageRotatingSlider;
    }

    public WebElement getPreviousArrowInHomePageRotatingSlider( ) {
                dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(previousArrowInHomePageRotatingSlider,3,webDriver);
        return previousArrowInHomePageRotatingSlider;
    }
    public WebElement getNextPageBtn() {
        return NextPageBtn;
    }
    public WebElement getSearchResultValue() {
        DataHelperAndWait.waitToBeVisible(searchResultValue,2,webDriver);
        return searchResultValue;
    }

    public WebElement getHomePageRotatingSliderPagingControl() {
                dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(homePageRotatingSliderPagingControl,3,webDriver);
        return homePageRotatingSliderPagingControl;
    }

    public WebElement getHomePageRotatingSlider() {
                dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(homePageRotatingSlider,3,webDriver);
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
        dataHelperAndWait= new DataHelperAndWait();
        dataHelperAndWait.waitToBeVisible(shopByCategorySections,3,webDriver);
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
                dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(trendingOnSporterSectionPositionAfterClickingOnNext,3,webDriver);
        return trendingOnSporterSectionPositionAfterClickingOnNext;
    }

    public WebElement getTrendingOnSporterSectionPositionAfterClickingOnPrevious() {
                dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(trendingOnSporterSectionPositionAfterClickingOnPrevious, 3,webDriver);
        return trendingOnSporterSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getTopSellerSectionPositionAfterClickingOnPrevious() {
        return topSellerSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getTopSellerSectionPositionAfterClickingOnNext() {
                dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(topSellerSectionPositionAfterClickingOnNext,3,webDriver);
        return topSellerSectionPositionAfterClickingOnNext;
    }

    public WebElement getNewArrivalsHeader() {
        return newArrivalsHeader;
    }

    public WebElement getNewArrivalsSection() {
        return newArrivalsSection;
    }

    public WebElement getNewArrivalsAllLink() {
                dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(newArrivalsAllLink,3,webDriver);
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
                dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(NewArrivalSectionPositionAfterClickingOnPrevious,3,webDriver);
        return NewArrivalSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getNewArrivalsSectionPositionAfterClickingOnNext() {
                dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(NewArrivalSectionPositionAfterClickingOnNext,3,webDriver);
        return NewArrivalSectionPositionAfterClickingOnNext;
    }

    public WebElement getPreviousBtnInNewArrivalsSection() {
        DataHelperAndWait.waitToBeVisible(previousBtnInNewArrivalsSection,5,webDriver);
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
                DataHelperAndWait.waitToBeVisible(countryList, 5,webDriver);
                this.countryList.click();
                DataHelperAndWait.waitToBeVisible(saCountry, 5,webDriver);
                this.saCountry.click();
            } catch (Exception e) {
                DataHelperAndWait.waitToBeVisible(countryList, 5,webDriver);
                this.countryList.click();
                DataHelperAndWait.waitToBeVisible(saCountry, 5,webDriver);
                this.saCountry.click();
            }}

    public void clickOnViewAllBtnInTopSellingStacksSection() {
        try {
            DataHelperAndWait.waitToBeVisible(viewAllBtnInTopSellingStacksSection, 5,webDriver);
            this.viewAllBtnInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(viewAllBtnInTopSellingStacksSection, 3,webDriver);
            this.viewAllBtnInTopSellingStacksSection.click();
        }

    }

    public void clickOnAllLinkInTopSellerSection() {
        try{
                dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(allLink, 3,webDriver);
        this.allLink.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(allLink, 1,webDriver);
            this.allLink.click();
        }
    }
    public void clickOnSportSupplementsLinkInTopSellerSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(sportSupplementsLink, 3,webDriver);
            this.sportSupplementsLink.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(sportSupplementsLink, 1,webDriver);
            this.sportSupplementsLink.click();
        }
    }

    public void clickOnHealthyFoodLinkInTopSellerSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(healthyFoodLink, 3,webDriver);
            this.healthyFoodLink.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(healthyFoodLink, 1,webDriver);
            this.healthyFoodLink.click();
        }
    }
    public void clickOnVitaminsAndHealthLinkInTopSellerSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(vitaminsAndHealthLink, 3,webDriver);
            this.vitaminsAndHealthLink.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(vitaminsAndHealthLink, 1,webDriver);
            this.vitaminsAndHealthLink.click();
        }
    }
    public void clickOnSportswearAndAccessoriesLinkInTopSellerSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(sportswearAndAccessoriesLink, 3,webDriver);
            this.sportswearAndAccessoriesLink.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(sportswearAndAccessoriesLink, 1,webDriver);
            this.sportswearAndAccessoriesLink.click();
        }
    }
    public void clickOnNextButtonInTopSellerSectionInTopSellerSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 3,webDriver);
            this.nextButtonInTopSellerSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 1,webDriver);
            this.nextButtonInTopSellerSection.click();
        }
    }
    public void clickOnNextButtonInTrendingOnSporterSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(nextBtnInTrendingOnSporterSection, 3,webDriver);
            this.nextBtnInTrendingOnSporterSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(nextBtnInTrendingOnSporterSection, 1,webDriver);
            this.nextBtnInTrendingOnSporterSection.click();
        }
    }
    public void clickOnPreviousButtonInTrendingOnSporterSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(previousBtnInTrendingOnSporterSection, 3,webDriver);
            this.previousBtnInTrendingOnSporterSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(previousBtnInTrendingOnSporterSection, 1,webDriver);
            this.previousBtnInTrendingOnSporterSection.click();
        }
    }
    public void clickOnPreviousButtonInTopSellersSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(previousButtonInTopSellerSection, 3,webDriver);
            this.previousButtonInTopSellerSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(previousButtonInTopSellerSection, 1,webDriver);
            this.previousButtonInTopSellerSection.click();
        }
    }
    public void clickOnNextButtonInTopSellersSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 3,webDriver);
            this.nextButtonInTopSellerSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 1,webDriver);
            this.nextButtonInTopSellerSection.click();
        }
    }
    public void clickOnAllLinkInNewArrivalsSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(newArrivalsAllLink, 3,webDriver);
            this.newArrivalsAllLink.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(newArrivalsAllLink, 1,webDriver);
            this.newArrivalsAllLink.click();
        }
    }
    public void clickOnSportSupplementsLinkInNewArrivalsSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(newArrivalsSpportSupplementsLink, 3,webDriver);
            this.newArrivalsSpportSupplementsLink.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(newArrivalsSpportSupplementsLink, 1,webDriver);
            this.newArrivalsSpportSupplementsLink.click();
        }
    }
    public void clickOnHealthyFoodLinkInNewArrivalsSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(newArrivalsHealthyFoodLink, 3,webDriver);
            this.newArrivalsHealthyFoodLink.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(newArrivalsHealthyFoodLink, 1,webDriver);
            this.newArrivalsHealthyFoodLink.click();
        }
    }
    public void clickOnVitaminsAndHealthLinkInNewArrivalsSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(newArrivalsVitaminsAndHealthLink, 3,webDriver);
            this.newArrivalsVitaminsAndHealthLink.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(newArrivalsVitaminsAndHealthLink, 1,webDriver);
            this.newArrivalsVitaminsAndHealthLink.click();
        }
    }
    public void clickOnSportswearAndAccessoriesLinkInNewArrivalsSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(newArrivalsSportWearAndAccessoriesLink, 3,webDriver);
            this.newArrivalsSportWearAndAccessoriesLink.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(newArrivalsSportWearAndAccessoriesLink, 1,webDriver);
            this.newArrivalsSportWearAndAccessoriesLink.click();
        }
    }
    public void clickOnPreviousButtonInNewArrivalSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(previousBtnInNewArrivalsSection, 3,webDriver);
            this.previousBtnInNewArrivalsSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(previousBtnInNewArrivalsSection, 1,webDriver);
            this.previousBtnInNewArrivalsSection.click();
        }
    }
    public void clickOnNextButtonInNewArrivalSection() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(nextBtnInNewArrivalsSection, 3,webDriver);
            this.nextBtnInNewArrivalsSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(nextBtnInNewArrivalsSection, 1,webDriver);
            this.nextBtnInNewArrivalsSection.click();
        }
    }
    public void clickOnPhoneBtn() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(phoneBtn, 3,webDriver);
            this.phoneBtn.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(phoneBtn, 1,webDriver);
            this.phoneBtn.click();
        }
    }
    public void clickOnEmailBtn() {
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(emailBtn, 3,webDriver);
            this.emailBtn.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(emailBtn, 1,webDriver);
            this.emailBtn.click();
        }
    }
    public void clickOnHomePageHorizontalBanner() {
        try{        dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(homePageHorizontalBanner, 3,webDriver);
        this.homePageHorizontalBanner.click();}
        catch(Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(homePageHorizontalBanner, 1,webDriver);
            this.homePageHorizontalBanner.click();
        }
    }
    public void clickOnSportsSupplementsCategory() {
        try{        dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(sportsSupplementsCategory, 3,webDriver);
            this.sportsSupplementsCategory.click();}
        catch(Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(sportsSupplementsCategory, 2,webDriver);
            this.sportsSupplementsCategory.click();
        }
    }
    public void clickOnHealthyFoodCategory() {
        try{        dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(healthyFoodCategory, 3,webDriver);
            this.healthyFoodCategory.click();}
        catch(Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(healthyFoodCategory, 1,webDriver);
            this.healthyFoodCategory.click();
        }
    }
    public void clickOnVitaminsAndHealthCategory() {
        try{        dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(vitaminsAndHealthCategory, 3,webDriver);
            this.vitaminsAndHealthCategory.click();}
        catch(Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(vitaminsAndHealthCategory, 1,webDriver);
            this.vitaminsAndHealthCategory.click();
        }
    }
    public void clickOnSportswearAndAccessoriesCategory() {
        try{        dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(sportswearAndAccessoriesCategory, 3,webDriver);
            this.sportswearAndAccessoriesCategory.click();}
        catch(Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.isDisplayed(sportswearAndAccessoriesCategory, 1,webDriver);
            this.sportswearAndAccessoriesCategory.click();
        }
    }
    public void clickOnFirstProductInTheTopSellingStacksSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.firstProductInTopSellingStacksSection,3,webDriver);
            this.firstProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.firstProductInTopSellingStacksSection,1,webDriver);
            this.firstProductInTopSellingStacksSection.click();
        }
    }

  public void clickOnSecondProductInTheTopSellingStacksSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.secondProductInTopSellingStacksSection,3,webDriver);
            this.secondProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.secondProductInTopSellingStacksSection,1,webDriver);
            this.secondProductInTopSellingStacksSection.click();
        }
    }
  public void clickOnThirdProductInTheTopSellingStacksSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellingStacksSection,3,webDriver);
            this.thirdProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellingStacksSection,1,webDriver);
            this.thirdProductInTopSellingStacksSection.click();
        }
    }
  public void clickOnFourthProductInTheTopSellingStacksSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellingStacksSection,3,webDriver);
            this.fourthProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellingStacksSection,1,webDriver);
            this.fourthProductInTopSellingStacksSection.click();
        }
    }
  public void clickOnFifthProductInTheTopSellingStacksSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellingStacksSection,3,webDriver);
            this.fiveProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellingStacksSection,1,webDriver);
            this.fiveProductInTopSellingStacksSection.click();
        }
    }
    public void clickOnFirstProductInTheTopSellersSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.firstProductInTopSellersSection,3,webDriver);
            this.firstProductInTopSellersSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.firstProductInTopSellersSection,1,webDriver);
            this.firstProductInTopSellersSection.click();
        }
    }

  public void clickOnSecondProductInTheTopSellersSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.secondProductInTopSellersSection,3,webDriver);
            this.secondProductInTopSellersSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.secondProductInTopSellersSection,1,webDriver);
            this.secondProductInTopSellersSection.click();
        }
    }
  public void clickOnThirdProductInTheTopSellersSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellersSection,3,webDriver);
            this.thirdProductInTopSellersSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellersSection,1,webDriver);
            this.thirdProductInTopSellersSection.click();
        }
    }
  public void clickOnFourthProductInTheTopSellersSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellersSection,3,webDriver);
            this.fourthProductInTopSellersSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellersSection,1,webDriver);
            this.fourthProductInTopSellersSection.click();
        }
    }
  public void clickOnFifthProductInTheTopSellersSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellersSection,3,webDriver);
            this.fiveProductInTopSellersSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellersSection,1,webDriver);
            this.fiveProductInTopSellersSection.click();
        }
    }
    public void clickOnFirstProductInTheNewArrivalsSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.firstProductInNewArrivalsSection,3,webDriver);
            this.firstProductInNewArrivalsSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.firstProductInNewArrivalsSection,1,webDriver);
            this.firstProductInNewArrivalsSection.click();
        }
    }

  public void clickOnSecondProductInTheNewArrivalsSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.secondProductInNewArrivalsSection,3,webDriver);
            this.secondProductInNewArrivalsSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.secondProductInNewArrivalsSection,1,webDriver);
            this.secondProductInNewArrivalsSection.click();
        }
    }
  public void clickOnThirdProductInTheNewArrivalsSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.thirdProductInNewArrivalsSection,3,webDriver);
            this.thirdProductInNewArrivalsSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.thirdProductInNewArrivalsSection,1,webDriver);
            this.thirdProductInNewArrivalsSection.click();
        }
    }
  public void clickOnFourthProductInTheNewArrivalsSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fourthProductInNewArrivalsSection,3,webDriver);
            this.fourthProductInNewArrivalsSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fourthProductInNewArrivalsSection,1,webDriver);
            this.fourthProductInNewArrivalsSection.click();
        }
    }
  public void clickOnFifthProductInTheNewArrivalsSection(){
        try{
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fiveProductInNewArrivalsSection,3,webDriver);
            this.fiveProductInNewArrivalsSection.click();
        }
        catch (Exception e){
                    dataHelperAndWait= new DataHelperAndWait();
dataHelperAndWait.waitToBeVisible(this.fiveProductInNewArrivalsSection,1,webDriver);
            this.fiveProductInNewArrivalsSection.click();
        }
    }

public void navigate(){webDriver.navigate().to(siteURL);}


}