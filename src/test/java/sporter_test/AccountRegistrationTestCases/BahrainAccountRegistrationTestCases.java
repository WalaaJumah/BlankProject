/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.AccountRegistrationTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.myAccountPages.BahrainMyAccountPage;

public class BahrainAccountRegistrationTestCases extends AccountRegistrationTestCases{
@BeforeClass(alwaysRun = true)
public void switchToBahrainStore() {
    BahrainMyAccountPage bahrainMyAccountPage = new BahrainMyAccountPage(webDriver);
    EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
    egyptHomePage.switchCountry(bahrainMyAccountPage.getBahrainCountry());
    if (webDriver.getCurrentUrl().contains(egyptHomePage.bahrainDomain)) {
        System.out.println("You are in Bahrain Store");
    } else {
        webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.bahrainDomain);
        CloseInitialDialog();
    }
}

}
