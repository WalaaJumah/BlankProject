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
import sporter_pages.guestCheckoutCyclePages.KSAGuestCheckoutCyclePage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.loginPage.LoginPage;
import sporter_pages.tabby_payment_method_pages.TabbyPaymentPage;
import sporter_pages.tamara_payment_method_pages.KSATamaraPaymentPage;
import sporter_pages.tamara_payment_method_pages.TamaraPaymentPage;
import xml_reader.XmlReader;

import java.time.LocalTime;

public class KSATamaraPaymentMethodTestCases extends TamaraPaymentMethodTestCases {
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
    //Guest User
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: GuestUser- Make sure that the Tamara Payment method appear correctly", priority = 1)
    public void verifyTamaraPaymentMethodMethodCorrectlyForGuestUser() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        KSATamaraPaymentPage tamaraPaymentPage = new KSATamaraPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        tamaraPaymentPage.displayProductAndAddToCart();
        tamaraPaymentPage.accessShippingFormForGuestViaURL();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("KSAPhoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
           KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);     
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(tamaraPaymentPage.getTamaraInstallmentsPaymentMethod(), webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure the Installments Amounts In Tamara Page Are Matched With The Grand Total In Case Door To Door Shipping Method", priority = 2)
    public void verifyInstallmentsAmountsInTamaraPageAreMatchedWithTheGrandTotalForGuestUserInCaseDoorToDoorSuperExpressShippingMethod() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        tamaraPaymentPage.displayProductAndAddToCart();
        tamaraPaymentPage.accessShippingFormForGuestViaURL();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("KSAPhoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
           KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);     
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(tamaraPaymentPage.getTamaraInstallmentsPaymentMethod(), webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver);
        DataHelperAndWait.scrollTo(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver);
        double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,tamaraPaymentPage.kSAEnglishCurrency);
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        DataHelperAndWait.waitToBeVisible(tamaraPaymentPage.getTamaraHeaderInPaymentSchedulePage(),webDriver);
        double InstallmentsAmountsTotal=tamaraPaymentPage.calculateInstallmentsAmount(tamaraPaymentPage.kSAArabicCurrency);
        System.out.println("GrandTotal"+GrandTotal);
        System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
        Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting Door To Door Shipping Method With Tamara Payment Method a defined Using 3DSCard ", priority = 3)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTamaraPaymentMethodUsing3DSCardForGuestUser() throws Exception, InterruptedException {
        KSATamaraPaymentPage tamaraPaymentPage = new KSATamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboardForDooToDoor();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.ThreeCard);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting Door To Door Shipping Method With Tamara Payment Method Using a defined Master Card ", priority = 4)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTamaraPaymentMethodUsingMasterCardForGuestUser() throws Exception, InterruptedException {
        KSATamaraPaymentPage tamaraPaymentPage = new KSATamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboardForDooToDoor();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.MasterCard);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting Door To Door Shipping Method With Tamara Payment Method Using a defined Decline Transaction Card ", priority = 5)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTamaraPaymentMethodUsingDeclineTransactionCardForGuestUser() throws Exception, InterruptedException {
        KSATamaraPaymentPage tamaraPaymentPage = new KSATamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboardForDooToDoor();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.DeclineTransactionCard);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting Door To Door Shipping Method With Tamara Payment Method Using a defined Prepaid Card ", priority = 6)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTamaraPaymentMethodUsingPrepaidCardForGuestUser() throws Exception, InterruptedException {
        KSATamaraPaymentPage tamaraPaymentPage = new KSATamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboardForDooToDoor();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.PrepaidCard);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when Selecting PickUp In Store Shipping Method With Tamara Payment Method a defined Using 3DSCard ", priority = 7)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithTamaraPaymentMethodUsing3DSCardForGuestUser() throws Exception, InterruptedException {
        KSATamaraPaymentPage tamaraPaymentPage = new KSATamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboardForPickUpInStore();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.getThreeCard());
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when Selecting PickUp In Store Shipping Method With Tamara Payment Method Using a defined Master Card ", priority = 8)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithTamaraPaymentMethodUsingMasterCardForGuestUser() throws Exception, InterruptedException {
        KSATamaraPaymentPage tamaraPaymentPage = new KSATamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboardForPickUpInStore();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.MasterCard);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting SameDay Shipping Method With Tamara Payment Method Using a defined Decline Transaction Card ", priority = 9)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithTamaraPaymentMethodUsingDeclineTransactionCardForGuestUser() throws Exception, InterruptedException {
        KSATamaraPaymentPage tamaraPaymentPage = new KSATamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboardForPickUpInStore();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.DeclineTransactionCard);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure ability to place Order successfully when selecting SameDay Shipping Method With Tamara Payment Method Using a defined Prepaid Card ", priority = 10)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithTamaraPaymentMethodUsingPrepaidCardForGuestUser() throws Exception, InterruptedException {
        KSATamaraPaymentPage tamaraPaymentPage = new KSATamaraPaymentPage(webDriver);
        tamaraPaymentPage.addToCartAndAccessTamaraDashboardForPickUpInStore();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.PrepaidCard);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:GuestUser- Make sure the Installments Amounts In Tamara Page Are Matched With The Grand Total In Case Pick Up In Store Shipping Method", priority = 11)
    public void verifyInstallmentsAmountsInTamaraPageAreMatchedWithTheGrandTotalForGuestUserInCasePickUpInStoreShippingMethod() throws Exception {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        tamaraPaymentPage.displayProductAndAddToCart();
        tamaraPaymentPage.accessShippingFormForGuestViaURL();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("KSAPhoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(tamaraPaymentPage.getTamaraInstallmentsPaymentMethod(), webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver);
        DataHelperAndWait.scrollTo(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver);
        double GrandTotal=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(guestCheckoutCyclePage.getOrderTotalFieldInrReviewPage(),webDriver,tamaraPaymentPage.kSAEnglishCurrency);
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        DataHelperAndWait.waitToBeVisible(tamaraPaymentPage.getTamaraHeaderInPaymentSchedulePage(),webDriver);
        double InstallmentsAmountsTotal=tamaraPaymentPage.calculateInstallmentsAmount(tamaraPaymentPage.kSAArabicCurrency);
        System.out.println("GrandTotal"+GrandTotal);
        System.out.println("InstallmentsAmountsTotal"+InstallmentsAmountsTotal);
        Assert.assertEquals(GrandTotal,InstallmentsAmountsTotal);
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
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPageForRegistered(XmlReader.getXMLData("KSAPhoneNumber"));
           KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);     
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(tamaraPaymentPage.getTamaraInstallmentsPaymentMethod(),webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when selecting Door to Door Shipping Method With Tamara Payment Method Using 3DS Card ", priority = 14)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTamaraPaymentMethodUsing3DSCardForForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPageForRegistered(XmlReader.getXMLData("KSAPhoneNumber"));
           KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);     
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.ThreeCard);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when selecting Door to Door Shipping Method With Tamara Payment Method Using Master Card ", priority = 15)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTamaraPaymentMethodUsingMasterCardForForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPageForRegistered(XmlReader.getXMLData("KSAPhoneNumber"));
           KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);     
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.MasterCard);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when selecting Door to Door Shipping Method With Tamara Payment Method Using Decline Transaction Card ", priority = 16)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTamaraPaymentMethodUsingDeclineTransactionCardForForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPageForRegistered(XmlReader.getXMLData("KSAPhoneNumber"));
           KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);     
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
        tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.DeclineTransactionCard);
        //guestCheckoutCyclePage.IsQouteIDisDisplayed();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when selecting Door to Door Shipping Method With Tamara Payment Method Using Prepaid Card  ", priority = 17)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithTamaraPaymentMethodUsingDPrepaidCardForForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPageForRegistered(XmlReader.getXMLData("KSAPhoneNumber"));
           KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);     
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        if(BasePage.BaseURL.equalsIgnoreCase("https://www.sporter.com")) {
            tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
            tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.DeclineTransactionCard);
            //guestCheckoutCyclePage.IsQouteIDisDisplayed();
        }
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when Selecting PickUp In Store Shipping Method With Tamara Payment Method Using 3DS Card ", priority = 18)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithTamaraPaymentMethodUsing3DSCardForForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPageForRegistered(XmlReader.getXMLData("KSAPhoneNumber"));
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        if(BasePage.BaseURL.equalsIgnoreCase("https://www.sporter.com")) {
            tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
            tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.ThreeCard);
            //guestCheckoutCyclePage.IsQouteIDisDisplayed();
        }
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when Selecting PickUp In Store Shipping Method With Tamara Payment Method Using Master Card ", priority = 19)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithTamaraPaymentMethodUsingMasterCardForForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage= new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPageForRegistered(XmlReader.getXMLData("KSAPhoneNumber"));
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        if(BasePage.BaseURL.equalsIgnoreCase("https://www.sporter.com")) {
            tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
            tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.MasterCard);
            //guestCheckoutCyclePage.IsQouteIDisDisplayed();
        }
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:RegisteredUser- Make sure ability to place Order successfully when Selecting PickUp In Store Shipping Method With Tamara Payment Method Using Decline Transaction Card ", priority = 20)
    public void verifyAbilityToPlaceOrderWhenSameDayExpressShippingMethodWithTamaraPaymentMethodUsingDeclineTransactionCardForForRegisteredUser() throws Exception, InterruptedException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        TamaraPaymentPage tamaraPaymentPage = new TamaraPaymentPage(webDriver);
        tamaraPaymentPage.AddToCartAndAccessShippingMethodsPageForRegistered(XmlReader.getXMLData("KSAPhoneNumber"));
        KSAGuestCheckoutCyclePage kSA = new KSAGuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(), webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
        tamaraPaymentPage.SelectTamaraInstallmentsMethod();
        tamaraPaymentPage.clickOnFinalPlaceOrderBtn();
        if (BasePage.BaseURL.equalsIgnoreCase("https://www.sporter.com")) {
            tamaraPaymentPage.submitEmailAndPhoneNumberInPositiveFlow();
            tamaraPaymentPage.SelectDefinedCardAndSubmitTheCard(tamaraPaymentPage.DeclineTransactionCard);
           
        }
    }


}
