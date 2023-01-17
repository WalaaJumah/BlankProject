/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarHeaderPage
 */

package sporter_pages.headerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QatarHeaderPage extends HeaderPage {
    public QatarHeaderPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
