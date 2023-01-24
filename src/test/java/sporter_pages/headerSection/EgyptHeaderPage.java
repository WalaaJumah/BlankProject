/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription Egypt Header Page
 */

package sporter_pages.headerSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EgyptHeaderPage extends HeaderSection {
    public EgyptHeaderPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
