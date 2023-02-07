/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription CartPage
 */

package sporter_pages.cartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EgyptCartPage extends CartPage {
    public EgyptCartPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
