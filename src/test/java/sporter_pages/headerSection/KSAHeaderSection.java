/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSAHeaderSection
 */

package sporter_pages.headerSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KSAHeaderSection extends HeaderSection {
    public KSAHeaderSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
