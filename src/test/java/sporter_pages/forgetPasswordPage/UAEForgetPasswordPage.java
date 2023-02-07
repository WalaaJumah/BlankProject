/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription ForgetPasswordPage
 */

package sporter_pages.forgetPasswordPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAEForgetPasswordPage extends ForgetPasswordPage {
    public UAEForgetPasswordPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
