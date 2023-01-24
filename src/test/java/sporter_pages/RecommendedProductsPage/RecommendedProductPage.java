/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription RecommendedProductPage
 */

package sporter_pages.RecommendedProductsPage;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RecommendedProductPage extends BasePage {

    public RecommendedProductPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    DataHelperAndWait dataHelperAndWait;
}
