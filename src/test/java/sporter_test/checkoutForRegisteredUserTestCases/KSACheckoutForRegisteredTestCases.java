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
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.KSAGuestCheckoutCyclePage;
import sporter_pages.homepage_classes.KsaHomePage;
import xml_reader.XmlReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class KSACheckoutForRegisteredTestCases extends CheckoutForRegisteredTestCases{
    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if (!webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
        }
        if(!webDriver.getCurrentUrl().contains(websiteArabicLanguage)) {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        storeCountry = "المملكة العربية السعودية";
        countryCode = "966";
    }
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 9)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
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
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Registered user can filling the shipping information and clicking on the Continue button correctly", priority = 19)
    public void verifyTheRegisteredUserCanFillTheShippingInformationCorrectly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage=new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
cartPage.proceedToCheckout();
        try{
            DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getSavedAddressOption(),webDriver);
        }
        catch (Exception e) {
            checkoutForRegisteredPage.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("ksaPhoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName")
            );
        }
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getShippingMethodsOptionsSection(),webDriver);
    }
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when using a Free Coupon Code ", priority = 90)
    public void verifyAbilityToPlaceOrderWhenUsingFreeCouponCode() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage=new CheckoutForRegisteredPage(webDriver,kSA);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
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
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.waitTillLoaderComplete();
        DataHelperAndWait.clickOnElement(kSA.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinuePaymentMethodsBtn(), webDriver);
        kSA.waitTillLoaderComplete();
       kSA.clickOnPlaceOrderBtn(false);
        kSA.verifyTheDisplayedPageDoesNotHaveErrors();
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the system display the Quote ID for the user after checkout the order", priority = 100)
    public void verifyTheSystemDisplayTheQuoteIdForTheUserAfterCheckoutTheOrderUsingCouponeCode() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage=new CheckoutForRegisteredPage(webDriver,kSA);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();

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
        kSA.clickOnContinueBtn();
        kSA.waitTillLoaderComplete();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.waitTillLoaderComplete();
        DataHelperAndWait.clickOnElement(kSA.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinuePaymentMethodsBtn(), webDriver);
        kSA.waitTillLoaderComplete();
        kSA.clickOnPlaceOrderBtn(false);
        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,5);
        if(DataHelperAndWait.IsElementPresent((kSA.getSuccessPage())) ){
            orderNumber = DataHelperAndWait.extractDigitsFromString(kSA.getSuccessPage(), webDriver);
            System.out.println(orderNumber);
        }
        else{
            throw new AssertionError("The system did not redirect the user to the Success page & the current URL is: "+webDriver.getCurrentUrl());

        }
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 29)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,kSA,cartPage);
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
        kSA.clickOnContinueBtn();
        kSA.waitTillLoaderComplete();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        kSA.waitTillLoaderComplete();
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.waitTillLoaderComplete();
        DataHelperAndWait.clickOnElement(kSA.getCreditCardPaymentMethod(),webDriver);
        kSA.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.clickOnElement(kSA.getCloseCheckoutErr(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Door To Door Shipping Method With Valid Credit Card Payment Method", priority = 30)
    public void verifyAbilityToSelectTheDoorToDoorShippingMethodWithValidCreditCardPaymentMethod() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,kSA,cartPage);
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
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getCreditCardPaymentMethod(),webDriver);
        kSA.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getFinalPlaceOrderBtn(),webDriver);
    }


    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Door To Door Shipping Method With COD Payment Method correctly", priority = 27)
    public void verifyAbilityToSelectTheDoorToDoorShippingMethodWithCODPaymentMethod() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,kSA,cartPage);
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
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinuePaymentMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Door To Door Shipping Method With COD Payment Method ", priority = 28)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithCODPaymentMethod() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,kSA,cartPage);
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
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinuePaymentMethodsBtn(), webDriver);
kSA.clickOnPlaceOrderBtn(false);
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println("The order Number= "+orderNumber);
    }

    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Door To Door Shipping Method With Credit Card Payment Method ", priority = 78)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithCreditCardPaymentMethod() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,kSA,cartPage);
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
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.waitTillLoaderComplete();
        kSA.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
kSA.clickOnPlaceOrderBtn(true);
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
//                DataHelperAndWait.waitForTime(2000);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(),webDriver);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);}
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting pickUp in Store Method With Credit Card Payment Method ", priority = 82)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithCreditCardPaymentMethod() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,kSA,cartPage);
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
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.waitTillLoaderComplete();
        kSA.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        kSA.clickOnPlaceOrderBtn(true);
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
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the pickUp in Store Shipping Method With Valid Credit Card Payment Method", priority = 81)
    public void verifyAbilityToSelectThePickUpInStoreShippingMethodWithValidCreditCardPaymentMethod() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,kSA,cartPage);
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
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.waitTillLoaderComplete();
        kSA.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the PickUp in store shipping method correctly", priority = 80)
    public void verifyAbilityToSelectPickUpInStoreShippingMethodCorrectly() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,kSA,cartPage);
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
        kSA.clickOnContinueBtn();
        kSA.waitTillLoaderComplete();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 23)
    public void verifyAllShippingMethodsAppearCorrectly() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,kSA,cartPage);
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
        kSA.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getPickupInStoreMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getDoorToDoorMethod(),webDriver);

    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 25)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() throws IOException {
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,kSA);

        kSA.navigateToCheckoutPage();
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
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.waitTillLoaderComplete();
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getCODPaymentMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getCreditCardPaymentMethod(),webDriver);
    }

}
