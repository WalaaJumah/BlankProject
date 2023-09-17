/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.related_product_test_cases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.myAccountPages.OmanMyAccountPage;

public class OmanRelatedProductsTestCases extends RelatedProductsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToOmanStore() {
        OmanMyAccountPage omanMyAccountPage = new OmanMyAccountPage(webDriver);
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        currency=egyptHomePage.OMRCurrency;
        egyptHomePage.switchCountry(omanMyAccountPage.getOmanCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.omanDomain)) {
            System.out.println("You are in Oman Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.omanDomain);
            //CloseInitialDialog();
        }
        storeCountry = "Oman";
    }
}