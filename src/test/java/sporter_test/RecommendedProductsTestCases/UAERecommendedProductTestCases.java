/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAERecommendedProductTestCases
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.RecommendedProductsPage.RecommendedProductPage;
import sporter_pages.RecommendedProductsPage.UAERecommendedProductPage;
import sporter_pages.homepage_classes.UAEHomePage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_pages.productPage.UAEProductDetailsPage;

//@Test(groups = "UAE Product Details Page")
public class UAERecommendedProductTestCases extends RecommendedProductTestCases {
    @BeforeClass(alwaysRun=true)
    public void switchToUAEStore(){
        UAEHomePage uaeHomePage=new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if(webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+uaeHomePage.aeDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(UAE Store/ English Version): Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 2)
    public void verifyKeepShoppingBtnWorksCorrectly() {
        UAEProductDetailsPage uaeProductDetailsPage = new UAEProductDetailsPage(webDriver);
        uaeProductDetailsPage.keepShoppingAfterAddingToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(uaeProductDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(UAE Store/ English Version): Make sure the view Cart button appearing the Recommended products works correctly ", priority =3)
    public void verifyViewCartWorksBtnCorrectly() {
        UAEProductDetailsPage uaeProductDetailsPage = new UAEProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(uaeProductDetailsPage.getAddToCartBtn(),webDriver);
        DataHelperAndWait.clickOnElement(uaeProductDetailsPage.getViewCartBtn(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(uaeProductDetailsPage.cartURL,webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure to close the Recommended products pop up correctly", priority = 4)
    public void verifyCloseRecommendedPopupCorrectly() {
        UAEProductDetailsPage uaeProductDetailsPage = new UAEProductDetailsPage(webDriver);
        UAERecommendedProductPage uaeRecommendedProductPage = new UAERecommendedProductPage(webDriver);
        uaeRecommendedProductPage.displayTheRecommendedProductsPopUp();
        DataHelperAndWait.clickOnElement(uaeRecommendedProductPage.getRecommendedProductsCloseIcon(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(uaeProductDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure to close the Recommended products pop up when clicking outside the pop-up", priority = 5)
    public void verifyCloseRecommendedPopupCorrectlyWhenClickingOutsideThePopup() {
        UAEProductDetailsPage uaeProductDetailsPage = new UAEProductDetailsPage(webDriver);
        UAERecommendedProductPage uaeRecommendedProductPage = new UAERecommendedProductPage(webDriver);
        uaeRecommendedProductPage.displayTheRecommendedProductsPopUp();
        Actions act = new Actions(webDriver);
        act.moveByOffset(913, 477).contextClick().build().perform();
        WebElementsAssertion.validateTheElementIsDisplayed(uaeProductDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure all components appear correctly in  Recommended products like keep shopping and view cart and products list and titles", priority = 6)
    public void verifyAllRecommendedPopupComponentsIsExist() {
        UAERecommendedProductPage uaeRecommendedProductPage = new UAERecommendedProductPage(webDriver);
        UAEProductDetailsPage uaeProductDetailsPage = new UAEProductDetailsPage(webDriver);
        uaeRecommendedProductPage.displayTheRecommendedProductsPopUp();
        //Make sure the check circle icon is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(uaeRecommendedProductPage.getCircleIcon(),webDriver);
        //Make sure the Thumbs Up title is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(uaeRecommendedProductPage.getThumbsUpTitle(),webDriver);
        //Make sure the added product message is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(uaeRecommendedProductPage.getAddedProductToCartMsg(),webDriver);
        //Make sure the Recommended products title is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(uaeRecommendedProductPage.getRecommendedProductsTitle(),webDriver);
        //Make sure the products images are displayed
//        WebElementsAssertion.assertAllListItemsAreDisplayed(uaeRecommendedProductPage.getProductImages(),webDriver);
//        //Make sure the products prices are displayed
//        WebElementsAssertion.assertAllListItemsAreDisplayed(uaeRecommendedProductPage.getProductPrice(),webDriver);
//        //Make sure the add to cart buttons are displayed
//        WebElementsAssertion.assertAllListItemsAreDisplayed(uaeRecommendedProductPage.getAddToCartBtn(),webDriver);
        //Make sure the keep shopping button is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(uaeProductDetailsPage.getKeepShippingBtn(),webDriver);
//        //Make sure the view cart button is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(uaeProductDetailsPage.getViewCartBtn(),webDriver);
    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure the product price displayed in the Recommended product pop-up matches with the product price displayed in PDP", priority = 7)
//    public void verifyTheProductPriceInTheRecommendedPopupMatchesWithThePriceDisplaysInPdp() {
//        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        recommendedProductpage.displayTheRecommendedProductsPopUp();
//        String productPriceInRecommendedPopup;
//        try{
//         productPriceInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getProductPrice().get(0),webDriver);
//        DataHelperAndWait.clickOnElement(recommendedProductpage.getProductImages().get(0),webDriver);}
//                catch (IndexOutOfBoundsException e){
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
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(UAE Store/ English Version): Make sure ability to add Recommended product to the cart", priority = 8)
    public void verifyAbilityToAddRecommendedProductToCart() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        recommendedProductpage.clickOnListItemsAndAssertion(recommendedProductpage.getAddToCartBtn(),webDriver,productDetailsPage.getAddToCartBtn());
    }
    @Test(groups = {"1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure the name of product added to the Cart displayed correctly in the Recommended product pop-up", priority = 9)
    public void verifyTheNameOfProductAddedToCatDisplayedInTheRecommendedPopup() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        String productNameInPDP=(DataHelperAndWait.getWebElementText(productDetailsPage.getProductName(),webDriver)).substring(6);
        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
        Assert.assertTrue(DataHelperAndWait.getWebElementText(recommendedProductpage.getAddedProductToCartMsg(),webDriver).startsWith(productNameInPDP));
    }
    @Test(groups = {"1.2 High Severity"},description = "(UAE Store/ English Version): Make sure the clicking on the product card appears in the Recommended product pop-up will display the Product Details Page correctly", priority = 10)
    public void verifyClickingOnProductCardInTheRecommendedPopupWillDisplayThePdp() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        recommendedProductpage.clickOnProductCard();
    }
}
