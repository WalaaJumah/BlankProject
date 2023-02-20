/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.checkoutForRegisteredUserTPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JordanCheckoutForRegisteredPage extends CheckoutForRegisteredPage {
    public JordanCheckoutForRegisteredPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
