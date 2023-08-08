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
import sporter_pages.guestCheckoutCyclePages.KSAGuestCheckoutCyclePage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.loginPage.LoginPage;
import sporter_pages.tabby_payment_method_pages.TabbyPaymentPage;
import xml_reader.XmlReader;

import java.io.IOException;

public class KSATabbyPaymentMethodTestCases extends TabbyPaymentMethodTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        HeaderSection headerSection = new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if (webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            System.out.println("You are in KSA Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
            //CloseInitialDialog();
        }
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        catch (Exception e){
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        System.out.println(webDriver.getCurrentUrl());
        storeCountry = "المملكة العربية السعودية";
        countryCode = "966";
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: GuestUser- Make sure that the tabby Payment method appear correctly", priority = 1)
    public void verifyTabbyPaymentMethodMethodCorrectlyForGuestUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(tabbyPaymentPage.getTabbyInstallmentsPaymentMethod(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when Selecting Door To Door Shipping Method With tabby Payment Method ", priority = 2)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTabbyPaymentMethodForGuestUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure inability to place Order successfully when Selecting Door To Door Shipping Method With tabby Payment Method using Negative Flow ", priority = 3)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTabbyPaymentMethodWithNegativeFlowForGuestUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitTabbyInfoWithNegativeFlow();
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure the Installments Amounts In Tabby Page Are Matched With The Grand Total In Case Door To Door Shipping Method", priority = 4)
    public void verifyInstallmentsAmountsInTabbyPageAreMatchedWithTheGrandTotalForGuestUserInCaseDoorToDoorShippingMethod() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,"SAR");
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyHeaderTitle(),webDriver);
        double InstallmentsAmountsTotal=tabbyPaymentPage.calculateInstallmentsAmount("SAR");
        System.out.println("GrandTotal"+GrandTotal);
        System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
        Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:GuestUser- Make sure Ability to back to Sporter after clicking on the Return To store from Tabby Page", priority = 5)
    public void verifyAbilityToBackToSporterAfterClickingOnBackToStoreFromTabbyForGuestUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyPage(),webDriver);
        tabbyPaymentPage.clickOnReturnToStore();
        WebElementsAssertion.validateTheElementIsDisplayed(tabbyPaymentPage.getTransactionFailedError(),webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when Selecting PickUpInStore Shipping Method With tabby Payment Method ", priority = 6)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithTabbyPaymentMethodForGuestUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure inability to place Order successfully when Selecting PickUpInStore Shipping Method With tabby Payment Method using Negative Flow ", priority = 7)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithTabbyPaymentMethodWithNegativeFlowForGuestUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitTabbyInfoWithNegativeFlow();
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure the Installments Amounts In Tabby Page Are Matched With The Grand Total In Case PickUpInStore Shipping Method", priority = 8)
    public void verifyInstallmentsAmountsInTabbyPageAreMatchedWithTheGrandTotalForGuestUserInCasePickUpInStoreShippingMethod() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,"SAR");
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyHeaderTitle(),webDriver);
        double InstallmentsAmountsTotal=tabbyPaymentPage.calculateInstallmentsAmount("SAR");
        System.out.println("GrandTotal"+GrandTotal);
        System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
        Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
    }





    // Registered User

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Ability to login correctly from Sign In Page using valid credential", priority = 9)
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

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when Selecting Door To Door Shipping Method With tabby Payment Method ", priority = 10)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTabbyPaymentMethodForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure inability to place Order successfully when Selecting Door To Door Shipping Method With tabby Payment Method using Negative Flow ", priority = 11)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTabbyPaymentMethodWithNegativeFlowForRegisteredUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitTabbyInfoWithNegativeFlow();
    }


    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure Ability to back to Sporter after clicking on the Return To store from Tabby Page", priority = 12)
    public void verifyAbilityToBackToSporterAfterClickingOnBackToStoreFromTabbyForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        DataHelperAndWait.waitToBeVisible(tabbyPaymentPage.getTabbyPage(),webDriver);
        tabbyPaymentPage.clickOnReturnToStore();
        WebElementsAssertion.validateTheElementIsDisplayed(tabbyPaymentPage.getTransactionFailedError(),webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when Selecting PickUpInStore Shipping Method With tabby Payment Method ", priority = 13)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithTabbyPaymentMethodForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tabbyPaymentPage.fillInTheCardInfo();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure inability to place Order successfully when Selecting PickUpInStore Shipping Method With tabby Payment Method using Negative Flow ", priority = 14)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithTabbyPaymentMethodWithNegativeFlowForRegisteredUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TabbyPaymentPage tabbyPaymentPage= new TabbyPaymentPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tabbyPaymentPage.SelectTabbyInstallmentsMethod();
        tabbyPaymentPage.clickOnFinalPlaceOrderBtn();
        tabbyPaymentPage.submitTabbyInfoWithNegativeFlow();
    }



}
