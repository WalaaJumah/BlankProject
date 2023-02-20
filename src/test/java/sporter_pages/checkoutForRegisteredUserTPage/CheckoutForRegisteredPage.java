/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription CheckoutForRegisteredPage
 */

package sporter_pages.checkoutForRegisteredUserTPage;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutForRegisteredPage extends BasePage {
    public CheckoutForRegisteredPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
