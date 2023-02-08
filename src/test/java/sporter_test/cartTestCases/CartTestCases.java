/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription CartTestCases
 */

package sporter_test.cartTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.productPage.ProductDetailsPage;

@Test(groups = "2.06 Cart Page")

public class CartTestCases extends BaseTest {
    String itemsCounter;
    @Test(groups = {"Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure to view the cart from PDP after adding  product to it", priority = 1)
    public void viewCartFromPDP() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL,webDriver);
    }
    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the product counter that appears in the cart page works correctly", priority = 2)
    public void verifyProductCounterAppearsInTheCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        itemsCounter = "(1 Items)";
        WebElementsAssertion.assertionTextIsEqual(cartPage.getItemsCounter(),webDriver,itemsCounter);
    }
    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the counter-number appears in the cart icon works correctly", priority = 3)
    public void verifyTheCounterInCartIconWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        WebElementsAssertion.assertionTextIsEqual(cartPage.getCartCounter(),webDriver,"1");
    }
    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the counter-number appears inside the cart pop-up works correctly", priority = 4)
    public void verifyTheCounterInsideCartPopUpWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        itemsCounter = "(1 Of 1 Items )";
        WebElementsAssertion.assertionTextIsEqual(cartPage.getItemCounterInCartPopUp(), webDriver, itemsCounter);
        cartPage.removeItem();
    }
    //TODO: This test case should be revisit after solving: https://sporter1.atlassian.net/browse/NS-120 & https://sporter1.atlassian.net/browse/NS-42
    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the Free Gift is removed from the cart when you remove the product", priority = 4)
    public void verifyTheFreeGiftIsRemovedWhenRemovingTheProduct() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToBogoToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getFreePrice(),webDriver);
        cartPage.removeItem();
    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Verify ability to remove the product from the cart successfully", priority = 5)
//    public void verifyAbilityToRemoveProductFromCart() {
//        CartPage cartPage=new CartPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(productDetailsPage.cartURL) );
//        cartPage.clickOnRemoveItem();
//        Assert.assertTrue(cartPage.getNoItemInCartLabel().isDisplayed());
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Verify that Here Link appear after clearing the items from the Cart works successfully", priority = 6)
//    public void verifyHereLinkInCartPageWorking() {
//        CartPage cartPage = new CartPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
////        productDetailsPage.displayTheProduct();
////        productDetailsPage.addToCart();
////        productDetailsPage.viewCart();
////        cartPage.clickOnRemoveItem();
////        this.verifyAbilityToRemoveProductFromCart();
//        DataHelperAndWait.isDisplayed(cartPage.getHereLink() ,webDriver);
//        cartPage.clickOnHereLink();
//        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +cartPage.aeDomain+"/", "The Current URL is not matched with the AE Site URL");
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the product counter that appears in the cart page counts the free gift correctly", priority = 7)
//    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts() {
//        CartPage cartPage = new CartPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.increaseTheQuantity();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
////                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
////                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        String itemsCounter = "(4 Items)";
//        DataHelperAndWait.waitToBeVisible(cartPage.getItemsCounterInCartPage() ,webDriver);
//        Assert.assertEquals(cartPage.getItemsCounterInCartPage().getText(), itemsCounter);
//        cartPage.clickOnRemoveItem();
//        cartPage.clickOnRemoveItem();
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure to view the cart after adding more than quantity for the same product", priority = 8)
//    public void verifyAbilityToViewTheCartAfterAddingMoreThanQtyOfProduct() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
//        cartPage.removeProductFromCart();
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.increaseTheQuantity();
//        Assert.assertEquals(productDetailsPage.getQuantityField().getAttribute("value"), "2");
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        DataHelperAndWait.waitForUrlContains(productDetailsPage.cartURL,webDriver );
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(productDetailsPage.cartURL) );
//    cartPage.clickOnRemoveItem();}
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure to view the cart after adding more than products to it", priority = 9)
//    public void verifyAbilityToViewTheCartAfterAddingMoreThanProducts() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
////        productDetailsPage.clickOnShopeByMenu();
////        productDetailsPage.clickOnSalesAndOffersMenu();
////        productDetailsPage.clickOnBuy1Get1Card();
////        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList() ,webDriver);
////        productDetailsPage.DisplayProductInTheList(0);
//        cartPage.navigateToBogoProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.keepShopping();
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        DataHelperAndWait.waitForUrlContains(productDetailsPage.cartURL,webDriver );
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(productDetailsPage.cartURL) );
//    cartPage.clickOnRemoveItem();
//    cartPage.clickOnRemoveItem();
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Adding a config to the cart more than one with different simple in each time", priority = 10)
//    public void verifyAbilityToViewTheCartAfterAddingMoreThanSimpleOfTheSameConfig() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.clickOnFirstsimple();
//        productDetailsPage.addToCart();
//        productDetailsPage.keepShopping();
//        productDetailsPage.clickOnSecondimple();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        String itemsCounter = "(2 Items)";
//        DataHelperAndWait.waitForUrlContains(productDetailsPage.cartURL,webDriver );
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(productDetailsPage.cartURL) );
//        cartPage.clickOnRemoveItem();
//        cartPage.clickOnRemoveItem();
//    }
//
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure ability to add bundle to the Cart", priority = 11)
//    public void verifyAbilityToAddBundleToCart() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage=new CartPage(webDriver);
//        productDetailsPage.searchForBundle();
//        productDetailsPage.clickOnSearchBtn();
//        productDetailsPage.clickOnTheProductCard();
//        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu() ,webDriver);
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        DataHelperAndWait.waitForUrlContains(productDetailsPage.cartURL,webDriver );
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(productDetailsPage.cartURL) );
//        cartPage.clickOnRemoveItem();
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Verify that the The requested qty is not available message appear when the product becomes OOS", priority = 12)
//    public void verifyToDisplayRequestedQtyIsNotAvailableMsg() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.fillInQtyField("10000");
//        productDetailsPage.addToCart();
//        Assert.assertTrue(cartPage.getContinueShoppingBtn().isDisplayed());
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Verify that the ContinueShoppingBtn works correctly when displaying The requested qty is not available message", priority = 13)
//    public void verifyContinueShoppingBtnWorksCorrectlyWhenTheProductBecomeOOS() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
////        productDetailsPage.clickOnProductInHomePage();
////        productDetailsPage.fillInQtyField("500");
//        String currentURL = webDriver.getCurrentUrl();
////        productDetailsPage.addToCart();
//        cartPage.clickOnTheContinueShoppingBtn();
//        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL,"The Current URL is not matched with the Cart URL");
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Verify ability to increase the product quantity from Cart page from the Cart Page works successfully", priority = 14)
//    public void verifyIncreaseQtyBtnInCartPageWorking() {
//        CartPage cartPage = new CartPage(webDriver);
//        AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        DataHelperAndWait.waitToBeClickable(cartPage.getIncreaseQtyBtn() ,webDriver);
//        cartPage.clickOnIncreaseQtyBtn();
//        Assert.assertEquals(cartPage.getQtyField().getAttribute("value"), "2");
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Verify ability to Decrease the product quantity from Cart page from the Cart Page works successfully", priority = 15)
//    public void verifyDecreaseQtyBtnInCartPageWorking() {
//        CartPage cartPage = new CartPage(webDriver);
//        AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
////        cartPage.addToCartAndDisplayTheCart();
////        DataHelperAndWait.waitToBeClickable(cartPage.getIncreaseQtyBtn() ,webDriver);
////        cartPage.clickOnIncreaseQtyBtn();
//        DataHelperAndWait.waitToBeClickable(cartPage.getDecreaseQtyBtn() ,webDriver);
//        cartPage.clickOnDecreaseQtyBtn();
//        Assert.assertEquals(cartPage.getQtyField().getAttribute("value"), "1");
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Verify ability to display the product from the Cart Page works successfully", priority = 16)
//    public void verifyAbilityToDisplayTheProductFromTheCartPage() {
//        CartPage cartPage = new CartPage(webDriver);
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        cartPage.clickOnProductCartInCartPage();
//        Assert.assertNotEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +cartPage.aeDomain, "The Current URL is not matched with the AE Site URL");
//        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the Free Gift is added correctly to the Cart", priority = 17)
//    public void verifyTheFreeGiftIsAddedCorrectlyToTheCart() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
////        productDetailsPage.clickOnShopeByMenu();
////        productDetailsPage.clickOnSalesAndOffersMenu();
////        productDetailsPage.clickOnBuy1Get1Card();
////        productDetailsPage.DisplayProductInTheList(0);
//        cartPage.navigateToBogoProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertTrue(cartPage.getFreeFromSporterSection().isDisplayed());
//        cartPage.clickOnRemoveItem();
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the Free Gift does not have a price", priority = 18)
//    public void verifyTheFreeGiftIsDoesNotHavePrice() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
////        productDetailsPage.clickOnShopeByMenu();
////        productDetailsPage.clickOnSalesAndOffersMenu();
////        productDetailsPage.clickOnBuy1Get1Card();
////        productDetailsPage.DisplayProductInTheList(0);
//        cartPage.navigateToBogoProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertTrue(cartPage.getFreePrice().isDisplayed());
//        cartPage.clickOnRemoveItem();
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 19)
//    public void verifyAllPaymentMethodAppearingTheCartPage() {
//        CartPage cartPage = new CartPage(webDriver);
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        Assert.assertTrue(cartPage.getWeAcceptLabel().isDisplayed());
//        Assert.assertTrue(cartPage.getCodOption().isDisplayed());
//        Assert.assertTrue(cartPage.getCreditCardOption().isDisplayed());
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure that the Proceed to checkout button appears in the cart page works correctly", priority = 20)
//    public void verifyProceedCheckoutBtnAppearsCorrectlyInCartPage() {
//        CartPage cartPage = new CartPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL );
//        Assert.assertTrue(cartPage.getProceedCheckoutBtn().isDisplayed());
//        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 21)
//    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
//        CartPage cartPage = new CartPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL );
//        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue());
//        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue());
//        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue());
//        float cartTotal = subTotal + tax;
//        Assert.assertEquals(orderTotal, cartTotal);
//        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the customer can view the cart using Cart Icon", priority = 22)
//    public void verifyAbilityToViewCartFromCartIcon() {
//        CartPage cartPage = new CartPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        String currentURL = webDriver.getCurrentUrl() + "#";
//        productDetailsPage.addToCart();
//        productDetailsPage.keepShopping();
//        cartPage.clickOnCartIcon();
//        cartPage.clickOnViewCartInCartPopUp();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(cartURL),"The Current URL is not matched with the Cart URL");
//        cartPage.removeProductFromCart();
//    }
//

//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the  close icon appears in the cart pop-up works correctly", priority = 24)
//    public void verifyTheCloseIconInCartPopupWorksCorrectly() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
////        productDetailsPage.clickOnShopeByMenu();
////        productDetailsPage.clickOnSalesAndOffersMenu();
////        productDetailsPage.clickOnBuy1Get1Card();
////        productDetailsPage.DisplayProductInTheList(0);
//        cartPage.navigateToBogoProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        cartPage.clickOnCartIcon();
//        cartPage.clickOnCartCloseIcon();
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the system does not apply invalid coupon code", priority = 25)
//    public void verifyInabilityToApplyInvalidCouponCode() {
//        CartPage cartPage = new CartPage(webDriver);
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
////        cartPage.addToCartAndDisplayTheCart();
//        productDetailsPage.navigateToBogoProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        cartPage.FillInCouponCode("test");
//        DataHelperAndWait.waitToBeVisible(cartPage.getNotExistCouponMsg() ,webDriver);
//        Assert.assertTrue(cartPage.getNotExistCouponMsg().isDisplayed());
////        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure inability to apply coupon code without filling the code", priority = 26)
//    public void verifyInabilityToApplyCouponCodeWithoutFillingTheCode() {
//        CartPage cartPage = new CartPage(webDriver);
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
////        cartPage.addToCartAndDisplayTheCart();
//        cartPage.FillInCouponCode(" ");
//        DataHelperAndWait.waitToBeVisible(cartPage.getRequiredCouponMsg() ,webDriver);
//        Assert.assertTrue(cartPage.getRequiredCouponMsg().isDisplayed());
////        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the free gift is not calculated in the cart price", priority = 27)
//    public void verifyTheFreeGiftIsNotCalculatedInTheCartPrice() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
////        productDetailsPage.clickOnShopeByMenu();
////        productDetailsPage.clickOnSalesAndOffersMenu();
////        productDetailsPage.clickOnBuy1Get1Card();
////        productDetailsPage.DisplayProductInTheList(0);
////        cartPage.navigateToBogoProduct();
////        productDetailsPage.addToCart();
////        productDetailsPage.viewCart();
//        Assert.assertTrue(cartPage.getFreeFromSporterSection().isDisplayed());
//        Assert.assertEquals(cartPage.getPriceInCartPage().getText(), cartPage.getSubTotalValue().getText());
////        cartPage.clickOnRemoveItem();
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure the tax calculate correctly", priority = 28)
//    public void verifyTheTaxCalculatedCorrectly() {
//        DecimalFormat df = new DecimalFormat("0.00");
//        CartPage cartPage = new CartPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL );
//        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue());
//        float tax = subTotal * (float) (0.05);
//        float expectedCartTotal = subTotal + tax;
//        float actualCartTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue());
//        Assert.assertEquals(df.format(actualCartTotal), df.format(expectedCartTotal));
//        cartPage.clickOnRemoveItem();
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Verify that the search button works correctly from the Cart Page", priority = 29)
//    public void verifySearchBtnWorksCorrectlyFromCartPage() {
//        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
//        CartPage cartPage=new CartPage(webDriver);
//        AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        productDetailsPage.searchForBundle();
//        productDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        aeGuestUserPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the product price is changed when you change the quantity from the Cart Page", priority = 30)
//    public void verifyProductPriceChangesWhenChangingTheProductQtyFromTheCartPage() {
//        CartPage cartPage = new CartPage(webDriver);
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        String currentProductPrice = cartPage.getPriceInCartPage().getText();
//        cartPage.clickOnIncreaseQtyBtn();
//        DataHelperAndWait.refreshPage(webDriver);
//        String newProductPrice = cartPage.getPriceInCartPage().getText();
//        Assert.assertNotEquals(currentProductPrice, newProductPrice);
//        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","1.4 Low Severity"},description = "{{CountryName}}: Make sure that Make sure that complete your order, to get 100% GENUINE PRODUCTS and SUPER DELIVERY WITHIN 2 WORKING DAYS label appears in the Cart Page", priority = 31)
//    public void verifyTheFreeShippingLabelAppearCorrectlyInTheCartPage() {
//        CartPage cartPage = new CartPage(webDriver);
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        Assert.assertTrue(cartPage.getFreeShippingLabel().isDisplayed());
//        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the Expected delivery date field in the cart page retrieves data", priority = 32)
//    public void verifyExpectedDeliveryDateRetrievesData() {
//        CartPage cartPage = new CartPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL );
//        Assert.assertTrue(cartPage.getExpectedDeliveryDateLabel().isDisplayed());
//        String expectedDeliveryDate = cartPage.getExpectedDeliveryDateValue().getText();
//        Assert.assertNotNull(expectedDeliveryDate);
//        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the item-count appears in the cart pop up works correctly", priority = 33)
//    public void verifyTheItemsCounterInCartPopupWorksCorrectly() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
////        productDetailsPage.clickOnShopeByMenu();
////        productDetailsPage.clickOnSalesAndOffersMenu();
////        productDetailsPage.clickOnBuy1Get1Card();
////        productDetailsPage.DisplayProductInTheList(0);
//        cartPage.navigateToBogoProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertTrue(cartPage.getFreeFromSporterSection().isDisplayed());
//        cartPage.clickOnCartIcon();
//        Assert.assertEquals(cartPage.getItemCounterInCartPopUp().getText(), "(2 of 2 Items )");
//        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that My Shopping Cart title appears in the Cart Page", priority = 34)
//    public void verifyMyShoppingCartTitleAppearCorrectlyInTheCartPage() {
//        CartPage cartPage = new CartPage(webDriver);
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        Assert.assertTrue(cartPage.getMyShoppingCartMsg().getText().contains("My Shopping Cart"));
//    }
//    @Test(groups = {"Cart Page","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the system cancel the coupon code correctly", priority = 35,enabled = false)
//    public void verifyAbilityToCancelTheCouponCode() {
//        CartPage cartPage = new CartPage(webDriver);
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        cartPage.FillInCouponCode(freeCouponeCode);
//        DataHelperAndWait.waitToBeVisible(cartPage.getUsedFreeCouponMsg() ,webDriver);
//        cartPage.clickOnCancelCouponCodeBtn();
//        Assert.assertFalse(cartPage.getFreeFromSporterSection().isDisplayed());
//        Assert.assertTrue(cartPage.getApplyCouponCode().isDisplayed());
//        cartPage.removeProductFromCart();
//    }
//    @Test(groups = {"Cart Page","1.3 Medium Severity"},description = "{{CountryName}}: Verify that The requested qty is not available message appear when the product becomes OOS in Cart Page successfully", priority = 36,enabled = false)
//    public void verifyToDisplayRequestedQtyIsNotAvailableMsgWhenProductOOSinCartPage() {
//        CartPage cartPage = new CartPage(webDriver);
//        AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        cartPage.FillInQtyField("10000");
//        cartPage.clickOnIncreaseQtyBtn();
//        DataHelperAndWait.waitToBeVisible(cartPage.getQtyUnavailableMsgInCartPage() ,webDriver);
//        Assert.assertTrue(cartPage.getQtyUnavailableMsgInCartPage().isDisplayed());
//    }
//    @Test(groups = {"Cart Page","1.2 High Severity"},description = "{{CountryName}}: Make sure that the customer can't add more than 2 Qty of the same product when switching to Jordan Store from Cart Page", priority = 37,enabled = false)
//    public void verifyInabilityToAddMoreThan2QtyOfSameProductFromTheCartPageForJordanStore() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        WebDriverWait wait = new WebDriverWait(webDriver, 30);
//        CartPage cartPage = new CartPage(webDriver);
//        productDetailsPage.switchToJOCountry();
////        productDetailsPage.clickOnShopeByMenu();
////        productDetailsPage.clickOnSportsSupplementsMenu();
////        productDetailsPage.DisplayProductInTheList(0);
////        productDetailsPage.clickOnFirstProductFlavor();
//        cartPage.navigateToBogoProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        cartPage.clickOnIncreaseQtyBtn();
//        if (wait.until(ExpectedConditions.alertIsPresent()) != null)
//            webDriver.switchTo().alert().dismiss();
//    }
//    @Test(groups = {"Cart Page","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the system will empty the cart after switching the country", priority = 38,enabled = false)
//    public void verifyTheCartWillRemoveAllProductsAfterSwitchingTheCountry() {
//        CartPage cartPage = new CartPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.switchToAECountry();
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL );
//        productDetailsPage.switchToJOCountry();
//        Assert.assertTrue(cartPage.getNoItemInCartLabel().isDisplayed());
//    }
//    @Test(groups = {"Cart Page","1.2 High Severity"},description = "{{CountryName}}: Make sure that the free coupon code working fine", priority = 39,enabled = false)
//    public void verifyFreeCouponCodeFunctionWorksCorrectly() {
//        CartPage cartPage = new CartPage(webDriver);
//                AeProductDetailsPage aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        cartPage.FillInCouponCode(freeCouponeCode);
//        DataHelperAndWait.waitToBeVisible(cartPage.getUsedFreeCouponMsg() ,webDriver);
//        Assert.assertTrue(cartPage.getFreeFromSporterSection().isDisplayed());
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure ability to add a bundle to the cart with all bundle options", priority = 40)
//    public void verifyAbilityToAddBundleWithAllItsOptionsToCart() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
//        productDetailsPage.navigateToHomePage();
//        productDetailsPage.searchForBundle();
//        productDetailsPage.clickOnSearchBtn();
//        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductCard() ,webDriver);
//        productDetailsPage.clickOnTheProductCard();
//        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu() ,webDriver);
//        Select select = new Select(productDetailsPage.getBundleMenu());
//        List<WebElement> elementCount = select.getOptions();
//        int menuSize = elementCount.size();
//        for (int i = 0; i < menuSize; i++) {
//            try {
//                select.selectByIndex(i);
//                productDetailsPage.addToCart();
//                productDetailsPage.keepShopping();
//            } catch (Exception e) {
//                cartPage.clickOnTheContinueShoppingBtn();
//            }
//        }
//        cartPage.clickOnCartIcon();
//        cartPage.clickOnViewCartInCartPopUp();
//        DataHelperAndWait.waitForUrlContains(productDetailsPage.cartURL,webDriver );
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(productDetailsPage.cartURL) );    }
//
//    //      The following Test Cases handle displaying the Mega Menu from Product Page
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Verify that the ShopBy Menu Is Displayed When Hovering On It From Cart Page", priority = 41)
//    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromCartPage() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        action = new Actions(webDriver);
//        webDriver.navigate().to(BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL);
//        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
//        Assert.assertTrue(aeMegamenuPage.getShopeByMenu().isDisplayed(), "The Shope By menu is not displayed when Hovering on it from Product Page");
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Cart Page", priority = 42)
//    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromCartPage() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        action = new Actions(webDriver);
//        webDriver.navigate().to(BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL);
//        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
//        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Cart Page", priority = 43)
//    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromCartPage() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        action = new Actions(webDriver);
//        webDriver.navigate().to(BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL);
//        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
//        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthSubMenuSection().isDisplayed(), "The Vitamins And Health menu is not displayed when Hovering on it from Product Page");
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Verify that the Healthy Food Menu Is Displayed When Hovering On It From Cart Page", priority = 44)
//    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromCartPage() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        action = new Actions(webDriver);
//        webDriver.navigate().to(BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL);
//        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
//        Assert.assertTrue(aeMegamenuPage.getHealthyFoodSubMenuSection().isDisplayed(), "The Healthy Food menu is not displayed when Hovering on it from Product Page");
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Verify that the Sports Menu Is Displayed When Hovering On It From Cart Page", priority = 45)
//    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromCartPage() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        action = new Actions(webDriver);
//        webDriver.navigate().to(BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL);
//        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
//        Assert.assertTrue(aeMegamenuPage.getSportsSubMenuSection().isDisplayed(), "The Sport menu is not displayed when Hovering on it from Product Page");
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Verify that the account Profile icon works correctly in the Cart Page", priority = 46)
//    public void verifyAccountProfileIconWorksCorrectlyInCartPage() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        webDriver.navigate().to(BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL);
//        productDetailsPage.clickOnAccountProfileIcon();
//        assertTrue(productDetailsPage.getAccountProfileOptions().isDisplayed());
//    }
//
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure ability to navigate to the home page by clicking on the Sporter logo from the Cart Page ", priority = 47)
//    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
//        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        webDriver.navigate().to(BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL);
//        aeGuestUserPage.clickOnSporterLogo();
//        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeGuestUserPage.aeDomain+"/"," The Current URL is not matched with the Cart URL" );
//    }
//    @Test(groups = {"Cart Page","All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the ability to switch to Arabic version from the cart page correctly", priority = 48)
//    public void verifyAbilityToSwitchToArabicVersionFromCartPage() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.viewCart();
//        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL );
//        DataHelperAndWait.waitToBeVisible(productDetailsPage.getLanguageSwitcher() ,webDriver);
//        productDetailsPage.switchToArabicVersion();
//        DataHelperAndWait.waitToBeVisible(productDetailsPage.getEnglishLangBtn() ,webDriver);
//        Assert.assertTrue(productDetailsPage.getEnglishLangBtn().isDisplayed());
//    }
}
