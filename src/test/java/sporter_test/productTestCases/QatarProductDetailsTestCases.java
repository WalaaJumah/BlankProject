/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarProductDetailsTestCases
 */

package sporter_test.productTestCases;

import core.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.QatarHomePage;
import sporter_pages.productPage.QatarProductDetailsPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "Qatar Product Details Page")

public class QatarProductDetailsTestCases extends ProductDetailsTestCases {
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
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Supplement Facts section displays correctly in the PDP", priority = 18, enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        assertTrue(qatarProductDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(qatarProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Direction Of Use section displays correctly in the PDP", priority = 25, enabled = false)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
//        assertTrue(qatarProductDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the About Brand section displays correctly in the PDP", priority = 26, enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        assertTrue(qatarProductDetailsPage.getAboutBrandSection().isDisplayed());
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the simple price changes when navigation between sizes for the config ", priority = 35, enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() throws IOException {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = qatarProductDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = qatarProductDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice, "The simple price is not changes");
    }
}