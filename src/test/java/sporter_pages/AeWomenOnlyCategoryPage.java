package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AeWomenOnlyCategoryPage {
    public AeWomenOnlyCategoryPage(WebDriver webDriver){PageFactory.initElements(webDriver,this);}
    private AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage;


    //declare all locators related to the AeWomenOnlyCategoryPage
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
    @FindBy(xpath = "//div[@class='inner-seller-prod wp-id-55257']")
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


    //Getter Methods
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
        return nextIconInInWorkoutInStyleSection;
    }

    public WebElement getPreviousIconInWorkoutInStyleSection() {
        DataHelperAndWait.waitToBeVisible(previousIconInWorkoutInStyleSection,2);
        return previousIconInWorkoutInStyleSection;
    }
    public WebElement getLastProductInWorkoutInStyleSection() {
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
        return previousIconInLadyFriendlySnacksFoodSection;
    }
    public WebElement getNextIconInInLadyFriendlySnacksFoodSection() {
        return nextIconInInLadyFriendlySnacksFoodSection;
    }
    public WebElement getProductCardInLadyFriendlySnacksFoodSection() {
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
}