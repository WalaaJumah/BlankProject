/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.related_product_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.homepage_classes.IraqHomePage;
import sporter_pages.related_products_sections.RelatedProductSection;

import java.io.IOException;

@Getter
public class IraqRelatedProductsTestCases extends RelatedProductsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToIraqStore() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        currency=iraqHomePage.iraqCurrency;
        if (!webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
        }
        currency="USD";
    }
    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Cart Rules) Make sure that inability to add the same SKU appears in Related product section twice & the site display error mSG ", priority = 9)
    public void verifyInabilityToAddSameSKUToCartTwiceFromRelatedProductSection() throws IOException {
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
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(cartPage.getCartErrorMsg()));
    }
    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Cart Rules) Make sure that inability to add related products their values exceed 120 JOD ", priority = 9)
    public void verifyInabilityToAddRelatedProductsToCartWhenTheirValuesExceed100JOD() throws IOException {
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
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(cartPage.getCartErrorMsg()));
    }
}
