/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.cartRulesTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.Getter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.homepage_classes.IraqHomePage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_test.AccountRegistrationTestCases.AccountRegistrationTestCases;

import java.io.IOException;

import static core.BasePage.BaseURL;

@Getter
public class IraqCartRulesTestCases extends CartRulesTestCases {
    @BeforeClass(alwaysRun = true)
    public void IraqCartRulesTestCases() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        if (!webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
        }
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than an item of the same flavour & Size to the cart ", priority = 1)
    public void verify3ItemOfTheSameKindRuleWorksCorrectlyWhenIncreasingTheQtyTo2FromProductPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct(cartPage.productUrlIraq2);
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
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
            cartPage.increaseQty();
            productDetailsPage.viewCart();
            cartPage.increaseQty();
            cartPage.proceedToCheckout();
            WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
            DataHelperAndWait.refreshPage(webDriver);
            webDriver.manage().deleteCookieNamed("guestCartId");}
        catch (Exception E){
            webDriver.manage().deleteCookieNamed("guestCartId");
            productDetailsPage.displayTheProduct();
            productDetailsPage.addToCart();
            productDetailsPage.viewCart();
            cartPage.increaseQty();
            cartPage.proceedToCheckout();
            WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
            DataHelperAndWait.refreshPage(webDriver);
            webDriver.manage().deleteCookieNamed("guestCartId");
        }

    }

    //TODO:https://sporter1.atlassian.net/browse/NS-488
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to checkout the order when its total exceed 120 JOD (Tax excluded) ", priority = 3)
    public void verifyInabilityToCheckoutOrderWhenTheTotalExceed500USD() throws Exception {
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
//        loginPage.navigateToLoginPage();
//        loginPage.fillinLoginForm(XmlReader.getXMLData("correctEmail2"), XmlReader.getXMLData("correctPassword"));
//        DataHelperAndWait.clickOnElement(loginPage.getLoginBtn(), webDriver);
//        DataHelperAndWait.waitForTime(2000);
//        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
//        DataHelperAndWait.waitForTime(2000);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct(cartPage.productUrlIraqHighPrice);
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        productDetailsPage.displayTheProduct(cartPage.productUrlIraqHighPrice2);
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        productDetailsPage.displayTheProduct(cartPage.productUrlIraqHighPrice3);
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }
}
