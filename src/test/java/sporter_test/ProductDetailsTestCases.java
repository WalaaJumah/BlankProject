import core.BaseTest;
import core.SeleniumWait;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.ProductDetailsPage;

import java.util.concurrent.TimeUnit;

public class ProductDetailsTestCases extends BaseTest {
    private ProductDetailsPage productDetailsPage;
    private SeleniumWait wait;

    @Test(description = "Make sure the shopper is able to keep the shopping after adding the product to the cart ",priority = 1)
    public void keepShoppingAfterAddingToTheCart() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        webDriver.navigate().to(productWithFreeGift);
        productDetailsPage.navigateToTheProduct();
     webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        productDetailsPage.addToCart();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        productDetailsPage.keepShopping();
        Assert.assertEquals(webDriver.getCurrentUrl(),productWithFreeGift );
    }

    @Test(description = "Make sure the shopper is able to View the cart after adding the product to it ",priority = 2)
    public void viewCartAfterAddingTheProductToIt() throws InterruptedException{
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();


        webDriver.navigate().to(productWithFreeGift);
        productDetailsPage.navigateToTheProduct();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        productDetailsPage.addToCart();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.sporter.com/en-ae/checkout/cart/");
    }

    @Test(description = "Make sure the out of stock message appears when displaying out of stock product ",priority = 3)
    public void verifyOOSMessageIsDisplayed() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        webDriver.navigate().to(outOfStockProduct);
        webDriver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        boolean  isDisplayed=  webDriver.findElement(By.xpath("//span[contains(text(),\"We're sorry for not being able to provide you with\")]")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Test(description = "Make sure the shopper is unable to add out of stock product to the cart",priority = 4)
    public void verifyUnabilityToAddOosProductToTheCart() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        webDriver.navigate().to(outOfStockProduct);
        webDriver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        boolean  isDisplayed=  webDriver.findElement(By.id("id= \"product-addtocart-button\"")).isDisplayed();
        Assert.assertFalse(isDisplayed);
    }

    @Test(description = "Make sure to display the product from search screen",priority = 5)
    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        webDriver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        productDetailsPage.searchForTheProduct();
        webDriver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        productDetailsPage.clickOnTheProductCard();
        webDriver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        boolean  isDisplayed=  webDriver.findElement(By.id("id= \"product-addtocart-button\"")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Test(description = "Make sure the system will display a message when the offer is not available in the selected country",priority = 6)
    public void verifyUnabilityToDisplayUnAvailableOffer() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        webDriver.navigate().to(productWithFreeGift);
        productDetailsPage.navigateToTheProduct();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        productDetailsPage.switchToLebanonCountry();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/h3")).isDisplayed());
    }

}
