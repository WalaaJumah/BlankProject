/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription CartTestCases
 */

package sporter_test.cartTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.megaMenuPages.EgyptMegaMenuPage;
import sporter_pages.megaMenuPages.MegaMenuPage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class EgyptCartTestCases extends CartTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Egypt Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            //CloseInitialDialog();
        }

    }

    @Test(enabled = false)
    public void verifyTheTaxCalculatedCorrectly() {
    }

@Test(enabled = false)
public void verifyOrderTotalCalculationInCartPageWorksCorrectly() throws IOException {
    CartPage cartPage = new CartPage(webDriver);
    cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        float subTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getSubTotalValue(), webDriver, "EGP");
        float tax = DataHelperAndWait.convertTheStringToFloat(cartPage.getTaxValue(), webDriver, "EGP");
        float orderTotal = DataHelperAndWait.convertTheStringToFloat(cartPage.getOrderTotalValue(), webDriver, "EGP");
        double cartTotal = subTotal + tax;
        Assert.assertEquals(orderTotal, cartTotal);
        webDriver.manage().deleteCookieNamed("guestCartId");
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Verify ability to click on  Vitamins And Health Menu From cart Page", priority = 38)
    public void verifyAbilityToClickOnVitaminsAndHealthMenuFromCartPage() throws IOException {
        EgyptMegaMenuPage megaMenuPage = new EgyptMegaMenuPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        megaMenuPage.clickOnVitaminsAndHealthMainMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl, webDriver);
        }
        catch (Exception e){
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl+"/", webDriver);
        }
    }
@Test(enabled = false)
public void verifyAbilityToClickOnSportsMenuIsDisplayedFromCartPage() throws IOException {
        EgyptMegaMenuPage megaMenuPage = new EgyptMegaMenuPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        megaMenuPage.clickOnSportsMainMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.sportsUrl,webDriver);
        }
        catch (Exception e){
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.sportsUrl+"/", webDriver);
        }
    }

    //TODO: This test case should be revisit after solving: https://sporter1.atlassian.net/browse/NS-120 & https://sporter1.atlassian.net/browse/NS-42
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the product counter that appears in the cart page counts the free gift correctly", priority = 12)
    public void verifyProductCounterAppearsInTheCartPageCountsFreeGifts() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the view Cart button appearing in the Cart pop-up works correctly", priority = 7)
    public void verifyAbilityToViewCartFromCartIcon() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.waitToBeVisible(cartPage.getCartIcon(),webDriver);
        cartPage.getCartIcon().click();
        cartPage.getViewCartInCartPopup().click();
//        DataHelperAndWait.clickOnElement(cartPage.getViewCartInCartPopup(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(cartPage.cartURL, webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the system does not apply invalid coupon code", priority = 26)
    public void verifyInabilityToApplyInvalidCouponCode() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        DataHelperAndWait.typeTextInElement(cartPage.getCouponCodeField(), webDriver, XmlReader.getXMLData("invalidCouponCode"));
        DataHelperAndWait.clickOnElement(cartPage.getApplyCouponCodeBtn(), webDriver);
        DataHelperAndWait.clickOnElement(cartPage.getCloseAddToCartErrorMsg(), webDriver);
//        cartPage.removeItem();
    }

    @Test(enabled = false)
    public void verifyAbilityToViewTheCartAfterAddingMoreThanSimpleOfTheSameConfig() {
    }

    @Test(groups = {"1.3 Medium Severity"}, description = " Cart Page- Make sure ability to add a bundle to the cart ", priority = 17)
    public void verifyAbilityToAddBundleToCart() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        WebDriverWait wait;
        webDriver.navigate().to(BasePage.BaseURL + "/organic-nation-secrets-protein-bar-box-of-12-55997");
        try {
            try {
                productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
            } catch (AssertionError e) {
                throw new RuntimeException("The product is not found: " + webDriver.getCurrentUrl());
            }
        }
        catch (Exception e){}
        try{
        productDetailsPage.displayBundle();}
        catch (Exception e){DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), webDriver);
            Select select = new Select(productDetailsPage.getBundleMenu());
            List<WebElement> elementCount = select.getOptions();
            int menuSize = elementCount.size();
            for (int i = 0; i < menuSize; i++) {
                try {
                    select.selectByIndex(i);
                    wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
                    wait.until(ExpectedConditions.visibilityOf(productDetailsPage.getAddToCartBtn())).isDisplayed();
                    productDetailsPage.getAddToCartBtn().click();
                    productDetailsPage.viewCart();
                    break;
                } catch (Exception e1) {
                    productDetailsPage.getCloseToCartErrorPopUp().click();
                }
            }
            WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL, webDriver);
            webDriver.manage().deleteCookieNamed("guestCartId");}

    }
    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify ability to display the product from the Cart Page works successfully", priority = 19)
    public void verifyAbilityToDisplayTheProductFromTheCartPage() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        cartPage.navigateToCartOrAddProductToItInCaseTheCartIsEmpty();
        cartPage.waitTillCartSpinnerDisappear(webDriver);
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.waitToBeClickable(cartPage.getProductNameForOneProduct(), webDriver);
        cartPage.getProductNameForOneProduct().click();
//        DataHelperAndWait.clickOnElement(cartPage.getProductNameForOneProduct(), webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductName(), webDriver);
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure that the counter-number appears in the cart icon works correctly", priority = 31)
    public void verifyTheCounterInCartIconWorksCorrectly() {
        CartPage cartPage = new CartPage(webDriver);
        WebElementsAssertion.assertionTextIsEqual(cartPage.getCartCounter(), webDriver, "1");
    }
}
