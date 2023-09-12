/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.checkoutForRegisteredUserTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.checkoutForRegisteredUserTPage.CheckoutForRegisteredPage;
import sporter_pages.checkoutForRegisteredUserTPage.OmanCheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.myAccountPages.OmanMyAccountPage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.text.DecimalFormat;

public class OmanCheckoutForRegisteredTestCases extends CheckoutForRegisteredTestCases{
    @BeforeClass(alwaysRun = true)
    public void switchToOmanStore() {
        OmanMyAccountPage omanMyAccountPage = new OmanMyAccountPage(webDriver);
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(omanMyAccountPage.getOmanCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.omanDomain)) {
            System.out.println("You are in Oman Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.omanDomain);
            //CloseInitialDialog();
        }
        storeCountry = "Oman";
        countryCode = "968";
    }
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() {}    @Test(enabled = false)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {}
    @Test(enabled = false)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {}
    @Test(enabled = false)
    public void verifyAbilityToSelect2BusinessDaysShippingMethodCorrectly() {}
    @Test(enabled = false)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() {}

    @Test(enabled = false,groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 9)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        DecimalFormat df = new DecimalFormat("0.00");
        cartPage.navigateToCartPage();
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"OMR");
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"OMR");
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,"OMR");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal));
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 23)
    public void verifyAllShippingMethodsAppearCorrectly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
//        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddressForDubaiCity();
        CartPage cartPage= new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
        try{
            DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getSavedAddressOption(),webDriver);
        }
        catch (Exception e){
            omanCheckoutForRegisteredPage.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("phoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"));
        }
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.waitToBeVisible(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        WebElementsAssertion.assertionWebElementEqualText(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver, XmlReader.getXMLData("FiveToSevenBusinessDaysShipping"));
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Five To Seven Business Days Shipping Method With COD Payment Method ", priority = 502)
    public void verifyAbilityToPlaceOrderWhenSelectingFiveToSevenBusinessDaysShippingMethodWithCODPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
        omanCheckoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        try {
            guestCheckoutCyclePage.clickOnPlaceOrderBtn();
        }
        catch (Exception e){
            guestCheckoutCyclePage.clickOnPlaceOrderBtn();
        }
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//       orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println("The order Number= "+orderNumber);
        //        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Five To Seven Business Days Shipping Method With Valid Credit Card Payment Method", priority = 28)
    public void verifyAbilityToSelectTheFiveToSevenBusinessDayshippingMethodWithValidCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
        omanCheckoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
//        try{
//            DataHelperAndWait.clickOnElement(registeredPage.getSavedAddressOption(),webDriver);
//        }
//        catch (Exception e){
//            registeredPage.fillInShippingInformationInputField(
//                    XmlReader.getXMLData("firstName"),
//                    XmlReader.getXMLData("lastName"),
//                    XmlReader.getXMLData("phoneNumber"),
//                    XmlReader.getXMLData("AddressName"),
//                    XmlReader.getXMLData("StreetOneAddressName"),
//                    XmlReader.getXMLData("StreetTwoAddressName")
//            );

//        DataHelperAndWait.clickOnElement(kuwaitCheckoutForRegisteredPage.getExpressDeliveryMethod(),webDriver);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Five To Seven Business Days Shipping Method With COD Payment Method correctly", priority = 29)
    public void verifyAbilityToSelectTheFiveToSevenBusinessDaysShippingMethodWithCODPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
        omanCheckoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Five To Seven Business Days Shipping Method With Credit Card Payment Method ", priority = 503)
    public void verifyAbilityToPlaceOrderWhenSelectingFiveToSevenBusinessDaysWithCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
        try {
            webDriver.manage().deleteCookieNamed("guestCartId");
            cartPage.addToCartAndDisplayTheCart();
//        cartPage.navigateToCartPage();
//        cartPage.navigateToHomePage();
//        cartPage.clickOnCartIcon();
//        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
            cartPage.proceedToCheckout();
            DataHelperAndWait.waitForUrlContains(guestCheckoutCyclePage.shippingInformationUrl, webDriver);
            try {
                DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getSavedAddressOption(), webDriver);
            } catch (Exception e) {
                omanCheckoutForRegisteredPage.fillInShippingInformationInputField(
                        XmlReader.getXMLData("firstName"),
                        XmlReader.getXMLData("lastName"),
                        XmlReader.getXMLData("phoneNumber"),
                        XmlReader.getXMLData("AddressName"),
                        XmlReader.getXMLData("StreetOneAddressName"),
                        XmlReader.getXMLData("StreetTwoAddressName"));
            }
            DataHelperAndWait.waitForTime(2000);
            guestCheckoutCyclePage.clickOnContinueBtn();
            DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
            guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"), XmlReader.getXMLData("creditCardDate"), XmlReader.getXMLData("testCVV"));
            DataHelperAndWait.waitForTime(2000);

            guestCheckoutCyclePage.clickOnPlaceOrderBtn();
            cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
        }
        catch (Exception ee){
            webDriver.manage().deleteCookieNamed("guestCartId");
            cartPage.addToCartAndDisplayTheCart();
//        cartPage.navigateToCartPage();
//        cartPage.navigateToHomePage();
//        cartPage.clickOnCartIcon();
//        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
            cartPage.proceedToCheckout();
            DataHelperAndWait.waitForUrlContains(guestCheckoutCyclePage.shippingInformationUrl, webDriver);
            try {
                DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getSavedAddressOption(), webDriver);
            } catch (Exception e) {
                omanCheckoutForRegisteredPage.fillInShippingInformationInputField(
                        XmlReader.getXMLData("firstName"),
                        XmlReader.getXMLData("lastName"),
                        XmlReader.getXMLData("phoneNumber"),
                        XmlReader.getXMLData("AddressName"),
                        XmlReader.getXMLData("StreetOneAddressName"),
                        XmlReader.getXMLData("StreetTwoAddressName"));
            }
            DataHelperAndWait.waitForTime(2000);
            guestCheckoutCyclePage.clickOnContinueBtn();
            DataHelperAndWait.waitForTime(2000);
            DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
            guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"), XmlReader.getXMLData("creditCardDate"), XmlReader.getXMLData("testCVV"));
            DataHelperAndWait.waitForTime(2000);

            guestCheckoutCyclePage.clickOnPlaceOrderBtn();
            cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
        }
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 31)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
//        cartPage.navigateToCartPage();
//        cartPage.removeItem();
        omanCheckoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCloseCheckoutErr(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 25)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
        guestCheckoutCyclePage.navigateToCheckoutPage();
        try{
            DataHelperAndWait.clickOnElement(registeredPage.getSavedAddressOption(),webDriver);
        }
        catch (Exception e){
            registeredPage.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("phoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"));
        }
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
    }
}
