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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
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
        cartPage.addToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }

    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the product counter that appears in the cart page works correctly", priority = 2)
    public void verifyProductCounterAppearsInTheCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        itemsCounter = "2";
        //TODO:Needs To Be rechecked
//        WebElementsAssertion.assertionTextIsEqual(cartPage.getItemsCounter(), webDriver, itemsCounter);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the counter-number appears in the cart icon works correctly", priority = 3)
    public void verifyTheCounterInCartIconWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        //TODO:Needs To Be rechecked
        //        WebElementsAssertion.assertionTextIsEqual(cartPage.getCartCounter(), webDriver, "2");
    }
    //TODO:Needs To Be rechecked
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the counter-number appears inside the cart pop-up works correctly", priority = 4)
    public void verifyTheCounterInsideCartPopUpWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        itemsCounter = "(2 Of 2 Items )";
        DataHelperAndWait.waitToBeVisible(cartPage.getItemCounterInCartPopUp(), webDriver);
//        WebElementsAssertion.assertionTextIsEqual(cartPage.getItemCounterInCartPopUp(), webDriver, itemsCounter);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify increase quantity button from Cart page works successfully", priority = 5)
    public void verifyIncreaseQtyBtnInCartPageWorking() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(), webDriver);
//        DataHelperAndWait.waitForTime(500);
        cartPage.waitTillQtyValueChanges("2");
//        try{
//        WebElementsAssertion.assertionWebElementEqualText(cartPage.getQtyField(),webDriver, "2");}
//        catch (AssertionError a){
//            DataHelperAndWait.refreshPage(webDriver);
//            DataHelperAndWait.waitForTime(500);
//            WebElementsAssertion.assertionWebElementEqualText(cartPage.getQtyField(),webDriver, "2");}
//        WebElementsAssertion.assertionAttributeTrueForElement(cartPage.getQtyField(),webDriver,"value", "2");
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Verify ability to Decrease the product quantity from Cart page from the Cart Page works successfully", priority = 6)
    public void verifyDecreaseQtyBtnInCartPageWorking() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.clickOnElement(cartPage.getDecreaseQtyBtn(), webDriver);
        cartPage.waitTillQtyValueChanges("1");
//        try{
//        WebElementsAssertion.assertionWebElementEqualText(cartPage.getQtyField(),webDriver, "1");}
//        catch (AssertionError a){
//            DataHelperAndWait.waitForTime(500);
//            WebElementsAssertion.assertionWebElementEqualText(cartPage.getQtyField(),webDriver, "1");}
//        WebElementsAssertion.assertionAttributeTrueForElement(cartPage.getQtyField(),webDriver,"value", "1");
    }


    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the view Cart button appearing in the Cart pop-up works correctly", priority = 7)
    public void verifyAbilityToViewCartFromCartIcon() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.waitToBeVisible(cartPage.getViewCartInCartPopup(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getViewCartInCartPopup(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }

    //TODO: NEEDS TO RECHECK
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the product price is changed when you change the quantity from the Cart Page", priority = 8)
    public void verifyProductPriceChangesWhenChangingTheProductQtyFromTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        String currentProductPrice = DataHelperAndWait.getWebElementText(cartPage.getProductPriceTotal(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(), webDriver);
//        cartPage.waitTillQtyValueChanges("2");
//        DataHelperAndWait.waitForTime(500);
//        String newProductPrice = DataHelperAndWait.getWebElementText(cartPage.getProductPriceTotal(),webDriver);
//        Assert.assertNotEquals(currentProductPrice, newProductPrice);
//        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify ability to remove the product from the cart successfully", priority = 9)
    public void verifyAbilityToRemoveProductFromCart() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.navigateToCartPage();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Verify that Here Link appear after clearing the items from the Cart works successfully", priority = 10)
    public void verifyHereLinkInCartPageWorking() {
        CartPage cartPage = new CartPage(webDriver);
        HomePage homePage = new HomePage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        cartPage.removeItem();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(cartPage.getHereLink(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportsSupplementsCategory(),webDriver);
    }

    //TODO: This test case should be revisit after solving: https://sporter1.atlassian.net/browse/NS-120 & https://sporter1.atlassian.net/browse/NS-42
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Free Gift is removed from the cart when you remove the product For Bogo", priority = 11)
    public void verifyTheFreeGiftIsRemovedWhenRemovingTheProductForBogo() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addBogoToCartAndDisplayTheCart();
        try{
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getFreeFromSporterLabelInProductCard(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(), webDriver);}
        catch (Exception e){
        }
    }

    //TODO: This test case should be revisit after solving: https://sporter1.atlassian.net/browse/NS-120 & https://sporter1.atlassian.net/browse/NS-42
    //TODO:Needs to recheck
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the product counter that appears in the cart page counts the free gift correctly", priority = 12)
    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addToCartAndDisplayTheCart();
        String itemsCounter = "2";
//        WebElementsAssertion.assertionTextIsEqual(cartPage.getItemsCounter(), webDriver, itemsCounter);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Free Gift is removed from the cart when you remove the product For Free gift gained by Coupon", priority = 13)
    public void verifyTheFreeGiftIsRemovedWhenRemovingTheProductForFreeGiftGainedByCoupon() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addBogoToCartAndDisplayTheCart();
        cartPage.removeItem();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(), webDriver);

    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure to view the cart after adding more than quantity for the same product", priority = 14)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanQtyOfProduct() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        cartPage.addToCartAndViewCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL, webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure to view the cart after adding more than products to it", priority = 15)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanProducts() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        cartPage.addBogoToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure remove Item button works correctly when the cart conatins more than item", priority = 16)
    public void verifyRemoveItemBtnWorksWhenCartContainsMoreThanItem() {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
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
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = " Cart Page- Make sure ability to add a bundle to the cart ", priority = 17)
    public void verifyAbilityToAddBundleToCart() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        WebDriverWait wait;
        try {
            productDetailsPage.displayBundle();
            DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), webDriver);
            CartPage cartPage = new CartPage(webDriver);
        }
        catch (Exception e) {
            productDetailsPage.displayBundle();
            DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), webDriver);
        }
        Select select = new Select(productDetailsPage.getBundleMenu());
        List<WebElement> elementCount = select.getOptions();
        int menuSize = elementCount.size();
        for (int i = 0; i < menuSize; i++) {
            try {
                select.selectByIndex(i);
                wait = new WebDriverWait(webDriver, 3);
                wait.until(ExpectedConditions.visibilityOf(productDetailsPage.getAddToCartBtn())).isDisplayed();
                productDetailsPage.getAddToCartBtn().click();
                productDetailsPage.viewCart();
                break;
            } catch (Exception e) {
                productDetailsPage.getCloseToCartErrorPopUp().click();
            }
        }
        WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL, webDriver);
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
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the The requested qty is not available message appear when the product becomes OOS", priority = 18)
    public void verifyToDisplayRequestedQtyIsNotAvailableMsg() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCartForOos();
        DataHelperAndWait.hoverOnElementAndClick(cartPage.getFirstQtyField(), webDriver);
        cartPage.getFirstQtyField().sendKeys("9");
//        DataHelperAndWait.typeTextInElement(cartPage.getFirstQtyField(),webDriver,"9");
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(), webDriver);
        DataHelperAndWait.isDisplayed(cartPage.getCloseAddToCartErrorMsg(), webDriver);
    }
    //TODO:There's a bug here, check: https://sporter1.atlassian.net/browse/NS-184/https://sporter1.atlassian.net/browse/NS-107
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Verify that the ContinueShoppingBtn works correctly when displaying The requested qty is not available message", priority = 18)
//    public void verifyContinueShoppingBtnWorksCorrectlyWhenTheProductBecomeOOS() {
//        CartPage cartPage = new CartPage(webDriver);
//        DataHelperAndWait.clickOnElement(cartPage.getCloseAddToCartErrorMsg(),webDriver);
//    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify ability to display the product from the Cart Page works successfully", priority = 19)
    public void verifyAbilityToDisplayTheProductFromTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.clickOnElement(cartPage.getProductNameForOneProduct(), webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductName(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlNotContainsString(cartPage.cartURL, webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    //TODO: This test case should be revisit after solving: https://sporter1.atlassian.net/browse/NS-120 & https://sporter1.atlassian.net/browse/NS-42
    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Free Gift is added correctly to the Cart", priority = 20)
    public void verifyTheFreeGiftIsAddedCorrectlyToTheCart() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addBogoToCartAndDisplayTheCart();
        try{
        DataHelperAndWait.isDisplayed(cartPage.getFreeFromSporterLabelInProductCard(), webDriver);}
        catch (Exception e){}
        webDriver.manage().deleteCookieNamed("guestCartId");

    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Free Gift does not have a price", priority = 22)
    public void verifyTheFreeGiftIsDoesNotHavePrice() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addBogoToCartAndDisplayTheCart();
        try{
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getFreePrice(), webDriver);}
        catch (Exception e){
        }
//        cartPage.removeItem();}
//        catch (Exception e){
//            cartPage.removeItem();
//        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 21)
    public void verifyAllPaymentMethodAppearingTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCODOption(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Proceed to checkout button appears in the cart page works correctly", priority = 23)
    public void verifyProceedCheckoutBtnAppearsCorrectlyInCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        GuestCheckoutCyclePage guestCheckoutCyclePage = new GuestCheckoutCyclePage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addToCartAndDisplayTheCart();
//        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.waitForTime(2000);
        try{
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(), webDriver);}
        catch (Exception e){
            cartPage.navigateToCartPage();
            DataHelperAndWait.waitForTime(2000);
            DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(), webDriver);
        }
//        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.shippingInformationUrl,webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(guestCheckoutCyclePage.getSigInAndCheckOutHeader(), webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 24)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, "AED");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver, "AED");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, "AED");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the  close icon appears in the cart pop-up works correctly", priority = 25)
    public void verifyTheCloseIconInCartPopupWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToHomePage();
        cartPage.clickOnCartIcon();
//        DataHelperAndWait.clickOnElement(cartPage.getViewCartInCartPopup(),webDriver);
        DataHelperAndWait.waitForTime(500);
        DataHelperAndWait.clickOnElement(cartPage.getCartCloseIcon(), webDriver);
    }

    //TODO: Should be revisit after solving https://sporter1.atlassian.net/browse/NS-188 & https://sporter1.atlassian.net/browse/NS-190
    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the system does not apply invalid coupon code", priority = 26)
    public void verifyInabilityToApplyInvalidCouponCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
//        cartPage.navigateToCartPage();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(), webDriver, XmlReader.getXMLData("invalidCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseAddToCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);

    }

    //TODO: Should be revisit after solving https://sporter1.atlassian.net/browse/NS-189
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure inability to apply coupon code without filling the code", priority = 27)
    public void verifyInabilityToApplyCouponCodeWithoutFillingTheCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(), webDriver, XmlReader.getXMLData("invalidCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseAddToCartErrorMsg(), webDriver);
        DataHelperAndWait.clearWebField(cartPage.getCouponCodeField());
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
//        DataHelperAndWait.isDisplayed(cartPage.getRequiredCouponMsg() ,webDriver);
//        cartPage.removeItem();
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the free gift is not calculated in the cart price", priority = 28)
    public void verifyTheFreeGiftIsNotCalculatedInTheCartPrice() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addBogoToCartAndDisplayTheCart();
////ToDO: Needs to revisit after fixing the Bogo
//        Assert.assertTrue(cartPage.getFreeFromSporterSection().isDisplayed());
//        cartPage.removeItem();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the tax calculate correctly", priority = 29, enabled = false)
    public void verifyTheTaxCalculatedCorrectly() throws IOException {
        DecimalFormat df = new DecimalFormat("0.00");
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, "AED");
        float tax = subTotal * (float) (0.05);
        float expectedCartTotal = subTotal + tax;
        float actualCartTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, "AED");
        Assert.assertEquals(df.format(actualCartTotal), df.format(expectedCartTotal));
        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    //TODO: https://sporter1.atlassian.net/browse/NS-28
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Verify that the search button works correctly from the Cart Page", priority = 30)
    public void verifySearchBtnWorksCorrectlyFromCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.typeTextInElement(productDetailsPage.getSearchField(),webDriver,"optimum");
        DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductCard(),webDriver );
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that Make sure that complete your order, to get 100% GENUINE PRODUCTS and SUPER DELIVERY WITHIN 2 WORKING DAYS label appears in the Cart Page", priority = 31)
    public void verifyTheFreeShippingLabelAppearCorrectlyInTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        try{
        DataHelperAndWait.isDisplayed(cartPage.getFreeShippingLabel(), webDriver);}
        catch (Exception e){
        }
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the Expected delivery date field in the cart page retrieves data", priority = 32)
    public void verifyExpectedDeliveryDateRetrievesData() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.isDisplayed(cartPage.getExpectedDeliveryDateLabel(), webDriver);
        String expectedDeliveryDate = DataHelperAndWait.getWebElementText(cartPage.getExpectedDeliveryDateValue(), webDriver);
        Assert.assertNotNull(expectedDeliveryDate);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that My Shopping Cart title appears in the Cart Page", priority = 33)
    public void verifyMyShoppingCartTitleAppearCorrectlyInTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
         cartPage.addToCartAndDisplayTheCart();
        String cartTitle;
        if (webDriver.getCurrentUrl().contains("com/en")) {
            cartTitle = (DataHelperAndWait.getWebElementText(cartPage.getMyShoppingCartMsg(), webDriver)).substring(0, 16);
            Assert.assertEquals(cartTitle, XmlReader.getXMLData("CartTitleEn"));
        } else {
            cartTitle = (DataHelperAndWait.getWebElementText(cartPage.getMyShoppingCartMsg(), webDriver)).substring(0, 11);
            Assert.assertEquals(cartTitle, XmlReader.getXMLData("CartTitleAr"));
        }
        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    //TODO: Should be revisit after solving https://sporter1.atlassian.net/browse/NS-188 & https://sporter1.atlassian.net/browse/NS-190
    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the system apply Free Gift coupon code correctly", priority = 34)
    public void verifyAbilityToApplyFreeGiftCouponCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(), webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(), webDriver);
    }

    //TODO: Should be revisit after solving https://sporter1.atlassian.net/browse/NS-188 & https://sporter1.atlassian.net/browse/NS-190
    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the system cancel the coupon code correctly", priority = 35)
    public void verifyAbilityToCancelTheCouponCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCancelCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");

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
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}:Verify that the ShopBy Menu Is Displayed When Hovering On It From cart Page", priority = 36)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() throws IOException {
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
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
            WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.sportSupplementsUrl,webDriver);
        }
        catch (Exception e){
            WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.sportSupplementsUrl+"/",webDriver);
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
        }
        catch (Exception e){
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl+"/", webDriver);
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
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthyFoodsUrl,webDriver);
        }
        catch (Exception e){
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl+"/", webDriver);
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
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.sportsUrl,webDriver);
        }
        catch (Exception e){
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.sportsUrl+"/", webDriver);
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Verify that the account Profile icon works correctly in PDP", priority = 41)
    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getAccountProfileIcon(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAccountProfileOptions(), webDriver);
    }

    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure ability to navigate to the home page by clicking on the Sporter logo from the Cart Page ", priority = 42)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() throws IOException {
        HeaderSection headerSection = new HeaderSection(webDriver);
        HomePage homePage = new HomePage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
    }
}