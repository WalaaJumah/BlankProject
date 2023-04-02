/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.checkoutForRegisteredUserTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.checkoutForRegisteredUserTPage.CheckoutForRegisteredPage;
import sporter_pages.checkoutForRegisteredUserTPage.KSACheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.EgyptGuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.KSAGuestCheckoutCyclePage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Set;

public class KSACheckoutForRegisteredTestCases extends CheckoutForRegisteredTestCases{
    @BeforeClass(alwaysRun=true)
    public void switchToKsaStore(){
        KsaHomePage ksaHomePage=new KsaHomePage(webDriver);
        HeaderSection headerSection =new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if(webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)){
            System.out.println("You are in KSA Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+ksaHomePage.saudiDomain);
            CloseInitialDialog();          }
        DataHelperAndWait.clickOnElement(headerSection.getLanguageSelector(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage,webDriver);
        System.out.println(webDriver.getCurrentUrl());
        storeCountry="المملكة العربية السعودية";
        countryCode="966";
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 9)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        DecimalFormat df = new DecimalFormat("0.00");
        cartPage.navigateToCartPage();
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"SAR");
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"SAR");
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,"SAR");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal),"The current URL is: "+webDriver.getCurrentUrl());
    }
@Test(enabled = false)
public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID(){}
    @Test(groups = {"2.02 Checkout Cycle( Registered User)","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Make sure the Registered user can filling the shipping information and clicking on the Continue button correctly", priority = 19)
    public void verifyTheRegisteredUserCanFillTheShippingInformationCorrectly() {
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        checkoutForRegisteredPage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("ksaPhoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getShippingMethodsOptionsSection(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when using a Free Coupon Code ", priority = 90)
    public void verifyAbilityToPlaceOrderWhenUsingFreeCouponCode() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage=new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        try {
            cartPage.clearCart();
        }
        catch (Exception e){
            System.out.println("");
        }
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
        try{
            DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getSavedAddressOption(),webDriver);
           }
        catch (Exception e){
            checkoutForRegisteredPage.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("ksaPhoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName")
            );
        }
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println(orderNumber);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 29)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        cartPage.navigateToCartPage();
//        cartPage.removeItem();
//        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        try{
            cartPage.clearCart();}
        catch (Exception e){
            System.out.println("");
        }

        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
                DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
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
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCloseCheckoutErr(), webDriver);
    }

    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to select the Door To Door Shipping Method With Valid Credit Card Payment Method", priority = 30)
    public void verifyAbilityToSelectTheDoorToDoorShippingMethodWithValidCreditCardPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        cartPage.navigateToCartPage();
//        cartPage.removeItem();
//        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        try {
            cartPage.clearCart();
        }
        catch (Exception e){
            System.out.println("");
        }

        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
                DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
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
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }


    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to select the Door To Door Shipping Method With COD Payment Method correctly", priority = 27)
    public void verifyAbilityToSelectTheDoorToDoorShippingMethodWithCODPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        cartPage.navigateToCartPage();
//        cartPage.removeItem();
//        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        try {
            cartPage.clearCart();
        }
        catch (Exception e){
            System.out.println("");
        }

        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
                DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
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
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Door To Door Shipping Method With COD Payment Method ", priority = 28)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithCODPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        cartPage.navigateToCartPage();
//        cartPage.removeItem();
//        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        try {
cartPage.clearCart();        }
        catch (Exception e){
            System.out.println("");
        }

        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
                DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
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
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println("The order Number= "+orderNumber);
    }

    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Door To Door Shipping Method With Credit Card Payment Method ", priority = 78)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        cartPage.navigateToCartPage();
//        cartPage.removeItem();
//        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        try {
            cartPage.clearCart();
        }
        catch (Exception e){
            System.out.println("");
        }

        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
                DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
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
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println("The order Number= "+orderNumber);
    }
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() {}
    @Test(enabled = false)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {}
    @Test(enabled = false)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {}


//    @Test(groups = { "All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the COD Payment Method is not appear when selecting the Pickup in-store shipping method", priority = 83,expectedExceptions = { IOException.class, NoSuchElementException.class })
//    public void verifyCODIsNotAppearWhenSelectingPickUpInStoreShippingMethod() {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
//        KSACheckoutForRegisteredPage ksa= new KSACheckoutForRegisteredPage(webDriver);
//        CartPage cartPage= new CartPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(), webDriver);
//                DataHelperAndWait.waitForTime(2000);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(),webDriver);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);}
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting pickUp in Store Method With Credit Card Payment Method ", priority = 82)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        cartPage.navigateToCartPage();
//        cartPage.removeItem();
//        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        try {
            cartPage.clearCart();
        }
        catch (Exception e){
            System.out.println("");
        }

        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
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
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();

//        String mainWindow= webDriver.getWindowHandle();
//        Set<String> handles = webDriver.getWindowHandles();
//// Switch to the pop-up window
//        for (String handle : handles) {
//            if (!handle.equals(mainWindow)) {
//                webDriver.switchTo().window(handle);
//            }
//        }
//// Close the pop-up window
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
//        Actions actions= new Actions(webDriver);
//        actions.sendKeys(Keys.ENTER).perform();
//// Switch back to the main window
////        webDriver.switchTo().window(mainWindow);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
////        guestCheckoutCyclePage.submitSecureAndAuthenticationCheckout();
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
//        guestCheckoutCyclePage.submitSecureAndAuthenticationCheckout();
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumberCreditCard= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumberCreditCard);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to select the pickUp in Store Shipping Method With Valid Credit Card Payment Method", priority = 81)
    public void verifyAbilityToSelectThePickUpInStoreShippingMethodWithValidCreditCardPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        cartPage.navigateToCartPage();
//        cartPage.removeItem();
//        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        try {
            cartPage.clearCart();
        }
        catch (Exception e){
            System.out.println("");
        }

        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
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
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the PickUp in store shipping method correctly", priority = 80)
    public void verifyAbilityToSelectPickUpInStoreShippingMethodCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        cartPage.navigateToCartPage();
//        cartPage.removeItem();
//        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        try {
            cartPage.clearCart();
        }
        catch (Exception e){
            System.out.println("");
        }

        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
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
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)","All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 23)
    public void verifyAllShippingMethodsAppearCorrectly(){
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        cartPage.navigateToCartPage();
//        cartPage.removeItem();
//        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        try {
            cartPage.clearCart();
        }
        catch (Exception e){
            System.out.println("");
        }

        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.waitForTime(500);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
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
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getPickupInStoreMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getDoorToDoorMethod(),webDriver);

    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 25)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
    }

}
