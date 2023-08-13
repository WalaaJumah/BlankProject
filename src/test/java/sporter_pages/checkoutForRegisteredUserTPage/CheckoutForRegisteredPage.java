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

import java.io.IOException;

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
    @FindBy(xpath = "(//div[@id='savedAddressesContainer']//div)[1]")
    private WebElement savedAddressOption;
    @FindBy(xpath = "//div[@id='citiesSelector']/div[2]/div[2]/div[5]")
    private WebElement dubaiCity;
    @FindBy(xpath = "(//div[@id='itemToWhishListBtn'])[1]")
    private WebElement addToWishListBtn;
    @FindBy(id = "WItemsContainer")
    private WebElement addedItemToWashList;
    @FindBy(id = "MyWishlist")
    private WebElement wishListTab;
    GuestCheckoutCyclePage _guestCheckoutCyclePage = null;
    
    
    
    public CheckoutForRegisteredPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

        _guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
    }
    
    public CheckoutForRegisteredPage(WebDriver webDriver,GuestCheckoutCyclePage guestCheckoutCyclePage) {
        super(webDriver);
        
        PageFactory.initElements(webDriver, this);

        if(guestCheckoutCyclePage == null)
        {
            _guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        }
        else
        {
            _guestCheckoutCyclePage =guestCheckoutCyclePage ;
        }        
    }

    public void setSelectDubaiCityCity() {
       //GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        try {
            DataHelperAndWait.clickOnElement(_guestCheckoutCyclePage.getCityMenu(), webDriver);
            DataHelperAndWait.clickOnElement(dubaiCity, webDriver);
        } catch (Exception e) {
            DataHelperAndWait.clickOnElement(_guestCheckoutCyclePage.getCityMenu(), webDriver);
            DataHelperAndWait.clickOnElement(dubaiCity, webDriver);
        }
    }

    public void fillInShippingInformationInputField(String firstName, String lastName, String phone, String address, String streetLineOne, String streetLineTwo) {
        // //GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitToBeVisible(_guestCheckoutCyclePage.getFirstNameField(), webDriver);
        DataHelperAndWait.updateAllText(_guestCheckoutCyclePage.getFirstNameField(), firstName);
        DataHelperAndWait.waitToBeVisible(_guestCheckoutCyclePage.getLastNameField(), webDriver);
        DataHelperAndWait.updateAllText(_guestCheckoutCyclePage.getLastNameField(), lastName);
        DataHelperAndWait.waitToBeVisible(_guestCheckoutCyclePage.getPhoneField(), webDriver);
        DataHelperAndWait.updateAllText(_guestCheckoutCyclePage.getPhoneField(), phone);
        DataHelperAndWait.waitToBeVisible(_guestCheckoutCyclePage.getAddressNameField(), webDriver);
        DataHelperAndWait.updateAllText(_guestCheckoutCyclePage.getAddressNameField(), address);
        DataHelperAndWait.waitToBeVisible(_guestCheckoutCyclePage.getStreetLineOneField(), webDriver);
        DataHelperAndWait.updateAllText(_guestCheckoutCyclePage.getStreetLineOneField(), streetLineOne);
        DataHelperAndWait.waitToBeVisible(_guestCheckoutCyclePage.getStreetLineTwoField(), webDriver);
        DataHelperAndWait.updateAllText(_guestCheckoutCyclePage.getStreetLineTwoField(), streetLineTwo);
        DataHelperAndWait.waitToBeVisible(_guestCheckoutCyclePage.getStreetLineTwoField(), webDriver);
        DataHelperAndWait.updateAllText(_guestCheckoutCyclePage.getStreetLineTwoField(), streetLineTwo);
        _guestCheckoutCyclePage.selectCity();
    }

    public void navigateToShippingMethodsPage() throws IOException {
        //GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        _guestCheckoutCyclePage.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        _guestCheckoutCyclePage.setSelectDubaiCityCity();
        DataHelperAndWait.waitForTime(1500);
        _guestCheckoutCyclePage.clickOnContinueBtn();
    }

    public void AddToCartAndAccessShippingMethodsPage() throws IOException {
        //GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        _guestCheckoutCyclePage.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        _guestCheckoutCyclePage.setSelectDubaiCityCity();
        DataHelperAndWait.waitForTime(1500);
        _guestCheckoutCyclePage.clickOnContinueBtn();
    }

    public void viewCartAndAccessShippingMethodsPage() throws IOException {
        //GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        _guestCheckoutCyclePage.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        _guestCheckoutCyclePage.setSelectDubaiCityCity();
        DataHelperAndWait.waitForTime(1500);
        _guestCheckoutCyclePage.clickOnContinueBtn();
    }

    public void navigateToPaymentMethodScreenWithSavedAddress() throws IOException {
        //GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        _guestCheckoutCyclePage.accessGuestCheckoutForm();
        DataHelperAndWait.clickOnElement(this.getSavedAddressOption(), webDriver);
        DataHelperAndWait.waitForTime(1500);
        _guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(_guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(), webDriver);
        DataHelperAndWait.clickOnElement(_guestCheckoutCyclePage.getContinueShippingMethodsBtn(), webDriver);
    }

    public void AddToCartAndAccessShippingMethodsPageForSavedAddress() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
            cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
            cartPage.proceedToCheckout();
            try {
                DataHelperAndWait.clickOnElement(this.getSavedAddressOption(), webDriver);
            } catch (Exception e) {
                this.fillInShippingInformationInputField(
                        XmlReader.getXMLData("firstName"),
                        XmlReader.getXMLData("lastName"),
                        XmlReader.getXMLData("phoneNumber"),
                        XmlReader.getXMLData("AddressName"),
                        XmlReader.getXMLData("StreetOneAddressName"),
                        XmlReader.getXMLData("StreetTwoAddressName"));
            }
            DataHelperAndWait.waitForTime(1500);
            _guestCheckoutCyclePage.clickOnContinueBtn();
            try {
                DataHelperAndWait.clickOnElement(this.getSavedAddressOption(), webDriver);
            } catch (Exception e) {
                this.fillInShippingInformationInputField(
                        XmlReader.getXMLData("firstName"),
                        XmlReader.getXMLData("lastName"),
                        XmlReader.getXMLData("phoneNumber"),
                        XmlReader.getXMLData("AddressName"),
                        XmlReader.getXMLData("StreetOneAddressName"),
                        XmlReader.getXMLData("StreetTwoAddressName"));
            }
            DataHelperAndWait.waitForTime(1500);
            _guestCheckoutCyclePage.clickOnContinueBtn();
        }
//        DataHelperAndWait.clickOnElement(_guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
//        DataHelperAndWait.clickOnElement(_guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);

    public void AddToCartAndAccessShippingMethodsPageForSavedAddressForDubai() throws IOException {
        //GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        try {
            try {
                cartPage.clearCart();
            } catch (Exception e) {
                System.out.println("");
            }
            cartPage.addToCartAndDisplayTheCart();
            cartPage.proceedToCheckout();
            try {
                DataHelperAndWait.clickOnElement(this.getSavedAddressOption(), webDriver);
            } catch (Exception e) {
                _guestCheckoutCyclePage.fillInShippingInformationInputFieldWithDubai(
                        XmlReader.getXMLData("firstName"),
                        XmlReader.getXMLData("lastName"),
                        XmlReader.getXMLData("phoneNumber"),
                        XmlReader.getXMLData("AddressName"),
                        XmlReader.getXMLData("StreetOneAddressName"),
                        XmlReader.getXMLData("StreetTwoAddressName"));
            }
            DataHelperAndWait.waitForTime(1500);
            _guestCheckoutCyclePage.clickOnContinueBtn();
        }
        catch (Exception ee){
            try {
                cartPage.clearCart();
            } catch (Exception e) {
                System.out.println("");
            }
            cartPage.addToCartAndDisplayTheCart();
            cartPage.proceedToCheckout();
            try {
                DataHelperAndWait.clickOnElement(this.getSavedAddressOption(), webDriver);
            } catch (Exception e) {
                this.fillInShippingInformationInputField(
                        XmlReader.getXMLData("firstName"),
                        XmlReader.getXMLData("lastName"),
                        XmlReader.getXMLData("phoneNumber"),
                        XmlReader.getXMLData("AddressName"),
                        XmlReader.getXMLData("StreetOneAddressName"),
                        XmlReader.getXMLData("StreetTwoAddressName"));
            }
            DataHelperAndWait.waitForTime(1500);
            _guestCheckoutCyclePage.clickOnContinueBtn();
        }
//        DataHelperAndWait.clickOnElement(_guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(),webDriver);
//        DataHelperAndWait.clickOnElement(_guestCheckoutCyclePage.getContinueShippingMethodsBtn(),webDriver);
    }
    public void AddToCartAndAccessShippingMethodsPageForSavedAddressForDubaiCity() throws IOException {
        //GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        cartPage.proceedToCheckout();
        DataHelperAndWait.clickOnElement(addNewAddressBtn, webDriver);
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName")
        );
        this.setSelectDubaiCityCity();
        DataHelperAndWait.waitForTime(1500);
        _guestCheckoutCyclePage.clickOnContinueBtn();
        DataHelperAndWait.clickOnElement(_guestCheckoutCyclePage.getTwoBusinessDaysSuperExpressShipping(), webDriver);
    }

    public void accessGuestCheckoutForm() throws IOException {
//        webDriver.navigate().to(BaseURL+shippingInformationUrl);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
    }
}
