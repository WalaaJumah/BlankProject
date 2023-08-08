/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.tabby_payment_method_test_cases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.JordanGuestCheckoutCyclePage;
import sporter_pages.loginPage.LoginPage;
import sporter_pages.myAccountPages.MyAccountPage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_pages.tabby_payment_method_pages.TabbyPaymentPage;
import xml_reader.XmlReader;

import java.io.IOException;

@Test(groups = "2.19 Tabby Payment Method")

public class TabbyPaymentMethodTestCases extends BaseTest {
    String storeCountry;
    String countryCode;

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: GuestUser- Make sure that the tabby Payment method appear correctly", priority = 1)
    public void verifyTabbyPaymentMethodMethodCorrectlyForGuestUser() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(tabbyPaymentPage.getTabbyInstallmentsPaymentMethod(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With tabby Payment Method ", priority = 2)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTabbyPaymentMethodForGuestUser() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:GuestUser- Make sure inability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With tabby Payment Method using Negative Flow ", priority = 3)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTabbyPaymentMethodWithNegativeFlowForGuestUser() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        tabbyPaymentPage.submitTabbyInfoWithNegativeFlow();
    }
//TODO: Add custom annotation To Pass Test Case ID
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure the system display the Quote ID for the user after checkout the order using tabby payment", priority = 4)
    public void verifyTheSystemDisplayTheQuoteIdForTheUserAfterCheckoutTheOrderForGuestUser() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        DataHelperAndWait.waitForTime(7000);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        String orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println(orderNumber);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure the Installments Amounts In Tabby Page Are Matched With The Grand Total", priority = 5)
    public void verifyInstallmentsAmountsInTabbyPageAreMatchedWithTheGrandTotalForGuestUser() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(tabbyPaymentPage.getOrderAmountInTabbyPage(),webDriver,"AED");
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyHeaderTitle(),webDriver);
        double InstallmentsAmountsTotal=tabbyPaymentPage.calculateInstallmentsAmount("AED");
        System.out.println("GrandTotal"+GrandTotal);
        System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
        Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure Ability to checkout order again after clicking on the Return To store from Tabby Page", priority = 6)
    public void verifyAbilityToCheckOutAgainAfterClickingOnBackToStoreFromTabbyForGuestUser() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyPage(),webDriver);
        tabbyPaymentPage.clickOnReturnToStore();
        cartPage.proceedToCheckout();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCheckoutAsGuestBtn(), webDriver);
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();

    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:GuestUser-Make sure the system display the Quote ID for the user after checkout the order with Tabby ", priority = 7)
    public void verifyTheSystemDisplayTheQuoteIdForTheUserAfterCheckoutUsingTabbyForGuestUser() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        String orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println(orderNumber);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
}






