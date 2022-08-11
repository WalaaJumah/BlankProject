package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KsaHomePage {
    public KsaHomePage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }
    //declare all locators related to the Cart Page
    @FindBy(xpath = "//span[@class='fas fa-chevron-down']")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='SA']")
    private WebElement saCountry;
    @FindBy(xpath="//a[contains(text(),'Next')]")
    private WebElement nextArrowInHomePageRotatingSlider;
    @FindBy(xpath="//a[contains(text(),'Previous')]")
    private WebElement previousArrowInHomePageRotatingSlider;
    @FindBy(css="ul.slides li.flex-active-slide:nth-child(2)" )
    private List<WebElement> homePageRotatingSliderlist;
    @FindBy(css="ul.slides li.flex-active-slide:nth-child(2)" )
    private WebElement homePageRotatingSlider;
    @FindBy(xpath="//*[@class='flex-control-nav flex-control-paging']" )
    private List<WebElement> homePageRotatingSliderPaginglist;
    @FindBy(xpath="//ul[@class='nav-primary']" )
    private List<WebElement> megaMenuMainList;
    @FindBy(xpath="//*[@class='flex-control-nav flex-control-paging']" )
    private WebElement homePageRotatingSliderPagingControl;
    @FindBy(xpath = "//div[@class='nutritious-right']")
    private WebElement homePageSideBanner;
    @FindBy(xpath = "//div[@class='advertise-banner-1 imagewidgetclass']")
    private WebElement homePageHorizontalBanner;
    @FindBy(xpath = "//h2[text()='Shop By Category']")
    private WebElement shopByCategoryHeader;
    @FindBy(xpath = "//div[@class='shop-category-slider swiper-container swiper-container-horizontal']")
    private WebElement shopByCategorysections;

    //Getter Methods
    public WebElement getNextArrowInHomePageRotatingSlider(){return nextArrowInHomePageRotatingSlider;}
    public WebElement getPreviousArrowInHomePageRotatingSlider(){return previousArrowInHomePageRotatingSlider;}
    public WebElement getHomePageRotatingSliderPagingControl(){return homePageRotatingSliderPagingControl;}
    public WebElement getHomePageRotatingSlider(){return homePageRotatingSlider;}
    public WebElement getHomePageSideBanner(){return homePageSideBanner;}
    public WebElement getShopByCategoryHeader(){return shopByCategoryHeader;}
    public WebElement getShopByCategorySections(){return shopByCategorysections;}
    public WebElement getHorizontalBanner(){return homePageHorizontalBanner;}
    public List<WebElement> getHomePageRotatingSliderlist(){return homePageRotatingSliderlist;}
    public List<WebElement> getMegaMenuMainList(){return megaMenuMainList;}
    public List<WebElement> getHomePageRotatingSliderPaginglist(){return homePageRotatingSliderPaginglist;}


    //Define the main actions we need to execute our TCs
    public void switchToKsaCountry() {
        DataHelperAndWait.isDisplayed(countryList, 10);
        this.countryList.click();
        this.saCountry.click();
    }

}
