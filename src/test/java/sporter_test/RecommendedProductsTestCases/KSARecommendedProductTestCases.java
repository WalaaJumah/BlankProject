/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSARecommendedProductTestCases
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.RecommendedProductsPage.KSARecommendedProductPage;
import sporter_pages.RecommendedProductsPage.RecommendedProductPage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.productPage.KSAProductDetailsPage;
import sporter_pages.productPage.ProductDetailsPage;

//@Test(groups = "KSA Product Details Page")
public class KSARecommendedProductTestCases extends RecommendedProductTestCases {
    @BeforeClass(alwaysRun=true)
    public void switchToKsaStore(){
        KsaHomePage ksaHomePage=new KsaHomePage(webDriver);
        HeaderSection headerSection =new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if(webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)){
            System.out.println("You are in KSA Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+ksaHomePage.saudiDomain);
            CloseInitialDialog();          }
        DataHelperAndWait.clickOnElement(headerSection.getLanguageSelector(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage,webDriver);
        System.out.println(webDriver.getCurrentUrl());

    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(KSA Store/ Arabic Version): Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 2)
//    public void verifyKeepShoppingBtnWorksCorrectly() {
//        KSAProductDetailsPage ksaProductDetailsPage = new KSAProductDetailsPage(webDriver);
//        ksaProductDetailsPage.keepShoppingAfterAddingToCart();
//        WebElementsAssertion.validateTheElementIsDisplayed(ksaProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(KSA Store/ Arabic Version): Make sure the view Cart button appearing the Recommended products works correctly ", priority =3)
//    public void verifyViewCartWorksBtnCorrectly() {
//        KSAProductDetailsPage ksaProductDetailsPage = new KSAProductDetailsPage(webDriver);
//        DataHelperAndWait.clickOnElement(ksaProductDetailsPage.getAddToCartBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(ksaProductDetailsPage.getViewCartBtn(),webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString(ksaProductDetailsPage.cartURL,webDriver);
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(KSA Store/ Arabic Version): Make sure to close the Recommended products pop up correctly", priority = 4)
//    public void verifyCloseRecommendedPopupCorrectly() {
//        KSAProductDetailsPage ksaProductDetailsPage = new KSAProductDetailsPage(webDriver);
//        KSARecommendedProductPage ksaRecommendedProductPage = new KSARecommendedProductPage(webDriver);
//        ksaRecommendedProductPage.displayTheRecommendedProductsPopUp();
//        DataHelperAndWait.clickOnElement(ksaRecommendedProductPage.getRecommendedProductsCloseIcon(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(ksaProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(KSA Store/ Arabic Version): Make sure to close the Recommended products pop up when clicking outside the pop-up", priority = 5)
//    public void verifyCloseRecommendedPopupCorrectlyWhenClickingOutsideThePopup() {
//        KSAProductDetailsPage ksaProductDetailsPage = new KSAProductDetailsPage(webDriver);
//        KSARecommendedProductPage ksaRecommendedProductPage = new KSARecommendedProductPage(webDriver);
//        ksaRecommendedProductPage.displayTheRecommendedProductsPopUp();
//        Actions act = new Actions(webDriver);
//        act.moveByOffset(913, 477).contextClick().build().perform();
//        WebElementsAssertion.validateTheElementIsDisplayed(ksaProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(KSA Store/ Arabic Version): Make sure all components appear correctly in  Recommended products like keep shopping and view cart and products list and titles", priority = 6)
//    public void verifyAllRecommendedPopupComponentsIsExist() {
//        KSARecommendedProductPage ksaRecommendedProductPage = new KSARecommendedProductPage(webDriver);
//        KSAProductDetailsPage ksaProductDetailsPage = new KSAProductDetailsPage(webDriver);
//        ksaRecommendedProductPage.displayTheRecommendedProductsPopUp();
//        //Make sure the check circle icon is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(ksaRecommendedProductPage.getCircleIcon(),webDriver);
//        //Make sure the Thumbs Up title is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(ksaRecommendedProductPage.getThumbsUpTitle(),webDriver);
//        //Make sure the added product message is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(ksaRecommendedProductPage.getAddedProductToCartMsg(),webDriver);
//        //Make sure the Recommended products title is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(ksaRecommendedProductPage.getRecommendedProductsTitle(),webDriver);
//        //Make sure the products images are displayed
////        WebElementsAssertion.assertAllListItemsAreDisplayed(ksaRecommendedProductPage.getProductImages(),webDriver);
////        //Make sure the products prices are displayed
////        WebElementsAssertion.assertAllListItemsAreDisplayed(ksaRecommendedProductPage.getProductPrice(),webDriver);
////        //Make sure the add to cart buttons are displayed
////        WebElementsAssertion.assertAllListItemsAreDisplayed(ksaRecommendedProductPage.getAddToCartBtn(),webDriver);
//        //Make sure the keep shopping button is displayed
////        WebElementsAssertion.validateTheElementIsDisplayed(ksaProductDetailsPage.getKeepShippingBtn(),webDriver);
////        //Make sure the view cart button is displayed
////        WebElementsAssertion.validateTheElementIsDisplayed(ksaProductDetailsPage.getViewCartBtn(),webDriver);
//    }
////    @Test(groups = {"1.3 Medium Severity"},description = "(KSA Store/ Arabic Version): Make sure the product price displayed in the Recommended product pop-up matches with the product price displayed in PDP", priority = 7)
////    public void verifyTheProductPriceInTheRecommendedPopupMatchesWithThePriceDisplaysInPdp() {
////        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
////        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
////        recommendedProductpage.displayTheRecommendedProductsPopUp();
////        String productPriceInRecommendedPopup;
////        try{
////         productPriceInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getProductPrice().get(0),webDriver);
////        DataHelperAndWait.clickOnElement(recommendedProductpage.getProductImages().get(0),webDriver);}
////        catch (IndexOutOfBoundsException e){
////             productPriceInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getProductPrice().get(1),webDriver);
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
////    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(KSA Store/ Arabic Version): Make sure ability to add Recommended product to the cart", priority = 8)
////    public void verifyAbilityToAddRecommendedProductToCart() {
////        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
////        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
////        recommendedProductpage.clickOnListItemsAndAssertion(recommendedProductpage.getAddToCartBtn(),webDriver,productDetailsPage.getAddToCartBtn());
////    }
////    @Test(groups = {"1.3 Medium Severity"},description = "(KSA Store/ Arabic Version): Make sure the name of product added to the Cart displayed correctly in the Recommended product pop-up", priority = 9)
////    public void verifyTheNameOfProductAddedToCatDisplayedInTheRecommendedPopup() {
////        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
////        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
////        productDetailsPage.displayTheProduct();
////        String productNameInPDP=(DataHelperAndWait.getWebElementText(productDetailsPage.getProductName(),webDriver)).substring(6);
////        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
////        Assert.assertTrue(DataHelperAndWait.getWebElementText(recommendedProductpage.getAddedProductToCartMsg(),webDriver).startsWith(productNameInPDP));
////    }
//    @Test(groups = {"1.2 High Severity"},description = "(KSA Store/ Arabic Version): Make sure the clicking on the product card appears in the Recommended product pop-up will display the Product Details Page correctly", priority = 10)
//    public void verifyClickingOnProductCardInTheRecommendedPopupWillDisplayThePdp() {
//        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
//        recommendedProductpage.clickOnProductCard();
//    }
}