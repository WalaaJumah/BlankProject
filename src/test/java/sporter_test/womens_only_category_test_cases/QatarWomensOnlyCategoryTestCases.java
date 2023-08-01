/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.womens_only_category_test_cases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.QatarHomePage;
import sporter_test.sportsSupplementsCategoryTestCases.SportsSupplementsCategoryTestCases;

public class QatarWomensOnlyCategoryTestCases extends WomensOnlyCategoryTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToQatarStore() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchCountry(qatarHomePage.getQatarCountry());
        if (webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)) {
            System.out.println("You are in Qatar Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + qatarHomePage.qatarDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
        storeCountry = "Qatar";
        countryCode = "974";
    }
}
