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
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.productPage.ProductDetailsPage;

import java.io.IOException;
import java.util.List;

@Getter
public class RecommendedProductPage extends BasePage {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
    HomePage homePage=new HomePage(webDriver);
    HeaderSection headerSection= new HeaderSection(webDriver);

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
    @FindBy(id = "ThumbsUpHeader")
    private WebElement recommendedProductsTitle;
    @FindBy(xpath = "//div[@id='recommendProductsContainer']/div//div[starts-with(@class,'product_button')]")
    private List<WebElement> addToCartBtn;
    @FindBy(xpath = "(//button[@class='custom-button blue-btn'])[2]")
    private WebElement addToCart;
    @FindBy(xpath = "(//div[@class='inner-seller-prod'])[1]")
    private WebElement firstProductCard;
    @FindBy(xpath = "(//a[@class='rcmd-product-name'])[1]")
    private WebElement firstProductName;


    public void displayTheRecommendedProductsPopUp() throws IOException {
        productDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
//        DataHelperAndWait.waitToBeVisible(productDetailsPage.getKeepShippingBtn(),webDriver);
        try{
            productDetailsPage.addToCart();
            DataHelperAndWait.waitToBeVisible(productDetailsPage.getKeepShippingBtn(),webDriver);}
        catch (Exception e){
            if(productDetailsPage.getAddToCartErrorPopUp().isDisplayed()){
                DataHelperAndWait.clickOnElement(productDetailsPage.getCloseToCartErrorPopUp(),webDriver);
                DataHelperAndWait.clickOnElement(headerSection.getCartIcon(),webDriver);
                DataHelperAndWait.clickOnElement(headerSection.getViewCartLinkInCartPopUp(),webDriver);
                DataHelperAndWait.clickOnElement(productDetailsPage.getRemoveItem(),webDriver);
                productDetailsPage.displayTheProduct();
                productDetailsPage.addToCart();
                DataHelperAndWait.waitToBeVisible(productDetailsPage.getKeepShippingBtn(),webDriver);
            }
        }
    }
    public void removeProductFromCart() throws IOException {
        DataHelperAndWait.clickOnElement(headerSection.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(headerSection.getViewCartLinkInCartPopUp(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getRemoveItem(),webDriver);
        productDetailsPage.displayTheProduct();
    }
    public void clickOnAllListItemsAppearingInTheRecommendedPopup(List<WebElement> webElement) throws IOException {
        for (int i = 0; i < webElement.size(); i++){
            DataHelperAndWait.clickOnElement(webElement.get(i),webDriver);
            this.displayTheRecommendedProductsPopUp();
        }
    }
    public  void clickOnListItemsAndAssertion(List<WebElement> webElement, WebDriver webDriver, WebElement webElementToBeAssert) throws IOException {
        for (int i = 0; i < webElement.size(); i++){
            DataHelperAndWait.hoverOnElement(webElement.get(i),webDriver);
            DataHelperAndWait.scrollToPositionZero(webDriver);
            DataHelperAndWait.clickOnElement(webElement.get(i),webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(webElementToBeAssert,webDriver);
            this.displayTheRecommendedProductsPopUp();
            DataHelperAndWait.scrollToPositionZero(webDriver);
        }
    }
    public void clickOnProductCard() throws IOException {
        for (int i = 0; i < productImages.size(); i++){
            DataHelperAndWait.clickOnElement(productImages.get(i),webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
            break;
        }
    }
}
