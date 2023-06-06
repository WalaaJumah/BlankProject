/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAELoginTestCases
 */

package sporter_test.loginTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.UAEHomePage;

public class UAELoginTestCases extends LoginTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToQatarStore() {
        UAEHomePage uaeHomePage = new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if (webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)) {
            System.out.println("You are in UAE Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + uaeHomePage.aeDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
}
