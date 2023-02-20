/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.checkoutForRegisteredUserTPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QatarCheckoutForRegisteredPage extends CheckoutForRegisteredPage {
    public QatarCheckoutForRegisteredPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
