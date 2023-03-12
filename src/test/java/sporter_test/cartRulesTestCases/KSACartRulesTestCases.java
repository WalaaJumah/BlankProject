/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.cartRulesTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.cartRulesPages.CartRulesPage;
import sporter_pages.cartRulesPages.KSACartRulesPage;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import static core.BasePage.BaseURL;

public class KSACartRulesTestCases extends CartRulesTestCases{
//    @BeforeClass(alwaysRun=true)
    @BeforeClass(alwaysRun=true)
    public void switchToKsaStore(){
        KsaHomePage ksaHomePage=new KsaHomePage(webDriver);
        HeaderSection headerSection =new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if(webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)){
            System.out.println("You are in KSA Store");
        }
        else {
            webDriver.navigate().to(BaseURL+ksaHomePage.saudiDomain);
            CloseInitialDialog();          }
        DataHelperAndWait.clickOnElement(headerSection.getLanguageSelector(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage,webDriver);
        System.out.println(webDriver.getCurrentUrl());
        storeCountry="المملكة العربية السعودية";
        countryCode="966";
    }
    //TODO: There's a bug here
    @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 3 items of the same kind to the cart", priority = 1)
    public void verify3ItemOfTheSameKindRuleWorksCorrectly(){
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSACartRulesPage ksaCartRulesPage= new KSACartRulesPage(webDriver);
//        ksaCartRulesPage.clearCart();
        webDriver.manage().deleteCookieNamed("guestCartId");
        productDetailsPage.keepShoppingAfterAddingToCart();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
    }
       @Test(groups = { "All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 3 items of the same kind to the cart by increasing the quantity to 3", priority = 2)
    public void verify3ItemOfTheSameKindRuleWorksCorrectlyWhenIncreasingTheQtyTo3(){
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
        KSACartRulesPage ksaCartRulesPage= new KSACartRulesPage(webDriver);
//        ksaCartRulesPage.clearCart();
           webDriver.manage().deleteCookieNamed("guestCartId");
           productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
//        DataHelperAndWait.clickOnElement(cartPage.getCartErrorMsg(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
    }
       @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 3 items of the same kind to the cart by increasing the quantity to 3 from the Cart Page", priority = 3)
    public void verify3ItemOfTheSameKindRuleWorksCorrectlyWhenIncreasingTheQtyTo3FromCartPage(){
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
//        cartPage.clearCart();
           webDriver.manage().deleteCookieNamed("guestCartId");
           productDetailsPage.displayTheProduct();
           productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getIncreaseQtyBtn(),webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getProceedCheckoutBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
//        tearDown();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 5 items to the cart", priority = 4)
    public void verifyInabilityToAddMoreThan5ItemsToTheCart() throws Exception {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartPage cartPage= new CartPage(webDriver);
//        setupBrowserFromTheClass(environmentName,browserName,countryUrl,cartPage.bogoProduct,cartPage.oOSProductUrl,cartPage.bundleUrl);
//        switchToKsaStore();
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
//        tearDown();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to add more than 5 items to the cart and 3 of them with the same kind", priority = 5)
    public void verifyInabilityToAddMoreThan5ItemsToTheCartAnd3OfThemWithTheSameKind() throws Exception {
        CartPage cartPage= new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartRulesPage cartRulesPage= new CartRulesPage(webDriver);
//        setupBrowserFromTheClass(environmentName,browserName,countryUrl,cartPage.bogoProduct,cartPage.oOSProductUrl,cartPage.bundleUrl);
//        switchToKsaStore();
        webDriver.manage().deleteCookieNamed("guestCartId");
//        cartRulesPage.clearAllItems(5);
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSA2);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSA1);
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
//        tearDown();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure that inability to checkout the order when its total exceed 819 SAR (Tax excluded) ", priority = 6)
    public void verifyInabilityToCheckoutOrderWhenTheTotalExceed819SAR() throws Exception {
        CartPage cartPage= new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        CartRulesPage cartRulesPage= new CartRulesPage(webDriver);
//        setupBrowserFromTheClass(environmentName,browserName,countryUrl,cartPage.bogoProduct,cartPage.oOSProductUrl,cartPage.bundleUrl);
//        switchToKsaStore();
        webDriver.manage().deleteCookieNamed("guestCartId");
//        cartRulesPage.clearAllItems(4);
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSAWithHighPrice1);
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        webDriver.navigate().to(BaseURL+cartPage.productUrlKSAWithHighPrice2);
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
//        tearDown();
    }
}