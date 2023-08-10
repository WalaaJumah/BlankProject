/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.tamara_payment_method_pages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.cartPages.CartPage;
import sporter_pages.checkoutForRegisteredUserTPage.CheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.time.LocalTime;
import java.util.List;

@Getter
public class TamaraPaymentPage extends BasePage {
    public TamaraPaymentPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    String tamaraSubUrl = ".tamara.";
       String checkoutSubUrl = ".checkout.com";
       String checkoutUrl = "/checkout";
       String tamaraCheckoutSubUrl = ".tamara.co/checkout?";

    String tabbySuccessInstallmentsSubUrl = "success-installments?";
    @FindBy(xpath = "//div[@id='tamara_pay_by_instalments']//div[@id='circle']")
    private WebElement tamaraInstallmentsPaymentMethod;
    @FindBy(xpath = "(//div[starts-with(@class,'tamara-login-title')])[2]")
    private WebElement tamaraPage;
       @FindBy(xpath = "//button[@qa-btn='otpContinue']")
    private WebElement submitOTPBtn;
       @FindBy(xpath = "(//div[contains(@class,'tamara-base-header')])[2]")
    private WebElement tamaraHeaderInPaymentSchedulePage;
    @FindBy(xpath = "//div[starts-with(@class,'d-flex justify-space-between')]/div[2]")
    private List<WebElement> tamaraPaymentSchedule;
      @FindBy(xpath = "//div[starts-with(@class,'v-text-field')]/input")
    private List<WebElement> cvvInCardsList;
      @FindBy(xpath = "//div[starts-with(@class,'v-radio')]")
    private List<WebElement> cardsList;

    @FindBy(xpath = "//input[starts-with(@id,'input')]")
    private WebElement phoneFieldInTamaraPage;
    @FindBy(xpath = "//div[@class='me-3 text-end primary--text text-amount']")
    private WebElement orderAmountInTamaraPage;
      @FindBy(id = "cardNumber")
    private WebElement cardNumberFrame;
      @FindBy(id = "expiryDate")
    private WebElement expiryDateFrame;
      @FindBy(id = "cvv")
    private WebElement cvvFrame;

    @FindBy(id = "checkout-frames-card-number")
    private WebElement cardNumberFieldInTamaraPage;
    @FindBy(id = "checkout-frames-expiry-date")
    private WebElement expiredDateFieldInTamaraPage;
    @FindBy(id = "checkout-frames-cvv")
    private WebElement cvvFieldInTamaraPage;
//    @FindBy(xpath = "(//button[contains(@class,'v-btn v-btn')])[2]")
//    private WebElement payBtnInTamaraPage;
       @FindBy(xpath = "(//button[contains(@class,'v-btn v-btn--is-elevated')])/span[1]")
    private WebElement payBtnInTamaraPage;

        @FindBy(xpath = "//button[@qa-btn='loginContinue']")
    private WebElement submitPhoneNUmberBtn;
        @FindBy(xpath = "//div[@class='payment-method__add-new-card-button__icon']")
    private WebElement addNewCardBtn;
        @FindBy(xpath = "//*[@id='tamara-checkout-body-content']/div[2]")
    private WebElement tamerSuccessfulLoader;

    @FindBy(id = "pInfoEdit")
    private WebElement editBtnInPaymentMethodInfoLabel;
    public void SelectTamaraInstallmentsMethod() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitToBeVisible(tamaraInstallmentsPaymentMethod,webDriver);
        DataHelperAndWait.clickOnElement(tamaraInstallmentsPaymentMethod,webDriver);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
       guestCheckoutCyclePage.getContinuePaymentMethodsBtn().click();
    }
    public void addToCartAndDisplayTheCart() throws IOException {
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        try{if(productDetailsPage.getAddToCartBtn().isDisplayed())
            System.out.println("You are in product Details page");
        }
        catch (Exception e){
            productDetailsPage.displayTheProduct();
        }
        productDetailsPage.addToCart();
            productDetailsPage.viewCart();
    }
    public void accessGuestCheckoutForm() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        try {
            CartPage cartPage = new CartPage(webDriver);
           addToCartAndDisplayTheCart();
            try {
                cartPage.proceedToCheckout();
            } catch (Exception e) {
                cartPage.navigateToHomePage();
                cartPage.clickOnCartIcon();
                DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
            }
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCheckoutAsGuestBtn(), webDriver);
        } catch (Exception e) {
            CartPage cartPage = new CartPage(webDriver);
            addToCartAndDisplayTheCart();

            try {
                cartPage.proceedToCheckout();
            } catch (Exception ee) {
                cartPage.navigateToHomePage();
                cartPage.clickOnCartIcon();
                DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
            }
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCheckoutAsGuestBtn(), webDriver);
        }
    }
public void clickOnFinalPlaceOrderBtn(){
        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,50);
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);
        }
        catch (Exception e){
            DataHelperAndWait.hoverOnElementAndClick(guestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);

        }

}
    public void selectTamaraInstallmentsMethodFromEditPage() throws Exception {
    DataHelperAndWait.waitToBeVisible(editBtnInPaymentMethodInfoLabel,webDriver);
    DataHelperAndWait.clickOnElement(editBtnInPaymentMethodInfoLabel,webDriver);
    SelectTamaraInstallmentsMethod();
}

public double calculateInstallmentsAmount(String currency){
    DataHelperAndWait.waitForTime(2000);
    double sum = 0;
    for (WebElement element : tamaraPaymentSchedule) {
        double number=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(element,webDriver,currency);
        sum += number;
    }
    return sum;
}
public void submitEmailAndPhoneNumberInPositiveFlow(){
    DataHelperAndWait.waitToBeVisible(phoneFieldInTamaraPage,webDriver);
    DataHelperAndWait.updateAllText(phoneFieldInTamaraPage,XmlReader.getXMLData("tabbyPositivePhone"));
    DataHelperAndWait.waitToBeVisible(submitPhoneNUmberBtn,webDriver);
    DataHelperAndWait.clickOnElement(submitPhoneNUmberBtn,webDriver);
    DataHelperAndWait.waitToBeVisible(submitOTPBtn,webDriver);
    DataHelperAndWait.clickOnElement(submitOTPBtn,webDriver);
}


public void AddNewCardAndSubmitIt() throws IOException, InterruptedException {

    DataHelperAndWait.waitToBeVisible(addNewCardBtn,webDriver);
    DataHelperAndWait.clickOnElement(addNewCardBtn,webDriver);
    DataHelperAndWait.waitForTime(2000);
    webDriver.switchTo().frame(cardNumberFrame);
    DataHelperAndWait.waitToBeVisible(cardNumberFieldInTamaraPage,webDriver);
    DataHelperAndWait.clickOnElement(cardNumberFieldInTamaraPage,webDriver);
    DataHelperAndWait.updateAllText(cardNumberFieldInTamaraPage,XmlReader.getXMLData("tamaraPositiveCard"));
    webDriver.switchTo().defaultContent();
    DataHelperAndWait.waitForTime(2000);
    webDriver.switchTo().frame(cvvFrame);
    DataHelperAndWait.waitToBeVisible(cvvFieldInTamaraPage,webDriver);
    DataHelperAndWait.clickOnElement(cvvFieldInTamaraPage,webDriver);
    DataHelperAndWait.updateAllText(cvvFieldInTamaraPage,XmlReader.getXMLData("tamaraPositiveCVV"));
    webDriver.switchTo().defaultContent();
    DataHelperAndWait.waitForTime(2000);
    webDriver.switchTo().frame(expiryDateFrame);
    DataHelperAndWait.waitToBeVisible(expiredDateFieldInTamaraPage,webDriver);
    DataHelperAndWait.updateAllText(expiredDateFieldInTamaraPage,XmlReader.getXMLData("tamaraPositiveCardDate"));
    webDriver.switchTo().defaultContent();
    DataHelperAndWait.waitToBeVisible(payBtnInTamaraPage,webDriver);
    DataHelperAndWait.clickOnElement(payBtnInTamaraPage,webDriver);
}
    public void SelectDefinedCardAndSubmitTheCard(int cardNumberInTheList) throws IOException, InterruptedException {
        DataHelperAndWait.waitToBeVisible(this.getTamaraHeaderInPaymentSchedulePage(),webDriver);
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.waitToBeVisible(this.getCardsList().get(cardNumberInTheList),webDriver);
        DataHelperAndWait.clickOnElement(this.getCardsList().get(cardNumberInTheList),webDriver);
        DataHelperAndWait.waitToBeVisible(this.getCvvInCardsList().get(cardNumberInTheList),webDriver);
        switch(cardNumberInTheList){
            case 0:
                DataHelperAndWait.typeTextInElement(this.getCvvInCardsList().get(cardNumberInTheList),webDriver,"100");
                webDriver.switchTo().defaultContent();
                DataHelperAndWait.waitForTime(2000);
                payBtnInTamaraPage.click();
                break;
            case 1:
                DataHelperAndWait.typeTextInElement(this.getCvvInCardsList().get(cardNumberInTheList),webDriver,"257");
                webDriver.switchTo().defaultContent();
                DataHelperAndWait.waitForTime(2000);
                payBtnInTamaraPage.click();
                break;
            case 2:
                DataHelperAndWait.typeTextInElement(this.getCvvInCardsList().get(cardNumberInTheList),webDriver,"100");
                webDriver.switchTo().defaultContent();
                DataHelperAndWait.waitForTime(2000);
                payBtnInTamaraPage.click();
                break;

            case 3:
                DataHelperAndWait.typeTextInElement(this.getCvvInCardsList().get(cardNumberInTheList),webDriver,"956");
                webDriver.switchTo().defaultContent();
                DataHelperAndWait.waitForTime(2000);
                payBtnInTamaraPage.click();
                break;


        }

    }
public void fillInShippingInformationInputField(String firstName, String lastName, String email, String phone, String streetLineOne, String streetLineTwo) {
GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
DataHelperAndWait.waitTillPageFullyLoaded(webDriver,50);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFirstNameField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getFirstNameField(), firstName);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getLastNameField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getLastNameField(), lastName);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getPhoneField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getPhoneField(), phone);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getStreetLineOneField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getStreetLineOneField(), streetLineOne);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getStreetLineTwoField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getStreetLineTwoField(), streetLineTwo);
        guestCheckoutCyclePage.selectCity();
    }
    public void fillInShippingInformationInputFieldForRegistered(String firstName, String lastName, String email, String phone, String streetLineOne, String streetLineTwo,String AddressName) {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,50);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFirstNameField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getFirstNameField(), firstName);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getLastNameField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getLastNameField(), lastName);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getPhoneField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getPhoneField(), phone);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getStreetLineOneField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getStreetLineOneField(), streetLineOne);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getStreetLineTwoField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getStreetLineTwoField(), streetLineTwo);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getAddressNameField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getAddressNameField(), streetLineTwo);
        guestCheckoutCyclePage.selectCity();
    }
    public void AddToCartAndAccessShippingMethodsPage(String PhoneNumber) throws IOException {
        System.out.println("hiiii");
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
            cartPage.addToCartAndDisplayTheCart();
            cartPage.proceedToCheckout();
            DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getAddNewAddressBtn(),webDriver);
            this.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("phoneNumber"),
                    PhoneNumber,
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"));

            DataHelperAndWait.waitForTime(1500);
            guestCheckoutCyclePage.clickOnContinueBtn();

    }
    public void AddToCartAndAccessShippingMethodsPageForRegistered(String PhoneNumber) throws IOException {
        System.out.println("hiiii");
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        cartPage.proceedToCheckout();
        DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getAddNewAddressBtn(),webDriver);
        this.fillInShippingInformationInputFieldForRegistered(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                PhoneNumber,
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("AddressName") );

        DataHelperAndWait.waitForTime(1500);
        guestCheckoutCyclePage.clickOnContinueBtn();

    }
    public void navigateToCheckoutPageViaLink(){
        webDriver.navigate().to(BaseURL+ checkoutUrl);
        DataHelperAndWait.waitForUrlContains(checkoutUrl,webDriver);
    }
       public void accessShippingFormForGuestViaURL(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        webDriver.navigate().to(BaseURL+ checkoutUrl);
        DataHelperAndWait.waitForUrlContains(checkoutUrl,webDriver);
        DataHelperAndWait.scrollTo(guestCheckoutCyclePage.getCheckoutAsGuestBtn(), webDriver);
           DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCheckoutAsGuestBtn(), webDriver);
    }

    public void displayProductAndAddToCart() throws IOException {
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        webDriver.navigate().to(BasePage.BaseURL);
        productDetailsPage.displayTheProduct();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
    }
    public void IsQouteIDisDisplayed() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitForTime(3000);
        guestCheckoutCyclePage.verifyTheDisplayedPageDoesNotHaveErrors();
        String orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println(orderNumber);

    }
    public void addToCartAndAccessTamaraDashboard() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        displayProductAndAddToCart();
        accessShippingFormForGuestViaURL();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("UAEPhoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(), webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
        SelectTamaraInstallmentsMethod();
      clickOnFinalPlaceOrderBtn();
        submitEmailAndPhoneNumberInPositiveFlow();
        DataHelperAndWait.waitForTime(2500);
    }

    public void addToCartAndAccessTamaraDashboardForSameDayShipping() throws Exception {
            GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
            webDriver.manage().deleteCookieNamed("guestCartId");
            displayProductAndAddToCart();
            accessShippingFormForGuestViaURL();
            guestCheckoutCyclePage.fillInShippingInformationInputFieldWithDubai(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("correctEmail"),
                    XmlReader.getXMLData("UAEPhoneNumber"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"));
            DataHelperAndWait.waitForTime(2000);
            guestCheckoutCyclePage.clickOnContinueBtn();
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
            SelectTamaraInstallmentsMethod();
            clickOnFinalPlaceOrderBtn();
            submitEmailAndPhoneNumberInPositiveFlow();
            DataHelperAndWait.waitForTime(2500);
    }

}