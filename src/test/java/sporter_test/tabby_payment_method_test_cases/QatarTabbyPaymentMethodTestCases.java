/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.tabby_payment_method_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.AccountRegistrationPage.AccountRegistrationPage;
import sporter_pages.cartPages.CartPage;
import sporter_pages.checkoutForRegisteredUserTPage.JordanCheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.QatarHomePage;
import sporter_pages.loginPage.LoginPage;
import sporter_pages.tabby_payment_method_pages.TabbyPaymentPage;
import xml_reader.XmlReader;

public class QatarTabbyPaymentMethodTestCases extends TabbyPaymentMethodTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToQatarStore() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchCountry(qatarHomePage.getQatarCountry());
        if (webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)) {
            System.out.println("You are in Qatar Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + qatarHomePage.qatarDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
        storeCountry = "Qatar";
        countryCode = "974";
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Ability to login correctly from Sign In Page using valid credential", priority = 1)
    public void verifyAbilityToLoginCorrectlyWithValidCredentials() throws Exception {
        HeaderSection header = new HeaderSection(webDriver);
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail2"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        DataHelperAndWait.waitForTime(2000);
        try {
            DataHelperAndWait.waitForTime(1500);
            DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
        }
        catch (Exception e){
            loginPage.navigateToHomePage();
            DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
        }
    }
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"}, description = "{{CountryName}}: RegisteredUser- Make sure that the tabby Payment method appear correctly", priority = 2)
    public void verifyTabbyPaymentMethodMethodCorrectlyForRegisteredUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        JordanCheckoutForRegisteredPage jo= new JordanCheckoutForRegisteredPage(webDriver);
        jo.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(tabbyPaymentPage.getTabbyInstallmentsPaymentMethod(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when Selecting 2_4 Business Days Super Express Shipping Method With tabby Payment Method ", priority = 3)
    public void verifyAbilityToPlaceOrderWhenWhenSelecting2_4BusinessDaysSuperExpressShippingMethodWithTabbyPaymentMethodForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        JordanCheckoutForRegisteredPage jo= new JordanCheckoutForRegisteredPage(webDriver);
        jo.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure inability to place Order successfully when Selecting 2_4 Business Days Super Express Shipping Method With tabby Payment Method using Negative Flow ", priority = 4)
    public void verifyAbilityToPlaceOrderWhenWhenSelecting2_4BusinessDaysSuperExpressShippingMethodWithTabbyPaymentMethodWithNegativeFlowForRegisteredUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        JordanCheckoutForRegisteredPage jo= new JordanCheckoutForRegisteredPage(webDriver);
        jo.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitTabbyInfoWithNegativeFlow();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure the Installments Amounts In Tabby Page Are Matched With The Grand Total", priority = 5)
    public void verifyInstallmentsAmountsInTabbyPageAreMatchedWithTheGrandTotalForRegisteredUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        JordanCheckoutForRegisteredPage jo= new JordanCheckoutForRegisteredPage(webDriver);
        jo.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,"QAR");
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyHeaderTitle(),webDriver);
        double InstallmentsAmountsTotal=tabbyPaymentPage.calculateInstallmentsAmount("QAR");
        System.out.println("GrandTotal"+GrandTotal);
        System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
        Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
    }

    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure Ability to back to Sporter after clicking on the Return To store from Tabby Page", priority = 6)
    public void verifyAbilityToBackToSporterAfterClickingOnBackToStoreFromTabbyForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        JordanCheckoutForRegisteredPage jo= new JordanCheckoutForRegisteredPage(webDriver);
        jo.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyPage(),webDriver);
        tabbyPaymentPage.clickOnReturnToStore();
        WebElementsAssertion.validateTheElementIsDisplayed(tabbyPaymentPage.getTransactionFailedError(),webDriver);

    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability  to place Order for the second time After clicking on Back from Bowser in the Tabby page ", priority = 7)
    public void verifyAbilityToPlaceOrderForSecondTimeAfterClickingOnBackBtnInBrowserFromTabbyPage() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        JordanCheckoutForRegisteredPage jo= new JordanCheckoutForRegisteredPage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        tabbyPaymentPage.accessGuestCheckoutForm();
        try {
            jo.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("qatarPhoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"),
                    XmlReader.getXMLData("nationalID"));
        }
        catch (Exception e){
            DataHelperAndWait.clickOnElement(jo.getSavedAddressOption(),webDriver);}
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyPage(),webDriver);
        webDriver.navigate().back();
        DataHelperAndWait.waitToBeVisible(cartPage.getProceedCheckoutBtn(),webDriver);
        try {
            cartPage.proceedToCheckout();
        } catch (Exception e) {
            cartPage.navigateToHomePage();
            cartPage.clickOnCartIcon();
            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
        }
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
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
