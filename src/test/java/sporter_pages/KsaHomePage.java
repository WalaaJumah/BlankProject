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
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='SA']")
    private WebElement saCountry;
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
    @FindBy(xpath = "(//a[@class='product-link'])[1]")
    private WebElement firstProductInTopSellingStacksSection;
    @FindBy(xpath = "(//a[@class='product-link'])[2]")
    private WebElement secondProductInTopSellingStacksSection;
    @FindBy(xpath = "(//a[@class='product-link'])[3]")
    private WebElement thirdProductInTopSellingStacksSection;
    @FindBy(xpath = "(//a[@class='product-link'])[4]")
    private WebElement fourthProductInTopSellingStacksSection;
  @FindBy(xpath = "(//a[@class='product-link'])[5]")
    private WebElement fiveProductInTopSellingStacksSection;
    @FindBy(xpath = "(//a[@class='product-link'])[6]")
    private WebElement firstProductInTopSellersSection;
    @FindBy(xpath = "(//a[@class='product-link'])[7]")
    private WebElement secondProductInTopSellersSection;
    @FindBy(xpath = "(//a[@class='product-link'])[8]")
    private WebElement thirdProductInTopSellersSection;
    @FindBy(xpath = "(//a[@class='product-link'])[9]")
    private WebElement fourthProductInTopSellersSection;
  @FindBy(xpath = "(//a[@class='product-link'])[10]")
    private WebElement fiveProductInTopSellersSection;
    @FindBy(xpath = "(//a[@class='product-link'])[110]")
    private WebElement firstProductInNewArrivalsSection;
    @FindBy(xpath = "(//a[@class='product-link'])[111]")
    private WebElement secondProductInNewArrivalsSection;
    @FindBy(xpath = "(//a[@class='product-link'])[112]")
    private WebElement thirdProductInNewArrivalsSection;
    @FindBy(xpath = "(//a[@class='product-link'])[113]")
    private WebElement fourthProductInNewArrivalsSection;
  @FindBy(xpath = "(//a[@class='product-link'])[114]")
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
        return trendingOnSporterSectionPositionAfterClickingOnNext;
    }

    public WebElement getTrendingOnSporterSectionPositionAfterClickingOnPrevious() {
        return trendingOnSporterSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getTopSellerSectionPositionAfterClickingOnPrevious() {
        return topSellerSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getTopSellerSectionPositionAfterClickingOnNext() {
        return topSellerSectionPositionAfterClickingOnNext;
    }

    public WebElement getNewArrivalsHeader() {
        return newArrivalsHeader;
    }

    public WebElement getNewArrivalsSection() {
        return newArrivalsSection;
    }

    public WebElement getNewArrivalsAllLink() {
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
        return NewArrivalSectionPositionAfterClickingOnPrevious;
    }

    public WebElement getNewArrivalsSectionPositionAfterClickingOnNext() {
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
            DataHelperAndWait.isDisplayed(countryList, 15);
            this.countryList.click();
            DataHelperAndWait.implicitWait(6);
            this.saCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 15);
            this.countryList.click();
            DataHelperAndWait.implicitWait(6);
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
        DataHelperAndWait.isDisplayed(allLink, 10);
        this.allLink.click();
    }

    public void clickOnSportSupplementsLinkInTopSellerSection() {
        DataHelperAndWait.isDisplayed(sportSupplementsLink, 10);
        this.sportSupplementsLink.click();
    }

    public void clickOnHealthyFoodLinkInTopSellerSection() {
        DataHelperAndWait.isDisplayed(healthyFoodLink, 10);
        this.healthyFoodLink.click();
    }

    public void clickOnVitaminsAndHealthLinkInTopSellerSection() {
        DataHelperAndWait.waitToBeVisible(vitaminsAndHealthLink, 10);
        this.vitaminsAndHealthLink.click();
    }

    public void clickOnSportswearAndAccessoriesLinkInTopSellerSection() {
        DataHelperAndWait.isDisplayed(sportswearAndAccessoriesLink, 10);
        this.sportswearAndAccessoriesLink.click();
    }

    public void clickOnNextButtonInTopSellerSectionInTopSellerSection() {
        DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 10);
        this.nextButtonInTopSellerSection.click();
    }

    public void clickOnNextButtonInTrendingOnSporterSection() {
        DataHelperAndWait.isDisplayed(nextBtnInTrendingOnSporterSection, 10);
        this.nextBtnInTrendingOnSporterSection.click();
    }

    public void clickOnPreviousButtonInTrendingOnSporterSection() {
        DataHelperAndWait.isDisplayed(previousBtnInTrendingOnSporterSection, 10);
        this.previousBtnInTrendingOnSporterSection.click();
    }

    public void clickOnPreviousButtonInTopSellersSection() {
        DataHelperAndWait.isDisplayed(previousButtonInTopSellerSection, 10);
        this.previousButtonInTopSellerSection.click();
    }

    public void clickOnNextButtonInTopSellersSection() {
        DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection, 10);
        this.nextButtonInTopSellerSection.click();
    }

    public void clickOnAllLinkInNewArrivalsSection() {
        DataHelperAndWait.isDisplayed(newArrivalsAllLink, 10);
        this.newArrivalsAllLink.click();
    }

    public void clickOnSportSupplementsLinkInNewArrivalsSection() {
        DataHelperAndWait.isDisplayed(newArrivalsSpportSupplementsLink, 10);
        this.newArrivalsSpportSupplementsLink.click();
    }

    public void clickOnHealthyFoodLinkInNewArrivalsSection() {
        DataHelperAndWait.isDisplayed(newArrivalsHealthyFoodLink, 10);
        this.newArrivalsHealthyFoodLink.click();
    }

    public void clickOnVitaminsAndHealthLinkInNewArrivalsSection() {
        DataHelperAndWait.waitToBeVisible(newArrivalsVitaminsAndHealthLink, 10);
        this.newArrivalsVitaminsAndHealthLink.click();
    }

    public void clickOnSportswearAndAccessoriesLinkInNewArrivalsSection() {
        DataHelperAndWait.isDisplayed(newArrivalsSportWearAndAccessoriesLink, 10);
        this.newArrivalsSportWearAndAccessoriesLink.click();
    }

    public void clickOnPreviousButtonInNewArrivalSection() {
        DataHelperAndWait.isDisplayed(previousBtnInNewArrivalsSection, 10);
        this.previousBtnInNewArrivalsSection.click();
    }

    public void clickOnNextButtonInNewArrivalSection() {
        DataHelperAndWait.isDisplayed(nextBtnInNewArrivalsSection, 10);
        this.nextBtnInNewArrivalsSection.click();
    }

    public void clickOnPhoneBtn() {
        DataHelperAndWait.isDisplayed(phoneBtn, 10);
        this.phoneBtn.click();
    }

    public void clickOnEmailBtn() {
        DataHelperAndWait.isDisplayed(emailBtn, 10);
        this.emailBtn.click();
    }

    public void clickOnHomePageHorizontalBanner() {
        try{DataHelperAndWait.isDisplayed(homePageHorizontalBanner, 5);
        this.homePageHorizontalBanner.click();}
        catch(Exception e){
            DataHelperAndWait.isDisplayed(homePageHorizontalBanner, 5);
            this.homePageHorizontalBanner.click();
        }
    }

    public void clickOnSportsSupplementsCategory() {
        DataHelperAndWait.isDisplayed(sportsSupplementsCategory, 10);
        this.sportsSupplementsCategory.click();
    }

    public void clickOnHealthyFoodCategory() {
        DataHelperAndWait.isDisplayed(healthyFoodCategory, 10);
        this.healthyFoodCategory.click();
    }

    public void clickOnVitaminsAndHealthCategory() {
        DataHelperAndWait.isDisplayed(vitaminsAndHealthCategory, 10);
        this.vitaminsAndHealthCategory.click();
    }

    public void clickOnSportswearAndAccessoriesCategory() {
        DataHelperAndWait.isDisplayed(sportswearAndAccessoriesCategory, 10);
        this.sportswearAndAccessoriesCategory.click();
    }
    public void clickOnFirstProductInTheTopSellingStacksSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellingStacksSection,3);
            this.firstProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellingStacksSection,3);
            this.firstProductInTopSellingStacksSection.click();
        }
    }

  public void clickOnSecondProductInTheTopSellingStacksSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellingStacksSection,3);
            this.secondProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellingStacksSection,3);
            this.secondProductInTopSellingStacksSection.click();
        }
    }
  public void clickOnThirdProductInTheTopSellingStacksSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellingStacksSection,3);
            this.thirdProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellingStacksSection,3);
            this.thirdProductInTopSellingStacksSection.click();
        }
    }
  public void clickOnFourthProductInTheTopSellingStacksSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellingStacksSection,3);
            this.fourthProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellingStacksSection,3);
            this.fourthProductInTopSellingStacksSection.click();
        }
    }
  public void clickOnFifthProductInTheTopSellingStacksSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellingStacksSection,3);
            this.fiveProductInTopSellingStacksSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellingStacksSection,3);
            this.fiveProductInTopSellingStacksSection.click();
        }
    }
    public void clickOnFirstProductInTheTopSellersSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellersSection,3);
            this.firstProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.firstProductInTopSellersSection,3);
            this.firstProductInTopSellersSection.click();
        }
    }

  public void clickOnSecondProductInTheTopSellersSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellersSection,3);
            this.secondProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.secondProductInTopSellersSection,3);
            this.secondProductInTopSellersSection.click();
        }
    }
  public void clickOnThirdProductInTheTopSellersSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellersSection,3);
            this.thirdProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.thirdProductInTopSellersSection,3);
            this.thirdProductInTopSellersSection.click();
        }
    }
  public void clickOnFourthProductInTheTopSellersSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellersSection,3);
            this.fourthProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fourthProductInTopSellersSection,3);
            this.fourthProductInTopSellersSection.click();
        }
    }
  public void clickOnFifthProductInTheTopSellersSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellersSection,3);
            this.fiveProductInTopSellersSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fiveProductInTopSellersSection,3);
            this.fiveProductInTopSellersSection.click();
        }
    }
    public void clickOnFirstProductInTheNewArrivalsSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.firstProductInNewArrivalsSection,3);
            this.firstProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.firstProductInNewArrivalsSection,3);
            this.firstProductInNewArrivalsSection.click();
        }
    }

  public void clickOnSecondProductInTheNewArrivalsSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.secondProductInNewArrivalsSection,3);
            this.secondProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.secondProductInNewArrivalsSection,3);
            this.secondProductInNewArrivalsSection.click();
        }
    }
  public void clickOnThirdProductInTheNewArrivalsSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.thirdProductInNewArrivalsSection,3);
            this.thirdProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.thirdProductInNewArrivalsSection,3);
            this.thirdProductInNewArrivalsSection.click();
        }
    }
  public void clickOnFourthProductInTheNewArrivalsSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fourthProductInNewArrivalsSection,3);
            this.fourthProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fourthProductInNewArrivalsSection,3);
            this.fourthProductInNewArrivalsSection.click();
        }
    }
  public void clickOnFifthProductInTheNewArrivalsSection(){
        try{
            DataHelperAndWait.waitToBeVisible(this.fiveProductInNewArrivalsSection,3);
            this.fiveProductInNewArrivalsSection.click();
        }
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(this.fiveProductInNewArrivalsSection,3);
            this.fiveProductInNewArrivalsSection.click();
        }
    }




}