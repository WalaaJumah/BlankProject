/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEHeaderPage
 */

package sporter_pages.headerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAEHeaderPage extends HeaderPage {
    public UAEHeaderPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
