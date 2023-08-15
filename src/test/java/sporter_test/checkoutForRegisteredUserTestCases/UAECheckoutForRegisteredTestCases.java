/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.checkoutForRegisteredUserTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.checkoutForRegisteredUserTPage.CheckoutForRegisteredPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.homepage_classes.UAEHomePage;
import xml_reader.XmlReader;

import java.io.IOException;

public class UAECheckoutForRegisteredTestCases extends CheckoutForRegisteredTestCases {
    @BeforeClass(alwaysRun=true)
    public void switchToUAEStore(){
        UAEHomePage uaeHomePage=new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if(webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+uaeHomePage.aeDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
        storeCountry="United Arab Emirates";
        countryCode="971";
    }
     @Test(enabled = false)
     public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() {}
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure Inability to continue the placing order process using invalid Credit Card", priority = 31)
    public void verifyInabilityToUseInvalidCreditCardPaymentMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CheckoutForRegisteredPage registeredPage = new CheckoutForRegisteredPage(webDriver,guestCheckoutCyclePage);
        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
            try {
                DataHelperAndWait.clickOnElement(registeredPage.getSavedAddressOption(), webDriver);
            } catch (Exception e) {
                registeredPage.fillInShippingInformationInputField(
                        XmlReader.getXMLData("firstName"),
                        XmlReader.getXMLData("lastName"),
                        XmlReader.getXMLData("phoneNumber"),
                        XmlReader.getXMLData("AddressName"),
                        XmlReader.getXMLData("StreetOneAddressName"),
                        XmlReader.getXMLData("StreetTwoAddressName"));
            }
            DataHelperAndWait.waitForTime(2000);
            DataHelperAndWait.waitForTime(2000);
            guestCheckoutCyclePage.clickOnContinueBtn();
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
            guestCheckoutCyclePage.submitCreditCard(XmlReader.getXMLData("invalidCreditCard"), XmlReader.getXMLData("creditCardDate"), XmlReader.getXMLData("testCVV"));
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCloseCheckoutErr(), webDriver);

    }

}
