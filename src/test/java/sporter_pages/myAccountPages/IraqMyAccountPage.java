/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.myAccountPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IraqMyAccountPage extends MyAccountPage{
    public IraqMyAccountPage(WebDriver webDriver) {
    super(webDriver);
    PageFactory.initElements(webDriver, this);
}

}
