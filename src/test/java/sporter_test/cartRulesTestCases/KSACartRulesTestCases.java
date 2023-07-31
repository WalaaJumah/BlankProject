/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.cartRulesTestCases;

import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.productPage.ProductDetailsPage;

import java.io.IOException;

import static core.BasePage.BaseURL;

public class KSACartRulesTestCases extends CartRulesTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        HeaderSection headerSection = new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if (webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            System.out.println("You are in KSA Store");
        } else {
            webDriver.navigate().to(BaseURL + ksaHomePage.saudiDomain);
            //CloseInitialDialog();
        }
        try {
            DataHelperAndWait.clickOnElement(headerSection.getLanguageSelector(), webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        catch (Exception e){
            webDriver.navigate().to(BaseURL+ksaSiteURL);
        }
        System.out.println(webDriver.getCurrentUrl());
        storeCountry = "المملكة العربية السعودية";
        countryCode = "966";
    }

    //TODO: There's a bug here
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 3 items of the same kind to the cart", priority = 1)
    public void verify3ItemOfTheSameKindRuleWorksCorrectly() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();

        DataHelperAndWait.waitToBeVisible(productDetailsPage.getQuantityField(),webDriver);
        DataHelperAndWait.updateAllText(productDetailsPage.getQuantityField(),"4");
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 3 items of the same kind to the cart by increasing the quantity to 3", priority = 2)
    public void verify3ItemOfTheSameKindRuleWorksCorrectlyWhenIncreasingTheQtyTo3() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 3 items of the same kind to the cart by increasing the quantity to 3 from the Cart Page", priority = 3)
    public void verify3ItemOfTheSameKindRuleWorksCorrectlyWhenIncreasingTheQtyTo3FromCartPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        DataHelperAndWait.waitToBeVisible(cartPage.getQtyField(),webDriver);
        DataHelperAndWait.updateAllText(cartPage.getQtyField(),"4");
                DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(), webDriver);


//        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(), webDriver);
//        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);

        DataHelperAndWait.refreshPage(webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 5 items to the cart", priority = 4)
    public void verifyInabilityToAddMoreThan5ItemsToTheCart() throws Exception {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        webDriver.navigate().to(BaseURL + cartPage.productUrlKSA1);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL + cartPage.productUrlKSA2);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL + cartPage.productUrlKSA3);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL + cartPage.productUrlKSA4);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL + cartPage.productUrlKSA5);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL + cartPage.productUrlKSA6);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 5 items to the cart and 3 of them with the same kind", priority = 5)
    public void verifyInabilityToAddMoreThan5ItemsToTheCartAnd3OfThemWithTheSameKind() throws Exception {
        CartPage cartPage = new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        webDriver.navigate().to(BaseURL + cartPage.productUrlKSA2);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL + cartPage.productUrlKSA1);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }

    //TODO: https://sporter1.atlassian.net/browse/NS-470
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to checkout the order when its total exceed 819 SAR (Tax excluded) ", priority = 6)
    public void verifyInabilityToCheckoutOrderWhenTheTotalExceed819SAR() throws Exception {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.displayTheProduct();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        DataHelperAndWait.waitForTime(2500);
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(), webDriver);
        DataHelperAndWait.waitForTime(2500);
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(), webDriver);
        DataHelperAndWait.waitForTime(2500);

         webDriver.navigate().to(BaseURL + cartPage.productUrlKSAWithHighPrice3);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.addToCart();

        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }

    //TODO: https://sporter1.atlassian.net/browse/NS-470
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to checkout when adding 2 items of the same kind to the cart & total exceed 819 SAR (Tax excluded) ", priority = 7)
    public void verifyInabilityToCheckoutOrderWhenTheTotalExceed819SARByIncreasingTheQty() throws Exception {
        CartPage cartPage = new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        webDriver.manage().deleteCookieNamed("guestCartId");
        webDriver.navigate().to(BaseURL + cartPage.productUrlKSAWithHighPrice3);
        cartPage.verifyTheDisplayedPageDoesNotHaveErrors();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(), webDriver);
        DataHelperAndWait.refreshPage(webDriver);
    }
}