package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.annotations.Test;
import sporter_pages.AddToCartPage;
import sporter_pages.ProductDetailsPage;

public class AddToCartTestCases extends BaseTest {
    private DataHelperAndWait wait= new DataHelperAndWait();
    private AddToCartPage addToCartPage;
    private ProductDetailsPage productDetailsPage;
    @Test(description = "Make sure the shopper is able to add the product to the cart successfully",priority = 1)

    public void addProductToCartSuccessfullyAsGuestUser() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        addToCartPage= new AddToCartPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        wait.implicitWait(20);
        addToCartPage.clickOnProceedToCheckOutButton();
        wait.implicitWait(20);
        addToCartPage.clickOnGuestCheckoutBtn();
        wait.implicitWait(20);
        addToCartPage.fillShippingInformation();
        wait.implicitWait(20);
        addToCartPage.clickOnContinueBtnInShippingPage();
        addToCartPage.selectPaymentOnDelivery();
        addToCartPage.clickOncontinueBtnInPayemntPage();
        addToCartPage.clickOnPlaceOrderButton();

    }
}
