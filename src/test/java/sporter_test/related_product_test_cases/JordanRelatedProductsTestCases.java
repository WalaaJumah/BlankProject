/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanRelatedProductsTestCases
 */

package sporter_test.related_product_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.productPage.JordanProductDetailsPage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_pages.related_products_sections.RelatedProductSection;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "Jordan Product Details Page")

public class JordanRelatedProductsTestCases extends RelatedProductsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToJordanStore() {
        JordanHomePage jordanHomePage = new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        currency=jordanHomePage.JODCurrency;
        if (webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + jordanHomePage.jordanDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Cart Rules) Make sure that inability to add the same SKU appears in Related product section twice & the site display error mSG ", priority = 9)
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
     @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Cart Rules) Make sure that inability to add related products their values exceed 120 JOD ", priority = 9)
    public void verifyInabilityToAddRelatedProductsToCartWhenTheirValuesExceed120JOD() throws IOException {
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