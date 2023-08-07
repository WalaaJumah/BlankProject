/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.tabby_payment_method_pages;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import xml_reader.XmlReader;

import java.util.List;

@Getter
public class TabbyPaymentPage extends BasePage {
    public TabbyPaymentPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    String tabbySubUrl = ".tabby";
    String tabbySuccessInstallmentsSubUrl = "success-installments?";
    @FindBy(xpath = "//div[@id='tabby_installments']//div[@id='circle']")
    private WebElement tabbyInstallmentsPaymentMethod;
    @FindBy(id = "tabby-checkout")
    private WebElement tabbyPage;
    @FindBy(xpath = "//div[@data-test='header.languageSwitcher']")
    private WebElement tabbyLanguageSwitcher;
    @FindBy(xpath = "//div[@data-test='order.amount']")
    private WebElement orderAmountInTabbyPage;
    @FindBy(xpath = "//div[@data-test='order.dueToday']")
    private WebElement dueTodayInTabbyPage;
    @FindBy(xpath = "//div[@data-test='payments-schedule-title']")
    private WebElement tabbyHeaderTitle;
    @FindBy(xpath = "//div[@data-test='paymentSchedule.paymentRowCount']")
    private List<WebElement> tabbyPaymentSchedule;
    @FindBy(xpath = "//SPAN[@data-test='backToStore']")
    private WebElement backToStoreBtnInTabbyPage;
    @FindBy(xpath = "//button[@data-test='loginForm.continue']")
    private WebElement loginBtnTabbyPage;
    @FindBy(name = "email")
    private WebElement emailFieldInTabbyPage;
    @FindBy(id = "mui-2")
    private WebElement countryCodeFieldInTabbyPage;
    @FindBy(name = "phone")
    private WebElement phoneFieldInTabbyPage;
    @FindBy(id = "mui-1-helper-text")
    private WebElement emailErrorMsgInTabbyPage;
    @FindBy(id = "mui-3-helper-text")
    private WebElement phoneErrorMsgInTabbyPage;
    @FindBy(id = "mui-6")
    private WebElement cardNumberFieldInTabbyPage;
    @FindBy(id = "mui-7")
    private WebElement expiredDateFieldInTabbyPage;
    @FindBy(id = "mui-8")
    private WebElement cvvFieldInTabbyPage;
    @FindBy(xpath = "//div[@id='payment-widget-pay-button']/button")
    private WebElement payBtnInTabbyPage;
    @FindBy(id = "pInfoData")
    private WebElement paymentMethodInfoLabel;
    @FindBy(id = "pInfoEdit")
    private WebElement editBtnInPaymentMethodInfoLabel;
    @FindBy(xpath = "//input[@autocomplete='one-time-code']")
    private WebElement otpField;
    @FindBy(xpath = "//div[@data-test='warning.general_rejection']")
    private WebElement tabbyRejectionTranaction;
    @FindBy(xpath = "//button[@data-test='choose-another-payment-method']")
    private WebElement backToStoreBtnInRejectionPage;
    @FindBy(id = "AddToCartErrMsg")
    private WebElement transactionFailedError;
    @FindBy(xpath = "(//div[@id='grand_total'])[1]/div/span[@id='value']")
    private WebElement orderTotalFieldInrReviewPage;
    public void SelectTabbyInstallmentsMethod(){
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitToBeVisible(tabbyInstallmentsPaymentMethod,webDriver);
        DataHelperAndWait.clickOnElement(tabbyInstallmentsPaymentMethod,webDriver);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
    }
public void selectTabbyInstallmentsMethodFromEditPage(){
    DataHelperAndWait.waitToBeVisible(editBtnInPaymentMethodInfoLabel,webDriver);
    DataHelperAndWait.clickOnElement(editBtnInPaymentMethodInfoLabel,webDriver);
    SelectTabbyInstallmentsMethod();
}
public double calculateInstallmentsAmount(String currency){
    double sum = 0;
    for (WebElement element : tabbyPaymentSchedule) {
        double number=DataHelperAndWait.extractDigitsFromWithoutCurrencyConvertToDouble(element,webDriver,currency);
        sum += number;
    }
    return sum;
}
public void clickOnReturnToStore(){
    DataHelperAndWait.waitToBeVisible(backToStoreBtnInTabbyPage,webDriver);
    DataHelperAndWait.clickOnElement(backToStoreBtnInTabbyPage,webDriver);
}
public void submitEmailAndPhoneNumberInPositiveFlow(){
    DataHelperAndWait.waitToBeVisible(emailFieldInTabbyPage,webDriver);
    DataHelperAndWait.updateAllText(emailFieldInTabbyPage,XmlReader.getXMLData("tabbyPositiveEmail"));
    DataHelperAndWait.waitToBeVisible(phoneFieldInTabbyPage,webDriver);
    DataHelperAndWait.updateAllText(phoneFieldInTabbyPage,XmlReader.getXMLData("tabbyPositivePhone"));
    DataHelperAndWait.waitToBeVisible(loginBtnTabbyPage,webDriver);
    DataHelperAndWait.clickOnElement(loginBtnTabbyPage,webDriver);
    DataHelperAndWait.waitToBeVisible(otpField,webDriver);
    DataHelperAndWait.updateAllText(phoneFieldInTabbyPage,XmlReader.getXMLData("tabbyPositiveOTP"));
    DataHelperAndWait.waitToBeVisible(cardNumberFieldInTabbyPage,webDriver);


}
    public void submitTabbyInfoWithNegativeFlow(){
        DataHelperAndWait.waitToBeVisible(emailFieldInTabbyPage,webDriver);
        DataHelperAndWait.updateAllText(emailFieldInTabbyPage,XmlReader.getXMLData("tabbyNegativeEmail"));
        DataHelperAndWait.waitToBeVisible(phoneFieldInTabbyPage,webDriver);
        DataHelperAndWait.updateAllText(phoneFieldInTabbyPage,XmlReader.getXMLData("tabbyNegativePhone"));
        DataHelperAndWait.waitToBeVisible(loginBtnTabbyPage,webDriver);
        DataHelperAndWait.clickOnElement(loginBtnTabbyPage,webDriver);
        DataHelperAndWait.waitToBeVisible(otpField,webDriver);
        DataHelperAndWait.updateAllText(phoneFieldInTabbyPage,XmlReader.getXMLData("tabbyNegativeOTP"));
        DataHelperAndWait.waitToBeVisible(cardNumberFieldInTabbyPage,webDriver);
        fillInTheCardInfo();
        WebElementsAssertion.validateTheElementIsDisplayed(tabbyRejectionTranaction,webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(transactionFailedError,webDriver);

    }

public void fillInTheCardInfo(){
    DataHelperAndWait.waitToBeVisible(cardNumberFieldInTabbyPage,webDriver);
    DataHelperAndWait.updateAllText(cardNumberFieldInTabbyPage,XmlReader.getXMLData("tabbyPositiveCard"));
     DataHelperAndWait.waitToBeVisible(expiredDateFieldInTabbyPage,webDriver);
    DataHelperAndWait.updateAllText(expiredDateFieldInTabbyPage,XmlReader.getXMLData("tabbyPositiveCardDate"));
       DataHelperAndWait.waitToBeVisible(cvvFieldInTabbyPage,webDriver);
    DataHelperAndWait.updateAllText(expiredDateFieldInTabbyPage,XmlReader.getXMLData("tabbyPositiveCVV"));
}

public void submitCardInfo(){
    DataHelperAndWait.waitToBeVisible(payBtnInTabbyPage,webDriver);
    DataHelperAndWait.clickOnElement(payBtnInTabbyPage,webDriver);
    DataHelperAndWait.waitForUrlContains(tabbySuccessInstallmentsSubUrl,webDriver);

}
}
