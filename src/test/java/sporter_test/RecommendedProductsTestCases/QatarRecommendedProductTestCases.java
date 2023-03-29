/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarRecommendedProductTestCases
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.QatarHomePage;

//@Test(groups = "Qatar Product Details Page")
public class QatarRecommendedProductTestCases extends RecommendedProductTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToQatarStore() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchCountry(qatarHomePage.getQatarCountry());
        if (webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)) {
            System.out.println("You are in Qatar Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + qatarHomePage.qatarDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(Qatar Store/ English Version): Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 2)
//    public void verifyKeepShoppingBtnWorksCorrectly() {
//        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
//        qatarProductDetailsPage.keepShoppingAfterAddingToCart();
//        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(Qatar Store/ English Version): Make sure the view Cart button appearing the Recommended products works correctly ", priority =3)
//    public void verifyViewCartWorksBtnCorrectly() {
//        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
//        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getAddToCartBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getViewCartBtn(),webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString(qatarProductDetailsPage.cartURL,webDriver);
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure to close the Recommended products pop up correctly", priority = 4)
//    public void verifyCloseRecommendedPopupCorrectly() {
//        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
//        QatarRecommendedProductPage qatarRecommendedProductPage = new QatarRecommendedProductPage(webDriver);
//        qatarRecommendedProductPage.displayTheRecommendedProductsPopUp();
//        DataHelperAndWait.clickOnElement(qatarRecommendedProductPage.getRecommendedProductsCloseIcon(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure to close the Recommended products pop up when clicking outside the pop-up", priority = 5)
//    public void verifyCloseRecommendedPopupCorrectlyWhenClickingOutsideThePopup() {
//        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
//        QatarRecommendedProductPage qatarRecommendedProductPage = new QatarRecommendedProductPage(webDriver);
//        qatarRecommendedProductPage.displayTheRecommendedProductsPopUp();
//        Actions act = new Actions(webDriver);
//        act.moveByOffset(913, 477).contextClick().build().perform();
//        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure all components appear correctly in  Recommended products like keep shopping and view cart and products list and titles", priority = 6)
//    public void verifyAllRecommendedPopupComponentsIsExist() {
//        QatarRecommendedProductPage qatarRecommendedProductPage = new QatarRecommendedProductPage(webDriver);
//        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
//        qatarRecommendedProductPage.displayTheRecommendedProductsPopUp();
//        //Make sure the check circle icon is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(qatarRecommendedProductPage.getCircleIcon(),webDriver);
//        //Make sure the Thumbs Up title is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(qatarRecommendedProductPage.getThumbsUpTitle(),webDriver);
//        //Make sure the added product message is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(qatarRecommendedProductPage.getAddedProductToCartMsg(),webDriver);
//        //Make sure the Recommended products title is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(qatarRecommendedProductPage.getRecommendedProductsTitle(),webDriver);
//        //Make sure the products images are displayed
////        WebElementsAssertion.assertAllListItemsAreDisplayed(qatarRecommendedProductPage.getProductImages(),webDriver);
////        //Make sure the products prices are displayed
////        WebElementsAssertion.assertAllListItemsAreDisplayed(qatarRecommendedProductPage.getProductPrice(),webDriver);
////        //Make sure the add to cart buttons are displayed
////        WebElementsAssertion.assertAllListItemsAreDisplayed(qatarRecommendedProductPage.getAddToCartBtn(),webDriver);
//        //Make sure the keep shopping button is displayed
////        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getKeepShippingBtn(),webDriver);
////        //Make sure the view cart button is displayed
////        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getViewCartBtn(),webDriver);
//    }
//    //TODO: Check price test cases on all stores
////    @Test(groups = {"1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure the product price displayed in the Recommended product pop-up matches with the product price displayed in PDP", priority = 7)
////    public void verifyTheProductPriceInTheRecommendedPopupMatchesWithThePriceDisplaysInPdp() {
////        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
////        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
////        recommendedProductpage.displayTheRecommendedProductsPopUp();
////        String productPriceInRecommendedPopup;
////        try{
////            productPriceInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getProductPrice().get(0),webDriver);
////            DataHelperAndWait.clickOnElement(recommendedProductpage.getProductImages().get(0),webDriver);}
////        catch (IndexOutOfBoundsException e){
////            productPriceInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getProductPrice().get(1),webDriver);
////            DataHelperAndWait.clickOnElement(recommendedProductpage.getProductImages().get(1),webDriver);
////        }
////        DataHelperAndWait.clickOnElement(recommendedProductpage.getRecommendedProductsCloseIcon(),webDriver);
////        try{
////            String productPriceInPdp =DataHelperAndWait.getWebElementText(productDetailsPage.getFinalProductPrice(),webDriver);
////            Assert.assertEquals(productPriceInPdp, productPriceInRecommendedPopup, "The product Price displayed in the Recommended pop-up is not match with the price in PDP"+ productPriceInPdp +" VS."+ productPriceInRecommendedPopup);
////        }
////        catch (Exception e){
////            System.out.println("An error occurs during open the page and this error already captured in other test case");
////        }
////    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(Qatar Store/ English Version): Make sure ability to add Recommended product to the cart", priority = 8)
//    public void verifyAbilityToAddRecommendedProductToCart() {
//        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        recommendedProductpage.clickOnListItemsAndAssertion(recommendedProductpage.getAddToCartBtn(),webDriver,productDetailsPage.getAddToCartBtn());
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure the name of product added to the Cart displayed correctly in the Recommended product pop-up", priority = 9)
//    public void verifyTheNameOfProductAddedToCatDisplayedInTheRecommendedPopup() {
//        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        String productNameInPDP=(DataHelperAndWait.getWebElementText(productDetailsPage.getProductName(),webDriver)).substring(6);
//        System.out.println(productNameInPDP);
//        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
//        DataHelperAndWait.waitToBeVisible(recommendedProductpage.getAddedProductToCartMsg(),webDriver);
//        Assert.assertTrue(DataHelperAndWait.getWebElementText(recommendedProductpage.getAddedProductToCartMsg(),webDriver).startsWith(productNameInPDP));
//        System.out.println(recommendedProductpage.getAddedProductToCartMsg().getText());
//    }
//    @Test(groups = {"1.2 High Severity"},description = "(Qatar Store/ English Version): Make sure the clicking on the product card appears in the Recommended product pop-up will display the Product Details Page correctly", priority = 10)
//    public void verifyClickingOnProductCardInTheRecommendedPopupWillDisplayThePdp() {
//        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
//       recommendedProductpage.clickOnProductCard();
//    }
}
