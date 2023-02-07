/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanLoginPage
 */

package sporter_pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JordanLoginPage extends LoginPage{
    public JordanLoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
