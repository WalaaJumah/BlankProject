/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class for JordanHomePageTestCases
 */

package sporter_test.homepage_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.JordanHomePage;

//@Test(groups = "2.04 Jordan HomePage")
public class JordanHomePageTestCases extends HomePageTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToJordanStore() {
        JordanHomePage jordanHomePage = new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        DataHelperAndWait.scrollToPositionZero(webDriver);
        if (webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + jordanHomePage.jordanDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }

    @Test(enabled = false)
    public void verifyTopSellingStacksSectionAreDisplayed() {
    }

    @Test(enabled = false)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {
    }

    @Test(enabled = false)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {
    }
}
