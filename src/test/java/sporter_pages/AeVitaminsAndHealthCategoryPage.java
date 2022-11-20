package sporter_pages;

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
    @FindBy(xpath="(//div[@class='nutritious-right'])/a[1]")
    private WebElement secondSideBanner;



    //Getter Methods
    public WebElement getVitaminsAndHealthCategoryInHomePage() {
        return vitaminsAndHealthCategoryInHomePage;
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

    public WebElement getSecondSideBanner() {
        return secondSideBanner;
    }
    public List<WebElement> getShopByCategoryList() {
        return shopByCategoryList;
    }
    public WebElement getFishOilAndOmegasFooterSection() {
        return fishOilAndOmegasFooterSection;
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

    //Define the main actions we need to execute our TCs
}
