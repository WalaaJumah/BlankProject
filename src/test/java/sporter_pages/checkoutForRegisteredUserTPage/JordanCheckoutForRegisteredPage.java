/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.checkoutForRegisteredUserTPage;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.cartPages.CartPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.JordanGuestCheckoutCyclePage;
import sporter_pages.myAccountPages.QatarMyAccountPage;
import xml_reader.XmlReader;

import java.io.IOException;

public class JordanCheckoutForRegisteredPage extends CheckoutForRegisteredPage {
    public JordanCheckoutForRegisteredPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void fillInShippingInformationInputField(String firstName, String lastName, String phone, String address, String streetLineOne, String streetLineTwo, String nationalID) {
        JordanGuestCheckoutCyclePage guestCheckoutCyclePage = new JordanGuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFirstNameField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getFirstNameField(), firstName);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getLastNameField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getLastNameField(), lastName);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getPhoneField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getPhoneField(), phone);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getAddressNameField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getAddressNameField(), address);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getStreetLineOneField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getStreetLineOneField(), streetLineOne);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getStreetLineTwoField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getStreetLineTwoField(), streetLineTwo);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getNationalIDField(), webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getNationalIDField(), nationalID);
        guestCheckoutCyclePage.selectCity();
        if(webDriver.getCurrentUrl().contains("-qa/")){
            QatarMyAccountPage qatarMyAccountPage= new QatarMyAccountPage(webDriver);
            qatarMyAccountPage.selectFirstOptionInAreaMenu();
        }
    }

    public void navigateToShippingMethodsPage() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        guestCheckoutCyclePage.setSelectDubaiCityCity();
        guestCheckoutCyclePage.clickOnContinueBtn();
    }

    public void viewCartAndAccessShippingMethodsPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        cartPage.navigateToCartPage();
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        guestCheckoutCyclePage.setSelectDubaiCityCity();
        guestCheckoutCyclePage.clickOnContinueBtn();
    }

    public void AddToCartAndAccessShippingMethodsPageForSavedAddress() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        cartPage.proceedToCheckout();
        try {
            this.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("phoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"),
                    XmlReader.getXMLData("nationalID")

            );
        } catch (Exception e) {
            DataHelperAndWait.clickOnElement(this.getSavedAddressOption(), webDriver);
        }
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(), webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
    }
}
