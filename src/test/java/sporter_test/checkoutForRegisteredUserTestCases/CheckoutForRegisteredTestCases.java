/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.checkoutForRegisteredUserTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AccountRegistrationPage.AccountRegistrationPage;
import sporter_pages.cartPages.CartPage;
import sporter_pages.checkoutForRegisteredUserTPage.CheckoutForRegisteredPage;
import sporter_pages.checkoutForRegisteredUserTPage.JordanCheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.JordanGuestCheckoutCyclePage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.loginPage.LoginPage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.text.DecimalFormat;
import java.util.Set;

@Test(groups = "2.02 Checkout Cycle( Registered User)")

public class CheckoutForRegisteredTestCases extends BaseTest
{
    String storeCountry;
    String countryCode;
    String orderNumberCOD;
    String orderNumberCreditCard;
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Validate the system keeps the products in the Cart after login  ", priority = 1)
    public void verifyTheProductsKeepInCartAfterSignedIn() {
        CartPage cartPage = new CartPage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        HeaderSection header=new HeaderSection(webDriver);
        AccountRegistrationPage registrationPage=new AccountRegistrationPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        int oldCartCounter=DataHelperAndWait.convertTheStringToInt(cartPage.getItemsCounter(),webDriver);
        loginPage.navigateToLoginPage();
        loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail2"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        DataHelperAndWait.waitForTime(4000);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registrationPage.getMyAccountOption(), webDriver);
        int newCartCounter=DataHelperAndWait.convertTheStringToInt(cartPage.getItemsCounter(),webDriver);
        Assert.assertTrue(newCartCounter>=oldCartCounter);
        cartPage.navigateToCartPage();
        cartPage.removeItem();
        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        DataHelperAndWait.clickOnElement(registrationPage.getLogoutOption(), webDriver);
    }
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Ability to login correctly from Sign In Page using valid credential", priority = 2)
    public void verifyAbilityToLoginCorrectlyWithValidCredentials() {
        HeaderSection header = new HeaderSection(webDriver);
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.navigateToLoginPage();
        loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail2"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
    }
    @Test(groups = {"1.1 Critical Severity"}, description = "{{CountryName}}:Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 3)
    public void keepShoppingAfterAddingToTheCart() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.keepShoppingAfterAddingToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(), webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify ability to remove the product from the cart successfully", priority = 4)
    public void verifyAbilityToRemoveProductFromCart() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        cartPage.removeItem();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(), webDriver);
    }
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure to add product to the Cart from Product Details Page", priority = 5)
    public void addToCartAndViewCartFromPDP() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure to view the Cart using cart icon appearing at the top of screen", priority = 6)
    public void viewCartFromCartIcon() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getViewCartInCartPopup(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 8)
    public void verifyAllPaymentMethodAppearingTheCartPage() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCODOption(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 9)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        DecimalFormat df = new DecimalFormat("0.00");
        cartPage.navigateToCartPage();
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"AED");
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"AED");
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,"AED");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal));
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the Proceed to checkout button appears in the cart page works correctly", priority = 10)
    public void verifyProceedCheckoutBtnAppearingInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.shippingInformationUrl, webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that the Proceed to checkout button appearing in the Cart pop-up works correctly", priority = 11)
    public void verifyProceedCheckoutBtnAppearingInCartPopUpWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.shippingInformationUrl, webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the system fills the store country by default in the country field in the shipping information form", priority = 13)
    public void verifyTheCountryRetrievedInCountryFieldBasedOnStoreCountry() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionTextIsEqual(guestCheckoutCyclePage.getCountryMenu(), webDriver, storeCountry);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the Add new Address button in the shipping information form works correctly", priority = 12)
    public void verifyTheAddNewAddressButtonWorksCorrectly() {
try{    GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver);
        DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getAddNewAddressBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFirstNameField(), webDriver);}
catch (Exception e){
    System.out.println("There's no any saved address");
}
    }
  @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Make sure the County Code retrieved correctly in the Phone Field", priority = 14)
    public void verifyTheCorrectCountyCodeRetrievedCorrectlyInPhoneField() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getCountryCode(),webDriver,countryCode);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the email field is disable and retrieved the customer email correctly", priority = 15)
    public void verifyTheEmailFieldRetrievedIsDisableAndDisplayTheCustomerEmail() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getEmailField(), webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(guestCheckoutCyclePage.getEmailField(), webDriver,"value",XmlReader.getXMLData("correctEmail2"));
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Make sure the Registered user cannot submit the shipping information without filling the required fields empty", priority = 16)
    public void verifyTheRegisteredUserCannotSubmitTheShippingInformationWithoutFillingTheRequiredFields() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        checkoutForRegisteredPage.fillInShippingInformationInputField(" ", " ", " ", " ", " ", "");
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getPhoneField()," ");
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getFirstnameErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getLastNameErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getAddressErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getStreetlineOneErrMsg(), webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Registered user cannot submit the shipping information when the phone number length is small ", priority = 17)
    public void verifyTheRegisteredUserCannotSubmitTheShippingInformationWhenPhoneFieldHaveSmallTextLength() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver);
        checkoutForRegisteredPage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("SmallPhoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Registered user cannot submit the shipping information using incorrect National ID", priority = 18)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver);
        JordanCheckoutForRegisteredPage jo= new JordanCheckoutForRegisteredPage(webDriver);
        JordanGuestCheckoutCyclePage joGuest= new JordanGuestCheckoutCyclePage(webDriver);
        checkoutForRegisteredPage.accessGuestCheckoutForm();
        jo.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                "12"
        );
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(joGuest.getNationalIdErrMsg(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Make sure the Registered user can filling the shipping information and clicking on the Continue button correctly", priority = 19)
    public void verifyTheRegisteredUserCanFillTheShippingInformationCorrectly() {
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        checkoutForRegisteredPage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getShippingMethodsOptionsSection(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Verify the shipping Fee retrieved correctly in the Shipping Methods screen ", priority = 20)
    public void verifyShippingFeeRetrievedCorrectlyInShippingMethodsScreen(){
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.validateTheShippingMethodAmount(guestCheckoutCyclePage.getFirstShippingMethodAmount(),guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping());
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Shipping Methods screen is disable when no shipping method is selected", priority = 21)
    public void verifyContinueBtnAppearsInShippingMethodsIsDisableWhenNoMethodSelected() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Verify Edit Shipping information button works fine", priority = 22)
    public void verifyTheEditShippingInfoBtnWorksFine() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getEditShippingInfoBtn(),webDriver);
        checkoutForRegisteredPage.setSelectDubaiCityCity();
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getEditShippingInfoBtn(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 78)
    public void verifyAllShippingMethodsAppearCorrectly(){
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver,XmlReader.getXMLData("twoBusinessDay"));
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getSameDayDelivery(),webDriver,XmlReader.getXMLData("sameDayDelivery"));
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the 2 Business Days Super Express Shipping\n" +
            "Cash on Delivery Service Available shipping method correctly", priority = 24)
    public void verifyAbilityToSelect2BusinessDaysShippingMethodCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the Same Day Delivery shipping method appears only for Dubai City", priority = 79)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddressForDubaiCity();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSameDayDelivery(),webDriver);
    }
    //TODO:The Same Day Delivery is Missing
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the Same Day Delivery shipping method correctly", priority = 80)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 25)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Payment Methods screen is disable when no shipping method is selected", priority = 25)
    public void verifyContinueBtnAppearsInPaymentMethodsIsDisableWhenNoMethodSelected() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to select the 2 Business Days Super Express Shipping Method With COD Payment Method correctly", priority = 27)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With COD Payment Method ", priority = 28)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        orderNumberCOD= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println(orderNumberCOD);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to select the 2 Business Days Super Express Shipping Method With Valid Credit Card Payment Method", priority = 29)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With Credit Card Payment Method ", priority = 30)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitForTime(2000);
        String mainWindow= webDriver.getWindowHandle();
        Set<String> handles = webDriver.getWindowHandles();
// Switch to the pop-up window
        for (String handle : handles) {
            if (!handle.equals(mainWindow)) {
                webDriver.switchTo().window(handle);
            }
        }
// Close the pop-up window
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        Actions actions= new Actions(webDriver);
        actions.sendKeys(Keys.ENTER).perform();
// Switch back to the main window
//        webDriver.switchTo().window(mainWindow);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        guestCheckoutCyclePage.submitSecureAndAuthenticationCheckout();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        orderNumberCreditCard= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println(orderNumberCreditCard);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 31)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCloseCheckoutErr(), webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when using a Free Coupon Code ", priority = 81)
    public void verifyAbilityToPlaceOrderWhenUsingFreeCouponCode() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage=new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        cartPage.removeItem();
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
        try{
        DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getSavedAddressOption(),webDriver);}
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
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        guestCheckoutCyclePage.submitSecureAndAuthenticationCheckout();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        orderNumberCOD= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println(orderNumberCOD);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the Add To Wish List Button works correctly and the added item appears correctly in the WishList screen ", priority = 7)
    public void verifyAddToWishListBtnWorksCorrectly() {
         CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver);
        HeaderSection header=new HeaderSection(webDriver);
        AccountRegistrationPage registrationPage=new AccountRegistrationPage(webDriver);
        DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getAddToWishListBtn(),webDriver);
        DataHelperAndWait.refreshPage(webDriver);
        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        DataHelperAndWait.clickOnElement(registrationPage.getMyAccountOption(), webDriver);
        DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getWishListTab(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(checkoutForRegisteredPage.getAddedItemToWashList(),webDriver);


    }




}
