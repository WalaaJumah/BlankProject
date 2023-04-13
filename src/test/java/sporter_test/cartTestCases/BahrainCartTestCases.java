/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
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
import sporter_pages.myAccountPages.BahrainMyAccountPage;

public class BahrainCartTestCases extends CartTestCases{
    @BeforeClass(alwaysRun = true)
    public void switchToBahrainStore() {
        BahrainMyAccountPage bahrainMyAccountPage = new BahrainMyAccountPage(webDriver);
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(bahrainMyAccountPage.getBahrainCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.bahrainDomain)) {
            System.out.println("You are in Bahrain Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.bahrainDomain);
            CloseInitialDialog();
        }
    }
    @Test(enabled = false,groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 24)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addToCartAndDisplayTheCart();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, "BHD");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver, "BHD");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, "BHD");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 21)
    public void verifyAllPaymentMethodAppearingTheCartPage() {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        cartPage.addToCartAndDisplayTheCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }
}
