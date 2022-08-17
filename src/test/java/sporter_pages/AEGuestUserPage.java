package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AEGuestUserPage {
    public AEGuestUserPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    //declare all locators related to the Cart Page
    @FindBy(id = "switcher-store-trigger")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(css = " div.checkout-total-payment > ul > li:nth-child(1) > button ")
    private WebElement proceedCheckoutBtn;
    @FindBy(xpath = "//a[@class='action showcart']")
    private WebElement carticon;
    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
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
    @FindBy(xpath = "//*[@id=\"shipping\"]/button")
    private WebElement continueBtn;
    @FindBy(xpath = "//select[@class='select select2-hidden-accessible']")
    private WebElement cityMenu;
    @FindBy(xpath = "//ul[@class='table-checkout-shipping-method']")
    private WebElement shippingMethodSection;
    @FindBy(xpath = "//*[text()='عربي']")
    private WebElement arabicLangBtn;
    @FindBy(xpath = "//*[text()='English']")
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
    @FindBy(xpath = "//a[@href='https://www.sporter.com/en-ae/checkout/cart/']")
    private WebElement returnToCartLink;
    @FindBy(xpath = "//a[@href='https://www.sporter.com/en-ae/']")
    private WebElement sporterLogo;
    @FindBy(xpath="//p[text()='You have no items in your shopping cart.']")
    private WebElement noItemInCartLabel;
    @FindBy(xpath="//select[@name='country_id']")
    private WebElement countryField;

    //Getter Methods
    public WebElement getRegisterAtSporterOption() {
        return registerAtSporterOption;
    }

    public WebElement getCityMenu() {
        return cityMenu;
    }

    public WebElement getShippingMethodSection() {
        return shippingMethodSection;
    }

    public WebElement getFirstnameRequiredFieldMsg() {
        return firstnameRequiredFieldMsg;
    }

    public WebElement getLastNameRequiredFieldMsg() {
        return lastNameRequiredFieldMsg;
    }

    public WebElement getemailRequiredFieldMsg() {
        return emailRequiredFieldMsg;
    }

    public WebElement getPhoneRequiredFieldMsg() {
        return phoneRequiredFieldMsg;
    }

    public WebElement getCityRequiredFieldMsg() {
        return cityRequiredFieldMsg;
    }

    public WebElement getAddressRequiredFieldMsg() {
        return addressRequiredFieldMsg;
    }

    public WebElement getStreetlineOneRequiredFieldMsg() {
        return streetlineOneRequiredFieldMsg;
    }

    public WebElement getStreetlineTwoRequiredFieldMsg() {
        return streetlineTwoRequiredFieldMsg;
    }

    public WebElement getTitleOfGuectUserShippingInformationScreen() {
        return titleOfGuectUserShippingInformationScreen;
    }

    public WebElement getCitySearchField() {
        return citySearchField;
    }

    public WebElement getCityListField() {
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
    public WebElement getNoItemInCartLabel(){return noItemInCartLabel;}
    public WebElement getCountryField(){return countryField;}
    public WebElement getEmailValidationFormateMsg(){return emailValidationFormateMsg;}



    //Define the main actions we need to execute our TCs
    public void switchToAECountry() {try{
        DataHelperAndWait.isDisplayed(countryList, 15);
        this.countryList.click();
        DataHelperAndWait.implicitWait(6);
        this.aeCountry.click();}
    catch(Exception e){
        DataHelperAndWait.isDisplayed(countryList, 15);
        this.countryList.click();
        DataHelperAndWait.implicitWait(6);
        this.aeCountry.click();
    }
    }

    public void clickOnCartIcon() {
        DataHelperAndWait.waitToBeVisible(carticon, 10);
        this.carticon.click();
    }

    public void clickOnProceedCheckoutBtnInCartPopup() {
        DataHelperAndWait.waitToBeClickable(proceedCheckoutBtnInCartPopup, 10);
        this.proceedCheckoutBtnInCartPopup.click();
    }

    public void clickOnProductInHomePage() {
        this.productInHomePage.click();
    }

    public void clickOnProductInHomePageAr() {
        this.productInHomePageAr.click();
    }

    public void addToCart() {
        DataHelperAndWait.isDisplayed(addToCartBtn, 10);
        this.addToCartBtn.click();
    }

    public void clickOnSporterLogo() {
        DataHelperAndWait.isDisplayed(sporterLogo, 10);
        this.sporterLogo.click();
    }

    public void viewCart() {
        DataHelperAndWait.waitToBeClickable(viewCartBtn, 10);
        this.viewCartBtn.click();
    }

    public void clickOnGuestCheckoutBtn() {
        DataHelperAndWait.waitToBeClickable(guestCheckoutBtn, 15);
        this.guestCheckoutBtn.click();
    }

    public void clickOnProceedCheckoutBtn() {
        DataHelperAndWait.waitToBeClickable(proceedCheckoutBtn, 10);
        this.proceedCheckoutBtn.click();
    }

    public void clickOnReturnToCartIcon() {
        DataHelperAndWait.waitToBeClickable(returnToCartLink, 10);
        this.returnToCartLink.click();
    }

    public void fillInShippingInformationInputField(String firstName, String lastName, String email, String phone, String address, String streetLineOne, String streetLineTwo) {
        DataHelperAndWait.waitToBeVisible(firstNameField, 10);
        firstNameField.sendKeys(firstName);
        DataHelperAndWait.waitToBeVisible(lastNameField, 10);
        lastNameField.sendKeys(lastName);
        DataHelperAndWait.waitToBeVisible(emailField, 10);
        emailField.sendKeys(email);
        DataHelperAndWait.waitToBeVisible(phoneField, 10);
        phoneField.sendKeys(phone);
        DataHelperAndWait.waitToBeVisible(addressField, 10);
        addressField.sendKeys(address);
        DataHelperAndWait.waitToBeVisible(streetLineOneField, 10);
        streetLineOneField.sendKeys(streetLineOne);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField, 10);
        streetLineTwoField.sendKeys(streetLineTwo);
    }

    public void clickOnContinueBtn() {
        DataHelperAndWait.waitToBeClickable(continueBtn, 10);
        this.continueBtn.click();
    }

    public void switchToArabicVersion() {
        DataHelperAndWait.isDisplayed(arabicLangBtn, 10);
        this.arabicLangBtn.click();
    }

    public void clickOnFirstNameField() {
        DataHelperAndWait.isDisplayed(firstNameField, 10);
        this.firstNameField.click();
    }
}
