/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.guestCheckoutCycleTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.IraqGuestCheckoutCyclePage;
import sporter_pages.homepage_classes.IraqHomePage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.text.DecimalFormat;

@Getter
public class IraqGuestCheckoutCycleTestCases extends GuestCheckoutCycleTestCases{

    @BeforeClass(alwaysRun = true)
    public void switchToIraqStore() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        if (!webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
        }
        storeCountry="Iraq";
        countryCode="964";
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 5)
    public void verifyAllPaymentMethodAppearingTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 6)
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
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}:Verify All Shipping Methods appear correctly", priority = 21)
    public void verifyAllShippingMethodsAppearCorrectly(){
        IraqGuestCheckoutCyclePage guestCheckoutCyclePage = new IraqGuestCheckoutCyclePage(webDriver);
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver, XmlReader.getXMLData("twoBusinessDayIraq"));
        WebElementsAssertion.assertionWebElementEqualText(guestCheckoutCyclePage.getThreeFourBusinessDaysSuperExpressShipping(),webDriver, XmlReader.getXMLData("ThreeFourBusinessDaysShippingIraq"));
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that each of COD & Credit Card Payment methods appear correctly", priority = 23)
    public void verifyEachOfCODAndCreditCardPaymentMethodCorrectly() throws IOException {
        IraqGuestCheckoutCyclePage guestCheckoutCyclePage = new IraqGuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getCreditCardPaymentMethod(),webDriver);
        //TODO: PayPal Needs to recheck after activated it
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPayPal(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to select the Three Four Business Days Super Express Shipping Method With Valid Credit Card Payment Method", priority = 30)
    public void verifyAbilityToSelectTheThreeFourBusinessDaysSuperExpressShippingMethodWithValidCreditCardPaymentMethod() throws IOException {
        IraqGuestCheckoutCyclePage guestCheckoutCyclePage = new IraqGuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getThreeFourBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
        guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("testCreditCard"),XmlReader.getXMLData("creditCardDate"),XmlReader.getXMLData("testCVV"));
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure ability to place Order successfully when selecting Three Four Business Days Super Express Shipping Method With Credit Card Payment Method ", priority = 31)
    public void verifyAbilityToPlaceOrderWhenSelectingThreeFourBusinessDaysSuperExpressShippingMethodWithCreditCardPaymentMethod() throws IOException {
        IraqGuestCheckoutCyclePage guestCheckoutCyclePage = new IraqGuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
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
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(),webDriver);
        guestCheckoutCyclePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(enabled = false)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() {
    }
    @Test(enabled = false)
    public void verifySameDayShippingMethodAppearsForDubaiCityOnly() {
    }
    @Test(enabled = false)
    public void verifyAbilityToSelectSameDayShippingMethodCorrectly() {
    }
    @Test(enabled = false)
    public void verifyAbilityToPlaceOrderWhenSelecting2BusinessDaysSuperExpressShippingMethodWithCODPaymentMethod() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Verify All Aramex cites are listed in the CityMenu", priority = 101)
    public void verifyAllAramexCitiesAreListedInCityMenu() throws IOException {
        IraqGuestCheckoutCyclePage guestCheckoutCyclePage = new IraqGuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getCityMenu(), webDriver);
        DataHelperAndWait.waitForTime(400);
        guestCheckoutCyclePage.getCityMenu().click();
        for (WebElement e: guestCheckoutCyclePage.getCitiesOptions()){
            System.out.println(e.getText());
        }

    }
}
