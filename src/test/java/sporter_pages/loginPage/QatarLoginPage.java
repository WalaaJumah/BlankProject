/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarLoginPage
 */

package sporter_pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QatarLoginPage extends LoginPage {
    public QatarLoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
