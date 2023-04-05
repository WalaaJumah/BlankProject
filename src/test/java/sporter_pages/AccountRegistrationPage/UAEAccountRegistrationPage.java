/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEAccountRegistrationPage
 */

package sporter_pages.AccountRegistrationPage;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAEAccountRegistrationPage extends AccountRegistrationPage {
    DataHelperAndWait dataHelperAndWait;

    public UAEAccountRegistrationPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
