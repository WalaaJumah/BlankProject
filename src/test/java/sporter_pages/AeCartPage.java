package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AeCartPage extends BasePage {
    public AeCartPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //declare all locators related to the Cart Page
    @FindBy(xpath = "//span/i")
    private WebElement itemsCounter;
    @FindBy(xpath = "//div[@class='inconvenience-left']/p")
    private WebElement requestedQtyUnAvailableMsg;
    @FindBy(xpath = "//button[text()='CONTINUE SHOPPING']")
    private WebElement continueShoppingBtn;
    @FindBy(xpath = "//a[@title='Remove item']")
    private WebElement removeItem;
    @FindBy(xpath = "//p[text()='You have no items in your shopping cart.']")
    private WebElement noItemInCartLabel;
    @FindBy(xpath = "//a[text()='here']")
    private WebElement hereLink;
    @FindBy(xpath = "(//a[@class='decreaseQty btn-qty-control btn-qty-control--minus'])[1]")
    private WebElement decreaseQtyBtn;
    @FindBy(xpath = "(//a[@class='increaseQty btn-qty-control btn-qty-control--plus'])[1]")
    private WebElement increaseQtyBtn;
    @FindBy(xpath = "(//input[@title='Qty'])[1]")
    private WebElement qtyField;
    @FindBy(xpath = "(//div[text()='The requested qty is not available'])[1]")
    private WebElement qtyUnavailableMsgInCartPage;
    @FindBy(xpath = "(//tr[@class='item-info']//a)[1]")
    private WebElement productCartInCartPage;
    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody[1]/tr/td[4]/span/span/span")
    private WebElement priceInCartPage;
    @FindBy(xpath = "//td[text()='FREE from SPORTER']")
    private WebElement freeFromSporter;
    @FindBy(xpath = "(//span[text()='Free'])[1]")
    private WebElement freePrice;
    @FindBy(xpath = "//td[text()='We accept']")
    private WebElement weAcceptLabel;
    @FindBy(xpath = "//label[@for='phoenix_cashondelivery']")
    private WebElement codOption;
    @FindBy(xpath = "//img[@alt='Credit/Debit Card']")
    private WebElement creditCardOption;
    @FindBy(xpath = "//div[@class='free-shipping-container']")
    private WebElement freeShippingLabel;
    @FindBy(xpath = "//td[@class='expect-date']")
    private WebElement expectedDeliveryDateLabel;
    @FindBy(xpath = "//td[@class='date-info']")
    private WebElement expectedDeliveryDateValue;
    @FindBy(xpath = "//span[text()='Proceed to Checkout']")
    private WebElement proceedCheckoutBtn;
    @FindBy(xpath = "//span[@data-th='Subtotal']")
    private WebElement subTotalValue;
    @FindBy(css = "tr[class='totals-tax']:nth-child(n) td span")
    private WebElement taxValue;
    @FindBy(css = "td[class='grand-price']:nth-child(n) span")
    private WebElement orderTotalValue;
    @FindBy(xpath = "//a[@class='action showcart']")
    private WebElement cartIcon;
    @FindBy(xpath = "//a[@class='action viewcart']/span")
    private WebElement viewCartInCartPopup;
    @FindBy(xpath = "//span[@class='counter-number']")
    private WebElement cartCounter;
    @FindBy(xpath = "//span[@class='item-count']")
    private WebElement itemCounterInCartPopUp;
    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    private WebElement proceedCheckoutBtnInCartPopup;
    @FindBy(xpath = "//a[@id='btn-minicart-close']")
    private WebElement cartCloseIcon;
    @FindBy(xpath = "//input[@id='coupon_code']")
    private WebElement couponCodeField;
    @FindBy(xpath = "//button[@value='Apply']")
    private WebElement applyCouponCodeBtn;
    @FindBy(xpath = "//div[text()='You used free gift code \"spo15\".']")
    private WebElement usedFreeCouponMsg;
    @FindBy(xpath = "//button[@value='Cancel']")
    private WebElement cancelCouponCodeBtn;
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    private WebElement notExistCouponMsg;
    @FindBy(xpath = "//div[@id='coupon_code-error']")
    private WebElement requiredCouponMsg;
    @FindBy(xpath = "//span[@class='nobr']")
    private WebElement myShoppingCartMsg;

    //Getter Methods
    public WebElement getItemsCounterInCartPage() {
        DataHelperAndWait.waitToBeVisible(itemsCounter,7,webDriver);
        return itemsCounter;
    }

    public WebElement getRequestedQtyUnAvailableMsg() {
        return requestedQtyUnAvailableMsg;
    }

    public WebElement getContinueShoppingBtn() {
        DataHelperAndWait.waitToBeVisible(continueShoppingBtn,5,webDriver);
        return continueShoppingBtn;
    }

    public WebElement getNoItemInCartLabel() {
        DataHelperAndWait.waitToBeVisible(noItemInCartLabel,5,webDriver);
        return noItemInCartLabel;
    }

    public WebElement getHereLink() {
        DataHelperAndWait.waitToBeVisible(hereLink,5,webDriver);
        return hereLink;
    }

    public WebElement getDecreaseQtyBtn() {
        DataHelperAndWait.waitToBeVisible(decreaseQtyBtn,5,webDriver);
        return decreaseQtyBtn;
    }

    public WebElement getIncreaseQtyBtn() {
        DataHelperAndWait.waitToBeVisible(increaseQtyBtn,5,webDriver);
        return increaseQtyBtn;
    }

    public WebElement getQtyField() {
        DataHelperAndWait.waitToBeVisible(qtyField,5,webDriver);
        return qtyField;
    }

    public WebElement getQtyUnavailableMsgInCartPage() {
        DataHelperAndWait.waitToBeVisible(qtyUnavailableMsgInCartPage,5,webDriver);
        return qtyUnavailableMsgInCartPage;
    }

    public WebElement getPriceInCartPage() {
        DataHelperAndWait.waitToBeVisible(priceInCartPage,5,webDriver);
        return priceInCartPage;
    }

    public WebElement getFreeFromSporterSection() {
        DataHelperAndWait.waitToBeVisible(freeFromSporter,5,webDriver);
        return freeFromSporter;
    }

    public WebElement getFreePrice() {
        DataHelperAndWait.waitToBeVisible(freePrice,5,webDriver);
        return freePrice;
    }

    public WebElement getCodOption() {
        DataHelperAndWait.waitToBeVisible(codOption,5,webDriver);
        return codOption;
    }

    public WebElement getWeAcceptLabel() {
        DataHelperAndWait.waitToBeVisible(weAcceptLabel,5,webDriver);
        return weAcceptLabel;
    }

    public WebElement getCreditCardOption() {
        DataHelperAndWait.waitToBeVisible(creditCardOption,5,webDriver);
        return creditCardOption;
    }

    public WebElement getFreeShippingLabel() {
        DataHelperAndWait.waitToBeVisible(freeShippingLabel,5,webDriver);
        return freeShippingLabel;
    }

    public WebElement getExpectedDeliveryDateLabel() {
        DataHelperAndWait.waitToBeVisible(expectedDeliveryDateLabel,5,webDriver);
        return expectedDeliveryDateLabel;
    }

    public WebElement getExpectedDeliveryDateValue() {
        DataHelperAndWait.waitToBeVisible(expectedDeliveryDateValue,5,webDriver);
        return expectedDeliveryDateValue;
    }

    public WebElement getProceedCheckoutBtn() {
        DataHelperAndWait.waitToBeVisible(proceedCheckoutBtn,5,webDriver);
        return proceedCheckoutBtn;
    }

    public WebElement getSubTotalValue() {
        DataHelperAndWait.waitToBeVisible(subTotalValue,5,webDriver);
        return subTotalValue;
    }

    public WebElement getTaxValue() {
        DataHelperAndWait.waitToBeVisible(taxValue,5,webDriver);
        return taxValue;
    }

    public WebElement getOrderTotalValue() {
        DataHelperAndWait.waitToBeVisible(orderTotalValue,5,webDriver);
        return orderTotalValue;
    }

    public WebElement getCartCounter() {
        DataHelperAndWait.waitToBeVisible(cartCounter,5,webDriver);
        return cartCounter;
    }

    public WebElement getItemCounterInCartPopUp() {
        DataHelperAndWait.waitToBeVisible(itemCounterInCartPopUp,5,webDriver);
        return itemCounterInCartPopUp;
    }

    public WebElement getCloseIconInCartPopup() {
        DataHelperAndWait.waitToBeVisible(cartCloseIcon,5,webDriver);
        return cartCloseIcon;
    }

    public WebElement getUsedFreeCouponMsg() {
        DataHelperAndWait.waitToBeVisible(usedFreeCouponMsg,5,webDriver);
        return usedFreeCouponMsg;
    }

    public WebElement getApplyCouponCode() {
        DataHelperAndWait.waitToBeVisible(applyCouponCodeBtn,5,webDriver);
        return applyCouponCodeBtn;
    }

    public WebElement getNotExistCouponMsg() {
        DataHelperAndWait.waitToBeVisible(notExistCouponMsg,5,webDriver);
        return notExistCouponMsg;
    }

    public WebElement getRequiredCouponMsg() {
        DataHelperAndWait.waitToBeVisible(requiredCouponMsg,5,webDriver);
        return requiredCouponMsg;
    }

    public WebElement getMyShoppingCartMsg() {
        DataHelperAndWait.waitToBeVisible(myShoppingCartMsg,5,webDriver);
        return myShoppingCartMsg;
    }

    //Define the main actions we need to execute our TCs
    public void clickOnTheContinueShoppingBtn() {
        DataHelperAndWait.isDisplayed(continueShoppingBtn, 3,webDriver);
        this.continueShoppingBtn.click();
    }

    public void clickOnRemoveItem() {
        DataHelperAndWait.isDisplayed(removeItem, 5,webDriver);
        this.removeItem.click();
    }

    public void clickOnHereLink() {
        DataHelperAndWait.isDisplayed(hereLink, 6,webDriver);
        this.hereLink.click();
    }

    public void clickOnDecreaseQtyBtn() {
        DataHelperAndWait.JsExecutorToClickOnElement(this.decreaseQtyBtn,webDriver);
    }

    public void clickOnIncreaseQtyBtn() {
        DataHelperAndWait.waitToBeClickable(increaseQtyBtn, 3,webDriver);
        this.increaseQtyBtn.click();
    }

    public void FillInQtyField(String qty) {
        DataHelperAndWait.waitToBeVisible(qtyField, 3,webDriver);
        this.qtyField.sendKeys(qty);
    }

    public void clickOnProductCartInCartPage() {
        DataHelperAndWait.waitToBeVisible(productCartInCartPage, 3,webDriver);
        this.productCartInCartPage.click();
    }

    public void clickOnCartIcon() {
        DataHelperAndWait.waitToBeVisible(cartIcon, 3,webDriver);
        this.cartIcon.click();
    }

    public void clickOnViewCartInCartPopUp() {
        DataHelperAndWait.waitToBeVisible(viewCartInCartPopup, 3,webDriver);
        this.viewCartInCartPopup.click();
    }

    public void clickOnProceedCheckoutBtnInCartPopup() {
        DataHelperAndWait.waitToBeClickable(proceedCheckoutBtnInCartPopup, 3,webDriver);
        this.proceedCheckoutBtnInCartPopup.click();
    }

    public void clickOnCartCloseIcon() {
        DataHelperAndWait.waitToBeVisible(cartCloseIcon, 3,webDriver);
        this.cartCloseIcon.click();
    }

    public void FillInCouponCode(String couponCode) {
        DataHelperAndWait.waitToBeVisible(couponCodeField, 3,webDriver);
        this.couponCodeField.sendKeys(couponCode);
        DataHelperAndWait.waitToBeClickable(applyCouponCodeBtn, 3,webDriver);
        this.applyCouponCodeBtn.click();
    }

    public void clickOnCancelCouponCodeBtn() {
        DataHelperAndWait.waitToBeClickable(cancelCouponCodeBtn, 3,webDriver);
        this.cancelCouponCodeBtn.click();
    }
    public void removeProductFromCart(){
        webDriver.navigate().to(BasePage.BaseURL +aeDomain+cartURL);
        this.clickOnRemoveItem();
    }



}