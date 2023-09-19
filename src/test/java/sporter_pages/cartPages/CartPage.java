/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription CartPage
 */

package sporter_pages.cartPages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

@Getter
public class CartPage extends BasePage {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
    DataHelperAndWait dataHelperAndWait;
    //declare all locators related to the Cart Page
    @FindBy(id = "CartIconContainerqty")
    private WebElement itemsCounter;
    @FindBy(id = "AddToCartErrContainer")
    private WebElement cartErrorPopUp;
    @FindBy(id = "AddToCartErrHeader")
    private WebElement cartErrorPopUpHeaderSection;
    @FindBy(id = "AddToCartErrMsg")
    private WebElement cartErrorMsg;
    @FindBy(id = "closeAddToCartErrBtn")
    private WebElement closeAddToCartErrorMsg;
    //TODO: Needs to revisit after fixing the Bogo issue
    @FindBy(id = "closeAddToCartErrBtn")
    private WebElement freeFromSporterSection;
    @FindBy(xpath = "(//div[@id='removeItemBtn'])[1]")
    private WebElement removeItemBtn;
    @FindBy(id = "cartItemPrice")
    private List<WebElement> priceInCartPage;
    @FindBy(id = "cartItemPrice")
    private WebElement productPrice;
    //TODO: To replace it with ID after added it by Moamen
    @FindBy(xpath = "//div[@id='cartPageContainer']/div[1]")
    private WebElement noItemInCartLabel;
    @FindBy(id = "CartIconContainerqty")
    private WebElement cartCounter;
    @FindBy(xpath = "//span[starts-with(@class,'spinner_loader')]")
    private WebElement cartSpinner;
    //TODO: To replace it with ID after added it by Moamen
//    @FindBy(css = "#FaShoppingCart > path")
//    private WebElement cartIcon;
//    @FindBy(id = "CartIconContainer")
    @FindBy(xpath = "//div[@id='CartIconInnerContainer']/span[@id='CartIconContainerqty']")
    private WebElement cartIcon;
    @FindBy(id = "cartPagelink")
    private WebElement viewCartInCartPopup;
    @FindBy(id = "checkoutbtn")
    private WebElement proceedCheckoutBtnInCartPopup;
    //TODO: To replace it with ID after added it by Moamen
//    @FindBy(xpath = "//a[starts-with(@class,'cartPage_link')]")
    @FindBy(id = "cart_empty_link")
    private WebElement hereLink;
    @FindBy(xpath = "(//div[starts-with(@id,'decreaseQtyBtn')])[1]")
    private WebElement decreaseQtyBtn;
    @FindBy(xpath = "(//div[starts-with(@id,'increaseQtyBtn')])[1]")
    private WebElement increaseQtyBtn;
    //TODO: To replace it with ID after added it by Moamen
//    @FindBy(xpath = "//div[@id='toCheckoutContainer']/a/button")
//    private WebElement proceedCheckoutBtn;
    @FindBy(id = "toCheckObtn")
    private WebElement proceedCheckoutBtn;
    //TODO: To replace it with ID after added it by Moamen
//    @FindBy(xpath = "//input[starts-with(@class,'cartInfo_input')]")
//    private WebElement couponCodeField;
    @FindBy(id = "couponField")
    private WebElement couponCodeField;
    //TODO: To replace it with ID after added it by Moamen
//    @FindBy(xpath = "//button[starts-with(@class,'cartInfo_btn')]")
//    private WebElement applyCouponCodeBtn;
    @FindBy(id = "applyCodeBtn")
    private WebElement applyCouponCodeBtn;
    //TODO: There's a bug here due to you cannot edit the QTY field
//    @FindBy(css = "#cartItemInfo24397958 > div.cartItem_Itemcontrollers__CJ4Xu > div:nth-child(2) > div > span")
//    private WebElement qtyField;
    @FindBy(id = "cartItemQty")
    private List<WebElement> qtyFieldList;
    @FindBy(xpath = "(//input[starts-with(@id,'cartItemQty')])[1]")
    private WebElement qtyField;
    @FindBy(xpath = "(//input[starts-with(@id,'cartItemQty')])[1]")
    private WebElement firstQtyField;
    @FindBy(css = "#cartcloseIcon > path")
    private WebElement cartCloseIcon;
    @FindBy(id = "FaShoppingCart")
    private WebElement itemCounterInCartPopUp;
    //TODO: To replace it with ID after added it by Moamen
    //TODO: There's a bug here due to the Msg is missing
    @FindBy(id = "couponecideErr")
    private WebElement requiredCouponMsg;
    @FindBy(xpath = "(//span[@id='taxValue'])[2]")
    private WebElement taxValue;
    @FindBy(xpath = "(//span[@id='subTotalValue'])[2]")
    private WebElement subTotalValue;
    @FindBy(id = "cartItemTotalPrice")
    private List<WebElement> valueInTotalColumn;
    @FindBy(id = "cartItemTotalPrice")
    private WebElement productPriceTotal;
    @FindBy(xpath = "//div[starts-with(@id,'cartItemImage')]")
    private List<WebElement> productImg;
    @FindBy(xpath = "//div[starts-with(@id,'cartItemImage')]")
    private WebElement productImgForOneProduct;
    @FindBy(xpath = "(//a[starts-with(@id,'cartItemImage')])[1]")
    private WebElement productNameForOneProduct;
    @FindBy(xpath = "//div[starts-with(@id,'itemToWhishListBtn')]")
    private List<WebElement> moveToWishList;
    @FindBy(id = "cartTotal")
    private WebElement cartTotalSection;
    @FindBy(xpath = "//span[starts-with(@class,'cartInfo_EDDateLabel')]")
    private WebElement expectedDeliveryDateLabel;
    @FindBy(xpath = "//span[starts-with(@class,'cartInfo_EDDateAmount')]")
    private WebElement expectedDeliveryDateValue;
    @FindBy(id = "orderTotalAmount")
    private WebElement orderTotalValue;
    @FindBy(xpath = "//div[starts-with(@id,'cartItemInfo')]")
    private List<WebElement> productCardInCartPage;
    @FindBy(id = "paymentOptionsLabel")
    private WebElement weAcceptLabel;
    @FindBy(xpath = "(//div[@id='paymentOptions']//span[@id='label'])[2]")
    private WebElement cODOption;
    @FindBy(xpath = "(//div[@id='paymentOptions']//span[@id='label'])[1]")
    private WebElement creditCardOption;
    @FindBy(id = "cartItemsHeaderLabel")
    private WebElement myShoppingCartMsg;
    @FindBy(id = "cartPageHead")
    private WebElement freeShippingLabel;
    @FindBy(id = "removeItemBtn")
    private List<WebElement> removemoreThanProduct;
    //TODO: Ask Moamen About Coupon code
    @FindBy(id = "removeCodeBtn")
    private WebElement cancelCouponCodeBtn;
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    private WebElement notExistCouponMsg;
    //TODO: Needs To check After solving Bogo Bug
    @FindBy(xpath = "//td[text()='FREE from SPORTER']")
    private WebElement freeFromSporter;
    @FindBy(xpath = "(//div[starts-with(@class,'cartItem_freeGift')])[1]")
    private WebElement freePrice;
    @FindBy(xpath = "div.popUp_thumbsHead__Fbo8M")
    private WebElement couponSuccessfulMsg;
    @FindBy(xpath = "//button[contains(@class,'popUp_btn_')]")
    private WebElement closeCouponSuccessfulMsg;
    @FindBy(xpath = "(//div[starts-with(@class,'cartItem_freeGift')])[1]")
    private WebElement freeFromSporterLabelInProductCard;
    public CartPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public static void addBundleOptionToCart(Select select, WebDriver webDriver) {
        ProductDetailsPage product = new ProductDetailsPage(webDriver);
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            try {
                select.selectByIndex(i);
                product.addToCart();
                break;
            } catch (Exception e) {
                e.getMessage();
            }

        }
    }
    public  void waitTillCartSpinnerDisappear(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(this.cartLoaderXpath)));

    }
    public void addToCartAndDisplayTheCart() throws IOException {
        if(IsEmptyCart()) {
            productDetailsPage.displayTheProduct();
            productDetailsPage.addToCart();
            productDetailsPage.viewCart();
        }
    }
      public void addToCartAndDisplayTheCartWithoutCartEmptyValidation() throws IOException {
            productDetailsPage.displayTheProduct();
            productDetailsPage.addToCart();
            productDetailsPage.viewCart();
    }

    public void navigateToCartOrAddProductToItInCaseTheCartIsEmpty() throws IOException {
        if(IsEmptyCart())
            addToCartAndDisplayTheCart();
    }
    public void addToCartAndDisplayTheCartForOos() throws IOException {
        productDetailsPage.displayTheProductHaveLessQty();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
    }

    public void addToCartAndViewCart() throws IOException {
        try {
            productDetailsPage.addToCart();
            productDetailsPage.viewCart();
        } catch (Exception e) {
            navigateToCartPage();
        }
    }

    public void addBogoToCartAndDisplayTheCart() throws IOException {
        try {

            productDetailsPage.navigateToBogoProduct();
//       DataHelperAndWait.waitForTime(2000);
            productDetailsPage.addToCart();
            productDetailsPage.viewCart();
        } catch (Exception e) {
            this.navigateToCartPage();
        }

    }

    public void navigateToCartPage() throws IOException {
        try {

            webDriver.navigate().to(BaseURL + cartURL);
            verifyTheDisplayedPageDoesNotHaveErrors();
            DataHelperAndWait.waitForUrlContains(cartURL, webDriver);
            this.waitTillCartSpinnerDisappear(webDriver);
        }
        catch (Exception e){
            this.addToCartAndDisplayTheCart();
            webDriver.navigate().to(BaseURL + cartURL);
            verifyTheDisplayedPageDoesNotHaveErrors();
            DataHelperAndWait.waitForUrlContains(cartURL, webDriver);
        }

    }

    public boolean IsEmptyCart() throws IOException {
        navigateToCartPage();
        try {
            if(hereLink == null)
                return false;


            return hereLink.isDisplayed() ;

        }catch (Exception e)
        {
            return false;
        }
    }

    public void addBundleToCartAndDisplayTheCart() throws IOException {
        productDetailsPage.displayBundle();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
    }

    public void removeItem() {
//        this.waitTillCartSpinnerDisappear(webDriver);
        DataHelperAndWait.waitToBeClickable(removeItemBtn, webDriver);
        DataHelperAndWait.JsExecutorToClickOnElement(removeItemBtn,webDriver);
//        DataHelperAndWait.waitToBeClickable(this.removeItemBtn, webDriver);
//        this.removeItemBtn.click();
        this.waitTillCartSpinnerDisappear(webDriver);
    }

    public void clearCart() throws IOException {
        if(IsEmptyCart())
            this.removeItem();
    }

    public void removeAllItems(int productNumber) {
        for (int i = 1; i <= productNumber; i++) {
            DataHelperAndWait.clickOnElement(removeItemBtn, webDriver);
//    DataHelperAndWait.waitForTime(1000);
        }
    }

    public void clickOnHereLink() {
        try {
            DataHelperAndWait.waitToBeVisible(hereLink, webDriver);
            hereLink.click();
        } catch (Exception e) {
            DataHelperAndWait.hoverOnElementAndClick(hereLink, webDriver);
            hereLink.click();
        }
    }

    public void getFreeGiftByCoupon() {
        DataHelperAndWait.typeTextInElement(couponCodeField, webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(applyCouponCodeBtn, webDriver);
    }

    public void clickOnCartIcon() {
//       DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.waitToBeClickable(cartIcon, webDriver);
        DataHelperAndWait.JsExecutorToClickOnElement(cartIcon, webDriver);
    }

    public void waitTillQtyValueChanges(String expectedText) {
        WebDriverWait wait;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("cartItemQty"), expectedText));
    }

    public void proceedToCheckout() throws IOException {
//        navigateToHomePage();
//        DataHelperAndWait.clickOnElement(getCartIcon(), webDriver);
//        DataHelperAndWait.clickOnElement(getProceedCheckoutBtnInCartPopup(), webDriver);
        //TODO: Need to recheck after solving it by Moamen
//      this.waitTillCartSpinnerDisappear(webDriver);
        DataHelperAndWait.waitForTime(500);
        DataHelperAndWait.waitToBeClickable(this.getProceedCheckoutBtn(),webDriver);


        DataHelperAndWait.JsExecutorToClickOnElement(this.getProceedCheckoutBtn(),webDriver);
//        this.getProceedCheckoutBtn().click();
//        this.waitTillCartSpinnerDisappear(webDriver);
//        if(IsEmptyCart())
//            throw new AssertionError("Clicking on the Proceed to checkout display an Empty Page Cart");


//            DataHelperAndWait.clickOnElement(this.getProceedCheckoutBtn(),webDriver);
//            DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getContinueShippingInfoBtn(),webDriver);
//
//        }
//        catch (Exception e){
//           webDriver.navigate().refresh();
//            DataHelperAndWait.waitToBeVisible(this.getProceedCheckoutBtn(),webDriver);
//            DataHelperAndWait.clickOnElement(this.getProceedCheckoutBtn(),webDriver);
//        }
    }
    public void increaseQty() {
//        DataHelperAndWait.clickOnElement(getIncreaseQtyBtn(), webDriver);
//        waitTillCartSpinnerDisappear(webDriver);
        DataHelperAndWait.waitToBeClickable(getIncreaseQtyBtn(),webDriver);


        DataHelperAndWait.JsExecutorToClickOnElement(this.getIncreaseQtyBtn(),webDriver);
        waitTillCartSpinnerDisappear(webDriver);

    }
    public void decreaseQty(){
        DataHelperAndWait.clickOnElement(getDecreaseQtyBtn(), webDriver);
        waitTillCartSpinnerDisappear(webDriver);
    }
}
