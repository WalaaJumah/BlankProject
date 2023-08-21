/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class contains all elements related to the Home Page
 */

package sporter_pages.homepage_classes;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

@Getter
public class HomePage extends BasePage {
    public final String jordanDomain = "/en-jo";
    public final String kSAArabicDomain = "/ar-jo";
    DataHelperAndWait dataHelperAndWait;
    @FindBy(id = "downArrow")
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
    @FindBy(xpath = "//div[@id='crouselContainer']//div[@class='swiper-pagination swiper-pagination-clickable swiper-pagination-bullets swiper-pagination-horizontal']/span")
    private List<WebElement> homePageRotatingSliderPagingList;

    @FindBy(id = "AdvertiseContainersecond")
    private List<WebElement> homePageUnderShopByCategoryBanners;
      @FindBy(xpath = "//div[@id='AdvertiseContainersecond']//a")
    private List<WebElement> underShopByCategoryBanners;

    @FindBy(xpath = "//ul[@id='TopCategoryList']/li[1]")
    private WebElement shopByOption;
    @FindBy(xpath = "//ul[@id='TopCategoryList']/li[2]")
    private WebElement sportSupplementsOption;
    @FindBy(xpath = "//ul[@id='TopCategoryList']/li[3]")
    private WebElement vitaminsAndHealthOption;
    @FindBy(xpath = "//ul[@id='TopCategoryList']/li[4]")
    private WebElement healthyFoodOption;
    @FindBy(xpath = "//ul[@id='TopCategoryList']/li[5]")
    private WebElement sportsOption;
    @FindBy(xpath = "//ul[@id='TopCategoryList']/li[6]")
    private WebElement womenOnlyOption;
    @FindBy(id = "//ul[@class='nav-primary']")
    private WebElement megaMenuMainComponent;
    @FindBy(xpath = "//div[@class='swiper-pagination swiper-pagination-clickable swiper-pagination-bullets swiper-pagination-horizontal']")
    private WebElement homePageRotatingSliderPagingControl;
    @FindBy(id = "crousel_imagesContainer")
    private WebElement homePageSideBanner;
    @FindBy(id = "AdvertiseLink0first")
    private WebElement homePageHorizontalBanner;
    @FindBy(id = "ShopByCategoryTitle")
    private WebElement shopByCategoryHeader;
    @FindBy(id = "CategoryProductsTitle_mostSelling")
    private WebElement topSellingStacksHeader;
    @FindBy(id = "CategoryProductsTitle_topSeller")
    private WebElement topSellerHeader;
    @FindBy(id = "ShopByCategoryContainer")
    private WebElement shopByCategorySections;
    @FindBy(css = "#Swiper_mostSelling > div.swiper-wrapper")
    private WebElement topSellingStacksSections;
    @FindBy(id = "Swiper_topSeller")
    private WebElement topSellerSections;
    @FindBy(xpath = "//ul[@id='OptionsContainer_topSeller']/li")
    private List<WebElement> topSellerCategoriesTabs;
    @FindBy(xpath = "//ul[@id='OptionsContainerOptions_newArrival']/li")
    private List<WebElement> newArrivalsCategoriesTabs;
    @FindBy(id = "OptionsContainerOptions_allmostSelling")
    private WebElement viewAllBtnInTopSellingStacksSection;
    @FindBy(id = "OptionsContainerOptions_0topSeller")
    private WebElement sportSupplementsLinkInTopSellers;
    @FindBy(id = "OptionsContainerOptions_allmostSelling")
    private WebElement allLinkInTopSellers;
    @FindBy(id = "OptionsContainerOptions_2topSeller")
    private WebElement healthyFoodLinkInTopSellers;
    @FindBy(id = "OptionsContainerOptions_1topSeller")
    private WebElement vitaminsAndHealthLinkInTopSellers;
    @FindBy(id = "OptionsContainerOptions_3topSeller")
    private WebElement sportswearAndAccessoriesLinkInTopSellers;
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
    @FindBy(id = "ControllersrtArrow_topSeller")
    private WebElement nextButtonInTopSellerSection;
    @FindBy(id = "ControllersLtArrow_topSeller")
    private WebElement previousButtonInTopSellerSection;
    @FindBy(id = "Trendscontainer_title")
    private WebElement trendingOnSporterHeader;
    @FindBy(id = "Trendscontainer")
    private WebElement trendingOnSporterSection;
    @FindBy(id = "//div[@class='trending-swiper-button-next']/i")
    private WebElement nextBtnInTrendingOnSporterSection;
    @FindBy(id = "//div[@class='trending-swiper-button-prev']/i")
    private WebElement previousBtnInTrendingOnSporterSection;
    @FindBy(id = "CategoryProductsTitle_newArrival")
    private WebElement newArrivalsHeader;
    @FindBy(id = "Swiper_newArrival")
    private WebElement newArrivalsSection;
    @FindBy(id = "OptionsContainerOptions_allnewArrival")
    private WebElement newArrivalsAllLink;
    @FindBy(id = "OptionsContainerOptions_allnewArrival")
    private WebElement newArrivalsSpportSupplementsLink;
    @FindBy(id = "OptionsContainerOptions_1newArrival")
    private WebElement newArrivalsHealthyFoodLink;
    @FindBy(id = "OptionsContainerOptions_2newArrival")
    private WebElement newArrivalsVitaminsAndHealthLink;
    @FindBy(id = "OptionsContainerOptions_3newArrival")
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
    @FindBy(id = "ControllersrtArrow_newArrival")
    private WebElement nextBtnInNewArrivalsSection;
    @FindBy(id = "ControllersLtArrow_mostselling")
    private WebElement nextBtnInTopSellingStacksSection;
    @FindBy(id = "ControllersLtArrow_newArrival")
    private WebElement previousBtnInNewArrivalsSection;
    @FindBy(xpath = "(//div[@class='contactForm_container'])[1]")
    private WebElement getQuestionBlock;
    @FindBy(xpath = "//*[@title='Call']")
    private WebElement phoneBtn;
    @FindBy(xpath = "//*[@title='Email']")
    private WebElement emailBtn;
    @FindBy(id = "ShopByCategoryItemBtn0")
    private WebElement sportsSupplementsCategory;
    @FindBy(id = "ShopByCategoryItemBtn1")
    private WebElement healthyFoodCategory;
    @FindBy(id = "ShopByCategoryItemBtn2")
    private WebElement vitaminsAndHealthCategory;
    @FindBy(id = "ShopByCategoryItemBtn3")
    private WebElement sportswearAndAccessoriesCategory;
    @FindBy(xpath = "//div[@id='HomeHeaderContainer']/div[@id='crouselContainer']")
    private WebElement bannerInRotatingSliderSection;
    @FindBy(id = "crousel_link1")
    private WebElement firstSideBanner;
    @FindBy(id = "crousel_link2")
    private WebElement secondSideBanner;
    @FindBy(xpath = "//div[@id='Swiper_mostSelling']/div//a")
    private List<WebElement> ProductsInTopSellingStacksSection;
    @FindBy(id = "(//div[@id='tab-39-all39']/div/div/div/div/a)[2]")
    private WebElement secondProductInTopSellingStacksSection;
    @FindBy(id = "(//div[@id='tab-39-all39']/div/div/div/div/a)[3]")
    private WebElement thirdProductInTopSellingStacksSection;
    @FindBy(id = "(//div[@id='tab-39-all39']/div/div/div/div/a)[4]")
    private WebElement fourthProductInTopSellingStacksSection;
    @FindBy(id = "(//div[@id='tab-39-all39']/div/div/div/div/a)[5]")
    private WebElement fiveProductInTopSellingStacksSection;
    @FindBy(xpath = "//div[@id='CategoryProducts_topSeller']/div//a")
    private List<WebElement> productsInTopSellersSection;
    @FindBy(id = "(//div[@id='tab-67-all67']/div/div/div/div/a)[2]")
    private WebElement secondProductInTopSellersSection;
    @FindBy(id = "(//div[@id='tab-67-all67']/div/div/div/div/a)[3]")
    private WebElement thirdProductInTopSellersSection;
    @FindBy(id = "(//div[@id='tab-67-all67']/div/div/div/div/a)[4]")
    private WebElement fourthProductInTopSellersSection;
    @FindBy(id = "(//div[@id='tab-67-all67']/div/div/div/div/a)[5]")
    private WebElement fiveProductInTopSellersSection;
    @FindBy(xpath = "//div[@id='Swiper_newArrival']/div//a")
    private List<WebElement> productsInNewArrivalsSection;
    @FindBy(id = "(//p[@class='count-container-item amount amount--has-pages'])[1]/span")
    private WebElement resultLabel;
    @FindBy(id = "(//p[@class='count-container-item amount amount--has-pages'])[1]")
    private WebElement searchResultValue;
    @FindBy(id = "(//li[@class='item pages-item-next']/a)[2]")
    private WebElement NextPageBtn;
    @FindBy(xpath = "//div[@id='trendContainer']//a")
    private List<WebElement> categoriesInsideTrendingOnSporterSection;
    public HomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //Main WebElement Test Cases
    public void clickOnViewAllBtnInTopSellingStacksSection() {
        DataHelperAndWait.clickOnElement(viewAllBtnInTopSellingStacksSection, webDriver);
    }

    public void clickOnAllLinkInTopSellerSection() {
        DataHelperAndWait.clickOnElement(allLinkInTopSellers, webDriver);
    }

    public void clickOnSportSupplementsLinkInTopSellerSection() {
        DataHelperAndWait.clickOnElement(sportSupplementsLinkInTopSellers, webDriver);
    }

    public void clickOnHealthyFoodLinkInTopSellerSection() {
        DataHelperAndWait.clickOnElement(healthyFoodLinkInTopSellers, webDriver);
    }

    public void clickOnVitaminsAndHealthLinkInTopSellerSection() {
        DataHelperAndWait.clickOnElement(vitaminsAndHealthLinkInTopSellers, webDriver);
    }

    public void clickOnSportswearAndAccessoriesLinkInTopSellerSection() {
        DataHelperAndWait.clickOnElement(sportswearAndAccessoriesLinkInTopSellers, webDriver);
    }

    public void clickOnNextButtonInTopSellerSectionInTopSellerSection() {
        DataHelperAndWait.clickOnElement(nextButtonInTopSellerSection, webDriver);
    }

    public void clickOnNextButtonInTrendingOnSporterSection() {
        DataHelperAndWait.clickOnElement(nextBtnInTrendingOnSporterSection, webDriver);
    }

    public void clickOnPreviousButtonInTrendingOnSporterSection() {
        DataHelperAndWait.clickOnElement(previousBtnInTrendingOnSporterSection, webDriver);
    }

    public void clickOnPreviousButtonInTopSellersSection() {
        DataHelperAndWait.clickOnElement(previousButtonInTopSellerSection, webDriver);
    }

    public void clickOnNextButtonInTopSellersSection() {
        DataHelperAndWait.clickOnElement(nextButtonInTopSellerSection, webDriver);
    }

    public void clickOnAllLinkInNewArrivalsSection() {
        DataHelperAndWait.clickOnElement(newArrivalsAllLink, webDriver);
    }

    public void clickOnSportSupplementsLinkInNewArrivalsSection() {
        DataHelperAndWait.clickOnElement(newArrivalsSpportSupplementsLink, webDriver);
    }

    public void clickOnHealthyFoodLinkInNewArrivalsSection() {
        DataHelperAndWait.clickOnElement(newArrivalsHealthyFoodLink, webDriver);
    }

    public void clickOnVitaminsAndHealthLinkInNewArrivalsSection() {
        DataHelperAndWait.clickOnElement(newArrivalsVitaminsAndHealthLink, webDriver);
    }

    public void clickOnSportswearAndAccessoriesLinkInNewArrivalsSection() {
        DataHelperAndWait.clickOnElement(newArrivalsSportWearAndAccessoriesLink, webDriver);
    }

    public void clickOnPreviousButtonInNewArrivalSection() {
        DataHelperAndWait.clickOnElement(previousBtnInNewArrivalsSection, webDriver);
    }

    public void clickOnNextButtonInNewArrivalSection() {
        DataHelperAndWait.clickOnElement(nextBtnInNewArrivalsSection, webDriver);
    }

    public void clickOnPhoneBtn() {
        DataHelperAndWait.clickOnElement(phoneBtn, webDriver);
        phoneBtn.sendKeys(Keys.ESCAPE);
        phoneBtn.sendKeys(Keys.ESCAPE);
    }

    public void clickOnEmailBtn() {
        DataHelperAndWait.clickOnElement(emailBtn, webDriver);
    }

    public void clickOnHomePageHorizontalBanner() {
        DataHelperAndWait.clickOnElement(homePageHorizontalBanner, webDriver);
    }

    public void clickOnSportsSupplementsCategory() {
        DataHelperAndWait.clickOnElement(sportsSupplementsCategory, webDriver);
    }

    public void clickOnHealthyFoodCategory() {
        DataHelperAndWait.clickOnElement(healthyFoodCategory, webDriver);
    }

    public void clickOnVitaminsAndHealthCategory() {
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategory, webDriver);
    }

    public void clickOnSportswearAndAccessoriesCategory() {
        DataHelperAndWait.clickOnElement(sportswearAndAccessoriesCategory, webDriver);
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

    public void clickOnSecondProductInTheTopSellingStacksSection() {
        DataHelperAndWait.clickOnElement(secondProductInTopSellingStacksSection, webDriver);
    }

    public void clickOnThirdProductInTheTopSellingStacksSection() {
        DataHelperAndWait.clickOnElement(thirdProductInTopSellingStacksSection, webDriver);
    }

    public void clickOnFourthProductInTheTopSellingStacksSection() {
        DataHelperAndWait.clickOnElement(fourthProductInTopSellingStacksSection, webDriver);
    }

    public void clickOnFifthProductInTheTopSellingStacksSection() {
        DataHelperAndWait.clickOnElement(fiveProductInTopSellingStacksSection, webDriver);
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

    public void clickOnSecondProductInTheTopSellersSection() {
        DataHelperAndWait.clickOnElement(secondProductInTopSellersSection, webDriver);
    }

    public void clickOnThirdProductInTheTopSellersSection() {
        DataHelperAndWait.clickOnElement(thirdProductInTopSellersSection, webDriver);
    }

    public void clickOnFourthProductInTheTopSellersSection() {
        DataHelperAndWait.clickOnElement(fourthProductInTopSellersSection, webDriver);
    }

    public void clickOnFifthProductInTheTopSellersSection() {
        DataHelperAndWait.clickOnElement(fiveProductInTopSellersSection, webDriver);
    }

    public void clickOnFirstSideBanner() {
        DataHelperAndWait.clickOnElement(firstSideBanner, webDriver);
    }

    public void clickOnSecondSideBanner() {
        DataHelperAndWait.clickOnElement(secondSideBanner, webDriver);
    }

    public void clickOnBannerInRotatingSliderSection() throws IOException {
        DataHelperAndWait.clickOnElement(bannerInRotatingSliderSection, webDriver);
    }

    public void switchCountry(WebElement countryElement) {
        webDriver.navigate().to(BaseURL+iraqDomain);
//        try {
//            DataHelperAndWait.waitTillPageFullyLoaded(webDriver,20);
//            WebElement countryList=webDriver.findElement(By.id("downArrow"));
//            DataHelperAndWait.waitTillPageFullyLoaded(webDriver,20);
//            DataHelperAndWait.isDisplayed(countryList, webDriver);
//            this.countryList.click();
//            countryElement.click();
//        } catch (Exception e) {
//            webDriver.navigate().refresh();
//            DataHelperAndWait.waitTillPageFullyLoaded(webDriver,20);
//            WebElement countryList=webDriver.findElement(By.id("downArrow"));
//            DataHelperAndWait.isDisplayed(countryList, webDriver);
//            DataHelperAndWait.waitTillPageFullyLoaded(webDriver,20);
//            this.countryList.click();
//            countryElement.click();
//        }
    }
}