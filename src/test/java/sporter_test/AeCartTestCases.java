package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEGuestUserPage;
import sporter_pages.AEMegaMenuPage;
import sporter_pages.CartPage;
import sporter_pages.ProductDetailsPage;

import java.text.DecimalFormat;
import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AeCartTestCases extends BaseTest {
    private ProductDetailsPageTestCases productDetailsPageTestCases;
    private ProductDetailsPage productDetailsPage;
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    AEGuestUserPage aeGuestUserPage;
    //comment
    Actions action;
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
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(), 10);
        productDetailsPage.DisplayProductInTheList(3);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        productDetailsPage.DisplayProductInTheList(4);
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
    @Test(description = "Adding a config to the cart more than one with different simple in each time", priority = 4)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanSimpleOfTheSameConfig() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage = new CartPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSportsSupplementsMenu();
        productDetailsPage.DisplayProductInTheList(0);
        productDetailsPage.clickOnFirstProductFlavor();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        productDetailsPage.clickOnSecondProductFlavor();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        String itemsCounter = "(3 Items)";
        DataHelperAndWait.waitToBeVisible(cartPage.getItemsCounterInCartPage(), 15);
        Assert.assertEquals(cartPage.getItemsCounterInCartPage().getText(), itemsCounter);
    }
    @Test(description = "Make sure ability to add bundle to the Cart", priority = 5)
    public void verifyAbilityToAddBundleToCart() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.searchForBundle();
        productDetailsPage.clickOnSearchBtn();
        productDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), 20);
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
    @Test(description = "Make sure ability to add a bundle to the cart with all bundle options", priority = 6)
    public void verifyAbilityToAddBundleWithAllItsOptionsToCart() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage = new CartPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.searchForBundle();
        productDetailsPage.clickOnSearchBtn();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductCard(), 20);
        productDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), 20);
        Select select = new Select(productDetailsPage.getBundleMenu());
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            try {
                select.selectByIndex(i);
                productDetailsPage.addToCart();
                productDetailsPage.keepShopping();
            } catch (Exception e) {
                cartPage.clickOnTheContinueShoppingBtn();
            }
        }
        cartPage.clickOnCartIcon();
        cartPage.clickOnViewCartInCartPopUp();
        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
    @Test(description ="Verify that the The requested qty is not available message appear when the product becomes OOS",priority = 7)
    public void verifyToDisplayRequestedQtyIsNotAvailableMsg(){
        productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage = new CartPage(webDriver);
        productDetailsPage.switchToAeCountry();
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
        productDetailsPage.switchToAeCountry();
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
        Assert.assertEquals(webDriver.getCurrentUrl(), aeSiteURL);
    }
    @Test(description ="Verify ability to increase the product quantity from Cart page from the Cart Page works successfully",priority = 11)
    public void verifyIncreaseQtyBtnInCartPageWorking(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        DataHelperAndWait.waitToBeClickable(cartPage.getIncreaseQtyBtn(),10);
        cartPage.clickOnIncreaseQtyBtn();
        Assert.assertEquals(cartPage.getQtyField().getAttribute("value"), "2");
    }
    @Test(description ="Verify ability to Decrease the product quantity from Cart page from the Cart Page works successfully",priority = 12)
    public void verifyDecreaseQtyBtnInCartPageWorking(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        DataHelperAndWait.waitToBeClickable(cartPage.getIncreaseQtyBtn(),10);
        cartPage.clickOnIncreaseQtyBtn();
        DataHelperAndWait.waitToBeClickable(cartPage.getDecreaseQtyBtn(),10);
        cartPage.clickOnDecreaseQtyBtn();
        Assert.assertEquals(cartPage.getQtyField().getAttribute("value"), "1");
    }
    @Test(description ="Verify that The requested qty is not available message appear when the product becomes OOS in Cart Page successfully",priority = 13)
    public void verifyToDisplayRequestedQtyIsNotAvailableMsgWhenProductOOSinCartPage(){
        cartPage= new CartPage(webDriver);
        this.verifyAbilityToAddBundleToCart();
        cartPage.FillInQtyField("500");
        cartPage.clickOnIncreaseQtyBtn();
        DataHelperAndWait.waitToBeVisible(cartPage.getQtyUnavailableMsgInCartPage(),10);
        Assert.assertTrue(cartPage.getQtyUnavailableMsgInCartPage().isDisplayed());}
        @Test(description ="Verify ability to display the product from the Cart Page works successfully",priority = 14)
        public void verifyAbilityToDisplayTheProductFromTheCartPage(){
            cartPage= new CartPage(webDriver);
            this.viewCartFromPDP();
            cartPage.clickOnProductCartInCartPage();
            Assert.assertNotEquals(webDriver.getCurrentUrl(), aeSiteURL);
        }
    @Test(description ="Make sure that the product price is changed when you change the quantity from the Cart Page",priority = 15)
    public void verifyProductPriceChangesWhenChangingTheProductQtyFromTheCartPage(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        String currentProductPrice = cartPage.getPriceInCartPage().getText();
        cartPage.clickOnIncreaseQtyBtn();
        DataHelperAndWait.refreshPage();
        String newProductPrice = cartPage.getPriceInCartPage().getText();
        Assert.assertNotEquals(currentProductPrice,newProductPrice);
    }
    @Test(description ="Make sure that the customer can't add more than 2 Qty of the same product when switching to Jordan Store from Cart Page",priority = 16)
    public void verifyInabilityToAddMoreThan2QtyOfSameProductFromTheCartPageForJordanStore(){
        productDetailsPage = new ProductDetailsPage(webDriver);
        WebDriverWait wait = new WebDriverWait(webDriver, 30);
        cartPage= new CartPage(webDriver);
        productDetailsPage.switchToJOCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSportsSupplementsMenu();
        productDetailsPage.DisplayProductInTheList(0);
        productDetailsPage.clickOnFirstProductFlavor();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        cartPage.clickOnIncreaseQtyBtn();
        if(wait.until(ExpectedConditions.alertIsPresent())!=null)
            webDriver.switchTo().alert().dismiss();
    }
    @Test(description ="Make sure that the Free Gift is added correctly to the Cart",priority = 17)
    public void verifyTheFreeGiftIsAddedCorrectlyToTheCart(){
    productDetailsPage = new ProductDetailsPage(webDriver);
    cartPage= new CartPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        productDetailsPage.DisplayProductInTheList(3);
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertTrue(cartPage.getFreeFromSporterSection().isDisplayed());
    }
    @Test(description ="Make sure that the Free Gift does not have a price",priority = 18)
    public void verifyTheFreeGiftIsDoesnotHavePrice(){
        productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage= new CartPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        productDetailsPage.DisplayProductInTheList(3);
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertTrue(cartPage.getFreePrice().isDisplayed());
    }
    @Test(description ="Make sure that the Free Gift is removed from the cart when you remove the product",priority = 19)
    public void verifyTheFreeGiftIsRemovedWhenRemovingTheProduct(){
        productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage= new CartPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(), 10);
        productDetailsPage.DisplayProductInTheList(3);
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertTrue(cartPage.getFreePrice().isDisplayed());
        cartPage.clickOnRemoveItem();
        DataHelperAndWait.isDisplayed(cartPage.getNoItemInCartLabel(),10);
        Assert.assertTrue(cartPage.getNoItemInCartLabel().isDisplayed());
    }
    @Test(description ="Make sure that all payment methods are appear correctly in the Cart page",priority = 20)
    public void verifyAllPaymentMethodAppearingTheCartPage(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        Assert.assertTrue(cartPage.getWeAcceptLabel().isDisplayed());
        Assert.assertTrue(cartPage.getCodOption().isDisplayed());
        Assert.assertTrue(cartPage.getCreditCardOption().isDisplayed());
    }
    @Test(description ="Make sure that Make sure that complete your order, to get 100% GENUINE PRODUCTS and SUPER DELIVERY WITHIN 2 WORKING DAYS label appears in the Cart Page",priority = 21)
    public void verifytheFreeShippingLabelAppearCorrectlyInTheCartPage(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        Assert.assertTrue(cartPage.getFreeShippingLabel().isDisplayed());
    }
    @Test(description ="Make sure that the product counter that appears in the cart page works correctly",priority = 22)
    public void verifyProductCounterAppearsInTheCartPageWorksCorrectly(){
        productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage= new CartPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSportsSupplementsMenu();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(), 10);
        productDetailsPage.DisplayProductInTheList(0);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSportsSupplementsMenu();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(), 10);
        productDetailsPage.DisplayProductInTheList(4);
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        String itemsCounter = "(2 Items)";
        DataHelperAndWait.waitToBeVisible(cartPage.getItemsCounterInCartPage(), 15);
        Assert.assertEquals(cartPage.getItemsCounterInCartPage().getText(), itemsCounter);
    }
    @Test(description ="Make sure that the product counter that appears in the cart page counts the free gift correctly",priority = 23)
    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts(){
        productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage= new CartPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(), 10);
        productDetailsPage.DisplayProductInTheList(3);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(), 10);
        productDetailsPage.DisplayProductInTheList(3);
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        String itemsCounter = "(4 Items)";
        DataHelperAndWait.waitToBeVisible(cartPage.getItemsCounterInCartPage(), 15);
        Assert.assertEquals(cartPage.getItemsCounterInCartPage().getText(), itemsCounter);
    }
    @Test(description ="Make sure that the Expected delivery date field in the cart page retrieves data",priority = 24)
    public void verifyExpectedDeliveryDateRetrievesData(){
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        cartPage= new CartPage(webDriver);
        productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
        Assert.assertTrue(cartPage.getExpectedDeliveryDateLabel().isDisplayed());
        String expectedDeliveryDate=cartPage.getExpectedDeliveryDateValue().getText();
        Assert.assertNotNull(expectedDeliveryDate);
    }
    @Test(description ="Make sure that theProceed to checkout button appears in the cart page works correctly",priority = 25)
    public void verifyProceedCheckoutBtnAppearsCorrectlyInCartPage(){
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        cartPage= new CartPage(webDriver);
        productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
        Assert.assertTrue(cartPage.getProceedCheckoutBtn().isDisplayed());}
    @Test(description ="Make sure that the system will empty the cart after switching the country",priority = 26)
    public void verifyTheCartWillRemoveAllProductsAfterSwitchingTheCountry(){
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        productDetailsPage= new ProductDetailsPage(webDriver);
        cartPage= new CartPage(webDriver);
        productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
        productDetailsPage.switchToJOCountry();
        Assert.assertTrue(cartPage.getNoItemInCartLabel().isDisplayed());
    }
    @Test(description ="Make sure that the ability to switch to Arabic version from the cart page correctly",priority = 27)
    public void verifyAbilityToSwitchToArabicVersionFromCartPage(){
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        productDetailsPage= new ProductDetailsPage(webDriver);
        cartPage= new CartPage(webDriver);
        productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getLanguageSwitcher(), 10);
        productDetailsPage.switchToArabicVersion();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getEnglishLangBtn(), 5);
        Assert.assertTrue(productDetailsPage.getEnglishLangBtn().isDisplayed());}
    @Test(description ="Make sure that the order total calculation in the cart page works correctly",priority = 28)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly(){
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        productDetailsPage= new ProductDetailsPage(webDriver);
        cartPage= new CartPage(webDriver);
        productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
        float subTotal= DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue());
        float tax= DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue());
        float orderTotal= DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue());
        float cartTotal= subTotal+tax;
        Assert.assertEquals(orderTotal,cartTotal);
    }
    @Test(description ="Make sure that the customer can view the cart using Cart Icon",priority = 29)
    public void verifyAbilityToViewCartFromCartIcon(){
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        cartPage= new CartPage(webDriver);
        productDetailsPageTestCases.keepShoppingAfterAddingToTheCart();
        cartPage.clickOnCartIcon();
        cartPage.clickOnViewCartInCartPopUp();
        Assert.assertEquals(webDriver.getCurrentUrl(), cartURL);
    }
    @Test(description ="Make sure that the counter-number appears in the cart pop up works correctly",priority = 30)
    public void verifyTheCounterInCartIconWorksCorrectly(){
        cartPage= new CartPage(webDriver);
       this.verifyTheFreeGiftIsAddedCorrectlyToTheCart();
        Assert.assertEquals(cartPage.getCartCounter().getText(), "2");
    }
    @Test(description ="Make sure that the item-count appears in the cart pop up works correctly",priority = 31)
    public void verifyTheItemsCounterInCartPopupWorksCorrectly(){
        cartPage= new CartPage(webDriver);
        this.verifyTheFreeGiftIsAddedCorrectlyToTheCart();
        cartPage.clickOnCartIcon();
        Assert.assertEquals(cartPage.getItemCounterInCartPopUp().getText(), "(2 of 2 Items )");
    }
    @Test(description ="Make sure that the item-count appears in the cart pop up works correctly",priority = 32)
    public void verifyTheProceedCheckoutBtnInCartPopupWorksCorrectlyForGuestUser(){
        cartPage= new CartPage(webDriver);
        this.verifyTheItemsCounterInCartPopupWorksCorrectly();
        cartPage.clickOnProceedCheckoutBtnInCartPopup();
        Assert.assertEquals(webDriver.getCurrentUrl(), checkoutLoginStepURL);
    }
    @Test(description ="Make sure that the  close icon appears in the cart pop-up works correctly",priority = 33)
    public void verifyTheCloseIconInCartPopupWorksCorrectly(){
        cartPage= new CartPage(webDriver);
        this.verifyTheFreeGiftIsAddedCorrectlyToTheCart();
        cartPage.clickOnCartIcon();
        cartPage.clickOnCartCloseIcon();
        Assert.assertFalse(cartPage.getCloseIconInCartPopup().isDisplayed());
    }
    @Test(description ="Make sure that the free coupone code working fine",priority = 34)
    public void verifyFreeCoupopneCodeFunctionWorksCorrectly(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        cartPage.FillInCouponCode(freeCouponeCode);
        DataHelperAndWait.waitToBeVisible(cartPage.getUsedFreeCouponMsg(),15);
        Assert.assertTrue(cartPage.getFreeFromSporterSection().isDisplayed());
    }
    @Test(description ="Make sure that the system does not apply invalid coupon code",priority = 35)
    public void verifyInabilityToApplyInvalidCouponCode(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        cartPage.FillInCouponCode("test");
        DataHelperAndWait.waitToBeVisible(cartPage.getNotExistCouponMsg(),15);
        Assert.assertTrue(cartPage.getNotExistCouponMsg().isDisplayed());
    }
    @Test(description ="Make sure that the system cancel the coupon code correctly",priority = 36)
    public void verifyAbilityToCancelTheCouponCode(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        cartPage.FillInCouponCode(freeCouponeCode);
        DataHelperAndWait.waitToBeVisible(cartPage.getUsedFreeCouponMsg(),15);
        cartPage.clickOnCancelCouponCodeBtn();
        Assert.assertFalse(cartPage.getFreeFromSporterSection().isDisplayed());
        Assert.assertTrue(cartPage.getApplyCouponCode().isDisplayed());
    }
    @Test(description ="Make sure inability to apply coupon code without filling the code",priority = 37)
    public void verifyInabilityToApplyCouponCodeWithoutFillingTheCode(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        cartPage.FillInCouponCode(" ");
        DataHelperAndWait.waitToBeVisible(cartPage.getRequiredCouponMsg(),15);
        Assert.assertTrue(cartPage.getRequiredCouponMsg().isDisplayed());
    }
    @Test(description ="Make sure that My Shopping Cart title appears in the Cart Page",priority = 38)
    public void verifyMyShoppingCartTitleAppearCorrectlyInTheCartPage(){
        cartPage= new CartPage(webDriver);
        this.viewCartFromPDP();
        Assert.assertTrue(cartPage.getMyShoppingCartMsg().getText().contains("My Shopping Cart"));
    }
    @Test(description ="Make sure that the free gift is not calculated in the cart price",priority = 39)
    public void verifyTheFreeGiftIsNotCalculatedInTheCartPrice(){
        cartPage= new CartPage(webDriver);
        this.verifyTheFreeGiftIsAddedCorrectlyToTheCart();
        Assert.assertEquals(cartPage.getPriceInCartPage().getText(),cartPage.getSubTotalValue().getText());
    }
    @Test(description ="Make sure the tax calculate correctly",priority = 40)
    public void verifyTheTaxCalculatedCorrectly(){
        DecimalFormat df = new DecimalFormat("0.00");
        productDetailsPageTestCases = new ProductDetailsPageTestCases();
        productDetailsPage= new ProductDetailsPage(webDriver);
        cartPage= new CartPage(webDriver);
        productDetailsPageTestCases.viewCartAfterAddingTheProductToIt();
        float subTotal= DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue());
        float tax= subTotal *(float) (0.05);
        float expectedCartTotal= subTotal+tax;
        float actualCartTotal= DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue());
        Assert.assertEquals(df.format(actualCartTotal),df.format(expectedCartTotal));
    }

    //      The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(description = "Verify that the ShopBy Menu Is Displayed When Hovering On It From Cart Page", priority = 41)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.viewCartFromPDP();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getShopeByMenu().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }
    @Test(description = "Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Cart Page", priority = 42)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.viewCartFromPDP();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }
    @Test(description = "Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Cart Page", priority = 43)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.viewCartFromPDP();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }
    @Test(description = "Verify that the Healthy Food Menu Is Displayed When Hovering On It From Cart Page", priority = 44)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.viewCartFromPDP();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getHealthyFoodSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }
    @Test(description = "Verify that the Sports Menu Is Displayed When Hovering On It From Cart Page", priority = 45)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromCartPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.viewCartFromPDP();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }
    @Test(description = "Verify that the account Profile icon works correctly in the Cart Page", priority = 46)
    public void verifyAccountProfileIconWorksCorrectlyInCartPage() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.clickOnAccountProfileIcon();
        assertTrue(productDetailsPage.getAccountProfileOptions().isDisplayed());
    }
    @Test(description = "Make sure ability to navigate to the home page by clicking on the sporter logo from the Cart Page ", priority = 47)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
        aeGuestUserPage= new AEGuestUserPage(webDriver);
        this.viewCartFromPDP();
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.sporter.com/en-ae/");
    }
    @Test(description = "Verify that the search button works correctly from the Cart Page", priority = 48)
    public void verifySearchBtnWorksCorrectlyFromCartPage() {
        aeGuestUserPage= new AEGuestUserPage(webDriver);
        productDetailsPage = new ProductDetailsPage(webDriver);
        this.viewCartFromPDP();
        productDetailsPage.searchForBundle();
        productDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
}

















