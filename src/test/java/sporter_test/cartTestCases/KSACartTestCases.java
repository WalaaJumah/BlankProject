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
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.text.DecimalFormat;

public class KSACartTestCases extends CartTestCases {
    @BeforeClass(alwaysRun=true)
    public void switchToKsaStore(){
        KsaHomePage ksaHomePage=new KsaHomePage(webDriver);
        HeaderSection headerSection =new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if(webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)){
            System.out.println("You are in KSA Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+ksaHomePage.saudiDomain);
            CloseInitialDialog();          }
        DataHelperAndWait.clickOnElement(headerSection.getLanguageSelector(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage,webDriver);
        System.out.println(webDriver.getCurrentUrl());

    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure the tax calculate correctly", priority = 30)
//    public void verifyTheTaxCalculatedCorrectly() {
//        DecimalFormat df = new DecimalFormat("0.00");
//        CartPage cartPage = new CartPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
//        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(),webDriver,"SAR");
//        float tax = subTotal * (float) (0.15);
//        float expectedCartTotal = subTotal + tax;
//        float actualCartTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(),webDriver,"SAR");
//        Assert.assertEquals(df.format(actualCartTotal), df.format(expectedCartTotal));
//        cartPage.removeItem();
//    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 26)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(),webDriver,"SAR");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(),webDriver,"SAR");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(),webDriver,"SAR");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
        cartPage.removeItem();
    }
    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the counter-number appears inside the cart pop-up works correctly", priority = 4)
    public void verifyTheCounterInsideCartPopUpWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(),webDriver);
        itemsCounter = "(1 من 1 الاصناف )";
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
        cartPage.removeItem();
    }
    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the system cancel the coupon code correctly", priority = 35)
    public void verifyAbilityToCancelTheCouponCode() {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCancelCouponCodeBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(),webDriver);
        DataHelperAndWait.refreshPage(webDriver);
//        cartPage.removeItem();
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Verify that the search button works correctly from the Cart Page", priority = 30)
    public void verifySearchBtnWorksCorrectlyFromCartPage() {
        CartPage cartPage=new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage.navigateToCartPage();
        DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString("search",webDriver);
    }
}

