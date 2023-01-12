package sporter_pages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AEGuestUserPage extends BasePage {
    public AEGuestUserPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public final String firstName = "Automation";
    public final String firstNameAr = "محمد";
    public final String lastName = "User";
    public final String lastNameAr = "احمد";
    public final  String phone = "+9712222222";
    public final  String email = "SporterTesta@gmail.com";
    public final  String address = "Automation Address";
    public final String addressAr = "عنوان البيت";
    public final  String streetLineOne = "Automation street Line 1";
    public final String streetLineOneAr = "شارع خالد بن الوليد";
    public final  String streetLineTwo = "Automation street Line 2";
    public final String streetLineTwoAr = "طريق رقم 10";
    public final String longLengthText = "Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length Test with Long Length 10";
    //declare all locators related to the Cart Page
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(css = " div.checkout-total-payment > ul > li:nth-child(1) > button ")
    private WebElement proceedCheckoutBtn;



    @FindBy(xpath = "//a[@class='action showcart']")
    private WebElement cartIcon;
    @FindBy(id = "top-cart-btn-checkout")
    private WebElement proceedCheckoutBtnInCartPopup;
    @FindBy(xpath = "//button[@value='Apply']")
    private WebElement applyCopouneCodeBtn;
    @FindBy(xpath = "//div[text()='You used free gift code \"spo15\".']")
    private WebElement usedFreeCouponeMsg;
    //Getter Methods
    @FindBy(xpath = "//input[@id='coupon_code']")
    private WebElement coupounCodeField;
    @FindBy(id = "product-addtocart-button")
    private WebElement addToCartBtn;
    @FindBy(id = "//ul[@class='select2-results__options']/li[1]")
    private WebElement noCityFoundMsg;
    @FindBy(xpath = "//*[@id=\"popup-block\"]/div[2]/a[2]")
    private WebElement viewCartBtn;
    @FindBy(xpath = "//*[@id=\"tab-38-all38\"]/div[1]/div/div[3]/div/a")
    private WebElement productInHomePage;
    @FindBy(xpath = "//div[@class='inner-seller-prod wp-id-45575']")
    private WebElement productInHomePageAr;
    @FindBy(xpath = "//*[@id='checkout_step_col1_col2']/div[2]/div/button")
    private WebElement guestCheckoutBtn;
    @FindBy(xpath = "//div[@class='input-box field checkbox-field register-account input-with-value input-active']")
    private WebElement registerAtSporterOption;
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='telephone']")
    private WebElement phoneField;
    @FindBy(xpath = "//input[@name='custom_attributes[address_name]']")
    private WebElement addressField;
    @FindBy(xpath = "//input[@name='street[0]']")
    private WebElement streetLineOneField;
    @FindBy(xpath = "//input[@name='street[1]']")
    private WebElement streetLineTwoField;
    @FindBy(xpath = "(//button[@data-role='opc-continue'])[2]")
    private WebElement continueBtn;
    @FindBy(xpath = "//select[@class='select select2-hidden-accessible']")
    private WebElement cityMenu;
    @FindBy(xpath = "//ul[@class='table-checkout-shipping-method']")
    private WebElement shippingMethodSection;
    @FindBy(id = "form-language")
    private WebElement arabicLangBtn;
    @FindBy(id = "form-language")
    private WebElement englishLangBtn;
    @FindBy(id = "switcher-language")
    private WebElement languageSwitcher;
    @FindBy(xpath = "//div/input[@name='lastname']/following-sibling::div")
    private WebElement lastNameRequiredFieldMsg;
    @FindBy(xpath = "//div[3]/div/div[1]/input/following-sibling::div[2]")
    private WebElement emailRequiredFieldMsg;
    @FindBy(xpath = "//div[3]/div/div[1]/input/following-sibling::div[1]")
    private WebElement emailValidationFormateMsg;
    @FindBy(xpath = "//div[4]/div/div[1]/div[@class='field-error']/span")
    private WebElement phoneRequiredFieldMsg;
    @FindBy(xpath = "//div[7]/div/div[1]/div[@class='field-error']/span")
    private WebElement cityRequiredFieldMsg;
    @FindBy(xpath = "//div/input[@name='custom_attributes[address_name]']/following-sibling::div")
    private WebElement addressRequiredFieldMsg;
    @FindBy(xpath = "//div/input[@name='firstname']/following-sibling::div")
    private WebElement firstnameRequiredFieldMsg;
    @FindBy(xpath = "//div/input[@name='street[0]']/following-sibling::div")
    private WebElement streetlineOneRequiredFieldMsg;
    @FindBy(xpath = "//div/input[@name='street[1]']/following-sibling::div")
    private WebElement streetlineTwoRequiredFieldMsg;
    @FindBy(xpath = "//span[contains(text(),'Select a billing address from your address book or enter a new address.')]")
    private WebElement titleOfGuectUserShippingInformationScreen;
    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement citySearchField;
    @FindBy(xpath = "//*[@id=\"shipping-new-address-form\"]/div[7]/div/div")
    private WebElement cityListField;
    @FindBy(xpath = "//ul[@class='select2-results__options']")
    private WebElement citySearchResultList;
    @FindBy(xpath = "//ul[@class='select2-results__options']")
    private List<WebElement> searchMenu;
    @FindBy(xpath = "//span[@class='return-to-cart']//a")
    private WebElement returnToCartLink;
    @FindBy(xpath = "//a[@class='logo']")
    private WebElement sporterLogo;
    @FindBy(xpath = "//p[text()='You have no items in your shopping cart.']")
    private WebElement noItemInCartLabel;
    @FindBy(xpath = "//select[@name='country_id']")
    private WebElement countryField;

    @FindBy(xpath = "//span[@class='counter qty']")
    private WebElement counterIconOnCartBtn;


    //Getter Methods
    public WebElement getRegisterAtSporterOption() {
        DataHelperAndWait.waitToBeVisible(registerAtSporterOption,5,webDriver);
        return registerAtSporterOption;
    }
    public WebElement getCounterIconOnCartBtn() {
        DataHelperAndWait.waitToBeVisible(counterIconOnCartBtn,5,webDriver);
        return counterIconOnCartBtn;
    }

    public WebElement getContinueBtn() {
        return continueBtn;
    }

    public WebElement getCityMenu() {
        DataHelperAndWait.waitToBeVisible(cityMenu,5,webDriver);
        return cityMenu;
    }

    public WebElement getShippingMethodSection() {
        DataHelperAndWait.waitToBeVisible(shippingMethodSection,6,webDriver);
        return shippingMethodSection;
    }

    public WebElement getFirstnameRequiredFieldMsg() {
        DataHelperAndWait.waitToBeVisible(firstnameRequiredFieldMsg,5,webDriver);
        return firstnameRequiredFieldMsg;
    }

    public WebElement getLastNameRequiredFieldMsg() {
        DataHelperAndWait.waitToBeVisible(lastNameRequiredFieldMsg,5,webDriver);
        return lastNameRequiredFieldMsg;
    }

    public WebElement getemailRequiredFieldMsg() {
        DataHelperAndWait.waitToBeVisible(emailRequiredFieldMsg,5,webDriver);
        return emailRequiredFieldMsg;
    }

    public WebElement getPhoneRequiredFieldMsg() {
        DataHelperAndWait.waitToBeVisible(phoneRequiredFieldMsg,5,webDriver);
        return phoneRequiredFieldMsg;
    }

    public WebElement getCityRequiredFieldMsg() {
        DataHelperAndWait.waitToBeVisible(cityRequiredFieldMsg,5,webDriver);
        return cityRequiredFieldMsg;
    }

    public WebElement getAddressRequiredFieldMsg() {
        DataHelperAndWait.waitToBeVisible(addressRequiredFieldMsg,5,webDriver);
        return addressRequiredFieldMsg;
    }

    public WebElement getStreetlineOneRequiredFieldMsg() {
        DataHelperAndWait.waitToBeVisible(streetlineOneRequiredFieldMsg,5,webDriver);
        return streetlineOneRequiredFieldMsg;
    }

    public WebElement getStreetlineTwoRequiredFieldMsg() {
        return streetlineTwoRequiredFieldMsg;
    }

    public WebElement getTitleOfGuectUserShippingInformationScreen() {
        DataHelperAndWait.waitToBeVisible(titleOfGuectUserShippingInformationScreen,6,webDriver);
        return titleOfGuectUserShippingInformationScreen;
    }

    public WebElement getCitySearchField() {
        DataHelperAndWait.waitToBeVisible(citySearchField,6,webDriver);
        return citySearchField;
    }

    public WebElement getCityListField() {
        DataHelperAndWait.waitToBeVisible(cityListField,6,webDriver);
        return cityListField;
    }

    public List<WebElement> getSearchMenu() {
        return searchMenu;
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPhoneField() {
        return phoneField;
    }

    public WebElement getAddressField() {
        return addressField;
    }

    public WebElement getStreetLineOneField() {
        return streetLineOneField;
    }

    public WebElement getStreetLineTwoField() {
        return streetLineTwoField;
    }

    public WebElement getNoItemInCartLabel() {
        DataHelperAndWait.waitToBeVisible(noItemInCartLabel,6,webDriver);
        return noItemInCartLabel;
    }

    public WebElement getCountryField() {
        DataHelperAndWait.waitToBeVisible(countryField,5,webDriver);
        return countryField;
    }

    public WebElement getEmailValidationFormateMsg() {
        DataHelperAndWait.waitToBeVisible(emailValidationFormateMsg,6,webDriver);
        return emailValidationFormateMsg;
    }
    public WebElement getCartIcon() {
        DataHelperAndWait.waitToBeVisible(cartIcon,5,webDriver);
        return cartIcon;
    }


    //Define the main actions we need to execute our TCs
    public void switchToAECountry() {
        try {
            DataHelperAndWait.waitToBeVisible(countryList, 5,webDriver);
            this.countryList.click();
            DataHelperAndWait.waitToBeVisible(aeCountry, 5,webDriver);
            this.aeCountry.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeVisible(countryList, 5,webDriver);
            this.countryList.click();
            DataHelperAndWait.waitToBeVisible(aeCountry, 5,webDriver);
            this.aeCountry.click();
        }

    }

    public void clickOnCartIcon() {
        DataHelperAndWait.waitToBeClickable(cartIcon, 6,webDriver);
        cartIcon.click();
    }

    public void clickOnProceedCheckoutBtnInCartPopup() {
        DataHelperAndWait.waitToBeVisible(proceedCheckoutBtnInCartPopup, 6,webDriver);
        this.proceedCheckoutBtnInCartPopup.click();
    }

    public void clickOnProductInHomePage() {
        DataHelperAndWait.waitToBeVisible(productInHomePage,10,webDriver);
        this.productInHomePage.click();
    }

    public void clickOnProductInHomePageAr() {
        this.productInHomePageAr.click();
    }

    public void addToCart() {try{
        DataHelperAndWait.waitToBeClickable(addToCartBtn, 6,webDriver);
        this.addToCartBtn.click();}
    catch(Exception e){
        DataHelperAndWait.waitToBeClickable(addToCartBtn, 3,webDriver);
        this.addToCartBtn.click();}
    }

    public void clickOnSporterLogo() {
        DataHelperAndWait.isDisplayed(sporterLogo, 5,webDriver);
        this.sporterLogo.click();
    }

    public void viewCart() {
        try{
        DataHelperAndWait.waitToBeClickable(viewCartBtn, 10,webDriver);
        this.viewCartBtn.click();}
        catch (Exception e){
            webDriver.navigate().refresh();
            DataHelperAndWait.waitToBeClickable(viewCartBtn, 3,webDriver);
            this.viewCartBtn.click();}
    }

    public void clickOnGuestCheckoutBtn() {
        try {
            DataHelperAndWait.waitToBeClickable(guestCheckoutBtn, 5,webDriver);
            this.guestCheckoutBtn.click();
        } catch (Exception e) {
            DataHelperAndWait.waitToBeClickable(guestCheckoutBtn, 3,webDriver);
            this.guestCheckoutBtn.click();
        }
    }

    public void clickOnProceedCheckoutBtn() {
        DataHelperAndWait.waitToBeClickable(proceedCheckoutBtn, 3,webDriver);
        this.proceedCheckoutBtn.click();
    }

    public void clickOnReturnToCartIcon() {
        DataHelperAndWait.waitToBeClickable(returnToCartLink, 5,webDriver);
        this.returnToCartLink.click();
    }

    public void fillInShippingInformationInputField(String firstName, String lastName, String email, String phone, String address, String streetLineOne, String streetLineTwo) {
        DataHelperAndWait.waitToBeVisible(firstNameField, 5,webDriver);
        DataHelperAndWait.updateAllText(firstNameField,firstName);
//        firstNameField.sendKeys(firstName);
        DataHelperAndWait.waitToBeVisible(lastNameField, 5,webDriver);
//        lastNameField.sendKeys(lastName);
        DataHelperAndWait.updateAllText(lastNameField,lastName);
        DataHelperAndWait.waitToBeVisible(emailField, 5,webDriver);
//        emailField.sendKeys(email);
        DataHelperAndWait.updateAllText(emailField,email);
        DataHelperAndWait.waitToBeVisible(phoneField, 5,webDriver);
        DataHelperAndWait.updateAllText(phoneField,phone);
//        phoneField.sendKeys(phone);
        DataHelperAndWait.waitToBeVisible(addressField, 5,webDriver);
        DataHelperAndWait.updateAllText(addressField,address);
//        addressField.sendKeys(address);
        DataHelperAndWait.waitToBeVisible(streetLineOneField, 5,webDriver);
        DataHelperAndWait.updateAllText(streetLineOneField,streetLineOne);
//        streetLineOneField.sendKeys(streetLineOne);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField, 5,webDriver);
        DataHelperAndWait.updateAllText(streetLineTwoField,streetLineOne);
//        streetLineTwoField.sendKeys(streetLineTwo);
    }

    public void clickOnContinueBtn() {
        try{
        DataHelperAndWait.waitToBeVisible(continueBtn, 6,webDriver);
        this.continueBtn.click();}
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(continueBtn, 6,webDriver);
            this.continueBtn.click();
        }
    }

    public void switchToArabicVersion() {
        DataHelperAndWait.waitToBeVisible(arabicLangBtn, 5,webDriver);
        this.arabicLangBtn.click();
        if(webDriver.getCurrentUrl().contains("/ar")){
        DataHelperAndWait.waitForUrlContains("/ar",webDriver,7);
        }
        else {
            this.arabicLangBtn.click();
        }
    }

    public void clickOnFirstNameField() {
        DataHelperAndWait.isDisplayed(firstNameField, 3,webDriver);
        this.firstNameField.click();
    }
    public void navigateToHomePage(){webDriver.navigate().to(BaseURL);}
    public void clearShippingInformationFields(){
        DataHelperAndWait.waitToBeVisible(firstNameField, 5,webDriver);
        DataHelperAndWait.clearWebField(firstNameField);
        DataHelperAndWait.waitToBeVisible(lastNameField, 5,webDriver);
        DataHelperAndWait.clearWebField(lastNameField);
        DataHelperAndWait.waitToBeVisible(emailField, 5,webDriver);
        DataHelperAndWait.clearWebField(emailField);
        DataHelperAndWait.waitToBeVisible(phoneField, 5,webDriver);
        DataHelperAndWait.clearWebField(phoneField);
        DataHelperAndWait.waitToBeVisible(addressField, 5,webDriver);
        DataHelperAndWait.clearWebField(addressField);
        DataHelperAndWait.waitToBeVisible(streetLineOneField, 5,webDriver);
        DataHelperAndWait.clearWebField(streetLineOneField);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField, 5,webDriver);
        DataHelperAndWait.clearWebField(streetLineTwoField);

    }
}