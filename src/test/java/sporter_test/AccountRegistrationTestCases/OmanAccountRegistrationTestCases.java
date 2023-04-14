/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.AccountRegistrationTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.myAccountPages.OmanMyAccountPage;

public class OmanAccountRegistrationTestCases extends AccountRegistrationTestCases{
    @BeforeClass(alwaysRun = true)
    public void switchToOmanStore() {
        OmanMyAccountPage omanMyAccountPage = new OmanMyAccountPage(webDriver);
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(omanMyAccountPage.getOmanCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.omanDomain)) {
            System.out.println("You are in Oman Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.omanDomain);
            CloseInitialDialog();
        }
    }
}
