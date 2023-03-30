/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.womens_only_category_pages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class WomensOnlyCategoryPage extends BasePage {
    public WomensOnlyCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//ol[@class='flex-control-nav flex-control-paging']/li/a")
    private WebElement RotatingSliderPagingControl;
    @FindBy(xpath = "//ol[@class='flex-control-nav flex-control-paging']/li/a")
    private List<WebElement> RotatingSliderPagingControlList;
    @FindBy(xpath = "//div[@id='HomeHeaderContainer']/div[@id='crouselContainer']")
    private WebElement bannerInRotatingSliderSection;
    @FindBy(xpath = "(//div[@class='nutritious-right']/a)[1]")
    private WebElement firstSideBanner;
    @FindBy(xpath = "(//div[@class='nutritious-right']/a)[2]")
    private WebElement secondSideBanner;
    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']/li//a[2])[1]")
    private WebElement supplementForHerCategory;
    @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']/li//a[2])[2]")
    private WebElement womensDailyVitaminsCategory;
   @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']/li//a[2])[3]")
    private WebElement ladyFriendlySnacksAndFoodCategory;
   @FindBy(xpath = "(//ul[@class='swiper-wrapper clearfix']/li//a[2])[4]")
    private WebElement makeupForActiveLifeStyleCategory;
   @FindBy(xpath = "(//ul[@class='trending-products']/li/div/a)[1]")
    private WebElement hairSkinAndNailsCategory;
   @FindBy(xpath = "(//ul[@class='trending-products']/li/div/a)[2]")
    private WebElement weightLossCategory;
   @FindBy(xpath = "(//ul[@class='trending-products']/li/div/a)[3]")
    private WebElement moodSupportCategory;
   @FindBy(xpath = "(//ul[@class='trending-products']/li/div/a)[4]")
    private WebElement detoxAndCleanseCategory;
   @FindBy(xpath = "(//ul[@class='trending-products']/li/div/a)[5]")
    private WebElement pmsReliefCategory;
   @FindBy(xpath = "(//ul[@class='trending-products']/li/div/a)[6]")
    private WebElement energyAndEnduranceCategory;
   @FindBy(xpath = "(//ul[@class='trending-products']/li/div/a)[7]")
    private WebElement prenatalCareCategory;
   @FindBy(xpath = "(//ul[@class='trending-products']/li/div/a)[8]")
    private WebElement muscleAndWeightGainCategory;
  @FindBy(xpath = "(//ul[@class='trending-products']/li/div/a)[9]")
    private WebElement fashionAndStyleCategory;
  @FindBy(xpath = "(//ul[@class='trending-products']/li/div/a)[10]")
    private WebElement personalCareCategory;


    public void navigateToWomenOnlyPage() {
        webDriver.navigate().to(BaseURL + womenOnlyUrl);
        DataHelperAndWait.waitForUrlContains(womenOnlyUrl, webDriver);
    }
}
