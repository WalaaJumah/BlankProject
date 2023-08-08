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
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import sporter_pages.cartPages.CartPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.io.IOException;
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
    @FindBy(xpath = "//input[@data-test='loginForm.phoneInput']")
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
       @FindBy(xpath = "//button[@data-test='leaveDialog.back']")
    private WebElement confirmBack;
       @FindBy(id = "mui-7-helper-text")
    private WebElement ExpiryDateError;
       @FindBy(id = "closeAddToCartErrBtn")
    private WebElement errorMsgInPaymentMethod;

    public void SelectTabbyInstallmentsMethod() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitToBeVisible(tabbyInstallmentsPaymentMethod,webDriver);
        DataHelperAndWait.clickOnElement(tabbyInstallmentsPaymentMethod,webDriver);
        DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getContinuePaymentMethodsBtn(), webDriver);
        try {
            WebElement error = webDriver.findElement(By.id("closeAddToCartErrBtn"));
            if (error != null && error.isDisplayed()) {
                throw new AssertionError("Error When selecting the Payment Method");
            }
        } catch (NoSuchElementException ex) {
        }
    }
    public void addToCartAndDisplayTheCart() throws IOException {
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        try{if(productDetailsPage.getAddToCartBtn().isDisplayed())
            System.out.println("You are in product Details page");
        }
        catch (Exception e){
            productDetailsPage.displayTheProduct();
        }
        productDetailsPage.addToCart();
            productDetailsPage.viewCart();
    }
    public void accessGuestCheckoutForm() throws IOException {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        try {
            CartPage cartPage = new CartPage(webDriver);
           addToCartAndDisplayTheCart();
            try {
                cartPage.proceedToCheckout();
            } catch (Exception e) {
                cartPage.navigateToHomePage();
                cartPage.clickOnCartIcon();
                DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
            }
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCheckoutAsGuestBtn(), webDriver);
        } catch (Exception e) {
            CartPage cartPage = new CartPage(webDriver);
            addToCartAndDisplayTheCart();

            try {
                cartPage.proceedToCheckout();
            } catch (Exception ee) {
                cartPage.navigateToHomePage();
                cartPage.clickOnCartIcon();
                DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtnInCartPopup(), webDriver);
            }
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getCheckoutAsGuestBtn(), webDriver);
        }
    }
public void clickOnFinalPlaceOrderBtn(){
        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,50);
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        try {
            DataHelperAndWait.waitToBeVisible(guestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);
            DataHelperAndWait.clickOnElement(guestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);
        }
        catch (Exception e){
            DataHelperAndWait.hoverOnElementAndClick(guestCheckoutCyclePage.getFinalPlaceOrderBtn(), webDriver);

        }

}
    public void selectTabbyInstallmentsMethodFromEditPage() throws IOException {
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
    DataHelperAndWait.waitToBeVisible(confirmBack,webDriver);
    DataHelperAndWait.clickOnElement(confirmBack,webDriver);

}
public void submitEmailAndPhoneNumberInPositiveFlow(){
    DataHelperAndWait.waitToBeVisible(emailFieldInTabbyPage,webDriver);
    DataHelperAndWait.updateAllText(emailFieldInTabbyPage,XmlReader.getXMLData("tabbyPositiveEmail"));
    DataHelperAndWait.waitToBeVisible(phoneFieldInTabbyPage,webDriver);
    DataHelperAndWait.updateAllText(phoneFieldInTabbyPage,XmlReader.getXMLData("tabbyPositivePhone"));
    DataHelperAndWait.waitToBeVisible(loginBtnTabbyPage,webDriver);
    DataHelperAndWait.clickOnElement(loginBtnTabbyPage,webDriver);
    DataHelperAndWait.waitToBeVisible(otpField,webDriver);
    DataHelperAndWait.updateAllText(otpField,XmlReader.getXMLData("tabbyPositiveOTP"));
    DataHelperAndWait.waitToBeVisible(cardNumberFieldInTabbyPage,webDriver);


}
    public void submitTabbyInfoWithNegativeFlow(){
        DataHelperAndWait.waitToBeVisible(emailFieldInTabbyPage,webDriver);
        DataHelperAndWait.updateAllText(emailFieldInTabbyPage,XmlReader.getXMLData("tabbyNegativeEmail"));
        DataHelperAndWait.waitToBeVisible(phoneFieldInTabbyPage,webDriver);
        DataHelperAndWait.updateAllText(phoneFieldInTabbyPage,XmlReader.getXMLData("tabbyNegativePhone"));
        DataHelperAndWait.waitToBeVisible(loginBtnTabbyPage,webDriver);
        DataHelperAndWait.clickOnElement(loginBtnTabbyPage,webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(getEmailErrorMsgInTabbyPage(),webDriver);


    }

public void fillInTheCardInfo() throws IOException, InterruptedException {
    DataHelperAndWait.waitToBeVisible(cardNumberFieldInTabbyPage,webDriver);
    DataHelperAndWait.updateAllText(cardNumberFieldInTabbyPage,XmlReader.getXMLData("tabbyPositiveCard"));
    DataHelperAndWait.waitToBeVisible(cvvFieldInTabbyPage,webDriver);
    DataHelperAndWait.clickOnElement(cvvFieldInTabbyPage,webDriver);
    DataHelperAndWait.updateAllText(cvvFieldInTabbyPage,XmlReader.getXMLData("tabbyPositiveCVV"));
    DataHelperAndWait.waitToBeVisible(expiredDateFieldInTabbyPage,webDriver);
    DataHelperAndWait.updateAllText(expiredDateFieldInTabbyPage,XmlReader.getXMLData("tabbyPositiveCardDate"));
    try{
        if(getExpiryDateError().isDisplayed())
            DataHelperAndWait.clickOnElement(expiredDateFieldInTabbyPage,webDriver);
            DataHelperAndWait.updateAllText(expiredDateFieldInTabbyPage,XmlReader.getXMLData("tabbyPositiveCardDate"));
    }
    catch (Exception e){}

    submitCardInfo();
}

public void submitCardInfo(){
    DataHelperAndWait.waitToBeVisible(payBtnInTabbyPage,webDriver);
    DataHelperAndWait.clickOnElement(payBtnInTabbyPage,webDriver);
    DataHelperAndWait.waitForUrlContains(tabbySuccessInstallmentsSubUrl,webDriver);

}
}
