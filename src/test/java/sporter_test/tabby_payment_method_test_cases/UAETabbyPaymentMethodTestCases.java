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
import sporter_pages.checkoutForRegisteredUserTPage.CheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.UAEHomePage;
import sporter_pages.loginPage.LoginPage;
import sporter_pages.tabby_payment_method_pages.TabbyPaymentPage;
import xml_reader.XmlReader;
import java.time.LocalTime;

public class UAETabbyPaymentMethodTestCases extends TabbyPaymentMethodTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToUAEStore() {
        UAEHomePage uaeHomePage = new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if (webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)) {
            System.out.println("You are in UAE Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + uaeHomePage.aeDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
        storeCountry = "United Arab Emirates";
        countryCode = "971";
    }
    //Guest User
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: GuestUser- Make sure that the tabby Payment method appear correctly", priority = 1)
    public void verifyTabbyPaymentMethodMethodCorrectlyForGuestUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        tabbyPaymentPage.accessGuestCheckoutForm();
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
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With tabby Payment Method ", priority = 2)
    public void zverifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTabbyPaymentMethodForGuestUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        tabbyPaymentPage.accessGuestCheckoutForm();
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
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:GuestUser- Make sure inability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With tabby Payment Method using Negative Flow ", priority = 3)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTabbyPaymentMethodWithNegativeFlowForGuestUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        webDriver.manage().deleteCookieNamed("guestCartId");
        tabbyPaymentPage.accessGuestCheckoutForm();
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
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
        tabbyPaymentPage.submitTabbyInfoWithNegativeFlow();
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:GuestUser- Make sure the Installments Amounts In Tabby Page Are Matched With The Grand Total", priority = 4)
    public void verifyInstallmentsAmountsInTabbyPageAreMatchedWithTheGrandTotalForGuestUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        tabbyPaymentPage.accessGuestCheckoutForm();
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
        double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,"AED");
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyHeaderTitle(),webDriver);
        double InstallmentsAmountsTotal=tabbyPaymentPage.calculateInstallmentsAmount("AED");
        System.out.println("GrandTotal"+GrandTotal);
        System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
        Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:GuestUser- Make sure Ability to back to Sporter after clicking on the Return To store from Tabby Page", priority = 5)
    public void verifyAbilityToBackToSporterAfterClickingOnBackToStoreFromTabbyForGuestUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        tabbyPaymentPage.accessGuestCheckoutForm();
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
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyPage(),webDriver);
        tabbyPaymentPage.clickOnReturnToStore();
        WebElementsAssertion.validateTheElementIsDisplayed(tabbyPaymentPage.getTransactionFailedError(),webDriver);

    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting Same Day Express Shipping Method With tabby Payment Method ", priority = 6)
    public void verifyAbilityToPlaceOrderWhenSelectingSameDayShippingMethodWithTabbyPaymentMethodForGuestUser() throws Exception, InterruptedException {
// Get the current time
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTimeAM = LocalTime.of(2, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM))
        {
        // Set the target time to 2:00 PM
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        // Set the target times to 2:00 AM and 2:00 PM

            System.out.println(currentTime);
            System.out.println("Current time is before 2:00 PM");
            tabbyPaymentPage.accessGuestCheckoutForm();
        webDriver.manage().deleteCookieNamed("guestCartId");
        tabbyPaymentPage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputFieldWithDubai(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        }
        else{
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:GuestUser- Make sure inability to place Order successfully when selecting Same Day Express Shipping Method With tabby Payment Method using Negative Flow ", priority = 7)
    public void verifyAbilityToPlaceOrderWhenSelectingSameDayShippingMethodWithTabbyPaymentMethodWithNegativeFlowForGuestUser() throws Exception {
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTimeAM = LocalTime.of(2, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM)){
        // Set the target time to 2:00 PM
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        // Set the target times to 2:00 AM and 2:00 PM

            System.out.println(currentTime);
            System.out.println("Current time is before 2:00 PM");
            tabbyPaymentPage.accessGuestCheckoutForm();
            webDriver.manage().deleteCookieNamed("guestCartId");
            tabbyPaymentPage.accessGuestCheckoutForm();
            guestCheckoutCyclePage.fillInShippingInformationInputFieldWithDubai(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("correctEmail"),
                    XmlReader.getXMLData("phoneNumber"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"));
            DataHelperAndWait.waitForTime(2000);
            guestCheckoutCyclePage.clickOnContinueBtn();
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
            tabbyPaymentPage.SelectTabbyInstallmentsMethod();
            guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
            tabbyPaymentPage.submitTabbyInfoWithNegativeFlow();
        }
        else{
            System.out.println("Current time is after or equal to 2:00 PM");
        }

    }
    //TODO: Add custom annotation To Pass Test Case ID
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:GuestUser- Make sure the system display the Quote ID for the user after checkout the order with Selecting 2Business Days Super Express Shipping Method using tabby payment", priority = 8)
    public void verifyTheSystemDisplayTheQuoteIdForTheUserAfterCheckoutTheOrderWithSelecting2BusinessDaysSuperExpressShippingMethodForGuestUser() throws Exception, InterruptedException {
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTimeAM = LocalTime.of(2, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM))
        {
        // Set the target time to 2:00 PM
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        // Set the target times to 2:00 AM and 2:00 PM

                System.out.println(currentTime);
                System.out.println("Current time is before 2:00 PM");
                tabbyPaymentPage.accessGuestCheckoutForm();
                webDriver.manage().deleteCookieNamed("guestCartId");
                tabbyPaymentPage.accessGuestCheckoutForm();
                guestCheckoutCyclePage.fillInShippingInformationInputFieldWithDubai(
                        XmlReader.getXMLData("firstName"),
                        XmlReader.getXMLData("lastName"),
                        XmlReader.getXMLData("correctEmail"),
                        XmlReader.getXMLData("phoneNumber"),
                        XmlReader.getXMLData("StreetOneAddressName"),
                        XmlReader.getXMLData("StreetTwoAddressName"));
                DataHelperAndWait.waitForTime(2000);
                guestCheckoutCyclePage.clickOnContinueBtn();
                DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
                DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
                tabbyPaymentPage.SelectTabbyInstallmentsMethod();
                guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
                tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
                tabbyPaymentPage.fillInTheCardInfo();
                cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
                String orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
                System.out.println(orderNumber);
                cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
            }
        else{
                System.out.println("Current time is after or equal to 2:00 PM");
            }
        }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:GuestUser- Make sure the Installments Amounts In Tabby Page Are Matched With The Grand Total For Same Day Shipping Method", priority = 9)
    public void verifyInstallmentsAmountsInTabbyPageAreMatchedWithTheGrandTotalForSameDayShippingMethodForGuestUser() throws Exception, InterruptedException {
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTimeAM = LocalTime.of(2, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM))
        {
        // Set the target time to 2:00 PM
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        // Set the target times to 2:00 AM and 2:00 PM

            System.out.println(currentTime);
            System.out.println("Current time is before 2:00 PM");
            tabbyPaymentPage.accessGuestCheckoutForm();
            webDriver.manage().deleteCookieNamed("guestCartId");
            tabbyPaymentPage.accessGuestCheckoutForm();
            guestCheckoutCyclePage.fillInShippingInformationInputFieldWithDubai(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("correctEmail"),
                    XmlReader.getXMLData("phoneNumber"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"));
            DataHelperAndWait.waitForTime(2000);
            guestCheckoutCyclePage.clickOnContinueBtn();
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
            tabbyPaymentPage.SelectTabbyInstallmentsMethod();
            guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
            double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,"AED");
            guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
            DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyHeaderTitle(),webDriver);
            double InstallmentsAmountsTotal=tabbyPaymentPage.calculateInstallmentsAmount("AED");
            System.out.println("GrandTotal"+GrandTotal);
            System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
            Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
        }
        else{
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability  to place Order for the second time After clicking on Back from Bowser in the Tabby page ", priority = 10)
    public void verifyAbilityToPlaceOrderForSecondTimeAfterClickingOnBackBtnInBrowserFromTabbyPage() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        webDriver.manage().deleteCookieNamed("uid");
        tabbyPaymentPage.accessGuestCheckoutForm();
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
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
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
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    // Registered User
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Ability to login correctly from Sign In Page using valid credential", priority = 11)
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
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: RegisteredUser- Make sure that the tabby Payment method appear correctly", priority = 12)
    public void verifyTabbyPaymentMethodMethodCorrectlyForRegisteredUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(tabbyPaymentPage.getTabbyInstallmentsPaymentMethod(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With tabby Payment Method ", priority = 13)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTabbyPaymentMethodForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure inability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With tabby Payment Method using Negative Flow ", priority = 14)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTabbyPaymentMethodWithNegativeFlowForRegisteredUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
        tabbyPaymentPage.submitTabbyInfoWithNegativeFlow();
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure the Installments Amounts In Tabby Page Are Matched With The Grand Total", priority = 15)
    public void verifyInstallmentsAmountsInTabbyPageAreMatchedWithTheGrandTotalForRegisteredUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,"AED");
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyHeaderTitle(),webDriver);
        double InstallmentsAmountsTotal=tabbyPaymentPage.calculateInstallmentsAmount("AED");
        System.out.println("GrandTotal"+GrandTotal);
        System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
        Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure Ability to back to Sporter after clicking on the Return To store from Tabby Page", priority = 16)
    public void verifyAbilityToBackToSporterAfterClickingOnBackToStoreFromTabbyForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyPage(),webDriver);
        tabbyPaymentPage.clickOnReturnToStore();
        WebElementsAssertion.validateTheElementIsDisplayed(tabbyPaymentPage.getTransactionFailedError(),webDriver);

    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when selecting Same Day Express Shipping Method With tabby Payment Method ", priority = 17)
    public void verifyAbilityToPlaceOrderWhenSelectingSameDayShippingMethodWithTabbyPaymentMethodForRegisteredUser() throws Exception, InterruptedException {
// Get the current time
        LocalTime currentTime = LocalTime.now();

        // Set the target time to 2:00 PM
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        // Set the target times to 2:00 AM and 2:00 PM
        LocalTime targetTimeAM = LocalTime.of(2, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM))
        {
            System.out.println(currentTime);
            System.out.println("Current time is before 2:00 PM");
            CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
            registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddressForDubai();
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
            tabbyPaymentPage.SelectTabbyInstallmentsMethod();
            guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
            tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
            tabbyPaymentPage.fillInTheCardInfo();
            cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        }
        else{
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure inability to place Order successfully when selecting Same Day Express Shipping Method With tabby Payment Method using Negative Flow ", priority = 18)
    public void verifyAbilityToPlaceOrderWhenSelectingSameDayShippingMethodWithTabbyPaymentMethodWithNegativeFlowForRegisteredUser() throws Exception {
        LocalTime currentTime = LocalTime.now();
        // Set the target time to 2:00 PM
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        // Set the target times to 2:00 AM and 2:00 PM
        LocalTime targetTimeAM = LocalTime.of(2, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM)){
            System.out.println(currentTime);
            System.out.println("Current time is before 2:00 PM");
            CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
            registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddressForDubai();
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
            tabbyPaymentPage.SelectTabbyInstallmentsMethod();
            guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
            tabbyPaymentPage.submitTabbyInfoWithNegativeFlow();
        }
        else{
            System.out.println("Current time is after or equal to 2:00 PM");
        }

    }
    //TODO: Add custom annotation To Pass Test Case ID
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure the system display the Quote ID for the user after checkout the order with Selecting 2Business Days Super Express Shipping Method using tabby payment", priority = 19)
    public void verifyTheSystemDisplayTheQuoteIdForTheUserAfterCheckoutTheOrderWithSelecting2BusinessDaysSuperExpressShippingMethodForRegisteredUser() throws Exception, InterruptedException {
        LocalTime currentTime = LocalTime.now();
        // Set the target time to 2:00 PM
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        // Set the target times to 2:00 AM and 2:00 PM
        LocalTime targetTimeAM = LocalTime.of(2, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM))
        {
            System.out.println(currentTime);
            System.out.println("Current time is before 2:00 PM");
            CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
            registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddressForDubai();
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
            tabbyPaymentPage.SelectTabbyInstallmentsMethod();
            guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
            tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
            tabbyPaymentPage.fillInTheCardInfo();
            cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
            String orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
            System.out.println(orderNumber);
            cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        }
        else{
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure the Installments Amounts In Tabby Page Are Matched With The Grand Total For Same Day Shipping Method", priority = 20)
    public void verifyInstallmentsAmountsInTabbyPageAreMatchedWithTheGrandTotalForSameDayShippingMethodForRegisteredUser() throws Exception, InterruptedException {
        LocalTime currentTime = LocalTime.now();
        // Set the target time to 2:00 PM
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        // Set the target times to 2:00 AM and 2:00 PM
        LocalTime targetTimeAM = LocalTime.of(2, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM))
        {
            System.out.println(currentTime);
            System.out.println("Current time is before 2:00 PM");
            CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
            registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddressForDubai();
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
            tabbyPaymentPage.SelectTabbyInstallmentsMethod();
            guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
            double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,"AED");
            guestCheckoutCyclePage.clickOnPlaceOrderBtn(true);
            DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyHeaderTitle(),webDriver);
            double InstallmentsAmountsTotal=tabbyPaymentPage.calculateInstallmentsAmount("AED");
            System.out.println("GrandTotal"+GrandTotal);
            System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
            Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
        }
        else{
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }

}
