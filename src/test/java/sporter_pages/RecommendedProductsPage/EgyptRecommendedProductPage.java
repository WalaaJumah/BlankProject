/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptRecommendedProductPage
 */

package sporter_pages.RecommendedProductsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EgyptRecommendedProductPage extends RecommendedProductPage{
    public EgyptRecommendedProductPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
