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
    @FindBy(xpath="(//div[@class='trending-title']/h2)[2]")
    private WebElement herbalReferenceGuideTitle;
    @FindBy(xpath="(//div[@class='trending-title']/h2)[3]")
    private WebElement shopByHealthNeedTitle;
    @FindBy(xpath="//ul[@class='trending-products']//a")
    private List<WebElement> herbalReferenceGuideList;
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



    @FindBy(xpath="(//div[@data-swiper-slide-index='0']//a)[1]")
    private WebElement beautyCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='1']//a)[1]")
    private WebElement boneAndJointCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='2']//a)[1]")
    private WebElement brainSupportCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='3']//a)[1]")
    private WebElement detoxAndLiverSupportCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='4']//a)[1]")
    private WebElement digestiveSupportCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='5']//a)[1]")
    private WebElement energyFormulasCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='6']//a)[1]")
    private WebElement hairAndSkinAndNailsCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='7']//a)[1]")
    private WebElement heartHealthCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='8']//a)[1]")
    private WebElement immunitySupporCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='9']//a)[1]")
    private WebElement kidsHealthCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='10']//a)[1]")
    private WebElement mensHealthCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='11']//a)[1]")
    private WebElement sexualHealthCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='12']//a)[1]")
    private WebElement sleepSupportCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='13']//a)[1]")
    private WebElement dietWeightManagementCategory;
    @FindBy(xpath="(//div[@data-swiper-slide-index='14']//a)[1]")
    private WebElement womenHealthCategory;
    @FindBy(xpath="//div[@class='trending-swiper-button-next']")
    private WebElement nextIconInShopByHealthNeedSection;
    @FindBy(xpath="//div[@class='trending-swiper-button-prev']")
    private WebElement previousIconInShopByHealthNeedSection;



    @FindBy(id="narrow-by-list")
    private WebElement filtrationSection;



    @FindBy(xpath="//div[@class='trending-sporter trending-sporter-crousal']")
    private WebElement ShopByHealthNeedSection;







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
    public WebElement getHerbalReferenceGuideTitle() {
        return herbalReferenceGuideTitle;
    }
    public List<WebElement> getHerbalReferenceGuideList() {
        return herbalReferenceGuideList;
    }
    public WebElement getShopByHealthNeedTitle() {
        return shopByHealthNeedTitle;
    }
    public WebElement getBeautyCategory() {
        return beautyCategory;
    }

    public WebElement getBoneAndJointCategory() {
        return boneAndJointCategory;
    }

    public WebElement getBrainSupportCategory() {
        return brainSupportCategory;
    }

    public WebElement getDetoxAndLiverSupportCategory() {
        return detoxAndLiverSupportCategory;
    }

    public WebElement getDigestiveSupportCategory() {
        return digestiveSupportCategory;
    }

    public WebElement getEnergyFormulasCategory() {
        return energyFormulasCategory;
    }

    public WebElement getHairAndSkinAndNailsCategory() {
        return hairAndSkinAndNailsCategory;
    }

    public WebElement getHeartHealthCategory() {
        return heartHealthCategory;
    }

    public WebElement getImmunitySupporCategory() {
        return immunitySupporCategory;
    }

    public WebElement getKidsHealthCategory() {
        return kidsHealthCategory;
    }

    public WebElement getMensHealthCategory() {
        return mensHealthCategory;
    }

    public WebElement getSexualHealthCategory() {
        return sexualHealthCategory;
    }

    public WebElement getSleepSupportCategory() {
        return sleepSupportCategory;
    }

    public WebElement getDietWeightManagementCategory() {
        return dietWeightManagementCategory;
    }

    public WebElement getWomenHealthCategory() {
        return womenHealthCategory;
    }

    public WebElement getNextIconInShopByHealthNeedSection() {
        return nextIconInShopByHealthNeedSection;
    }

    public WebElement getPreviousIconInShopByHealthNeedSection() {
        return previousIconInShopByHealthNeedSection;
    }
    public WebElement getShopByHealthNeedSection() {
        return ShopByHealthNeedSection;
    }
    public WebElement getFiltrationSection() {
        return filtrationSection;
    }

    //Define the main actions we need to execute our TCs
    public void clickOnNextIconInShopByHealthNeedSection(){
        try{this.nextIconInShopByHealthNeedSection.click();}
        catch(Exception e){
            this.nextIconInShopByHealthNeedSection.click();
        }
    }
}
