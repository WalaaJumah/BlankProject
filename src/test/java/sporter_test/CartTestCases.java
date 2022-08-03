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
    @Test(description = "Make sure to view the cart from PDP after adding  product to it", priority = 1)
    public void viewCartFromPDP() {
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
    }
    @Test(description = "Make sure to view the cart after adding more than quantity for the same product", priority = 2)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanQtyOfProduct() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        productDetailsPageTestCases.verifyIncreaseQuantityButtonWorkingFine();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
    @Test(description = "Make sure to view the cart after adding more than products to it", priority = 3)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanProducts() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(), 10);
        productDetailsPage.DisplayProductInTheList(0);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(), 10);
        productDetailsPage.DisplayProductInTheList(1);
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
    @Test(description = "Adding a config to the cart more than one with differnt simple in each time", priority = 4)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanSimpleOfTheSameConfig() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage = new CartPage(webDriver);
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
        String itemsCounter = "(2 Items)";
        DataHelperAndWait.waitToBeVisible(cartPage.getItemsCounterInCartPage(), 15);
        Assert.assertEquals(cartPage.getItemsCounterInCartPage().getText(), itemsCounter);
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
        Select select = new Select(productDetailsPage.getBundleMenu());
        WebElement newSelectedOption = select.getFirstSelectedOption();
        newSelectedOption.click();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
//This Method needs to investigate
    @Test(description = "Make sure ability to add a bundle to the cart with all bundle options",enabled = false, priority = 6)
    public void verifyAbilityToAddBundleWithAllItsOptionsToCart() {
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
        Select select = new Select(productDetailsPage.getBundleMenu());
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            select.selectByIndex(i);
            productDetailsPage.addToCart();
            productDetailsPage.keepShopping();
            if (DataHelperAndWait.isPresent(cartPage.getRequestedQtyUnAvailableMsg()))
                break;
            else
                continue;

        }
        //            productDetailsPage.keepShopping();}
//        productDetailsPage.viewCart();
//        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
    @Test(description ="Verify that the The requested qty is not available message appear when the product becomes OOS",priority = 7)
    public void verifyToDisplayRequestedQtyIsNotAvailableMsg(){
        productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage = new CartPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.fillInQtyField("500");
        productDetailsPage.addToCart();
        DataHelperAndWait.waitToBeVisible(cartPage.getContinueShoppingBtn(), 10);
        Assert.assertTrue(cartPage.getContinueShoppingBtn().isDisplayed());
    }
    @Test(description ="Verify that the ContinueShoppingBtn works correctly when displaying The requested qty is not available message",priority = 8)
    public void verifyContinueShoppingBtnWorksCorrectlyWhenTheProductBecomeOOS(){
        productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage = new CartPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.fillInQtyField("500");
        String currentURL = webDriver.getCurrentUrl();
        productDetailsPage.addToCart();
        cartPage.clickOnTheContinueShoppingBtn();
        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL);
    }
    @Test(description ="Verify ability to remove the product from the cart successfully",priority = 9)
    public void verifyAbilityToRemoveProductFromCart(){
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        cartPage= new CartPage(webDriver);
        productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
        cartPage.clickOnRemoveItem();
        DataHelperAndWait.isDisplayed(cartPage.getNoItemInCartLabel(),10);
        Assert.assertTrue(cartPage.getNoItemInCartLabel().isDisplayed());
    }
    @Test(description ="Verify that Here Link appear after clearing the items from the Cart works successfully",priority = 10)
    public void verifyHereLinkInCartPageWorking(){
        cartPage= new CartPage(webDriver);
        this.verifyAbilityToRemoveProductFromCart();
        DataHelperAndWait.isDisplayed(cartPage.getHereLink(),10);
        cartPage.clickOnHereLink();
        String currentURL = webDriver.getCurrentUrl();
        Assert.assertEquals(webDriver.getCurrentUrl(), aeSiteURL);
    }
    @Test(description ="Verify ability to increase the product quantity from Cart page from the Cart Page works successfully",priority = 10)
    public void verifyIecreaseQtyBtnInCartPageWorking(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        DataHelperAndWait.waitToBeClickable(cartPage.getIncreaseQtyBtn(),10);
        cartPage.clickOnIecreseQtyBtn();
        Assert.assertEquals(cartPage.getQtyField().getAttribute("value"), "2");
    }
    @Test(description ="Verify ability to Decrease the product quantity from Cart page from the Cart Page works successfully",priority = 11)
    public void verifyDecreaseQtyBtnInCartPageWorking(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        DataHelperAndWait.waitToBeClickable(cartPage.getIncreaseQtyBtn(),10);
        cartPage.clickOnIecreseQtyBtn();
        DataHelperAndWait.waitToBeClickable(cartPage.getDecreseQtyBtn(),10);
        cartPage.clickOnDecreseQtyBtn();
        Assert.assertEquals(cartPage.getQtyField().getAttribute("value"), "1");
    }




















}

















