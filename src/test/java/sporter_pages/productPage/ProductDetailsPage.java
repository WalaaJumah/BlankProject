/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription ProductDetailsPage
 */

package sporter_pages.productPage;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage {

    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    DataHelperAndWait dataHelperAndWait;
}
