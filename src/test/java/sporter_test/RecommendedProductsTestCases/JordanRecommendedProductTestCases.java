/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanRecommendedProductTestCases
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.JordanHomePage;

//@Test(groups = "Jordan Product Details Page")
public class JordanRecommendedProductTestCases extends RecommendedProductTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToJordanStore() {
        JordanHomePage jordanHomePage = new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if (webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + jordanHomePage.jordanDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }

    @Test(enabled = false)
    public void verifyViewCartWorksBtnCorrectly() {
    }

    @Test(enabled = false)
    public void verifyRecommendedProductsPopUpisHiddenAfterClickingOnTheKeepShoppingBtn() {
    }

    @Test(enabled = false)
    public void verifyRecommendedProductsPopUpisHiddenAfterClickingOnTheViewBtn() {
    }
}