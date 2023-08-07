/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.tabby_payment_method_pages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;

import java.util.List;

@Getter
public class TabbyPaymentPage extends BasePage {
    public TabbyPaymentPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
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
}
