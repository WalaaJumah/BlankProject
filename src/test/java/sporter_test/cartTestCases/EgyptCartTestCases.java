/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription CartTestCases
 */

package sporter_test.cartTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_test.AccountRegistrationTestCases.AccountRegistrationTestCases;
import xml_reader.XmlReader;

import java.io.IOException;

public class EgyptCartTestCases extends CartTestCases {
    @BeforeClass(alwaysRun=true)
    public void switchToEgyptStore(){
        EgyptHomePage egyptHomePage=new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if(webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)){
            System.out.println("You are in Egypt Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+egyptHomePage.egyptDomain);
            CloseInitialDialog();          }

    }
    @Test(enabled = false)
    public void verifyTheTaxCalculatedCorrectly() {}
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 26)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(),webDriver,"EGP");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(),webDriver,"EGP");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(),webDriver,"EGP");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }
    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the counter-number appears inside the cart pop-up works correctly", priority = 4)
    public void verifyTheCounterInsideCartPopUpWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        itemsCounter = "(1 Of 1 Items )";
        DataHelperAndWait.waitToBeVisible(cartPage.getItemCounterInCartPopUp(), webDriver);
        WebElementsAssertion.assertionTextIsEqual(cartPage.getItemCounterInCartPopUp(), webDriver, itemsCounter);
    }
    //TODO: This test case should be revisit after solving: https://sporter1.atlassian.net/browse/NS-120 & https://sporter1.atlassian.net/browse/NS-42
    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the product counter that appears in the cart page counts the free gift correctly", priority = 12)
    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts() {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
        String itemsCounter = "2";
        WebElementsAssertion.assertionTextIsEqual(cartPage.getItemsCounter(),webDriver,itemsCounter);
    }
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the system does not apply invalid coupon code", priority = 26)
    public void verifyInabilityToApplyInvalidCouponCode() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("invalidCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseAddToCartErrorMsg(),webDriver);
//        cartPage.removeItem();
    }
    @Test(enabled = false)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanSimpleOfTheSameConfig(){}
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the product price is changed when you change the quantity from the Cart Page", priority = 8)
    public void verifyProductPriceChangesWhenChangingTheProductQtyFromTheCartPage() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        String currentProductPrice = DataHelperAndWait.getWebElementText(cartPage.getProductPriceTotal(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getDecreaseQtyBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(),webDriver);
        cartPage.waitTillQtyValueChanges("2");
        DataHelperAndWait.waitForTime(500);
        String newProductPrice = DataHelperAndWait.getWebElementText(cartPage.getProductPriceTotal(),webDriver);
        Assert.assertNotEquals(currentProductPrice, newProductPrice);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the system cancel the coupon code correctly", priority = 35)
    public void verifyAbilityToCancelTheCouponCode() {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCancelCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
        DataHelperAndWait.refreshPage(webDriver);
//        cartPage.removeItem();
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure to view the cart after adding more than products to it", priority = 15)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanProducts() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
//        cartPage.removeItem();
        cartPage.addToCartAndDisplayTheCart();
        cartPage.addBogoToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL,webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Verify ability to display the product from the Cart Page works successfully", priority = 19)
    public void verifyAbilityToDisplayTheProductFromTheCartPage() {
        CartPage cartPage = new CartPage(webDriver);
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.clickOnElement(cartPage.getProductNameForOneProduct(),webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductName(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlNotContainsString(cartPage.cartURL,webDriver);
        cartPage.navigateToCartPage();
        webDriver.manage().deleteCookieNamed("guestCartId");
    }
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the Free Gift does not have a price", priority = 22)
    public void verifyTheFreeGiftIsDoesNotHavePrice() {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addBogoToCartAndDisplayTheCart();
        try{
            WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getFreePrice(),webDriver);
            webDriver.manage().deleteCookieNamed("guestCartId");
        }
        catch (Exception e){
            webDriver.manage().deleteCookieNamed("guestCartId");
        }
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the system apply Free Gift coupon code correctly", priority = 34)
    public void verifyAbilityToApplyFreeGiftCouponCode() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(),webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure to view the cart after adding more than quantity for the same product", priority = 14)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanQtyOfProduct() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        cartPage.addToCartAndViewCart();
        WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL,webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }
}
