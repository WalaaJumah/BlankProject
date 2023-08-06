/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IraqLoginPage extends LoginPage{
    public IraqLoginPage(WebDriver webDriver) {
    super(webDriver);
    PageFactory.initElements(webDriver, this);

}

}
