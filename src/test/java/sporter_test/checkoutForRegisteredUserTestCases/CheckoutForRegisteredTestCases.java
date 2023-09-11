/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.checkoutForRegisteredUserTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AccountRegistrationPage.AccountRegistrationPage;
import sporter_pages.cartPages.CartPage;
import sporter_pages.checkoutForRegisteredUserTPage.CheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.EgyptGuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.JordanGuestCheckoutCyclePage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.loginPage.LoginPage;
import sporter_pages.myAccountPages.MyAccountPage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalTime;

@Test(groups = "2.02 Checkout Cycle( Registered User)")

public class CheckoutForRegisteredTestCases extends BaseTest
{
    String storeCountry;
    String countryCode;
    String orderNumberCOD;
    String orderNumber;
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Validate the system keeps the products in the Cart after login  ", priority = 2)
    public void verifyTheProductsKeepInCartAfterSignedIn() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.waitToBeVisible(cartPage.getItemsCounter(),webDriver);
        int oldCartCounter=DataHelperAndWait.convertTheStringToInt(cartPage.getItemsCounter(),webDriver);
        DataHelperAndWait.waitForTime(2000);
        int newCartCounter=DataHelperAndWait.convertTheStringToInt(cartPage.getItemsCounter(),webDriver);
        Assert.assertTrue(newCartCounter>=oldCartCounter);
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"}, description = "{{CountryName}}: Ability to login correctly from Sign In Page using valid credential", priority = 1)
    public void verifyAbilityToLoginCorrectlyWithValidCredentials() throws IOException {
        LoginPage loginPage = new LoginPage(webDriver);
        MyAccountPage myAccountPage= new MyAccountPage(webDriver);
        try {
            loginPage.navigateToLoginPage();
            loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail2"), XmlReader.getXMLData("correctPassword"));
            loginPage.clickOnLoginBtn();
            myAccountPage.clickOnAccountProfileIcon();
            WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getMyAccountOption(), webDriver);
        }
        catch (Exception e){
            loginPage.navigateToLoginPage();
            loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail2"), XmlReader.getXMLData("correctPassword"));
            loginPage.clickOnLoginBtn();
            myAccountPage.clickOnAccountProfileIcon();
            WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getMyAccountOption(), webDriver);
        }

    }
    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 3)
    public void keepShoppingAfterAddingToTheCart() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clearCart();
        productDetailsPage.keepShoppingAfterAddingToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Verify ability to remove the product from the cart successfully", priority = 4)
    public void verifyAbilityToRemoveProductFromCart() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        if(!cartPage.IsEmptyCart()) {
            cartPage.clearCart();
            WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(), webDriver);
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure to add product to the Cart from Product Details Page", priority = 5)
    public void addToCartAndViewCartFromPDP() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure to view the Cart using cart icon appearing at the top of screen", priority = 6)
    public void viewCartFromCartIcon() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToHomePage();
        cartPage.waitTillLoaderComplete();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getViewCartInCartPopup(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 8)
    public void verifyAllPaymentMethodAppearingTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
    }
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 9)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        DecimalFormat df = new DecimalFormat("0.00");
        cartPage.navigateToCartPage();
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"AED");
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"AED");
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,"AED");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal));
    }
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Proceed to checkout button appearing in the Cart pop-up works correctly", priority = 11)
    public void verifyProceedCheckoutBtnAppearingInCartPopUpWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.shippingInformationUrl, webDriver);
    }
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the system fills the store country by default in the country field in the shipping information form", priority = 13)
    public void verifyTheCountryRetrievedInCountryFieldBasedOnStoreCountry() throws IOException {
        CartPage cartPage= new CartPage(webDriver);
//TODO: Needs to recheck
        //        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();

    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Add new Address button in the shipping information form works correctly", priority = 12)
    public void verifyTheAddNewAddressButtonWorksCorrectly() throws IOException {
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
try{    GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getAddNewAddressBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFirstNameField(), webDriver);}
catch (Exception e){
    System.out.println("There's no any saved address");
}
    }
  @Test(groups = {  "1.3 Medium Severity"}, description = "{{CountryName}}:Make sure the County Code retrieved correctly in the Phone Field", priority = 14)
    public void verifyTheCorrectCountyCodeRetrievedCorrectlyInPhoneField() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
//      CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
//      CartPage cartPage= new CartPage(webDriver);
//      cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
//      cartPage.proceedToCheckout();
//          DataHelperAndWait.clickOnElement(registeredPage.getAddNewAddressBtn(),webDriver);
          WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getCountryCode(), webDriver, countryCode);

    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the email field is disable and retrieved the customer email correctly", priority = 15)
    public void verifyTheEmailFieldRetrievedIsDisableAndDisplayTheCustomerEmail() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        try{
            DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getSavedAddressOption(),webDriver);
}
        catch (Exception e){
            DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getAddNewAddressBtn(),webDriver);
            WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getEmailField(), webDriver);
            WebElementsAssertion.assertionAttributeTrueForElement(guestCheckoutCyclePage.getEmailField(), webDriver,"value",XmlReader.getXMLData("correctEmail2"));
        }
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:Make sure the Registered user cannot submit the shipping information without filling the required fields empty", priority = 16)
    public void verifyTheRegisteredUserCannotSubmitTheShippingInformationWithoutFillingTheRequiredFields() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        try{
            DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getSavedAddressOption(),webDriver);
}
        catch (Exception e){
            checkoutForRegisteredPage.fillInShippingInformationInputField(" ", " ", " ", " ", " ", "");
            DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getPhoneField()," ");
            WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinueShippingInfoBtn(),webDriver);
        }
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Registered user cannot submit the shipping information when the phone number length is small ", priority = 17)
    public void verifyTheRegisteredUserCannotSubmitTheShippingInformationWhenPhoneFieldHaveSmallTextLength() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
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
                    XmlReader.getXMLData("SmallPhoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName")
            );
            DataHelperAndWait.waitForTime(2000);
            guestCheckoutCyclePage.clickOnContinueBtn();
            WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(),webDriver);
        }
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Registered user cannot submit the shipping information using incorrect National ID", priority = 18)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        JordanGuestCheckoutCyclePage joGuest= new JordanGuestCheckoutCyclePage(webDriver);
        checkoutForRegisteredPage.accessGuestCheckoutForm();
        try{
            System.out.println("The user already have saved address");
}
        catch (Exception e){
            DataHelperAndWait.typeTextInElement(joGuest.getNationalIDField(), webDriver,"12");
            DataHelperAndWait.waitForTime(2000);
            guestCheckoutCyclePage.clickOnContinueBtn();
            WebElementsAssertion.validateTheElementIsDisplayed(joGuest.getNationalIdErrMsg(),webDriver);
        }
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Registered user can filling the shipping information and clicking on the Continue button correctly", priority = 19)
    public void verifyTheRegisteredUserCanFillTheShippingInformationCorrectly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
            cartPage.proceedToCheckout();
        try {
            DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getSavedAddressOption(), webDriver);
        }
        catch (Exception e) {
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
        DataHelperAndWait.waitForTime(2000);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getShippingMethodsOptionsSection(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify the shipping Fee retrieved correctly in the Shipping Methods screen ", priority = 20,enabled = false)
    public void verifyShippingFeeRetrievedCorrectlyInShippingMethodsScreen(){
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.validateTheShippingMethodAmount(guestCheckoutCyclePage.getFirstShippingMethodAmount(),guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping());
    }
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Shipping Methods screen is disable when no shipping method is selected", priority = 21)
    public void verifyContinueBtnAppearsInShippingMethodsIsDisableWhenNoMethodSelected() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
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
                    XmlReader.getXMLData("StreetTwoAddressName")
            );
        }
        DataHelperAndWait.waitForTime(2000);
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify Edit Shipping information button works fine", priority = 22)
    public void verifyTheEditShippingInfoBtnWorksFine() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
//        cartPage.navigateToHomePage();
//        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
//        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
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
                    XmlReader.getXMLData("StreetTwoAddressName")
            );
        }
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.waitForTime(2000);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 23)
    public void verifyAllShippingMethodsAppearCorrectly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage = new CartPage(webDriver);
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
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver,XmlReader.getXMLData("twoBusinessDay"));
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Same Day Delivery shipping method appears only for Dubai City", priority = 79)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
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
                    XmlReader.getXMLData("StreetTwoAddressName")
            );
            guestCheckoutCyclePage.setSelectDubaiCityCity();
        }
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        try{
        Assert.assertFalse(guestCheckoutCyclePage.getSameDayDelivery().isDisplayed());}
        catch (NoSuchElementException E){}
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSameDayDelivery(),webDriver);
    }
    //TODO:The Same Day Delivery is Missing
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the Same Day Delivery shipping method correctly", priority = 80)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() throws IOException {
        LocalTime currentTime = LocalTime.now();
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage = new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage= new CartPage(webDriver);
        // Set the target times to 2:00 AM and 2:00 PM
        LocalTime targetTimeAM = LocalTime.of(2, 0);
        LocalTime targetTimePM = LocalTime.of(14, 0);
        if (currentTime.isBefore(targetTimePM) && currentTime.isAfter(targetTimeAM))
        {
            System.out.println(currentTime);
            System.out.println("Current time is before 2:00 PM");
            cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
            cartPage.proceedToCheckout();
                DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getAddNewAddressBtn(),webDriver);
                checkoutForRegisteredPage.fillInShippingInformationInputField(
                        XmlReader.getXMLData("firstName"),
                        XmlReader.getXMLData("lastName"),
                        XmlReader.getXMLData("phoneNumber"),
                        XmlReader.getXMLData("AddressName"),
                        XmlReader.getXMLData("StreetOneAddressName"),
                        XmlReader.getXMLData("StreetTwoAddressName")
                );

                guestCheckoutCyclePage.setSelectDubaiCityCity();
            DataHelperAndWait.waitForTime(2000);
            guestCheckoutCyclePage.clickOnContinueBtn();
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        }
        else{
            System.out.println("Current time is after or equal to 2:00 PM");
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 25)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        EgyptGuestCheckoutCyclePage egypt= new EgyptGuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
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
        DataHelperAndWait.clickOnElement(egypt.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Payment Methods screen is disable when no shipping method is selected", priority = 26)
    public void verifyContinueBtnAppearsInPaymentMethodsIsDisableWhenNoMethodSelected() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
        //TODO: recheck the button after Moamen Solve ot
//        cartPage.navigateToCartPage();
        try{
            DataHelperAndWait.waitToBeVisible(registeredPage.getSavedAddressOption(),webDriver);
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
//        DataHelperAndWait.clickOnElement(egyptGuestCheckoutCyclePage.getNextDayMethod(),webDriver);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);

//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
//        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
//        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);

//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the 2 Business Days Super Express Shipping Method With COD Payment Method correctly", priority = 29)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
    }
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With COD Payment Method ", priority = 27)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        registeredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.waitTillLoaderComplete();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        guestCheckoutCyclePage.waitTillLoaderComplete();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);
        guestCheckoutCyclePage.waitTillCartSpinnerDisappear(webDriver);
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
       orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println("The order Number= "+orderNumber);
        registeredPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the 2 Business Days Super Express Shipping Method With Valid Credit Card Payment Method", priority = 28)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage= new CartPage(webDriver);
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
                    XmlReader.getXMLData("StreetTwoAddressName")
            );
        }
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With Credit Card Payment Method ", priority = 30)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
//        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
//        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
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
                DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 31)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
//        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
//        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
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
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCloseCheckoutErr(), webDriver);
    }
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when using a Free Coupon Code ", priority = 81)
    public void verifyAbilityToPlaceOrderWhenUsingFreeCouponCode() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        CheckoutForRegisteredPage registeredPage= new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
        cartPage.proceedToCheckout();

//        cartPage.navigateToHomePage();
//        cartPage.clickOnCartIcon();
        DataHelperAndWait.waitForUrlContains(guestCheckoutCyclePage.shippingInformationUrl,webDriver);
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
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        orderNumber= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println(orderNumber);
       cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(enabled = false,groups = {  "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the Add To Wish List Button works correctly and the added item appears correctly in the WishList screen ", priority = 7)
    public void verifyAddToWishListBtnWorksCorrectly() throws IOException {
         CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver);
        HeaderSection header=new HeaderSection(webDriver);
        AccountRegistrationPage registrationPage=new AccountRegistrationPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getAddToWishListBtn(),webDriver);
//        header.navigateToHomePage();
        header.navigateToHomePage();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        DataHelperAndWait.clickOnElement(registrationPage.getMyAccountOption(), webDriver);
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(checkoutForRegisteredPage.getWishListTab(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(checkoutForRegisteredPage.getAddedItemToWashList(),webDriver);


    }




}
