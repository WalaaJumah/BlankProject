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
import org.openqa.selenium.support.ui.Select;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.productPage.ProductDetailsPage;

import java.sql.SQLSyntaxErrorException;
import java.util.List;

@Getter
public class CartPage extends BasePage {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
    HomePage homePage = new HomePage(webDriver);
    HeaderSection headerSection = new HeaderSection(webDriver);
    DataHelperAndWait dataHelperAndWait;

    public CartPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    //declare all locators related to the Cart Page
    @FindBy(xpath = "//div[@id='cartItemsHeaderLabel']/span")
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
    @FindBy(id = "removeItemBtn")
    private WebElement removeItemBtn;
    @FindBy(id = "cartItemPrice")
    private List<WebElement> priceInCartPage;
    @FindBy(id = "cartItemPrice")
    private WebElement productPrice;
    //TODO: To replace it with ID after added it by Moamen
    @FindBy(xpath = "//div[@id='cartPageContainer']//h2[2]")
    private WebElement noItemInCartLabel;
    @FindBy(id = "CartIconContainerqty")
    private WebElement cartCounter;
    //TODO: To replace it with ID after added it by Moamen
    @FindBy(css = "#FaShoppingCart > path")
    private WebElement cartIcon;
    @FindBy(xpath="(//a[@id='cartPagelink'])[1]")
    private WebElement viewCartInCartPopup;
    @FindBy(id = "checkoutbtn")
    private WebElement proceedCheckoutBtnInCartPopup;
    //TODO: To replace it with ID after added it by Moamen
    @FindBy(xpath = "//div[@id='cartPageContainer']/h2[2]/a")
    private WebElement hereLink;
    @FindBy(id = "decreaseQtyBtn")
    private WebElement decreaseQtyBtn;
    @FindBy(id = "increaseQtyBtn")
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
    @FindBy(id = "cartItemQty")
    private WebElement qtyField;
    @FindBy(css = "#cartcloseIcon > path")
    private WebElement cartCloseIcon;
    @FindBy(id = "cartitemsCount")
    private WebElement itemCounterInCartPopUp;
    //TODO: To replace it with ID after added it by Moamen
    //TODO: There's a bug here due to the Msg is missing
    @FindBy(xpath = "//div[@id='coupon_code-error']")
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
    @FindBy(xpath = "//a[starts-with(@class,'cartItem_itemName')]")
    private WebElement productNameForOneProduct;
    @FindBy(xpath = "//div[starts-with(@id,'itemToWhishListBtn')]")
    private List<WebElement> moveToWishList;
    @FindBy(id = "cartTotal")
    private WebElement cartTotalSection;
    @FindBy(xpath = "//span[starts-with(@class,'cartInfo_EDDateLabel')]")
    private WebElement expectedDeliveryDateLabel;
    @FindBy(xpath = "//span[starts-with(@class,'cartInfo_EDDateAmount')]")
    private WebElement expectedDeliveryDateValue;
    @FindBy(xpath = "//span[starts-with(@class,'cartInfo_orderTotalAmount')]")
    private WebElement orderTotalValue;
    @FindBy(xpath = "//div[starts-with(@id,'cartItemInfo')]")
    private List<WebElement> productCardInCartPage;
    @FindBy(id = "paymentOptionsLabel")
    private WebElement weAcceptLabel;
    @FindBy(id = "radioButton_container__il26_ cartInfo_option__krxQO sporter_cashondelivery")
    private WebElement cODOption;
    @FindBy(id = "radioButton_container__il26_ cartInfo_option__krxQO checkoutcom_card_payment")
    private WebElement creditCardOption;
    @FindBy(id = "cartItemsHeaderLabel")
    private WebElement myShoppingCartMsg;
    @FindBy(id = "cartPageHead")
    private WebElement freeShippingLabel;
    @FindBy(id="removeItemBtn")
    private List<WebElement> removemoreThanProduct;
//TODO: Ask Moamen About Coupon code
@FindBy(xpath = "//button[@value='Cancel']")
private WebElement cancelCouponCodeBtn;
@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
private WebElement notExistCouponMsg;

//TODO: Needs To check After solving Bogo Bug
@FindBy(xpath = "//td[text()='FREE from SPORTER']")
private WebElement freeFromSporter;
@FindBy(xpath = "(//span[text()='Free'])[1]")
private WebElement freePrice;

   public void addToCartAndDisplayTheCart(){
       productDetailsPage.displayTheProduct();
       productDetailsPage.addToCart();
       productDetailsPage.viewCart();
   }
      public void addToCartAndViewCart(){
       productDetailsPage.addToCart();
       productDetailsPage.viewCart();
   }

      public void addBogoToCartAndDisplayTheCart(){
       productDetailsPage.navigateToBogoProduct();
       DataHelperAndWait.waitForTime(2000);
       productDetailsPage.addToCart();
       productDetailsPage.viewCart();

   }
   public void navigateToCartPage(){
       webDriver.navigate().to(BaseURL+cartURL);
       DataHelperAndWait.waitForUrlContains(cartURL,webDriver);
   }
    public void addBundleToCartAndDisplayTheCart(){
            productDetailsPage.displayBundle();
            productDetailsPage.addToCart();
            productDetailsPage.viewCart();
    }
    public void removeItem() {
        DataHelperAndWait.waitToBeClickable(this.removeItemBtn ,webDriver);
        this.removeItemBtn.click();
    }
    public void removeAllItems(int productNumber) {
for(int i=1;i<=productNumber;i++){
    DataHelperAndWait.clickOnElement(removeItemBtn,webDriver);
    DataHelperAndWait.waitForTime(1000);
}
   }
    public static  void addBundleOptionToCart(Select select, WebDriver webDriver) {
       ProductDetailsPage product= new ProductDetailsPage(webDriver);
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            try{
            select.selectByIndex(i);
            product.addToCart();
            break;
            }
            catch (Exception e){
                e.getMessage();
            }

        }
    }



}
