/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSAAccountRegistrationPage
 */

package sporter_pages.AccountRegistrationPage;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KSAAccountRegistrationPage  extends AccountRegistrationPage {
    public KSAAccountRegistrationPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;
}
