/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarAccountRegistrationTestCases
 */

package sporter_test.AccountRegistrationTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.QatarHomePage;
import sporter_test.headerTestCases.HeaderTestCases;

public class QatarAccountRegistrationTestCases extends AccountRegistrationTestCases {
    @BeforeClass
    public void switchToQatarStore() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchCountry(qatarHomePage.getQatarCountry());
        if (webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)) {
            System.out.println("You are in Qatar Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + qatarHomePage.qatarDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }

    }
}
