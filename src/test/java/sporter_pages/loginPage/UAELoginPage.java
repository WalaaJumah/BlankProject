/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAELoginPage
 */

package sporter_pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAELoginPage extends LoginPage{
    public UAELoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
