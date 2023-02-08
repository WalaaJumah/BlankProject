//package sporter_pages;
//
//import core.BasePage;
//import core.DataHelperAndWait;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//
//public class AeCartPage extends BasePage {
//    public AeCartPage(WebDriver webDriver) {
//        super(webDriver);
//        PageFactory.initElements(webDriver, this);
//    }
//
//    //declare all locators related to the Cart Page
//    @FindBy(xpath = "//span/i")
//    private WebElement itemsCounter;
//    @FindBy(xpath = "//div[@class='inconvenience-left']/p")
//    private WebElement requestedQtyUnAvailableMsg;
//    @FindBy(xpath = "//button[text()='CONTINUE SHOPPING']")
//    private WebElement continueShoppingBtn;
//    @FindBy(xpath = "(//a[@title='Remove item'])[1]")
//    private WebElement removeItem;
//    @FindBy(xpath = "//p[text()='You have no items in your shopping cart.']")
//    private WebElement noItemInCartLabel;
//    @FindBy(xpath = "//a[text()='here']")
//    private WebElement hereLink;
//    @FindBy(xpath = "(//a[@class='decreaseQty btn-qty-control btn-qty-control--minus'])[1]")
//    private WebElement decreaseQtyBtn;
//    @FindBy(xpath = "(//a[@class='increaseQty btn-qty-control btn-qty-control--plus'])[1]")
//    private WebElement increaseQtyBtn;
//    @FindBy(xpath = "(//input[@title='Qty'])[1]")
//    private WebElement qtyField;
//    @FindBy(xpath = "(//div[text()='The requested qty is not available'])[1]")
//    private WebElement qtyUnavailableMsgInCartPage;
//    @FindBy(xpath = "(//tr[@class='item-info']//a)[1]")
//    private WebElement productCartInCartPage;
//    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody[1]/tr/td[4]/span/span/span")
//    private WebElement priceInCartPage;
//    @FindBy(xpath = "//td[text()='FREE from SPORTER']")
//    private WebElement freeFromSporter;
//    @FindBy(xpath = "(//span[text()='Free'])[1]")
//    private WebElement freePrice;
//    @FindBy(xpath = "//td[text()='We accept']")
//    private WebElement weAcceptLabel;
//    @FindBy(xpath = "//label[@for='phoenix_cashondelivery']")
//    private WebElement codOption;
//    @FindBy(xpath = "//img[@alt='Credit/Debit Card']")
//    private WebElement creditCardOption;
//    @FindBy(xpath = "//div[@class='free-shipping-container']")
//    private WebElement freeShippingLabel;
//    @FindBy(xpath = "//td[@class='expect-date']")
//    private WebElement expectedDeliveryDateLabel;
//    @FindBy(xpath = "//td[@class='date-info']")
//    private WebElement expectedDeliveryDateValue;
//    @FindBy(xpath = "//span[text()='Proceed to Checkout']")
//    private WebElement proceedCheckoutBtn;
//    @FindBy(xpath = "//span[@data-th='Subtotal']")
//    private WebElement subTotalValue;
//    @FindBy(css = "tr[class='totals-tax']:nth-child(n) td span")
//    private WebElement taxValue;
//    @FindBy(css = "td[class='grand-price']:nth-child(n) span")
//    private WebElement orderTotalValue;
//    @FindBy(xpath = "//a[@class='action showcart']")
//    private WebElement cartIcon;
//    @FindBy(xpath = "//a[@class='action viewcart']/span")
//    private WebElement viewCartInCartPopup;
//    @FindBy(xpath = "//span[@class='counter-number']")
//    private WebElement cartCounter;
//    @FindBy(xpath = "//span[@class='item-count']")
//    private WebElement itemCounterInCartPopUp;
//    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
//    private WebElement proceedCheckoutBtnInCartPopup;
//    @FindBy(xpath = "//a[@id='btn-minicart-close']")
//    private WebElement cartCloseIcon;
//    @FindBy(xpath = "//input[@id='coupon_code']")
//    private WebElement couponCodeField;
//    @FindBy(xpath = "//button[@value='Apply']")
//    private WebElement applyCouponCodeBtn;
//    @FindBy(xpath = "//div[text()='You used free gift code \"spo15\".']")
//    private WebElement usedFreeCouponMsg;
//    @FindBy(xpath = "//button[@value='Cancel']")
//    private WebElement cancelCouponCodeBtn;
//    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
//    private WebElement notExistCouponMsg;
//    @FindBy(xpath = "//div[@id='coupon_code-error']")
//    private WebElement requiredCouponMsg;
//    @FindBy(xpath = "//span[@class='nobr']")
//    private WebElement myShoppingCartMsg;
//
//    //Getter Methods
//    public WebElement getItemsCounterInCartPage() {
//        DataHelperAndWait.waitToBeVisible(itemsCounter ,webDriver);
//        return itemsCounter;
//    }
//
//    public WebElement getRequestedQtyUnAvailableMsg() {
//        return requestedQtyUnAvailableMsg;
//    }
//
//    public WebElement getContinueShoppingBtn() {
//        DataHelperAndWait.waitToBeVisible(continueShoppingBtn ,webDriver);
//        return continueShoppingBtn;
//    }
//
//    public WebElement getNoItemInCartLabel() {
//        DataHelperAndWait.waitToBeVisible(noItemInCartLabel ,webDriver);
//        return noItemInCartLabel;
//    }
//
//    public WebElement getHereLink() {
//        DataHelperAndWait.waitToBeVisible(hereLink ,webDriver);
//        return hereLink;
//    }
//
//    public WebElement getDecreaseQtyBtn() {
//        DataHelperAndWait.waitToBeVisible(decreaseQtyBtn ,webDriver);
//        return decreaseQtyBtn;
//    }
//
//    public WebElement getIncreaseQtyBtn() {
//        DataHelperAndWait.waitToBeVisible(increaseQtyBtn ,webDriver);
//        return increaseQtyBtn;
//    }
//
//    public WebElement getQtyField() {
//        DataHelperAndWait.waitToBeVisible(qtyField ,webDriver);
//        return qtyField;
//    }
//
//    public WebElement getQtyUnavailableMsgInCartPage() {
//        DataHelperAndWait.waitToBeVisible(qtyUnavailableMsgInCartPage ,webDriver);
//        return qtyUnavailableMsgInCartPage;
//    }
//
//    public WebElement getPriceInCartPage() {
//        DataHelperAndWait.waitToBeVisible(priceInCartPage ,webDriver);
//        return priceInCartPage;
//    }
//
//    public WebElement getFreeFromSporterSection() {
//        DataHelperAndWait.waitToBeVisible(freeFromSporter ,webDriver);
//        return freeFromSporter;
//    }
//
//    public WebElement getFreePrice() {
//        DataHelperAndWait.waitToBeVisible(freePrice ,webDriver);
//        return freePrice;
//    }
//
//    public WebElement getCodOption() {
//        DataHelperAndWait.waitToBeVisible(codOption ,webDriver);
//        return codOption;
//    }
//
//    public WebElement getWeAcceptLabel() {
//        DataHelperAndWait.waitToBeVisible(weAcceptLabel ,webDriver);
//        return weAcceptLabel;
//    }
//
//    public WebElement getCreditCardOption() {
//        DataHelperAndWait.waitToBeVisible(creditCardOption ,webDriver);
//        return creditCardOption;
//    }
//
//    public WebElement getFreeShippingLabel() {
//        DataHelperAndWait.waitToBeVisible(freeShippingLabel ,webDriver);
//        return freeShippingLabel;
//    }
//
//    public WebElement getExpectedDeliveryDateLabel() {
//        DataHelperAndWait.waitToBeVisible(expectedDeliveryDateLabel ,webDriver);
//        return expectedDeliveryDateLabel;
//    }
//
//    public WebElement getExpectedDeliveryDateValue() {
//        DataHelperAndWait.waitToBeVisible(expectedDeliveryDateValue ,webDriver);
//        return expectedDeliveryDateValue;
//    }
//
//    public WebElement getProceedCheckoutBtn() {
//        DataHelperAndWait.waitToBeVisible(proceedCheckoutBtn ,webDriver);
//        return proceedCheckoutBtn;
//    }
//
//    public WebElement getSubTotalValue() {
//        DataHelperAndWait.waitToBeVisible(subTotalValue ,webDriver);
//        return subTotalValue;
//    }
//
//    public WebElement getTaxValue() {
//        DataHelperAndWait.waitToBeVisible(taxValue ,webDriver);
//        return taxValue;
//    }
//
//    public WebElement getOrderTotalValue() {
//        DataHelperAndWait.waitToBeVisible(orderTotalValue ,webDriver);
//        return orderTotalValue;
//    }
//
//    public WebElement getCartCounter() {
//        DataHelperAndWait.waitToBeVisible(cartCounter ,webDriver);
//        return cartCounter;
//    }
//
//    public WebElement getItemCounterInCartPopUp() {
//        DataHelperAndWait.waitToBeVisible(itemCounterInCartPopUp ,webDriver);
//        return itemCounterInCartPopUp;
//    }
//
//    public WebElement getCloseIconInCartPopup() {
//        DataHelperAndWait.waitToBeVisible(cartCloseIcon ,webDriver);
//        return cartCloseIcon;
//    }
//
//    public WebElement getUsedFreeCouponMsg() {
//        DataHelperAndWait.waitToBeVisible(usedFreeCouponMsg ,webDriver);
//        return usedFreeCouponMsg;
//    }
//
//    public WebElement getApplyCouponCode() {
//        DataHelperAndWait.waitToBeVisible(applyCouponCodeBtn ,webDriver);
//        return applyCouponCodeBtn;
//    }
//
//    public WebElement getNotExistCouponMsg() {
//        DataHelperAndWait.waitToBeVisible(notExistCouponMsg ,webDriver);
//        return notExistCouponMsg;
//    }
//
//    public WebElement getRequiredCouponMsg() {
//        DataHelperAndWait.waitToBeVisible(requiredCouponMsg ,webDriver);
//        return requiredCouponMsg;
//    }
//
//    public WebElement getMyShoppingCartMsg() {
//        DataHelperAndWait.waitToBeVisible(myShoppingCartMsg ,webDriver);
//        return myShoppingCartMsg;
//    }
//
//    //Define the main actions we need to execute our TCs
//    public void clickOnTheContinueShoppingBtn() {
//        DataHelperAndWait.isDisplayed(continueShoppingBtn ,webDriver);
//        this.continueShoppingBtn.click();
//    }
//
//    public void clickOnRemoveItem() {
//        DataHelperAndWait.isDisplayed(removeItem ,webDriver);
//        this.removeItem.click();
//    }
//
//    public void clickOnHereLink() {
//        DataHelperAndWait.isDisplayed(hereLink ,webDriver);
//        this.hereLink.click();
//    }
//
//    public void clickOnDecreaseQtyBtn() {
//        DataHelperAndWait.JsExecutorToClickOnElement(this.decreaseQtyBtn,webDriver);
//    }
//
//    public void clickOnIncreaseQtyBtn() {
//        DataHelperAndWait.waitToBeClickable(increaseQtyBtn ,webDriver);
//        this.increaseQtyBtn.click();
//    }
//
//    public void FillInQtyField(String qty) {
//        DataHelperAndWait.waitToBeVisible(qtyField ,webDriver);
//        this.qtyField.sendKeys(qty);
//    }
//
//    public void clickOnProductCartInCartPage() {
//        DataHelperAndWait.waitToBeVisible(productCartInCartPage ,webDriver);
//        this.productCartInCartPage.click();
//    }
//
//    public void clickOnCartIcon() {
//        DataHelperAndWait.waitToBeVisible(cartIcon ,webDriver);
//        this.cartIcon.click();
//    }
//
//    public void clickOnViewCartInCartPopUp() {
//        DataHelperAndWait.waitToBeVisible(viewCartInCartPopup ,webDriver);
//        this.viewCartInCartPopup.click();
//    }
//
//    public void clickOnProceedCheckoutBtnInCartPopup() {
//        DataHelperAndWait.waitToBeClickable(proceedCheckoutBtnInCartPopup ,webDriver);
//        this.proceedCheckoutBtnInCartPopup.click();
//    }
//
//    public void clickOnCartCloseIcon() {
//        DataHelperAndWait.waitToBeVisible(cartCloseIcon ,webDriver);
//        this.cartCloseIcon.click();
//    }
//
//    public void FillInCouponCode(String couponCode) {
//        DataHelperAndWait.waitToBeVisible(couponCodeField ,webDriver);
//        this.couponCodeField.sendKeys(couponCode);
//        DataHelperAndWait.waitToBeClickable(applyCouponCodeBtn ,webDriver);
//        this.applyCouponCodeBtn.click();
//    }
//
//    public void clickOnCancelCouponCodeBtn() {
//        DataHelperAndWait.waitToBeClickable(cancelCouponCodeBtn ,webDriver);
//        this.cancelCouponCodeBtn.click();
//    }
//    public void removeProductFromCart(){
//        webDriver.navigate().to(BasePage.BaseURL +aeDomain+cartURL);
//        this.clickOnRemoveItem();
//    }
//
//
//
//}