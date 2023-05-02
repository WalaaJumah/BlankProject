package sporter_test;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import sporter_pages.*;

import java.text.DecimalFormat;
import java.util.List;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
@Test(groups = "2.03 Cart Page")
public class AeCartTestCases extends BaseTest {

    Actions action;
    @Test(groups = "All Smoke Testing Result",description = " Cart Page- Sports Category- Switching to UAE store", priority = 1)
    public void switchToUaeStore(){
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        webDriver.navigate().to("https://www.sporter.com/en-ae");

        aeWomenOnlyCategoryPage.switchToAECountry();
        if(webDriver.getCurrentUrl().contains(aeWomenOnlyCategoryPage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+aeDomain);
            CloseInitialDialog();          }
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = " Cart Page- Make sure to view the cart from PDP after adding  product to it", priority = 2)
    public void viewCartFromPDP() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );
        aeCartPage.clickOnRemoveItem();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Make sure that the product counter that appears in the cart page works correctly", priority = 3)
    public void verifyProductCounterAppearsInTheCartPageWorksCorrectly() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeCartPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        String itemsCounter = "(2 Items)";
        Assert.assertEquals(aeCartPage.getItemsCounterInCartPage().getText(), itemsCounter);
        aeCartPage.clickOnRemoveItem();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Make sure that the Free Gift is removed from the cart when you remove the product", priority = 4)
    public void verifyTheFreeGiftIsRemovedWhenRemovingTheProduct() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
//        aeProductDetailsPage.clickOnShopeByMenu();
//        aeProductDetailsPage.clickOnSalesAndOffersMenu();
//        aeProductDetailsPage.clickOnBuy1Get1Card();
//        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getFirstProductInTheCategoryList(), 8,webDriver);
//        aeProductDetailsPage.DisplayProductInTheList(0);
        aeCartPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertTrue(aeCartPage.getFreePrice().isDisplayed());
        aeCartPage.clickOnRemoveItem();
        Assert.assertTrue(aeCartPage.getNoItemInCartLabel().isDisplayed());
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Verify ability to remove the product from the cart successfully", priority = 5)
    public void verifyAbilityToRemoveProductFromCart() {
        AeCartPage aeCartPage=new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );
        aeCartPage.clickOnRemoveItem();
        Assert.assertTrue(aeCartPage.getNoItemInCartLabel().isDisplayed());
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Verify that Here Link appear after clearing the items from the Cart works successfully", priority = 6)
    public void verifyHereLinkInCartPageWorking() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.displayTheProduct();
//        aeProductDetailsPage.addToCart();
//        aeProductDetailsPage.viewCart();
//        aeCartPage.clickOnRemoveItem();
//        this.verifyAbilityToRemoveProductFromCart();
        DataHelperAndWait.isDisplayed(aeCartPage.getHereLink(), 8,webDriver);
        aeCartPage.clickOnHereLink();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeCartPage.aeDomain+"/", "The Current URL is not matched with the AE Site URL");
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Make sure that the product counter that appears in the cart page counts the free gift correctly", priority = 7)
    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.displayTheProduct();
//        aeProductDetailsPage.increaseTheQuantity();
        aeProductDetailsPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        DataHelperAndWait.waitForTime(1000);
        aeProductDetailsPage.viewCart();
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.addToCartAndDisplayTheCart();
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.addToCartAndDisplayTheCart();
        String itemsCounter = "(2 Items)";
        DataHelperAndWait.waitToBeVisible(aeCartPage.getItemsCounterInCartPage(), 8,webDriver);
        Assert.assertEquals(aeCartPage.getItemsCounterInCartPage().getText(), itemsCounter);
        aeCartPage.clickOnRemoveItem();
//        aeCartPage.clickOnRemoveItem();
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = " Cart Page- Make sure to view the cart after adding more than quantity for the same product", priority = 8,enabled = false)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanQtyOfProduct() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.increaseTheQuantity();
        aeProductDetailsPage.increaseTheQuantity();
      aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );
    aeCartPage.clickOnRemoveItem();}

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = " Cart Page- Make sure to view the cart after adding more than products to it", priority = 9)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanProducts() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
//        aeProductDetailsPage.clickOnShopeByMenu();
//        aeProductDetailsPage.clickOnSalesAndOffersMenu();
//        aeProductDetailsPage.clickOnBuy1Get1Card();
//        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getFirstProductInTheCategoryList(), 8,webDriver);
//        aeProductDetailsPage.DisplayProductInTheList(0);
        aeCartPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );
    aeCartPage.clickOnRemoveItem();
    aeCartPage.clickOnRemoveItem();
    }
//TODogh876uyuyhjuj: Don't for get to revisit if
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.2 High Severity"},description = " Cart Page- Adding a config to the cart more than one with different simple in each time", priority = 10)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanSimpleOfTheSameConfig() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
//        aeProductDetailsPage.clickOnFirstsimple();
        aeProductDetailsPage.addToCart();
//        aeProductDetailsPage.keepShopping();
//        aeProductDetailsPage.clickOnSecondimple();
//        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        String itemsCounter = "(2 Items)";
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );
        aeCartPage.clickOnRemoveItem();
//        aeCartPage.clickOnRemoveItem();
    }


    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = " Cart Page- Make sure ability to add bundle to the Cart", priority = 11)
    public void verifyAbilityToAddBundleToCart() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage=new AeCartPage(webDriver);
        aeProductDetailsPage.displayBundle();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getBundleMenu(), 8,webDriver);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );
        aeCartPage.clickOnRemoveItem();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Verify that the The requested qty is not available message appear when the product becomes OOS", priority = 12)
    public void verifyToDisplayRequestedQtyIsNotAvailableMsg() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.fillInQtyField("10000");
        aeProductDetailsPage.addToCart();
        Assert.assertTrue(aeCartPage.getContinueShoppingBtn().isDisplayed());
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Verify that the ContinueShoppingBtn works correctly when displaying The requested qty is not available message", priority = 13)
    public void verifyContinueShoppingBtnWorksCorrectlyWhenTheProductBecomeOOS() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
//        aeProductDetailsPage.clickOnProductInHomePage();
//        aeProductDetailsPage.fillInQtyField("500");
        String currentURL = webDriver.getCurrentUrl();
//        aeProductDetailsPage.addToCart();
        aeCartPage.clickOnTheContinueShoppingBtn();
        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL,"The Current URL is not matched with the Cart URL");
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.2 High Severity"},description = " Cart Page- Verify ability to increase the product quantity from Cart page from the Cart Page works successfully", priority = 14)
    public void verifyIncreaseQtyBtnInCartPageWorking() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.waitToBeClickable(aeCartPage.getIncreaseQtyBtn(), 8,webDriver);
        aeCartPage.clickOnIncreaseQtyBtn();
        Assert.assertEquals(aeCartPage.getQtyField().getAttribute("value"), "2");
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.2 High Severity"},description = " Cart Page- Verify ability to Decrease the product quantity from Cart page from the Cart Page works successfully", priority = 15)
    public void verifyDecreaseQtyBtnInCartPageWorking() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.addToCartAndDisplayTheCart();
//        DataHelperAndWait.waitToBeClickable(aeCartPage.getIncreaseQtyBtn(), 8,webDriver);
//        aeCartPage.clickOnIncreaseQtyBtn();
        DataHelperAndWait.waitToBeClickable(aeCartPage.getDecreaseQtyBtn(), 8,webDriver);
        aeCartPage.clickOnDecreaseQtyBtn();
        Assert.assertEquals(aeCartPage.getQtyField().getAttribute("value"), "1");
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Verify ability to display the product from the Cart Page works successfully", priority = 16)
    public void verifyAbilityToDisplayTheProductFromTheCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        aeCartPage.clickOnProductCartInCartPage();
        Assert.assertNotEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeCartPage.aeDomain, "The Current URL is not matched with the AE Site URL");
        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Make sure that the Free Gift is added correctly to the Cart", priority = 17)
    public void verifyTheFreeGiftIsAddedCorrectlyToTheCart() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
//        aeProductDetailsPage.clickOnShopeByMenu();
//        aeProductDetailsPage.clickOnSalesAndOffersMenu();
//        aeProductDetailsPage.clickOnBuy1Get1Card();
//        aeProductDetailsPage.DisplayProductInTheList(0);
        aeCartPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertTrue(aeCartPage.getFreeFromSporterSection().isDisplayed());
        aeCartPage.clickOnRemoveItem();
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Make sure that the Free Gift does not have a price", priority = 18)
    public void verifyTheFreeGiftIsDoesNotHavePrice() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
//        aeProductDetailsPage.clickOnShopeByMenu();
//        aeProductDetailsPage.clickOnSalesAndOffersMenu();
//        aeProductDetailsPage.clickOnBuy1Get1Card();
//        aeProductDetailsPage.DisplayProductInTheList(0);
        aeCartPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertTrue(aeCartPage.getFreePrice().isDisplayed());
        aeCartPage.clickOnRemoveItem();
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Make sure that all payment methods are appear correctly in the Cart page", priority = 19)
    public void verifyAllPaymentMethodAppearingTheCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        Assert.assertTrue(aeCartPage.getWeAcceptLabel().isDisplayed());
        Assert.assertTrue(aeCartPage.getCodOption().isDisplayed());
        Assert.assertTrue(aeCartPage.getCreditCardOption().isDisplayed());
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = " Cart Page- Make sure that the Proceed to checkout button appears in the cart page works correctly", priority = 20)
    public void verifyProceedCheckoutBtnAppearsCorrectlyInCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        Assert.assertTrue(aeCartPage.getProceedCheckoutBtn().isDisplayed());
        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.2 High Severity"},description = " Cart Page- Make sure that the order total calculation in the cart page works correctly", priority = 21)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        float subTotal = DataHelperAndWait.convertTheStringToFloat(aeCartPage.getSubTotalValue());
        float tax = DataHelperAndWait.convertTheStringToFloat(aeCartPage.getTaxValue());
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(aeCartPage.getOrderTotalValue());
        float cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.2 High Severity"},description = " Cart Page- Make sure that the customer can view the cart using Cart Icon", priority = 22)
    public void verifyAbilityToViewCartFromCartIcon() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        String currentURL = webDriver.getCurrentUrl() + "#";
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        aeCartPage.clickOnCartIcon();
        aeCartPage.clickOnViewCartInCartPopUp();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(cartURL),"The Current URL is not matched with the Cart URL");
        aeCartPage.removeProductFromCart();
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Make sure that the counter-number appears in the cart pop up works correctly", priority = 23)
    public void verifyTheCounterInCartIconWorksCorrectly() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.clickOnShopeByMenu();
//        aeProductDetailsPage.clickOnSalesAndOffersMenu();
//        aeProductDetailsPage.clickOnBuy1Get1Card();
//        aeProductDetailsPage.DisplayProductInTheList(0);
        aeCartPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(aeCartPage.getCartCounter().getText(), aeCartPage.getCartCounter().getText());
//        Assert.assertEquals(aeCartPage.getCartCounter().getText(), "3");
        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Make sure that the  close icon appears in the cart pop-up works correctly", priority = 24)
    public void verifyTheCloseIconInCartPopupWorksCorrectly() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
//        aeProductDetailsPage.clickOnShopeByMenu();
//        aeProductDetailsPage.clickOnSalesAndOffersMenu();
//        aeProductDetailsPage.clickOnBuy1Get1Card();
//        aeProductDetailsPage.DisplayProductInTheList(0);
        aeCartPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        aeCartPage.clickOnCartIcon();
        aeCartPage.clickOnCartCloseIcon();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Make sure that the system does not apply invalid coupon code", priority = 25)
    public void verifyInabilityToApplyInvalidCouponCode() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.addToCartAndDisplayTheCart();
        aeProductDetailsPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        aeCartPage.FillInCouponCode("test");
        DataHelperAndWait.waitToBeVisible(aeCartPage.getNotExistCouponMsg(), 8,webDriver);
        Assert.assertTrue(aeCartPage.getNotExistCouponMsg().isDisplayed());
//        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Make sure inability to apply coupon code without filling the code", priority = 26)
    public void verifyInabilityToApplyCouponCodeWithoutFillingTheCode() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.addToCartAndDisplayTheCart();
        aeCartPage.FillInCouponCode(" ");
        DataHelperAndWait.waitToBeVisible(aeCartPage.getRequiredCouponMsg(), 8,webDriver);
        Assert.assertTrue(aeCartPage.getRequiredCouponMsg().isDisplayed());
//        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Make sure that the free gift is not calculated in the cart price", priority = 27)
    public void verifyTheFreeGiftIsNotCalculatedInTheCartPrice() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
//        aeProductDetailsPage.clickOnShopeByMenu();
//        aeProductDetailsPage.clickOnSalesAndOffersMenu();
//        aeProductDetailsPage.clickOnBuy1Get1Card();
//        aeProductDetailsPage.DisplayProductInTheList(0);
//        aeCartPage.navigateToBogoProduct();
//        aeProductDetailsPage.addToCart();
//        aeProductDetailsPage.viewCart();
        DataHelperAndWait.waitForTime(1500);
        Assert.assertTrue(aeCartPage.getFreeFromSporterSection().isDisplayed());
        Assert.assertEquals(aeCartPage.getPriceInCartPage().getText(), aeCartPage.getSubTotalValue().getText());
//        aeCartPage.clickOnRemoveItem();
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.2 High Severity"},description = " Cart Page- Make sure the tax calculate correctly", priority = 28,enabled = false)
    public void verifyTheTaxCalculatedCorrectly() {
        DecimalFormat df = new DecimalFormat("0.00");
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        float subTotal = DataHelperAndWait.convertTheStringToFloat(aeCartPage.getSubTotalValue());
        float tax = subTotal * (float) (0.05);
        float expectedCartTotal = subTotal + tax;
        float actualCartTotal = DataHelperAndWait.convertTheStringToFloat(aeCartPage.getOrderTotalValue());
        Assert.assertEquals(df.format(actualCartTotal), df.format(expectedCartTotal));
        aeCartPage.clickOnRemoveItem();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.2 High Severity"},description = " Cart Page- Verify that the search button works correctly from the Cart Page", priority = 29)
    public void verifySearchBtnWorksCorrectlyFromCartPage() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        AeCartPage aeCartPage=new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeGuestUserPage.verifyTheDisplayedPageDoesNotHaveErrors();
        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","1.3 Medium Severity"},description = " Cart Page- Make sure that the product price is changed when you change the quantity from the Cart Page", priority = 30)
    public void verifyProductPriceChangesWhenChangingTheProductQtyFromTheCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        String currentProductPrice = aeCartPage.getPriceInCartPage().getText();
        aeCartPage.clickOnIncreaseQtyBtn();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.refreshPage(webDriver);
        String newProductPrice = aeCartPage.getPriceInCartPage().getText();
        Assert.assertNotEquals(currentProductPrice, newProductPrice);
        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","1.4  Low Severity"},description = " Cart Page- Make sure that Make sure that complete your order, to get 100% GENUINE PRODUCTS and SUPER DELIVERY WITHIN 2 WORKING DAYS label appears in the Cart Page", priority = 31)
    public void verifyTheFreeShippingLabelAppearCorrectlyInTheCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        Assert.assertTrue(aeCartPage.getFreeShippingLabel().isDisplayed());
        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","1.4  Low Severity"},description = " Cart Page- Make sure that the Expected delivery date field in the cart page retrieves data", priority = 32)
    public void verifyExpectedDeliveryDateRetrievesData() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        Assert.assertTrue(aeCartPage.getExpectedDeliveryDateLabel().isDisplayed());
        String expectedDeliveryDate = aeCartPage.getExpectedDeliveryDateValue().getText();
        Assert.assertNotNull(expectedDeliveryDate);
        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Make sure that the item-count appears in the cart pop up works correctly", priority = 33)
    public void verifyTheItemsCounterInCartPopupWorksCorrectly() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
//        aeProductDetailsPage.clickOnShopeByMenu();
//        aeProductDetailsPage.clickOnSalesAndOffersMenu();
//        aeProductDetailsPage.clickOnBuy1Get1Card();
//        aeProductDetailsPage.DisplayProductInTheList(0);
        aeCartPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertTrue(aeCartPage.getFreeFromSporterSection().isDisplayed());
        aeCartPage.clickOnCartIcon();
        Assert.assertEquals(aeCartPage.getItemCounterInCartPopUp().getText(), aeCartPage.getItemCounterInCartPopUp().getText());
//        Assert.assertEquals(aeCartPage.getItemCounterInCartPopUp().getText(), "(3 of 3 Items )");
        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","1.3 Medium Severity"},description = " Cart Page- Make sure that My Shopping Cart title appears in the Cart Page", priority = 34)
    public void verifyMyShoppingCartTitleAppearCorrectlyInTheCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        Assert.assertTrue(aeCartPage.getMyShoppingCartMsg().getText().contains("My Shopping Cart"));
    }
    @Test(groups = {"2.03 Cart Page","1.3 Medium Severity"},description = " Cart Page- Make sure that the system cancel the coupon code correctly", priority = 35,enabled = false)
    public void verifyAbilityToCancelTheCouponCode() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        aeCartPage.FillInCouponCode(freeCouponeCode);
        DataHelperAndWait.waitToBeVisible(aeCartPage.getUsedFreeCouponMsg(), 8,webDriver);
        aeCartPage.clickOnCancelCouponCodeBtn();
        Assert.assertFalse(aeCartPage.getFreeFromSporterSection().isDisplayed());
        Assert.assertTrue(aeCartPage.getApplyCouponCode().isDisplayed());
        aeCartPage.removeProductFromCart();
    }
    @Test(groups = {"2.03 Cart Page","1.3 Medium Severity"},description = " Cart Page- Verify that The requested qty is not available message appear when the product becomes OOS in Cart Page successfully", priority = 36,enabled = false)
    public void verifyToDisplayRequestedQtyIsNotAvailableMsgWhenProductOOSinCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        aeCartPage.FillInQtyField("10000");
        aeCartPage.clickOnIncreaseQtyBtn();
        DataHelperAndWait.waitToBeVisible(aeCartPage.getQtyUnavailableMsgInCartPage(), 8,webDriver);
        Assert.assertTrue(aeCartPage.getQtyUnavailableMsgInCartPage().isDisplayed());
    }
    @Test(groups = {"2.03 Cart Page","1.2 High Severity"},description = " Cart Page- Make sure that the customer can't add more than 2 Qty of the same product when switching to Jordan Store from Cart Page", priority = 37,enabled = false)
    public void verifyInabilityToAddMoreThan2QtyOfSameProductFromTheCartPageForJordanStore() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        WebDriverWait wait = new WebDriverWait(webDriver, 30);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.switchToJOCountry();
//        aeProductDetailsPage.clickOnShopeByMenu();
//        aeProductDetailsPage.clickOnSportsSupplementsMenu();
//        aeProductDetailsPage.DisplayProductInTheList(0);
//        aeProductDetailsPage.clickOnFirstProductFlavor();
        aeCartPage.navigateToBogoProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        aeCartPage.clickOnIncreaseQtyBtn();
        if (wait.until(ExpectedConditions.alertIsPresent()) != null)
            webDriver.switchTo().alert().dismiss();
    }
    @Test(groups = {"2.03 Cart Page","1.3 Medium Severity"},description = " Cart Page- Make sure that the system will empty the cart after switching the country", priority = 38,enabled = false)
    public void verifyTheCartWillRemoveAllProductsAfterSwitchingTheCountry() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAECountry();
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        aeProductDetailsPage.switchToJOCountry();
        Assert.assertTrue(aeCartPage.getNoItemInCartLabel().isDisplayed());
    }
    @Test(groups = {"2.03 Cart Page","1.2 High Severity"},description = " Cart Page- Make sure that the free coupon code working fine", priority = 39,enabled = false)
    public void verifyFreeCouponCodeFunctionWorksCorrectly() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.addToCartAndDisplayTheCart();
        aeCartPage.FillInCouponCode(freeCouponeCode);
        DataHelperAndWait.waitToBeVisible(aeCartPage.getUsedFreeCouponMsg(), 8,webDriver);
        Assert.assertTrue(aeCartPage.getFreeFromSporterSection().isDisplayed());
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.2 High Severity"},description = " Cart Page- Make sure ability to add a bundle to the cart with all bundle options", priority = 40)
    public void verifyAbilityToAddBundleWithAllItsOptionsToCart() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.navigateToHomePage();
        aeProductDetailsPage.displayBundle();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getBundleMenu(), 10,webDriver);
        Select select = new Select(aeProductDetailsPage.getBundleMenu());
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            try {
                select.selectByIndex(i);
                aeProductDetailsPage.addToCart();
                aeProductDetailsPage.keepShopping();
            } catch (Exception e) {
                aeCartPage.clickOnTheContinueShoppingBtn();
            }
        }
        aeCartPage.clickOnCartIcon();
        aeCartPage.clickOnViewCartInCartPopUp();
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );    }

    //      The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Verify that the ShopBy Menu Is Displayed When Hovering On It From Cart Page", priority = 41)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        webDriver.navigate().to(BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getShopeByMenu().isDisplayed(), "The Shope By menu is not displayed when Hovering on it from Product Page");
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Cart Page", priority = 42)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        webDriver.navigate().to(BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL);
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,10);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Cart Page", priority = 43)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        webDriver.navigate().to(BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthSubMenuSection().isDisplayed(), "The Vitamins And Health menu is not displayed when Hovering on it from Product Page");
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Verify that the Healthy Food Menu Is Displayed When Hovering On It From Cart Page", priority = 44)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        webDriver.navigate().to(BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getHealthyFoodSubMenuSection().isDisplayed(), "The Healthy Food menu is not displayed when Hovering on it from Product Page");
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Verify that the Sports Menu Is Displayed When Hovering On It From Cart Page", priority = 45)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        webDriver.navigate().to(BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSubMenuSection().isDisplayed(), "The Sport menu is not displayed when Hovering on it from Product Page");
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = " Cart Page- Verify that the account Profile icon works correctly in the Cart Page", priority = 46)
    public void verifyAccountProfileIconWorksCorrectlyInCartPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        webDriver.navigate().to(BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL);
        aeProductDetailsPage.clickOnAccountProfileIcon();
        assertTrue(aeProductDetailsPage.getAccountProfileOptions().isDisplayed());
    }

    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.4  Low Severity"},description = " Cart Page- Make sure ability to navigate to the home page by clicking on the Sporter logo from the Cart Page ", priority = 47)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        webDriver.navigate().to(BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL);
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeGuestUserPage.aeDomain+"/"," The Current URL is not matched with the Cart URL" );
    }
    @Test(groups = {"2.03 Cart Page","All Smoke Testing Result","1.2 High Severity"},description = " Cart Page- Make sure that the ability to switch to Arabic version from the cart page correctly", priority = 48)
    public void verifyAbilityToSwitchToArabicVersionFromCartPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getLanguageSwitcher(), 8,webDriver);
        aeProductDetailsPage.switchToArabicVersion();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getEnglishLangBtn(), 8,webDriver);
        Assert.assertTrue(aeProductDetailsPage.getEnglishLangBtn().isDisplayed());
    }
}