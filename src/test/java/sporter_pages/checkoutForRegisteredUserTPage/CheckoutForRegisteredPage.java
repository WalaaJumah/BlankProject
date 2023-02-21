/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription CheckoutForRegisteredPage
 */

package sporter_pages.checkoutForRegisteredUserTPage;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.cartPages.CartPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import xml_reader.XmlReader;

@Getter
public class CheckoutForRegisteredPage extends BasePage {
     @FindBy(id = "addNewAddressBtn")
    private WebElement addNewAddressBtn;
     @FindBy(id = "emailInput")
     private WebElement emailFieldInSignIn;
     @FindBy(id = "passwordInput")
     private WebElement passwordFieldInSignIn;
     @FindBy(id = "forgetPasswordBtn")
     private WebElement forgetPasswordBtn;
     @FindBy(id = "createAccountLink")
     private WebElement createAccountLink;
     @FindBy(id = "FBlogin")
     private WebElement facebookBtn;
     @FindBy(id = "submitdBtn")
     private WebElement sigInBtn;
     @FindBy(id = "showPasswordIcon")
     private WebElement showPasswordIcon;
     @FindBy(id = "hidePasswordIcon")
     private WebElement hidePasswordIcon;

    public CheckoutForRegisteredPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public void fillInShippingInformationInputField(String firstName, String lastName, String phone, String address, String streetLineOne, String streetLineTwo) {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
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
    }
    public void navigateToShippingMethodsPage(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.setSelectDubaiCityCity();
        guestCheckoutCyclePage.clickOnContinueBtn();
    }
    public void AddToCartAndAccessShippingMethodsPage(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage=new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.setSelectDubaiCityCity();
        guestCheckoutCyclePage.clickOnContinueBtn();
    }
    public void viewCartAndAccessShippingMethodsPage(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage=new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        guestCheckoutCyclePage.setSelectDubaiCityCity();
        guestCheckoutCyclePage.clickOnContinueBtn();
    }
}
