package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.NoSuchElementException;

public class AeProductDetailsPage extends BasePage {

    public AeProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //declare all locators related to the Product Details Page
    @FindBy(id = "qty")
    private WebElement quantityField;
    @FindBy(xpath = "//a[@class='btn-qty-control btn-qty-control--plus']")
    private WebElement qtyPlusButton;
    @FindBy(xpath = "//a[@class='btn-qty-control btn-qty-control--minus']")
    private WebElement qtyMinusButton;
    @FindBy(id = "product-addtocart-button")
    private WebElement addToCartBtn;
    @FindBy(id = "popup-block")
    private WebElement cartPopUp;
    @FindBy(xpath = "//*[@id=\"popup-block\"]/div[2]/a[1]")
    private WebElement keepShippingBtn;
    @FindBy(xpath = "//button[@class='button close-popup-err']")
    private WebElement inconvenienceWarningMsg;
    @FindBy(xpath = "//*[@id=\"popup-block\"]/div[2]/a[2]")
    private WebElement viewCartBtn;
    @FindBy(id = "option-label-size-165-item-10037")
    private WebElement productAttribute;
    @FindBy(id = "option-label-flavor-164-item-6939")
    private WebElement productFlavor;
    @FindBy(xpath = "//*[@id=\"algolia-searchbox\"]/button")
    private WebElement searchBtn;
    @FindBy(xpath = "//a[@data-position='1']/div[@class= 'result-thumbnail product-image-wrapper']")
    private WebElement productCard;
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='LB']")
    private WebElement lebanonCountry;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='JO']")
    private WebElement joCountry;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/a[1]/picture/img")
    private WebElement firstProductInHomePage;
    @FindBy(xpath = "(//div[@class='inner-seller-prod wp-id-6527']/a)[1]")
    private WebElement productInHomePage;
    @FindBy(xpath = "//*[@id=\"tab-67-all67\"]/div[1]/div/div[1]/div/a")
    private WebElement joProductInHomePage;
    @FindBy(id = "Overall Evaluation_1_label")
    private WebElement oneStarReview;
    @FindBy(xpath = "//span[@class='button button-review orange-btn']")
    private WebElement addReviewButton;
    @FindBy(id = "review_field")
    private WebElement reviewDescField;
    @FindBy(id = "summary_field")
    private WebElement reviewSummaryField;
    @FindBy(id = "nickname_field")
    private WebElement nickNameField;
    @FindBy(xpath = "//*[text()='Submit Review']")
    private WebElement submitReviewButton;
    @FindBy(id = "ratings[2]-error")
    private WebElement reviewErrorMsg;
    @FindBy(xpath = "//div[contains(text(),'You submitted your review for moderation.')]")
    private WebElement reviewToastMsg;
    @FindBy(xpath = "//a[normalize-space()='Home']")
    private WebElement HomeBreadcrumbs;
    @FindBy(xpath = "//*[text()='عربي']")
    private WebElement arabicLangBtn;
    @FindBy(xpath = "//*[text()='English']")
    private WebElement englishLangBtn;
    @FindBy(id = "switcher-language")
    private WebElement languageSwitcher;
    @FindBy(xpath = "//span[contains(text(),\"We're sorry for not being able to provide you with\")]")
    private WebElement OOSMsg;
    @FindBy(xpath = "//div[@class='error-content-outer offer-not-available']/div[@class='block-content-wrapper search-outer']")
    private WebElement productUnavailableForCountry;
    @FindBy(linkText = "Shop By")
    private WebElement shopByMenu;
    @FindBy(xpath = "(//span[@class='price'])[8]")
    private WebElement FinalProductPrice;
    @FindBy(css = "div[class='product-column--side'] span[class='price']")
    private WebElement productPrice;
    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchField;
    @FindBy(xpath = ".//*[@class='nav-primary']/li[1]")
    private WebElement shopeByMenu;
    @FindBy(xpath = ".//*[@class='cd-dropdown-content']/li[8]")
    private WebElement salesAndOffersMenu;
    @FindBy(xpath = ".//*[@class='cd-dropdown-content']/li[1]")
    private WebElement SportsSupplementsMenu;
    @FindBy(xpath = "//select")
    private WebElement bundleMenu;
    @FindBy(xpath = ".//*[@class='swiper-wrapper clearfix']/li[3]")
    private WebElement buy1Get1Card;
    @FindBy(xpath = "//ol[@class='products list items product-items']//li")
    private WebElement firstProductInTheCategoryList;
    @FindBy(xpath = "//ol[@class='products list items product-items']//li")
    private List productsListInTheCategoryPage;
    @FindBy(xpath = "//strong[contains(text(),'Free')]")
    private WebElement freeProductLabel;
    @FindBy(xpath = "//ol[@class='products list items product-items']//li")
    private List<WebElement> megaMenuList;
    @FindBy(xpath = "//div[@class='swatch-attribute flavor']/div/div[@tabindex=0 and @index='0']")
    private WebElement firstProductFlavor;
    @FindBy(xpath = "(//div[@index='5'])[1]")
    private WebElement firstProductSize;
    @FindBy(xpath = "//div[@class='swatch-option text' and @index='1']")
    private WebElement secondProductSize;
    @FindBy(xpath = "//div[@class='swatch-attribute flavor']/div/div[@tabindex=0 and @index='2']")
    private WebElement secondProductFlavor;
    @FindBy(xpath = "//div[@class='product attribute description']")
    private WebElement aboutThisProductSection;
    @FindBy(xpath = "//div[@class='product attribute directions_of_use']")
    private WebElement directionsOfUseSection;
    @FindBy(xpath = "//div[@class='about-brand']")
    private WebElement aboutBrandSection;
    @FindBy(xpath = "//div[@class='product attribute description']/h3")
    private WebElement aboutThisProductTitle;
    @FindBy(id = "product-attribute-specs-table")
    private WebElement supplementFactsTable;
    @FindBy(xpath = "//div[@class='product attribute supplement_facts']/h2")
    private WebElement supplementFactsTitle;
    @FindBy(xpath = "//a[@class='user-account']")
    private WebElement accountProfileIcon;
    @FindBy(xpath = "(//div[@id='header-account']/div/ul)[2]")
    private WebElement accountProfileOptions;
    @FindBy(xpath = "//div[@class='page-title-wrapper product']/h1/span")
    private WebElement productName;
    @FindBy(xpath = "//div[@class='header-bar main-container']")
    private WebElement ProductHeaderBar;
    @FindBy(xpath = "(//button[@title='Add to Cart'])[1]")
    private WebElement addToCartBtnInProductHeaderBar;
    @FindBy(xpath = "//div[@class='ratings brands-label']/a")
    private WebElement productBrandLink;
    @FindBy(xpath = "(//a[@title='View Details'])[1]")
    private WebElement firstProductInWheyProteinPage;
    @FindBy(xpath = "//div[@class='expected-delivery mobile-add-cart']")
    private WebElement expectedDeliveryDateLabel;
    @FindBy(xpath = "//div[@class='expected-delivery mobile-add-cart']/label")
    private WebElement expectedDeliveryDateValue;
    @FindBy(xpath = "(//a[@class='page'])[1]")
    private WebElement pageBtnInReviewSection;
    @FindBy(xpath = "//a[@class='action  next ']")
    private WebElement nextReviewPageBtn;
    @FindBy(xpath = "//a[@class='action  previous ']")
    private WebElement previousReviewPageBtn;
    @FindBy(xpath = "//div[@class='search-result-title-wrapper']")
    private WebElement searchPageTitle;

    //Getter Methods
    public WebElement getBundleMenu() {
        DataHelperAndWait.waitToBeVisible(bundleMenu, 5, webDriver);
        return bundleMenu;
    }

    public WebElement getSearchPageTitle() {
        DataHelperAndWait.waitToBeVisible(searchPageTitle, 5, webDriver);
        return searchPageTitle;
    }

    public WebElement getQuantityField() {
        return quantityField;
    }

    public WebElement getQtyPlusButton() {
        return qtyPlusButton;
    }

    public WebElement getQtyMinusButton() {
        return qtyMinusButton;
    }

    public WebElement getAddToCartBtn() {
        DataHelperAndWait.waitToBeVisible(addToCartBtn, 5, webDriver);
        return addToCartBtn;
    }

    public WebElement getCartPopUp() {
        return cartPopUp;
    }

    public WebElement getKeepShippingBtn() {
        DataHelperAndWait.waitToBeVisible(keepShippingBtn, 5, webDriver);
        return keepShippingBtn;
    }

    public WebElement getViewCartBtn() {
        DataHelperAndWait.waitToBeVisible(viewCartBtn, 5, webDriver);
        return viewCartBtn;
    }

    public WebElement getProductAttribute() {
        return productAttribute;
    }

    public WebElement getProductFlavor() {
        return productFlavor;
    }

    public WebElement getSearchBtn() {
        DataHelperAndWait.waitToBeClickable(searchBtn, 5, webDriver);
        return searchBtn;
    }

    public WebElement getProductCard() {
        return productCard;
    }

    public WebElement getInconvenienceWarningMsg() {
        DataHelperAndWait.waitToBeVisible(inconvenienceWarningMsg, 5, webDriver);
        return inconvenienceWarningMsg;
    }

    public WebElement getOOSMsg() {
        DataHelperAndWait.waitToBeVisible(OOSMsg, 5, webDriver);
        return OOSMsg;
    }

    public WebElement getAddReviewButton() {
        return addReviewButton;
    }

    public WebElement getProductUnavailableForCountry() {
        return productUnavailableForCountry;
    }

    public WebElement getReviewErrorMsg() {
        DataHelperAndWait.waitToBeVisible(reviewErrorMsg, 5, webDriver);
        return reviewErrorMsg;
    }

    public WebElement getReviewToastMsg() {
        DataHelperAndWait.waitToBeVisible(reviewToastMsg, 5, webDriver);
        return reviewToastMsg;
    }

    public WebElement getLanguageSwitcher() {
        return languageSwitcher;
    }

    public WebElement getCountryList() {
        return countryList;
    }

    public WebElement getHomeBreadcrumbs() {
        return HomeBreadcrumbs;
    }

    public WebElement getEnglishLangBtn() {
        DataHelperAndWait.waitToBeVisible(englishLangBtn, 5, webDriver);
        return englishLangBtn;
    }

    public WebElement getFinalProductPrice() {
        DataHelperAndWait.waitToBeVisible(FinalProductPrice, 5, webDriver);
        return FinalProductPrice;
    }

    public WebElement getProductPrice() {
        DataHelperAndWait.waitToBeVisible(productPrice, 5, webDriver);
        return productPrice;
    }

    public WebElement getFreeProductLabel() {
        DataHelperAndWait.waitToBeVisible(freeProductLabel, 5, webDriver);
        return freeProductLabel;
    }

    public WebElement getFirstProductInTheCategoryList() {
        return firstProductInTheCategoryList;
    }

    public WebElement getAboutThisProductSection() {
        DataHelperAndWait.waitToBeVisible(aboutThisProductSection, 5, webDriver);
        return aboutThisProductSection;
    }

    public WebElement getAboutThisProductTitle() {
        DataHelperAndWait.waitToBeVisible(aboutThisProductTitle, 5, webDriver);
        return aboutThisProductTitle;
    }

    public WebElement getSupplementFactsTable() {
        DataHelperAndWait.waitToBeVisible(supplementFactsTable, 5, webDriver);
        return supplementFactsTable;
    }

    public WebElement getSupplementFactsTitle() {
        DataHelperAndWait.waitToBeVisible(supplementFactsTitle, 6, webDriver);
        return supplementFactsTitle;
    }

    public WebElement getAccountProfileIcon() {
        return accountProfileIcon;
    }

    public WebElement getAccountProfileOptions() {
        DataHelperAndWait.waitToBeVisible(accountProfileOptions, 5, webDriver);
        return accountProfileOptions;
    }

    public WebElement getProductName() {
        DataHelperAndWait.waitToBeVisible(productName, 5, webDriver);
        return productName;
    }

    public WebElement getDirectionsOfUseSection() {
        DataHelperAndWait.waitToBeVisible(directionsOfUseSection, 5, webDriver);
        return directionsOfUseSection;
    }

    public WebElement getAboutBrandSection() {
        DataHelperAndWait.waitToBeVisible(aboutBrandSection, 5, webDriver);
        return aboutBrandSection;
    }

    public WebElement getProductHeaderBar() {
        DataHelperAndWait.waitToBeVisible(ProductHeaderBar, 5, webDriver);
        return ProductHeaderBar;
    }

    public WebElement getExpectedDeliveryDateLabel() {
        DataHelperAndWait.waitToBeVisible(expectedDeliveryDateLabel, 5, webDriver);
        return expectedDeliveryDateLabel;
    }

    public WebElement getExpectedDeliveryDateValue() {
        DataHelperAndWait.waitToBeVisible(expectedDeliveryDateValue, 5, webDriver);
        return expectedDeliveryDateValue;
    }


    //Define the main actions we need to execute our TCs
    public void clickOnTheProductAttributes() {
        DataHelperAndWait.isDisplayed(productAttribute, 3, webDriver);
        this.productAttribute.click();
        this.productFlavor.click();
    }

    public void addToCart() {
        DataHelperAndWait.waitToBeClickable(addToCartBtn, 5, webDriver);
        this.addToCartBtn.click();
    }

    public void keepShopping() {
        DataHelperAndWait.waitToBeVisible(keepShippingBtn, 5, webDriver);
        this.keepShippingBtn.click();
    }

    public void viewCart() {
        DataHelperAndWait.waitToBeClickable(viewCartBtn, 3, webDriver);
        this.viewCartBtn.click();
    }

    public void clickOnSearchBtn() {
        DataHelperAndWait.waitToBeClickable(searchBtn, 3, webDriver);
        this.searchBtn.click();
    }

    public void searchForBundle() {
        DataHelperAndWait.waitToBeClickable(searchField, 5, webDriver);
        this.searchField.sendKeys("Box");
    }

    public void clickOnTheProductCard() {
        DataHelperAndWait.waitToBeClickable(productCard, 5, webDriver);
        this.productCard.click();
    }

    public void clickOnFirstProductFlavor() {
        DataHelperAndWait.waitToBeClickable(firstProductFlavor, 3, webDriver);
        this.firstProductFlavor.click();
    }

    public void clickOnSecondProductFlavor() {
        DataHelperAndWait.waitToBeClickable(secondProductFlavor, 3, webDriver);
        this.secondProductFlavor.click();
    }

    public void switchToAECountry() {
        try {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 5, webDriver);
            this.aeCountry.click();
        } catch (Exception e) {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 6, webDriver);
            this.aeCountry.click();
        }
    }

    public void switchToLebanonCountry() {
        try {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 1, webDriver);
            this.lebanonCountry.click();
        } catch (Exception e) {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 5, webDriver);
            this.lebanonCountry.click();
        }
    }

    public void switchToJOCountry() {
        try {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 3, webDriver);
            this.joCountry.click();
        } catch (Exception e) {
            this.countryList.click();
            DataHelperAndWait.isDisplayed(countryList, 2, webDriver);
            this.joCountry.click();
        }
    }

    public void clickOnProductQuantity() {
        this.quantityField.click();
    }

    public void increaseTheQuantity() {
        DataHelperAndWait.waitToBeVisible(quantityField, 5, webDriver);
        this.quantityField.click();
        DataHelperAndWait.waitToBeVisible(qtyPlusButton, 5, webDriver);
        this.qtyPlusButton.click();
    }

    public void decreaseTheQuantity() {
        DataHelperAndWait.waitToBeVisible(quantityField, 5, webDriver);
        this.quantityField.click();
        DataHelperAndWait.waitToBeVisible(qtyMinusButton, 5, webDriver);
        this.qtyMinusButton.click();
    }

    public void clickOnProductInHomePage() {
        DataHelperAndWait.waitToBeClickable(this.productInHomePage, 5, webDriver);
        this.productInHomePage.click();
    }

    public void clickOnJOProductInHomePage() {
        this.joProductInHomePage.click();
    }

    public void selectStarInReview() {
        DataHelperAndWait.waitToBeVisible(oneStarReview, 5, webDriver);
        this.oneStarReview.click();
    }

    public void clickOnSalesAndOffersMenu() {
        DataHelperAndWait.isDisplayed(salesAndOffersMenu, 3, webDriver);
        this.salesAndOffersMenu.click();
    }

    public void clickOnSportsSupplementsMenu() {
        DataHelperAndWait.waitToBeClickable(SportsSupplementsMenu, 3, webDriver);
        this.SportsSupplementsMenu.click();
    }

    public void submitProductReview(String reviewDesc, String reviewSummary, String nickName) {
        DataHelperAndWait.waitToBeVisible(addReviewButton, 5, webDriver);
        this.addReviewButton.click();
        DataHelperAndWait.waitToBeVisible(reviewDescField, 5, webDriver);
        this.reviewDescField.sendKeys(reviewDesc);
        DataHelperAndWait.waitToBeVisible(reviewSummaryField, 5, webDriver);
        this.reviewSummaryField.sendKeys(reviewSummary);
        DataHelperAndWait.waitToBeVisible(nickNameField, 5, webDriver);
        this.nickNameField.sendKeys(nickName);
        DataHelperAndWait.waitToBeClickable(submitReviewButton, 3, webDriver);
        this.submitReviewButton.click();
    }

    public void clickOnBreadcrumbHomePage() {
        DataHelperAndWait.waitToBeVisible(HomeBreadcrumbs, 5, webDriver);
        this.HomeBreadcrumbs.click();
    }

    public void switchToArabicVersion() {
        DataHelperAndWait.isDisplayed(arabicLangBtn, 5, webDriver);
        this.arabicLangBtn.click();
    }

    public void switchCountryThenAddProductToCart() {
        this.switchToAECountry();
        DataHelperAndWait.waitToBeVisible(productInHomePage, 3, webDriver);
        this.clickOnProductInHomePage();
        this.addToCart();
    }

    public void clickOnShopeByMenu() {
        DataHelperAndWait.isDisplayed(shopeByMenu, 3, webDriver);
        this.shopeByMenu.click();
    }

    public void clickOnBuy1Get1Card() {
        DataHelperAndWait.isDisplayed(buy1Get1Card, 3, webDriver);
        this.buy1Get1Card.click();
    }

    public void clickOnFirstProductInTheCategoryList() {
        DataHelperAndWait.isDisplayed(firstProductInTheCategoryList, 3, webDriver);
        for (WebElement webElement : megaMenuList) {
            webElement.click();
            break;
        }
    }

    public void DisplayProductInTheList(int listIndex) {
        DataHelperAndWait.isDisplayed(firstProductInTheCategoryList, 3, webDriver);
        for (int i = 1; i < megaMenuList.size(); i++) {
            WebElement productIndex = megaMenuList.get(listIndex);
            productIndex.click();
        }
    }

    public void fillInQtyField(String qtyNumber) {
        DataHelperAndWait.isDisplayed(quantityField, 3, webDriver);
        this.quantityField.sendKeys(qtyNumber);
    }

    public void clickOnAccountProfileIcon() {
        DataHelperAndWait.isDisplayed(accountProfileIcon, 5, webDriver);
        this.accountProfileIcon.click();
    }

    public void clickOnAddToCartBtnInProductHeaderBar() {
        DataHelperAndWait.isDisplayed(addToCartBtnInProductHeaderBar, 3, webDriver);
        this.addToCartBtnInProductHeaderBar.click();
    }

    public void clickOnProductBrandLink() {
        DataHelperAndWait.isDisplayed(productBrandLink, 5, webDriver);
        this.productBrandLink.click();
    }

    public void clickOnFirstProductInWheyProteinPage() {
        DataHelperAndWait.isDisplayed(firstProductInWheyProteinPage, 3, webDriver);
        this.firstProductInWheyProteinPage.click();
    }

    public void clickOnPageBtnInReviewSection() {
        DataHelperAndWait.isDisplayed(pageBtnInReviewSection, 5, webDriver);
        this.pageBtnInReviewSection.click();
    }

    public void clickOnPreviousReviewPageBtn() {
        DataHelperAndWait.isDisplayed(previousReviewPageBtn, 3, webDriver);
        this.previousReviewPageBtn.click();
    }

    public void clickOnNextReviewPageBtn() {
        DataHelperAndWait.isDisplayed(nextReviewPageBtn, 5, webDriver);
        this.nextReviewPageBtn.click();
    }

    public void clickOnFirstProductSize() {
        DataHelperAndWait.isDisplayed(firstProductSize, 3, webDriver);
        this.firstProductSize.click();
    }

    public void clickOnSecondProductSize() {
        DataHelperAndWait.isDisplayed(secondProductSize, 3, webDriver);
        this.secondProductSize.click();
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public void displayTheProduct() {
        webDriver.navigate().to(siteURL + aeDomain + productUrl);
    }

    public void displayNotAvailableOfferProduct() {
        webDriver.navigate().to( siteURL+ aeDomain + notAvailableOfferProduct);
    }

    public void displayOOSProduct() {
        webDriver.navigate().to(siteURL + aeDomain + oOSProductUrl);
    }

    public void navigateToHomePage() {
        webDriver.navigate().to(siteURL);
    }

    public boolean isAddToCartBtnDisplayed() {
        try{
        if(addToCartBtn.isDisplayed());
        return true;}
        catch (NoSuchElementException exception){
            return false;
        }
    }
}