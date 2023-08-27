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
import sporter_pages.productPage.ProductDetailsPage;
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

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure Shop Now button appears correctly for all Related Products", priority = 50)
    public void verifyShopNowBtnAppearsForAllRelatedProduct() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        for (int i = 0; i < relatedProductSection.getAddRelatedProductToCart().size(); i++) {
            webDriver.manage().deleteCookieNamed("guestCartId");
            relatedProductSection.displayTheInStockProduct();
            DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(i), webDriver);
            DataHelperAndWait.waitForTime(2000);
            Assert.assertTrue(relatedProductSection.getAddRelatedProductToCart().get(i).isDisplayed(), "Add to cart is missing");
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure the related products section appears in the correct language", priority = 4)
    public void verifyRelatedProductAppearsWithCorrectLanguage(){
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        if(webDriver.getCurrentUrl().contains("/en")){
        Assert.assertTrue(DataHelperAndWait.isTextOnlyEnglish(relatedProductSection.getRelatedProductsTitle().getText()));
        Assert.assertTrue(DataHelperAndWait.isTextOnlyEnglish(relatedProductSection.getRelatedProductsNames().get(0).getText()));
        }
        else {
            Assert.assertTrue(DataHelperAndWait.isTextOnlyArabic(relatedProductSection.getRelatedProductsTitle().getText()));
            Assert.assertTrue(DataHelperAndWait.isTextOnlyArabic(relatedProductSection.getRelatedProductsNames().get(0).getText()));
        }
    }
    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure add To Cart button works correctly", priority = 5)
    public void verifyAddToCartBtnWorksCorrectly() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        relatedProductSection.displayTheInStockProduct();
        productPrice=DataHelperAndWait.convertTheStringToFloat(relatedProductSection.getRelatedProductsPrices().get(0), webDriver, currency);
        System.out.println(productPrice);
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
        DataHelperAndWait.waitForTime(1500);
//        WebElementsAssertion.assertionTextIsEqual(cartPage.getCartCounter(), webDriver, "1");
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure the product price appears in the Related Products section is the same price when added it to the product Details Page", priority = 6)
    public void verifyProductPriceInRelatedProductSectionMatchedWithPriceInProductDetailsPage() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        relatedProductSection.displayTheInStockProduct();
//        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
//        DataHelperAndWait.waitForTime(2000);
        productPrice=DataHelperAndWait.convertTheStringToFloat(relatedProductSection.getRelatedProductsPrices().get(0), webDriver, currency);
        DataHelperAndWait.waitForTime(2500);
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0), webDriver);
       Assert.assertEquals(productPrice, DataHelperAndWait.convertTheStringToFloat(productDetailsPage.getFinalProductPrice(), webDriver, currency));
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure the related products section appears correctly after adding the original product to the cart", priority = 7)
    public void verifyRelatedProductsSectionAppearAfterAddingTheOriginalProductToCart() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        relatedProductSection.displayTheInStockProduct();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsSection()));
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure the Related Products section is displayed for in stock Bundle ", priority = 13)
    public void verifyRelatedProductSectionIsDisplayedForInStockBundle() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        relatedProductSection.displayTheInStockBundle();
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsSection()));
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure that each of Related Products title,Product Names,images, prices appear correctly in the Bundle", priority = 14)
    public void verifyAllRelatedProductComponentsAreDisplayedForBundle() {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsTitle()), "Related Product title is missing");
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsImages().get(0)), "Product image is missing");
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsNames().get(0)), "Product name is missing");
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsPrices().get(0)), "Product price is missing");
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure add To Cart button appears correctly for all Related Products in Bundle", priority = 15)
    public void verifyAddToCartBtnAppearsForAllRelatedProductForBundle() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        for (int i = 0; i < relatedProductSection.getAddRelatedProductToCart().size(); i++) {
            webDriver.manage().deleteCookieNamed("guestCartId");
            relatedProductSection.displayTheInStockBundle();
            DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(i), webDriver);
            DataHelperAndWait.waitForTime(2000);
            Assert.assertTrue(relatedProductSection.getAddRelatedProductToCart().get(i).isDisplayed(), "Add to cart is missing");
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure add To Cart button works correctly for Bundle", priority = 17)
    public void verifyShopNowBtnWorksCorrectlyForBundle() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        relatedProductSection.displayTheInStockBundle();
        productPrice=DataHelperAndWait.convertTheStringToFloat(relatedProductSection.getRelatedProductsPrices().get(0), webDriver, currency);
        System.out.println(productPrice);
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
        DataHelperAndWait.waitForTime(1500);
        relatedProductSection.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductName(),webDriver);
//        WebElementsAssertion.assertionTextIsEqual(cartPage.getCartCounter(), webDriver, "1");
    }
//OOS Products: https://app.qa1.sporter.com/admin_1uidvr/catalog/product/edit/id/53428/key/ba40f6ed3583beafdcb4374b48c718cf31deb225ac6171a6ecaa4b0d6ba0dc32/
@Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Related Product For OOS)Make sure the Related Products section is displayed for out stock product ", priority = 18)
public void verifyRelatedProductSectionIsDisplayedForOutStockProduct() throws IOException {
    RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
    webDriver.manage().deleteCookieNamed("guestCartId");
    relatedProductSection.displayTheOutStockProduct();
    Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsSection()));
}

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Related Product For OOS)Make sure that each of Related Products title,Product Names,images, prices appear correctly", priority = 19)
    public void verifyAllRelatedProductComponentsAreDisplayedForOOS() {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsTitle()), "Related Product title is missing");
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsImages().get(0)), "Product image is missing");
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsNames().get(0)), "Product name is missing");
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(relatedProductSection.getRelatedProductsPrices().get(0)), "Product price is missing");
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Related Product For OOS)Make sure add To Cart button appears correctly for all Related Products", priority = 20)
    public void verifyAddToCartBtnAppearsForAllRelatedProductForOOS() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        for (int i = 0; i < relatedProductSection.getAddRelatedProductToCart().size(); i++) {
            webDriver.manage().deleteCookieNamed("guestCartId");
            relatedProductSection.displayTheOutStockProduct();
            DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(i), webDriver);
            DataHelperAndWait.waitForTime(1500);
            Assert.assertTrue(relatedProductSection.getAddRelatedProductToCart().get(i).isDisplayed(), "Add to cart is missing");
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Related Product For OOS)Make sure the related products section appears in the correct language", priority = 21)
    public void verifyRelatedProductAppearsWithCorrectLanguageForOOS(){
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        if(webDriver.getCurrentUrl().contains("/en")){
            Assert.assertTrue(DataHelperAndWait.isTextOnlyEnglish(relatedProductSection.getRelatedProductsTitle().getText()));
            Assert.assertTrue(DataHelperAndWait.isTextOnlyEnglish(relatedProductSection.getRelatedProductsNames().get(0).getText()));
        }
        else {
            Assert.assertTrue(DataHelperAndWait.isTextOnlyArabic(relatedProductSection.getRelatedProductsTitle().getText()));
            Assert.assertTrue(DataHelperAndWait.isTextOnlyArabic(relatedProductSection.getRelatedProductsNames().get(0).getText()));
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:(Related Product For OOS)Make sure add To Cart button works correctly", priority = 22)
    public void verifyShopNowBtnWorksCorrectlyForOOS() {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
        DataHelperAndWait.waitForTime(1500);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductName(),webDriver);
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
        Assert.assertEquals(productPrice, DataHelperAndWait.convertTheStringToFloat(productDetailsPage.getFinalProductPrice(), webDriver, currency));
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure clicking on the Cross selling product/ Or click on Add to cart button will redirect the user to the product details page ", priority = 40)
    public void verifyClickingOnRelatedProductSectionRedirectsToPDP() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        relatedProductSection.displayTheInStockProduct();
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure clicking on the Cross selling product/ Or click on Add to cart button will redirect the user to the product details page for Bundle ", priority = 41)
    public void verifyClickingOnRelatedProductSectionRedirectsToPDPForBundle() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        relatedProductSection.displayTheInStockBundle();
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Make sure clicking on the Similar product/ Or click on Add to cart button for OOS will redirect the user to the product details page ", priority = 42)
    public void verifyClickingOnRelatedProductSectionForOOSRedirectsToPDP() throws IOException {
        RelatedProductSection relatedProductSection = new RelatedProductSection(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        relatedProductSection.displayTheOutStockProduct();
        DataHelperAndWait.hoverOnElement(relatedProductSection.getRelatedProductsPrices().get(0), webDriver);
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.JsExecutorToClickOnElement(relatedProductSection.getAddRelatedProductToCart().get(0),webDriver);
    }

}