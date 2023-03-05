/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.magentoOrderFlowPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.productPage.ProductDetailsPage;

public class EgyptMagentoOrderFlowPage extends MagentoOrderFlowPage {
    public EgyptMagentoOrderFlowPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
