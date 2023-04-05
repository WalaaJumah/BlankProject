/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptRecommendedProductTestCases
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.productPage.ProductDetailsPage;

//@Test(groups = "Egypt Product Details Page")
public class EgyptRecommendedProductTestCases extends RecommendedProductTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            CloseInitialDialog();
        }
    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 2)
//    public void verifyKeepShoppingBtnWorksCorrectly() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.keepShoppingAfterAddingToCart();
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure the view Cart button appearing the Recommended products works correctly ", priority =3)
//    public void verifyViewCartWorksBtnCorrectly() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getAddToCartBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getViewCartBtn(),webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString(egyptProductDetailsPage.cartURL,webDriver);
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}: Make sure to close the Recommended products pop up correctly", priority = 4)
//    public void verifyCloseRecommendedPopupCorrectly() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        EgyptRecommendedProductPage egyptRecommendedProductPage = new EgyptRecommendedProductPage(webDriver);
//        egyptRecommendedProductPage.displayTheRecommendedProductsPopUp();
//        DataHelperAndWait.clickOnElement(egyptRecommendedProductPage.getRecommendedProductsCloseIcon(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(Egypt Store/ English Version): Make sure to close the Recommended products pop up when clicking outside the pop-up", priority = 5)
//    public void verifyCloseRecommendedPopupCorrectlyWhenClickingOutsideThePopup() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        EgyptRecommendedProductPage egyptRecommendedProductPage = new EgyptRecommendedProductPage(webDriver);
//        egyptRecommendedProductPage.displayTheRecommendedProductsPopUp();
//        Actions act = new Actions(webDriver);
//        act.moveByOffset(913, 477).contextClick().build().perform();
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(Egypt Store/ English Version): Make sure all components appear correctly in  Recommended products like keep shopping and view cart and products list and titles", priority = 6)
//    public void verifyAllRecommendedPopupComponentsIsExist() {
//        EgyptRecommendedProductPage egyptRecommendedProductPage = new EgyptRecommendedProductPage(webDriver);
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptRecommendedProductPage.displayTheRecommendedProductsPopUp();
//        //Make sure the check circle icon is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptRecommendedProductPage.getCircleIcon(),webDriver);
//        //Make sure the Thumbs Up title is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptRecommendedProductPage.getThumbsUpTitle(),webDriver);
//        //Make sure the added product message is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptRecommendedProductPage.getAddedProductToCartMsg(),webDriver);
//        //Make sure the Recommended products title is displayed
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptRecommendedProductPage.getRecommendedProductsTitle(),webDriver);
//    }
////    @Test(groups = {"1.3 Medium Severity"},description = "(Egypt Store/ English Version): Make sure the product price displayed in the Recommended product pop-up matches with the product price displayed in PDP", priority = 7)
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
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(Egypt Store/ English Version): Make sure ability to add Recommended product to the cart", priority = 8)
//    public void verifyAbilityToAddRecommendedProductToCart() {
//        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        recommendedProductpage.clickOnListItemsAndAssertion(recommendedProductpage.getAddToCartBtn(),webDriver,productDetailsPage.getAddToCartBtn());
//    }
//    @Test(groups = {"1.3 Medium Severity"},description = "(Egypt Store/ English Version): Make sure the name of product added to the Cart displayed correctly in the Recommended product pop-up", priority = 9)
//    public void verifyTheNameOfProductAddedToCatDisplayedInTheRecommendedPopup() {
//        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        String productNameInPDP=(DataHelperAndWait.getWebElementText(productDetailsPage.getProductName(),webDriver)).substring(6);
//        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
//        Assert.assertTrue(DataHelperAndWait.getWebElementText(recommendedProductpage.getAddedProductToCartMsg(),webDriver).startsWith(productNameInPDP));
//    }
//    @Test(groups = {"1.2 High Severity"},description = "(Egypt Store/ English Version): Make sure the clicking on the product card appears in the Recommended product pop-up will display the Product Details Page correctly", priority = 10)
//    public void verifyClickingOnProductCardInTheRecommendedPopupWillDisplayThePdp() {
//        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
//        recommendedProductpage.clickOnProductCard();
// }
}