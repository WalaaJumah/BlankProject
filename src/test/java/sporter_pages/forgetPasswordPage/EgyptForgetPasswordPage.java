/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptForgetPasswordPage
 */

package sporter_pages.forgetPasswordPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EgyptForgetPasswordPage extends ForgetPasswordPage {
    public EgyptForgetPasswordPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
