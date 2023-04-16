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
    public void verifyDecreaseQtyBtnInCartPageWorking() {
    }

    @Test(enabled = false)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanQtyOfProduct() {
    }

    @Test(enabled = false)
    public void verifyTheTaxCalculatedCorrectly() {
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 26)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
        cartPage.navigateToCartPage();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, "JOD");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver, "JOD");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, "JOD");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
//        cartPage.removeItem();
    }

    @Test(enabled = false)
    public void verifyIncreaseQtyBtnInCartPageWorking() {
    }

    @Test(enabled = false)
    public void verifyProductPriceChangesWhenChangingTheProductQtyFromTheCartPage() {
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the Free Gift is removed from the cart when you remove the product For Bogo", priority = 12)
    public void verifyTheFreeGiftIsRemovedWhenRemovingTheProductForBogo() {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getFreeFromSporterLabelInProductCard(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getNoItemInCartLabel(), webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the product counter that appears in the cart page counts the free gift correctly", priority = 11)
    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addBogoToCartAndDisplayTheCart();
        String itemsCounter = "1";
        WebElementsAssertion.assertionTextIsEqual(cartPage.getItemsCounter(), webDriver, itemsCounter);
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 21)
    public void verifyAllPaymentMethodAppearingTheCartPage() {
        CartPage cartPage = new CartPage(webDriver);
//        cartPage.addToCartAndDisplayTheCart();
        cartPage.addToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCODOption(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that the view Cart button appearing in the Cart pop-up works correctly", priority = 7)
    public void verifyAbilityToViewCartFromCartIcon() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(cartPage.getCartIcon(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getViewCartInCartPopup(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify ability to display the product from the Cart Page works successfully", priority = 19)
    public void verifyAbilityToDisplayTheProductFromTheCartPage() {
        CartPage cartPage = new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProductNameForOneProduct(), webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductName(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlNotContainsString(cartPage.cartURL, webDriver);
        cartPage.navigateToCartPage();
        webDriver.manage().deleteCookieNamed("guestCartId");
    }

}
