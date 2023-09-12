/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.checkoutForRegisteredUserTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.Getter;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.checkoutForRegisteredUserTPage.CheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.EgyptGuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.IraqGuestCheckoutCyclePage;
import sporter_pages.homepage_classes.IraqHomePage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.text.DecimalFormat;

@Getter
public class IraqCheckoutForRegisteredTestCases extends CheckoutForRegisteredTestCases{

    @BeforeClass(alwaysRun = true)
    public void switchToIraqStore() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        if (!webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
        }
        countryCode="964";
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 21)
    public void verifyAllShippingMethodsAppearCorrectly(){
        IraqGuestCheckoutCyclePage guestCheckoutCyclePage = new IraqGuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getThreeFourBusinessDaysSuperExpressShipping(),webDriver, XmlReader.getXMLData("ThreeFourBusinessDaysShippingIraq"));
        Assert.assertFalse(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping().isDisplayed(),"TwoBusinessDaysSuperExpressShipping is displayed");
    }
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(enabled = false)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {}
    @Test(enabled = false)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {}
    @Test(enabled = false)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() {}
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 23)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() throws IOException {
        IraqGuestCheckoutCyclePage guestCheckoutCyclePage = new IraqGuestCheckoutCyclePage(webDriver);
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
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPayPal(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Three Four Business Days Super Express Shipping Method With Valid Credit Card Payment Method", priority = 28)
    public void verifyAbilityToSelectTheThreeFourBusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() throws IOException {
        IraqGuestCheckoutCyclePage guestCheckoutCyclePage = new IraqGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getThreeFourBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Three Four Business Days Super Express Shipping Method With Credit Card Payment Method ", priority = 29)
    public void verifyAbilityToPlaceOrderWhenSelectingThreeFourBusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() throws IOException {
        IraqGuestCheckoutCyclePage guestCheckoutCyclePage = new IraqGuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getThreeFourBusinessDaysSuperExpressShipping(),webDriver);
        try {
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
        }
        catch (Exception e){
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
        }
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
guestCheckoutCyclePage.clickOnPlaceOrderBtn();
        guestCheckoutCyclePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 9)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        DecimalFormat df = new DecimalFormat("0.00");
        cartPage.navigateToCartPage();
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,cartPage.iraqCurrency);
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,cartPage.iraqCurrency);
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,cartPage.iraqCurrency);
        double cartTotal = subTotal + tax;
        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal));
    }
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() {}
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() {}
}
