/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.guestCheckoutCycleTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEGuestUserPage;
import sporter_pages.cartPages.CartPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.text.DecimalFormat;

@Test(groups = "2.01 Checkout Cycle( Guest User)")
public class GuestCheckoutCycleTestCases extends BaseTest {
    String storeCountry;
    String countryCode;

    @Test(groups = {"1.1 Critical Severity"}, description = "{{CountryName}}:Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 1)
    public void keepShoppingAfterAddingToTheCart() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.keepShoppingAfterAddingToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(), webDriver);
    }

    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify ability to remove the product from the cart successfully", priority = 2)
    public void verifyAbilityToRemoveProductFromCart() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        cartPage.removeItem();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(), webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure to add product to the Cart from Product Details Page", priority = 3)
    public void addToCartAndViewCartFromPDP() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure to view the Cart using cart icon appearing at the top of screen", priority = 4)
    public void viewCartFromCartIcon() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getViewCartInCartPopup(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
        cartPage.removeItem();
    }

    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 5)
    public void verifyAllPaymentMethodAppearingTheCartPage() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCODOption(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
    }

    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 6)
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

    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the Proceed to checkout button appears in the cart page works correctly", priority = 7)
    public void verifyProceedCheckoutBtnAppearingInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.shippingInformationUrl, webDriver);
    }

    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that the Proceed to checkout button appearing in the Cart pop-up works correctly", priority = 8)
    public void verifyProceedCheckoutBtnAppearingInCartPopUpWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.shippingInformationUrl, webDriver);
    }

    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure All sections appear correctly in the Checkout Method screen", priority = 9)
    public void verifyAllFieldsAppearCorrectlyInCheckoutMethodScreen() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.navigateToCheckoutPage();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCheckoutMethodLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCheckoutAsGuestHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCheckoutAsGuestDescription(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCheckoutAsGuestBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getShippingInformationLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getShippingMethodLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPaymentInformationLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getOrderReviewLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSecuredCheckoutLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getOrderTotalValue(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPlaceOrderBtn(), webDriver);
    }

    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the Place Order button appears in the Checkout Method screen is disable", priority = 10)
    public void verifyPlaceOrderBtnAppearsInCheckoutMethodIsDisable() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getPlaceOrderBtn(), webDriver);
    }

    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the Checkout As A Guest button redirect the User to the Shipping information Form", priority = 11)
    public void verifyClickingOnCheckOutAsGuestUserBtnRedirectTheUserToShippingInformationForm() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.navigateToCheckoutPage();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCheckoutAsGuestBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getRegisterAtSporterOption(), webDriver);
    }

    @Test(groups = {"Guest User Page", "All Smoke Testing Result", "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the system fills the store country by default in the country field in the shipping information form", priority = 12)
    public void verifyTheCountryRetrievedInCountryFieldBasedOnStoreCountry() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionTextIsEqual(guestCheckoutCyclePage.getCountryMenu(), webDriver, storeCountry);
    }

    @Test(groups = {"Guest User Page", "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Make sure the Guest user cannot submit the shipping information without filling the required fields empty", priority = 13)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWithoutFillingTheRequiredFields() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.fillInShippingInformationInputField(" ", " ", " ", " ", " ", " ", "");
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getFirstnameErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getLastNameErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getEmailErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getAddressErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getStreetlineOneErrMsg(), webDriver);
    }
    @Test(groups = {"Guest User Page", "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Make sure the County Code retrieved correctly in the Phone Field", priority = 14)
    public void verifyTheCorrectCountyCodeRetrievedCorrectlyInPhoneField() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getCountryCode(),webDriver,countryCode);
    }
    @Test(groups = {"Guest User Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Guest user cannot submit the shipping information when the phone number length is small ", priority = 15)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWhenPhoneFieldHaveSmallTextLength() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(),webDriver);
    }
      @Test(groups = {"Guest User Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Guest user cannot submit the shipping information using invalid email format", priority = 16)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidEmailFormat() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("incorrectEmailFormate"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFirstNameField(),webDriver);
    }
    @Test(groups = {"Guest User Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Make sure the Guest user can filling the shipping information and clicking on the Continue button correctly", priority = 17)
    public void verifyTheGuestUserCanFillTheShippingInformationCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.navigateToShippingMethodsPage();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getShippingMethodsOptionsSection(),webDriver);
    }
    @Test(groups = {"Guest User Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Verify Edit Shipping information button works fine", priority = 18)
    public void verifyTheEditShippingInfoBtnWorksFine() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getEditShippingInfoBtn(),webDriver);
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getEditShippingInfoBtn(),webDriver);
    }
    @Test(groups = {"Guest User Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 19)
    public void verifyAllShippingMethodsAppearCorrectly(){
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver,XmlReader.getXMLData("twoBusinessDay"));
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getSameDayDelivery(),webDriver,XmlReader.getXMLData("sameDayDelivery"));
    }
    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Shipping Methods screen is disable when no shipping method is selected", priority = 20)
    public void verifyContinueBtnAppearsInShippingMethodsIsDisableWhenNoMethodSelected() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
    }
    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the 2 Business Days Super Express Shipping\n" +
            "Cash on Delivery Service Available shipping method correctly", priority = 21)
    public void verifyAbilityToSelect2BusinessDaysShippingMethodCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(),webDriver);
    }
    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the Same Day Delivery shipping method appears only for Dubai City", priority = 79)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getEditShippingInfoBtn(),webDriver);
        guestCheckoutCyclePage.SelectAbuDhabiCityCity();
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSameDayDelivery(),webDriver);
    }
    //TODO:The Same Day Delivery is Missing
    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the customer is able to select the Same Day Delivery shipping method correctly", priority = 80)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getSameDayDelivery(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(),webDriver);
    }
    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 22)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
    }
    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the Continue button appears in the Payment Methods screen is disable when no shipping method is selected", priority = 23)
    public void verifyContinueBtnAppearsInPaymentMethodsIsDisableWhenNoMethodSelected() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionElementNotEnable(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
    }
    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to select the 2 Business Days Super Express Shipping Method With COD Payment Method correctly", priority = 24)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting 2 Business Days Super Express Shipping Method With COD Payment Method ", priority = 25)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
    }



}
