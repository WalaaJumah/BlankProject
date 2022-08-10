package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.ProductDetailsPage;
import sporter_pages.RecommendedProductsPage;

public class RecommendedProductsTestCases extends BaseTest {
    private ProductDetailsPageTestCases productDetailsPageTestCases;
    private ProductDetailsPage productDetailsPage;
    private RecommendedProductsPage recommendedProductspage;

    @Test(description = "Make sure the keep shopping button appearing the Recommended products works correctly ", priority = 1)
    public void verifyKeepShoppingBtnWorksCorrectly(){
        productDetailsPageTestCases= new ProductDetailsPageTestCases();
        productDetailsPageTestCases.keepShoppingAfterAddingToTheCart();
    }
    @Test(description = "Make sure the view Cart button appearing the Recommended products works correctly ", priority = 2)
    public void verifyViewCartWorksBtnCorrectly(){
        productDetailsPageTestCases= new ProductDetailsPageTestCases();
        productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
    }
    @Test(description = "Make sure to close the Recommended products pop up correctly", priority = 3)
    public void verifyCloseRecommendedPopupCorrectly(){
        productDetailsPage= new ProductDetailsPage(webDriver);
        recommendedProductspage= new RecommendedProductsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        recommendedProductspage.clickOnRecommendedProductsCloseIcon();
        DataHelperAndWait.implicitWait(10);
        Assert.assertTrue(productDetailsPage.getAddToCartBtn().isDisplayed());

    }
}
