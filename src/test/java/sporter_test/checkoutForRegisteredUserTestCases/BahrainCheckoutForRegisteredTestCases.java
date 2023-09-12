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
import sporter_pages.myAccountPages.BahrainMyAccountPage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.text.DecimalFormat;

public class BahrainCheckoutForRegisteredTestCases extends CheckoutForRegisteredTestCases{
    @BeforeClass(alwaysRun = true)
    public void switchToBahrainStore() {
        BahrainMyAccountPage bahrainMyAccountPage = new BahrainMyAccountPage(webDriver);
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(bahrainMyAccountPage.getBahrainCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.bahrainDomain)) {
            System.out.println("You are in Bahrain Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.bahrainDomain);
            //CloseInitialDialog();
        }
        storeCountry = "Bahrain";
        countryCode = "973";
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
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"BHD");
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"BHD");
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,"BHD");
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
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getContinueShippingInfoBtn(),webDriver);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.waitToBeVisible(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        WebElementsAssertion.assertionWebElementEqualText(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver, XmlReader.getXMLData("ThreeBusinessDaysShipping"));
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Three Business Days Shipping Method With Valid Credit Card Payment Method", priority = 28)
    public void verifyAbilityToSelectTheThreeBusinessDayshippingMethodWithValidCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
        omanCheckoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.waitToBeVisible(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Three Business Days Shipping Method With Credit Card Payment Method ", priority = 503)
    public void verifyAbilityToPlaceOrderWhenSelectingThreeBusinessDaysWithCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addToCartAndDisplayTheCart();
            cartPage.proceedToCheckout();
        DataHelperAndWait.waitForUrlContains(guestCheckoutCyclePage.shippingInformationUrl,webDriver);
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
        DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.waitForTime(3000);
guestCheckoutCyclePage.clickOnPlaceOrderBtn();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 31)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
        omanCheckoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCloseCheckoutErr(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 25)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        OmanCheckoutForRegisteredPage omanCheckoutForRegisteredPage= new OmanCheckoutForRegisteredPage(webDriver);
        guestCheckoutCyclePage.navigateToCheckoutPage();
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
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getContinueShippingInfoBtn(),webDriver);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(omanCheckoutForRegisteredPage.getFiveToSevenBusinessDaysShippingMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
    }
}
