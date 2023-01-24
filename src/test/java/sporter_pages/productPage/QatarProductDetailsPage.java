/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarProductDetailsPage
 */

package sporter_pages.productPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QatarProductDetailsPage extends ProductDetailsPage {
    public QatarProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
