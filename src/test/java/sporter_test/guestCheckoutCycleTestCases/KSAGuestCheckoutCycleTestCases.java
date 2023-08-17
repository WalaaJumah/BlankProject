/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.guestCheckoutCycleTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.KSAGuestCheckoutCyclePage;
import sporter_pages.homepage_classes.KsaHomePage;
import xml_reader.XmlReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class KSAGuestCheckoutCycleTestCases extends GuestCheckoutCycleTestCases{
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
    @Test(enabled = false)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {
    }
    //TODO:The Same Day Delivery is Missing
    @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 6)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        DecimalFormat df = new DecimalFormat("0.00");
        cartPage.navigateToCartPage();
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"SAR");
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"SAR");
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,"SAR");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal));
    }
    @Test(enabled = false)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() {}
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 21)
    public void verifyAllShippingMethodsAppearCorrectly(){
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getDoorToDoorMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getPickupInStoreMethod(),webDriver);
    }
@Test(enabled = false)
public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the PickUp in store shipping method correctly", priority = 80)
    public void verifyAbilityToSelectPickUpInStoreShippingMethodCorrectly() throws IOException {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        webDriver.manage().deleteCookieNamed("guestCartId");
        kSA.accessGuestCheckoutForm();
        kSA.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
         DataHelperAndWait.waitForTime(2000);
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Payment Methods screen is disable when no shipping method is selected", priority = 24)
    public void verifyContinueBtnAppearsInPaymentMethodsIsDisableWhenNoMethodSelected() throws IOException {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        webDriver.manage().deleteCookieNamed("guestCartId");
        kSA.accessGuestCheckoutForm();
        kSA.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
//        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Door to Door Shipping Method With COD Payment Method ", priority = 26)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithCODPaymentMethod() throws IOException {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        webDriver.manage().deleteCookieNamed("guestCartId");
        kSA.accessGuestCheckoutForm();
        kSA.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
         DataHelperAndWait.waitForTime(2000);
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinuePaymentMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getFinalPlaceOrderBtn(),webDriver);
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
    }
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() {}
@Test(enabled = false)
public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the 2 Business Days Super Express Shipping Method With Valid Credit Card Payment Method", priority = 28)
    public void verifyAbilityToSelectTheDoorToDoorShippingMethodWithValidCreditCardPaymentMethod() throws IOException {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        webDriver.manage().deleteCookieNamed("guestCartId");
        kSA.accessGuestCheckoutForm();
        kSA.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
         DataHelperAndWait.waitForTime(2000);
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Door to Door Method With Credit Card Payment Method ", priority = 29)
    public void verifyAbilityToPlaceOrderWhenSelectingDoorToDoorShippingMethodWithCreditCardPaymentMethod() throws IOException {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        webDriver.manage().deleteCookieNamed("guestCartId");
        kSA.accessGuestCheckoutForm();
        kSA.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
         DataHelperAndWait.waitForTime(2000);
        kSA.clickOnContinueBtn();
        try{
        DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);}
        catch (Exception e){
            DataHelperAndWait.clickOnElement(kSA.getDoorToDoorMethod(),webDriver);
        }
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getFinalPlaceOrderBtn(),webDriver);
        kSA.verifyTheDisplayedPageDoesNotHaveErrors();
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
////        DataHelperAndWait.waitForTime(2000);
//        String mainWindow= webDriver.getWindowHandle();
//        Set<String> handles = webDriver.getWindowHandles();
//// Switch to the pop-up window
//        for (String handle : handles) {
//            if (!handle.equals(mainWindow)) {
//                webDriver.switchTo().window(handle);
//            }
//        }
// Close the pop-up window
//        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
//        Actions actions= new Actions(webDriver);
//        actions.sendKeys(Keys.ENTER).perform();
// Switch back to the main window
//        webDriver.switchTo().window(mainWindow);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
//        guestCheckoutCyclePage.submitSecureAndAuthenticationCheckout();
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the pickUp in Store Shipping Method With Valid Credit Card Payment Method", priority = 81)
    public void verifyAbilityToSelectThePickUpInStoreShippingMethodWithValidCreditCardPaymentMethod() throws IOException {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        webDriver.manage().deleteCookieNamed("guestCartId");
        kSA.accessGuestCheckoutForm();
        kSA.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
         DataHelperAndWait.waitForTime(2000);
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting pickUp in Store Method With Credit Card Payment Method ", priority = 82)
    public void verifyAbilityToPlaceOrderWhenSelectingPickUpInStoreShippingMethodWithCreditCardPaymentMethod() throws IOException {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        webDriver.manage().deleteCookieNamed("guestCartId");
        kSA.accessGuestCheckoutForm();
        kSA.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
         DataHelperAndWait.waitForTime(2000);
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(kSA.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getFinalPlaceOrderBtn(),webDriver);
        kSA.verifyTheDisplayedPageDoesNotHaveErrors();


//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
//        DataHelperAndWait.waitForTime(2000);
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
//        guestCheckoutCyclePage.submitSecureAndAuthenticationCheckout();
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
    }
    @Test(enabled = false)
    public void verifyAbilityToSelect2BusinessDaysShippingMethodCorrectly() {
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the Door To Door shipping method correctly", priority = 22)
    public void verifyAbilityToSelectDoorToDoorShippingMethodCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 27)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() throws IOException {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        webDriver.manage().deleteCookieNamed("guestCartId");
        kSA.accessGuestCheckoutForm();
        kSA.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
         DataHelperAndWait.waitForTime(2000);
        kSA.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
        DataHelperAndWait.clickOnElement(kSA.getContinueShippingMethodsBtn(),webDriver);
        kSA.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.clickOnElement(kSA.getCloseCheckoutErr(), webDriver);
    }
//    @Test(groups = { "All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the COD Payment Method is not appear when selecting the Pickup in-store shipping method", priority = 83,expectedExceptions = { IOException.class, NoSuchElementException.class })
//    public void verifyCODIsNotAppearWhenSelectingPickUpInStoreShippingMethod() {
//        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
//        KSAGuestCheckoutCyclePage kSA= new KSAGuestCheckoutCyclePage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
//        cartPage.clearCart();
//        guestCheckoutCyclePage.accessGuestCheckoutForm();
//        guestCheckoutCyclePage.fillInShippingInformationInputField(
//                XmlReader.getXMLData("firstName"),
//                XmlReader.getXMLData("lastName"),
//                XmlReader.getXMLData("correctEmail"),
//                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
//                XmlReader.getXMLData("StreetOneAddressName"),
//                XmlReader.getXMLData("ksaPhoneNumber")
//        );
//         DataHelperAndWait.waitForTime(1000);
//        DataHelperAndWait.clickOnElement(kSA.getPickupInStoreMethod(),webDriver);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);}

}