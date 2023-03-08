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
        try{
            cartPage.clearCart();}
        catch (Exception e){
            System.out.println("");
        }
        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(),webDriver);
        try{
            DataHelperAndWait.clickOnElement(this.getSavedAddressOption(),webDriver);
        }
        catch (Exception e){
            this.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("phoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"));
        }
        guestCheckoutCyclePage.clickOnContinueBtn();
    }
}
