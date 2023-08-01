/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAERecommendedProductTestCases
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.UAEHomePage;

//@Test(groups = "UAE Product Details Page")
public class UAERecommendedProductTestCases extends RecommendedProductTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToUAEStore() {
        UAEHomePage uaeHomePage = new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if (webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)) {
            System.out.println("You are in UAE Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + uaeHomePage.aeDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
}
