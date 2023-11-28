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
import sporter_pages.myAccountPages.KuwaitMyAccountPage;

import java.io.IOException;

public class KuwaitCartTestCases extends CartTestCases{
    @BeforeClass(alwaysRun = true)
    public void switchToKuwaitStore() {
        KuwaitMyAccountPage kuwaitMyAccountPage = new KuwaitMyAccountPage(webDriver);
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(kuwaitMyAccountPage.getKuwaitCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.kuwaitDomain)) {
            System.out.println("You are in Kuwait Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.kuwaitDomain);
            //CloseInitialDialog();
        }
        storeCountry="Kuwait";
        System.out.println(webDriver.getCurrentUrl());
    }
    @Test(enabled = false,groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure Tamara Widget appears correctly in the cart page ", priority = 43)
    public void verifyTamaraWidgetAppearsCorrectlyInTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getTamaraWidget(),webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the order total calculation in the cart page works correctly", priority = 24)
    public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, "KWD");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver, "KWD");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, "KWD");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }
}
