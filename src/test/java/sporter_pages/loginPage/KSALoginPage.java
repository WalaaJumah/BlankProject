/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSALoginPage
 */

package sporter_pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KSALoginPage extends LoginPage{
    public KSALoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
