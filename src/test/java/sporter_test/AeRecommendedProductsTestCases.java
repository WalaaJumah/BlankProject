//package sporter_test;
//
//import core.BaseTest;
//import core.DataHelperAndWait;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import sporter_pages.AeProductDetailsPage;
//import sporter_pages.AeRecommendedProductsPage;
//
//
//public class AeRecommendedProductsTestCases extends BaseTest {
//    private AeProductDetailsPageTestCases aeProductDetailsPageTestCases;
//    private AeProductDetailsPage aeProductDetailsPage;
//    private AeRecommendedProductsPage aeRecommendedProductspage;
//
//    @Test(description = "Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 1)
//    public void verifyKeepShoppingBtnWorksCorrectly() {
//        aeProductDetailsPageTestCases = new AeProductDetailsPageTestCases();
//        aeProductDetailsPageTestCases.keepShoppingAfterAddingToTheCart();
//    }
//
//    @Test(description = "Make sure the view Cart button appearing the Recommended products works correctly ", priority = 2)
//    public void verifyViewCartWorksBtnCorrectly() {
//        aeProductDetailsPageTestCases = new AeProductDetailsPageTestCases();
//        aeProductDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
//    }
//
//    @Test(description = "Make sure to close the Recommended products pop up correctly", priority = 3)
//    public void verifyCloseRecommendedPopupCorrectly() {
//        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        aeProductDetailsPage.switchToAeCountry();
//        aeProductDetailsPage.clickOnProductInHomePage();
//        aeProductDetailsPage.addToCart();
//        aeRecommendedProductspage.clickOnRecommendedProductsCloseIcon();
//        DataHelperAndWait.implicitWait(10);
//        Assert.assertTrue(aeProductDetailsPage.getAddToCartBtn().isDisplayed());
//
//    }
//
//    @Test(description = "Make sure to close the Recommended products pop up when clicking outside the pop-up", priority = 4)
//    public void verifyCloseRecommendedPopupCorrectlyWhenClickingOutsideThePopup() {
//        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.switchToAeCountry();
//        aeProductDetailsPage.clickOnProductInHomePage();
//        aeProductDetailsPage.addToCart();
//        Actions act = new Actions(webDriver);
//        act.moveByOffset(913, 477).contextClick().build().perform();
//        Assert.assertTrue(aeProductDetailsPage.getAddToCartBtn().isDisplayed());
//    }
//
//    @Test(description = "Make sure all components appear correctly in  Recommended products like keep shopping and view cart and products list and titles", priority = 5)
//    public void verifyAllRecommendedPopupComponentsIsExist() {
//        aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.switchToAeCountry();
//        aeProductDetailsPage.clickOnProductInHomePage();
//        aeProductDetailsPage.addToCart();
//        //Make sure the check circle icon is displayed
//        Assert.assertTrue(aeRecommendedProductspage.getCircleIcon().isDisplayed());
//        //Make sure the Thumbs Up title is displayed
//        Assert.assertTrue(aeRecommendedProductspage.getThumbsUpTitle().isDisplayed());
//        //Make sure the added product message is displayed
//        Assert.assertTrue(aeRecommendedProductspage.getAddedProductToCartMsg().isDisplayed());
//        //Make sure the Recommended products title is displayed
//        Assert.assertTrue(aeRecommendedProductspage.getRecommendedProductsTitle().isDisplayed());
//        //Make sure the products images are displayed
//        Assert.assertTrue(aeRecommendedProductspage.getProductImages().isDisplayed());
//        //Make sure the products prices are displayed
//        Assert.assertTrue(aeRecommendedProductspage.getProductPrice().isDisplayed());
//        //Make sure the add to cart buttons are displayed
//        Assert.assertTrue(aeRecommendedProductspage.getAddToCartBtn().isDisplayed());
//        //Make sure the keep shopping button is displayed
//        Assert.assertTrue(aeProductDetailsPage.getKeepShippingBtn().isDisplayed());
//        //Make sure the view cart button is displayed
//        Assert.assertTrue(aeProductDetailsPage.getViewCartBtn().isDisplayed());
//    }
//
//    @Test(description = "Make sure ability to add Recommended product to the cart", priority = 6)
//    public void verifyAbilityToAddRecommendedProductToCart() {
//        aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.switchToAeCountry();
//        aeProductDetailsPage.clickOnProductInHomePage();
//        aeProductDetailsPage.addToCart();
//        aeRecommendedProductspage.clickOnAddToCart();
//    }
//
//    @Test(description = "Make sure the name of product added to the Cart displayed correctly in the Recommended product pop-up", priority = 7)
//    public void verifyTheNameOfProductAddedToCatDisplayedInTheRecommendedPopup() {
//        aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.switchToAeCountry();
//        aeProductDetailsPage.clickOnProductInHomePage();
//        aeProductDetailsPage.addToCart();
//        Assert.assertTrue(aeRecommendedProductspage.getAddedProductToCartMsg().getText().contains(aeProductDetailsPage.getProductName().getText()));
//    }
//
//    @Test(description = "Make sure the product price displayed in the Recommended product pop-up matches with the product price displayed in PDP", priority = 8)
//    public void verifyTheProductPriceInTheRecommendedPopupMatchesWithThePriceDisplaysInPdp() {
//        aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.switchToAeCountry();
//        aeProductDetailsPage.clickOnProductInHomePage();
//        aeProductDetailsPage.addToCart();
//        String productPriceInRecommendedPopup = aeRecommendedProductspage.getProductPriceForFirstProduct().getText();
//        aeRecommendedProductspage.clickOnAddToCartBtnForFirstProduct();
//        String productPriceInPdp = aeProductDetailsPage.getFinalProductPrice().getText();
//        Assert.assertEquals(productPriceInPdp, productPriceInRecommendedPopup, "The product Price displayed in the Recommended pop-up is not match with the price in PDP ");
//    }
//
//    @Test(description = "Make sure the clicking on the product card appears in the Recommended product pop-up will display the PDP correctly", priority = 9)
//    public void verifyClickingOnProductCardInTheRecommendedPopupWillDisplayThePdp() {
//        aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.switchToAeCountry();
//        aeProductDetailsPage.clickOnProductInHomePage();
//        aeProductDetailsPage.addToCart();
//        String productNameInRecommendedPopup = aeRecommendedProductspage.getFirstProductName().getText();
//        aeRecommendedProductspage.clickOnFirstProductCard();
//        Assert.assertEquals(productNameInRecommendedPopup, aeProductDetailsPage.getProductName().getText(), "The product name displayed in the Recommended pop-up is not match with the name in PDP ");
//    }
//
//}