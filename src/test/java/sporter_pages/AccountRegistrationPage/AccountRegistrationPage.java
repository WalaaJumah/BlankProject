/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription AccountRegistrationPage
 */

package sporter_pages.AccountRegistrationPage;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage extends BasePage {
    public AccountRegistrationPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;
}
