/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.myAccountPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QatarMyAccountPage extends MyAccountPage{
    public QatarMyAccountPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
