/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEProductDetailsTestCases
 */

package sporter_test.productTestCases;

import core.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.UAEHomePage;
import sporter_pages.productPage.UAEProductDetailsPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "UAE Product Details Page")

public class UAEProductDetailsTestCases extends ProductDetailsTestCases {
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
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Supplement Facts section displays correctly in the PDP", priority = 18, enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        UAEProductDetailsPage uAEProductDetailsPage = new UAEProductDetailsPage(webDriver);
        uAEProductDetailsPage.displayTheProduct();
        assertTrue(uAEProductDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(uAEProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the About Brand section displays correctly in the PDP", priority = 26, enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        UAEProductDetailsPage uAEProductDetailsPage = new UAEProductDetailsPage(webDriver);
        assertTrue(uAEProductDetailsPage.getAboutBrandSection().isDisplayed());
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the simple price changes when navigation between sizes for the config ", priority = 35, enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() throws IOException {
        UAEProductDetailsPage uAEProductDetailsPage = new UAEProductDetailsPage(webDriver);
        uAEProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(uAEProductDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = uAEProductDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(uAEProductDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = uAEProductDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice, "The simple price is not changes");
    }
}
