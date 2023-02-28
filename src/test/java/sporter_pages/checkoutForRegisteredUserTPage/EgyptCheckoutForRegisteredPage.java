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
import xml_reader.XmlReader;

public class EgyptCheckoutForRegisteredPage extends CheckoutForRegisteredPage {
    public EgyptCheckoutForRegisteredPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public void AddToCartAndAccessShippingMethodsPageForEgypt(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage=new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(getAddNewAddressBtn(),webDriver);
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        this.setSelectDubaiCityCity();
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
    }
}
