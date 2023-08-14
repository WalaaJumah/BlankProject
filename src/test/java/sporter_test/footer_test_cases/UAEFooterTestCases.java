/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.footer_test_cases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.UAEHomePage;

public class UAEFooterTestCases extends FooterTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToUAEStore() {
        UAEHomePage uaeHomePage = new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if (webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)) {
            System.out.println("You are in UAE Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + uaeHomePage.aeDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
}
