package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.CartPage;
import sporter_pages.ProductDetailsPage;

import java.util.List;

public class CartTestCases extends BaseTest {
    private ProductDetailsPageTestCases productDetailsPageTestCases;
    private ProductDetailsPage productDetailsPage;
    private CartPage cartPage;

    @Test(description= "Make sure to view the cart from PDP after adding  product to it", priority = 1)
    public void viewCartFromPDP(){
        productDetailsPageTestCases= new ProductDetailsPageTestCases();
    productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
    }
    @Test(description= "Make sure to view the cart after adding more than quantity for the same product", priority = 2)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanQtyOfProduct(){
    productDetailsPage= new ProductDetailsPage(webDriver);
    productDetailsPageTestCases= new ProductDetailsPageTestCases();
    productDetailsPageTestCases.verifyIncreaseQuantityButtonWorkingFine();
    productDetailsPage.addToCart();
    productDetailsPage.viewCart();
    Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
    @Test(description= "Make sure to view the cart after adding more than products to it", priority = 3)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanProducts(){
        productDetailsPage= new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(),10);
        productDetailsPage.DisplayProductInTheList(0);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(),10);
        productDetailsPage.DisplayProductInTheList(1);
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
    @Test(description = "Adding a config to the cart more than one with differnt simple in each time", priority = 4)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanSimpleOfTheSameConfig(){
        productDetailsPage= new ProductDetailsPage(webDriver);
        cartPage= new CartPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSportsSupplementsMenu();
        productDetailsPage.DisplayProductInTheList(0);
        productDetailsPage.clickOnFirstProductFlavor();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        productDetailsPage.clickOnSecondProductFlavor();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        String itemsCounter="(2 Items)";
        DataHelperAndWait.waitToBeVisible(cartPage.getItemsCounterInCartPage(),15);
        Assert.assertEquals(cartPage.getItemsCounterInCartPage().getText(),itemsCounter);
    }
    @Test(description = "Make sure ability to add bundle to the Cart", priority = 5)
    public void verifyAbilityToAddBundleToCart() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.searchForBundle();
        productDetailsPage.clickOnSearchBtn();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductCard(), 20);
        productDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), 20);
        Select select=new Select(productDetailsPage.getBundleMenu());
        WebElement newSelectedOption= select.getFirstSelectedOption();
        newSelectedOption.click();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
    @Test(description = "Make sure ability to add a bundle to the cart with all bundle options", priority = 6)
    public void verifyAbilityToAddBundleWithAllItsOptionsToCart(){
//        productDetailsPage = new ProductDetailsPage(webDriver);
//        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
//        productDetailsPage.switchCountry();
//        productDetailsPage.searchForBundle();
//        productDetailsPage.clickOnSearchBtn();
//        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductCard(), 20);
//        productDetailsPage.clickOnTheProductCard();
//        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), 20);
//        Select select=new Select(productDetailsPage.getBundleMenu());
//        List<WebElement> elementCount = select.getOptions();
//        int menuSize = elementCount.size();
//        for (int i = 0; i < menuSize; i++) {
//            select.selectByIndex(i);
//            productDetailsPage.addToCart();
//            productDetailsPage.keepShopping();}
//        productDetailsPage.viewCart();
//        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);



        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.searchForBundle();
        productDetailsPage.clickOnSearchBtn();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductCard(), 20);
        productDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), 20);
        Select select=new Select(productDetailsPage.getBundleMenu());
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            select.selectByIndex(i);
            productDetailsPage.addToCart();
            boolean UnAvailableQtyMsgIsDisplayed= cartPage.getRequestedQtyUnAvailableMsg().isDisplayed();
            if(UnAvailableQtyMsgIsDisplayed){
                break;

            }
                        productDetailsPage.keepShopping();}




//            productDetailsPage.keepShopping();}
//        productDetailsPage.viewCart();
//        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);





    }}















