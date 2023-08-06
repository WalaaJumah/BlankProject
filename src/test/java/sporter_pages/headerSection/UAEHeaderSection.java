/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEHeaderSection
 */

package sporter_pages.headerSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAEHeaderSection extends HeaderSection {
    public UAEHeaderSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
