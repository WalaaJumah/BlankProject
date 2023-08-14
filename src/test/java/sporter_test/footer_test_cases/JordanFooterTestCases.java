/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.footer_test_cases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.JordanHomePage;

public class JordanFooterTestCases extends FooterTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToJordanStore() {
        JordanHomePage jordanHomePage = new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if (webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + jordanHomePage.jordanDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
}
