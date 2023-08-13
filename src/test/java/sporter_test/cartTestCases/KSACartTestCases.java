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

import java.io.IOException;

public class KSACartTestCases extends CartTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if (webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            System.out.println("You are in KSA Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
            //CloseInitialDialog();
        }
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        catch (Exception e){
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        System.out.println(webDriver.getCurrentUrl());

    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 26)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, "SAR");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver, "SAR");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, "SAR");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the counter-number appears inside the cart pop-up works correctly", priority = 4)
    public void verifyTheCounterInsideCartPopUpWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        itemsCounter = "(1 من 1 الاصناف )";
        DataHelperAndWait.waitToBeVisible(cartPage.getItemCounterInCartPopUp(), webDriver);

    }

    //TODO: This test case should be revisit after solving: https://sporter1.atlassian.net/browse/NS-120 & https://sporter1.atlassian.net/browse/NS-42
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the product counter that appears in the cart page counts the free gift correctly", priority = 12)
    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the system does not apply invalid coupon code", priority = 26)
    public void verifyInabilityToApplyInvalidCouponCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(), webDriver, XmlReader.getXMLData("invalidCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseAddToCartErrorMsg(), webDriver);
//        cartPage.removeItem();
    }

    @Test(enabled = false)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanSimpleOfTheSameConfig() {
    }

    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the system cancel the coupon code correctly", priority = 35)
    public void verifyAbilityToCancelTheCouponCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(), webDriver, XmlReader.getXMLData("FreeCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCancelCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseCouponSuccessfulMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
//        cartPage.removeItem();
    }
}

