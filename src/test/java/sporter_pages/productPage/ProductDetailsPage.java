/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription ProductDetailsPage
 */

package sporter_pages.productPage;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.homepage_classes.HomePage;
import xml_reader.XmlReader;

import java.util.List;
@Getter
public class ProductDetailsPage extends BasePage {

    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    DataHelperAndWait dataHelperAndWait;
    //declare all locators related to the Product Details Page
    @FindBy(id = "productQty")
    private WebElement quantityField;
    @FindBy(id = "increaseQty")
    private WebElement qtyPlusButton;
    @FindBy(id = "decreaseQty")
    private WebElement qtyMinusButton;
    @FindBy(id = "addToCartBtn")
    private WebElement addToCartBtn;
    @FindBy(id = "popup-block")
    private WebElement cartPopUp;
    @FindBy(id = "keepShoppingBtn")
    private WebElement keepShippingBtn;
    @FindBy(id = "ThumbsUpContainer")
    private WebElement recommendedProductsPopup;
    @FindBy(xpath = "//button[@class='button_btn__zg_G5 ']/span")
    private WebElement continueBtnInOOSPoup;
    @FindBy(id = "viewCartBtn")
    private WebElement viewCartBtn;
    @FindBy(xpath = "(//div[@class='productOption_list__SYsKN'])[1]//div[starts-with(@id,'configurableOptionLabel_')]")
    private List<WebElement> productSizeAttribute;
    @FindBy(xpath = "(//div[@class='productOption_list__SYsKN'])[2]//div[starts-with(@id,'configurableOptionLabel_')]")
    private List<WebElement> productFlavor;
    @FindBy(id = "SearchButton")
    private WebElement searchBtn;
    @FindBy(id = "//a[@data-position='1']/div[@class= 'result-thumbnail product-image-wrapper']")
    private WebElement productCard;
    @FindBy(id = "star0")
    private WebElement oneStarReview;
    @FindBy(id = "addReviewBtn")
    private WebElement addReviewButton;
    @FindBy(id = "reviewContent")
    private WebElement reviewDescField;
    @FindBy(id = "reviewTitle")
    private WebElement reviewSummaryField;
    @FindBy(id = "reviewNickName")
    private WebElement nickNameField;
    @FindBy(id = "submitReviewBtn")
    private WebElement submitReviewButton;
    @FindBy(xpath = "//div[@class='productReview_rErr__YkUXT']")
    private WebElement reviewErrorMsgRelatedToStars;
    @FindBy(xpath = "//div[contains(text(),'You submitted your review for moderation.')]")
    private WebElement reviewToastMsg;
    @FindBy(id = "pathSegment_0")
    private WebElement HomeBreadcrumbs;
    @FindBy(xpath = "//div[starts-with(@class,'productHeader_otOfStocklabe')]")
    private WebElement OOSMsg;
    @FindBy(xpath = "(//ul[starts-with(@class,'topCategoryList_container')]/li/a)[1]")
    private WebElement shopByMenu;
    @FindBy(id = "SubCategoriesContainer")
    private WebElement subCategoriesSectionInMegaMenu;
    @FindBy(id = "SortCategoriesContainer")
    private WebElement subCategoriesSectionForShopBy;
    @FindBy(xpath = "(//div[@id='currentPrice'])[2]")
    private WebElement FinalProductPrice;
    @FindBy(id = "searchInput")
    private WebElement searchField;
    @FindBy(id = "SortItem_Sales & Offers_span")
    private WebElement salesAndOffersMenu;
    @FindBy(xpath = "(//ul[starts-with(@class,'topCategoryList_container')]/li/a)[2]")
    private WebElement SportsSupplementsMenu;
    @FindBy(xpath = "//select[starts-with(@id,'bundleOptionSelect')]")
    private WebElement bundleMenu;
    @FindBy(xpath = "(//a[@title='Buy 1 Get 1'])[1]")
    private WebElement buy1Get1Card;
    @FindBy(id = "promotion")
    private WebElement freeProductLabelEn;
    @FindBy(id = "promotion")
    private WebElement freeProductLabelAr;
    @FindBy(id = "TopCategoryList")
    private List<WebElement> megaMenuList;
    @FindBy(id = "ProductDescription")
    private WebElement aboutThisProductSection;
    @FindBy(id = "ProductBrandName")
    private WebElement aboutBrandSection;
    @FindBy(xpath = "//div[@id='ProductDescription']/h2")
    private WebElement aboutThisProductTitle;
    @FindBy(xpath = "//div[@id='ProductSupplementFacts']//table")
    private WebElement supplementFactsTable;
    @FindBy(xpath = "//div[@id='ProductSupplementFacts']//h2")
    private WebElement supplementFactsTitle;
    @FindBy(id = "UserIcon")
    private WebElement accountProfileIcon;
    @FindBy(id = "UserIconContainer")
    private WebElement accountProfileOptions;
    @FindBy(id = "productTitle")
    private WebElement productName;
    @FindBy(id = "FixedAddtoCart")
    private WebElement ProductHeaderBar;
    @FindBy(id = "fixedAddToCartBtn")
    private WebElement addToCartBtnInProductHeaderBar;
    @FindBy(xpath = "//a[starts-with(@class,'productHeader_brand')]")
    private WebElement productBrandLink;
    @FindBy(xpath = "//div[@id='expectedDeliveryDate']/span")
    private WebElement expectedDeliveryDateLabel;
    @FindBy(xpath = "//div[@id='expectedDeliveryDate']/span[2]")
    private WebElement expectedDeliveryDateValue;
    @FindBy(xpath = "//ul[starts-with(@class,'pagination_innerPagination')]/li[@class='pagination_item__cHfvi']")
    private List<WebElement> pageBtnInReviewSection;
    @FindBy(xpath = "(//li[starts-with(@class,'pagination_arrow')])[2]")
    private WebElement nextReviewPageBtn;
    @FindBy(xpath = "(//li[starts-with(@class,'pagination_arrow')])[1]")
    private WebElement previousReviewPageBtn;
    @FindBy(xpath = "//div[@class='search-result-title-wrapper']")
    private WebElement searchPageTitle;
    @FindBy(xpath = "//div[@class='reviewContainer_reviewsIndicator__kU10r']")
    private WebElement reviewsPageNumber;
    @FindBy(id= "AddToCartErrContainer")
    private WebElement AddToCartErrorPopUp;
    @FindBy(id= "removeItemBtn")
    private WebElement removeItem;

    @FindBy(id= "closeAddToCartErrBtn")
    private WebElement closeToCartErrorPopUp;

    //Methods we need during testing the Product details page
    public void displayTheProduct() {
        webDriver.navigate().to(BaseURL + storeCountry + productUrl);
        System.out.println(BaseURL + storeCountry + productUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
    public void addToCart() {
        try{
        DataHelperAndWait.clickOnElement(addToCartBtn,webDriver);}
        catch (Exception e){
            DataHelperAndWait.clickOnElement(addToCartBtn,webDriver);
        }
    }
    public void keepShopping() {
        DataHelperAndWait.clickOnElement(keepShippingBtn,webDriver);
    }
    public void viewCart() {
        try{
       DataHelperAndWait.clickOnElement(viewCartBtn , webDriver);}
        catch (Exception e){
            DataHelperAndWait.clickOnElement(viewCartBtn , webDriver);
        }
    }
    public void keepShoppingAfterAddingToCart(){
        HomePage homePage=new HomePage(webDriver);
        try{
            this.displayTheProduct( );
            this.addToCart( );
            this.keepShopping( );}
        catch (Exception e){
            if(this.getAddToCartErrorPopUp().isDisplayed()){
                DataHelperAndWait.clickOnElement(this.closeToCartErrorPopUp,webDriver);
                navigateToHomePage();
                DataHelperAndWait.clickOnElement(homePage.getProductsInTopSellersSection().get(0),webDriver);
                this.displayTheProduct( );
                this.addToCart( );
                this.keepShopping( );
            }
        }}


    public void displayOOSProduct() {
        webDriver.navigate().to(BaseURL + storeCountry + oOSProductUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
    public void increaseTheQuantity() {
        DataHelperAndWait.clickOnElement(quantityField,webDriver);
        DataHelperAndWait.clickOnElement(qtyPlusButton,webDriver);
    }
    public void decreaseTheQuantity() {
        DataHelperAndWait.clickOnElement(quantityField,webDriver);
        DataHelperAndWait.clickOnElement(qtyMinusButton,webDriver);
    }
    public void selectStarInReview() {
        DataHelperAndWait.clickOnElement(oneStarReview,webDriver);
    }
    public void submitProductReview(String reviewDesc, String reviewSummary, String nickName) {
        DataHelperAndWait.clickOnElement(addReviewButton,webDriver);
        DataHelperAndWait.typeTextInElement(reviewDescField,webDriver, XmlReader.getXMLData("reviewDesc"));
        DataHelperAndWait.typeTextInElement(reviewSummaryField,webDriver, XmlReader.getXMLData("reviewSummary"));
        DataHelperAndWait.typeTextInElement(nickNameField,webDriver, XmlReader.getXMLData("nickName"));
        DataHelperAndWait.clickOnElement(submitReviewButton,webDriver);
    }
    public void searchForBundle() {
        DataHelperAndWait.clickOnElement(searchField , webDriver);
        DataHelperAndWait.typeTextInElement(searchField,webDriver,"Box");
        DataHelperAndWait.clickOnElement(searchBtn , webDriver);
    }
    public void verifyReviewPagingWorks(){
        try{
            DataHelperAndWait.clickOnElement(pageBtnInReviewSection.get(1),webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("p=2",webDriver);
        }
        catch (Exception e){
            System.out.println("There's no pages in the Review Section");
        }
    }
}