/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.myAccountTestCases;

import core.BasePage;
import lombok.Getter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.IraqHomePage;

@Getter
public class IraqMyAccountTestCases extends MyAccountTestCases{
    @BeforeClass(alwaysRun = true)
    public void switchToIraqStore() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        if (webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            System.out.println("You are in IraqForgetPasswordPage Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
            CloseInitialDialog();
        }
    }
    @Test(enabled = false)
    public void verifyInabilityToAddNewAddressUsingInvalidNationalID() {
    }

    @Test(enabled = false)
    public void verifyInabilityToEditAddressUsingInvalidNationalID() {
    }
}
