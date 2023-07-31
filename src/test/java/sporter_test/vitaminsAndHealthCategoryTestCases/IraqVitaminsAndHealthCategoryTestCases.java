/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.vitaminsAndHealthCategoryTestCases;

import core.BasePage;
import lombok.Getter;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.IraqHomePage;

@Getter
public class IraqVitaminsAndHealthCategoryTestCases extends VitaminsAndHealthCategoryTestCases{

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
}
