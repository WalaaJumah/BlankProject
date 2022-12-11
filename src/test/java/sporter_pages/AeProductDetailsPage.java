package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AeProductDetailsPage {
    private final DataHelperAndWait dataHelperAndWait = new DataHelperAndWait();

    public AeProductDetailsPage(WebDriver webDriver) {
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
    @FindBy(xpath = "//*[@id=\"tab-38-all38\"]/div[1]/div/div[2]/div/a")
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
    @FindBy(css = "div[class='product-column--side'] span[data-price-type='finalPrice'] span")
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
    @FindBy(xpath = "//div[@class='swatch-option text' and @index='0']")
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
    @FindBy(id = "//div[@class='product attribute supplement_facts']/h2")
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

    //Getter Methods
    public WebElement getBundleMenu() {
        return bundleMenu;
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
        return addToCartBtn;
    }

    public WebElement getCartPopUp() {
        return cartPopUp;
    }

    public WebElement getKeepShippingBtn() {
        return keepShippingBtn;
    }

    public WebElement getViewCartBtn() {
        return viewCartBtn;
    }

    public WebElement getProductAttribute() {
        return productAttribute;
    }

    public WebElement getProductFlavor() {
        return productFlavor;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getProductCard() {
        return productCard;
    }

    public WebElement getInconvenienceWarningMsg() {
        return inconvenienceWarningMsg;
    }

    public WebElement getOOSMsg() {
        return OOSMsg;
    }

    public WebElement getAddReviewButton() {
        return addReviewButton;
    }

    public WebElement getProductUnavailableForCountry() {
        return productUnavailableForCountry;
    }

    public WebElement getReviewErrorMsg() {
        return reviewErrorMsg;
    }

    public WebElement getReviewToastMsg() {
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
        return englishLangBtn;
    }

    public WebElement getFinalProductPrice() {
        return FinalProductPrice;
    }

    public WebElement getProductPrice() {
        return productPrice;
    }

    public WebElement getFreeProductLabel() {
        return freeProductLabel;
    }

    public WebElement getFirstProductInTheCategoryList() {
        return firstProductInTheCategoryList;
    }

    public WebElement getAboutThisProductSection() {
        return aboutThisProductSection;
    }

    public WebElement getAboutThisProductTitle() {
        return aboutThisProductTitle;
    }

    public WebElement getSupplementFactsTable() {
        return supplementFactsTable;
    }

    public WebElement getSupplementFactsTitle() {
        return supplementFactsTitle;
    }

    public WebElement getAccountProfileIcon() {
        return accountProfileIcon;
    }

    public WebElement getAccountProfileOptions() {
        return accountProfileOptions;
    }

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getDirectionsOfUseSection() {
        return directionsOfUseSection;
    }

    public WebElement getAboutBrandSection() {
        return aboutBrandSection;
    }

    public WebElement getProductHeaderBar() {
        return ProductHeaderBar;
    }

    public WebElement getExpectedDeliveryDateLabel() {
        return expectedDeliveryDateLabel;
    }

    public WebElement getExpectedDeliveryDateValue() {
        return expectedDeliveryDateValue;
    }


    //Define the main actions we need to execute our TCs
    public void clickOnTheProductAttributes() {
        DataHelperAndWait.isDisplayed(productAttribute, 5);
        this.productAttribute.click();
        this.productFlavor.click();
    }

    public void addToCart() {
        DataHelperAndWait.isDisplayed(addToCartBtn, 10);
        this.addToCartBtn.click();
    }

    public void keepShopping() {
        this.keepShippingBtn.click();
    }

    public void viewCart() {
        DataHelperAndWait.waitToBeClickable(viewCartBtn, 10);
        this.viewCartBtn.click();
    }

    public void clickOnSearchBtn() {
        DataHelperAndWait.waitToBeClickable(searchBtn, 10);
        this.searchBtn.click();
    }
    public void searchForBundle() {
        DataHelperAndWait.waitToBeClickable(searchField, 10);
        this.searchField.sendKeys("Box");
    }

    public void clickOnTheProductCard() {
        DataHelperAndWait.waitToBeClickable(productCard, 10);
        this.productCard.click();
    }

    public void clickOnFirstProductFlavor() {
        DataHelperAndWait.waitToBeClickable(firstProductFlavor, 10);
        this.firstProductFlavor.click();
    }

    public void clickOnSecondProductFlavor() {
        DataHelperAndWait.waitToBeClickable(secondProductFlavor, 20);
        this.secondProductFlavor.click();
    }

    public void switchToAeCountry() {
        try {
            DataHelperAndWait.waitToBeVisible(countryList, 20);
            this.countryList.click();
            DataHelperAndWait.implicitWait(10);
            this.aeCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(countryList, 20);
            this.countryList.click();
            DataHelperAndWait.implicitWait(10);
            this.aeCountry.click();
        }
    }

    public void switchToLebanonCountry() {
        try {
            DataHelperAndWait.isDisplayed(countryList, 10);
            this.countryList.click();
            this.lebanonCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 10);
            this.countryList.click();
            this.lebanonCountry.click();
        }
    }

    public void switchToJOCountry() {
        try {
            DataHelperAndWait.isDisplayed(countryList, 10);
            this.countryList.click();
            this.joCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.isDisplayed(countryList, 10);
            this.countryList.click();
            this.joCountry.click();
        }
    }

    public void clickOnProductQuantity() {
        this.quantityField.click();
    }

    public void increaseTheQuantity() {
        this.quantityField.click();
        this.qtyPlusButton.click();
    }

    public void decreaseTheQuantity() {
        this.quantityField.click();
        this.qtyMinusButton.click();
    }

    public void clickOnProductInHomePage() {
        DataHelperAndWait.waitToBeClickable(this.productInHomePage, 10);
        this.productInHomePage.click();
    }

    public void clickOnJOProductInHomePage() {
        this.joProductInHomePage.click();
    }

    public void selectStarInReview() {
        this.oneStarReview.click();
    }

    public void clickOnSalesAndOffersMenu() {
        DataHelperAndWait.isDisplayed(salesAndOffersMenu, 10);
        this.salesAndOffersMenu.click();
    }

    public void clickOnSportsSupplementsMenu() {
        DataHelperAndWait.waitToBeClickable(SportsSupplementsMenu, 10);
        this.SportsSupplementsMenu.click();
    }

    public void submitProductReview(String reviewDesc, String reviewSummary, String nickName) {
        this.addReviewButton.click();
        this.reviewDescField.sendKeys(reviewDesc);
        this.reviewSummaryField.sendKeys(reviewSummary);
        this.nickNameField.sendKeys(nickName);
        DataHelperAndWait.waitToBeClickable(submitReviewButton, 20);
        this.submitReviewButton.click();
    }

    public void clickOnBreadcrumbHomePage() {
        this.HomeBreadcrumbs.click();
    }

    public void switchToArabicVersion() {
        DataHelperAndWait.isDisplayed(arabicLangBtn, 10);
        this.arabicLangBtn.click();
    }

    public void switchCountryThenAddProductToCart() {
        this.switchToAeCountry();
        DataHelperAndWait.implicitWait(5);
        this.clickOnProductInHomePage();
        this.addToCart();
        DataHelperAndWait.implicitWait(20);
    }

    public void clickOnShopeByMenu() {
        DataHelperAndWait.isDisplayed(shopeByMenu, 10);
        this.shopeByMenu.click();
    }

    public void clickOnBuy1Get1Card() {
        DataHelperAndWait.isDisplayed(buy1Get1Card, 10);
        this.buy1Get1Card.click();
    }

    public void clickOnFirstProductInTheCategoryList() {
        DataHelperAndWait.isDisplayed(firstProductInTheCategoryList, 10);
        for (WebElement webElement : megaMenuList) {
            webElement.click();
            break;
        }
    }

    public void DisplayProductInTheList(int listIndex) {
        DataHelperAndWait.isDisplayed(firstProductInTheCategoryList, 10);
        for (int i = 1; i < megaMenuList.size(); i++) {
            WebElement productIndex = megaMenuList.get(listIndex);
            productIndex.click();
        }
    }

    public void fillInQtyField(String qtyNumber) {
        DataHelperAndWait.isDisplayed(quantityField, 10);
        this.quantityField.sendKeys(qtyNumber);
    }

    public void clickOnAccountProfileIcon() {
        DataHelperAndWait.isDisplayed(accountProfileIcon, 10);
        this.accountProfileIcon.click();
    }

    public void clickOnAddToCartBtnInProductHeaderBar() {
        DataHelperAndWait.isDisplayed(addToCartBtnInProductHeaderBar, 10);
        this.addToCartBtnInProductHeaderBar.click();
    }

    public void clickOnProductBrandLink() {
        DataHelperAndWait.isDisplayed(productBrandLink, 10);
        this.productBrandLink.click();
    }

    public void clickOnFirstProductInWheyProteinPage() {
        DataHelperAndWait.isDisplayed(firstProductInWheyProteinPage, 10);
        this.firstProductInWheyProteinPage.click();
    }

    public void clickOnPageBtnInReviewSection() {
        DataHelperAndWait.isDisplayed(pageBtnInReviewSection, 10);
        this.pageBtnInReviewSection.click();
    }

    public void clickOnPreviousReviewPageBtn() {
        DataHelperAndWait.isDisplayed(previousReviewPageBtn, 10);
        this.previousReviewPageBtn.click();
    }

    public void clickOnNextReviewPageBtn() {
        DataHelperAndWait.isDisplayed(nextReviewPageBtn, 10);
        this.nextReviewPageBtn.click();
    }

    public void clickOnFirstProductSize() {
        DataHelperAndWait.isDisplayed(firstProductSize, 10);
        this.firstProductSize.click();
    }

    public void clickOnSecondProductSize() {
        DataHelperAndWait.isDisplayed(secondProductSize, 10);
        this.secondProductSize.click();
    }
    public WebElement getSearchField() {
        return searchField;
    }

}