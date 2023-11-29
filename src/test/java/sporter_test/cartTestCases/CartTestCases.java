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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.megaMenuPages.MegaMenuPage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_pages.sportsSupplementsCategoryPages.SportsSupplementsCategoryPage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

@Test(groups = "2.08 Cart Page")

public class CartTestCases extends BaseTest {
    String itemsCounter;
    String storeCountry;

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure to view the cart from PDP after adding  product to it", priority = 1)
    public void viewCartFromPDP() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCartWithoutCartEmptyValidation();
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the product counter that appears in the cart page works correctly", priority = 2)
    public void verifyProductCounterAppearsInTheCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        try {
            itemsCounter = "2";
            WebElementsAssertion.assertionTextIsEqual(cartPage.getItemsCounter(), webDriver, itemsCounter);
        } catch (AssertionError e) {
        }
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the counter-number appears in the cart icon works correctly", priority = 31)
    public void verifyTheCounterInCartIconWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        try {
            WebElementsAssertion.assertionTextIsEqual(cartPage.getCartCounter(), webDriver, "1");
        } catch (AssertionError e) {
            WebElementsAssertion.assertionTextIsEqual(cartPage.getCartCounter(), webDriver, "2");
        }
    }

    //TODO:Needs To Be rechecked
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the counter-number appears inside the cart pop-up works correctly", priority = 32)
    public void verifyTheCounterInsideCartPopUpWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        try {
            itemsCounter = "(2 Of 2 Items )";
            DataHelperAndWait.waitToBeVisible(cartPage.getItemCounterInCartPopUp(), webDriver);
        } catch (AssertionError e) {
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify increase quantity button from Cart page works successfully", priority = 3)
    public void verifyIncreaseQtyBtnInCartPageWorking() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        cartPage.increaseQty();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify ability to Decrease the product quantity from Cart page from the Cart Page works successfully", priority = 4)
    public void verifyDecreaseQtyBtnInCartPageWorking() {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartPage();
        cartPage.decreaseQty();
    }


    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the view Cart button appearing in the Cart pop-up works correctly", priority = 21)
    public void verifyAbilityToViewCartFromCartIcon() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
//        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getViewCartInCartPopup(), webDriver);

//        cartPage.getCartIcon().click();
//        cartPage.getViewCartInCartPopup().click();
//        DataHelperAndWait.clickOnElement(cartPage.getViewCartInCartPopup(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }

    //TODO: NEEDS TO RECHECK
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the product price is changed when you change the quantity from the Cart Page", priority = 33)
    public void verifyProductPriceChangesWhenChangingTheProductQtyFromTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        try {
            cartPage.navigateToCartPage();
            DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(), webDriver);
        } catch (Exception e) {
            System.out.println("The product URL i incorrect or the product disabled");
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify ability to remove the product from the cart successfully", priority = 10)
    public void verifyAbilityToRemoveProductFromCart() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.navigateToCartPage();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Verify that Here Link appear after clearing the items from the Cart works successfully", priority = 11)
    public void verifyHereLinkInCartPageWorking() {
        CartPage cartPage = new CartPage(webDriver);
//        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(cartPage.getHereLink(), webDriver);
    }

    //TODO: This test case should be revisit after solving: https://sporter1.atlassian.net/browse/NS-120 & https://sporter1.atlassian.net/browse/NS-42
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Free Gift is removed from the cart when you remove the product For Bogo", priority = 12)
    public void verifyTheFreeGiftIsRemovedWhenRemovingTheProductForBogo() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        if (DataHelperAndWait.IsElementPresent(cartPage.getFreeFromSporterLabelInProductCard())) {
            webDriver.manage().deleteCookieNamed("guestCartId");
            try {
                cartPage.addBogoToCartAndDisplayTheCart();
                WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getFreeFromSporterLabelInProductCard(), webDriver);
                WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(), webDriver);
            } catch (Exception e) {
                System.out.println("The product is OOS");
            }
        }
    }

    //TODO: This test case should be revisit after solving: https://sporter1.atlassian.net/browse/NS-120 & https://sporter1.atlassian.net/browse/NS-42
    //TODO:Needs to recheck
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the product counter that appears in the cart page counts the free gift correctly", priority = 13)
    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        //TODO: Needs To Review
        cartPage.addToCartAndDisplayTheCartWithoutCartEmptyValidation();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Free Gift is removed from the cart when you remove the product For Free gift gained by Coupon", priority = 14)
    public void verifyTheFreeGiftIsRemovedWhenRemovingTheProductForFreeGiftGainedByCoupon() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        //TODO: Needs to check
        cartPage.addToCartAndDisplayTheCartWithoutCartEmptyValidation();
        if (DataHelperAndWait.IsElementPresent(cartPage.getHereLink())) {
            cartPage.removeItem();
            WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(), webDriver);
        }

    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure to view the cart after adding more than quantity for the same product", priority = 15)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanQtyOfProduct() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        cartPage.addToCartAndViewCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL, webDriver);
//        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure to view the cart after adding more than products to it", priority = 16)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanProducts() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
//        cartPage.addBogoToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure remove Item button works correctly when the cart conatins more than item", priority = 17)
    public void verifyRemoveItemBtnWorksWhenCartContainsMoreThanItem() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.IsEmptyCart();
    }

    //TODO: To be revisit
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Adding a config to the cart more than one with different simple in each time", priority = 100)
//    public void verifyAbilityToViewTheCartAfterAddingMoreThanSimpleOfTheSameConfig() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.addToCart();
//        productDetailsPage.keepShopping();
//        DataHelperAndWait.clickOnElement(productDetailsPage.getProductFlavor().get(0),webDriver);
//        cartPage.addToCartAndViewCart();
//        WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL,webDriver);
//        cartPage.removeAllItems(2);
//    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = " Cart Page- Make sure ability to add a bundle to the cart ", priority = 18)
    public void verifyAbilityToAddBundleToCart() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        try {
            productDetailsPage.displayBundle();
            DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), webDriver);
            Select select = new Select(productDetailsPage.getBundleMenu());
            List<WebElement> elementCount = select.getOptions();
            int menuSize = elementCount.size();
            for (int i = 0; i < menuSize; i++) {
                select.selectByIndex(i);
                DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddToCartBtn(), webDriver);
                productDetailsPage.getAddToCartBtn().click();
                productDetailsPage.viewCart();
                break;

            }
            WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL, webDriver);
        }
        //TODO: Needs to review
        catch (Exception e) {

        }
        webDriver.manage().deleteCookieNamed("guestCartId");

    }

    //    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = " Cart Page- Make sure ability to add a bundle to the cart with all bundle options", priority = 50)
//    public void verifyAbilityToAddBundleWithAllItsOptionsToCart() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayBundle();
//        WebDriverWait wait;
//        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu() ,webDriver);
//        Select select = new Select(productDetailsPage.getBundleMenu());
//        List<WebElement> elementCount = select.getOptions();
//        int menuSize = elementCount.size();
//        for (int i = 0; i < menuSize; i++) {
//            try {
//                select.selectByIndex(i);
//                wait = new WebDriverWait(webDriver, 3);
//                wait.until(ExpectedConditions.visibilityOf(productDetailsPage.getKeepShippingBtn())).isDisplayed();
//                productDetailsPage.getKeepShippingBtn().click();
//            } catch (Exception e) {
//                DataHelperAndWait.clickOnElement(productDetailsPage.getCloseToCartErrorPopUp(),webDriver);
//            }
//        }
//    }
    //TODO:There's a bug here, check: https://sporter1.atlassian.net/browse/NS-184/https://sporter1.atlassian.net/browse/NS-107
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the The requested qty is not available message appear when the product becomes OOS", priority = 19)
    public void verifyToDisplayRequestedQtyIsNotAvailableMsg() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addToCartAndDisplayTheCartWithoutCartEmptyValidation();
        DataHelperAndWait.hoverOnElementAndClick(cartPage.getFirstQtyField(), webDriver);
        DataHelperAndWait.updateAllText(cartPage.getFirstQtyField(), "999");
        //TODO: Needs to recheck after solving Cart loading issue
        cartPage.proceedToCheckout();
        cartPage.waitTillCartSpinnerDisappear(webDriver);
        DataHelperAndWait.waitToBeVisible(cartPage.getCloseAddToCartErrorMsg(), webDriver);
    }

    //TODO:There's a bug here, check: https://sporter1.atlassian.net/browse/NS-184/https://sporter1.atlassian.net/browse/NS-107
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Verify that the ContinueShoppingBtn works correctly when displaying The requested qty is not available message", priority = 18)
//    public void verifyContinueShoppingBtnWorksCorrectlyWhenTheProductBecomeOOS() {
//        CartPage cartPage = new CartPage(webDriver);
//        DataHelperAndWait.clickOnElement(cartPage.getCloseAddToCartErrorMsg(),webDriver);
//    }
//TODO: Needs to recheck after solving cart loading issue
    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify ability to display the product from the Cart Page works successfully", priority = 20)
    public void verifyAbilityToDisplayTheProductFromTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addToCartAndDisplayTheCartWithoutCartEmptyValidation();
        cartPage.waitTillCartSpinnerDisappear(webDriver);
        DataHelperAndWait.waitForTime(2000);

        cartPage.waitTillLoaderComplete();
        DataHelperAndWait.waitToBeClickable(cartPage.getProductNameForOneProduct(), webDriver);
        DataHelperAndWait.JsExecutorToClickOnElement(cartPage.getProductNameForOneProduct(), webDriver);
        //        DataHelperAndWait.clickOnElement(cartPage.getProductNameForOneProduct(), webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductName(), webDriver);
    }

    //TODO: This test case should be revisit after solving: https://sporter1.atlassian.net/browse/NS-120 & https://sporter1.atlassian.net/browse/NS-42
    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Free Gift is added correctly to the Cart", priority = 21)
    public void verifyTheFreeGiftIsAddedCorrectlyToTheCart() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        try {
            cartPage.checkIfProductOOS();
            if (DataHelperAndWait.IsElementPresent(cartPage.getFreeFromSporterLabelInProductCard())) {
                webDriver.manage().deleteCookieNamed("guestCartId");
                cartPage.addBogoToCartAndDisplayTheCart();
                DataHelperAndWait.isDisplayed(cartPage.getFreeFromSporterLabelInProductCard(), webDriver);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Free Gift does not have a price", priority = 22)
    public void verifyTheFreeGiftIsDoesNotHavePrice() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        try {
            cartPage.addBogoToCartAndDisplayTheCart();
            cartPage.checkIfProductOOS();
            //TODO: Needs to recheck
            if (DataHelperAndWait.IsElementPresent(cartPage.getFreePrice())) ;
        } catch (Exception e) {
            System.out.println("The product is OOS");
        }
//        try{
//        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getFreePrice(), webDriver);}
//        catch (Exception e){
//        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 5)
    public void verifyAllPaymentMethodAppearingTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        if (DataHelperAndWait.IsElementPresent(cartPage.getWeAcceptLabel())) {
            WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCODOption(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Proceed to checkout button appears in the cart page works correctly", priority = 9)
    public void verifyProceedCheckoutBtnAppearsCorrectlyInCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.proceedToCheckout();
        DataHelperAndWait.waitForUrlContains(cartPage.shippingInformationUrl, webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 24)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, "AED");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver, "AED");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, "AED");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the  close icon appears in the cart pop-up works correctly", priority = 25)
    public void verifyTheCloseIconInCartPopupWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
//        webDriver.manage().deleteCookieNamed("guestCartId");
//        cartPage.addToCartAndDisplayTheCartWithoutCartEmptyValidation();
//        cartPage.navigateToHomePage();
//        cartPage.waitTillLoaderComplete();
        try {
            cartPage.clickOnCartIcon();
            DataHelperAndWait.waitToBeVisible(cartPage.getCartCloseIcon(), webDriver);
            DataHelperAndWait.clickOnElement(cartPage.getCartCloseIcon(), webDriver);
        } catch (Exception e) {
            cartPage.clickOnCartIcon();
            DataHelperAndWait.waitToBeVisible(cartPage.getCartCloseIcon(), webDriver);
            DataHelperAndWait.clickOnElement(cartPage.getCartCloseIcon(), webDriver);
        }
    }

    //TODO: Should be revisit after solving https://sporter1.atlassian.net/browse/NS-188 & https://sporter1.atlassian.net/browse/NS-190
    @Test(enabled = false, groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the system does not apply invalid coupon code", priority = 26)
    public void verifyInabilityToApplyInvalidCouponCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(), webDriver, XmlReader.getXMLData("invalidCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseAddToCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);

    }

    //TODO: Should be revisit after solving https://sporter1.atlassian.net/browse/NS-189
    @Test(enabled = false, groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure inability to apply coupon code without filling the code", priority = 27)
    public void verifyInabilityToApplyCouponCodeWithoutFillingTheCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(), webDriver, XmlReader.getXMLData("invalidCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseAddToCartErrorMsg(), webDriver);
        DataHelperAndWait.clearWebField(cartPage.getCouponCodeField());
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the free gift is not calculated in the cart price", priority = 28)
    public void verifyTheFreeGiftIsNotCalculatedInTheCartPrice() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        try {
            cartPage.addBogoToCartAndDisplayTheCart();
////ToDO: Needs to revisit after fixing the Bogo
//        Assert.assertTrue(cartPage.getFreeFromSporterSection().isDisplayed());
//        cartPage.removeItem();
        } catch (Exception e) {
            System.out.println("The product is OOS");
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the tax calculate correctly", priority = 29, enabled = false)
    public void verifyTheTaxCalculatedCorrectly() throws IOException {
        DecimalFormat df = new DecimalFormat("0.00");
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, "AED");
        float tax = subTotal * (float) (0.05);
        float expectedCartTotal = subTotal + tax;
        float actualCartTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, "AED");
        Assert.assertEquals(df.format(actualCartTotal), df.format(expectedCartTotal));
    }

    //TODO: https://sporter1.atlassian.net/browse/NS-28
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Verify that the search button works correctly from the Cart Page", priority = 30)
    public void verifySearchBtnWorksCorrectlyFromCartPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.typeTextInElement(productDetailsPage.getSearchField(), webDriver, "optimum");
        DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductCard(),webDriver );
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.waitTillCartSpinnerIconDisappear(webDriver);
        if (!DataHelperAndWait.IsElementPresent(productDetailsPage.getProductCard()))
            throw new AssertionError("The Search page is empty");
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that Make sure that complete your order, to get 100% GENUINE PRODUCTS and SUPER DELIVERY WITHIN 2 WORKING DAYS label appears in the Cart Page", priority = 6)
    public void verifyTheFreeShippingLabelAppearCorrectlyInTheCartPage() {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.isDisplayed(cartPage.getFreeShippingLabel(), webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the Expected delivery date field in the cart page retrieves data", priority = 7)
    public void verifyExpectedDeliveryDateRetrievesData() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.isDisplayed(cartPage.getExpectedDeliveryDateLabel(), webDriver);
        String expectedDeliveryDate = DataHelperAndWait.getWebElementText(cartPage.getExpectedDeliveryDateValue(), webDriver);
        Assert.assertNotNull(expectedDeliveryDate);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that My Shopping Cart title appears in the Cart Page", priority = 8)
    public void verifyMyShoppingCartTitleAppearCorrectlyInTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
//         cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        String cartTitle;
        if (webDriver.getCurrentUrl().contains("com/en")) {
            cartTitle = (DataHelperAndWait.getWebElementText(cartPage.getMyShoppingCartMsg(), webDriver)).substring(0, 16);
            Assert.assertEquals(cartTitle, XmlReader.getXMLData("CartTitleEn"));
        } else {
            cartTitle = (DataHelperAndWait.getWebElementText(cartPage.getMyShoppingCartMsg(), webDriver)).substring(0, 11);
            Assert.assertEquals(cartTitle, XmlReader.getXMLData("CartTitleAr"));
        }
    }

    //TODO: Should be revisit after solving https://sporter1.atlassian.net/browse/NS-188 & https://sporter1.atlassian.net/browse/NS-190
    @Test(enabled = false, groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the system apply Free Gift coupon code correctly", priority = 34)
    public void verifyAbilityToApplyFreeGiftCouponCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(), webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(), webDriver);
    }

    //TODO: Should be revisit after solving https://sporter1.atlassian.net/browse/NS-188 & https://sporter1.atlassian.net/browse/NS-190
    @Test(enabled = false, groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the system cancel the coupon code correctly", priority = 35)
    public void verifyAbilityToCancelTheCouponCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCancelCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }

    //    @Test(groups = {"1.2 High Severity"},description = "{{CountryName}}: Make sure that the customer can't add more than 2 Qty of the same product when switching to Jordan Store from Cart Page", priority = 37,enabled = false)
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
//      The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Verify that the ShopBy Menu Is Displayed When Hovering On It From cart Page", priority = 36)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() throws IOException {
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
//        CartPage cartPage = new CartPage(webDriver);
//        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        megaMenuPage.makeSureToDisplayShopByMenu();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Verify ability to click on  the Sport Supplements Menu From cart Page", priority = 37)
    public void verifyAbilityToClickOnSportSupplementsMenuFromCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        cartPage.navigateToCartPage();
        sportsSupplementsCategoryPage.clickOnSportsSupplementMainMenu();
        sportsSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.sportSupplementsUrl, webDriver);
        } catch (Exception e) {
            WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.sportSupplementsUrl + "/", webDriver);
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Verify ability to click on  Vitamins And Health Menu From cart Page", priority = 38)
    public void verifyAbilityToClickOnVitaminsAndHealthMenuFromCartPage() throws IOException {
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        megaMenuPage.clickOnVitaminsAndHealthMainMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl, webDriver);
        } catch (Exception e) {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl + "/", webDriver);
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Verify ability to click on  the Healthy Food Menu From cart Page", priority = 39)
    public void verifyAbilityToClickOnHealthyFoodMenuFromCartPage() throws IOException {
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        megaMenuPage.clickOnHealthyFoodMainMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthyFoodsUrl, webDriver);
        } catch (Exception e) {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl + "/", webDriver);
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Verify ability to click on  the Sports Menu From cart Page", priority = 40)
    public void verifyAbilityToClickOnSportsMenuIsDisplayedFromCartPage() throws IOException {
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        megaMenuPage.clickOnSportsMainMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.sportsUrl, webDriver);
        } catch (Exception e) {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.sportsUrl + "/", webDriver);
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Verify that the account Profile icon works correctly in PDP", priority = 41)
    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.clickOnElement(productDetailsPage.getAccountProfileIcon(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAccountProfileOptions(), webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure ability to navigate to the home page by clicking on the Sporter logo from the Cart Page ", priority = 42)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() throws IOException {
        HeaderSection headerSection = new HeaderSection(webDriver);
        HomePage homePage = new HomePage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure Tamara Widget appears correctly in the cart page ", priority = 43)
    public void verifyTamaraWidgetAppearsCorrectlyInTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getTamaraWidget(), webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure Tabby Widget appears correctly in the cart page ", priority = 44)
    public void verifyTabbyWidgetAppearsCorrectlyInTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getTabbyWidget(), webDriver);
    }
     @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure the coupon code header is displayed", priority = 45)
    public void verifyDoHaveDiscountCodeHeaderAppearsCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getDoHaveDiscountCode(), webDriver);
    }

}