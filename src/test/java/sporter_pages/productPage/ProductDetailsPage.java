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
    @FindBy(id = "qty")
    private WebElement quantityField;
    @FindBy(id = "//a[@class='btn-qty-control btn-qty-control--plus']")
    private WebElement qtyPlusButton;
    @FindBy(id = "//a[@class='btn-qty-control btn-qty-control--minus']")
    private WebElement qtyMinusButton;
    @FindBy(id = "product-addtocart-button")
    private WebElement addToCartBtn;
    @FindBy(id = "//div[@class='product-options-bottom']")
    private WebElement addToCartSectionForOOSProduct;
    @FindBy(id = "popup-block")
    private WebElement cartPopUp;
    @FindBy(id = "//*[@id=\"popup-block\"]/div[2]/a[1]")
    private WebElement keepShippingBtn;
    @FindBy(id = "//button[@class='button close-popup-err']")
    private WebElement inconvenienceWarningMsg;
    @FindBy(id = "//*[@id=\"popup-block\"]/div[2]/a[2]")
    private WebElement viewCartBtn;
    @FindBy(id = "option-label-size-165-item-10057")
    private WebElement productAttribute;
    @FindBy(id = "option-label-flavor-164-item-6959")
    private WebElement productFlavor;
    @FindBy(id = "//*[@id=\"algolia-searchbox\"]/button")
    private WebElement searchBtn;
    @FindBy(id = "//a[@data-position='1']/div[@class= 'result-thumbnail product-image-wrapper']")
    private WebElement productCard;
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(id = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(id = "//li[@class='country_switch']/span[@class='LB']")
    private WebElement lebanonCountry;
    @FindBy(id = "//li[@class='country_switch']/span[@class='JO']")
    private WebElement joCountry;
    @FindBy(id = "//*[@id=\"maincontent\"]/div[5]/div/div[2]/div[2]/a[1]/picture/img")
    private WebElement firstProductInHomePage;
    @FindBy(id = "(//div[@class='inner-seller-prod wp-id-6527']/a)[1]")
    private WebElement productInHomePage;
    @FindBy(id = "//*[@id=\"tab-67-all67\"]/div[1]/div/div[1]/div/a")
    private WebElement joProductInHomePage;
    @FindBy(id = "Overall Evaluation_1_label")
    private WebElement oneStarReview;
    @FindBy(id = "//span[@class='button button-review orange-btn']")
    private WebElement addReviewButton;
    @FindBy(id = "review_field")
    private WebElement reviewDescField;
    @FindBy(id = "summary_field")
    private WebElement reviewSummaryField;
    @FindBy(id = "nickname_field")
    private WebElement nickNameField;
    @FindBy(id = "//*[text()='Submit Review']")
    private WebElement submitReviewButton;
    @FindBy(id = "ratings[2]-error")
    private WebElement reviewErrorMsg;
    @FindBy(id = "//div[contains(text(),'You submitted your review for moderation.')]")
    private WebElement reviewToastMsg;
    @FindBy(id = "//a[normalize-space()='Home']")
    private WebElement HomeBreadcrumbs;
    @FindBy(id = "//*[text()='عربي']")
    private WebElement arabicLangBtn;
    @FindBy(id = "//*[text()='English']")
    private WebElement englishLangBtn;
    @FindBy(id = "switcher-language")
    private WebElement languageSwitcher;
    @FindBy(id = "//span[contains(text(),\"We're sorry for not being able to provide you with\")]")
    private WebElement OOSMsg;
    @FindBy(id = "//div[@class='error-content-outer offer-not-available']/div[@class='block-content-wrapper search-outer']")
    private WebElement productUnavailableForCountry;
    @FindBy(linkText = "Shop By")
    private WebElement shopByMenu;
    @FindBy(id = "//span[@data-price-type='finalPrice']/span")
    private WebElement FinalProductPrice;
    @FindBy(css = "div[class='product-column--side'] span[class='price']")
    private WebElement productPrice;
    @FindBy(id = "//input[@id='search']")
    private WebElement searchField;
    @FindBy(id = ".//*[@class='nav-primary']/li[1]")
    private WebElement shopeByMenu;
    @FindBy(id = ".//*[@class='cd-dropdown-content']/li[8]")
    private WebElement salesAndOffersMenu;
    @FindBy(id = ".//*[@class='cd-dropdown-content']/li[1]")
    private WebElement SportsSupplementsMenu;
    @FindBy(id = "//select")
    private WebElement bundleMenu;
    @FindBy(id = "(//div[@class='inner-trend'])[3]")
    private WebElement buy1Get1Card;
    @FindBy(id = "//ol[@class='products list items product-items']//li")
    private WebElement firstProductInTheCategoryList;
    @FindBy(id = "//ol[@class='products list items product-items']//li")
    private List productsListInTheCategoryPage;
    @FindBy(id = "//strong[contains(text(),'Free')]")
    private WebElement freeProductLabel;
    @FindBy(id = "//ol[@class='products list items product-items']//li")
    private List<WebElement> megaMenuList;
    @FindBy(id = "//div[@class='swatch-attribute flavor']/div/div[@tabindex=0 and @index='0']")
    private WebElement firstProductFlavor;
    @FindBy(id = "(//div[@index='5'])[1]")
    private WebElement firstProductSize;
    @FindBy(id = "(//form/div/div/div/div/div/div)[1]")
    private WebElement firstsimple;
    @FindBy(id = "(//form/div/div/div/div/div/div)[2]")
    private WebElement secondsimple;
    @FindBy(id = "//div[@class='swatch-option text' and @index='1']")
    private WebElement secondProductSize;
    @FindBy(id = "//div[@class='swatch-attribute flavor']/div/div[@tabindex=0 and @index='2']")
    private WebElement secondProductFlavor;
    @FindBy(id = "//div[@class='product attribute description']")
    private WebElement aboutThisProductSection;
    @FindBy(id = "//div[@class='product attribute directions_of_use']")
    private WebElement directionsOfUseSection;
    @FindBy(id = "//div[@class='about-brand']")
    private WebElement aboutBrandSection;
    @FindBy(id = "//div[@class='product attribute description']/h5")
    private WebElement aboutThisProductTitle;
    @FindBy(id = "product-attribute-specs-table")
    private WebElement supplementFactsTable;
    @FindBy(id = "//div[@class='product attribute supplement_facts']/h2")
    private WebElement supplementFactsTitle;
    @FindBy(id = "//a[@class='user-account']")
    private WebElement accountProfileIcon;
    @FindBy(id = "(//div[@id='header-account']/div/ul)[2]")
    private WebElement accountProfileOptions;
    @FindBy(id = "//div[@class='page-title-wrapper product']/h1/span")
    private WebElement productName;
    @FindBy(id = "//div[@class='header-bar main-container']")
    private WebElement ProductHeaderBar;
    @FindBy(id = "(//button[@title='Add to Cart'])[1]")
    private WebElement addToCartBtnInProductHeaderBar;
    @FindBy(id = "//div[@class='ratings brands-label']/a")
    private WebElement productBrandLink;
    @FindBy(id = "(//a[@title='View Details'])[1]")
    private WebElement firstProductInWheyProteinPage;
    @FindBy(id = "//div[@class='expected-delivery mobile-add-cart']")
    private WebElement expectedDeliveryDateLabel;
    @FindBy(id = "//div[@class='expected-delivery mobile-add-cart']/label")
    private WebElement expectedDeliveryDateValue;
    @FindBy(id = "(//a[@class='page'])[1]")
    private WebElement pageBtnInReviewSection;
    @FindBy(id = "//a[@class='action  next ']")
    private WebElement nextReviewPageBtn;
    @FindBy(id = "//a[@class='action  previous ']")
    private WebElement previousReviewPageBtn;
    @FindBy(id = "//div[@class='search-result-title-wrapper']")
    private WebElement searchPageTitle;
    //Methods we need during testing the Product details page
    public void displayTheProduct() {
        webDriver.navigate().to(BaseURL + aeDomain + productUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
    public void addToCart() {
        DataHelperAndWait.clickOnElement(addToCartBtn,webDriver);
    }
    public void keepShopping() {
        DataHelperAndWait.clickOnElement(keepShippingBtn,webDriver);
    }
    public void viewCart() {
       DataHelperAndWait.clickOnElement(viewCartBtn , webDriver);
    }
    public void keepShoppingAfterAddingToCart(){
        this.displayTheProduct( );
        this.addToCart( );
        this.keepShopping( );
    }
    public void displayOOSProduct() {
        webDriver.navigate().to(BaseURL + aeDomain + oOSProductUrl);
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
            DataHelperAndWait.clickOnElement(pageBtnInReviewSection,webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("p=2",webDriver);
        }
        catch (Exception e){
            System.out.println("There's no pages in the Review Section");
        }
    }
}