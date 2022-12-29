package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AeWomenOnlyCategoryPage extends BasePage {
    public AeWomenOnlyCategoryPage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver,this);
    }

    //declare all locators related to the AeWomenOnlyCategoryPage
    @FindBy(xpath = ".//*[@class='nav-primary']/li[6]/a")
    private WebElement womenOnlyMainMenu;
    @FindBy(xpath="(//div[@class='trending-title'])[3]")
    private WebElement supplementsForHerSectionTitle;
    @FindBy(xpath="(//div[@class='swiper-wrapper'])[1]")
    private WebElement supplementsForHerSection;
    @FindBy(xpath="(//div[@class='trending-title'])[4]")
    private WebElement womenVitaminsSectionTitle;
    @FindBy(xpath="(//div[@class='swiper-wrapper'])[2]")
    private WebElement womenVitaminsSection;
    @FindBy(xpath="(//div[@class='trending-title'])[5]")
    private WebElement workoutInStyleSectionTitle;
    @FindBy(xpath="(//div[@class='swiper-wrapper'])[3]")
    private WebElement workoutInStyleSection;
    @FindBy(xpath="(//div[@class='trending-title'])[6]")
    private WebElement LadyFriendlySnacksAndFoodSectionTitle;
   @FindBy(xpath="(//div[@class='swiper-wrapper'])[4]")
    private WebElement LadyFriendlySnacksAndFoodSection;
   @FindBy(xpath = "(//div[@class='inner-seller-prod wp-id-38301'])[1]")
   private WebElement lastProductInSupplementsForHerSection;
   @FindBy(xpath = "//div[@class='inner-seller-prod wp-id-53071']")
   private WebElement lastProductInWomenVitaminsSection;

    @FindBy(xpath = "//div[@class='inner-seller-prod wp-id-33705']")
   private WebElement lastProductInWorkoutInStyleSection;
   @FindBy(xpath = "//div[@class='inner-seller-prod wp-id-37630']")
   private WebElement productCardInSupplementsForHerSection;
   @FindBy(xpath = "//div[@class='inner-seller-prod wp-id-45355']")
   private WebElement productCardInWomenVitaminsSection;
    @FindBy(xpath = "//div[@class='inner-seller-prod wp-id-17316']")
   private WebElement productCardInWorkoutInStyleSection;
    @FindBy(xpath = "//div[@class='inner-seller-prod wp-id-35422']")
   private WebElement productCardInLadyFriendlySnacksFoodSection;
    @FindBy(xpath = "//div[@class='brand-video-header']/h3")
   private WebElement femaleGallerySectionTitle;
    @FindBy(xpath = "//div[@class='brand-video-main']")
   private WebElement femaleGallerySection;
   @FindBy(xpath="(//i[@class='fas fa-chevron-left'])[3]")
   private WebElement previousIconInWomenVitaminsSection;
   @FindBy(xpath="(//i[@class='fas fa-chevron-right'])[3]")
   private WebElement nextIconInInWomenVitaminsSection;
    @FindBy(xpath="(//i[@class='fas fa-chevron-right'])[4]")
   private WebElement nextIconInInWorkoutInStyleSection;
    @FindBy(xpath="(//i[@class='fas fa-chevron-right'])[5]")
   private WebElement nextIconInInLadyFriendlySnacksFoodSection;
    @FindBy(xpath="(//i[@class='fas fa-chevron-left'])[4]")
    private WebElement previousIconInWorkoutInStyleSection;
    @FindBy(xpath="(//i[@class='fas fa-chevron-left'])[5]")
    private WebElement previousIconInLadyFriendlySnacksFoodSection;
    @FindBy(xpath = "(//a[@class='view-all'])[1]")
    private WebElement viewAllInSupplementsForHerSection;
    @FindBy(xpath = "(//a[@class='view-all'])[2]")
    private WebElement viewAllInWomenVitaminsSection;
    @FindBy(xpath = "(//a[@class='view-all'])[3]")
    private WebElement viewAllInWorkoutInStyleSection;
   @FindBy(xpath = "(//a[@class='view-all'])[4]")
    private WebElement viewAllInLadyFriendlySnacksFoodSection;
    @FindBy(xpath= "(//div[@class='brand-category-video'])[1]")
    private WebElement firstYouTubeVideo;
   @FindBy(xpath= "(//div[@class='brand-category-video'])[2]")
    private WebElement secondYouTubeVideo;
   @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[1]")
    private WebElement shopeByMenu;
    @FindBy(xpath = "//ul[@class='cd-dropdown-content']/li[5]/a")
    private WebElement womenOnlyOption;
    @FindBy(xpath = "//div[@class='block-footer-top']")
    private WebElement pageBottomSection;
    @FindBy(xpath = "//div[@class='container']/ul[@class='clearfix']")
    private List<WebElement> pageBottomBlocksList;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[1]")
    private WebElement securePaymentTitle;
    @FindBy(xpath = "//em[@class='fas fa-unlock']/following-sibling::span")
    private WebElement securePaymentDescription;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[2]")
    private WebElement authenticProductsTitle;
    @FindBy(xpath = "(//a[@title='100% Secure payments']//span)[2]")
    private WebElement authenticProductsDescription;
    @FindBy(xpath = "(//li[@class='secure-listing']//h3[1])[3]")
    private WebElement fastDeliveryTitle;
    @FindBy(xpath = "(//a[@title='100% Secure payments']//span)[3]")
    private WebElement fastDeliveryDescription;
    @FindBy(xpath = "//div[@class='category-details']/h1")
    private WebElement sportSupplementsTitleInSportSupplementsCategoryImage;
    @FindBy(xpath = "//div[@class='category-details']/p")
    private WebElement paragraphInInSportSupplementsCategoryImage;

    public WebElement getSecurePaymentDescription() {
        return securePaymentDescription;
    }
    public WebElement getAuthenticProductsTitle() {
        return authenticProductsTitle;
    }
    public WebElement getSportSupplementsTitleInCategoryImage() {
        return sportSupplementsTitleInSportSupplementsCategoryImage;
    }
    public WebElement getParagraphInSportSupplementsCategoryImage() {
        return paragraphInInSportSupplementsCategoryImage;
    }
    public WebElement getAuthenticProductsDescription() {
        return authenticProductsDescription;
    }
    public WebElement getFastDeliveryTitle() {
        return fastDeliveryTitle;
    }
    public WebElement getFastDeliveryDescription() {
        return fastDeliveryDescription;
    }




    //Getter Methods
    public WebElement getPageBottomSection() {
        return pageBottomSection;
    }
    public WebElement getSecurePaymentTitle() {
        return securePaymentTitle;
    }
    public List<WebElement> getPageBottomBlocksList() {
        return pageBottomBlocksList;
    }
    public WebElement getShopeByMenu() {
        return shopeByMenu;
    }
    public WebElement getWomenOnlyOption() {
        return womenOnlyOption;
    }
    public WebElement getSupplementsForHerSectionTitle() {
        return supplementsForHerSectionTitle;
    }

    public WebElement getSupplementsForHerSection() {
        return supplementsForHerSection;
    }

    public WebElement getWomenVitaminsSectionTitle() {
        return womenVitaminsSectionTitle;
    }

    public WebElement getWomenVitaminsSection() {
        return womenVitaminsSection;
    }

    public WebElement getWorkoutInStyleSectionTitle() {
        return workoutInStyleSectionTitle;
    }

    public WebElement getWorkoutInStyleSection() {
        return workoutInStyleSection;
    }

    public WebElement getLadyFriendlySnacksAndFoodSectionTitle() {
        return LadyFriendlySnacksAndFoodSectionTitle;
    }

    public WebElement getLadyFriendlySnacksAndFoodSection() {
        return LadyFriendlySnacksAndFoodSection;
    }
    public WebElement getLastProductInSupplementsForHerSection() {
        return lastProductInSupplementsForHerSection;
    }
    public WebElement getProductCardInSupplementsForHerSection() {
        return productCardInSupplementsForHerSection;
    }
    public WebElement getProductCardInWomenVitaminsSection() {
        return productCardInWomenVitaminsSection;
    }
    public WebElement getLastProductInWomenVitaminsSection() {
        return lastProductInWomenVitaminsSection;
    }
    public WebElement getPreviousIconInWomenVitaminsSection() {
        return previousIconInWomenVitaminsSection;
    }

    public WebElement getNextIconInInWomenVitaminsSection() {
        return nextIconInInWomenVitaminsSection;
    }
    public WebElement getNextIconInInWorkoutInStyleSection() {
        DataHelperAndWait.waitToBeVisible(nextIconInInWorkoutInStyleSection,5,webDriver);
        return nextIconInInWorkoutInStyleSection;
    }

    public WebElement getPreviousIconInWorkoutInStyleSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInWorkoutInStyleSection,5,webDriver);
        return previousIconInWorkoutInStyleSection;
    }
    public WebElement getLastProductInWorkoutInStyleSection() {
        DataHelperAndWait.waitToBeVisible(lastProductInWorkoutInStyleSection,5,webDriver);
        return lastProductInWorkoutInStyleSection;
    }
    public WebElement getProductCardInWorkoutInStyleSection() {
        return productCardInWorkoutInStyleSection;
    }
    public WebElement getViewAllInSupplementsForHerSection() {
        return viewAllInSupplementsForHerSection;
    }

    public WebElement getViewAllInWomenVitaminsSection() {
        return viewAllInWomenVitaminsSection;
    }

    public WebElement getViewAllInWorkoutInStyleSection() {
        return viewAllInWorkoutInStyleSection;
    }

    public WebElement getViewAllInLadyFriendlySnacksFoodSection() {
        return viewAllInLadyFriendlySnacksFoodSection;
    }
    public WebElement getPreviousIconInLadyFriendlySnacksFoodSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInLadyFriendlySnacksFoodSection,5,webDriver);
        return previousIconInLadyFriendlySnacksFoodSection;
    }
    public WebElement getNextIconInInLadyFriendlySnacksFoodSection() {
        DataHelperAndWait.waitToBeVisible(nextIconInInLadyFriendlySnacksFoodSection,5,webDriver);
        return nextIconInInLadyFriendlySnacksFoodSection;
    }
    public WebElement getProductCardInLadyFriendlySnacksFoodSection() {
        DataHelperAndWait.waitToBeVisible(productCardInLadyFriendlySnacksFoodSection,6,webDriver);
        return productCardInLadyFriendlySnacksFoodSection;
    }
    public WebElement getFemaleGallerySectionTitle() {
        return femaleGallerySectionTitle;
    }

    public WebElement getFemaleGallerySection() {
        return femaleGallerySection;
    }
    public WebElement getFirstYouTubeVideo() {
        return firstYouTubeVideo;
    }

    public WebElement getSecondYouTubeVideo() {
        return secondYouTubeVideo;
    }
    public void navigateToWomenOnlyPage(){webDriver.navigate().to(siteURL +aeDomain+womenOnlyUrl);}
    public void switchToAECountry() {
        try {
            DataHelperAndWait.waitToBeVisible(countryList, 5,webDriver);
            this.countryList.click();
            DataHelperAndWait.waitToBeVisible(aeCountry, 5,webDriver);
            this.aeCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(countryList, 5,webDriver);
            this.countryList.click();
            DataHelperAndWait.waitToBeVisible(aeCountry, 5,webDriver);
            this.aeCountry.click();
        }}
    public WebElement getWomenOnlyMainMenu() {
        return womenOnlyMainMenu;
    }
}