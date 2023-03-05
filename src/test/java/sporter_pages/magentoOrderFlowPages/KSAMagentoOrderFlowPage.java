/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.magentoOrderFlowPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KSAMagentoOrderFlowPage extends MagentoOrderFlowPage {
    public KSAMagentoOrderFlowPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

}
