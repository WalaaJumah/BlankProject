/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.cartRulesTestCases;

import core.BasePage;
import lombok.Getter;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.IraqHomePage;
import sporter_test.AccountRegistrationTestCases.AccountRegistrationTestCases;
@Getter
public class IraqCartRulesTestCases extends CartRulesTestCases {
    @BeforeClass(alwaysRun = true)
    public void IraqCartRulesTestCases() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        if (webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            System.out.println("You are in IraqCheckoutForRegisteredTestCases Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
            //CloseInitialDialog();
        }
    }
}
