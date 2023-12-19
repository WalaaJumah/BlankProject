/**
 * @author w.jumaa
 * @projectName sporter-web-automation
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
import sporter_pages.checkoutForRegisteredUserTPage.EgyptCheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.EgyptGuestCheckoutCyclePage;
import sporter_pages.homepage_classes.EgyptHomePage;
import xml_reader.XmlReader;
import java.io.IOException;

public class EgyptCheckoutForRegisteredTestCases  extends CheckoutForRegisteredTestCases {
    @BeforeClass(alwaysRun=true)
    public void switchToEgyptStore(){
        EgyptHomePage egyptHomePage=new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if(!webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)){
            webDriver.navigate().to(BasePage.BaseURL+egyptHomePage.egyptDomain);
             }
        storeCountry="Egypt";
       countryCode="20";
    }
@Test(enabled = false)    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {

    }
@Test(enabled = false)
public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() {}

    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Next Day Delivery With COD Payment Method correctly", priority = 27)
    public void verifyAbilityToSelectTheNextDayDeliveryWithCODPaymentMethod() throws IOException {
        CartPage cartPage= new CartPage(webDriver);
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,egypt,cartPage);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
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
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinuePaymentMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Next Day Delivery With COD Payment Method ", priority = 28)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDaySuperExpressShippingMethodWithCODPaymentMethod() throws IOException {
        CartPage cartPage= new CartPage(webDriver);
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,egypt,cartPage);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
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
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinuePaymentMethodsBtn(), webDriver);
egypt.clickOnPlaceOrderBtn(false);
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();

    }
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Next Day Delivery With Valid Credit Card Payment Method", priority = 29)
    public void verifyAbilityToSelectTheNextDayDeliveryWithValidCreditCardPaymentMethod() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getCreditCardPaymentMethod(),webDriver);
//        egypt.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Next Day Delivery With Credit Card Payment Method ", priority = 30)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDayDeliveryWithCreditCardPaymentMethod() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
       DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
egypt.clickOnPlaceOrderBtn(true);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardCorrectly();
//        DataHelperAndWait.waitForTime(3000);
//        webDriver.switchTo().frame(1);
//        DataHelperAndWait.waitToBeVisible(egypt.getGoToMerchentWebSite(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
    }
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() { }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 78)
    public void verifyAllShippingMethodsAppearCorrectly() throws IOException {
        EgyptCheckoutForRegisteredPage egypt= new EgyptCheckoutForRegisteredPage(webDriver);
        EgyptGuestCheckoutCyclePage egypt2= new EgyptGuestCheckoutCyclePage(webDriver);
        egypt.AddToCartAndAccessShippingMethodsPageForEgypt();
        WebElementsAssertion.validateTheElementIsDisplayed(egypt2.getTwoBusinessDaysSuperExpressShipping(),webDriver);
    }
    @Test(enabled = false)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {  }
    //TODO:The Same Day Delivery is Missing
    @Test(enabled = false)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {}
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 31)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,egypt);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
        try{            DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getSavedAddressOption(),webDriver);
        }
        catch (Exception e){
            checkoutForRegisteredPage.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("phoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName")
            );
        }
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
//        egypt.clickOnPlaceOrderBtn(true);
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.waitForTime(6000);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        //TODO: Needs to recheck
//        egypt.submitInValidCreditCardCorrectly();
//        WebElementsAssertion.assertionAttributeTrueForElement(egypt.getPayBtn(), webDriver,"class","gebtn gebtn-round gebtn-disabled");
//        DataHelperAndWait.waitToBeInVisible(egypt.getGeideaIncorrectCrediCardMsg(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 25)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,egypt,cartPage);
        egypt.navigateToCheckoutPage();
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
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
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getCreditCardPaymentMethod(),webDriver);
    }
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when using a Free Coupon Code ", priority = 81)
    public void verifyAbilityToPlaceOrderWhenUsingFreeCouponCode() throws IOException {
        EgyptGuestCheckoutCyclePage guestCheckoutCyclePage = new EgyptGuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
//        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
//        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
        cartPage.proceedToCheckout();

//        cartPage.navigateToHomePage();
//        cartPage.clickOnCartIcon();
//        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
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
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        guestCheckoutCyclePage.clickOnPlaceOrderBtn(false);
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Authentication Failed Option from Geidea Payment Gate Screen  ", priority = 60)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingAuthenticationFailedOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        egypt.clickOnPlaceOrderBtn(true);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(N) Authentication Failed");
//        DataHelperAndWait.waitForTime(3000);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Authentication Not Available Option from Geidea Payment Gate Screen", priority = 61)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingAuthenticationNotAvailableOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        egypt.clickOnPlaceOrderBtn(true);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(X or U) Authentication Not Available");
//        DataHelperAndWait.waitForTime(3000);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Authentication Attempted Option from Geidea Payment Gate Screen", priority = 62)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingAuthenticationAttemptedOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        egypt.clickOnPlaceOrderBtn(true);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(M) Authentication Attempted");
//                        DataHelperAndWait.waitForTime(3000);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Error Parsing Authentication Response Option from Geidea Payment Gate Screen", priority = 63)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingErrorParsingAuthenticationResponseOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.waitTillLoaderComplete();
        egypt.selectCreditCardMethod();
        egypt.clickOnPlaceOrderBtn(true);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(P) Error Parsing Authentication Response");
//                        DataHelperAndWait.waitForTime(3000);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Invalid Signature on Authentication Response Option from Geidea Payment Gate Screen", priority = 64)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingInvalidSignatureOnAuthenticationResponseOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        egypt.clickOnPlaceOrderBtn(true);
//        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(S) Invalid Signature on Authentication Response");
//                        DataHelperAndWait.waitForTime(3000);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting MPI Processing Error Option from Geidea Payment Gate Screen", priority = 65)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingMPIProcessingErrorOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        egypt.clickOnPlaceOrderBtn(true);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
//        egypt.submitCreditCardWithDifferentAuthentication("(I) MPI Processing Error");
//                        DataHelperAndWait.waitForTime(3000);
//        webDriver.switchTo().frame(1);
//        WebElementsAssertion.validateTheElementIsDisplayed(egypt.getGeideaError(),webDriver);
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Verify Inability to place order successfully using Geidea when selecting Authentication Attempted (No CAVV) Option from Geidea Payment Gate Screen", priority = 66)
    public void verifyInabilityToPlaceOrderUsingGeideaWhenSelectingNoCAVVOptionFromGediaPaymentPage() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        egypt.clickOnPlaceOrderBtn(true);
    }
    @Test(enabled = false,groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the order total appears in the Geidea payment Gateway is matched with the original order Total ", priority = 59)
    public void verifyTheOrderTotalAppearsInGeideaGateWayIsMatchedWithOriginalOrderTotal() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        String sporterTotal;
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
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
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the order is not placed correctly when there's interruption occurring in the Geidea Payment GateWay ", priority = 68)
    public void verifyTheOrderIsNotPlacedWhenMakeInterputionDuringCheckoutOrderUsingGeidea() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        egypt.clickOnPlaceOrderBtn(true);
        egypt.verifyTheDisplayedPageDoesNotHaveErrors();
        //TODO: Needs to recheck
//        if(DataHelperAndWait.IsElementPresent(egypt.getGeideaPopUpFrame())) {
//            DataHelperAndWait.waitToBeVisible(egypt.getGeideaPopUpFrame(), webDriver);
//            webDriver.switchTo().frame(1);
//            DataHelperAndWait.waitToBeVisible(egypt.getDebitCreditCardOption(), webDriver);
//            DataHelperAndWait.clickOnElement(egypt.getDebitCreditCardOption(), webDriver);
//            DataHelperAndWait.clickOnElement(egypt.getNextButtonInGediaaPopUp(), webDriver);
//            DataHelperAndWait.waitToBeVisible(egypt.getPayBtn(), webDriver);
////        webDriver.navigate().refresh();
////        WebElementsAssertion.validateTheCurrentUrlContainsString("checkout",webDriver);
//        }
//        else{
//            throw new AssertionError("The Site doesn't redirect the user to the Geidea Dashboard & the URL is: "+webDriver.getCurrentUrl());
//
//        }
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully Using Geidea when using Arabic Version ", priority = 69)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDayDeliveryShippingMethodWithCreditCardPaymentMethodInArabicVersion() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,egypt);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
        try{
            DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getSavedAddressOption(),webDriver);
        }
        catch (Exception e){
            checkoutForRegisteredPage.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("phoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"));
        }
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        egypt.clickOnPlaceOrderBtn(true);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();

    }
    @Test(enabled = false, groups= { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Next Day Delivery Shipping Method With Credit Card Payment Method when using the coupon code", priority = 70)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDayDeliveryShippingMethodWithCreditCardPaymentMethodUsingCouponCode() throws IOException {
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,egypt,cartPage);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
        cartPage.proceedToCheckout();
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
        egypt.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(egypt.getContinueShippingMethodsBtn(),webDriver);
        egypt.selectCreditCardMethod();
        egypt.clickOnPlaceOrderBtn(true);
    }
}
