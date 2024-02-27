/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription ArabicLoginPage
 */

package eureka_pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ArabicLoginPage extends LoginPage {
    public ArabicLoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
