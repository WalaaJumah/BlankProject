package sporter_test;

import core.BaseTest;
import core.SeleniumWait;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.ProductDetailsPage;

import java.util.List;

public class ProductDetailsTestCases extends BaseTest {
    private ProductDetailsPage productDetailsPage;
    private SeleniumWait wait= new SeleniumWait();

    @Test(description = "Make sure the shopper is able to keep the shopping after adding the product to the cart ",priority = 1)
    public void keepShoppingAfterAddingToTheCart() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountryThenAddProductToCart();
        productDetailsPage.keepShopping();
        wait.implicitWait(20);
        Assert.assertEquals(webDriver.getCurrentUrl(),productWithFreeGift );
    }

    @Test(description = "Make sure the shopper is able to View the cart after adding the product to it ",priority = 2)
    public void viewCartAfterAddingTheProductToIt() throws InterruptedException{
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountryThenAddProductToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.sporter.com/en-ae/checkout/cart/");
    }

    @Test(description = "Make sure the out of stock message appears when displaying out of stock product ",priority = 3)
    public void verifyOOSMessageIsDisplayed() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        webDriver.navigate().to(outOfStockProduct);
        wait.implicitWait(20);
        boolean  isDisplayed=  webDriver.findElement(By.xpath("//span[contains(text(),\"We're sorry for not being able to provide you with\")]")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Test(description = "Make sure the shopper is unable to add out of stock product to the cart",priority = 4)
    public void verifyUnabilityToAddOosProductToTheCart() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        webDriver.navigate().to(outOfStockProduct);
        productDetailsPage.clickOnTheProductAttrubuits();
        wait.implicitWait(20);
        boolean  isDisplayed=  webDriver.findElement(By.id("product-addtocart-button")).isDisplayed();
        Assert.assertFalse(isDisplayed);
    }

    @Test(description = "Make sure to display the product from search screen",priority = 5)
    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        wait.implicitWait(20);
        productDetailsPage.searchForTheProduct();
        wait.implicitWait(20);
        productDetailsPage.clickOnTheProductCard();
        wait.implicitWait(20);
        boolean  isDisplayed=  webDriver.findElement(By.id("id= \"product-addtocart-button\"")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Test(description = "Make sure the system will display a message when the offer is not available in the selected country",priority = 6)
    public void verifyUnabilityToDisplayUnAvailableOffer() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        wait.implicitWait(20);
        productDetailsPage.switchToLebanonCountry();
        wait.implicitWait(20);
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/h3")).isDisplayed());
    }
    @Test(description = "Make sure that each of increase and decrease quantity works fine ",priority = 7)
    public void verifyIncreaseAndDecreaseQuantityButtonsWorkingFine() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        wait.implicitWait(20);
        productDetailsPage.increaseTheQuantity();
        Assert.assertEquals(productDetailsPage.quantityField.getAttribute("value"),"2");
        productDetailsPage.decreaseTheQuantity();
        Assert.assertEquals(productDetailsPage.quantityField.getAttribute("value"),"1");

    }

    @Test(description = "Make sure that the customer can submit his review successfully ",priority = 8)
    public void verifyAbilityToSubmitTheProductReview() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        wait.implicitWait(20);
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview("Review Description","Review Summary", "Wala'a Mohammad");
        wait.isWebElementPresent(productDetailsPage.reviewToastMsg);
        Assert.assertTrue(productDetailsPage.reviewToastMsg.isDisplayed());
    }
    @Test(description = "Make sure that the customer is unable to submit his review without selecting any star ",priority = 9)
    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        wait.implicitWait(20);
        productDetailsPage.submitProductReview("Review Description","Review Summary", "Wala'a Mohammad");
        wait.isWebElementPresent(productDetailsPage.reviewErrorMsg);
        Assert.assertTrue(productDetailsPage.reviewErrorMsg.isDisplayed());
    }

    @Test(description = "Make sure that the customer can submit his review when filling Review Form with Long Length",priority = 10)
    public void verifyAbilityToFillTheReviewWIthLongLength() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        wait.implicitWait(20);
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview("Review Description With Long Length Review Description With Long LengthReReview Description With Long Length Review Description With Long Lengthview Description With Long Length ","Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length ", "Abd-Alrahman Abd Alazez Abdullah Mohammad Khair");
        wait.isWebElementPresent(productDetailsPage.reviewToastMsg);
        Assert.assertTrue(productDetailsPage.reviewToastMsg.isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb ",priority = 11)
    public void verifyAbilityToNavigatetToHomePageUsingTheBreadCrumb() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        wait.implicitWait(20);
        productDetailsPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(),aeSiteURL);
    }
    @Test(description = "Make sure that the customer can switch to Arabic Language from PDP ",priority = 12)
    public void verifyAbilityToSwitchToArabicVersionFromPDP() {
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        wait.implicitWait(20);
        productDetailsPage.switchToArabicVersion();
        wait.isWebElementPresent(productDetailsPage.englishLangBtn);
        Assert.assertTrue(productDetailsPage.englishLangBtn.isDisplayed());
    }


}
