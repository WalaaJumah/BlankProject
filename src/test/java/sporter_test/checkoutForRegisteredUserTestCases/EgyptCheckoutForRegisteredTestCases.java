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
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.checkoutForRegisteredUserTPage.CheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.homepage_classes.EgyptHomePage;
import xml_reader.XmlReader;

import java.text.DecimalFormat;
import java.util.Set;

public class EgyptCheckoutForRegisteredTestCases  extends CheckoutForRegisteredTestCases {
    @BeforeClass(alwaysRun=true)
    public void switchToEgyptStore(){
        EgyptHomePage egyptHomePage=new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if(webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)){
            System.out.println("You are in Egypt Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+egyptHomePage.egyptDomain);
            CloseInitialDialog();          }
        storeCountry="Egypt";
       countryCode="20";
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 9)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        DecimalFormat df = new DecimalFormat("0.00");
        cartPage.navigateToCartPage();
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"EGP");
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"EGP");
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,"EGP");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal));
    }
@Test(enabled = false)
public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() {}
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to select the Next Day Delivery With COD Payment Method correctly", priority = 27)
    public void verifyAbilityToSelectTheNextDayDeliveryWithCODPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCODPaymentMethod(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Next Day Delivery With COD Payment Method ", priority = 28)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDayDeliveryWithCODPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        orderNumberCOD= DataHelperAndWait.extractDigitsFromString(guestCheckoutCyclePage.getSuccessPage(),webDriver);
        System.out.println(orderNumberCOD);
    }
    @Test(enabled = false)
    public void verifyAbilityToSelectThe2BusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() {}
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to select the Next Day Delivery With Valid Credit Card Payment Method", priority = 29)
    public void verifyAbilityToSelectTheNextDayDeliveryWithValidCreditCardPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartPage();
        cartPage.removeItem();
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddress();
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Next Day Delivery With Credit Card Payment Method ", priority = 30)
    public void verifyAbilityToPlaceOrderWhenSelectingNextDayDeliveryWithCreditCardPaymentMethod() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
//        DataHelperAndWait.waitForTime(2000);
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
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() { }
    @Test(groups = {"2.02 Checkout Cycle( Registered User)","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 78)
    public void verifyAllShippingMethodsAppearCorrectly(){
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage checkoutForRegisteredPage= new CheckoutForRegisteredPage(webDriver);
        checkoutForRegisteredPage.AddToCartAndAccessShippingMethodsPageForSavedAddressForDubaiCity();
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver,XmlReader.getXMLData("twoBusinessDay"));
    }
    @Test(enabled = false)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {  }
    //TODO:The Same Day Delivery is Missing
    @Test(enabled = false)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {}

}
