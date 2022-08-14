package sporter_pages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AEGuestUserPage {
    public AEGuestUserPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }
    //declare all locators related to the Cart Page
    @FindBy(xpath = "//span[@class='fas fa-chevron-down']")
    private WebElement countryList;
    @FindBy(xpath = "//li[@class='country_switch']/span[@class='AE']")
    private WebElement aeCountry;
    @FindBy(xpath = "//span[text()='Proceed to Checkout']")
    private WebElement proceedCheckoutBtn;
    @FindBy(xpath= "//a[@class='action showcart']")
    private WebElement carticon;
    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    private WebElement proceedCheckoutBtnInCartPopup;
    @FindBy(xpath = "//button[@value='Apply']")
    private WebElement applyCopouneCodeBtn;
    @FindBy(xpath = "//div[text()='You used free gift code \"spo15\".']")
    private WebElement usedFreeCouponeMsg;
    //Getter Methods
    @FindBy(xpath="//input[@id='coupon_code']")
    private WebElement coupounCodeField;
    @FindBy(id = "product-addtocart-button")
    private WebElement addToCartBtn;

    @FindBy(xpath="//span[text()='View Cart']")
    private WebElement viewCartInCartPopup;
    @FindBy(xpath = "//span[@class='counter-number']")
    private WebElement cartCounter;
    @FindBy(xpath = "//span[@class='item-count']")
    private WebElement itemCounterInCartPopUp;
    @FindBy(xpath = "//*[@id=\"popup-block\"]/div[2]/a[2]")
    private WebElement viewCartBtn;
    @FindBy(xpath = "//*[@id=\"tab-38-all38\"]/div[1]/div/div[3]/div/a")
    private WebElement productInHomePage;
    @FindBy(xpath = "//span[text()='Guest Checkout']")
    private WebElement guestCheckoutBtn;
    @FindBy(xpath= "//div[@class='input-box field checkbox-field register-account input-with-value input-active']")
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





    //Getter Methods
    public WebElement getProceedCheckoutBtn(){return proceedCheckoutBtn;}
    public WebElement getUsedFreeCouponeMsg(){return usedFreeCouponeMsg;}
    public WebElement getRegisterAtSporterOption(){return registerAtSporterOption;}
    public WebElement getCityMenu(){return cityMenu;}
    public WebElement getShippingMethodSection(){return shippingMethodSection;}



    // define the actions
    public void switchToAECountry() {
        DataHelperAndWait.isDisplayed(countryList, 15);
        this.countryList.click();
        DataHelperAndWait.implicitWait(6);
        this.aeCountry.click();
    }
    public void clickOnCartIcon(){
        DataHelperAndWait.waitToBeVisible(carticon,10);
        this.carticon.click();
    }
    public void clickOnProceedCheckoutBtnInCartPopup(){
        DataHelperAndWait.waitToBeClickable(proceedCheckoutBtnInCartPopup,10);
        this.proceedCheckoutBtnInCartPopup.click();
    }
    public WebElement getApplyCouponeCode(){return applyCopouneCodeBtn;}
    public void FillinCouponeCode(String couponeCode){
        DataHelperAndWait.waitToBeVisible(coupounCodeField,10);
        this.coupounCodeField.sendKeys(couponeCode);
        DataHelperAndWait.waitToBeClickable(applyCopouneCodeBtn,10);
        this.applyCopouneCodeBtn.click();
    }
    public void clickOnProductInHomePage() {
        this.productInHomePage.click();
    }
    public void addToCart() {
        DataHelperAndWait.isDisplayed(addToCartBtn, 10);
        this.addToCartBtn.click();
    }
    public void viewCart() {
        DataHelperAndWait.waitToBeClickable(viewCartBtn,10);
        this.viewCartBtn.click();
    }
    public void clickOnGuestCheckoutBtn(){
        DataHelperAndWait.waitToBeClickable(guestCheckoutBtn,10);
        this.guestCheckoutBtn.click();
    }
    public void clickOnProceedCheckoutBtn(){
        DataHelperAndWait.waitToBeClickable(proceedCheckoutBtn,10);
        this.proceedCheckoutBtn.click();
    }
    public void fillInShippingInformationInputField(String firstName,String lastName,String email, String phone, String address, String streetLineOne, String streetLineTwo){
        DataHelperAndWait.waitToBeVisible(firstNameField,10);
        firstNameField.sendKeys(firstName);
        DataHelperAndWait.waitToBeVisible(lastNameField,10);
        lastNameField.sendKeys(lastName);
        DataHelperAndWait.waitToBeVisible(emailField,10);
        emailField.sendKeys(email);
        DataHelperAndWait.waitToBeVisible(phoneField,10);
        phoneField.sendKeys(phone);
        DataHelperAndWait.waitToBeVisible(addressField,10);
        addressField.sendKeys(address);
        DataHelperAndWait.waitToBeVisible(streetLineOneField,10);
        streetLineOneField.sendKeys(streetLineOne);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField,10);
        streetLineTwoField.sendKeys(streetLineTwo);
    }
    public void clickOnContinueBtn(){
        DataHelperAndWait.waitToBeClickable(continueBtn,10);
        this.continueBtn.click();
    }







}
