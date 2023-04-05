/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.myAccountTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.myAccountPages.OmanMyAccountPage;

public class OmanMyAccountTestCases extends MyAccountTestCases {
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
        storeCountry = "Oman";
        countryCode = "968";
    }

    @Test(enabled = false)
    public void verifyInabilityToAddNewAddressUsingInvalidNationalID() {
    }

    @Test(enabled = false)
    public void verifyInabilityToEditAddressUsingInvalidNationalID() {
    }
}
