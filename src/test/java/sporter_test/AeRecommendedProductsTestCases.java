//package sporter_test;
//
//import core.BasePage;
//import core.BaseTest;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import sporter_pages.AeRecommendedProductsPage;
//import sporter_pages.productPage.ProductDetailsPage;
//
//public class AeRecommendedProductsTestCases extends BaseTest {
//    @Test(groups = "All Smoke Testing Result",description = "Recommended Products Pop-up- Switching to the UAE Store", priority = 1)
//    public void switchToAeStore() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        if(webDriver.getCurrentUrl().contains(productDetailsPage.aeDomain)){
//            System.out.println("You are in UAE Store");
//        }
//        else {
//            webDriver.navigate().to(BasePage.BaseURL+aeDomain);
//            CloseInitialDialog();          }
//    }
//
//    @Test(groups = {"Product Page","All Smoke Testing Result","1.1 Critical Severity"},description = "Recommended Products Pop-up- Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 2)
//    public void verifyKeepShoppingBtnWorksCorrectly() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        String currentURL = webDriver.getCurrentUrl() + "#";
//        productDetailsPage.addToCart();
//        productDetailsPage.keepShopping();
//        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL);
//    }
//
//    @Test(groups = {"Product Page","All Smoke Testing Result","1.1 Critical Severity"},description = "Recommended Products Pop-up- Make sure the view Cart button appearing the Recommended products works correctly ", priority =3)
//    public void verifyViewCartWorksBtnCorrectly() {
//        AeRecommendedProductsPage  aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL );
//    }
//
//    @Test(groups = {"Product Page","1.3 Medium Severity"},description = "Recommended Products Pop-up- Make sure to close the Recommended products pop up correctly", priority = 4)
//    public void verifyCloseRecommendedPopupCorrectly() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        AeRecommendedProductsPage  aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        aeRecommendedProductspage.clickOnRecommendedProductsCloseIcon();
//        Assert.assertTrue(productDetailsPage.getAddToCartBtn().isDisplayed());
//
//    }
//
//    @Test(groups = {"Product Page","1.3 Medium Severity"},description = "Recommended Products Pop-up- Make sure to close the Recommended products pop up when clicking outside the pop-up", priority = 5)
//    public void verifyCloseRecommendedPopupCorrectlyWhenClickingOutsideThePopup() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        AeRecommendedProductsPage  aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        Actions act = new Actions(webDriver);
//        act.moveByOffset(913, 477).contextClick().build().perform();
//        Assert.assertTrue(productDetailsPage.getAddToCartBtn().isDisplayed());
//    }
//
//    @Test(groups = {"Product Page","1.3 Medium Severity"},description = "Recommended Products Pop-up- Make sure all components appear correctly in  Recommended products like keep shopping and view cart and products list and titles", priority = 6)
//    public void verifyAllRecommendedPopupComponentsIsExist() {
//        AeRecommendedProductsPage aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
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
//        Assert.assertTrue(productDetailsPage.getKeepShippingBtn().isDisplayed());
//        //Make sure the view cart button is displayed
//        Assert.assertTrue(productDetailsPage.getViewCartBtn().isDisplayed());
//    }
//
//    @Test(groups = {"Product Page","All Smoke Testing Result","1.2 High Severity"},description = "Recommended Products Pop-up- Make sure ability to add Recommended product to the cart", priority = 7)
//    public void verifyAbilityToAddRecommendedProductToCart() {
//        AeRecommendedProductsPage aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        aeRecommendedProductspage.clickOnAddToCart();
//    }
//
//    @Test(groups = {"Product Page","1.3 Medium Severity"},description = "Recommended Products Pop-up- Make sure the name of product added to the Cart displayed correctly in the Recommended product pop-up", priority = 8)
//    public void verifyTheNameOfProductAddedToCatDisplayedInTheRecommendedPopup() {
//        AeRecommendedProductsPage aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        Assert.assertTrue(aeRecommendedProductspage.getAddedProductToCartMsg().getText().contains(productDetailsPage.getProductName().getText()));
//    }
//
//    @Test(groups = {"Product Page","1.3 Medium Severity"},description = "Recommended Products Pop-up- Make sure the product price displayed in the Recommended product pop-up matches with the product price displayed in PDP", priority = 9)
//    public void verifyTheProductPriceInTheRecommendedPopupMatchesWithThePriceDisplaysInPdp() {
//        AeRecommendedProductsPage  aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        String productPriceInRecommendedPopup = aeRecommendedProductspage.getProductPriceForFirstProduct().getText();
//        aeRecommendedProductspage.clickOnAddToCartBtnForFirstProduct();
//        String productPriceInPdp = productDetailsPage.getFinalProductPrice().getText();
//        Assert.assertEquals(productPriceInPdp, productPriceInRecommendedPopup, "The product Price displayed in the Recommended pop-up is not match with the price in PDP"+ productPriceInPdp +" VS."+ productPriceInRecommendedPopup);
//    }
//
//    @Test(groups = {"Product Page","1.2 High Severity"},description = "Recommended Products Pop-up- Make sure the clicking on the product card appears in the Recommended product pop-up will display the Product Details Page correctly", priority = 10)
//    public void verifyClickingOnProductCardInTheRecommendedPopupWillDisplayThePdp() {
//        AeRecommendedProductsPage aeRecommendedProductspage = new AeRecommendedProductsPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        String productNameInRecommendedPopup = aeRecommendedProductspage.getFirstProductName().getText();
//        aeRecommendedProductspage.clickOnFirstProductCard();
//        Assert.assertEquals(productNameInRecommendedPopup, productDetailsPage.getProductName().getText(), "The product name displayed in the Recommended pop-up is not match with the name in PDP ");
//    }
//}