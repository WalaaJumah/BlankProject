/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSAHeaderPage
 */

package sporter_pages.headerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KSAHeaderPage extends HeaderPage {
    public KSAHeaderPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
