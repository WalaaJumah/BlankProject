/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription GuestCheckoutCyclePage
 */

package sporter_pages.guestCheckoutCyclePages;

import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import xml_reader.XmlReader;

@Getter
public class EgyptGuestCheckoutCyclePage extends GuestCheckoutCyclePage {
    @FindBy(id = "matrixrate_52")
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
    public void selectCreditCardMethod() {
        DataHelperAndWait.clickOnElement(this.getCreditCardPaymentMethod(), webDriver);
        DataHelperAndWait.clickOnElement(this.getContinuePaymentMethodsBtn(), webDriver);

    }

}
