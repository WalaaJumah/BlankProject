/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription GuestCheckoutCyclePage
 */

package sporter_pages.guestCheckoutCyclePages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class GuestCheckoutCyclePage extends BasePage {
    public GuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;
    @FindBy(xpath = "//button[contains(@class,'submitOrderBtn')]")
    private WebElement placeOrderBtn;
    @FindBy(xpath = "//button[contains(@class,'checkoutMethod_btn')]")
    private WebElement checkoutAsGuestBtn;
    @FindBy(xpath = "//a[contains(@class,'orderPage_head')]")
    private WebElement logoInCheckoutMethod;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[1]")
    private WebElement checkoutMethodLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[2]")
    private WebElement shippingInformationLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[3]")
    private WebElement securedCheckoutLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[4]")
    private WebElement shippingMethodLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[5]")
    private WebElement paymentInformationLabel;
    @FindBy(xpath = "(//div[contains(@class,'segmentHeader_infoLabelContainer')]/span)[6]")
    private WebElement orderReviewLabel;
    @FindBy(xpath = "(//div[starts-with(@class,'checkoutMethod_methodLabel')])[1]")
    private WebElement sigInAndCheckOutHeader;
    @FindBy(xpath = "(//div[starts-with(@class,'checkoutMethod_methodLabel')])[2]")
    private WebElement checkoutAsGuestHeader;
    @FindBy(xpath = "//div[starts-with(@class,'checkoutMethod_asGuestInfo')]")
    private WebElement checkoutAsGuestDescription;
    @FindBy(xpath = "//span[starts-with(@class,'sideOrderReview_totalAmount')]")
    private WebElement orderTotalValue;
    @FindBy(xpath = "//div[starts-with(@class,'checkbox_checkBoxContainer')]")
    private WebElement registerAtSporterOption;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[1]")
    private WebElement firstNameField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[2]")
    private WebElement lastNameField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[3]")
    private WebElement emailField;
    @FindBy(xpath = "//input[starts-with(@class,'teleInput_input')]")
    private WebElement phoneField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[4]")
    private WebElement addressNameField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[5]")
    private WebElement streetLineOneField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[6]")
    private WebElement streetLineTwoField;
    @FindBy(xpath = "//button[contains(@class,'shippingInfo_btn')]")
    private WebElement continueBtn;
    @FindBy(xpath = "//div[@id='citiesSelector']/div")
    private WebElement cityMenu;
    @FindBy(xpath = "//select[starts-with(@class,'countrySelectorInput')]")
    private WebElement countryMenu;
    @FindBy(xpath = "(//div[@id='_errMsg'])[2]")
    private WebElement lastNameErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[3]")
    private WebElement emailErrMsg;
    @FindBy(xpath = "//div[starts-with(@class,'teleInput_errorMsg')]")
    private WebElement phoneErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[4]")
    private WebElement addressErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[1]")
    private WebElement firstnameErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[5]")
    private WebElement streetlineOneErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[6]")
    private WebElement streetlineErrMsg;
    @FindBy(xpath = "//div[starts-with(@class,'shippingMethod_shippingMethods')]")
    private WebElement shippingMethodsOptionsSection;

    public void fillInShippingInformationInputField(String firstName, String lastName, String email, String phone, String address, String streetLineOne, String streetLineTwo) {
        DataHelperAndWait.waitToBeVisible(firstNameField ,webDriver);
        DataHelperAndWait.updateAllText(firstNameField,firstName);
        DataHelperAndWait.waitToBeVisible(lastNameField ,webDriver);
        DataHelperAndWait.updateAllText(lastNameField,lastName);
        DataHelperAndWait.waitToBeVisible(emailField ,webDriver);
        DataHelperAndWait.updateAllText(emailField,email);
        DataHelperAndWait.waitToBeVisible(phoneField ,webDriver);
        DataHelperAndWait.updateAllText(phoneField,phone);
        DataHelperAndWait.waitToBeVisible(addressNameField ,webDriver);
        DataHelperAndWait.updateAllText(addressNameField,address);
        DataHelperAndWait.waitToBeVisible(streetLineOneField ,webDriver);
        DataHelperAndWait.updateAllText(streetLineOneField,streetLineOne);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField ,webDriver);
        DataHelperAndWait.updateAllText(streetLineTwoField,streetLineOne);
    }
    public void clickOnContinueBtn() {
        DataHelperAndWait.scrollTo(continueBtn,webDriver);

        try{
            DataHelperAndWait.waitToBeVisible(continueBtn ,webDriver);
            this.continueBtn.click();}
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(continueBtn ,webDriver);
            this.continueBtn.click();
        }
    }
    public void navigateToCheckoutPage(){
        webDriver.navigate().to(BaseURL+shippingInformationUrl);
        DataHelperAndWait.waitForUrlContains(shippingInformationUrl,webDriver);
    }
        public void accessGuestCheckoutForm(){
        webDriver.navigate().to(BaseURL+shippingInformationUrl);
        DataHelperAndWait.waitForUrlContains(shippingInformationUrl,webDriver);
        DataHelperAndWait.clickOnElement(checkoutAsGuestBtn,webDriver);
    }

}
