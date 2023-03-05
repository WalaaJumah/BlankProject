/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.magentoOrderFlowPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QatarMagentoOrderFlowPage extends MagentoOrderFlowPage {
    public QatarMagentoOrderFlowPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
