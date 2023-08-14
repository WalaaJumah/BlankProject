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
import sporter_pages.guestCheckoutCyclePages.QatarGuestCheckoutCyclePage;
import sporter_pages.homepage_classes.QatarHomePage;
import xml_reader.XmlReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class QatarGuestCheckoutCycleTestCases extends GuestCheckoutCycleTestCases{
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
        storeCountry="Qatar";
        countryCode="974";
    }
    @Test(enabled = false)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {
    }
    //TODO:The Same Day Delivery is Missing
    @Test(enabled = false)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Make sure the Guest user cannot submit the shipping information without filling the required fields empty", priority = 13)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWithoutFillingTheRequiredFields() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        QatarGuestCheckoutCyclePage qa= new QatarGuestCheckoutCyclePage(webDriver);
        qa.fillInShippingInformationInputField(" ", " ", " ", " ", " ", " ", "");
         DataHelperAndWait.waitForTime(2000);
        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinueShippingInfoBtn(),webDriver);

//        guestCheckoutCyclePage.clickOnContinueBtn();
//        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getFirstnameErrMsg(), webDriver);
//        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getLastNameErrMsg(), webDriver);
//        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getEmailErrMsg(), webDriver);
////        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(qa.getNationalIdErrMsg(),webDriver);
////        WebElementsAssertion.validateTheElementIsDisplayed(qa.getAddressErrMsg(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(qa.getStreetlineOneErrMsg(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Guest user cannot submit the shipping information when the phone number length is small ", priority = 15)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWhenPhoneFieldHaveSmallTextLength() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        QatarGuestCheckoutCyclePage qa= new QatarGuestCheckoutCyclePage(webDriver);
        qa.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
         DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Guest user can filling the shipping information and clicking on the Continue button correctly", priority = 17)
    public void verifyTheGuestUserCanFillTheShippingInformationCorrectly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCheckoutAsGuestBtn(),webDriver);
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
         DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getShippingMethodsOptionsSection(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 6)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        DecimalFormat df = new DecimalFormat("0.00");
        cartPage.navigateToCartPage();
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"QAR");
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"QAR");
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,"QAR");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal));
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 21)
    public void verifyAllShippingMethodsAppearCorrectly() throws IOException {
        QatarGuestCheckoutCyclePage qatar= new QatarGuestCheckoutCyclePage(webDriver);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(qatar.getFourToFiveDayMethod(),webDriver);
    }
@Test(enabled = false)
public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the 4-5 Business Days Super Express Shipping Method With COD Payment Method correctly", priority = 25)
    public void verifyAbilityToSelectThe4_5BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() throws IOException {
        QatarGuestCheckoutCyclePage qatar= new QatarGuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        qatar.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        DataHelperAndWait.waitForTime(2000);
        qatar.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(qatar.getFourToFiveDayMethod(),webDriver);
    }
@Test(enabled = false)
public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
       @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With COD Payment Method ", priority = 26)
    public void verifyAbilityToPlaceOrderWhenSelecting4_5BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() throws IOException {
           GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
           JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
           QatarGuestCheckoutCyclePage qatar= new QatarGuestCheckoutCyclePage(webDriver);
           CartPage cartPage= new CartPage(webDriver);
           webDriver.manage().deleteCookieNamed("guestCartId");
           guestCheckoutCyclePage.accessGuestCheckoutForm();
           jo.fillInShippingInformationInputField(
                   XmlReader.getXMLData("firstName"),
                   XmlReader.getXMLData("lastName"),
                   XmlReader.getXMLData("correctEmail"),
                   XmlReader.getXMLData("phoneNumber"),
                   //XmlReader.getXMLData("AddressName"),
                   XmlReader.getXMLData("StreetOneAddressName"),
                   XmlReader.getXMLData("StreetTwoAddressName"),
                   XmlReader.getXMLData("nationalID")
           );
            DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
           DataHelperAndWait.clickOnElement(qatar.getFourToFiveDayMethod(),webDriver);
           DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
           DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
           DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(),webDriver);
           WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
           DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
           cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

@Test(enabled = false)
public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the 2 Business Days Super Express Shipping Method With Valid Credit Card Payment Method", priority = 28)
    public void verifyAbilityToSelectThe4_5BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        QatarGuestCheckoutCyclePage qatar= new QatarGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
         DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(qatar.getFourToFiveDayMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
    }

@Test(enabled = false)
public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() {}
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With Credit Card Payment Method ", priority = 29)
    public void verifyAbilityToPlaceOrderWhenSelecting4_5BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        QatarGuestCheckoutCyclePage qatar= new QatarGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
         DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(qatar.getFourToFiveDayMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();

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
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 27)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() throws IOException {
        JordanGuestCheckoutCyclePage guestCheckoutCyclePage = new JordanGuestCheckoutCyclePage(webDriver);
//        guestCheckoutCyclePage.viewCartAndAccessShippingMethodsPage();
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        QatarGuestCheckoutCyclePage qatar= new QatarGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
         DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(qatar.getFourToFiveDayMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCloseCheckoutErr(), webDriver);
    }
    @Test(enabled = false)
    public void verifyAbilityToSelect2BusinessDaysShippingMethodCorrectly() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the 2_5 Business Days Super Express Shipping", priority = 22)
    public void verifyAbilityToSelect4_5BusinessDaysShippingMethodCorrectly() throws IOException {
        JordanGuestCheckoutCyclePage guestCheckoutCyclePage = new JordanGuestCheckoutCyclePage(webDriver);
        QatarGuestCheckoutCyclePage qatar= new QatarGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
         DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(qatar.getFourToFiveDayMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(),webDriver);
    }
    @Test(enabled = false,groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when using a Free Coupon Code ", priority = 99)
    public void verifyAbilityToPlaceOrderWhenUsingFreeCouponCode() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        QatarGuestCheckoutCyclePage qatar= new QatarGuestCheckoutCyclePage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
//        cartPage.navigateToCartPage();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
        cartPage.proceedToCheckout();
//        DataHelperAndWait.waitForUrlContains(guestCheckoutCyclePage.shippingInformationUrl,webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCheckoutAsGuestBtn(),webDriver);
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
         DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(qatar.getFourToFiveDayMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
//        System.out.println(orderNumber);
//        DataHelperAndWait.waitForTime(2000);
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
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 23)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        QatarGuestCheckoutCyclePage qatar= new QatarGuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(qatar.getFourToFiveDayMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Payment Methods screen is disable when no shipping method is selected", priority = 24)
    public void verifyContinueBtnAppearsInPaymentMethodsIsDisableWhenNoMethodSelected() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        QatarGuestCheckoutCyclePage qatar= new QatarGuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(qatar.getFourToFiveDayMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}:Verify Edit Shipping information button works fine", priority = 20)
    public void verifyTheEditShippingInfoBtnWorksFine() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getEditShippingInfoBtn(),webDriver);
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getEditShippingInfoBtn(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Shipping Methods screen is disable when no shipping method is selected", priority = 19)
    public void verifyContinueBtnAppearsInShippingMethodsIsDisableWhenNoMethodSelected() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure the system display the Quote ID for the user after checkout the order", priority = 100)
    public void verifyTheSystemDisplayTheQuoteIdForTheUserAfterCheckoutTheOrder() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        JordanGuestCheckoutCyclePage jo= new JordanGuestCheckoutCyclePage(webDriver);
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                //XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println(orderNumber);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
