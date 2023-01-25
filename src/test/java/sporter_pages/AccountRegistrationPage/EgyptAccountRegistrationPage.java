/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptAccountRegistrationPage
 */

package sporter_pages.AccountRegistrationPage;

import core.BasePage;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EgyptAccountRegistrationPage extends AccountRegistrationPage {
    public EgyptAccountRegistrationPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    DataHelperAndWait dataHelperAndWait;
}
