/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.cartRulesTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.productPage.ProductDetailsPage;

import java.io.IOException;

import static core.BasePage.BaseURL;

public class JordanCartRulesTestCases extends CartRulesTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToJordanStore() {
        JordanHomePage jordanHomePage = new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if (webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + jordanHomePage.jordanDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
        storeCountry = "Jordan";
        countryCode = "962";
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than an item of the same flavour & Size to the cart ", priority = 1)
    public void verify2ItemOfTheSameKindRuleWorksCorrectlyWhenIncreasingTheQtyTo2FromProductPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        DataHelperAndWait.waitForTime(1500);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than an item of the same flavour & Size to the cart by increasing the QTY from the cart ", priority = 2)
    public void verify2ItemOfTheSameKindRuleWorksCorrectlyWhenIncreasingTheQtyTo2FromCartPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        try{
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        DataHelperAndWait.waitToBeVisible(cartPage.getIncreaseQtyBtn(), webDriver);
            DataHelperAndWait.waitForTime(2000);
            DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(), webDriver);
        DataHelperAndWait.waitForTime(2000);
        cartPage.proceedToCheckout();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");}
        catch (Exception E){
            webDriver.manage().deleteCookieNamed("guestCartId");
            productDetailsPage.displayTheProduct();
            productDetailsPage.addToCart();
            productDetailsPage.viewCart();
            DataHelperAndWait.waitToBeVisible(cartPage.getIncreaseQtyBtn(), webDriver);
            DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(), webDriver);
            DataHelperAndWait.waitForTime(2000);
            cartPage.proceedToCheckout();
            WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
            DataHelperAndWait.refreshPage(webDriver);
            webDriver.manage().deleteCookieNamed("guestCartId");
        }

    }

    //TODO:https://sporter1.atlassian.net/browse/NS-488
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to checkout the order when its total exceed 120 JOD (Tax excluded) ", priority = 3)
    public void verifyInabilityToCheckoutOrderWhenTheTotalExceed120JOD() throws Exception {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
//        loginPage.navigateToLoginPage();
//        loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail2"), XmlReader.getXMLData("correctPassword"));
//        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
//        DataHelperAndWait.waitForTime(2000);
//        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
//        DataHelperAndWait.waitForTime(2000);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        webDriver.navigate().to(BaseURL + cartPage.productUrlJordanWithHighPrice);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL + cartPage.productUrlJordanWithHighPrice2);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.addToCart();
        DataHelperAndWait.waitForTime(2000);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }
}