/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.tamara_payment_method_test_cases;

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
import sporter_pages.tamara_payment_method_pages.TamaraPaymentPage;
import xml_reader.XmlReader;

import java.time.LocalTime;

public class UAETamaraPaymentMethodTestCases extends TamaraPaymentMethodTestCases {
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
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: GuestUser- Make sure that the Tamara Payment method appear correctly", priority = 1)
    public void verifyTamaraPaymentMethodMethodCorrectlyForGuestUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        tamaraPaymentPage.displayProductAndAddToCart();
        tamaraPaymentPage.accessShippingFormForGuestViaURL();
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
        WebElementsAssertion.validateTheElementIsDisplayed(tamaraPaymentPage.getTamaraInstallmentsPaymentMethod(), webDriver);
    }
        @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure the Installments Amounts In Tamara Page Are Matched With The Grand Total In Case 2Business Days Super Express Shipping Method", priority = 2)
    public void verifyInstallmentsAmountsInTamaraPageAreMatchedWithTheGrandTotalForGuestUserInCase2BusinessDaysSuperExpressShippingMethod() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
            webDriver.manage().deleteCookieNamed("guestCartId");
            tamaraPaymentPage.displayProductAndAddToCart();
            tamaraPaymentPage.accessShippingFormForGuestViaURL();
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
            WebElementsAssertion.validateTheElementIsDisplayed(tamaraPaymentPage.getTamaraInstallmentsPaymentMethod(), webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver);
        DataHelperAndWait.scrollTo(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver);
        double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,"AED");
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        DataHelperAndWait.waitToBeVisible(tamaraPaymentPage.getTamaraHeaderInPaymentSchedulePage(),webDriver);
        double InstallmentsAmountsTotal=tamaraPaymentPage.calculateInstallmentsAmount("د.إ");
        System.out.println("GrandTotal"+GrandTotal);
        System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
        Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With Tamara Payment Method a defined Using 3DSCard ", priority = 3)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTamaraPaymentMethodUsing3DSCardForGuestUser() throws Exception, InterruptedException {
        TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboard();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(0);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With Tamara Payment Method Using a defined Master Card ", priority = 4)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTamaraPaymentMethodUsingMasterCardForGuestUser() throws Exception, InterruptedException {
        TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboard();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(1);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With Tamara Payment Method Using a defined Decline Transaction Card ", priority = 5)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTamaraPaymentMethodUsingDeclineTransactionCardForGuestUser() throws Exception, InterruptedException {
        TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboard();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(2);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With Tamara Payment Method Using a defined Prepaid Card ", priority = 6)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTamaraPaymentMethodUsingPrepaidCardForGuestUser() throws Exception, InterruptedException {
        TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboard();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(3);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting Same Day Shipping Method With Tamara Payment Method a defined Using 3DSCard ", priority = 7)
    public void verifyAbilityToPlaceOrderWhenSelectingSameDayShippingMethodWithTamaraPaymentMethodUsing3DSCardForGuestUser() throws Exception, InterruptedException {
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTimeAM = LocalTime.of(12, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM)) {
            TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
            tamaraPaymentPage.addToCartAndAccessTamaraDashboardForSameDayShipping();
            tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(0);
            GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
            guestCheckoutCyclePage.IsQouteIDisDisplayed();
        }
        else {
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting Same Day Shipping Method With Tamara Payment Method Using a defined Master Card ", priority = 8)
    public void verifyAbilityToPlaceOrderWhenSelectingSameDayShippingMethodWithTamaraPaymentMethodUsingMasterCardForGuestUser() throws Exception, InterruptedException {
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTimeAM = LocalTime.of(12, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM)) {
            TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
            tamaraPaymentPage.addToCartAndAccessTamaraDashboardForSameDayShipping();
            tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(1);
            GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
            guestCheckoutCyclePage.IsQouteIDisDisplayed();
        }
        else {
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting SameDay Shipping Method With Tamara Payment Method Using a defined Decline Transaction Card ", priority = 9)
    public void verifyAbilityToPlaceOrderWhenSelectingSameDayShippingMethodWithTamaraPaymentMethodUsingDeclineTransactionCardForGuestUser() throws Exception, InterruptedException {
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTimeAM = LocalTime.of(12, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM)) {
            TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
            tamaraPaymentPage.addToCartAndAccessTamaraDashboardForSameDayShipping();
            tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(2);
            GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
            guestCheckoutCyclePage.IsQouteIDisDisplayed();
        }
        else {
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting SameDay Shipping Method With Tamara Payment Method Using a defined Prepaid Card ", priority = 10)
    public void verifyAbilityToPlaceOrderWhenSelectingSameDayShippingMethodWithTamaraPaymentMethodUsingPrepaidCardForGuestUser() throws Exception, InterruptedException {
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTimeAM = LocalTime.of(12, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM)) {
            TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
            tamaraPaymentPage.addToCartAndAccessTamaraDashboardForSameDayShipping();
            tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(3);
            GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
            guestCheckoutCyclePage.IsQouteIDisDisplayed();
        }
        else {
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure the Installments Amounts In Tamara Page Are Matched With The Grand Total In Case Same Day Shipping Method", priority = 11)
    public void verifyInstallmentsAmountsInTamaraPageAreMatchedWithTheGrandTotalForGuestUserInCaseSameDayShippingMethod() throws Exception {
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTimeAM = LocalTime.of(12, 0);
        LocalTime targetTimePM = LocalTime.of(12, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM)) {
            GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
            TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
            webDriver.manage().deleteCookieNamed("guestCartId");
            tamaraPaymentPage.displayProductAndAddToCart();
            tamaraPaymentPage.accessShippingFormForGuestViaURL();
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
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(tamaraPaymentPage.getTamaraInstallmentsPaymentMethod(), webDriver);
            tamaraPaymentPage.SelectTamaraInstallmentsMethod();
            DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(), webDriver);
            DataHelperAndWait.scrollTo(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(), webDriver);
            DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(), webDriver);
            double GrandTotal = DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(), webDriver, "AED");
            tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
            tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
            DataHelperAndWait.waitToBeVisible(tamaraPaymentPage.getTamaraHeaderInPaymentSchedulePage(), webDriver);
            double InstallmentsAmountsTotal = tamaraPaymentPage.calculateInstallmentsAmount("د.إ");
            System.out.println("GrandTotal" + GrandTotal);
            System.out.println("InstallmentsAmountsTotal" + InstallmentsAmountsTotal);
            Assert.assertEquals(GrandTotal, InstallmentsAmountsTotal);
        }
        else {
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Ability to login correctly from Sign In Page using valid credential", priority = 12)
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
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: RegisteredUser- Make sure that the Tamara Payment method appear correctly For Registered User", priority = 13)
    public void verifyTamaraPaymentMethodMethodCorrectlyForRegisteredUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPageForRegistered(XmlReader.getXMLData("UAEPhoneNumber"));
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(tamaraPaymentPage.getTamaraInstallmentsPaymentMethod(),webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With Tamara Payment Method Using 3DS Card ", priority = 14)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithTamaraPaymentMethodUsing3DSCardForForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPageForRegistered(XmlReader.getXMLData("UAEPhoneNumber"));
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(0);
guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }


    //********************************************************************************************************


//    // Registered User



//
//
//    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure the Installments Amounts In Tamara Page Are Matched With The Grand Total", priority = 15)
//    public void verifyInstallmentsAmountsInTamaraPageAreMatchedWithTheGrandTotalForRegisteredUser() throws Exception {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
//        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
//        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
//        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPage(XmlReader.getXMLData("UAEPhoneNumber"));
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
//        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
//        double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,"AED");
//        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
//        DataHelperAndWait.waitToBeVisible(tamaraPaymentPage.getTamaraHeaderInPaymentSchedulePage(),webDriver);
//        double InstallmentsAmountsTotal=tamaraPaymentPage.calculateInstallmentsAmount("د.إ");
//        System.out.println("GrandTotal"+GrandTotal);
//        System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
//        Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
//    }
//
//    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when selecting Same Day Express Shipping Method With Tamara Payment Method ", priority = 17)
//    public void verifyAbilityToPlaceOrderWhenSelectingSameDayShippingMethodWithTamaraPaymentMethodForRegisteredUser() throws Exception, InterruptedException {
//// Get the current time
//        LocalTime currentTime = LocalTime.now();
//
//        // Set the target time to 2:00 PM
//        LocalTime targetTime = LocalTime.of(12, 0);
//        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
//        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
//        CartPage cartPage= new CartPage(webDriver);
//        // Set the target times to 2:00 AM and 2:00 PM
//        LocalTime targetTimeAM = LocalTime.of(2, 0);
//        LocalTime targetTimePM = LocalTime.of(12, 0);
//        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM))
//        {
//            System.out.println(currentTime);
//            System.out.println("Current time is before 2:00 PM");
//            CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
//            registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddressForDubai();
//            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
//            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
//            tamaraPaymentPage.SelectTamaraInstallmentsMethod();
//            tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
//            tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
//            tamaraPaymentPage.fillInTheCardInfo();
//            cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        }
//        else{
//            System.out.println("Current time is after or equal to 2:00 PM");
//        }
//    }
//
//    //TODO: Add custom annotation To Pass Test Case ID
//    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure the system display the Quote ID for the user after checkout the order with Selecting 2Business Days Super Express Shipping Method using Tamara Payment", priority = 19)
//    public void verifyTheSystemDisplayTheQuoteIdForTheUserAfterCheckoutTheOrderWithSelecting2BusinessDaysSuperExpressShippingMethodForRegisteredUser() throws Exception, InterruptedException {
//        LocalTime currentTime = LocalTime.now();
//        // Set the target time to 2:00 PM
//        LocalTime targetTime = LocalTime.of(12, 0);
//        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
//        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
//        CartPage cartPage= new CartPage(webDriver);
//        // Set the target times to 2:00 AM and 2:00 PM
//        LocalTime targetTimeAM = LocalTime.of(2, 0);
//        LocalTime targetTimePM = LocalTime.of(12, 0);
//        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM))
//        {
//            System.out.println(currentTime);
//            System.out.println("Current time is before 2:00 PM");
//            CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
//            registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddressForDubai();
//            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
//            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
//            tamaraPaymentPage.SelectTamaraInstallmentsMethod();
//            tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
//            tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
//            tamaraPaymentPage.fillInTheCardInfo();
//            cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
//            String orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//            System.out.println(orderNumber);
//            cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        }
//        else{
//            System.out.println("Current time is after or equal to 2:00 PM");
//        }
//    }
//
//    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure the Installments Amounts In Tamara Page Are Matched With The Grand Total For Same Day Shipping Method", priority = 20)
//    public void verifyInstallmentsAmountsInTamaraPageAreMatchedWithTheGrandTotalForSameDayShippingMethodForRegisteredUser() throws Exception, InterruptedException {
//        LocalTime currentTime = LocalTime.now();
//        // Set the target time to 2:00 PM
//        LocalTime targetTime = LocalTime.of(12, 0);
//        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
//        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
//        CartPage cartPage= new CartPage(webDriver);
//        // Set the target times to 2:00 AM and 2:00 PM
//        LocalTime targetTimeAM = LocalTime.of(2, 0);
//        LocalTime targetTimePM = LocalTime.of(12, 0);
//        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM))
//        {
//            System.out.println(currentTime);
//            System.out.println("Current time is before 2:00 PM");
//            CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
//            registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddressForDubai();
//            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
//            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
//            tamaraPaymentPage.SelectTamaraInstallmentsMethod();
//            tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
//            double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,"AED");
//            tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
//            DataHelperAndWait.waitToBeVisible(tamaraPaymentPage.getTamaraHeaderInPaymentSchedulePage(),webDriver);
//            double InstallmentsAmountsTotal=tamaraPaymentPage.calculateInstallmentsAmount("د.إ");
//            System.out.println("GrandTotal"+GrandTotal);
//            System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
//            Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
//        }
//        else{
//            System.out.println("Current time is after or equal to 2:00 PM");
//        }
//    }

}
