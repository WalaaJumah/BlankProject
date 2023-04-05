/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAERecommendedProductPage
 */

package sporter_pages.RecommendedProductsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAERecommendedProductPage extends RecommendedProductPage {
    public UAERecommendedProductPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
