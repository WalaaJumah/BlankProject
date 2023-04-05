/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanAccountRegistrationPage
 */

package sporter_pages.AccountRegistrationPage;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JordanAccountRegistrationPage extends AccountRegistrationPage {
    DataHelperAndWait dataHelperAndWait;

    public JordanAccountRegistrationPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
