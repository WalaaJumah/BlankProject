/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription GuestCheckoutCyclePage
 */

package sporter_pages.guestCheckoutCyclePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EgyptGuestCheckoutCyclePage extends  GuestCheckoutCyclePage{
    public EgyptGuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
