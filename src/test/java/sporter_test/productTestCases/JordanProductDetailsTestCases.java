/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanProductDetailsTestCases
 */

package sporter_test.productTestCases;

import core.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.productPage.JordanProductDetailsPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "Jordan Product Details Page")

public class JordanProductDetailsTestCases extends ProductDetailsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToJordanStore() {
        JordanHomePage jordanHomePage = new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if (webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + jordanHomePage.jordanDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Supplement Facts section displays correctly in the PDP", priority = 18, enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        jordanProductDetailsPage.displayTheProduct();
        assertTrue(jordanProductDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(jordanProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Direction Of Use section displays correctly in the PDP", priority = 25, enabled = false)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        jordanProductDetailsPage.displayTheProduct();
//        assertTrue(jordanProductDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the About Brand section displays correctly in the PDP", priority = 26, enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        assertTrue(jordanProductDetailsPage.getAboutBrandSection().isDisplayed());
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the simple price changes when navigation between sizes for the config ", priority = 35, enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() throws IOException {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        jordanProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = jordanProductDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = jordanProductDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice, "The simple price is not changes");
    }
}