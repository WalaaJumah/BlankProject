/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSARelatedProductsTestCases
 */

package sporter_test.related_product_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.productPage.KSAProductDetailsPage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_pages.related_products_sections.RelatedProductSection;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "KSA Product Details Page")

public class KSARelatedProductsTestCases extends RelatedProductsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        currency=ksaHomePage.kSAArabicCurrency;
        if (!webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
        }
        if(!webDriver.getCurrentUrl().contains(websiteArabicLanguage)) {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        storeCountry = "المملكة العربية السعودية";
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Cart Rules) Make sure that inability to add the same SKU appears in Related product section 3 times & the site display error mSG ", priority = 9)
    public void verifyInabilityToAddSameSKUToCart3TimesFromRelatedProductSection() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        relatedProductSection.displayTheInStockProduct();
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1000);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
        DataHelperAndWait.waitForTime(1000);
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1000);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
        DataHelperAndWait.waitForTime(1000);
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1000);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
        DataHelperAndWait.waitForTime(1000);
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(cartPage.getCartErrorMsg()));
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Cart Rules) Make sure that inability to add related products their values exceed 819 JOD ", priority = 9)
    public void verifyInabilityToAddRelatedProductsToCartWhenTheirValuesExceed819JOD() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        relatedProductSection.displayTheInStockProduct();
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(), webDriver);
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        DataHelperAndWait.waitForTime(2500);
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1000);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
        DataHelperAndWait.waitForTime(1000);
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(cartPage.getCartErrorMsg()));
    }

}
