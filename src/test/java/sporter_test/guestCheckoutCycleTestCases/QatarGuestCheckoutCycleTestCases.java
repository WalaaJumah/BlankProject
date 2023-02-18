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
            CloseInitialDialog();
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
    @Test(groups = {"Guest User Page", "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Make sure the Guest user cannot submit the shipping information without filling the required fields empty", priority = 13)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWithoutFillingTheRequiredFields() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        QatarGuestCheckoutCyclePage qa= new QatarGuestCheckoutCyclePage(webDriver);
        qa.fillInShippingInformationInputField(" ", " ", " ", " ", " ", " ", "");
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getFirstnameErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getLastNameErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getEmailErrMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(qa.getNationalIdErrMsg(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(qa.getAddressErrMsg(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(qa.getStreetlineErrMsg(),webDriver);
    }
    @Test(groups = {"Guest User Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}:Make sure the Guest user cannot submit the shipping information when the phone number length is small ", priority = 15)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationWhenPhoneFieldHaveSmallTextLength() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        QatarGuestCheckoutCyclePage qa= new QatarGuestCheckoutCyclePage(webDriver);
        qa.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("SmallPhoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        guestCheckoutCyclePage.clickOnContinueBtn();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(),webDriver);
    }
    @Test(groups = {"Guest User Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Make sure the Guest user can filling the shipping information and clicking on the Continue button correctly", priority = 17)
    public void verifyTheGuestUserCanFillTheShippingInformationCorrectly() {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        QatarGuestCheckoutCyclePage qa= new QatarGuestCheckoutCyclePage(webDriver);
        qa.navigateToShippingMethodsPage();
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getShippingMethodsOptionsSection(),webDriver);
    }
    @Test(groups = {"Cart Page", "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 6)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        DecimalFormat df = new DecimalFormat("0.00");
        cartPage.navigateToCartPage();
        double subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver,"QAR");
        double tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver,"QAR");
        double orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver,"QAR");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(df.format(orderTotal), df.format(cartTotal));
    }
}
