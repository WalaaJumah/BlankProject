/**
 * @author w.jumaa
 * @projectName SporterApprovedFramework
 * @classDescription
 */

package sporter_test;

import core.BasePage;
import core.BaseTest;
import org.testng.annotations.Test;
import sporter_pages.productPage.ProductDetailsPage;

public class ProductsChecker extends BaseTest {
    @Test
    public void verifyIfProductContainsErrors() throws Exception {
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.productUrl);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.iraqDomain+ BasePage.bogoProductIraq);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.iraqDomain+ BasePage.productUrlIraq);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.iraqDomain+ BasePage.productUrlIraqHighPrice);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.iraqDomain+ BasePage.productUrlIraqHighPrice2);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.iraqDomain+ BasePage.productUrlIraqHighPrice3);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.iraqDomain+ BasePage.productUrlIraq2);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.ksaDomainArabic+ BasePage.productUrlKSA1);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.ksaDomainArabic+ BasePage.productUrlKSA2);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.ksaDomainArabic+ BasePage.productUrlKSA3);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.ksaDomainArabic+ BasePage.productUrlKSA4);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.ksaDomainArabic+ BasePage.productUrlKSA5);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.ksaDomainArabic+ BasePage.productUrlKSA6);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.ksaDomainArabic+ BasePage.productUrlKSAWithHighPrice3);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.ksaDomainArabic+ BasePage.bogoUrlKSA);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.ksaDomainArabic+ BasePage.productUrlKSAWithHighPrice2);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.ksaDomainArabic+ BasePage.productUrlKSAWithHighPrice1);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.egyptDomain+ BasePage.productUrlEgypt);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.egyptDomain+ BasePage.oOSProductUrlForEg);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.jordanDomain+ BasePage.productUrlJordan7);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.jordanDomain+ BasePage.productUrlJordanWithHighPrice);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.jordanDomain+ BasePage.productUrlJordanWithHighPrice2);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.qatarDomain+ BasePage.productUrlQatarWithHighPrice);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.qatarDomain+ BasePage.productUrlQatarWithHighPrice2);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.qatarDomain+ BasePage.bogoUrlQatar);
        productDetailsPage.displayTheProductWithSoftAssertion(BasePage.qatarDomain+ BasePage.product2UrlLessQty);
    }

}
