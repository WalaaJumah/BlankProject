package sporter_test;

import core.BaseTest;
import core.SeleniumWait;
import org.testng.annotations.Test;
import sporter_pages.AddToCartPage;
import sporter_pages.ProductDetailsPage;

import java.util.concurrent.TimeUnit;

public class AddToCartTestCases extends BaseTest {
    private SeleniumWait wait= new SeleniumWait();
    private AddToCartPage addToCartPage;
    private ProductDetailsPage productDetailsPage;
    @Test(description = "Make sure the shopper is able to add the product to the cart successfully",priority = 1)

    public void addProductToCartSuccessfullyAsGuestUser() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        addToCartPage= new AddToCartPage(webDriver);
        productDetailsPage.switchCountryThenAddProductToCart();
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
