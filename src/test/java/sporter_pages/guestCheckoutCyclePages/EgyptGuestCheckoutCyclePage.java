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

@Getter
public class EgyptGuestCheckoutCyclePage extends GuestCheckoutCyclePage {
    @FindBy(id = "matrixrate_52")
    private WebElement nextDayMethod;
    @FindBy(xpath = "//div[@id='geidea_payment']//div[@id='circle']")
    private WebElement creditCardPaymentMethod;

    public EgyptGuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public static float convertTheStringToFloat(String text, WebDriver webDriver, String currency) {
        String elementValueWithoutCurrency = text.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Float.parseFloat(elementValueWithoutSpace);
    }

    public void submitCreditCard(String creditNumber, String cardDate, String cvv) {
        DataHelperAndWait.clickOnElement(this.getCreditCardPaymentMethod(), webDriver);
        webDriver.switchTo().frame(this.getCreditCardIFrame());
        DataHelperAndWait.waitToBeVisible(this.getCreditCardNumber(), webDriver);
        DataHelperAndWait.updateAllText(this.getCreditCardNumber(), creditNumber);
        DataHelperAndWait.waitToBeVisible(this.getCreditCardDate(), webDriver);
        DataHelperAndWait.updateAllText(this.getCreditCardDate(), cardDate);
        DataHelperAndWait.waitToBeVisible(this.getCreditCardCVV(), webDriver);
        DataHelperAndWait.updateAllText(this.getCreditCardCVV(), cvv);
        webDriver.switchTo().defaultContent();
        DataHelperAndWait.clickOnElement(this.getContinuePaymentMethodsBtn(), webDriver);
        DataHelperAndWait.waitForTime(1000);
    }

}
