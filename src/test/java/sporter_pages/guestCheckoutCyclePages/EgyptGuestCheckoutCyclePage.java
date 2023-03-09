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
import org.testng.annotations.Test;
@Getter
public class EgyptGuestCheckoutCyclePage extends  GuestCheckoutCyclePage{
    public EgyptGuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public static  float convertTheStringToFloat(String text,WebDriver webDriver,String currency) {
        String elementValueWithoutCurrency = text.replaceAll(currency, "");
        String elementValueWithoutSpace = elementValueWithoutCurrency.replaceAll(" ", "");
        return Float.parseFloat(elementValueWithoutSpace);
    }

    @FindBy(id= "flatrate")
    private WebElement nextDayMethod;

}
