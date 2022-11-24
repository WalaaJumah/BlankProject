package sporter_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AeSportsCategoryPage {
    public AeSportsCategoryPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
    private AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage;

    //declare all locators related to the AeVitaminsAndHealthCategoryPage
    @FindBy(xpath="(//div[@class='trending-title']/h2)[1]")
    private WebElement trendingInSportsSectionTitle;
    @FindBy(xpath="//div[@class='swiper-container swiper-container-horizontal trending']")
    private WebElement trendingInSportsSection;
    @FindBy(xpath = "(//div[@class='product-img']/a)[6]")
    private WebElement mensApparelCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[7]")
    private WebElement womenApparelCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[8]")
    private WebElement yogaApparelCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[9]")
    private WebElement swimmingApparelCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[10]")
    private WebElement mmaApparelCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[11]")
    private WebElement cricketApparelCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[12]")
    private WebElement toysAndGamesCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[13]")
    private WebElement wearableTechApparelCategory;
    @FindBy(xpath = "(//div[@class='product-img']/a)[14]")
    private WebElement personalCareApparelCategory;
    @FindBy(xpath = "(//ul[@class='clearfix']/li[1]/a)[1]")
    private WebElement menCategory;
    @FindBy(xpath = "(//ul[@class='clearfix']/li[2]/a)[1]")
    private WebElement womenCategory;
    @FindBy(xpath = "(//ul[@class='clearfix']/li[1]/a)[2]")
    private WebElement sportsTechCategory;
    @FindBy(xpath = "(//ul[@class='clearfix']/li[1]/a)[3]")
    private WebElement kidsCategory;
    @FindBy(xpath = "(//ul[@class='clearfix']/li[2]/a)[2]")
    private WebElement sportsCategory;
    @FindBy(xpath="(//div[@class='trending-title']/h2)[2]")
   private WebElement recommendedProductsTitleSection;
    @FindBy(xpath="(//div[@class='swiper-wrapper'])[2]")
   private WebElement recommendedProductsSection;
    @FindBy(xpath="(//i[@class='fas fa-chevron-right'])[2]")
      private WebElement nextIconInRecommendedProductsSection;
    @FindBy(xpath="(//i[@class='fas fa-chevron-left'])[2]")
      private WebElement previousIconInRecommendedProductsSection;
    @FindBy(xpath="//div[@class='inner-seller-prod wp-id-45506']")
    private WebElement lastProductInRecommendedProductsSection;
    @FindBy(xpath="(//a[@class='product-link'])[2]")
    private WebElement productCardInRecommendedProductsSection;

    //Getter Methods
    public WebElement getTrendingInSportsSectionTitle(){return trendingInSportsSectionTitle;}
    public WebElement getTrendingInSportsSection(){return trendingInSportsSection;}

    public WebElement getMensApparelCategory() {
        return mensApparelCategory;
    }
    public WebElement getProductCardInRecommendedProductsSection() {
        return productCardInRecommendedProductsSection;
    }

    public WebElement getWomenApparelCategory() {
        return womenApparelCategory;
    }

    public WebElement getYogaApparelCategory() {
        return yogaApparelCategory;
    }

    public WebElement getSwimmingApparelCategory() {
        return swimmingApparelCategory;
    }

    public WebElement getMmaApparelCategory() {
        return mmaApparelCategory;
    }

    public WebElement getCricketApparelCategory() {
        return cricketApparelCategory;
    }

    public WebElement getToysAndGamesCategory() {
        return toysAndGamesCategory;
    }

    public WebElement getWearableTechApparelCategory() {
        return wearableTechApparelCategory;
    }

    public WebElement getPersonalCareApparelCategory() {
        return personalCareApparelCategory;
    }
    public WebElement getMenCategory() {
        return menCategory;
    }

    public WebElement getWomenCategory() {
        return womenCategory;
    }

    public WebElement getSportsTechCategory() {
        return sportsTechCategory;
    }

    public WebElement getKidsCategory() {
        return kidsCategory;
    }

    public WebElement getSportsCategory() {
        return sportsCategory;
    }

    public WebElement getRecommendedProductsTitleSection() {
        return recommendedProductsTitleSection;
    }

    public WebElement getRecommendedProductsSection() {
        return recommendedProductsSection;
    }
    public WebElement getPreviousIconInRecommendedProductsSection() {
        return previousIconInRecommendedProductsSection;
    }
    public WebElement getLastProductInRecommendedProductsSection() {
        return lastProductInRecommendedProductsSection;
    }

    //Define the main actions we need to execute our TCs
    public void clickOnCricketCategory(WebDriver webDriver){
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        this.cricketApparelCategory.click();
    }
    public void clickOnToysAndGamesCategory(WebDriver webDriver){
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        this.toysAndGamesCategory.click();
    }
    public void clickOnWearableTechApparelCategory(WebDriver webDriver){
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        this.wearableTechApparelCategory.click();
    }
    public void clickOnPersonalCareCategory(WebDriver webDriver){
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        this.personalCareApparelCategory.click();
    }
    public WebElement getNextIconInRecommendedProductsSection() {
        return nextIconInRecommendedProductsSection;
    }

}