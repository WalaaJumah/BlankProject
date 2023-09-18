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
import sporter_pages.guestCheckoutCyclePages.JordanGuestCheckoutCyclePage;
import sporter_pages.homepage_classes.JordanHomePage;
import xml_reader.XmlReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class JordanGuestCheckoutCycleTestCases extends GuestCheckoutCycleTestCases{
    @BeforeClass(alwaysRun=true)
    public void switchToJordanStore(){
        JordanHomePage jordanHomePage=new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if(!webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)){
            webDriver.navigate().to(BasePage.BaseURL+jordanHomePage.jordanDomain);
            System.out.println(webDriver.getCurrentUrl());
        }
        storeCountry="Jordan";
        countryCode="962";
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 5)
    public void verifyAllPaymentMethodAppearingTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Make sure the Guest user cannot submit the shipping information without filling the required fields empty", priority = 13)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWithoutFillingTheRequiredFields() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.fillInShippingInformationInputField(" ", " ", " ", " ", " ", " ");
        DataHelperAndWait.waitForTime(1000);
        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinueShippingInfoBtn(),webDriver);

//        guestCheckoutCyclePage.clickOnContinueBtn();
//        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getFirstnameErrMsg(), webDriver);
//        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getLastNameErrMsg(), webDriver);
//        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getEmailErrMsg(), webDriver);
////        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jo.getNationalIdErrMsg(),webDriver);
////        WebElementsAssertion.validateTheElementIsDisplayed(jo.getAddressErrMsg(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jo.getStreetLineOneField(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Guest user cannot submit the shipping information when the phone number length is small ", priority = 15)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWhenPhoneFieldHaveSmallTextLength() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Guest user can filling the shipping information and clicking on the Continue button correctly", priority = 17)
    public void verifyTheGuestUserCanFillTheShippingInformationCorrectly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCheckoutAsGuestBtn(),webDriver);
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getShippingMethodsOptionsSection(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 22)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() throws IOException {
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        jo.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        jo.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(jo.getFiveBusinessDays(),webDriver);
        DataHelperAndWait.clickOnElement(jo.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(jo.getCreditCardPaymentMethod(),webDriver);
    }
    @Test(enabled = false)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {}
    //TODO:The Same Day Delivery is Missing
    @Test(enabled = false)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 6)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        DecimalFormat df = new DecimalFormat("0.00");
        cartPage.navigateToCartPage();
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"JOD");
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"JOD");
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,"JOD");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal));
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 20)
    public void verifyAllShippingMethodsAppearCorrectly() throws IOException {
        JordanGuestCheckoutCyclePage jordanGuestCheckoutCyclePage= new JordanGuestCheckoutCyclePage(webDriver);
        jordanGuestCheckoutCyclePage.accessGuestCheckoutForm();
        jordanGuestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        jordanGuestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.assertionWebElementEqualText(jordanGuestCheckoutCyclePage.getFiveBusinessDays(),webDriver,XmlReader.getXMLData("fiveBusinessDays"));
    }
@Test(enabled = false)
public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() {}
@Test(enabled = false)
public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the 2 Business Days Super Express Shipping Method With Valid Credit Card Payment Method", priority = 28)
    public void verifyAbilityToSelectThe5BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() throws IOException {
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        jo.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        jo.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(jo.getFiveBusinessDays(),webDriver);
        DataHelperAndWait.clickOnElement(jo.getContinueShippingMethodsBtn(),webDriver);
        jo.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(jo.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With Credit Card Payment Method ", priority = 29)
    public void verifyAbilityToPlaceOrderWhenSelecting5BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() throws IOException {
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        jo.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        jo.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(jo.getFiveBusinessDays(),webDriver);
        DataHelperAndWait.clickOnElement(jo.getContinueShippingMethodsBtn(),webDriver);
        jo.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        jo.clickOnPlaceOrderBtn(true);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
@Test(enabled = false)
public void verifyAbilityToSelect2BusinessDaysShippingMethodCorrectly() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the 5 Business Days Super Express shipping method correctly", priority = 22)
    public void verifyAbilityToSelect5BusinessDaysShippingMethodCorrectly() throws IOException {
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        jo.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(jo.getFiveBusinessDays(),webDriver);
        DataHelperAndWait.clickOnElement(jo.getContinueShippingMethodsBtn(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 27)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() throws IOException {
        JordanGuestCheckoutCyclePage guestCheckoutCyclePage = new JordanGuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFiveBusinessDays(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCloseCheckoutErr(), webDriver);
    }
    @Test(enabled = false,groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when using a Free Coupon Code ", priority = 99)
    public void verifyAbilityToPlaceOrderWhenUsingFreeCouponCode() throws IOException {
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
        cartPage.proceedToCheckout();
        DataHelperAndWait.waitForUrlContains(jo.shippingInformationUrl,webDriver);
        DataHelperAndWait.clickOnElement(jo.getCheckoutAsGuestBtn(),webDriver);
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        jo.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(jo.getFiveBusinessDays(),webDriver);
        DataHelperAndWait.clickOnElement(jo.getContinueShippingMethodsBtn(),webDriver);
        jo.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        jo.clickOnPlaceOrderBtn(true);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}:Verify Edit Shipping information button works fine", priority = 20)
    public void verifyTheEditShippingInfoBtnWorksFine() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
//        guestCheckoutCyclePage.accessGuestCheckoutForm();
//        guestCheckoutCyclePage.fillInShippingInformationInputField(
//                XmlReader.getXMLData("firstName"),
//                XmlReader.getXMLData("lastName"),
//                XmlReader.getXMLData("correctEmail"),
//                XmlReader.getXMLData("SmallPhoneNumber"),
////                XmlReader.getXMLData("AddressName"),
//                XmlReader.getXMLData("StreetOneAddressName"),
//                XmlReader.getXMLData("StreetTwoAddressName")
//        );
//        guestCheckoutCyclePage.clickOnContinueBtn();
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getEditShippingInfoBtn(),webDriver);
//        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getEditShippingInfoBtn(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Payment Methods screen is disable when no shipping method is selected", priority = 24)
    public void verifyContinueBtnAppearsInPaymentMethodsIsDisableWhenNoMethodSelected() throws IOException {
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        jo.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        jo.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(jo.getFiveBusinessDays(),webDriver);
        DataHelperAndWait.clickOnElement(jo.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.assertionElementNotEnable(jo.getContinuePaymentMethodsBtn(), webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Shipping Methods screen is disable when no shipping method is selected", priority = 19)
    public void verifyContinueBtnAppearsInShippingMethodsIsDisableWhenNoMethodSelected() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.clickOnContinueBtn();
    }
    @Test(groups = {"2.01 Checkout Cycle( Guest User)", "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure the system display the Quote ID for the user after checkout the order", priority = 100)
    public void verifyTheSystemDisplayTheQuoteIdForTheUserAfterCheckoutTheOrder() throws IOException{
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        jo.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        jo.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(jo.getFiveBusinessDays(),webDriver);
        DataHelperAndWait.clickOnElement(jo.getContinueShippingMethodsBtn(),webDriver);
        jo.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        jo.clickOnPlaceOrderBtn(true);
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.waitToBeVisible(jo.getSuccessPage(),webDriver);
        orderNumber= DataHelperAndWait.extractDigitsFromString(jo.getSuccessPage(),webDriver);
        System.out.println(orderNumber);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

}

