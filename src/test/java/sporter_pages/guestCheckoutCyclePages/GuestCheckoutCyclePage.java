/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription GuestCheckoutCyclePage
 */

package sporter_pages.guestCheckoutCyclePages;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.Getter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import sporter_pages.cartPages.CartPage;
import xml_reader.XmlReader;

import java.text.DecimalFormat;
import java.util.List;

@Getter
public class GuestCheckoutCyclePage extends BasePage {
    public GuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    String checkOutComUrl="checkout.com";
    DataHelperAndWait dataHelperAndWait;
    @FindBy(id = "placeOrderSideBtn")
    private WebElement placeOrderBtn;
    @FindBy(id = "submitGuestOptionBtn")
    private WebElement checkoutAsGuestBtn;
    @FindBy(xpath = "//a[contains(@class,'orderPage_head')]")
    private WebElement logoInCheckoutMethod;
    @FindBy(id = "cMethod")
    private WebElement checkoutMethodLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[2]")
    private WebElement shippingInformationLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[3]")
    private WebElement securedCheckoutLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[4]")
    private WebElement shippingMethodLabel;
    @FindBy(id = "pInfo")
    private WebElement paymentInformationLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[6]")
    private WebElement orderReviewLabel;
    @FindBy(xpath = "(//div[starts-with(@class,'checkoutMethod_methodLabel')])[1]")
    private WebElement sigInAndCheckOutHeader;
    @FindBy(xpath = "(//div[starts-with(@class,'checkoutMethod_methodLabel')])[2]")
    private WebElement checkoutAsGuestHeader;
    @FindBy(xpath = "//div[starts-with(@class,'checkoutMethod_asGuestInfo')]")
    private WebElement checkoutAsGuestDescription;
    @FindBy(id = "value")
    private WebElement orderTotalValue;
    @FindBy(id = "registerGuestCheckBox")
    private WebElement registerAtSporterOption;
    @FindBy(id = "firstnameField")
    private WebElement firstNameField;
    @FindBy(id = "lastnameField")
    private WebElement lastNameField;
    @FindBy(id = "emailField")
    private WebElement emailField;
    @FindBy(xpath = "//input[starts-with(@class,'teleInput_input')]")
    private WebElement phoneField;
    @FindBy(id = "addressNameField")
    private WebElement addressNameField;
    @FindBy(id = "street1Field")
    private WebElement streetLineOneField;
    @FindBy(id = "street2Field")
    private WebElement streetLineTwoField;
    @FindBy(id = "submitShippingAddressBtn")
    private WebElement continueShippingInfoBtn;
    @FindBy(id = "submitShippingMethodBtn")
    private WebElement continueShippingMethodsBtn;
    @FindBy(id = "submitPaymentMethodBtn")
    private WebElement continuePaymentMethodsBtn;
    @FindBy(xpath = "//div[@id='citiesSelector']/div")
    private WebElement cityMenu;
    @FindBy(id = "countrySelector")
    private WebElement countryMenu;
    @FindBy(id = "lastnameField_errMsg")
    private WebElement lastNameErrMsg;
    @FindBy(id = "emailField_errMsg")
    private WebElement emailErrMsg;
    @FindBy(xpath = "//div[starts-with(@class,'teleInput_errorMsg')]")
    private WebElement phoneErrMsg;
    @FindBy(id = "addressNameField_errMsg")
    private WebElement addressErrMsg;
    @FindBy(id = "firstnameField_errMsg")
    private WebElement firstnameErrMsg;
    @FindBy(id = "street1Field_errMsg")
    private WebElement streetlineOneErrMsg;
    @FindBy(id = "shippingMethodsContainer")
    private WebElement shippingMethodsOptionsSection;
    @FindBy(id = "oInfoEdit")
    private WebElement editShippingInfoBtn;
    @FindBy(id = "oInfoEdit")
    private WebElement editShippingMethodsBtn;
    @FindBy(xpath = "//div[starts-with(@class,'radioButton_circle')]/following::span[1]")
    private WebElement twoBusinessDaysSuperExpressShipping;

    @FindBy(xpath = "///div[starts-with(@class,'paymentInfo_methods')]")
    private WebElement paymentMethodsSection;
//TODO:Same Day Delivery https://spocan.easyredmine.com/issues/8732?jump=issues
@FindBy(id = "samedaydelivery_standard")
private WebElement sameDayDelivery;
   @FindBy(xpath = "//div[2]/div[2]/div[5]")
   private WebElement dubaiCity;
   @FindBy(xpath = "//div[2]/div[2]/div[2]/div[2]")
   private WebElement abuDhabiCity;
   @FindBy(xpath = "//span[starts-with(@class,'teleInput_code')]")
   private WebElement countryCode;
   @FindBy(xpath = "//div[contains(@id,'cashondelivery')]//div[@id='circle']")
   private WebElement cODPaymentMethod;
   @FindBy(xpath = "//div[@id='checkoutcom_card_payment']//div[@id='circle']")
   private WebElement creditCardPaymentMethod;
   @FindBy(id = "placeOrderBtn")
   private WebElement finalPlaceOrderBtn;
   @FindBy(id = "orderID")
   private WebElement successPage;
   @FindBy(id = "placeOrderSideBtn")
   private WebElement finalPlaceOrderBtnOnRightScreen;
  @FindBy(id = "checkout-frames-card-number")
   private WebElement creditCardNumber;
   @FindBy(id = "checkout-frames-expiry-date")
   private WebElement creditCardDate;
   @FindBy(id = "checkout-frames-cvv")
   private WebElement creditCardCVV;
   @FindBy(id = "singleIframe")
   private WebElement creditCardIFrame;
   @FindBy(id = "closeAddToCartErrBtn")
   private WebElement closeCheckoutErr;
//   @FindBy(xpath = "//input[@placeholder='Hint: Checkout1!']")
//   private WebElement secureAnd2Authentication;
    @FindBy(id = "password")
   private WebElement secureAnd2Authentication;
   @FindBy(id = "txtButton")
   private WebElement secureAnd2AuthenticationSubmitBtn;
   @FindBy(id = "form")
   private WebElement checkoutForm;
   @FindBy(xpath = "//iframe[@frameborder='0']")
   private WebElement checkoutIFrame;
   @FindBy(xpath = "(//div[starts-with(@class,'orderReview_total')]/span)[1]")
   private WebElement orderTotalFieldInrReviewPage;
   @FindBy(xpath = "(//div[starts-with(@class,'orderReview_total')]/span)[2]")
   private WebElement orderTotalValueInrReviewPage;
   @FindBy(xpath = "(//span[starts-with(@class,'shippingMethod_amount')])[1]")
   private WebElement firstShippingMethodAmount;
    public void fillInShippingInformationInputField(String firstName, String lastName, String email, String phone, String streetLineOne, String streetLineTwo) {
        DataHelperAndWait.waitToBeVisible(firstNameField ,webDriver);
        DataHelperAndWait.updateAllText(firstNameField,firstName);
        DataHelperAndWait.waitToBeVisible(lastNameField ,webDriver);
        DataHelperAndWait.updateAllText(lastNameField,lastName);
        DataHelperAndWait.waitToBeVisible(emailField ,webDriver);
        DataHelperAndWait.updateAllText(emailField,email);
        DataHelperAndWait.waitToBeVisible(phoneField ,webDriver);
        DataHelperAndWait.updateAllText(phoneField,phone);
//        DataHelperAndWait.waitToBeVisible(addressNameField ,webDriver);
//        DataHelperAndWait.updateAllText(addressNameField,address);
        DataHelperAndWait.waitToBeVisible(streetLineOneField ,webDriver);
        DataHelperAndWait.updateAllText(streetLineOneField,streetLineOne);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField ,webDriver);
        DataHelperAndWait.updateAllText(streetLineTwoField,streetLineTwo);
    }
    public void clickOnContinueBtn() {
        DataHelperAndWait.scrollTo(continueShippingInfoBtn,webDriver);

        try{
            DataHelperAndWait.waitToBeVisible(continueShippingInfoBtn,webDriver);
            this.continueShippingInfoBtn.click();}
        catch (Exception e){
            DataHelperAndWait.hoverOnElementAndClick(continueShippingInfoBtn,webDriver);
        }
    }
    public void navigateToCheckoutPage(){
//        webDriver.navigate().to(BaseURL+shippingInformationUrl);
//        DataHelperAndWait.waitForUrlContains(shippingInformationUrl,webDriver);
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartPage();
        cartPage.navigateToHomePage();
                    cartPage.clickOnCartIcon();
            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
        //TODO: CHECK pROCEED TO CHECKOUT AFTER SOLVED IT BY MOAMEN
//        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
    }
        public void accessGuestCheckoutForm(){
////        webDriver.navigate().to(BaseURL+shippingInformationUrl);
//            CartPage cartPage = new CartPage(webDriver);
////            cartPage.navigateToCartPage();
////            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
//            cartPage.addToCartAndDisplayTheCart();
//            cartPage.clickOnCartIcon();
//            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
//
////            try {
////                DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
////            }
////            catch (Exception e){
////                cartPage.addToCartAndDisplayTheCart();
////            }
////            cartPage.clickOnCartIcon();
////            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
//            DataHelperAndWait.waitForUrlContains(shippingInformationUrl,webDriver);
//        DataHelperAndWait.clickOnElement(checkoutAsGuestBtn,webDriver);
//            webDriver.navigate().to(BaseURL+shippingInformationUrl);
            CartPage cartPage = new CartPage(webDriver);
//            cartPage.navigateToCartPage();
//            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
            cartPage.addToCartAndDisplayTheCart();

            try{
            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);}
            catch (Exception e){
                cartPage.navigateToHomePage();
            cartPage.clickOnCartIcon();
                DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
            }
//            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
//            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);


//            try {
//                DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
//            }
//            catch (Exception e){
//                cartPage.addToCartAndDisplayTheCart();
//            }
//            cartPage.clickOnCartIcon();
//            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
//            DataHelperAndWait.waitForUrlContains(shippingInformationUrl,webDriver);
            DataHelperAndWait.clickOnElement(checkoutAsGuestBtn,webDriver);
    }
    public void setSelectDubaiCityCity(){
        try{
        DataHelperAndWait.clickOnElement(cityMenu,webDriver);
        DataHelperAndWait.typeTextInElement(cityMenu,webDriver,"Dubai");}
        catch (Exception e){
            DataHelperAndWait.clickOnElement(cityMenu,webDriver);
            DataHelperAndWait.clickOnElement(dubaiCity,webDriver);
        }
    }
    public void SelectAbuDhabiCityCity(){
        DataHelperAndWait.clickOnElement(cityMenu,webDriver);
        DataHelperAndWait.clickOnElement(abuDhabiCity,webDriver);
    }
public void navigateToShippingMethodsPage(){
    this.accessGuestCheckoutForm();
    this.fillInShippingInformationInputField(
            XmlReader.getXMLData("firstName"),
            XmlReader.getXMLData("lastName"),
            XmlReader.getXMLData("correctEmail"),
            XmlReader.getXMLData("phoneNumber"),
//            XmlReader.getXMLData("AddressName"),
            XmlReader.getXMLData("StreetOneAddressName"),
            XmlReader.getXMLData("StreetTwoAddressName")
    );
//    this.setSelectDubaiCityCity();
    this.clickOnContinueBtn();
}

public void AddToCartAndAccessShippingMethodsPage(){
    CartPage cartPage=new CartPage(webDriver);
    cartPage.addToCartAndDisplayTheCart();
    this.accessGuestCheckoutForm();
    this.fillInShippingInformationInputField(
            XmlReader.getXMLData("firstName"),
            XmlReader.getXMLData("lastName"),
            XmlReader.getXMLData("correctEmail"),
            XmlReader.getXMLData("phoneNumber"),
//            XmlReader.getXMLData("AddressName"),
            XmlReader.getXMLData("StreetOneAddressName"),
            XmlReader.getXMLData("StreetTwoAddressName")
    );
    this.setSelectDubaiCityCity();
    this.clickOnContinueBtn();
}
    public void viewCartAndAccessShippingMethodsPage(){
        CartPage cartPage=new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        this.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        this.setSelectDubaiCityCity();
        this.clickOnContinueBtn();
    }
public void submitCreditCard(String creditNumber,String cardDate, String cvv){
//    DataHelperAndWait.clickOnElement(this.getCreditCardPaymentMethod(),webDriver);
//    webDriver.switchTo().frame(this.getCreditCardIFrame());
//    DataHelperAndWait.typeTextInElement(this.getCreditCardNumber(), webDriver,creditNumber);
//    DataHelperAndWait.typeTextInElement(this.getCreditCardDate(), webDriver,cardDate);
//    DataHelperAndWait.typeTextInElement(this.getCreditCardCVV(), webDriver,cvv);
//    webDriver.switchTo().defaultContent();
//    DataHelperAndWait.clickOnElement(this.getContinuePaymentMethodsBtn(), webDriver);
    DataHelperAndWait.clickOnElement(this.getCreditCardPaymentMethod(),webDriver);
    webDriver.switchTo().frame(this.getCreditCardIFrame());
    DataHelperAndWait.waitToBeVisible(this.getCreditCardNumber(),webDriver);
    DataHelperAndWait.updateAllText(this.getCreditCardNumber(),creditNumber);
    DataHelperAndWait.waitToBeVisible(this.getCreditCardDate(),webDriver);
    DataHelperAndWait.updateAllText(this.getCreditCardDate(),cardDate);
    DataHelperAndWait.waitToBeVisible(this.getCreditCardCVV(),webDriver);
    DataHelperAndWait.updateAllText(this.getCreditCardCVV(),cvv);
    webDriver.switchTo().defaultContent();
    DataHelperAndWait.clickOnElement(this.getContinuePaymentMethodsBtn(), webDriver);
}
public void submitSecureAndAuthenticationCheckout(){
    // Switch to the new window that has been opened for 3D Secure 2 authentication
//    String parentWindowHandle = webDriver.getWindowHandle();
//    for (String windowHandle : webDriver.getWindowHandles()) {
//        if (!windowHandle.equals(parentWindowHandle)) {
//            webDriver.switchTo().window(windowHandle);
//            break;
//        }
//    }
//    // Switch back to the original window and complete checkout process
//    webDriver.switchTo().window(parentWindowHandle);
    DataHelperAndWait.waitForUrlContains(checkOutComUrl,webDriver);
//    DataHelperAndWait.waitToBeVisible(this.secureAnd2Authentication,webDriver);
//    Actions actions= new Actions(webDriver);
//    actions.sendKeys(Keys.TAB).perform();
//    actions.sendKeys(Keys.ENTER).perform();
//    actions.moveToElement(this.getSecureAnd2Authentication());
//    this.secureAnd2Authentication.click();
//    this.secureAnd2Authentication.sendKeys(XmlReader.getXMLData("checkout3DSecure"));
    webDriver.switchTo().frame(checkoutIFrame);
//    actions.moveToElement(this.getSecureAnd2Authentication()).sendKeys(XmlReader.getXMLData("checkout3DSecure")).perform();
    DataHelperAndWait.typeTextInElement(this.getSecureAnd2Authentication(),webDriver,XmlReader.getXMLData("checkout3DSecure"));
//    DataHelperAndWait.waitForTime(3000);
    webDriver.switchTo().defaultContent();
    Actions actions= new Actions(webDriver);
    actions.sendKeys(Keys.ENTER).perform();
//    DataHelperAndWait.clickOnElement(this.getSecureAnd2AuthenticationSubmitBtn(),webDriver);
}
public void validateTheShippingMethodAmount(WebElement shippingFee, WebElement shippingMethod)
 {
        if(shippingMethod.getText().equalsIgnoreCase(XmlReader.getXMLData("twoBusinessDay"))){
                WebElementsAssertion.assertionWebElementEqualText(shippingFee,webDriver,"10 AED");
        } else if (shippingFee.getText().equalsIgnoreCase(XmlReader.getXMLData("fiveBusinessDays"))) {
            WebElementsAssertion.assertionWebElementEqualText(shippingFee,webDriver,"15JOD");
        }
        if(shippingMethod.getText().equalsIgnoreCase(XmlReader.getXMLData("fourToFiveBusinessDays"))){
     WebElementsAssertion.assertionWebElementEqualText(shippingFee,webDriver,"60 QAR");
 }
     if(shippingMethod.getText().equalsIgnoreCase(XmlReader.getXMLData("dootToDoor"))){
         WebElementsAssertion.assertionWebElementEqualText(shippingFee,webDriver,"25 SAR");
     }
     if(shippingMethod.getText().equalsIgnoreCase(XmlReader.getXMLData("pickupShipping"))){
         WebElementsAssertion.assertionWebElementEqualText(shippingFee,webDriver,"25 SAR");
     }
     if(shippingMethod.getText().equalsIgnoreCase(XmlReader.getXMLData("nextDayDelivery"))){
         WebElementsAssertion.assertionWebElementEqualText(shippingFee,webDriver,"Free Shipping");
     }

        }

}
