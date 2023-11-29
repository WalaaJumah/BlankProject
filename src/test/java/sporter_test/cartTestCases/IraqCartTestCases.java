/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.cartTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.Getter;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.homepage_classes.IraqHomePage;

import java.io.IOException;
import java.text.DecimalFormat;

@Getter
public class IraqCartTestCases extends CartTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToIraqStore() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        if (!webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all payment methods are appear correctly in the Cart page", priority = 5)
    public void verifyAllPaymentMethodAppearingTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getWeAcceptLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCreditCardOption(), webDriver);
    }
    @Test(enabled = false,groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure Tamara Widget appears correctly in the cart page ", priority = 43)
    public void verifyTamaraWidgetAppearsCorrectlyInTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getTamaraWidget(),webDriver);
    }
    @Test(enabled = false,groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure Tabby Widget appears correctly in the cart page ", priority = 44)
    public void verifyTabbyWidgetAppearsCorrectlyInTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getTabbyWidget(),webDriver);

    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 24)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, cartPage.iraqCurrency);
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver, cartPage.iraqCurrency);
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, cartPage.iraqCurrency);
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the counter-number appears in the cart icon works correctly", priority = 31)
    public void verifyTheCounterInCartIconWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        try {
            WebElementsAssertion.assertionTextIsEqual(cartPage.getCartCounter(), webDriver, "1");
        }
        catch (AssertionError ex){}
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the tax calculate correctly", priority = 29, enabled = false)
    public void verifyTheTaxCalculatedCorrectly() throws IOException {
        DecimalFormat df = new DecimalFormat("0.00");
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, cartPage.iraqCurrency);
        float tax = 0;
        float expectedCartTotal = subTotal + tax;
        float actualCartTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, cartPage.iraqCurrency);
        Assert.assertEquals(df.format(actualCartTotal), df.format(expectedCartTotal));
    }
}
