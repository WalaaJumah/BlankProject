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
import sporter_pages.homepage_classes.QatarHomePage;
import sporter_pages.productPage.ProductDetailsPage;

import java.io.IOException;

import static core.BasePage.BaseURL;

public class QatarCartRulesTestCases extends CartRulesTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToQatarStore() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchCountry(qatarHomePage.getQatarCountry());
        if (webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)) {
            System.out.println("You are in Qatar Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + qatarHomePage.qatarDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
        storeCountry="Qatar";
        countryCode="974";}
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 2 items of the same kind to the cart", priority = 1)
    public void verify2ItemOfTheSameKindRuleWorksCorrectly() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.keepShoppingAfterAddingToCart();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 3 items of the same kind to the cart by increasing the quantity to 3", priority = 2)
    public void verify2ItemOfTheSameKindRuleWorksCorrectlyWhenIncreasingTheQtyTo3() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 2 items of the same flavour & Size to the cart by increasing the QTY from the cart ", priority =3)
    public void verify2ItemOfTheSameKindRuleWorksCorrectlyWhenIncreasingTheQtyTo3FromCartPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
productDetailsPage.displayTheProduct();
productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 5 items to the cart", priority = 4)
    public void verifyInabilityToAddMoreThan5ItemsToTheCart() throws Exception {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSA1);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSA2);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSA3);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSA4);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSA5);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSA6);
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 5 items to the cart and 3 of them with the same kind", priority = 5)
    public void verifyInabilityToAddMoreThan5ItemsToTheCartAnd3OfThemWithTheSameKind() throws Exception {
        CartPage cartPage= new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSA2);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSA1);
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to checkout when adding 2 items of the same kind to the cart & total exceed 925 QAR (Tax excluded) ", priority = 6)
    public void verifyInabilityToCheckoutOrderWhenTheTotalExceed925QARByIncreasingTheQty() throws Exception {
        CartPage cartPage= new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        webDriver.navigate().to(BaseURL+cartPage.productUrlQatarWithHighPrice);
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL+cartPage.productUrlQatarWithHighPrice2);
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }
}
