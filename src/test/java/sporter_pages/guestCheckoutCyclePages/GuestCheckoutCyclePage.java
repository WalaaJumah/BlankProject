/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription GuestCheckoutCyclePage
 */

package sporter_pages.guestCheckoutCyclePages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import sporter_pages.cartPages.CartPage;
import xml_reader.XmlReader;

@Getter
public class GuestCheckoutCyclePage extends BasePage {
    public GuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;
    @FindBy(xpath = "//button[contains(@class,'submitOrderBtn')]")
    private WebElement placeOrderBtn;
    @FindBy(xpath = "//button[contains(@class,'checkoutMethod_btn')]")
    private WebElement checkoutAsGuestBtn;
    @FindBy(xpath = "//a[contains(@class,'orderPage_head')]")
    private WebElement logoInCheckoutMethod;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[1]")
    private WebElement checkoutMethodLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[2]")
    private WebElement shippingInformationLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[3]")
    private WebElement securedCheckoutLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[4]")
    private WebElement shippingMethodLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[5]")
    private WebElement paymentInformationLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[6]")
    private WebElement orderReviewLabel;
    @FindBy(xpath = "(//div[starts-with(@class,'checkoutMethod_methodLabel')])[1]")
    private WebElement sigInAndCheckOutHeader;
    @FindBy(xpath = "(//div[starts-with(@class,'checkoutMethod_methodLabel')])[2]")
    private WebElement checkoutAsGuestHeader;
    @FindBy(xpath = "//div[starts-with(@class,'checkoutMethod_asGuestInfo')]")
    private WebElement checkoutAsGuestDescription;
    @FindBy(xpath = "//span[starts-with(@class,'sideOrderReview_totalAmount')]")
    private WebElement orderTotalValue;
    @FindBy(xpath = "//div[starts-with(@class,'checkbox_checkBoxContainer')]")
    private WebElement registerAtSporterOption;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[1]")
    private WebElement firstNameField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[2]")
    private WebElement lastNameField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[3]")
    private WebElement emailField;
    @FindBy(xpath = "//input[starts-with(@class,'teleInput_input')]")
    private WebElement phoneField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[4]")
    private WebElement addressNameField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[5]")
    private WebElement streetLineOneField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[6]")
    private WebElement streetLineTwoField;
    @FindBy(xpath = "//button[contains(@class,'shippingInfo_btn')]")
    private WebElement continueShippingInfoBtn;
    @FindBy(xpath = "//button[contains(@class,'shippingMethod_btn')]")
    private WebElement continueShippingMethodsBtn;
    @FindBy(xpath = "//button[contains(@class,'paymentInfo_btn')]")
    private WebElement continuePaymentMethodsBtn;
    @FindBy(xpath = "//div[@id='citiesSelector']/div")
    private WebElement cityMenu;
    @FindBy(xpath = "//select[starts-with(@class,'countrySelectorInput')]")
    private WebElement countryMenu;
    @FindBy(xpath = "(//div[@id='_errMsg'])[2]")
    private WebElement lastNameErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[3]")
    private WebElement emailErrMsg;
    @FindBy(xpath = "//div[starts-with(@class,'teleInput_errorMsg')]")
    private WebElement phoneErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[4]")
    private WebElement addressErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[1]")
    private WebElement firstnameErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[5]")
    private WebElement streetlineOneErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[6]")
    private WebElement streetlineErrMsg;
    @FindBy(xpath = "//div[starts-with(@class,'shippingMethod_shippingMethods')]")
    private WebElement shippingMethodsOptionsSection;
    @FindBy(xpath = "(//span[starts-with(@class,'segmentHeader_edit')])[2]")
    private WebElement editShippingInfoBtn;
    @FindBy(xpath = "(//span[starts-with(@class,'segmentHeader_edit')])[3]")
    private WebElement editShippingMethodsBtn;
    @FindBy(xpath = "//div[starts-with(@class,'radioButton_circle')]/following::span[1]")
    private WebElement twoBusinessDaysSuperExpressShipping;
    @FindBy(xpath = "///div[starts-with(@class,'paymentInfo_methods')]")
    private WebElement paymentMethodsSection;
//TODO:Same Day Delivery https://spocan.easyredmine.com/issues/8732?jump=issues
@FindBy(xpath = "(//div[starts-with(@class,'radioButton_circle')])[2]")
private WebElement sameDayDelivery;
   @FindBy(xpath = "//div[2]/div[2]/div[5]")
   private WebElement dubaiCity;
   @FindBy(xpath = "//div[2]/div[2]/div[2]/div[2]")
   private WebElement abuDhabiCity;
   @FindBy(xpath = "//span[starts-with(@class,'teleInput_code')]")
   private WebElement countryCode;
   @FindBy(xpath = "//div[contains(@id,'cashondelivery')]")
   private WebElement cODPaymentMethod;
   @FindBy(xpath = "//div[contains(@id,'card_payment')]")
   private WebElement creditCardPaymentMethod;
   @FindBy(xpath = "(//button[contains(@class,'submitOrderBtn_btn')])[1]")
   private WebElement finalPlaceOrderBtn;
   @FindBy(xpath = "//div[starts-with(@class,'successfullOrderPage_header')]")
   private WebElement successPage;
   @FindBy(xpath = "(//button[contains(@class,'submitOrderBtn_btn')])[2]")
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
   @FindBy(id = "password")
   private WebElement secureAnd2Authentication;
   @FindBy(id = "txtButton")
   private WebElement secureAnd2AuthenticationSubmitBtn;


    public void fillInShippingInformationInputField(String firstName, String lastName, String email, String phone, String address, String streetLineOne, String streetLineTwo) {
        DataHelperAndWait.waitToBeVisible(firstNameField ,webDriver);
        DataHelperAndWait.updateAllText(firstNameField,firstName);
        DataHelperAndWait.waitToBeVisible(lastNameField ,webDriver);
        DataHelperAndWait.updateAllText(lastNameField,lastName);
        DataHelperAndWait.waitToBeVisible(emailField ,webDriver);
        DataHelperAndWait.updateAllText(emailField,email);
        DataHelperAndWait.waitToBeVisible(phoneField ,webDriver);
        DataHelperAndWait.updateAllText(phoneField,phone);
        DataHelperAndWait.waitToBeVisible(addressNameField ,webDriver);
        DataHelperAndWait.updateAllText(addressNameField,address);
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
            DataHelperAndWait.waitToBeVisible(continueShippingInfoBtn,webDriver);
            this.continueShippingInfoBtn.click();
        }
    }
    public void navigateToCheckoutPage(){
        webDriver.navigate().to(BaseURL+shippingInformationUrl);
        DataHelperAndWait.waitForUrlContains(shippingInformationUrl,webDriver);
    }
        public void accessGuestCheckoutForm(){
        webDriver.navigate().to(BaseURL+shippingInformationUrl);
        DataHelperAndWait.waitForUrlContains(shippingInformationUrl,webDriver);
        DataHelperAndWait.clickOnElement(checkoutAsGuestBtn,webDriver);
    }
    public void setSelectDubaiCityCity(){
        try{
        DataHelperAndWait.clickOnElement(cityMenu,webDriver);
        DataHelperAndWait.clickOnElement(dubaiCity,webDriver);}
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
            XmlReader.getXMLData("AddressName"),
            XmlReader.getXMLData("StreetOneAddressName"),
            XmlReader.getXMLData("StreetTwoAddressName")
    );
    this.setSelectDubaiCityCity();
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
            XmlReader.getXMLData("AddressName"),
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
    DataHelperAndWait.typeTextInElement(this.getSecureAnd2Authentication(),webDriver,XmlReader.getXMLData("checkout3DSecure"));
    DataHelperAndWait.clickOnElement(this.getSecureAnd2AuthenticationSubmitBtn(),webDriver);
}
}
