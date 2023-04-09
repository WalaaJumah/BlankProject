/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.myAccountPages.KuwaitMyAccountPage;

public class KuwaitRecommendedProductsTestCases extends RecommendedProductTestCases{
    public void switchToKuwaitStore() {
        KuwaitMyAccountPage kuwaitMyAccountPage = new KuwaitMyAccountPage(webDriver);
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(kuwaitMyAccountPage.getKuwaitCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.kuwaitDomain)) {
            System.out.println("You are in Kuwait Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.kuwaitDomain);
            CloseInitialDialog();
        }
        storeCountry="Kuwait";
    }
}
