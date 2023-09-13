/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription GuestCheckoutCyclePage
 */

package sporter_pages.guestCheckoutCyclePages;

import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import xml_reader.XmlReader;

@Getter
public class EgyptGuestCheckoutCyclePage extends GuestCheckoutCyclePage {
    @FindBy(id = "(//div[@id='shippingMethod']/div)[1]")
    private WebElement nextDayMethod;
    @FindBy(xpath = "//div[@id='geidea_payment']//div[@id='circle']")
    private WebElement creditCardPaymentMethod;
    @FindBy(id = "geideaModalForm")
    private WebElement gediaaPopUp;
    @FindBy(xpath = "(//span[@class='geideaPaymentMethodLabel'])[1]")
    private WebElement debitCreditCardOption;
    @FindBy(xpath = "(//span[@class='geideaPaymentMethodLabel'])[2]")
    private WebElement mobileWalletOption;
    @FindBy(name = "defaultPaymentDetails")
    private WebElement nextButtonInGediaaPopUp;
    @FindBy(name = "number")
    private WebElement creditCardNumber;
    @FindBy(name = "expiry")
    private WebElement cardExpiryField;
    @FindBy(name = "cvv")
    private WebElement cvvField;
    @FindBy(name = "owner")
    private WebElement cardOwnerNameField;
    @FindBy(xpath = "//div[@id='geideaModalForm']/div[11]/button")
    private WebElement payBtn;
    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitEmulator;
    @FindBy(id = "selectAuthResult")
    private WebElement authenticationResultMenu;
    @FindBy(id = "geideaTransactionReceipt")
    private WebElement gediaaSucessPopUp;
    @FindBy(xpath = "//div[@id='geideaTransactionReceipt']/div[4]/button")
    private WebElement goToMerchentWebSite;
    @FindBy(xpath = "//button[@data-geidea-action='cancel']")
    private WebElement cancelBtnInGediaaSelectionPopUp;
    @FindBy(xpath = "//div[@class='geideaErrorReferenceContainer']")
    private WebElement geideaError;
    @FindBy(id = "ContainerOuterBorder")
    private WebElement aCSEmulatorScreen;
      @FindBy(id = "redirectTo3ds1Frame")
    private WebElement aCSEmulatorFrame;

    @FindBy(xpath = "(//iframe)[2]")
    private WebElement geideaPopUpFrame;

    public EgyptGuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public static float convertTheStringToFloat(String text, WebDriver webDriver, String currency) {
        String elementValueWithoutCurrency = text.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Float.parseFloat(elementValueWithoutSpace);
    }

    public void submitCreditCardCorrectly() {
//DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.waitToBeVisible(this.getGeideaPopUpFrame(), webDriver);
        webDriver.switchTo().frame(1);
        DataHelperAndWait.waitToBeVisible(this.getDebitCreditCardOption(), webDriver);
        DataHelperAndWait.clickOnElement(this.getDebitCreditCardOption(), webDriver);
        DataHelperAndWait.clickOnElement(this.nextButtonInGediaaPopUp, webDriver);
        DataHelperAndWait.waitToBeVisible(this.getCreditCardNumber(), webDriver);
        DataHelperAndWait.updateAllText(this.getCreditCardNumber(), XmlReader.getXMLData("testCreditCard"));
        DataHelperAndWait.waitToBeVisible(this.getCardExpiryField(), webDriver);
        DataHelperAndWait.updateAllText(this.getCardExpiryField(),XmlReader.getXMLData("creditCardDate") );
        DataHelperAndWait.waitToBeVisible(this.getCvvField(), webDriver);
        DataHelperAndWait.updateAllText(this.getCvvField(), XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.waitToBeVisible(this.getCardOwnerNameField(), webDriver);
        DataHelperAndWait.updateAllText(this.getCardOwnerNameField(), XmlReader.getXMLData("firstName"));
//        webDriver.switchTo().defaultContent();
        DataHelperAndWait.clickOnElement(this.getPayBtn(), webDriver);
//        DataHelperAndWait.waitForTime(6000);
        DataHelperAndWait.waitToBeVisible(this.aCSEmulatorFrame, webDriver);
        webDriver.switchTo().frame("redirectTo3ds1Frame");
        DataHelperAndWait.waitToBeVisible(this.getACSEmulatorScreen(), webDriver);
        DataHelperAndWait.waitToBeVisible(this.getAuthenticationResultMenu(), webDriver);
        DataHelperAndWait.clickOnElement(this.getSubmitEmulator(), webDriver);
    }
    public void submitInValidCreditCardCorrectly() {
        if(DataHelperAndWait.IsElementPresent(this.getGeideaPopUpFrame())) {
            DataHelperAndWait.waitToBeVisible(this.getGeideaPopUpFrame(), webDriver);
            webDriver.switchTo().frame(1);
            DataHelperAndWait.waitToBeVisible(this.getDebitCreditCardOption(), webDriver);
            DataHelperAndWait.clickOnElement(this.getDebitCreditCardOption(), webDriver);
            DataHelperAndWait.clickOnElement(this.nextButtonInGediaaPopUp, webDriver);
            DataHelperAndWait.waitToBeVisible(this.getCreditCardNumber(), webDriver);
            DataHelperAndWait.updateAllText(this.getCreditCardNumber(), XmlReader.getXMLData("invalidCreditCard"));
            DataHelperAndWait.waitToBeVisible(this.getCardExpiryField(), webDriver);
            DataHelperAndWait.updateAllText(this.getCardExpiryField(), XmlReader.getXMLData("creditCardDate"));
            DataHelperAndWait.waitToBeVisible(this.getCvvField(), webDriver);
            DataHelperAndWait.updateAllText(this.getCvvField(), XmlReader.getXMLData("testCVV"));
            DataHelperAndWait.waitToBeVisible(this.getCardOwnerNameField(), webDriver);
            DataHelperAndWait.updateAllText(this.getCardOwnerNameField(), XmlReader.getXMLData("firstName"));
        }
        else{
            throw new AssertionError("The Site doesn't redirect the user to the Geidea Dashboard & the URL is: "+webDriver.getCurrentUrl());
        }
    }
    public void submitCreditCardWithDifferentAuthentication(String authenticationOption ) {
//DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.waitToBeVisible(this.getGeideaPopUpFrame(), webDriver);
        webDriver.switchTo().frame(1);
        DataHelperAndWait.waitToBeVisible(this.getDebitCreditCardOption(), webDriver);
        DataHelperAndWait.clickOnElement(this.getDebitCreditCardOption(), webDriver);
        DataHelperAndWait.clickOnElement(this.nextButtonInGediaaPopUp, webDriver);
        DataHelperAndWait.waitToBeVisible(this.getCreditCardNumber(), webDriver);
        DataHelperAndWait.updateAllText(this.getCreditCardNumber(), XmlReader.getXMLData("testCreditCard"));
        DataHelperAndWait.waitToBeVisible(this.getCardExpiryField(), webDriver);
        DataHelperAndWait.updateAllText(this.getCardExpiryField(),XmlReader.getXMLData("creditCardDate") );
        DataHelperAndWait.waitToBeVisible(this.getCvvField(), webDriver);
        DataHelperAndWait.updateAllText(this.getCvvField(), XmlReader.getXMLData("testCVV"));
        DataHelperAndWait.waitToBeVisible(this.getCardOwnerNameField(), webDriver);
        DataHelperAndWait.updateAllText(this.getCardOwnerNameField(), XmlReader.getXMLData("firstName"));
//        webDriver.switchTo().defaultContent();
        DataHelperAndWait.clickOnElement(this.getPayBtn(), webDriver);
//        DataHelperAndWait.waitForTime(6000);
        DataHelperAndWait.waitToBeVisible(this.aCSEmulatorFrame, webDriver);
        webDriver.switchTo().frame("redirectTo3ds1Frame");
        DataHelperAndWait.waitToBeVisible(this.getACSEmulatorScreen(), webDriver);
        switch (authenticationOption){
            case "(N) Authentication Failed":
                this.selectAuthenticationFailed();
                break;

               case "(X or U) Authentication Not Available":
                this.selectAuthenticationNotAvailable();
                break;

                case "(M) Authentication Attempted":
                this.selectAuthenticationAttempted();
                break;
                     case "(P) Error Parsing Authentication Response":
                this.selectAuthenticationErrorResponse();
                break;

                           case "(S) Invalid Signature on Authentication Response":
                this.selectAuthenticationInvalidSignature();
                break;
                                  case "(I) MPI Processing Error":
                this.selectAuthenticationMPI();
                break;
                                          case "(M) Authentication Attempted (No CAVV)":
                this.selectAuthenticationNoCAVV();
                break;


        }

        DataHelperAndWait.waitToBeVisible(this.getAuthenticationResultMenu(), webDriver);
        DataHelperAndWait.clickOnElement(this.getSubmitEmulator(), webDriver);
    }
    public void selectAuthenticationFailed(){
        DataHelperAndWait.waitToBeVisible(this.getAuthenticationResultMenu(), webDriver);
        DataHelperAndWait.clickOnElement(this.getAuthenticationResultMenu(), webDriver);
        Select auth= new Select(this.getAuthenticationResultMenu());
        auth.selectByVisibleText("(N) Authentication Failed");
    }
    public void selectAuthenticationNotAvailable(){
        DataHelperAndWait.waitToBeVisible(this.getAuthenticationResultMenu(), webDriver);
        Select auth= new Select(this.getAuthenticationResultMenu());
        auth.selectByVisibleText("(X or U) Authentication Not Available");
    }
    public void selectAuthenticationAttempted(){
        DataHelperAndWait.waitToBeVisible(this.getAuthenticationResultMenu(), webDriver);
        Select auth= new Select(this.getAuthenticationResultMenu());
        auth.selectByVisibleText("(M) Authentication Attempted");
    }
    public void selectAuthenticationErrorResponse(){
        DataHelperAndWait.waitToBeVisible(this.getAuthenticationResultMenu(), webDriver);
        Select auth= new Select(this.getAuthenticationResultMenu());
        auth.selectByVisibleText("(P) Error Parsing Authentication Response");
    }
    public void selectAuthenticationInvalidSignature(){
        DataHelperAndWait.waitToBeVisible(this.getAuthenticationResultMenu(), webDriver);
        Select auth= new Select(this.getAuthenticationResultMenu());
        auth.selectByVisibleText("(S) Invalid Signature on Authentication Response");
    }
    public void selectAuthenticationMPI(){
        DataHelperAndWait.waitToBeVisible(this.getAuthenticationResultMenu(), webDriver);
        Select auth= new Select(this.getAuthenticationResultMenu());
        auth.selectByVisibleText("(I) MPI Processing Error");
    }
    public void selectAuthenticationNoCAVV(){
        DataHelperAndWait.waitToBeVisible(this.getAuthenticationResultMenu(), webDriver);
        Select auth= new Select(this.getAuthenticationResultMenu());
        auth.selectByVisibleText("(M) Authentication Attempted (No CAVV)");
    }

    public void selectCreditCardMethod() {
        DataHelperAndWait.clickOnElement(this.getCreditCardPaymentMethod(), webDriver);
        DataHelperAndWait.clickOnElement(this.getContinuePaymentMethodsBtn(), webDriver);

    }
    public void clickOnPlaceOrderBtnForCreditCard(){
        WebElementsAssertion.validateTheElementIsDisplayed(getFinalPlaceOrderBtn(),webDriver);
        DataHelperAndWait.clickOnElement(getFinalPlaceOrderBtn(),webDriver);
        waitTillCartLoaderInCreditCardDisappear(webDriver);
    }

}
