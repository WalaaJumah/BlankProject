/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.checkoutForRegisteredUserTPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;

public class EgyptCheckoutForRegisteredPage extends CheckoutForRegisteredPage {
    public EgyptCheckoutForRegisteredPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
