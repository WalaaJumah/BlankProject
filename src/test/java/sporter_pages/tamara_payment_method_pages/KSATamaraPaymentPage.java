/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.tamara_payment_method_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.KSAGuestCheckoutCyclePage;
import xml_reader.XmlReader;

public class KSATamaraPaymentPage extends TamaraPaymentPage {
    public KSATamaraPaymentPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public void addToCartAndAccessTamaraDashboardForDooToDoor() throws Exception {
        KSAGuestCheckoutCyclePage guestCheckoutCyclePage= new KSAGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        displayProductAndAddToCart();
        accessShippingFormForGuestViaURL();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("UAEPhoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getDoorToDoorMethod(), webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
        SelectTamaraInstallmentsMethod();
        clickOnFinalPlaceOrderBtn();
        submitEmailAndPhoneNumberInPositiveFlow();
        DataHelperAndWait.waitForTime(2500);
    }
    public void addToCartAndAccessTamaraDashboardForPickUpInStore() throws Exception {
        KSAGuestCheckoutCyclePage guestCheckoutCyclePage= new KSAGuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        displayProductAndAddToCart();
        accessShippingFormForGuestViaURL();
        guestCheckoutCyclePage.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("UAEPhoneNumber"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("ksaPhoneNumber")
        );
        DataHelperAndWait.waitForTime(2000);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getPickupInStoreMethod(), webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
        SelectTamaraInstallmentsMethod();
        clickOnFinalPlaceOrderBtn();
        submitEmailAndPhoneNumberInPositiveFlow();
        DataHelperAndWait.waitForTime(2500);
    }

}
