/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.myAccountTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.JordanGuestCheckoutCyclePage;
import sporter_pages.loginPage.LoginPage;
import sporter_pages.myAccountPages.MyAccountPage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.io.IOException;

@Test(groups = "2.12 My Account Screens")

public class MyAccountTestCases extends BaseTest {
    String storeCountry;
    String countryCode;

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Verify all My account options appear correctly ", priority = 1)
    public void verifyAllMyAccountOptionsAppearCorrectly() throws IOException {
        LoginPage loginPage = new LoginPage(webDriver);
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        loginPage.navigateToLoginPage();
        loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail2"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
        DataHelperAndWait.waitForTime(2000);
        try{
        DataHelperAndWait.clickOnElement(myAccountPage.getAccountProfileIcon(), webDriver);
//        DataHelperAndWait.clickOnElement(myAccountPage.getAccountProfileIcon(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getMyAccountOption(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getMyOrdersOption(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getMyRewardsOption(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getLogoutOption(), webDriver);}
        catch (Exception e){
            DataHelperAndWait.clickOnElement(myAccountPage.getAccountProfileIcon(), webDriver);
//        DataHelperAndWait.clickOnElement(myAccountPage.getAccountProfileIcon(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getMyAccountOption(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getMyOrdersOption(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getMyRewardsOption(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getLogoutOption(), webDriver);
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify clicking on My Account Option redirect the user to the correct Page ", priority = 2)
    public void verifyClickingOnMyAccountOptionsWorksCorrectly() {
        LoginPage loginPage = new LoginPage(webDriver);
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        try{
        myAccountPage.navigateToHomePage();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(myAccountPage.getAccountProfileIcon(), webDriver);
//        DataHelperAndWait.hoverOnElementAndClick(myAccountPage.getAccountProfileIcon(), webDriver);
        DataHelperAndWait.clickOnElement(myAccountPage.getMyAccountOption(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(myAccountPage.getMyAccountURL(), webDriver);}
        catch (Exception e){
            myAccountPage.navigateToHomePage();
            DataHelperAndWait.waitForTime(2000);
            DataHelperAndWait.clickOnElement(myAccountPage.getAccountProfileIcon(), webDriver);
//        DataHelperAndWait.hoverOnElementAndClick(myAccountPage.getAccountProfileIcon(), webDriver);
            DataHelperAndWait.clickOnElement(myAccountPage.getMyAccountOption(), webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString(myAccountPage.getMyAccountURL(), webDriver);
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify clicking on My Orders Option redirect the user to the correct Page ", priority = 3)
    public void verifyClickingOnMyOrdersOptionsWorksCorrectly() {
        LoginPage loginPage = new LoginPage(webDriver);
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToHomePage();
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.clickOnElement(myAccountPage.getAccountProfileIcon(), webDriver);
        DataHelperAndWait.clickOnElement(myAccountPage.getMyOrdersOption(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(myAccountPage.getRecentOrdersURL(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Verify clicking on My Rewards Option redirect the user to the correct Page ", priority = 4)
    public void verifyClickingOnMyRewardsOptionsWorksCorrectly() {
        LoginPage loginPage = new LoginPage(webDriver);
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToHomePage();
        DataHelperAndWait.waitForTime(1500);
        myAccountPage.navigateToHomePage();
        String homepageLink = webDriver.getCurrentUrl();
        DataHelperAndWait.clickOnElement(myAccountPage.getAccountProfileIcon(), webDriver);
        DataHelperAndWait.clickOnElement(myAccountPage.getMyRewardsOption(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlNotContainsString(homepageLink, webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Account Information screen: Verify Email displays the correct email ", priority = 5)
    public void verifyEmailFieldIsDisableAndRetrieveCorrectEmail() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyAccountPage();
        WebElementsAssertion.assertionElementNotEnable(myAccountPage.getEmailField(), webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(myAccountPage.getEmailField(), webDriver, "value", XmlReader.getXMLData("correctEmail2"));
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Account Information screen: Verify each of First Name & Last Name field are display the correct name ", priority = 6)
    public void verifyFirstNameAndLastNameFieldRetrieveCorrectNames() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyAccountPage();
        Assert.assertFalse(myAccountPage.getFirstNameField().getAttribute("value").isEmpty());
        Assert.assertFalse(myAccountPage.getLastNameField().getAttribute("value").isEmpty());
//        WebElementsAssertion.assertionAttributeTrueForElement(myAccountPage.getFirstNameField(),webDriver,"value",XmlReader.getXMLData("firstName"));
//        WebElementsAssertion.assertionAttributeTrueForElement(myAccountPage.getLastNameField(),webDriver,"value",XmlReader.getXMLData("lastName"));
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Account Information screen: Verify inability to edit the email", priority = 7)
    public void verifyEmailFieldRetrieveCorrectEmail() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyAccountPage();
        WebElementsAssertion.assertionElementNotEnable(myAccountPage.getEmailField(), webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Account Information screen: Verify ability to edit First Name & Last Name correctly", priority = 8)
    public void verifyAbilityToEditFirstNameAndLastNameCorrectly() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyAccountPage();
        DataHelperAndWait.updateAllText(myAccountPage.getFirstNameField(), XmlReader.getXMLData("firstName"));
        DataHelperAndWait.updateAllText(myAccountPage.getLastNameField(), XmlReader.getXMLData("lastName"));
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveAccountInfoBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.assertionAttributeTrueForElement(myAccountPage.getFirstNameField(), webDriver, "value", XmlReader.getXMLData("firstName"));
        WebElementsAssertion.assertionAttributeTrueForElement(myAccountPage.getLastNameField(), webDriver, "value", XmlReader.getXMLData("lastName"));
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Account Information screen: Verify ability to edit the account Information by selecting Male Gender", priority = 9)
    public void verifyAbilityToEditTheAccountInformationBySelectingMaleGender() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyAccountPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getMaleGender(), webDriver);
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveAccountInfoBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Account Information screen: Verify ability to edit the account Information by selecting Female Gender", priority = 10)
    public void verifyAbilityToEditTheAccountInformationBySelectingFemaleGender() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyAccountPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getFemaleGender(), webDriver);
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveAccountInfoBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Account Information screen: Verify clicking On the Change Password check box will display each of Old, New, Confirm New Password fields ", priority = 11)
    public void verifyPasswordsFieldsAppearWhenClickingOnChangePasswordCheckbox() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyAccountPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getChangePasswordBox(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getOldPasswordField(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getNewPasswordField(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getConfirmNebPasswordField(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: NewsLetter Subscription screen: Verify ability to access NewsLetter Subscription screen correctly ", priority = 12)
    public void verifyAbilityToAccessNewsLetterSubscriptionPage() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToNewsLetterSubscriptionPage();
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getGeneralSubscriptionOption(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: NewsLetter Subscription screen: Verify ability to subscribe with the Sporter NewsLetter correctly  ", priority = 13)
    public void verifyAbilityToSubscribeWNewsLetterSubscriptionPage() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToNewsLetterSubscriptionPage();
        if (myAccountPage.getGeneralSubscriptionOption().getAttribute("class").contains("checkbox_inactive")) {
            DataHelperAndWait.clickOnElement(myAccountPage.getGeneralSubscriptionOption(), webDriver);
            DataHelperAndWait.clickOnElement(myAccountPage.getSubmitNewsLetterBtn(), webDriver);
            Assert.assertTrue(myAccountPage.getGeneralSubscriptionOption().getAttribute("class").contains("checkbox_active"));
        } else {
            DataHelperAndWait.clickOnElement(myAccountPage.getGeneralSubscriptionOption(), webDriver);
            DataHelperAndWait.clickOnElement(myAccountPage.getSubmitNewsLetterBtn(), webDriver);
            Assert.assertTrue(myAccountPage.getGeneralSubscriptionOption().getAttribute("class").contains("checkbox_inactive"));
        }
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: NewsLetter Subscription screen: Verify ability to unsubscribe with the Sporter NewsLetter correctly  ", priority = 14)
    public void verifyAbilityToUnSubscribeWNewsLetterSubscriptionPage() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToNewsLetterSubscriptionPage();
        if (myAccountPage.getGeneralSubscriptionOption().getAttribute("class").contains("checkbox_inactive")) {
            DataHelperAndWait.clickOnElement(myAccountPage.getGeneralSubscriptionOption(), webDriver);
            DataHelperAndWait.clickOnElement(myAccountPage.getSubmitNewsLetterBtn(), webDriver);
            Assert.assertTrue(myAccountPage.getGeneralSubscriptionOption().getAttribute("class").contains("checkbox_active"));
        } else {
            DataHelperAndWait.clickOnElement(myAccountPage.getGeneralSubscriptionOption(), webDriver);
            DataHelperAndWait.clickOnElement(myAccountPage.getSubmitNewsLetterBtn(), webDriver);
            Assert.assertTrue(myAccountPage.getGeneralSubscriptionOption().getAttribute("class").contains("checkbox_inactive"));
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Order History screen: Verify each of Order Details & invoice buttons appear correctly in the Orders History Page  ", priority = 15)
    public void verifyEachOfOrderDetailsAndInvoiceBtnsAppearCorrectlyInOrdersPage() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyOrdersPage();
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getOrderDetailsBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(myAccountPage.getInvoiceBtn(), webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Order History screen: Verify the Order Details button works correctly", priority = 16)
    public void verifyOrderDetailsPageWorksCorrectly() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyOrdersPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getOrderDetailsBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Order History screen: Verify the invoice button works correctly", priority = 17)
    public void verifyInvoicePageWorksCorrectly() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyOrdersPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getInvoiceBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Order History screen: Verify clicking on the product name redirect the user to the product details page", priority = 18)
    public void verifyClickingOnProductNameRedirectUserToTheOrderDetailsPage() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        myAccountPage.navigateToMyOrdersPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getProductNameInOrdersPage(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductName(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Order History screen: Verify Print Order button works correctly", priority = 19)
    public void verifyPrintOrderBtnWorksCorrectly() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToMyOrdersPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getOrderDetailsBtn(), webDriver);
        DataHelperAndWait.clickOnElement(myAccountPage.getOrderPrintBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Order History screen: Verify Ability to access Orders Tab correctly", priority = 20)
    public void verifyAbilityToAccessOrdersTabsCorrectly() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToAllOrdersPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getOrdersTab(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Order History screen: Verify Ability to access Open Orders Tab correctly", priority = 21)
    public void verifyAbilityToAccessOpenOrdersTabsCorrectly() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToAllOrdersPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getOpenOrdersTab(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Order History screen: Verify Ability to access Canceled Orders Tab correctly", priority = 22)
    public void verifyAbilityToAccessCanceledOrdersTabsCorrectly() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToAllOrdersPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getCanceledOrdersTab(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Addresses screen: Verify Ability to add new Address Correctly", priority = 23)
    public void verifyAbilityToAddNewAddressCorrectly() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getAddNewAddressBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
        myAccountPage.fillInNewAddressForm(XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveAddressBtn(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(myAccountPage.getAddressedUrl(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify Inability to add new Address with incorrect Phone Number format", priority = 24)
    public void verifyInabilityToAddNewAddressWithIncorrectPhoneNumberFormat() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
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
                XmlReader.getXMLData("StreetTwoAddressName")
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

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify Inability to add new Address without filling the mandatory fields", priority = 26)
    public void verifyInabilityToAddNewAddressWithoutFillingTheMandatoryFields() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getAddNewAddressBtn(), webDriver);
        DataHelperAndWait.waitToBeVisible(myAccountPage.getSaveAddressBtn(), webDriver);
        Assert.assertFalse(myAccountPage.getSaveAddressBtn().isEnabled());
//        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(), webDriver);
//        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getAddressErrMsg(), webDriver);
//        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(guestCheckoutCyclePage.getStreetlineOneErrMsg(), webDriver);
    }

    @Test(groups ={ "1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify the country code retrieves correctly in the Phone Number field", priority = 27)
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
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getEditAddressBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
        myAccountPage.fillInNewAddressForm(XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"));
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveEditAddressBtn(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(myAccountPage.getAddressedUrl(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify Inability to EditAddress with incorrect Phone Number format", priority = 30)
    public void verifyInabilityToEditAddressWithIncorrectPhoneNumberFormat() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
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
//                XmlReader.getXMLData("StreetTwoAddressName")
//        );
        DataHelperAndWait.waitToBeVisible(myAccountPage.getPhoneFieldInAddress(), webDriver);
        DataHelperAndWait.updateAllText(myAccountPage.getPhoneFieldInAddress(), XmlReader.getXMLData("SmallPhoneNumber"));
        DataHelperAndWait.clickOnElement(myAccountPage.getSaveEditAddressBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getPhoneErrMsg(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify Inability to Edit Address using invalid National ID", priority = 31)
    public void verifyInabilityToEditAddressUsingInvalidNationalID() throws IOException {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        JordanGuestCheckoutCyclePage joGuest = new JordanGuestCheckoutCyclePage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(myAccountPage.getEditAddressBtn(), webDriver);
        myAccountPage.verifyTheDisplayedPageDoesNotHaveErrors();
        DataHelperAndWait.typeTextInElement(myAccountPage.getNationalIdField(), webDriver, "12");
//        DataHelperAndWait.clickOnElement(myAccountPage.getSaveEditAddressBtn(), webDriver);
        WebElementsAssertion.assertionElementNotEnable(myAccountPage.getSaveEditAddressBtn(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(joGuest.getNationalIdErrMsg(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify the country code retrieves correctly in the Phone Number field when editing the Address", priority = 32)
    public void verifyCountryCodeRetrievesCorrectlyInThePhoneFieldWhenEditingTheAddress() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getAddNewAddressBtn(), webDriver);
        WebElementsAssertion.assertionWebElementEqualText(myAccountPage.getCountryCodeField(), webDriver, countryCode);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Addresses screen: Verify the country field retrieves the current country store when editing the Address", priority = 33)
    public void verifyCountryFieldRetrievesTheCurrentCountryStoreWhenEditingTheAddress() {
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.navigateToAddressesPage();
        DataHelperAndWait.clickOnElement(myAccountPage.getAddNewAddressBtn(), webDriver);
        WebElementsAssertion.assertionWebElementEqualText(myAccountPage.getCountryField(), webDriver, storeCountry);
    }
}
