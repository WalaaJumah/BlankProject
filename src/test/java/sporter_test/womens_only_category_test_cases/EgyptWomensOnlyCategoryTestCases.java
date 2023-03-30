/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.womens_only_category_test_cases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_test.sportsSupplementsCategoryTestCases.SportsSupplementsCategoryTestCases;

public class EgyptWomensOnlyCategoryTestCases extends WomensOnlyCategoryTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Egypt Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            CloseInitialDialog();
        }
        storeCountry = "Egypt";
        countryCode = "20";
    }
}
