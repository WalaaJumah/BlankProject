/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSARecommendedProductPage
 */

package sporter_pages.RecommendedProductsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KSARecommendedProductPage extends RecommendedProductPage {
    public KSARecommendedProductPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
