/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.guestCheckoutCyclePages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class IraqGuestCheckoutCyclePage extends GuestCheckoutCyclePage{
    public IraqGuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "(//div[@id='shippingMethod']/div)[1]")
    private WebElement twoBusinessDaysSuperExpressShipping;
       @FindBy(xpath = "(//div[@id='shippingMethod']/div)[2]")
    private WebElement threeFourBusinessDaysSuperExpressShipping;
       @FindBy(xpath = "(//div[@id='shippingMethod']/div)[2]")
    private WebElement payPal;

}
