/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription RecommendedProductPage
 */

package sporter_pages.RecommendedProductsPage;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.productPage.ProductDetailsPage;

import java.util.List;

@Getter
public class RecommendedProductPage extends BasePage {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);

    public RecommendedProductPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    //declare all locators related to the Cart Page
    //TODO: Validate it after adding the WebElement ID By Moamen
    @FindBy(css = "path")
    private WebElement recommendedProductsCloseIcon;
    @FindBy(css = "#ThumbsUpHeader > svg")
    private WebElement circleIcon;
    @FindBy(id = "ThumbsUpHeader")
    private WebElement thumbsUpTitle;
    @FindBy(id = "addedProductName")
    private WebElement addedProductToCartMsg;
    @FindBy(xpath = "//div[@id='recommendProductsContainer']/div//img")
    private List<WebElement> productImages;
    @FindBy(xpath = "//div[@id='recommendProductsContainer']/div//div[starts-with(@class,'product_price')]")
    private List<WebElement> productPrice;
    @FindBy(xpath = "(//div[@class='item-price'])[1]//span[@data-price-type='finalPrice']")
    private WebElement productPriceForFirstProduct;
    @FindBy(xpath = "(//div[@class='cart-button'])[1]")
    private WebElement addToCartBtnForFirstProduct;
    @FindBy(id = "recommendProductsLabel")
    private WebElement recommendedProductsTitle;
    @FindBy(xpath = "//div[@id='recommendProductsContainer']/div//div[starts-with(@class,'product_button')]")
    private List<WebElement> addToCartBtn;
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
    public void clickOnAllListItemsAppearingInTheRecommendedPopup(List<WebElement> webElement){
        for (int i = 0; i < webElement.size(); i++){
            DataHelperAndWait.clickOnElement(webElement.get(i),webDriver);
            this.displayTheRecommendedProductsPopUp();
        }
    }
    public  void clickOnListItemsAndAssertion(List<WebElement> webElement, WebDriver webDriver, WebElement webElementToBeAssert){
        for (int i = 0; i < webElement.size(); i++){
            DataHelperAndWait.hoverOnElement(webElement.get(i),webDriver);
            DataHelperAndWait.scrollToPositionZero(webDriver);
            DataHelperAndWait.clickOnElement(webElement.get(i),webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(webElementToBeAssert,webDriver);
            this.displayTheRecommendedProductsPopUp();
            DataHelperAndWait.scrollToPositionZero(webDriver);
        }
    }
    public void clickOnProductCard(){
        for (int i = 0; i < productImages.size(); i++){
            DataHelperAndWait.clickOnElement(productImages.get(i),webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
            break;
        }
    }
}
