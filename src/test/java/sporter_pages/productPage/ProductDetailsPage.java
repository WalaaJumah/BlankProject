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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sporter_pages.homepage_classes.HomePage;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

@Getter
public class ProductDetailsPage extends BasePage {

    DataHelperAndWait dataHelperAndWait;
    //declare all locators related to the Product Details Page
//    @FindBy(id = "productQty")
    @FindBy(xpath = "(//div[@id='qtyContainer']/input[@id='productQty'])[2]")
    private WebElement quantityField;
    @FindBy(xpath = "//div[@id='productOrderContainer']//div[@id='increaseQty']")
//    @FindBy(id = "increaseQty")
    private WebElement qtyPlusButton;
//    @FindBy(id = "decreaseQty")
    @FindBy(xpath = "//div[@id='productOrderContainer']//div[@id='decreaseQty']")
    private WebElement qtyMinusButton;
    @FindBy(xpath = "(.//*[@id='productOrderContainer'])//button[@id='addToCartBtn']")
    private WebElement addToCartBtn;
    @FindBy(xpath = "(.//*[@id='productOrderContainer'])//button[@id='addToCartBtn']")
    private WebElement addToCartBtn2;
    @FindBy(id = "popup-block")
    private WebElement cartPopUp;
    @FindBy(xpath = "//span[starts-with(@class,'spinner_loader')]")
    private WebElement cartSpinner;
    @FindBy(id = "keepShoppingBtn")
    private WebElement keepShippingBtn;
    @FindBy(id = "ThumbsUpContainer")
    private WebElement recommendedProductsPopup;
    @FindBy(xpath = "//button[@class='button_btn__zg_G5 ']/span")
    private WebElement continueBtnInOOSPoup;
    @FindBy(id = "viewCartBtn")
    private WebElement viewCartBtn;
    @FindBy(xpath = "//div[starts-with(@id,'configurableOptionLabel')]")
    private List<WebElement> productSizeAttribute;
    @FindBy(xpath = "//div[starts-with(@id,'configurableOptionLabel')]")
    private List<WebElement> productFlavor;
    @FindBy(id = "SearchButton")
    private WebElement searchBtn;
    @FindBy(id = "selectSorts")
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
    @FindBy(xpath = "//div[starts-with(@class,'productReview_rErr')]")
    private WebElement reviewErrorMsgRelatedToStars;
    @FindBy(xpath = "//button[contains(@class,'popUp_btn')]")
    private WebElement reviewToastMsgBtn;
    @FindBy(xpath = "//div[contains(@class,'popUp_popUp')]")
    private WebElement reviewToastMsg;
    @FindBy(id = "pathSegment_0")
    private WebElement HomeBreadcrumbs;
    @FindBy(xpath = "//div[starts-with(@class,'outOfStockAlert_otOfStocklabel')]")
    private WebElement OOSMsg;
    @FindBy(id = "shobBy")
    private WebElement shopByMenu;
    @FindBy(id = "SubCategoriesContainer")
    private WebElement subCategoriesSectionInMegaMenu;
    @FindBy(id = "SortItem_Sports Supplements_span")
    private WebElement sportsSupplementsInShopBy;
    @FindBy(xpath = "(//div[@id='currentPrice'])[3]")
    private WebElement FinalProductPrice;
    @FindBy(xpath = "//input[contains(@class,'searchInput')]")
    private WebElement searchField;
    @FindBy(id = "SortItem_Sales & Offers_span")
    private WebElement salesAndOffersMenu;
    @FindBy(xpath = "//li[@id='menu_3']//a")
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
    @FindBy(id = "fixedAddToCartBtn")
    private WebElement ProductHeaderBar;
    @FindBy(id = "fixedAddToCartBtn")
    private WebElement addToCartBtnInProductHeaderBar;
    @FindBy(xpath = "//div[@id='productInfoContainer']//a[starts-with(@class,'ProductBrandLink_brand')]")
    private WebElement productBrandLink;
    @FindBy(xpath = "(//div[@id='expectedDeliveryDate']/span)[1]")
    private WebElement expectedDeliveryDateLabel;
    @FindBy(xpath = "//div[@id='expectedDeliveryDate']/span[2]")
    private WebElement expectedDeliveryDateValue;
    @FindBy(xpath = "//ul[starts-with(@class,'pagination_innerPagination')]/li[@class='pagination_item__cHfvi']")
    private List<WebElement> pageBtnInReviewSection;
    @FindBy(id = "nextPage")
    private WebElement nextReviewPageBtn;
    @FindBy(id = "prevPage")
    private WebElement previousReviewPageBtn;
    @FindBy(xpath = "//div[@class='search-result-title-wrapper']")
    private WebElement searchPageTitle;
    @FindBy(xpath = "//div[@class='reviewContainer_reviewsIndicator__kU10r']")
    private WebElement reviewsPageNumber;
    @FindBy(id = "AddToCartErrContainer")
    private WebElement AddToCartErrorPopUp;
    @FindBy(id = "removeItemBtn")
    private WebElement removeItem;
    @FindBy(id = "closeAddToCartErrBtn")
    private WebElement closeToCartErrorPopUp;
    @FindBy(id = "(//ul[starts-with(@class,'topCategoryList_container')]/li/a)[3]")
    private WebElement vitaminsAndHealthMainMenu;
    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //Methods we need during testing the Product details page
    public void displayTheProduct() throws IOException {
        String productUrl1 = "";
        String currentUrl = webDriver.getCurrentUrl();
        if (currentUrl.contains("-jo")) {
            productUrl1 = productUrlJordan7;
        }
        if (currentUrl.contains("-sa")) {
            productUrl1 = productUrl;
        }
        if (currentUrl.contains("-eg")) {
            productUrl1 = productUrlEgypt;
        }
        if (currentUrl.contains("-qa")) {
            productUrl1 = productUrl;
        }
        if (currentUrl.contains("-ae")) {
            productUrl1 = productUrl;
        }
        if (currentUrl.contains("-kw")) {
            productUrl1 = productUrl;
        }
        if (currentUrl.contains("-bh")) {
            productUrl1 = productUrl;
        }
        if (currentUrl.contains("-om")) {
            productUrl1 = productUrl;
        }
        if (currentUrl.contains("-iq")) {
            productUrl1 = productUrlIraq;
        }

        webDriver.navigate().to(BaseURL + productUrl1);
        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,50);
        verifyTheDisplayedPageDoesNotHaveErrors();
        checkIfProductOOS();
    }

    public void displayTheProductHaveLessQty() throws IOException {
        if (webDriver.getCurrentUrl().contains("en-eg")) {
            webDriver.navigate().to(BaseURL + productUrlEgypt);
            verifyTheDisplayedPageDoesNotHaveErrors();
        } else
            webDriver.navigate().to(BaseURL + product2UrlLessQty);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void addToCart() {
//        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.waitToBeVisible(addToCartBtn2, webDriver);
        DataHelperAndWait.waitToBeClickable(addToCartBtn2, webDriver);
        DataHelperAndWait.JsExecutorToClickOnElement(addToCartBtn,webDriver);
//        addToCartBtn.click();
    }
    public   void waitTillCartSpinnerDisappear(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(this.cartLoaderXpath)));

    }
    public void keepShopping() {
        DataHelperAndWait.clickOnElement(keepShippingBtn, webDriver);
    }

    public void viewCart() {
//        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.waitToBeVisible(viewCartBtn, webDriver);
        viewCartBtn.click();
        this.waitTillCartSpinnerDisappear(webDriver);    }

    public void keepShoppingAfterAddingToCart() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        try {
            this.displayTheProduct();
            this.addToCart();
            this.keepShopping();
        } catch (Exception e) {
            if (this.getAddToCartErrorPopUp().isDisplayed()) {
                DataHelperAndWait.clickOnElement(this.closeToCartErrorPopUp, webDriver);
                navigateToHomePage();
                DataHelperAndWait.clickOnElement(homePage.getProductsInTopSellersSection().get(0), webDriver);
                this.displayTheProduct();
                this.addToCart();
                this.keepShopping();
            }
        }
    }


    public void displayOOSProduct() throws IOException {
        webDriver.navigate().to(BaseURL + storeCountry + oOSProductUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void increaseTheQuantity() {
//        DataHelperAndWait.clickOnElement(quantityField, webDriver);
        DataHelperAndWait.clickOnElement(qtyPlusButton, webDriver);
        this.waitTillCartSpinnerDisappear(webDriver);
    }

    public void decreaseTheQuantity() {
        DataHelperAndWait.clickOnElement(quantityField, webDriver);
        DataHelperAndWait.clickOnElement(qtyMinusButton, webDriver);
    }

    public void selectStarInReview() {
        DataHelperAndWait.clickOnElement(oneStarReview, webDriver);
    }

    public void submitProductReview(String reviewDesc, String reviewSummary, String nickName) {
        DataHelperAndWait.scrollTo(addReviewButton, webDriver);
        DataHelperAndWait.clickOnElement(addReviewButton, webDriver);
        DataHelperAndWait.typeTextInElement(reviewDescField, webDriver, reviewDesc);
        DataHelperAndWait.typeTextInElement(reviewSummaryField, webDriver, reviewSummary);
        DataHelperAndWait.typeTextInElement(nickNameField, webDriver, nickName);
        DataHelperAndWait.clickOnElement(submitReviewButton, webDriver);
    }

    public void searchForBundle() {
        DataHelperAndWait.clickOnElement(searchField, webDriver);
        DataHelperAndWait.typeTextInElement(searchField, webDriver, "Box");
        DataHelperAndWait.clickOnElement(searchBtn, webDriver);
    }

    public void verifyReviewPagingWorks() throws IOException {
//        try {
            DataHelperAndWait.clickOnElement(pageBtnInReviewSection.get(1), webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
//            WebElementsAssertion.validateTheCurrentUrlContainsString("p=2", webDriver);
//        } catch (Exception e) {
//            System.out.println("There's no pages in the Review Section");
//        }
    }
}