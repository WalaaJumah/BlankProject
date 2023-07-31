/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.headerTestCases;

import core.BasePage;
import lombok.Getter;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.IraqHomePage;

@Getter
public class IraqHeaderTestCases extends HeaderTestCases{

    @BeforeClass(alwaysRun = true)
    public void switchToIraqStore() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        if (webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            System.out.println("You are in IraqMyAccountTestCases Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
            CloseInitialDialog();
        }
    }
}
