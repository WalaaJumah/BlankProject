/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanProductDetailsPage
 */

package sporter_pages.productPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JordanProductDetailsPage extends ProductDetailsPage {
    public JordanProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
