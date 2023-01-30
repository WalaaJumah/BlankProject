/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanRecommendedProductTestCases
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.RecommendedProductsPage.JordanRecommendedProductPage;
import sporter_pages.RecommendedProductsPage.RecommendedProductPage;
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.productPage.JordanProductDetailsPage;
import sporter_pages.productPage.ProductDetailsPage;

//@Test(groups = "Jordan Product Details Page")
public class JordanRecommendedProductTestCases extends RecommendedProductTestCases {
    @BeforeClass(alwaysRun=true)
    public void switchToJordanStore(){
        JordanHomePage jordanHomePage=new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if(webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)){
            System.out.println("You are in Jordan Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+jordanHomePage.jordanDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(Jordan Store/ English Version): Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 2)
    public void verifyKeepShoppingBtnWorksCorrectly() {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        jordanProductDetailsPage.keepShoppingAfterAddingToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(Jordan Store/ English Version): Make sure the view Cart button appearing the Recommended products works correctly ", priority =3)
    public void verifyViewCartWorksBtnCorrectly() {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getAddToCartBtn(),webDriver);
        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getViewCartBtn(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(jordanProductDetailsPage.cartURL,webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "(Jordan Store/ English Version): Make sure to close the Recommended products pop up correctly", priority = 4)
    public void verifyCloseRecommendedPopupCorrectly() {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        JordanRecommendedProductPage jordanRecommendedProductPage = new JordanRecommendedProductPage(webDriver);
        jordanRecommendedProductPage.displayTheRecommendedProductsPopUp();
        DataHelperAndWait.clickOnElement(jordanRecommendedProductPage.getRecommendedProductsCloseIcon(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "(Jordan Store/ English Version): Make sure to close the Recommended products pop up when clicking outside the pop-up", priority = 5)
    public void verifyCloseRecommendedPopupCorrectlyWhenClickingOutsideThePopup() {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        JordanRecommendedProductPage jordanRecommendedProductPage = new JordanRecommendedProductPage(webDriver);
        jordanRecommendedProductPage.displayTheRecommendedProductsPopUp();
        Actions act = new Actions(webDriver);
        act.moveByOffset(913, 477).contextClick().build().perform();
        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "(Jordan Store/ English Version): Make sure all components appear correctly in  Recommended products like keep shopping and view cart and products list and titles", priority = 6)
    public void verifyAllRecommendedPopupComponentsIsExist() {
        JordanRecommendedProductPage jordanRecommendedProductPage = new JordanRecommendedProductPage(webDriver);
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        jordanRecommendedProductPage.displayTheRecommendedProductsPopUp();
        //Make sure the check circle icon is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(jordanRecommendedProductPage.getCircleIcon(),webDriver);
        //Make sure the Thumbs Up title is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(jordanRecommendedProductPage.getThumbsUpTitle(),webDriver);
        //Make sure the added product message is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(jordanRecommendedProductPage.getAddedProductToCartMsg(),webDriver);
        //Make sure the Recommended products title is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(jordanRecommendedProductPage.getRecommendedProductsTitle(),webDriver);
        //Make sure the products images are displayed
        WebElementsAssertion.assertAllListItemsAreDisplayed(jordanRecommendedProductPage.getProductImages(),webDriver);
        //Make sure the products prices are displayed
        WebElementsAssertion.assertAllListItemsAreDisplayed(jordanRecommendedProductPage.getProductPrice(),webDriver);
        //Make sure the add to cart buttons are displayed
        WebElementsAssertion.assertAllListItemsAreDisplayed(jordanRecommendedProductPage.getAddToCartBtn(),webDriver);
        //Make sure the keep shopping button is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getKeepShippingBtn(),webDriver);
        //Make sure the view cart button is displayed
        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getViewCartBtn(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(Jordan Store/ English Version): Make sure ability to add Recommended product to the cart", priority = 7)
    public void verifyAbilityToAddRecommendedProductToCart() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        recommendedProductpage.clickOnListItemsAndAssertion(recommendedProductpage.getAddToCartBtn(),webDriver,productDetailsPage.getAddToCartBtn());
    }
    @Test(groups = {"1.3 Medium Severity"},description = "(Jordan Store/ English Version): Make sure the name of product added to the Cart displayed correctly in the Recommended product pop-up", priority = 8)
    public void verifyTheNameOfProductAddedToCatDisplayedInTheRecommendedPopup() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        String productNameInPDP=DataHelperAndWait.getWebElementText(productDetailsPage.getProductName(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
        WebElementsAssertion.assertionWebElementConatinsText(recommendedProductpage.getAddedProductToCartMsg(),webDriver,productNameInPDP);
    }
    @Test(groups = {"1.3 Medium Severity"},description = "(Jordan Store/ English Version): Make sure the product price displayed in the Recommended product pop-up matches with the product price displayed in PDP", priority = 9)
    public void verifyTheProductPriceInTheRecommendedPopupMatchesWithThePriceDisplaysInPdp() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        recommendedProductpage.displayTheRecommendedProductsPopUp();
        String productPriceInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getProductPrice().get(0),webDriver);
        DataHelperAndWait.clickOnElement(recommendedProductpage.getProductPrice().get(0),webDriver);
        String productPriceInPdp =DataHelperAndWait.getWebElementText(productDetailsPage.getFinalProductPrice(),webDriver);
        Assert.assertEquals(productPriceInPdp, productPriceInRecommendedPopup, "The product Price displayed in the Recommended pop-up is not match with the price in PDP"+ productPriceInPdp +" VS."+ productPriceInRecommendedPopup);
    }
    @Test(groups = {"1.2 High Severity"},description = "(Jordan Store/ English Version): Make sure the clicking on the product card appears in the Recommended product pop-up will display the Product Details Page correctly", priority = 10)
    public void verifyClickingOnProductCardInTheRecommendedPopupWillDisplayThePdp() {
        RecommendedProductPage recommendedProductpage = new RecommendedProductPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        recommendedProductpage.displayTheRecommendedProductsPopUp();
        String productNameInRecommendedPopup = DataHelperAndWait.getWebElementText(recommendedProductpage.getProductPrice().get(0),webDriver);
        DataHelperAndWait.clickOnElement(recommendedProductpage.getProductPrice().get(0),webDriver);
        Assert.assertEquals(productNameInRecommendedPopup, DataHelperAndWait.getWebElementText(productDetailsPage.getProductName(),webDriver), "The product name displayed in the Recommended pop-up is not match with the name in PDP ");
    }
}
