/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEAccountRegistrationTestCases
 */

package sporter_test.AccountRegistrationTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.UAEHomePage;

public class UAEAccountRegistrationTestCases extends AccountRegistrationTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToUAEStore() {
        UAEHomePage uaeHomePage = new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if (!webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)) {
            webDriver.navigate().to(BasePage.BaseURL + uaeHomePage.aeDomain);
            System.out.println(webDriver.getCurrentUrl());
        }
    }
}
