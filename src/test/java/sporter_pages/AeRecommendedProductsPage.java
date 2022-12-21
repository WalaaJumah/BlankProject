package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.crypto.Data;

public class AeRecommendedProductsPage extends BasePage {
    public AeRecommendedProductsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //declare all locators related to the Cart Page
    @FindBy(xpath = "//a[@class='close-popup close-cart-popup']")
    private WebElement recommendedProductsCloseIcon;
    @FindBy(xpath = "//h2/i[1]")
    private WebElement circleIcon;
    @FindBy(xpath = "//h2[normalize-space()='Thumbs Up']")
    private WebElement thumbsUpTitle;
    @FindBy(xpath = "//*[@id='popup-block']/p")
    private WebElement addedProductToCartMsg;
    @FindBy(xpath = "//*[@class='prod-img']")
    private WebElement productImages;
    @FindBy(xpath = "//div[@class='item-price']")
    private WebElement productPrice;
    @FindBy(xpath = "(//div[@class='item-price'])[1]//span[@data-price-type='finalPrice']")
    private WebElement productPriceForFirstProduct;
    @FindBy(xpath = "(//div[@class='cart-button'])[1]")
    private WebElement addToCartBtnForFirstProduct;
    @FindBy(css = "div[id='popup-block'] h2:nth-child(1)")
    private WebElement recommendedProductsTitle;
    @FindBy(xpath = "//div[@class='cart-button']")
    private WebElement addToCartBtn;
    @FindBy(xpath = "//div[3]/div/div/div[2]/div[2]/button")
    private WebElement addToCart;
    @FindBy(xpath = "(//div[@class='inner-seller-prod'])[1]")
    private WebElement firstProductCard;
    @FindBy(xpath = "(//a[@class='rcmd-product-name'])[1]")
    private WebElement firstProductName;

    //Getter Methods
    public WebElement getCircleIcon() {
        DataHelperAndWait.waitToBeVisible(circleIcon,6,webDriver);
        return circleIcon;
    }

    public WebElement getThumbsUpTitle() {
        DataHelperAndWait.waitToBeVisible(thumbsUpTitle,5,webDriver);
        return thumbsUpTitle;
    }

    public WebElement getAddedProductToCartMsg() {
        DataHelperAndWait.waitToBeVisible(addedProductToCartMsg,5,webDriver);
        return addedProductToCartMsg;
    }

    public WebElement getRecommendedProductsTitle() {
        DataHelperAndWait.waitToBeVisible(recommendedProductsTitle,5,webDriver);
        return recommendedProductsTitle;
    }

    public WebElement getProductPrice() {
        DataHelperAndWait.waitToBeVisible(productPrice,5,webDriver);
        return productPrice;
    }

    public WebElement getProductImages() {
        DataHelperAndWait.waitToBeVisible(productImages,5,webDriver);
        return productImages;
    }

    public WebElement getAddToCartBtn() {
        DataHelperAndWait.waitToBeVisible(addToCartBtn,5,webDriver);
        return addToCartBtn;
    }

    public WebElement getProductPriceForFirstProduct() {
        DataHelperAndWait.waitToBeVisible(productPriceForFirstProduct,5,webDriver);
        return productPriceForFirstProduct;
    }

    public WebElement getFirstProductName() {
        return firstProductName;
    }

    //Define the main actions we need to execute our TCs
    public void clickOnRecommendedProductsCloseIcon() {
        DataHelperAndWait.waitToBeVisible(recommendedProductsCloseIcon, 3,webDriver);
        this.recommendedProductsCloseIcon.click();
    }

    public void clickOnAddToCart() {
        DataHelperAndWait.waitToBeVisible(addToCart, 4,webDriver);
        this.addToCart.click();
    }

    public void clickOnAddToCartBtnForFirstProduct() {
        DataHelperAndWait.waitToBeVisible(addToCartBtnForFirstProduct, 3,webDriver);
        this.addToCartBtnForFirstProduct.click();
    }

    public void clickOnFirstProductCard() {
        DataHelperAndWait.waitToBeVisible(firstProductCard, 3,webDriver);
        this.firstProductCard.click();
    }
    public void navigateToHomePage(){webDriver.navigate().to(siteURL);}
}