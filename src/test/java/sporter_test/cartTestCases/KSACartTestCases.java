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
    @Test(groups = {"Cart Page","All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure the tax calculate correctly", priority = 30)
    public void verifyTheTaxCalculatedCorrectly() {
        DecimalFormat df = new DecimalFormat("0.00");
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(),webDriver,"SAR");
        float tax = subTotal * (float) (0.15);
        float expectedCartTotal = subTotal + tax;
        float actualCartTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(),webDriver,"SAR");
        Assert.assertEquals(df.format(actualCartTotal), df.format(expectedCartTotal));
        cartPage.removeItem();
    }
    @Test(groups = {"Cart Page","All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 26)
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
}
