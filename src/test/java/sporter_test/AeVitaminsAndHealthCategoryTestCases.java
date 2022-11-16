package sporter_test;

import core.BaseTest;
import org.testng.annotations.Test;
import sporter_pages.AeProductDetailsPage;
import sporter_pages.AeSportSupplementsCategoryPage;
import sporter_pages.AeVitaminsAndHealthCategoryPage;
import sporter_pages.KsaHomePage;

public class AeVitaminsAndHealthCategoryTestCases extends BaseTest {
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    private AEMegaMenuTestCases aeMegaMenuTestCases;
    private AeProductDetailsPage aeProductDetailsPage;
    private AEFooterPageTestCases aeFooterPageTestCases;
    private KsaHomePage ksaHomePage;
    private AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage;

    @Test(description = "Make sure clicking on the Vitamins And Health Category Appears In MegaMenu Redirect User To CorrectURL", priority = 1)
    public void verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyClickingOnVitaminsAndHealthManiMenuRedirectUserToCorrectURL();
    }


}
