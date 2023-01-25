/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarHeaderTestCases
 */

package sporter_test.headerTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.QatarHomePage;
@Test(groups = "2.07 Qatar Header Section")
public class QatarHeaderTestCases extends HeaderTestCases {
    @BeforeClass(alwaysRun=true)
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
