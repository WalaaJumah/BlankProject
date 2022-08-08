package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class ProductDetailsPage {
    private DataHelperAndWait dataHelperAndWait = new DataHelperAndWait();
    public ProductDetailsPage(WebDriver webDriver) {
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
    private WebElement productAttrubuit;
    @FindBy(id = "option-label-flavor-164-item-6939")
    private WebElement productFlavor;
    @FindBy(xpath = "//*[@id=\"algolia-searchbox\"]/button")
    private WebElement searchBtn;
    @FindBy(xpath = "//a[@data-position='1']/div[@class= 'result-thumbnail product-image-wrapper']")
    private WebElement productCard;
    @FindBy(xpath = "//span[@class='fas fa-chevron-down']")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='OM']")
    private WebElement omanCountry;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='JO']")
    private WebElement joCountry;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/a[1]/picture/img")
    private WebElement firstProductInHomePage;
    @FindBy(xpath = "//*[@id=\"tab-38-all38\"]/div[1]/div/div[2]/div/a")
    private WebElement productInHomePage;
    @FindBy(id = "Overall Evaluation_1_label")
    private WebElement oneStarReview;
    @FindBy(xpath = "//span[@class='button button-review orange-btn']")
    private WebElement addReviewButton;
    @FindBy(id = "review_field")
    private WebElement reviewDescField;
    @FindBy(id = "summary_field")
    private WebElement reviewSummaryField;
    @FindBy(id = "nickname_field")
    private WebElement nickeNameField;
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
    private WebElement productUnavialableForCountry;
    @FindBy(linkText = "Shop By")
    private WebElement shopByMenyu;
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
    @FindBy(xpath="//div[@class='swatch-attribute flavor']/div/div[@tabindex=0 and @index='0']")
    private WebElement firtProdutFlavor;
    @FindBy(xpath="//div[@class='swatch-attribute flavor']/div/div[@tabindex=0 and @index='2']")
    private WebElement secondProductFlavor;
    //Getter Methods
    public WebElement getBundleMenu() {return bundleMenu;}
    public WebElement getQuantityField() {return quantityField;}
    public WebElement getQtyPlusButton() {return qtyPlusButton;}
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
    public WebElement getProductAttrubuit() {
        return productAttrubuit;
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
    public WebElement getInconvenienceWarningMsg() {return inconvenienceWarningMsg;}
    public WebElement getOOSMsg() {
        return OOSMsg;
    }
    public WebElement getAddReviewButton() {return addReviewButton;}
    public WebElement getProductUnavialableForCountry() {
        return productUnavialableForCountry;
    }
    public WebElement getReviewErrorMsg() {
        return reviewErrorMsg;
    }
    public WebElement getReviewToastMsg() {
        return reviewToastMsg;
    }
    public WebElement getLanguageSwitcher() {return languageSwitcher;}
    public WebElement getCountryList() {
        return countryList;
    }
    public WebElement getHomeBreadcrumbs() {return HomeBreadcrumbs;}
    public WebElement getEnglishLangBtn() {return englishLangBtn;}
    public WebElement getProductPrice() {return productPrice;}
    public WebElement getFreeProductLabel() {return freeProductLabel;}
    public WebElement getFirstProductInTheCategoryList() {return firstProductInTheCategoryList;}



    //Define the main actions we need to execute our TCs
    public void clickOnTheProductAttrubuits() {
        DataHelperAndWait.isDisplayed(productAttrubuit, 5);
        this.productAttrubuit.click();
        this.productFlavor.click();
    }
    public void addToCart() {
        DataHelperAndWait.isDisplayed(addToCartBtn, 10);
        this.addToCartBtn.click();
    }
    public void keepShopping() {this.keepShippingBtn.click();}
    public void viewCart() {
        DataHelperAndWait.waitToBeClickable(viewCartBtn,10);
        this.viewCartBtn.click();
    }
    public void clickOnSearchBtn() {
        dataHelperAndWait.waitToBeClickable(searchBtn, 10);
        this.searchBtn.click();}
    public void searchForBundle() {
        dataHelperAndWait.waitToBeClickable(searchField, 10);
        this.searchField.sendKeys("Box");
    }
    public void clickOnTheProductCard() {
        DataHelperAndWait.waitToBeClickable(productCard, 10);
        this.productCard.click();
    }
    public void clickOnFirstProductFlavor(){
        DataHelperAndWait.waitToBeClickable(firtProdutFlavor, 10);
        this.firtProdutFlavor.click();
    }
    public void clickOnSecondProductFlavor(){
        DataHelperAndWait.waitToBeClickable(secondProductFlavor, 20);
        this.secondProductFlavor.click();
    }
    public void switchCountry() {
        DataHelperAndWait.waitToBeVisible(countryList, 20);
        this.countryList.click();
        DataHelperAndWait.implicitWait(10);
        this.aeCountry.click();
    }
    public void switchToOmanCountry() {
        DataHelperAndWait.isDisplayed(countryList, 10);
        this.countryList.click();
        this.omanCountry.click();
    }
    public void switchToJOCountry() {
        DataHelperAndWait.isDisplayed(countryList, 10);
        this.countryList.click();
        this.joCountry.click();
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
        this.productInHomePage.click();
    }
    public void selectStarInReview() {
        this.oneStarReview.click();
    }
    public void clickOnSalesAndOffersMenu() {
        DataHelperAndWait.isDisplayed(salesAndOffersMenu, 10);
        this.salesAndOffersMenu.click();
    }
    public void clickOnSportsSupplementsMenu() {
        DataHelperAndWait.isDisplayed(SportsSupplementsMenu, 10);
        this.SportsSupplementsMenu.click();
    }

    public void submitProductReview(String reviewDesc, String reviewSummary, String nickeName) {
        this.addReviewButton.click();
        this.reviewDescField.sendKeys(reviewDesc);
        this.reviewSummaryField.sendKeys(reviewSummary);
        this.nickeNameField.sendKeys(nickeName);
        dataHelperAndWait.waitToBeClickable(submitReviewButton, 20);
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
        this.switchCountry();
        dataHelperAndWait.implicitWait(5);
        this.clickOnProductInHomePage();
        this.addToCart();
        dataHelperAndWait.implicitWait(20);
    }
    public void clickOnShopeByMenu() {
        dataHelperAndWait.isDisplayed(shopeByMenu, 10);
        this.shopeByMenu.click();
    }
    public void clickOnBuy1Get1Card() {
        dataHelperAndWait.isDisplayed(buy1Get1Card, 10);
        this.buy1Get1Card.click();
    }
    public void clickOnFirstProductInTheCategoryList() {
        dataHelperAndWait.isDisplayed(firstProductInTheCategoryList, 10);
        for (WebElement webElement : megaMenuList) {
            webElement.click();
            break;
        }
    }
    public void DisplayProductInTheList(int listIndex){
        dataHelperAndWait.isDisplayed(firstProductInTheCategoryList, 10);
        for(int i = 1; i<megaMenuList.size(); i++){
            WebElement productIndex= megaMenuList.get(listIndex);
            productIndex.click();
        }
    }
    public void fillInQtyField(String qtyNumber){
        dataHelperAndWait.isDisplayed(quantityField, 10);
        this.quantityField.sendKeys(qtyNumber);


    }
}