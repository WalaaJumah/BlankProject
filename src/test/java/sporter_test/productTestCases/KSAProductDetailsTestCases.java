/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSAProductDetailsTestCases
 */

package sporter_test.productTestCases;

import core.BasePage;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.productPage.KSAProductDetailsPage;
import java.io.IOException;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "KSA Product Details Page")

public class KSAProductDetailsTestCases extends ProductDetailsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if (!webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
        }
        if(!webDriver.getCurrentUrl().contains(websiteArabicLanguage)) {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        storeCountry = "المملكة العربية السعودية";
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Supplement Facts section displays correctly in the PDP", priority = 18, enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
        kSAProductDetailsPage.displayTheProduct();
        assertTrue(kSAProductDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(kSAProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Direction Of Use section displays correctly in the PDP", priority = 25, enabled = false)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
        kSAProductDetailsPage.displayTheProduct();
//        assertTrue(kSAProductDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the About Brand section displays correctly in the PDP", priority = 26, enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
        assertTrue(kSAProductDetailsPage.getAboutBrandSection().isDisplayed());
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the simple price changes when navigation between sizes for the config ", priority = 35, enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() throws IOException {
        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = kSAProductDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = kSAProductDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice, "The simple price is not changes");
    }
}
