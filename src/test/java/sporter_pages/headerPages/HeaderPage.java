/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription HeaderPage
 */

package sporter_pages.headerPages;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BasePage {
    public HeaderPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;
}
