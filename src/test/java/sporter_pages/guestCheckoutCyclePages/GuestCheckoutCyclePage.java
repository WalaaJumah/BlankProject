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
import sporter_pages.cartPages.CartPage;
import sporter_pages.checkoutForRegisteredUserTPage.CheckoutForRegisteredPage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.util.List;

@Getter
public class GuestCheckoutCyclePage extends BasePage {
    String checkOutComUrl = "checkout.com";
    DataHelperAndWait dataHelperAndWait;
    @FindBy(id = "placeOrderSideBtn")
    private WebElement placeOrderBtn;
    @FindBy(id = "submitGuestOptionBtn")
    private WebElement checkoutAsGuestBtn;
    @FindBy(xpath = "//a[contains(@class,'orderPage_head')]")
    private WebElement logoInCheckoutMethod;
    @FindBy(id = "cMethod")
    private WebElement checkoutMethodLabel;
    @FindBy(id = "oInfoTitle")
    private WebElement shippingInformationLabel;
    @FindBy(id = "oInfoicon")
    private WebElement securedCheckoutLabel;
    @FindBy(id = "sMethodTitle")
    private WebElement shippingMethodLabel;
    @FindBy(id = "pInfo")
    private WebElement paymentInformationLabel;
    @FindBy(id = "pInfoicon")
    private WebElement orderReviewLabel;
    @FindBy(id = "signInOptionLabel")
    private WebElement sigInAndCheckOutHeader;
    @FindBy(id = "guestOption")
    private WebElement checkoutAsGuestHeader;
    @FindBy(id = "guestOptionInfo")
    private WebElement checkoutAsGuestDescription;
    @FindBy(id = "value")
    private WebElement orderTotalValue;
    @FindBy(xpath = "(//*[@id=\"value\"])[8]")
    private WebElement grandTotalValue;

    @FindBy(id = "registerGuestCheckBox")
    private WebElement registerAtSporterOption;
    @FindBy(id = "firstnameField")
    private WebElement firstNameField;
    @FindBy(id = "lastnameField")
    private WebElement lastNameField;
    @FindBy(id = "emailField")
    private WebElement emailField;
    @FindBy(id = "phoneNumber")
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
    @FindBy(xpath = "//div[@id='citiesSelector']/div[2]/div/input")
    private WebElement citySearch;
    @FindBy(xpath = "//*/text()[normalize-space(.)='Dubai']/parent::*")
    private WebElement duabiCity;
    @FindBy(xpath = "//div[@id='citiesSelector']/div[2]/div[2]/div[2]")
    private WebElement firstCity;


    @FindBy(id = "countrySelector")
    private WebElement countryMenu;
    @FindBy(id = "lastnameField_errMsg")
    private WebElement lastNameErrMsg;
    @FindBy(id = "emailField_errMsg")
    private WebElement emailErrMsg;
    @FindBy(id = "telephoneInputErrMsg")
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
    @FindBy(xpath = "(//div[@id='shippingMethod']/div)[1]")
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
    @FindBy(id = "countryCode")
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
    @FindBy(xpath = "(//div[@id='grand_total'])[1]/div/span[@id='value']")
    private WebElement orderTotalFieldInrReviewPage;
    @FindBy(xpath = "(//div[starts-with(@class,'orderReview_total')]/span)[2]")
    private WebElement orderTotalValueInrReviewPage;
    @FindBy(xpath = "(//span[starts-with(@class,'shippingMethod_amount')])[1]")
    private WebElement firstShippingMethodAmount;
    public GuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }

    public void fillInShippingInformationInputField(String firstName, String lastName, String email, String phone, String streetLineOne, String streetLineTwo) {
        DataHelperAndWait.waitToBeVisible(firstNameField, webDriver);
        DataHelperAndWait.updateAllText(firstNameField, firstName);
        DataHelperAndWait.waitToBeVisible(lastNameField, webDriver);
        DataHelperAndWait.updateAllText(lastNameField, lastName);
        DataHelperAndWait.waitToBeVisible(emailField, webDriver);
        DataHelperAndWait.updateAllText(emailField, email);
        DataHelperAndWait.waitToBeVisible(phoneField, webDriver);
        DataHelperAndWait.updateAllText(phoneField, phone);
//        DataHelperAndWait.waitToBeVisible(addressNameField ,webDriver);
//        DataHelperAndWait.updateAllText(addressNameField,address);
        DataHelperAndWait.waitToBeVisible(streetLineOneField, webDriver);
        DataHelperAndWait.updateAllText(streetLineOneField, streetLineOne);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField, webDriver);
        DataHelperAndWait.updateAllText(streetLineTwoField, streetLineTwo);
        this.selectCity();
    }
    public void fillInShippingInformationInputFieldWithDubai(String firstName, String lastName, String email, String phone, String streetLineOne, String streetLineTwo) {
        DataHelperAndWait.waitToBeVisible(firstNameField, webDriver);
        DataHelperAndWait.updateAllText(firstNameField, firstName);
        DataHelperAndWait.waitToBeVisible(lastNameField, webDriver);
        DataHelperAndWait.updateAllText(lastNameField, lastName);
        DataHelperAndWait.waitToBeVisible(emailField, webDriver);
        DataHelperAndWait.updateAllText(emailField, email);
        DataHelperAndWait.waitToBeVisible(phoneField, webDriver);
        DataHelperAndWait.updateAllText(phoneField, phone);
//        DataHelperAndWait.waitToBeVisible(addressNameField ,webDriver);
//        DataHelperAndWait.updateAllText(addressNameField,address);
        DataHelperAndWait.waitToBeVisible(streetLineOneField, webDriver);
        DataHelperAndWait.updateAllText(streetLineOneField, streetLineOne);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField, webDriver);
        DataHelperAndWait.updateAllText(streetLineTwoField, streetLineTwo);
        setSelectDubaiCityCity();
    }
    public void fillInShippingInformationInputFieldWithDubaiForRegisteredUser(String firstName, String lastName,  String phone, String streetLineOne, String streetLineTwo, String address) {
        DataHelperAndWait.waitToBeVisible(firstNameField, webDriver);
        DataHelperAndWait.updateAllText(firstNameField, firstName);
        DataHelperAndWait.waitToBeVisible(lastNameField, webDriver);
        DataHelperAndWait.updateAllText(lastNameField, lastName);
        DataHelperAndWait.waitToBeVisible(phoneField, webDriver);
        DataHelperAndWait.updateAllText(phoneField, phone);
        DataHelperAndWait.waitToBeVisible(addressNameField ,webDriver);
        DataHelperAndWait.updateAllText(addressNameField,address);
        DataHelperAndWait.waitToBeVisible(streetLineOneField, webDriver);
        DataHelperAndWait.updateAllText(streetLineOneField, streetLineOne);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField, webDriver);
        DataHelperAndWait.updateAllText(streetLineTwoField, streetLineTwo);
        setSelectDubaiCityCity();
    }
    public void clickOnContinueBtn() {
        DataHelperAndWait.waitToBeVisible(continueShippingInfoBtn, webDriver);
        DataHelperAndWait.scrollTo(continueShippingInfoBtn, webDriver);

        try {
            DataHelperAndWait.waitToBeVisible(continueShippingInfoBtn, webDriver);
            DataHelperAndWait.waitToBeVisible(continueShippingInfoBtn, webDriver);
            this.continueShippingInfoBtn.click();
        } catch (Exception e) {
            DataHelperAndWait.hoverOnElementAndClick(continueShippingInfoBtn, webDriver);
        }
    }

    public void navigateToCheckoutPage() throws IOException {
//        webDriver.navigate().to(BaseURL+shippingInformationUrl);
//        DataHelperAndWait.waitForUrlContains(shippingInformationUrl,webDriver);
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartPage();
        cartPage.navigateToHomePage();
        cartPage.clickOnCartIcon();
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
        //TODO: CHECK pROCEED TO CHECKOUT AFTER SOLVED IT BY MOAMEN
    }

    public void accessGuestCheckoutForm() throws IOException {
        try {
            CartPage cartPage = new CartPage(webDriver);
            cartPage.addToCartAndDisplayTheCart();
            try {
                cartPage.proceedToCheckout();
            } catch (Exception e) {
                cartPage.navigateToHomePage();
                cartPage.clickOnCartIcon();
                DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
            }
            DataHelperAndWait.clickOnElement(checkoutAsGuestBtn, webDriver);
        } catch (Exception e) {
            CartPage cartPage = new CartPage(webDriver);
            cartPage.addToCartAndDisplayTheCart();

            try {
                cartPage.proceedToCheckout();
            } catch (Exception ee) {
                cartPage.navigateToHomePage();
                cartPage.clickOnCartIcon();
                DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
            }
            DataHelperAndWait.clickOnElement(checkoutAsGuestBtn, webDriver);
        }
    }

    public void selectCity() {
        try {
            DataHelperAndWait.clickOnElement(cityMenu, webDriver);
            DataHelperAndWait.waitToBeVisible(firstCity, webDriver);
            DataHelperAndWait.clickOnElement(firstCity, webDriver);
        } catch (Exception e) {
            DataHelperAndWait.clickOnElement(cityMenu, webDriver);
            DataHelperAndWait.waitToBeVisible(firstCity, webDriver);
            DataHelperAndWait.clickOnElement(firstCity, webDriver);
        }
    }

    public void setSelectDubaiCityCity() {
        try {
            DataHelperAndWait.clickOnElement(cityMenu, webDriver);
            DataHelperAndWait.waitForTime(1500);
            DataHelperAndWait.clickOnElement(citySearch, webDriver);
            DataHelperAndWait.typeTextInElement(citySearch, webDriver, "Dubai");
            DataHelperAndWait.waitForTime(1000);
            DataHelperAndWait.clickOnElement(duabiCity, webDriver);

        } catch (Exception e) {
            DataHelperAndWait.clickOnElement(cityMenu, webDriver);
            DataHelperAndWait.typeTextInElement(citySearch, webDriver, "Dubai");
            DataHelperAndWait.clickOnElement(duabiCity, webDriver);
        }
    }

    public void SelectAbuDhabiCityCity() {
        DataHelperAndWait.clickOnElement(cityMenu, webDriver);
        DataHelperAndWait.clickOnElement(abuDhabiCity, webDriver);
    }

    public void navigateToShippingMethodsPage() throws IOException {
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

    public void AddToCartAndAccessShippingMethodsPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
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

    public void viewCartAndAccessShippingMethodsPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
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

    public void submitCreditCard(String creditNumber, String cardDate, String cvv) {
        DataHelperAndWait.clickOnElement(this.getCreditCardPaymentMethod(), webDriver);
        webDriver.switchTo().frame(this.getCreditCardIFrame());
        DataHelperAndWait.waitForTime(2500);
        DataHelperAndWait.waitToBeVisible(this.getCreditCardNumber(), webDriver);
        DataHelperAndWait.updateAllText(this.getCreditCardNumber(), creditNumber);
        DataHelperAndWait.waitToBeVisible(this.getCreditCardDate(), webDriver);
        DataHelperAndWait.updateAllText(this.getCreditCardDate(), cardDate);
        DataHelperAndWait.waitToBeVisible(this.getCreditCardCVV(), webDriver);
        DataHelperAndWait.updateAllText(this.getCreditCardCVV(), cvv);
        webDriver.switchTo().defaultContent();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(this.getContinuePaymentMethodsBtn(), webDriver);
        DataHelperAndWait.waitForTime(1000);
    }

    public void submitSecureAndAuthenticationCheckout() {
        DataHelperAndWait.waitForUrlContains(checkOutComUrl, webDriver);
        webDriver.switchTo().frame(checkoutIFrame);
        webDriver.switchTo().frame(checkoutIFrame);
        DataHelperAndWait.clickOnElement(this.getSecureAnd2Authentication(), webDriver);
        DataHelperAndWait.typeTextInElement(this.getSecureAnd2Authentication(), webDriver, XmlReader.getXMLData("checkout3DSecure"));
        webDriver.switchTo().defaultContent();
        Actions actions = new Actions(webDriver);
        actions.sendKeys(Keys.ENTER).perform();
    }
public boolean ifSecureAndAuthenticationIsRequired(){
        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,500);
            if(webDriver.getCurrentUrl().contains("sandbox.checkout.com/"))
return true;
else
            return false;
}
    public void validateTheShippingMethodAmount(WebElement shippingFee, WebElement shippingMethod) {
        if (shippingMethod.getText().equalsIgnoreCase(XmlReader.getXMLData("twoBusinessDay"))) {
            WebElementsAssertion.assertionWebElementEqualText(shippingFee, webDriver, "10 AED");
        } else if (shippingFee.getText().equalsIgnoreCase(XmlReader.getXMLData("fiveBusinessDays"))) {
            WebElementsAssertion.assertionWebElementEqualText(shippingFee, webDriver, "15JOD");
        }
        if (shippingMethod.getText().equalsIgnoreCase(XmlReader.getXMLData("fourToFiveBusinessDays"))) {
            WebElementsAssertion.assertionWebElementEqualText(shippingFee, webDriver, "60 QAR");
        }
        if (shippingMethod.getText().equalsIgnoreCase(XmlReader.getXMLData("dootToDoor"))) {
            WebElementsAssertion.assertionWebElementEqualText(shippingFee, webDriver, "25 SAR");
        }
        if (shippingMethod.getText().equalsIgnoreCase(XmlReader.getXMLData("pickupShipping"))) {
            WebElementsAssertion.assertionWebElementEqualText(shippingFee, webDriver, "25 SAR");
        }
        if (shippingMethod.getText().equalsIgnoreCase(XmlReader.getXMLData("nextDayDelivery"))) {
            WebElementsAssertion.assertionWebElementEqualText(shippingFee, webDriver, "Free Shipping");
        }

    }
    public void IsQouteIDisDisplayed() throws IOException {
        DataHelperAndWait.waitForTime(4000);
        verifyTheDisplayedPageDoesNotHaveErrors();
        String orderNumber= DataHelperAndWait.extractDigitsFromString(successPage,webDriver);
        System.out.println(orderNumber);
    }

}
