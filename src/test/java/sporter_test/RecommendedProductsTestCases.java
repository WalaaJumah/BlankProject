package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.ProductDetailsPage;
import sporter_pages.RecommendedProductsPage;


public class RecommendedProductsTestCases extends BaseTest {
    private ProductDetailsPageTestCases productDetailsPageTestCases;
    private ProductDetailsPage productDetailsPage;
    private RecommendedProductsPage recommendedProductspage;

    @Test(description = "Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 1)
    public void verifyKeepShoppingBtnWorksCorrectly() {
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        productDetailsPageTestCases.keepShoppingAfterAddingToTheCart();
    }

    @Test(description = "Make sure the view Cart button appearing the Recommended products works correctly ", priority = 2)
    public void verifyViewCartWorksBtnCorrectly() {
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
    }

    @Test(description = "Make sure to close the Recommended products pop up correctly", priority = 3)
    public void verifyCloseRecommendedPopupCorrectly() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        recommendedProductspage = new RecommendedProductsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        recommendedProductspage.clickOnRecommendedProductsCloseIcon();
        DataHelperAndWait.implicitWait(10);
        Assert.assertTrue(productDetailsPage.getAddToCartBtn().isDisplayed());

    }

    @Test(description = "Make sure to close the Recommended products pop up when clicking outside the pop-up", priority = 4)
    public void verifyCloseRecommendedPopupCorrectlyWhenClickingOutsideThePopup() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        Actions act = new Actions(webDriver);
        act.moveByOffset(913, 477).contextClick().build().perform();
        Assert.assertTrue(productDetailsPage.getAddToCartBtn().isDisplayed());
    }

    @Test(description = "Make sure all components appear correctly in  Recommended products like keep shopping and view cart and products list and titles", priority = 5)
    public void verifyAllRecommendedPopupComponentsIsExist() {
        recommendedProductspage = new RecommendedProductsPage(webDriver);
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        //Make sure the check circle icon is displayed
        Assert.assertTrue(recommendedProductspage.getCircleIcon().isDisplayed());
        //Make sure the Thumbs Up title is displayed
        Assert.assertTrue(recommendedProductspage.getThumbsUpTitle().isDisplayed());
        //Make sure the added product message is displayed
        Assert.assertTrue(recommendedProductspage.getAddedProductToCartMsg().isDisplayed());
        //Make sure the Recommended products title is displayed
        Assert.assertTrue(recommendedProductspage.getRecommendedProductsTitle().isDisplayed());
        //Make sure the products images are displayed
        Assert.assertTrue(recommendedProductspage.getProductImages().isDisplayed());
        //Make sure the products prices are displayed
        Assert.assertTrue(recommendedProductspage.getProductPrice().isDisplayed());
        //Make sure the add to cart buttons are displayed
        Assert.assertTrue(recommendedProductspage.getAddToCartBtns().isDisplayed());
        //Make sure the keep shopping button is displayed
        Assert.assertTrue(productDetailsPage.getKeepShippingBtn().isDisplayed());
        //Make sure the view cart button is displayed
        Assert.assertTrue(productDetailsPage.getViewCartBtn().isDisplayed());
    }

    @Test(description = "Make sure ability to add Recommended product to the cart", priority = 6)
    public void verifyAbilityToAddRecommendedProductToCart() {
        recommendedProductspage = new RecommendedProductsPage(webDriver);
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        recommendedProductspage.clickOnAddToCart();
    }

    @Test(description = "Make sure the name of product added to the Cart displayed correctly in the Recommended product pop-up", priority = 7)
    public void verifyTheNameOfProductAddedToCatDisplayedInTheRecommendedPopup() {
        recommendedProductspage = new RecommendedProductsPage(webDriver);
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        Assert.assertTrue(recommendedProductspage.getAddedProductToCartMsg().getText().contains(productDetailsPage.getProductName().getText()));
    }

    @Test(description = "Make sure the product price displayed in the Recommended product pop-up matches with the product price displayed in PDP", priority = 8)
    public void verifyTheProductPriceInTheRecommendedPopupMatchesWithThePriceDisplaysInPdp() {
        recommendedProductspage = new RecommendedProductsPage(webDriver);
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        String productPriceInRecommendedPopup = recommendedProductspage.getProductPriceForFirstProduct().getText();
        recommendedProductspage.clickOnAddToCartBtnForFirstProduct();
        String productPriceInPdp = productDetailsPage.getFinalProductPrice().getText();
        Assert.assertEquals(productPriceInPdp, productPriceInRecommendedPopup, "The product Price displayed in the Recommended pop-up is not match with the price in PDP ");
    }

    @Test(description = "Make sure the clicking on the product card appears in the Recommended product pop-up will display the PDP correctly", priority = 9)
    public void verifyClickingOnProductCardInTheRecommendedPopupWillDisplayThePdp() {
        recommendedProductspage = new RecommendedProductsPage(webDriver);
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        String productNameInRecommendedPopup = recommendedProductspage.getFirstProductName().getText();
        recommendedProductspage.clickOnFirstProductCard();
        Assert.assertEquals(productNameInRecommendedPopup, productDetailsPage.getProductName().getText(), "The product name displayed in the Recommended pop-up is not match with the name in PDP ");
    }

}