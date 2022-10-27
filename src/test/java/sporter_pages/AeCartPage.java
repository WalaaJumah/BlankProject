package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AeCartPage {
    public AeCartPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    //declare all locators related to the Cart Page
    @FindBy(xpath = "//span/i")
    private WebElement itemsCounter;
    @FindBy(xpath = "//div[@class='inconvenience-left']/p")
    private WebElement requestedQtyUnAvailableMsg;
    @FindBy(xpath = "//button[text()='CONTINUE SHOPPING']")
    private WebElement continueShoppingBtn;
    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody[1]/tr/td[1]/div/a/span[2]")
    private WebElement removeItem;
    @FindBy(xpath = "//p[text()='You have no items in your shopping cart.']")
    private WebElement noItemInCartLabel;
    @FindBy(xpath = "//a[text()='here']")
    private WebElement hereLink;
    @FindBy(xpath = "//a[@class='decreaseQty btn-qty-control btn-qty-control--minus']")
    private WebElement decreaseQtyBtn;
    @FindBy(xpath = "//a[@class='increaseQty btn-qty-control btn-qty-control--plus']")
    private WebElement increaseQtyBtn;
    @FindBy(css = "div[class='input-box input-with-value input-active']:nth-child(n) input")
    private WebElement qtyField;
    @FindBy(xpath = "//div[text()='The requested qty is not available']")
    private WebElement qtyUnavailableMsgInCartPage;
    @FindBy(css = "tr[class='item-info']:nth-child(1) td[data-th='Item']")
    private WebElement productCartInCartPage;
    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody[1]/tr/td[4]/span/span/span")
    private WebElement priceInCartPage;
    @FindBy(xpath = "//td[text()='FREE from SPORTER']")
    private WebElement freeFromSporter;
    @FindBy(xpath = "//span[text()='Free']")
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
        return itemsCounter;
    }

    public WebElement getRequestedQtyUnAvailableMsg() {
        return requestedQtyUnAvailableMsg;
    }

    public WebElement getContinueShoppingBtn() {
        return continueShoppingBtn;
    }

    public WebElement getNoItemInCartLabel() {
        return noItemInCartLabel;
    }

    public WebElement getHereLink() {
        return hereLink;
    }

    public WebElement getDecreaseQtyBtn() {
        return decreaseQtyBtn;
    }

    public WebElement getIncreaseQtyBtn() {
        return increaseQtyBtn;
    }

    public WebElement getQtyField() {
        return qtyField;
    }

    public WebElement getQtyUnavailableMsgInCartPage() {
        return qtyUnavailableMsgInCartPage;
    }

    public WebElement getPriceInCartPage() {
        return priceInCartPage;
    }

    public WebElement getFreeFromSporterSection() {
        return freeFromSporter;
    }

    public WebElement getFreePrice() {
        return freePrice;
    }

    public WebElement getCodOption() {
        return codOption;
    }

    public WebElement getWeAcceptLabel() {
        return weAcceptLabel;
    }

    public WebElement getCreditCardOption() {
        return creditCardOption;
    }

    public WebElement getFreeShippingLabel() {
        return freeShippingLabel;
    }

    public WebElement getExpectedDeliveryDateLabel() {
        return expectedDeliveryDateLabel;
    }

    public WebElement getExpectedDeliveryDateValue() {
        return expectedDeliveryDateValue;
    }

    public WebElement getProceedCheckoutBtn() {
        return proceedCheckoutBtn;
    }

    public WebElement getSubTotalValue() {
        return subTotalValue;
    }

    public WebElement getTaxValue() {
        return taxValue;
    }

    public WebElement getOrderTotalValue() {
        return orderTotalValue;
    }

    public WebElement getCartCounter() {
        return cartCounter;
    }

    public WebElement getItemCounterInCartPopUp() {
        return itemCounterInCartPopUp;
    }

    public WebElement getCloseIconInCartPopup() {
        return cartCloseIcon;
    }

    public WebElement getUsedFreeCouponMsg() {
        return usedFreeCouponMsg;
    }

    public WebElement getApplyCouponCode() {
        return applyCouponCodeBtn;
    }

    public WebElement getNotExistCouponMsg() {
        return notExistCouponMsg;
    }

    public WebElement getRequiredCouponMsg() {
        return requiredCouponMsg;
    }

    public WebElement getMyShoppingCartMsg() {
        return myShoppingCartMsg;
    }

    //Define the main actions we need to execute our TCs
    public void clickOnTheContinueShoppingBtn() {
        DataHelperAndWait.isDisplayed(continueShoppingBtn, 10);
        this.continueShoppingBtn.click();
    }

    public void clickOnRemoveItem() {
        DataHelperAndWait.isDisplayed(removeItem, 10);
        this.removeItem.click();
    }

    public void clickOnHereLink() {
        DataHelperAndWait.isDisplayed(hereLink, 10);
        this.hereLink.click();
    }

    public void clickOnDecreaseQtyBtn() {
        DataHelperAndWait.JsExecutorToClickOnElement(this.decreaseQtyBtn);
    }

    public void clickOnIncreaseQtyBtn() {
        DataHelperAndWait.waitToBeClickable(increaseQtyBtn, 10);
        this.increaseQtyBtn.click();
    }

    public void FillInQtyField(String qty) {
        DataHelperAndWait.waitToBeVisible(qtyField, 10);
        this.qtyField.sendKeys(qty);
    }

    public void clickOnProductCartInCartPage() {
        DataHelperAndWait.waitToBeVisible(productCartInCartPage, 15);
        this.productCartInCartPage.click();
    }

    public void clickOnCartIcon() {
        DataHelperAndWait.waitToBeVisible(cartIcon, 10);
        this.cartIcon.click();
    }

    public void clickOnViewCartInCartPopUp() {
        DataHelperAndWait.waitToBeVisible(viewCartInCartPopup, 10);
        this.viewCartInCartPopup.click();
    }

    public void clickOnProceedCheckoutBtnInCartPopup() {
        DataHelperAndWait.waitToBeClickable(proceedCheckoutBtnInCartPopup, 10);
        this.proceedCheckoutBtnInCartPopup.click();
    }

    public void clickOnCartCloseIcon() {
        DataHelperAndWait.waitToBeVisible(cartCloseIcon, 10);
        this.cartCloseIcon.click();
    }

    public void FillInCouponCode(String couponCode) {
        DataHelperAndWait.waitToBeVisible(couponCodeField, 10);
        this.couponCodeField.sendKeys(couponCode);
        DataHelperAndWait.waitToBeClickable(applyCouponCodeBtn, 10);
        this.applyCouponCodeBtn.click();
    }

    public void clickOnCancelCouponCodeBtn() {
        DataHelperAndWait.waitToBeClickable(cancelCouponCodeBtn, 10);
        this.cancelCouponCodeBtn.click();
    }


}