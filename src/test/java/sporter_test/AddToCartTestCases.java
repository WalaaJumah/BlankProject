package sporter_test;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sporter_pages.AddToCartPage;
import sporter_pages.ProductDetailsPage;

import java.util.concurrent.TimeUnit;

import static core.BaseTest.webDriver;

public class AddToCartTest extends BaseTest {

    private AddToCartPage addToCartPage;
    private ProductDetailsPage productDetailsPage;
    @Test(description = "Make sure the shopper is able to add the product to the cart successfully",priority = 1)

    public void addProductToCartSuccessfullyAsGuestUser() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        addToCartPage= new AddToCartPage(webDriver);
        productDetailsPage.switchCountry();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        addToCartPage.clickOnFirstProductInHomePage();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        productDetailsPage.addToCart();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        productDetailsPage.viewCart();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        addToCartPage.clickOnProceedToCheckOutButton();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //new
        //wait = new WebDriverWait(webDriver, 10);
       // wait.until(ExpectedConditions.elementToBeClickable (By.xpath("//*[@id=\\\"checkout_step_col1_col2\\\"]/div[2]/div/button")));
        addToCartPage.clickOnGuestCheckoutBtn();




    }
}
