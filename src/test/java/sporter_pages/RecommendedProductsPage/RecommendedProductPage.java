/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription RecommendedProductPage
 */

package sporter_pages.RecommendedProductsPage;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.productPage.ProductDetailsPage;

@Getter
public class RecommendedProductPage extends BasePage {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);

    public RecommendedProductPage(WebDriver webDriver) {
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
    @FindBy(xpath = "(//button[@class='custom-button blue-btn'])[2]")
    private WebElement addToCart;
    @FindBy(xpath = "(//div[@class='inner-seller-prod'])[1]")
    private WebElement firstProductCard;
    @FindBy(xpath = "(//a[@class='rcmd-product-name'])[1]")
    private WebElement firstProductName;

    public void displayTheRecommendedProductsPopUp(){
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getKeepShippingBtn(),webDriver);
    }
}