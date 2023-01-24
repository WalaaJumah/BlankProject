/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanRecommendedProductPage
 */

package sporter_pages.RecommendedProductsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JordanRecommendedProductPage extends RecommendedProductPage{
    public JordanRecommendedProductPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
