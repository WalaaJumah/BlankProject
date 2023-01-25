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
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.RecommendedProductsPage.RecommendedProductPage;
import sporter_pages.productPage.ProductDetailsPage;

public class RecommendedProductTestCases extends BaseTest {
    @Test(groups = {"Product Page","All Smoke Testing Result","1.1 Critical Severity"},description = "Recommended Products Pop-up- Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 2)
    public void verifyKeepShoppingBtnWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.keepShoppingAfterAddingToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = {"Product Page","All Smoke Testing Result","1.1 Critical Severity"},description = "Recommended Products Pop-up- Make sure the view Cart button appearing the Recommended products works correctly ", priority =3)
    public void verifyViewCartWorksBtnCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getViewCartBtn(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL,webDriver);
    }
    @Test(groups = {"Product Page","1.3 Medium Severity"},description = "Recommended Products Pop-up- Make sure to close the Recommended products pop up correctly", priority = 4)
    public void verifyCloseRecommendedPopupCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        recommendedProductpage.displayTheRecommendedProductsPopUp();
        DataHelperAndWait.clickOnElement(recommendedProductpage.getRecommendedProductsCloseIcon(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = {"Product Page","1.3 Medium Severity"},description = "Recommended Products Pop-up- Make sure to close the Recommended products pop up when clicking outside the pop-up", priority = 5)
    public void verifyCloseRecommendedPopupCorrectlyWhenClickingOutsideThePopup() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        recommendedProductpage.displayTheRecommendedProductsPopUp();
        Actions act = new Actions(webDriver);
        act.moveByOffset(913, 477).contextClick().build().perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = {"Product Page","1.3 Medium Severity"},description = "Recommended Products Pop-up- Make sure all components appear correctly in  Recommended products like keep shopping and view cart and products list and titles", priority = 6)
    public void verifyAllRecommendedPopupComponentsIsExist() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        recommendedProductpage.displayTheRecommendedProductsPopUp();
        //Make sure the check circle icon is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getCircleIcon(),webDriver);
        //Make sure the Thumbs Up title is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getThumbsUpTitle(),webDriver);
        //Make sure the added product message is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getAddedProductToCartMsg(),webDriver);
        //Make sure the Recommended products title is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getRecommendedProductsTitle(),webDriver);
        //Make sure the products images are displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getProductImages(),webDriver);
        //Make sure the products prices are displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getProductPrice(),webDriver);
        //Make sure the add to cart buttons are displayed
        WebElementsAssertion.validateTheElementIsDisplayed(recommendedProductpage.getAddToCartBtn(),webDriver);
        //Make sure the keep shopping button is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getKeepShippingBtn(),webDriver);
        //Make sure the view cart button is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getViewCartBtn(),webDriver);
    }
    @Test(groups = {"Product Page","All Smoke Testing Result","1.2 High Severity"},description = "Recommended Products Pop-up- Make sure ability to add Recommended product to the cart", priority = 7)
    public void verifyAbilityToAddRecommendedProductToCart() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        recommendedProductpage.displayTheRecommendedProductsPopUp();
        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = {"Product Page","1.3 Medium Severity"},description = "Recommended Products Pop-up- Make sure the name of product added to the Cart displayed correctly in the Recommended product pop-up", priority = 8)
    public void verifyTheNameOfProductAddedToCatDisplayedInTheRecommendedPopup() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        String productNameInPDP=DataHelperAndWait.getWebElementText(productDetailsPage.getProductName(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
        WebElementsAssertion.assertionWebElementContainsText(recommendedProductpage.getAddedProductToCartMsg(),webDriver,productNameInPDP);
    }
    @Test(groups = {"Product Page","1.3 Medium Severity"},description = "Recommended Products Pop-up- Make sure the product price displayed in the Recommended product pop-up matches with the product price displayed in PDP", priority = 9)
    public void verifyTheProductPriceInTheRecommendedPopupMatchesWithThePriceDisplaysInPdp() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.addToCart();
        String productPriceInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getProductPriceForFirstProduct(),webDriver);
        DataHelperAndWait.clickOnElement(recommendedProductpage.getAddToCartBtnForFirstProduct(),webDriver);
        String productPriceInPdp =DataHelperAndWait.getWebElementText(productDetailsPage.getFinalProductPrice(),webDriver);
        Assert.assertEquals(productPriceInPdp, productPriceInRecommendedPopup, "The product Price displayed in the Recommended pop-up is not match with the price in PDP"+ productPriceInPdp +" VS."+ productPriceInRecommendedPopup);
    }
    @Test(groups = {"Product Page","1.2 High Severity"},description = "Recommended Products Pop-up- Make sure the clicking on the product card appears in the Recommended product pop-up will display the Product Details Page correctly", priority = 10)
    public void verifyClickingOnProductCardInTheRecommendedPopupWillDisplayThePdp() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        recommendedProductpage.displayTheRecommendedProductsPopUp();
        String productNameInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getFirstProductName(),webDriver);
        DataHelperAndWait.clickOnElement(recommendedProductpage.getFirstProductCard(),webDriver);
        Assert.assertEquals(productNameInRecommendedPopup, DataHelperAndWait.getWebElementText(productDetailsPage.getProductName(),webDriver), "The product name displayed in the Recommended pop-up is not match with the name in PDP ");
    }
}