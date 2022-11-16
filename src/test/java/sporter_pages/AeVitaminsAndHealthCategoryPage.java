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
    //Define the main actions we need to execute our TCs
}
