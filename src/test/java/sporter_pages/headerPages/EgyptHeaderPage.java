/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription Egypt Header Page
 */

package sporter_pages.headerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EgyptHeaderPage extends HeaderPage {
    public EgyptHeaderPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
