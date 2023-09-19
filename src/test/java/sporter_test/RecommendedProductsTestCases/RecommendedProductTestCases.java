/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription RecommendedProductTestCases
 */

package sporter_test.RecommendedProductsTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import sporter_pages.RecommendedProductsPage.RecommendedProductPage;
import sporter_pages.productPage.ProductDetailsPage;

import java.io.IOException;

@Test(groups = "2.07 Recommended Products Page")
public class RecommendedProductTestCases extends BaseTest {
    String storeCountry;

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 1)
    public void verifyKeepShoppingBtnWorksCorrectly() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.keepShoppingAfterAddingToCart();
//        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Recommended product pop-up will hide after clicking on the Keep Shopping Button", priority = 2)
    public void verifyRecommendedProductsPopUpisHiddenAfterClickingOnTheKeepShoppingBtn() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.keepShoppingAfterAddingToCart();
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,20);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(), webDriver);
        recommendedProductpage.removeProductFromCart();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the view Cart button appearing the Recommended products works correctly ", priority = 3)
    public void verifyViewCartWorksBtnCorrectly() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL, webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Recommended product pop-up will hide after clicking on the View Cart Button", priority = 4)
    public void verifyRecommendedProductsPopUpisHiddenAfterClickingOnTheViewBtn() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();
        productDetailsPage.addToCart();
        DataHelperAndWait.clickOnElement(productDetailsPage.getViewCartBtn(), webDriver);
        productDetailsPage.waitTillLoaderComplete();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getRemoveItem(), webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getRemoveItem(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure to close the Recommended products pop up correctly", priority = 5)
    public void verifyCloseRecommendedPopupCorrectly() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        recommendedProductpage.displayTheRecommendedProductsPopUp();
        DataHelperAndWait.clickOnElement(recommendedProductpage.getRecommendedProductsCloseIcon(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure to close the Recommended products pop up when clicking outside the pop-up", priority = 6)
    public void verifyCloseRecommendedPopupCorrectlyWhenClickingOutsideThePopup() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        Actions act = new Actions(webDriver);
        act.moveByOffset(913, 477).contextClick().build().perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure all components appear correctly in  Recommended products like keep shopping and view cart and products list and titles", priority = 7)
    public void verifyAllRecommendedPopupComponentsIsExist() throws IOException {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        recommendedProductpage.displayTheRecommendedProductsPopUp();
        //Make sure the check circle icon is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getCircleIcon(), webDriver);
        //Make sure the Thumbs Up title is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getThumbsUpTitle(), webDriver);
        //Make sure the added product message is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getAddedProductToCartMsg(), webDriver);
        //Make sure the Recommended products title is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getRecommendedProductsTitle(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the name of product added to the Cart displayed correctly in the Recommended product pop-up", priority = 8)
    public void verifyTheNameOfProductAddedToCatDisplayedInTheRecommendedPopup() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        DataHelperAndWait.waitToBeVisible(recommendedProductpage.getAddedProductToCartMsg(), webDriver);
    }

    //    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}: Make sure the product price displayed in the Recommended product pop-up matches with the product price displayed in PDP", priority = 7)
//    public void verifyTheProductPriceInTheRecommendedPopupMatchesWithThePriceDisplaysInPdp() {
//        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        recommendedProductpage.displayTheRecommendedProductsPopUp();
//        String productPriceInRecommendedPopup;
//        try{
//            productPriceInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getProductPrice().get(0),webDriver);
//            DataHelperAndWait.clickOnElement(recommendedProductpage.getProductImages().get(0),webDriver);}
//        catch (IndexOutOfBoundsException e){
//            productPriceInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getProductPrice().get(1),webDriver);
//            DataHelperAndWait.clickOnElement(recommendedProductpage.getProductImages().get(1),webDriver);
//        }
//        DataHelperAndWait.clickOnElement(recommendedProductpage.getRecommendedProductsCloseIcon(),webDriver);
//        try{
//            String productPriceInPdp =DataHelperAndWait.getWebElementText(productDetailsPage.getFinalProductPrice(),webDriver);
//            Assert.assertEquals(productPriceInPdp, productPriceInRecommendedPopup, "The product Price displayed in the Recommended pop-up is not match with the price in PDP"+ productPriceInPdp +" VS."+ productPriceInRecommendedPopup);
//        }
//        catch (Exception e){
//            System.out.println("An error occurs during open the page and this error already captured in other test case");
//        }
//    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure ability to add Recommended product to the cart", priority = 9)
    public void verifyAbilityToAddRecommendedProductToCart() throws IOException {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        recommendedProductpage.displayTheRecommendedProductsPopUp();
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        recommendedProductpage.clickOnListItemsAndAssertion(recommendedProductpage.getAddToCartBtn(),webDriver,productDetailsPage.getAddToCartBtn());
        try{
        DataHelperAndWait.clickOnElement(recommendedProductpage.getAddToCartBtn().get(0), webDriver);}
        catch (IndexOutOfBoundsException e){
            System.out.println("There's no any recommended products");
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the clicking on the product card appears in the Recommended product pop-up will display the Product Details Page correctly", priority = 10)
    public void verifyClickingOnProductCardInTheRecommendedPopupWillDisplayThePdp() throws IOException {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        recommendedProductpage.clickOnProductCard();
        recommendedProductpage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

}