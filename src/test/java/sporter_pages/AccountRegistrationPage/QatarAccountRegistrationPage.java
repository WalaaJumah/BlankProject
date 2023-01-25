/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarAccountRegistrationPage
 */

package sporter_pages.AccountRegistrationPage;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QatarAccountRegistrationPage  extends AccountRegistrationPage {
    public QatarAccountRegistrationPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;
}
