/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import lombok.Getter;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.IraqHomePage;

@Getter
public class IraqRecommendedProductTestCases extends RecommendedProductTestCases{

    @BeforeClass(alwaysRun = true)
    public void switchToIraqStore() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        if (!webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
        }
    }
}