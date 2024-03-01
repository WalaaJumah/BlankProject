/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription ArabicAccountRegistrationPage
 */

package eureka_pages.AccountRegistrationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ArabicAccountRegistrationPage extends AccountRegistrationPage {
    DataHelperAndWait dataHelperAndWait;

    public ArabicAccountRegistrationPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
