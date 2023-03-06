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
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.productPage.ProductDetailsPage;

import java.text.DecimalFormat;

public class JordanCartTestCases extends CartTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToJordanStore() {
        JordanHomePage jordanHomePage = new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if (webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + jordanHomePage.jordanDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }

    @Test(enabled = false)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanQtyOfProduct() {
    }

    @Test(enabled = false)
    public void verifyTheTaxCalculatedCorrectly() {
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 26)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(),webDriver,"JOD");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(),webDriver,"JOD");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(),webDriver,"JOD");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
        cartPage.removeItem();
    }
@Test(enabled = false)
public void verifyIncreaseQtyBtnInCartPageWorking() {}
    @Test(enabled = false)
    public void verifyProductPriceChangesWhenChangingTheProductQtyFromTheCartPage(){}
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the Free Gift is removed from the cart when you remove the product For Bogo", priority = 11)
    public void verifyTheFreeGiftIsRemovedWhenRemovingTheProductForBogo() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        cartPage.removeItem();
        cartPage.addBogoToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getFreeFromSporterLabelInProductCard(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure that the product counter that appears in the cart page counts the free gift correctly", priority = 12)
    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts() {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
        String itemsCounter = "2";
        WebElementsAssertion.assertionTextIsEqual(cartPage.getItemsCounter(),webDriver,itemsCounter);
    }



    }
