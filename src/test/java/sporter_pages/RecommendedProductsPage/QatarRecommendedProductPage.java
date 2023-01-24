/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarRecommendedProductPage
 */

package sporter_pages.RecommendedProductsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QatarRecommendedProductPage extends RecommendedProductPage{
    public QatarRecommendedProductPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
