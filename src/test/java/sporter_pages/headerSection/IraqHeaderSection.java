/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.headerSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IraqHeaderSection extends HeaderSection{
    public IraqHeaderSection(WebDriver webDriver) {
    super(webDriver);
    PageFactory.initElements(webDriver, this);
}

}
