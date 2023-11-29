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
import sporter_pages.myAccountPages.OmanMyAccountPage;

import java.io.IOException;

public class OmanCartTestCases extends CartTestCases{
    @BeforeClass(alwaysRun = true)
    public void switchToOmanStore() {
        OmanMyAccountPage omanMyAccountPage = new OmanMyAccountPage(webDriver);
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(omanMyAccountPage.getOmanCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.omanDomain)) {
            System.out.println("You are in Oman Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.omanDomain);
            //CloseInitialDialog();
        }
    }
    @Test(enabled = false,groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 24)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, "OMR");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver, "OMR");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, "OMR");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
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
}
