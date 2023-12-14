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

import java.io.IOException;
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
    @FindBy(xpath = "//ul[@class='slides']/li[@class='flex-active-slide']/a")
    private WebElement bannerInRotatingSliderSection;
    @FindBy(xpath = "(//div[@class='nutritious-right']/a)[1]")
    private WebElement firstSideBanner;
    @FindBy(xpath = "(//div[@class='nutritious-right']/a)[2]")
    private WebElement secondSideBanner;
    @FindBy(id = "ShopByCategoryItem0")
    private WebElement supplementForHerCategory;
    @FindBy(id = "ShopByCategoryItem1")
    private WebElement womensDailyVitaminsCategory;
   @FindBy(id = "ShopByCategoryItem2")
    private WebElement ladyFriendlySnacksAndFoodCategory;
   @FindBy(id = "ShopByCategoryItem3")
    private WebElement makeupForActiveLifeStyleCategory;
   @FindBy(xpath = "//div[@id='TrendItem_0']/a")
    private WebElement hairSkinAndNailsCategory;
   @FindBy(xpath = "//div[@id='TrendItem_1']/a")
    private WebElement weightLossCategory;
   @FindBy(xpath = "//div[@id='TrendItem_2']/a")
    private WebElement moodSupportCategory;
   @FindBy(xpath = "//div[@id='TrendItem_3']/a")
    private WebElement detoxAndCleanseCategory;
   @FindBy(xpath = "//div[@id='TrendItem_4']/a")
    private WebElement pmsReliefCategory;
   @FindBy(xpath = "//div[@id='TrendItem_5']/a")
    private WebElement energyAndEnduranceCategory;
   @FindBy(xpath = "//div[@id='TrendItem_6']/a")
    private WebElement prenatalCareCategory;
   @FindBy(xpath = "//div[@id='TrendItem_7']/a")
    private WebElement muscleAndWeightGainCategory;
  @FindBy(xpath = "//div[@id='TrendItem_8']/a")
    private WebElement fashionAndStyleCategory;
  @FindBy(xpath = "//div[@id='TrendItem_9']/a")
    private WebElement personalCareCategory;
  @FindBy(xpath = "//li[@id='OptionsContainerOptions_all4']")
    private WebElement viewAllInSupplementForHerSection;
  @FindBy(xpath = "//li[@id='OptionsContainerOptions_all5']")
    private WebElement viewAllInWomensVitaminsSection;
  @FindBy(xpath = "//li[@id='OptionsContainerOptions_all6']")
    private WebElement viewAllInWorkoutInStyleSection;
    @FindBy(xpath = "//li[@id='OptionsContainerOptions_all7']")
    private WebElement viewAllInLadyFriendlySnacksAndFoodSection;
  @FindBy(id = "Swiper_4")
    private WebElement supplementForHerSection;
    @FindBy(id = "Swiper_4")
    private WebElement supplementForHerSectionAr;

  @FindBy(id = "Swiper_5")
    private WebElement womensVitaminsSection;
   @FindBy(id = "Swiper_5")
    private WebElement womensVitaminsSectionAR;

  @FindBy(id = "Swiper_6")
    private WebElement workoutInStyleSection;
    @FindBy(id = "Swiper_6")
    private WebElement workoutInStyleSectionAr;

  @FindBy(id = "Swiper_7")
    private WebElement ladyFriendlySnacksAndFoodSection;
   @FindBy(id = "Swiper_7")
    private WebElement ladyFriendlySnacksAndFoodSectionAr;
  @FindBy(xpath = "//div[@class='iFrame_container__KuLsV']")
    private WebElement femaleGallerySection;


    public void navigateToWomenOnlyPage() throws IOException {
        webDriver.navigate().to(BaseURL + womenOnlyUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
        waitTillLoaderComplete();
        DataHelperAndWait.waitForUrlContains(womenOnlyUrl, webDriver);

    }
}
