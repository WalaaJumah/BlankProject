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
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.productPage.ProductDetailsPage;

public class KSACartRulesTestCases extends CartRulesTestCases{
    @BeforeClass(alwaysRun=true)
    public void switchToKsaStore(){
        KsaHomePage ksaHomePage=new KsaHomePage(webDriver);
        HeaderSection headerSection =new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if(webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)){
            System.out.println("You are in KSA Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+ksaHomePage.saudiDomain);
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
        cartPage.clearCart();
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
        productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(cartPage.getCartErrorMsg(),webDriver);
    }

}
