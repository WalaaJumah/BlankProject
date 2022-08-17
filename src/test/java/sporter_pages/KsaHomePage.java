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
    private List<WebElement> homePageRotatingSliderlist;
    @FindBy(css = "ul.slides li.flex-active-slide:nth-child(2)")
    private WebElement homePageRotatingSlider;
    @FindBy(xpath = "//*[@class='flex-control-nav flex-control-paging']")
    private List<WebElement> homePageRotatingSliderPaginglist;
    @FindBy(css = "#maincontent > div.columns > div > div.advertise-banner-3.imagewidgetclass > ul")
    private List<WebElement> homePageUnderShopbyCategoryBanners;
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
    private WebElement megaMenuMaincomponent;
    @FindBy(xpath = "//*[@class='flex-control-nav flex-control-paging']")
    private WebElement homePageRotatingSliderPagingControl;
    @FindBy(xpath = "//div[@class='nutritious-right']")
    private WebElement homePageSideBanner;
    @FindBy(xpath = "//div[@class='advertise-banner-1 imagewidgetclass']")
    private WebElement homePageHorizontalBanner;
    @FindBy(xpath = "//h2[text()='Shop By Category']")
    private WebElement shopByCategoryHeader;
    @FindBy(xpath = "//h2[text()='Top Selling Stacks']")
    private WebElement topSellingStacksHeader;
    @FindBy(xpath = "//h2[text()='Top Selling Stacks']")
    private WebElement topSellerHeader;
    @FindBy(xpath = "//div[@class='shop-category-slider swiper-container swiper-container-horizontal']")
    private WebElement shopByCategorysections;
    @FindBy(xpath = "//*[@class='tab_content tab_content39']")
    private WebElement topSellingStacksSections;
    @FindBy(id = "tab-67-all67")
    private WebElement topSellerSections;
    @FindBy(xpath = "//*[@href='#tab-39-all39']")
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
    private WebElement spportSupplementsActiveLink;
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
    private WebElement trendingOnSporterSectionPostitionAfterClickingOnNext;
    @FindBy(xpath = "//div[@style='transform: translate3d(-1235px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement trendingOnSporterSectionPostitionAfterClickingOnPrevious;
    @FindBy(xpath = "//div[@style='transform: translate3d(0px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement topSellerSectionPostitionAfterClickingOnPrevious;
    @FindBy(xpath = "//div[@style='transform: translate3d(-249px, 0px, 0px); transition-duration: 0ms;']")
    private WebElement topSellerSectionPostitionAfterClickingOnNext;
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
    private WebElement newArrivalsSportwearAndAccessoriesLink;
    @FindBy(xpath = "//li[@class='tabli-6-583 active']")
    private WebElement newArrivalsSpportSupplementsActiveLink;
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
    public WebElement getShopByCategoryHeader() {
        return shopByCategoryHeader;
    }    public WebElement getTopSellingStacksHeader() {
        return topSellingStacksHeader;
    }
    public WebElement getTopSellerHeader() {
        return topSellerHeader;
    }
    public WebElement getShopByCategorySections() {
        return shopByCategorysections;
    }
    public WebElement getTopSellerSections() {
        return topSellerSections;
    }
    public WebElement getTopSellingStacksSections() {
        return topSellingStacksSections;
    }
    public WebElement getMegaMenuMaincomponent() {
        return megaMenuMaincomponent;
    }
    public WebElement getHorizontalBanner() {
        return homePageHorizontalBanner;
    }
    public List<WebElement> getHomePageRotatingSliderlist() {
        return homePageRotatingSliderlist;
    }
    public WebElement getShopeByOption() {
        return shopByOption;}
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
    public List<WebElement> getHomePageRotatingSliderPaginglist() {
        return homePageRotatingSliderPaginglist;
    }
    public List<WebElement> getHomePageUnderShopbyCategoryBanners() {
        return homePageUnderShopbyCategoryBanners;
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
    }    public WebElement getSpportSupplementsActiveLink() {
        return spportSupplementsActiveLink;
    }
    public WebElement getAllLActiveink() {
        return allActiveLink;
    }
    public WebElement getHealthyFoodActiveLink() {
        return healthyFoodActiveLink;
    }
    public WebElement getVitaminsAndHealthActiveLink() {
        return vitaminsAndHealthActiveLink;
    }    public WebElement getVitaminsAndHealthActiveLinkInTopSellersSection() {
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
        return previousBtnInTrendingOnSporterSection;}
    public WebElement getTrendingOnSporterSectionpositionAfterClickingOnNext() {
        return trendingOnSporterSectionPostitionAfterClickingOnNext;}
    public WebElement getTrendingOnSporterSectionpositionAfterClickingOnPrevious() {
        return trendingOnSporterSectionPostitionAfterClickingOnPrevious;}

    public WebElement getTopSellerSectionpositionAfterClickingOnPrevious() {
        return topSellerSectionPostitionAfterClickingOnPrevious;}
    public WebElement getTopSellerSectionpositionAfterClickingOnNext() {
        return topSellerSectionPostitionAfterClickingOnNext;}
    public WebElement getNewArrivalsHeader() {
        return newArrivalsHeader;}
    public WebElement getNewArrivalsSection() {
        return newArrivalsSection;}
    public WebElement getNewArrivalsAllLink() {
        return newArrivalsAllLink;}
    public WebElement getNewArrivalsSpportSupplementsLink() {
        return newArrivalsSpportSupplementsLink;}
    public WebElement getNewArrivalsHealthyFoodLinkLink() {
        return newArrivalsHealthyFoodLink;}
    public WebElement getNewArrivalsVitaminsAndHealthLink() {
        return newArrivalsVitaminsAndHealthLink;}
    public WebElement getNewArrivalsSportwearAndAccessoriesLink() {
        return newArrivalsSportwearAndAccessoriesLink;}
    public WebElement getNewArrivalsAllActiveLink() {
        return newArrivalsAllActiveLink;}
    public WebElement getNewArrivalsSpportSupplementsActiveLink() {
        return newArrivalsSpportSupplementsActiveLink;}
    public WebElement getNewArrivalsHealthyFoodActiveLink() {
        return newArrivalsHealthyFoodActiveLink;}
    public WebElement getNewArrivalsSportwearAndAccessoriesActiveLink() {
        return newArrivalsSportswearAndAccessoriesActiveLink;}

    public WebElement getNewArrivalsSectionPositionAfterClickingOnPrevious() {
        return NewArrivalSectionPositionAfterClickingOnPrevious;}
    public WebElement getNewArrivalsSectionPositionAfterClickingOnNext() {
        return NewArrivalSectionPositionAfterClickingOnNext;}
    public WebElement getPreviousBtnInNewArrivalsSection() {
        return previousBtnInNewArrivalsSection;}
    public WebElement getQuestionBlock(){
        return getQuestionBlock;
    }
    public WebElement getPhoneBtn(){
        return phoneBtn;
    }
    public WebElement getEmailBtn(){
        return emailBtn;
    }

    //Define the main actions we need to execute our TCs
    public void switchToKsaCountry() {try{
        DataHelperAndWait.isDisplayed(countryList, 15);
        this.countryList.click();
        DataHelperAndWait.implicitWait(6);
        this.saCountry.click();}
    catch(Exception e){
        DataHelperAndWait.isDisplayed(countryList, 15);
        this.countryList.click();
        DataHelperAndWait.implicitWait(6);
        this.saCountry.click();
    }
    }
    public void clickOnviewAllBtnInTopSellingStacksSection(){
        DataHelperAndWait.isDisplayed(viewAllBtnInTopSellingStacksSection,10);
        this.viewAllBtnInTopSellingStacksSection.click();
    }
    public void clickOnAllLinkInTopSellerSection(){
        DataHelperAndWait.isDisplayed(allLink,10);
        this.allLink.click();
    }
    public void clickOnSportSupplementsLinkInTopSellerSection(){
        DataHelperAndWait.isDisplayed(sportSupplementsLink,10);
        this.sportSupplementsLink.click();
    }
    public void clickOnHealthyFoodLinkInTopSellerSection(){
        DataHelperAndWait.isDisplayed(healthyFoodLink,10);
        this.healthyFoodLink.click();
    }
    public void clickOnVitaminsAndHealthLinkInTopSellerSection(){
        DataHelperAndWait.waitToBeVisible(vitaminsAndHealthLink,10);
        this.vitaminsAndHealthLink.click();
    }
    public void clickOnSportswearAndAccessoriesLinkInTopSellerSection(){
        DataHelperAndWait.isDisplayed(sportswearAndAccessoriesLink,10);
        this.sportswearAndAccessoriesLink.click();
    }
    public void clickOnNextButtonInTopSellerSectionInTopSellerSection(){
        DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection,10);
        this.nextButtonInTopSellerSection.click();
    }
    public void clickOnNextButtonInTrendingOnSporterSection(){
        DataHelperAndWait.isDisplayed(nextBtnInTrendingOnSporterSection,10);
        this.nextBtnInTrendingOnSporterSection.click();
    }
    public void clickOnPreviousButtonInTrendingOnSporterSection(){
        DataHelperAndWait.isDisplayed(previousBtnInTrendingOnSporterSection,10);
        this.previousBtnInTrendingOnSporterSection.click();
    }
    public void clickOnPreviousButtonInTopSellersSection(){
        DataHelperAndWait.isDisplayed(previousButtonInTopSellerSection,10);
        this.previousButtonInTopSellerSection.click();
    }
    public void clickOnNextButtonInTopSellersSection(){
        DataHelperAndWait.isDisplayed(nextButtonInTopSellerSection,10);
        this.nextButtonInTopSellerSection.click();
    }
    public void clickOnAllLinkInNewArrivalsSection(){
        DataHelperAndWait.isDisplayed(newArrivalsAllLink,10);
        this.newArrivalsAllLink.click();
    }
    public void clickOnSportSupplementsLinkInNewArrivalsSection(){
        DataHelperAndWait.isDisplayed(newArrivalsSpportSupplementsLink,10);
        this.newArrivalsSpportSupplementsLink.click();
    }
    public void clickOnHealthyFoodLinkInNewArrivalsSection(){
        DataHelperAndWait.isDisplayed(newArrivalsHealthyFoodLink,10);
        this.newArrivalsHealthyFoodLink.click();
    }
    public void clickOnVitaminsAndHealthLinkInNewArrivalsSection(){
        DataHelperAndWait.waitToBeVisible(newArrivalsVitaminsAndHealthLink,10);
        this.newArrivalsVitaminsAndHealthLink.click();
    }
    public void clickOnSportswearAndAccessoriesLinkInNewArrivalsSection(){
        DataHelperAndWait.isDisplayed(newArrivalsSportwearAndAccessoriesLink,10);
        this.newArrivalsSportwearAndAccessoriesLink.click();
    }
    public void clickOnPreviousButtonInNewArrivalSection(){
        DataHelperAndWait.isDisplayed(previousBtnInNewArrivalsSection,10);
        this.previousBtnInNewArrivalsSection.click();
    }
    public void clickOnNextButtonInNewArrivalSection(){
        DataHelperAndWait.isDisplayed(nextBtnInNewArrivalsSection,10);
        this.nextBtnInNewArrivalsSection.click();
    }
    public void clickOnPhoneBtn(){
        DataHelperAndWait.isDisplayed(phoneBtn,10);
        this.phoneBtn.click();
    }
    public void clickOnEmailBtn(){
        DataHelperAndWait.isDisplayed(emailBtn,10);
        this.emailBtn.click();
    }
}