/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.guestCheckoutCyclePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IraqGuestCheckoutCyclePage extends GuestCheckoutCyclePage{
    public IraqGuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
