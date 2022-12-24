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
import org.testng.annotations.Test;
import sporter_pages.*;

import java.text.DecimalFormat;
import java.util.List;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AeCartTestCases extends BaseTest {
    Actions action;
    @Test(description = "Sports Category- Switching to UAE store", priority = 1)
    public void switchToUaeStore(){
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.switchToAECountry();
    }
    @Test(description = "Make sure to view the cart from PDP after adding  product to it", priority = 2)
    public void viewCartFromPDP() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );
    }

    @Test(description = "Make sure to view the cart after adding more than quantity for the same product", priority = 3)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanQtyOfProduct() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.increaseTheQuantity();
        Assert.assertEquals(aeProductDetailsPage.getQuantityField().getAttribute("value"), "2");
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );    }

    @Test(description = "Make sure to view the cart after adding more than products to it", priority = 4)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanProducts() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSalesAndOffersMenu();
        aeProductDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getFirstProductInTheCategoryList(), 5,webDriver);
        aeProductDetailsPage.DisplayProductInTheList(3);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSalesAndOffersMenu();
        aeProductDetailsPage.clickOnBuy1Get1Card();
        aeProductDetailsPage.DisplayProductInTheList(4);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );    }

    @Test(description = "Adding a config to the cart more than one with different simple in each time", priority = 5)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanSimpleOfTheSameConfig() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSportsSupplementsMenu();
        aeProductDetailsPage.DisplayProductInTheList(0);
        aeProductDetailsPage.clickOnFirstProductFlavor();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        aeProductDetailsPage.clickOnSecondProductFlavor();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        String itemsCounter = "(3 Items)";
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );    }

    @Test(description = "Make sure ability to add bundle to the Cart", priority = 6)
    public void verifyAbilityToAddBundleToCart() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.clickOnSearchBtn();
        aeProductDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getBundleMenu(), 5,webDriver);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.cartURL,webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.cartURL) );    }

    @Test(description = "Make sure ability to add a bundle to the cart with all bundle options", priority = 7)
    public void verifyAbilityToAddBundleWithAllItsOptionsToCart() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.clickOnSearchBtn();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getProductCard(), 5,webDriver);
        aeProductDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getBundleMenu(), 5,webDriver);
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

    @Test(description = "Verify that the The requested qty is not available message appear when the product becomes OOS", priority = 8)
    public void verifyToDisplayRequestedQtyIsNotAvailableMsg() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.clickOnProductInHomePage();
        aeProductDetailsPage.fillInQtyField("500");
        aeProductDetailsPage.addToCart();
        Assert.assertTrue(aeCartPage.getContinueShoppingBtn().isDisplayed());
    }

    @Test(description = "Verify that the ContinueShoppingBtn works correctly when displaying The requested qty is not available message", priority = 9)
    public void verifyContinueShoppingBtnWorksCorrectlyWhenTheProductBecomeOOS() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.clickOnProductInHomePage();
        aeProductDetailsPage.fillInQtyField("500");
        String currentURL = webDriver.getCurrentUrl();
        aeProductDetailsPage.addToCart();
        aeCartPage.clickOnTheContinueShoppingBtn();
        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL,"The Current URL is not matched with the Cart URL");
    }

    @Test(description = "Verify ability to remove the product from the cart successfully", priority = 10)
    public void verifyAbilityToRemoveProductFromCart() {
        AeCartPage aeCartPage=new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        aeCartPage.clickOnRemoveItem();
        DataHelperAndWait.isDisplayed(aeCartPage.getNoItemInCartLabel(), 5,webDriver);
        Assert.assertTrue(aeCartPage.getNoItemInCartLabel().isDisplayed());
    }

    @Test(description = "Verify that Here Link appear after clearing the items from the Cart works successfully", priority = 11)
    public void verifyHereLinkInCartPageWorking() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.verifyAbilityToRemoveProductFromCart();
        DataHelperAndWait.isDisplayed(aeCartPage.getHereLink(), 5,webDriver);
        aeCartPage.clickOnHereLink();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+aeCartPage.aeDomain, "The Current URL is not matched with the AE Site URL");
    }

    @Test(description = "Verify ability to increase the product quantity from Cart page from the Cart Page works successfully", priority = 12)
    public void verifyIncreaseQtyBtnInCartPageWorking() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        DataHelperAndWait.waitToBeClickable(aeCartPage.getIncreaseQtyBtn(), 5,webDriver);
        aeCartPage.clickOnIncreaseQtyBtn();
        Assert.assertEquals(aeCartPage.getQtyField().getAttribute("value"), "2");
    }

    @Test(description = "Verify ability to Decrease the product quantity from Cart page from the Cart Page works successfully", priority = 13)
    public void verifyDecreaseQtyBtnInCartPageWorking() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        DataHelperAndWait.waitToBeClickable(aeCartPage.getIncreaseQtyBtn(), 5,webDriver);
        aeCartPage.clickOnIncreaseQtyBtn();
        DataHelperAndWait.waitToBeClickable(aeCartPage.getDecreaseQtyBtn(), 5,webDriver);
        aeCartPage.clickOnDecreaseQtyBtn();
        Assert.assertEquals(aeCartPage.getQtyField().getAttribute("value"), "1");
    }

    @Test(description = "Verify that The requested qty is not available message appear when the product becomes OOS in Cart Page successfully", priority = 14)
    public void verifyToDisplayRequestedQtyIsNotAvailableMsgWhenProductOOSinCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.verifyAbilityToAddBundleToCart();
        aeCartPage.FillInQtyField("500");
        aeCartPage.clickOnIncreaseQtyBtn();
        DataHelperAndWait.waitToBeVisible(aeCartPage.getQtyUnavailableMsgInCartPage(), 5,webDriver);
        Assert.assertTrue(aeCartPage.getQtyUnavailableMsgInCartPage().isDisplayed());
    }

    @Test(description = "Verify ability to display the product from the Cart Page works successfully", priority = 15)
    public void verifyAbilityToDisplayTheProductFromTheCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        aeCartPage.clickOnProductCartInCartPage();
        Assert.assertNotEquals(webDriver.getCurrentUrl(), BasePage.siteURL+aeCartPage.aeDomain, "The Current URL is not matched with the AE Site URL");
    }

    @Test(description = "Make sure that the product price is changed when you change the quantity from the Cart Page", priority = 16)
    public void verifyProductPriceChangesWhenChangingTheProductQtyFromTheCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        String currentProductPrice = aeCartPage.getPriceInCartPage().getText();
        aeCartPage.clickOnIncreaseQtyBtn();
        DataHelperAndWait.refreshPage(webDriver);
        String newProductPrice = aeCartPage.getPriceInCartPage().getText();
        Assert.assertNotEquals(currentProductPrice, newProductPrice);
    }

    @Test(description = "Make sure that the customer can't add more than 2 Qty of the same product when switching to Jordan Store from Cart Page", priority = 17)
    public void verifyInabilityToAddMoreThan2QtyOfSameProductFromTheCartPageForJordanStore() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        WebDriverWait wait = new WebDriverWait(webDriver, 30);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.switchToJOCountry();
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSportsSupplementsMenu();
        aeProductDetailsPage.DisplayProductInTheList(0);
        aeProductDetailsPage.clickOnFirstProductFlavor();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        aeCartPage.clickOnIncreaseQtyBtn();
        if (wait.until(ExpectedConditions.alertIsPresent()) != null)
            webDriver.switchTo().alert().dismiss();
    }

    @Test(description = "Make sure that the Free Gift is added correctly to the Cart", priority = 18)
    public void verifyTheFreeGiftIsAddedCorrectlyToTheCart() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.switchToAECountry();
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSalesAndOffersMenu();
        aeProductDetailsPage.clickOnBuy1Get1Card();
        aeProductDetailsPage.DisplayProductInTheList(3);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertTrue(aeCartPage.getFreeFromSporterSection().isDisplayed());
    }

    @Test(description = "Make sure that the Free Gift does not have a price", priority = 19)
    public void verifyTheFreeGiftIsDoesNotHavePrice() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSalesAndOffersMenu();
        aeProductDetailsPage.clickOnBuy1Get1Card();
        aeProductDetailsPage.DisplayProductInTheList(3);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertTrue(aeCartPage.getFreePrice().isDisplayed());
    }

    @Test(description = "Make sure that the Free Gift is removed from the cart when you remove the product", priority = 20)
    public void verifyTheFreeGiftIsRemovedWhenRemovingTheProduct() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSalesAndOffersMenu();
        aeProductDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getFirstProductInTheCategoryList(), 5,webDriver);
        aeProductDetailsPage.DisplayProductInTheList(3);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertTrue(aeCartPage.getFreePrice().isDisplayed());
        aeCartPage.clickOnRemoveItem();
        DataHelperAndWait.isDisplayed(aeCartPage.getNoItemInCartLabel(), 5,webDriver);
        Assert.assertTrue(aeCartPage.getNoItemInCartLabel().isDisplayed());
    }

    @Test(description = "Make sure that all payment methods are appear correctly in the Cart page", priority = 21)
    public void verifyAllPaymentMethodAppearingTheCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        Assert.assertTrue(aeCartPage.getWeAcceptLabel().isDisplayed());
        Assert.assertTrue(aeCartPage.getCodOption().isDisplayed());
        Assert.assertTrue(aeCartPage.getCreditCardOption().isDisplayed());
    }

    @Test(description = "Make sure that Make sure that complete your order, to get 100% GENUINE PRODUCTS and SUPER DELIVERY WITHIN 2 WORKING DAYS label appears in the Cart Page", priority = 22)
    public void verifyTheFreeShippingLabelAppearCorrectlyInTheCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        Assert.assertTrue(aeCartPage.getFreeShippingLabel().isDisplayed());
    }

    @Test(description = "Make sure that the product counter that appears in the cart page works correctly", priority = 23)
    public void verifyProductCounterAppearsInTheCartPageWorksCorrectly() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSportsSupplementsMenu();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getFirstProductInTheCategoryList(), 5,webDriver);
        aeProductDetailsPage.DisplayProductInTheList(0);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSportsSupplementsMenu();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getFirstProductInTheCategoryList(), 5,webDriver);
        aeProductDetailsPage.DisplayProductInTheList(4);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        String itemsCounter = "(2 Items)";
        DataHelperAndWait.waitToBeVisible(aeCartPage.getItemsCounterInCartPage(), 5,webDriver);
        Assert.assertEquals(aeCartPage.getItemsCounterInCartPage().getText(), itemsCounter);
    }

    @Test(description = "Make sure that the product counter that appears in the cart page counts the free gift correctly", priority = 24)
    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSalesAndOffersMenu();
        aeProductDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getFirstProductInTheCategoryList(), 5,webDriver);
        aeProductDetailsPage.DisplayProductInTheList(3);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSalesAndOffersMenu();
        aeProductDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getFirstProductInTheCategoryList(), 5,webDriver);
        aeProductDetailsPage.DisplayProductInTheList(3);
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        String itemsCounter = "(4 Items)";
        DataHelperAndWait.waitToBeVisible(aeCartPage.getItemsCounterInCartPage(), 5,webDriver);
        Assert.assertEquals(aeCartPage.getItemsCounterInCartPage().getText(), itemsCounter);
    }

    @Test(description = "Make sure that the Expected delivery date field in the cart page retrieves data", priority = 25)
    public void verifyExpectedDeliveryDateRetrievesData() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        Assert.assertTrue(aeCartPage.getExpectedDeliveryDateLabel().isDisplayed());
        String expectedDeliveryDate = aeCartPage.getExpectedDeliveryDateValue().getText();
        Assert.assertNotNull(expectedDeliveryDate);
    }

    @Test(description = "Make sure that theProceed to checkout button appears in the cart page works correctly", priority = 26)
    public void verifyProceedCheckoutBtnAppearsCorrectlyInCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        Assert.assertTrue(aeCartPage.getProceedCheckoutBtn().isDisplayed());
    }

    @Test(description = "Make sure that the system will empty the cart after switching the country", priority = 27)
    public void verifyTheCartWillRemoveAllProductsAfterSwitchingTheCountry() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        aeProductDetailsPage.switchToJOCountry();
        Assert.assertTrue(aeCartPage.getNoItemInCartLabel().isDisplayed());
    }



    @Test(description = "Make sure that the order total calculation in the cart page works correctly", priority = 28)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );        float subTotal = DataHelperAndWait.convertTheStringToFloat(aeCartPage.getSubTotalValue());
        float tax = DataHelperAndWait.convertTheStringToFloat(aeCartPage.getTaxValue());
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(aeCartPage.getOrderTotalValue());
        float cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
    }

    @Test(description = "Make sure that the customer can view the cart using Cart Icon", priority = 29)
    public void verifyAbilityToViewCartFromCartIcon() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        String currentURL = webDriver.getCurrentUrl() + "#";
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL);
        aeCartPage.clickOnCartIcon();
        aeCartPage.clickOnViewCartInCartPopUp();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+cartURL,"The Current URL is not matched with the Cart URL");
    }

    @Test(description = "Make sure that the counter-number appears in the cart pop up works correctly", priority = 30)
    public void verifyTheCounterInCartIconWorksCorrectly() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.verifyTheFreeGiftIsAddedCorrectlyToTheCart();
        Assert.assertEquals(aeCartPage.getCartCounter().getText(), "2");
    }

    @Test(description = "Make sure that the item-count appears in the cart pop up works correctly", priority = 31)
    public void verifyTheItemsCounterInCartPopupWorksCorrectly() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.verifyTheFreeGiftIsAddedCorrectlyToTheCart();
        aeCartPage.clickOnCartIcon();
        Assert.assertEquals(aeCartPage.getItemCounterInCartPopUp().getText(), "(2 of 2 Items )");
    }

    @Test(description = "Make sure that the item-count appears in the cart pop up works correctly", priority = 32)
    public void verifyTheProceedCheckoutBtnInCartPopupWorksCorrectlyForGuestUser() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.verifyTheItemsCounterInCartPopupWorksCorrectly();
        aeCartPage.clickOnProceedCheckoutBtnInCartPopup();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+checkoutLoginStepURL," The current URL is not matched with the Checkout Login setup URL");
    }

    @Test(description = "Make sure that the  close icon appears in the cart pop-up works correctly", priority = 33)
    public void verifyTheCloseIconInCartPopupWorksCorrectly() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.verifyTheFreeGiftIsAddedCorrectlyToTheCart();
        aeCartPage.clickOnCartIcon();
        aeCartPage.clickOnCartCloseIcon();
        Assert.assertFalse(aeCartPage.getCloseIconInCartPopup().isDisplayed());
    }

    @Test(description = "Make sure that the free coupon code working fine", priority = 34)
    public void verifyFreeCouponCodeFunctionWorksCorrectly() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        aeCartPage.FillInCouponCode(freeCouponeCode);
        DataHelperAndWait.waitToBeVisible(aeCartPage.getUsedFreeCouponMsg(), 5,webDriver);
        Assert.assertTrue(aeCartPage.getFreeFromSporterSection().isDisplayed());
    }

    @Test(description = "Make sure that the system does not apply invalid coupon code", priority = 35)
    public void verifyInabilityToApplyInvalidCouponCode() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        aeCartPage.FillInCouponCode("test");
        DataHelperAndWait.waitToBeVisible(aeCartPage.getNotExistCouponMsg(), 5,webDriver);
        Assert.assertTrue(aeCartPage.getNotExistCouponMsg().isDisplayed());
    }

    @Test(description = "Make sure that the system cancel the coupon code correctly", priority = 36)
    public void verifyAbilityToCancelTheCouponCode() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        aeCartPage.FillInCouponCode(freeCouponeCode);
        DataHelperAndWait.waitToBeVisible(aeCartPage.getUsedFreeCouponMsg(), 5,webDriver);
        aeCartPage.clickOnCancelCouponCodeBtn();
        Assert.assertFalse(aeCartPage.getFreeFromSporterSection().isDisplayed());
        Assert.assertTrue(aeCartPage.getApplyCouponCode().isDisplayed());
    }

    @Test(description = "Make sure inability to apply coupon code without filling the code", priority = 37)
    public void verifyInabilityToApplyCouponCodeWithoutFillingTheCode() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        aeCartPage.FillInCouponCode(" ");
        DataHelperAndWait.waitToBeVisible(aeCartPage.getRequiredCouponMsg(), 5,webDriver);
        Assert.assertTrue(aeCartPage.getRequiredCouponMsg().isDisplayed());
    }

    @Test(description = "Make sure that My Shopping Cart title appears in the Cart Page", priority = 38)
    public void verifyMyShoppingCartTitleAppearCorrectlyInTheCartPage() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.viewCartFromPDP();
        Assert.assertTrue(aeCartPage.getMyShoppingCartMsg().getText().contains("My Shopping Cart"));
    }

    @Test(description = "Make sure that the free gift is not calculated in the cart price", priority = 39)
    public void verifyTheFreeGiftIsNotCalculatedInTheCartPrice() {
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        this.verifyTheFreeGiftIsAddedCorrectlyToTheCart();
        Assert.assertEquals(aeCartPage.getPriceInCartPage().getText(), aeCartPage.getSubTotalValue().getText());
    }

    @Test(description = "Make sure the tax calculate correctly", priority = 40)
    public void verifyTheTaxCalculatedCorrectly() {
        DecimalFormat df = new DecimalFormat("0.00");
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        float subTotal = DataHelperAndWait.convertTheStringToFloat(aeCartPage.getSubTotalValue());
        float tax = subTotal * (float) (0.05);
        float expectedCartTotal = subTotal + tax;
        float actualCartTotal = DataHelperAndWait.convertTheStringToFloat(aeCartPage.getOrderTotalValue());
        Assert.assertEquals(df.format(actualCartTotal), df.format(expectedCartTotal));
    }

    //      The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(description = "Verify that the ShopBy Menu Is Displayed When Hovering On It From Cart Page", priority = 41)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.viewCartFromPDP();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getShopeByMenu().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }

    @Test(description = "Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Cart Page", priority = 42)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.viewCartFromPDP();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }

    @Test(description = "Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Cart Page", priority = 43)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.viewCartFromPDP();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }

    @Test(description = "Verify that the Healthy Food Menu Is Displayed When Hovering On It From Cart Page", priority = 44)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.viewCartFromPDP();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getHealthyFoodSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }

    @Test(description = "Verify that the Sports Menu Is Displayed When Hovering On It From Cart Page", priority = 45)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.viewCartFromPDP();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }

    @Test(description = "Verify that the account Profile icon works correctly in the Cart Page", priority = 46)
    public void verifyAccountProfileIconWorksCorrectlyInCartPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.clickOnProductInHomePage();
        aeProductDetailsPage.clickOnAccountProfileIcon();
        assertTrue(aeProductDetailsPage.getAccountProfileOptions().isDisplayed());
    }

    @Test(description = "Make sure ability to navigate to the home page by clicking on the Sporter logo from the Cart Page ", priority = 47)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        this.viewCartFromPDP();
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+aeGuestUserPage.aeDomain+"/"," The Current URL is not matched with the Cart URL" );
    }

    @Test(description = "Verify that the search button works correctly from the Cart Page", priority = 48)
    public void verifySearchBtnWorksCorrectlyFromCartPage() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        this.viewCartFromPDP();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeGuestUserPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description = "Make sure that the ability to switch to Arabic version from the cart page correctly", priority = 49)
    public void verifyAbilityToSwitchToArabicVersionFromCartPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AeCartPage aeCartPage = new AeCartPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.siteURL+aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getLanguageSwitcher(), 5,webDriver);
        aeProductDetailsPage.switchToArabicVersion();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getEnglishLangBtn(), 5,webDriver);
        Assert.assertTrue(aeProductDetailsPage.getEnglishLangBtn().isDisplayed());
    }
}