/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.myAccountTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.JordanGuestCheckoutCyclePage;
import sporter_pages.homepage_classes.QatarHomePage;
import sporter_pages.myAccountPages.JordanMyAccountPage;
import sporter_pages.myAccountPages.MyAccountPage;
import xml_reader.XmlReader;

import java.io.IOException;

public class QatarMyAccountTestCases extends MyAccountTestCases {
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
        storeCountry = "Qatar";
        countryCode = "974";
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Addresses screen: Verify Ability to add new Address Correctly", priority = 23)
    public void verifyAbilityToAddNewAddressCorrectly() throws IOException {
        JordanMyAccountPage myAccountPage = new JordanMyAccountPage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getAddNewAddressBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
        myAccountPage.fillInNewAddressForm(XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID"));
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveAddressBtn(), webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString(myAccountPage.getAddressedUrl(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getAddNewAddressBtn(),webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify Inability to add new Address with incorrect Phone Number format", priority = 24)
    public void verifyInabilityToAddNewAddressWithIncorrectPhoneNumberFormat() throws IOException {
        JordanMyAccountPage myAccountPage = new JordanMyAccountPage(webDriver);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getAddNewAddressBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
        myAccountPage.fillInNewAddressForm(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("SmallPhoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveAddressBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify Inability to add new Address using invalid National ID", priority = 25)
    public void verifyInabilityToAddNewAddressUsingInvalidNationalID() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        JordanGuestCheckoutCyclePage joGuest = new JordanGuestCheckoutCyclePage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getAddNewAddressBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
        DataHelperAndWait.typeTextInElement(myAccountPage.getNationalIdField(), webDriver, "12");
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveAddressBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(joGuest.getNationalIdErrMsg(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify Inability to add new Address without filling the mandatory fields", priority = 26)
    public void verifyInabilityToAddNewAddressWithoutFillingTheMandatoryFields() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getAddNewAddressBtn(), webDriver);
//        DataHelperAndWait.clickOnElement(myAccountPage.getSaveAddressBtn(), webDriver);
        WebElementsAssertion.assertionElementNotEnable(myAccountPage.getSaveAddressBtn(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(), webDriver);
//        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getAddressErrMsg(), webDriver);
//        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getStreetlineOneErrMsg(), webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify the country code retrieves correctly in the Phone Number field", priority = 27)
    public void verifyCountryCodeRetrievesCorrectlyInThePhoneField() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getAddNewAddressBtn(), webDriver);
        WebElementsAssertion.assertionWebElementEqualText(myAccountPage.getCountryCodeField(), webDriver, countryCode);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify the country field retrieves the current country store", priority = 28)
    public void verifyCountryFieldRetrievesTheCurrentCountryStore() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getAddNewAddressBtn(), webDriver);
        WebElementsAssertion.assertionWebElementEqualText(myAccountPage.getCountryField(), webDriver, storeCountry);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Addresses screen: Verify Ability to edit Address Correctly", priority = 29)
    public void verifyAbilityToEditAddressCorrectly() throws IOException {
        JordanMyAccountPage myAccountPage = new JordanMyAccountPage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getEditAddressBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
        myAccountPage.fillInNewAddressForm(XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID"));
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveEditAddressBtn(), webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString(myAccountPage.getAddressedUrl(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getAddNewAddressBtn(),webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify Inability to EditAddress with incorrect Phone Number format", priority = 30)
    public void verifyInabilityToEditAddressWithIncorrectPhoneNumberFormat() throws IOException {
        JordanMyAccountPage myAccountPage = new JordanMyAccountPage(webDriver);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getEditAddressBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        myAccountPage.fillInNewAddressForm(
//                XmlReader.getXMLData("firstName"),
//                XmlReader.getXMLData("lastName"),
//                XmlReader.getXMLData("SmallPhoneNumber"),
//                XmlReader.getXMLData("AddressName"),
//                XmlReader.getXMLData("StreetOneAddressName"),
//                XmlReader.getXMLData("StreetTwoAddressName"),
//                XmlReader.getXMLData("nationalID"));
        DataHelperAndWait.waitToBeVisible(myAccountPage.getPhoneFieldInAddress(), webDriver);
        DataHelperAndWait.updateAllText(myAccountPage.getPhoneFieldInAddress(), XmlReader.getXMLData("SmallPhoneNumber"));
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveEditAddressBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(), webDriver);
    }
}
