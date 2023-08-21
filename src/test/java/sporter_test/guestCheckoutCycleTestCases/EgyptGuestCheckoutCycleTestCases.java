/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.guestCheckoutCycleTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.guestCheckoutCyclePages.EgyptGuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.EgyptHomePage;
import xml_reader.XmlReader;

import java.io.IOException;

public class EgyptGuestCheckoutCycleTestCases extends GuestCheckoutCycleTestCases{
    @BeforeClass(alwaysRun=true)
    public void switchToEgyptStore(){
        EgyptHomePage egyptHomePage=new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if(webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)){
            System.out.println("You are in Egypt Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+egyptHomePage.egyptDomain);
            //CloseInitialDialog();
             }
        storeCountry="Egypt";
        countryCode="20";
    }
    @Test(enabled = false)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {
    }
    //TODO:The Same Day Delivery is Missing
    @Test(enabled = false)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {
    }
//    @Test(groups = { "All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 6)
//    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
//        CartPage cartPage = new CartPage(webDriver);
//        DecimalFormat df = new DecimalFormat("0.00");
//        cartPage.navigateToCartPage();
//        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"EGP");
//        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"EGP");
//        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,",");
//        double cartTotal = subTotal + tax;
//        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal));
//    }
    @Test(enabled = false)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() {}
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 21)
    public void verifyAllShippingMethodsAppearCorrectly(){
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver, XmlReader.getXMLData("nextDayDelivery"));
    }
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 27)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.waitTillLoaderComplete();
        egypt.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.clickOnElement(egypt.getCloseCheckoutErr(), webDriver);
    }
@Test(enabled = false)
public void verifyOrderTotalCalculationInCartPageWorksCorrectly(){}
@Test(enabled = false)
public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Next Day Delivery Shipping Method With COD Payment Method correctly", priority = 25)
    public void verifyAbilityToSelectTheNextDayDeliveryShippingMethodWithCODPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDaySuperExpressShippingMethodWithCODPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.waitForTime(500);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        guestCheckoutCyclePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }
//    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Next Day Delivery Shipping Method With COD Payment Method ", priority = 26)
//    public void verifyAbilityToPlaceOrderWhenSelectingNextDayDeliveryShippingMethodWithCODPaymentMethod() {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
////        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
//    }
@Test(enabled = false)
public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Next Day Delivery Shipping Method With Valid Credit Card Payment Method", priority = 28)
    public void verifyAbilityToSelectTheNextDayDeliveryShippingMethodWithValidCreditCardPaymentMethod() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        egypt.clickOnContinueBtn();
            DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(), webDriver);
            DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(), webDriver);
            egypt.selectCreditCardMethod();
            WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(), webDriver);

    }
@Test(enabled = false)
public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() {}
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Next Day Delivery Shipping Method With Credit Card Payment Method ", priority = 29)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDayDeliveryShippingMethodWithCreditCardPaymentMethod() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardCorrectly();
//        DataHelperAndWait.waitForTime(3000);
//        webDriver.switchTo().frame(1);
//        DataHelperAndWait.waitToBeVisible(egypt.getGoToMerchentWebSite(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure to view the Cart using cart icon appearing at the top of screen", priority = 3)
    public void viewCartFromCartIcon() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getViewCartInCartPopup(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
//        cartPage.removeItem();
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 4)
    public void verifyAllPaymentMethodAppearingTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCODOption(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 23)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getCODPaymentMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getCreditCardPaymentMethod(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With COD Payment Method ", priority = 26)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDaysSuperExpressShippingMethodWithCODPaymentMethod() throws IOException {
        EgyptGuestCheckoutCyclePage egyptGuestCheckoutCyclePage= new EgyptGuestCheckoutCyclePage(webDriver);
        egyptGuestCheckoutCyclePage.accessGuestCheckoutForm();
        egyptGuestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        egyptGuestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);
        DataHelperAndWait.waitForTime(2000);
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        egyptGuestCheckoutCyclePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure the system display the Quote ID for the user after checkout the order", priority = 100)
    public void verifyTheSystemDisplayTheQuoteIdForTheUserAfterCheckoutTheOrder() throws IOException {
        EgyptGuestCheckoutCyclePage egyptGuestCheckoutCyclePage= new EgyptGuestCheckoutCyclePage(webDriver);
        try {
            egyptGuestCheckoutCyclePage.accessGuestCheckoutForm();
        }
        catch (Exception e){
            egyptGuestCheckoutCyclePage.accessGuestCheckoutForm();
        }
        egyptGuestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        egyptGuestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);
        egyptGuestCheckoutCyclePage.waitTillCartSpinnerDisappear(webDriver);
        DataHelperAndWait.waitToBeVisible(egyptGuestCheckoutCyclePage.getSuccessPage(),webDriver);
        egyptGuestCheckoutCyclePage.verifyTheDisplayedPageDoesNotHaveErrors();}
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when using a Free Coupon Code ", priority = 99)
    public void verifyAbilityToPlaceOrderWhenUsingFreeCouponCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        EgyptGuestCheckoutCyclePage egyptGuestCheckoutCyclePage= new EgyptGuestCheckoutCyclePage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
//        cartPage.navigateToHomePage();
//        cartPage.clickOnCartIcon();
//        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
        cartPage.proceedToCheckout();
//        DataHelperAndWait.waitForUrlContains(guestCheckoutCyclePage.shippingInformationUrl,webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getCheckoutAsGuestBtn(),webDriver);
        egyptGuestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        egyptGuestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);
        DataHelperAndWait.waitForTime(2000);

//        DataHelperAndWait.waitForTime(10000);
//        String mainWindow= webDriver.getWindowHandle();
//        Set<String> handles = webDriver.getWindowHandles();
//// Switch to the pop-up window
//        for (String handle : handles) {
//            if (!handle.equals(mainWindow)) {
//                webDriver.switchTo().window(handle);
//            }
//        }
// Close the pop-up window
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
//        Actions actions= new Actions(webDriver);
//        actions.sendKeys(Keys.ENTER).perform();
// Switch back to the main window
//        webDriver.switchTo().window(mainWindow);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
//        guestCheckoutCyclePage.submitSecureAndAuthenticationCheckout();
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
    }


    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Authentication Failed Option from Geidea Payment Gate Screen  ", priority = 60)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingAuthenticationFailedOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        try {
            egypt.accessGuestCheckoutForm();
        }
        catch (Exception e){
            egypt.accessGuestCheckoutForm();

        }
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(N) Authentication Failed");
//        DataHelperAndWait.waitForTime(3000);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Authentication Not Available Option from Geidea Payment Gate Screen", priority = 61)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingAuthenticationNotAvailableOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(X or U) Authentication Not Available");
//        DataHelperAndWait.waitForTime(3000);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Authentication Attempted Option from Geidea Payment Gate Screen", priority = 62)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingAuthenticationAttemptedOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(3000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(M) Authentication Attempted");
//                DataHelperAndWait.waitForTime(3500);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Error Parsing Authentication Response Option from Geidea Payment Gate Screen", priority = 63)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingErrorParsingAuthenticationResponseOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(3000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(P) Error Parsing Authentication Response");
//                DataHelperAndWait.waitForTime(3500);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(enabled = false,groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Invalid Signature on Authentication Response Option from Geidea Payment Gate Screen", priority = 64)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingInvalidSignatureOnAuthenticationResponseOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(3000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(S) Invalid Signature on Authentication Response");
//                DataHelperAndWait.waitForTime(3500);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting MPI Processing Error Option from Geidea Payment Gate Screen", priority = 65)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingMPIProcessingErrorOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(3000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(I) MPI Processing Error");
//        DataHelperAndWait.waitForTime(3500);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Authentication Attempted (No CAVV) Option from Geidea Payment Gate Screen", priority = 66)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingNoCAVVOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(3000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(M) Authentication Attempted (No CAVV)");
//                DataHelperAndWait.waitForTime(3500);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(enabled = false,groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the order total appears in the Geidea payment Gateway is matched with the original order Total ", priority = 59)
    public void verifyTheOrderTotalAppearsInGeideaGateWayIsMatchedWithOriginalOrderTotal() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        String sporterTotal;
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        sporterTotal=DataHelperAndWait.extractDigitsFromString(egypt.getGrandTotalValue(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
        DataHelperAndWait.waitToBeVisible(egypt.getGeideaPopUpFrame(), webDriver);
        webDriver.switchTo().frame(1);
        DataHelperAndWait.waitToBeVisible(egypt.getDebitCreditCardOption(), webDriver);
        DataHelperAndWait.clickOnElement(egypt.getDebitCreditCardOption(), webDriver);
        DataHelperAndWait.clickOnElement(egypt.getNextButtonInGediaaPopUp(), webDriver);
        DataHelperAndWait.waitToBeVisible(egypt.getPayBtn(),webDriver);
        String totalGeidea=DataHelperAndWait.extractDigitsFromString(egypt.getPayBtn(),webDriver);
        Assert.assertEquals(totalGeidea,sporterTotal);
    }
    @Test(enabled = false,groups = {  "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the order is not placed correctly when there's interruption occurring in the Geidea Payment GateWay ", priority = 68)
    public void verifyTheOrderIsNotPlacedWhenMakeInterputionDuringCheckoutOrderUsingGeidea() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.accessGuestCheckoutForm();
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
        DataHelperAndWait.waitToBeVisible(egypt.getGeideaPopUpFrame(), webDriver);
        webDriver.switchTo().frame(1);
        DataHelperAndWait.waitToBeVisible(egypt.getDebitCreditCardOption(), webDriver);
        DataHelperAndWait.clickOnElement(egypt.getDebitCreditCardOption(), webDriver);
        DataHelperAndWait.clickOnElement(egypt.getNextButtonInGediaaPopUp(), webDriver);
        DataHelperAndWait.waitToBeVisible(egypt.getPayBtn(),webDriver);
        webDriver.navigate().refresh();
        WebElementsAssertion.validateTheCurrentUrlContainsString("checkout",webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully Using Geidea when using Arabic Version ", priority = 69)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDayDeliveryShippingMethodWithCreditCardPaymentMethodInArabicVersion() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        try {
            egypt.accessGuestCheckoutForm();
        }
        catch (Exception e){
            egypt.accessGuestCheckoutForm();

        }
        DataHelperAndWait.waitForTime(1000);
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);

    }
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Next Day Delivery Shipping Method With Credit Card Payment Method when using the coupon code", priority = 70)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDayDeliveryShippingMethodWithCreditCardPaymentMethodUsingCouponCode() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
        cartPage.proceedToCheckout();
        DataHelperAndWait.clickOnElement(egypt.getCheckoutAsGuestBtn(),webDriver);
        egypt.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        egypt.submitCreditCardCorrectly();
        DataHelperAndWait.waitForTime(3000);
        webDriver.switchTo().frame(1);
        DataHelperAndWait.waitToBeVisible(egypt.getGoToMerchentWebSite(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getSuccessPage(),webDriver);
    }

}

