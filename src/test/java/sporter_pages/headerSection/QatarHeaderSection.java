/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarHeaderSection
 */

package sporter_pages.headerSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QatarHeaderSection extends HeaderSection {
    public QatarHeaderSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
