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
     @FindBy(xpath = "(//div[@id='savedAddressesContainer'])[1]")
     private WebElement savedAddressOption;
     @FindBy(xpath = "//div[@id='citiesSelector']/div[2]/div[2]/div[5]")
     private WebElement dubaiCity;
    @FindBy(xpath="(//div[@id='itemToWhishListBtn'])[1]")
    private WebElement addToWishListBtn;
    @FindBy(xpath="(//a[starts-with(@class,'wItem_imgContainer')])[1]")
    private WebElement addedItemToWashList;
    @FindBy(xpath="(//a[starts-with(@class,'dashboardSidebar_item')])[1]")
    private WebElement wishListTab;
    public void setSelectDubaiCityCity(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        try{
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCityMenu(),webDriver);
            DataHelperAndWait.clickOnElement(dubaiCity,webDriver);}
        catch (Exception e){
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCityMenu(),webDriver);
            DataHelperAndWait.clickOnElement(dubaiCity,webDriver);
        }
    }
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
    public void navigateToPaymentMethodScreenWithSavedAddress(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        guestCheckoutCyclePage.accessGuestCheckoutForm();
        DataHelperAndWait.clickOnElement(this.getSavedAddressOption(),webDriver);
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
    }
    public void AddToCartAndAccessShippingMethodsPageForSavedAddress(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage=new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
        try{
            this.fillInShippingInformationInputField(
                    XmlReader.getXMLData("firstName"),
                    XmlReader.getXMLData("lastName"),
                    XmlReader.getXMLData("phoneNumber"),
                    XmlReader.getXMLData("AddressName"),
                    XmlReader.getXMLData("StreetOneAddressName"),
                    XmlReader.getXMLData("StreetTwoAddressName")
            );
        }
        catch (Exception e){
            DataHelperAndWait.clickOnElement(this.getSavedAddressOption(),webDriver);
        }
        guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
    }
    public void AddToCartAndAccessShippingMethodsPageForSavedAddressForDubaiCity(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage=new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
        DataHelperAndWait.clickOnElement(addNewAddressBtn,webDriver);
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
    public void accessGuestCheckoutForm(){
//        webDriver.navigate().to(BaseURL+shippingInformationUrl);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
    }
}
