/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanHeaderSection
 */

package sporter_pages.headerSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JordanHeaderSection extends HeaderSection {
    public JordanHeaderSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
