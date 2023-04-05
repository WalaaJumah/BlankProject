/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptLoginPage
 */

package sporter_pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EgyptLoginPage extends LoginPage {
    public EgyptLoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
