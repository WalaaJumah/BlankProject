/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptRelatedProductsTestCases]
 */

package sporter_test.related_product_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.megaMenuPages.EgyptMegaMenuPage;
import sporter_pages.megaMenuPages.MegaMenuPage;
import sporter_pages.productPage.EgyptProductDetailsPage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_pages.related_products_sections.RelatedProductSection;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "Egypt Product Details Page")
public class EgyptRelatedProductsTestCases extends RelatedProductsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        currency=egyptHomePage.EGPCurrency;
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            //CloseInitialDialog();
//            productDetailsPage.storeCountry="/en-eg";
            productDetailsPage.storeCountry = "/en-eg";
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure the product price appears in the Related Products section is the same price when added it to the product Details Page", priority = 6)
    public void verifyProductPriceInRelatedProductSectionMatchedWithPriceInProductDetailsPage() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        relatedProductSection.displayTheInStockProduct();
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(2000);
        productPrice=DataHelperAndWait.convertTheStringToFloat(relatedProductSection.getRelatedProductsPrices().get(0), webDriver, currency);
        DataHelperAndWait.hoverOnElement(relatedProductSection.getAddRelatedProductToCart().get(0), webDriver);
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0), webDriver);
        DataHelperAndWait.waitForTime(2000);
        Assert.assertEquals(productPrice, DataHelperAndWait.convertTheStringToFloatWithoutthousandComma(productDetailsPage.getFinalProductPrice(), webDriver, currency));
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Related Product For OOS)Make sure the product price appears in the Related Products section is the same price when displaying the product", priority = 23)
    public void verifyProductPriceInRelatedProductSectionMatchedWithPriceInProductDetailsPageForOOS() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        relatedProductSection.displayTheOutStockProduct();
//        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
//        DataHelperAndWait.waitForTime(2000);
        productPrice=DataHelperAndWait.convertTheStringToFloat(relatedProductSection.getRelatedProductsPrices().get(0), webDriver, currency);
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
//        Assert.assertTrue(relatedProductSection.getAddRelatedProductToCart().get(0).isDisplayed(), "Add to cart is missing");
        relatedProductSection.waitTillLoaderComplete();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFinalProductPrice(),webDriver);
        Assert.assertEquals(productPrice, DataHelperAndWait.convertTheStringToFloatWithoutthousandComma(productDetailsPage.getFinalProductPrice(), webDriver, currency));
    }
}