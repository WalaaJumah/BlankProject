/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.checkoutForRegisteredUserTPage;

import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.JordanGuestCheckoutCyclePage;
import sporter_pages.guestCheckoutCyclePages.QatarGuestCheckoutCyclePage;
import xml_reader.XmlReader;
@Getter

public class QatarCheckoutForRegisteredPage extends CheckoutForRegisteredPage {
    public QatarCheckoutForRegisteredPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(id="flatrate")
    private WebElement fourFiveBussinessDay;
    public void fillInShippingInformationInputField(String firstName, String lastName, String phone, String address, String streetLineOne, String streetLineTwo,String nationalID) {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        JordanGuestCheckoutCyclePage jo=new JordanGuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFirstNameField(),webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getFirstNameField(),firstName);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getLastNameField() ,webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getLastNameField(),lastName);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getPhoneField() ,webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getPhoneField(),phone);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getAddressNameField() ,webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getAddressNameField(),address);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getStreetLineOneField() ,webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getStreetLineOneField(),streetLineOne);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getStreetLineTwoField() ,webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getStreetLineTwoField(),streetLineTwo);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getStreetLineTwoField() ,webDriver);
        DataHelperAndWait.updateAllText(guestCheckoutCyclePage.getStreetLineTwoField(),streetLineTwo);
        DataHelperAndWait.waitToBeVisible(jo.getNationalIDField() ,webDriver);
        DataHelperAndWait.updateAllText(jo.getNationalIDField(),nationalID);
    }
    public void AddToCartAndAccessShippingMethodsPageForSavedAddress(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        QatarCheckoutForRegisteredPage qa= new QatarCheckoutForRegisteredPage(webDriver);
        CartPage cartPage=new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
        try{
            this.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("qatarPhoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName"),
                    XmlReader.getXMLData("nationalID")

            );
        }
        catch (Exception e){
            DataHelperAndWait.clickOnElement(this.getSavedAddressOption(),webDriver);
        }
                DataHelperAndWait.waitForTime(1500);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
    }

}
