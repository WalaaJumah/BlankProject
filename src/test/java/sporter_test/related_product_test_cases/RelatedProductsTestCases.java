/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription RelatedProductsTestCases
 */

package sporter_test.related_product_test_cases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.related_products_sections.RelatedProductSection;

import java.io.IOException;

@Test(groups = "2.21 Related Products Section")

public class RelatedProductsTestCases extends BaseTest {
    String storeCountry;
    String currency;
    float productPrice;

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure the Related Products section is displayed for in stock product ", priority = 1)
    public void verifyRelatedProductSectionIsDisplayedForInStockProduct() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        relatedProductSection.displayTheInStockProduct();
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsSection()));
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure that each of Related Products title,Product Names,images, prices appear correctly", priority = 2)
    public void verifyAllRelatedProductComponentsAreDisplayed() {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsTitle()), "Related Product title is missing");
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsImages().get(0)), "Product image is missing");
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsNames().get(0)), "Product name is missing");
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsPrices().get(0)), "Product price is missing");
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure add To Cart button appears correctly for all Related Products", priority = 3)
    public void verifyAddToCartBtnAppearsForAllRelatedProduct() {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        for (int i = 0; i < relatedProductSection.getAddRelatedProductToCart().size(); i++) {
            DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(i), webDriver);
            DataHelperAndWait.waitForTime(1000);
            Assert.assertTrue(relatedProductSection.getAddRelatedProductToCart().get(i).isDisplayed(), "Add to cart is missing");
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure add To Cart button works correctly", priority = 4)
    public void verifyAddToCartBtnWorksCorrectly() {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productPrice=DataHelperAndWait.convertTheStringToFloat(relatedProductSection.getRelatedProductsPrices().get(0), webDriver, currency);
        System.out.println(productPrice);
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1000);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
        DataHelperAndWait.waitForTime(1000);
        WebElementsAssertion.assertionTextIsEqual(cartPage.getCartCounter(), webDriver, "1");
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure the product price appears in the Related Products section is the same price when added it to the cart", priority = 5)
    public void verifyProductPriceInRelatedProductSectionMatchedWithPriceInCart() throws IOException {
        CartPage cartPage= new CartPage(webDriver);
       cartPage.navigateToCartPage();
       DataHelperAndWait.waitToBeVisible(cartPage.getOrderTotalValue(),webDriver);
       Assert.assertEquals(productPrice, DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, currency));
    }


}