package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.ProductDetailsPage;

public class ProductDetailsPageTestCases extends BaseTest {
    private ProductDetailsPage productDetailsPage;

  //  public ProductDetailsPageTestCases(WebDriver webDriver) {

   // }

    @Test(description = "Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 1)
    public void keepShoppingAfterAddingToTheCart() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        String currentURL = webDriver.getCurrentUrl() + "#";
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL);
    }
    @Test(description = "Make sure the shopper is able to View the cart after adding the product to it ", priority = 2)
    public void viewCartAfterAddingTheProductToIt() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 20);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.sporter.com/en-ae/checkout/cart/");
    }
    @Test(description = "Make sure the out of stock message appears when displaying out of stock product ", priority = 3)
    public void verifyOOSMessageIsDisplayed() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        webDriver.navigate().to(outOfStockProduct);
        productDetailsPage.switchCountry();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getOOSMsg(), 10);
        Assert.assertTrue(productDetailsPage.getOOSMsg().isDisplayed());
    }
    @Test(description = "Make sure the shopper is unable to add out of stock product to the cart", priority = 4)
    public void verifyUnabilityToAddOosProductToTheCart() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        webDriver.navigate().to(outOfStockProduct);
        productDetailsPage.switchCountry();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getOOSMsg(), 10);
        Assert.assertFalse(DataHelperAndWait.isWebElementPresent(productDetailsPage.getAddToCartBtn()));
    }
    @Test(description = "Make sure to display the product from search screen", priority = 5)
    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnSearchBtn();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductCard(), 20);
        productDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddToCartBtn(), 10);
        Assert.assertTrue(productDetailsPage.getAddToCartBtn().isDisplayed());
    }
    @Test(description = "Make sure the system will display a message when the offer is not available in the selected country", priority = 6)
    public void verifyUnabilityToDisplayUnAvailableOffer() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.switchToOmanCountry();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductUnavialableForCountry(), 10);
        Assert.assertTrue(productDetailsPage.getProductUnavialableForCountry().isDisplayed());
    }
    @Test(description = "Make sure that the increase quantity function works fine ", priority = 7)
    public void verifyIncreaseQuantityButtonWorkingFine() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddToCartBtn(), 10);
        productDetailsPage.increaseTheQuantity();
        Assert.assertEquals(productDetailsPage.getQuantityField().getAttribute("value"), "2");
    }
    @Test(description = "Make sure that the Decrease quantity function works fine ", priority = 8)
    public void verifyDecreaseQuantityButtonWorkingFine() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddToCartBtn(), 10);
        productDetailsPage.increaseTheQuantity();
        Assert.assertEquals(productDetailsPage.getQuantityField().getAttribute("value"), "2");
        productDetailsPage.decreaseTheQuantity();
        Assert.assertEquals(productDetailsPage.getQuantityField().getAttribute("value"), "1");
    }
    @Test(description = "Make sure that the customer can submit his review successfully ", priority = 9)
    public void verifyAbilityToSubmitTheProductReview() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddReviewButton(), 10);
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview("Review Description", "Review Summary", "Wala'a Mohammad");
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getReviewToastMsg(), 10);
        Assert.assertTrue(productDetailsPage.getReviewToastMsg().isDisplayed());
    }
    @Test(description = "Make sure that the customer is unable to submit his review without selecting any star ", priority = 10)
    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 5);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddReviewButton(), 10);
        productDetailsPage.submitProductReview("Review Description", "Review Summary", "Wala'a Mohammad");
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getReviewErrorMsg(), 5);
        Assert.assertTrue(productDetailsPage.getReviewErrorMsg().isDisplayed());
    }
    @Test(description = "Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 11)
    public void verifyAbilityToFillTheReviewWIthLongLength() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 5);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddReviewButton(), 10);
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview("Review Description With Long Length Review Description With Long LengthReReview Description With Long Length Review Description With Long Lengthview Description With Long Length ", "Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length ", "Abd-Alrahman Abd Alazez Abdullah Mohammad Khair");
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getReviewToastMsg(), 5);
        Assert.assertTrue(productDetailsPage.getReviewToastMsg().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
    public void verifyAbilityToNavigatetToHomePageUsingTheBreadCrumb() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 5);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getHomeBreadcrumbs(), 5);
        productDetailsPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), aeSiteURL);
    }
    @Test(description = "Make sure that the customer can switch to Arabic Language from PDP ", priority = 13)
    public void verifyAbilityToSwitchToArabicVersionFromPDP() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 5);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getLanguageSwitcher(), 10);
        productDetailsPage.switchToArabicVersion();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getEnglishLangBtn(), 5);
        Assert.assertTrue(productDetailsPage.getEnglishLangBtn().isDisplayed());
    }
    @Test(description = "Make sure that the customer can add the same product more than once by clicking on theAddToProduct button in each time ", priority = 14)
    public void verifyAbilityToAddProductToCartMultiTimes() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        String oldProductURL = webDriver.getCurrentUrl();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        String newProductURL = webDriver.getCurrentUrl();
        Assert.assertEquals(oldProductURL, newProductURL);
    }
    @Test(description = "Make sure that the product price is changed when you change the quantity ", priority = 15)
    public void verifyTheProductPriceChangesBasedOnTheSelectedQty() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddToCartBtn(), 10);
        String currectProductPrice = productDetailsPage.getProductPrice().getText();
      String newProductPrice = productDetailsPage.getProductPrice().getText();
        Assert.assertNotEquals(currectProductPrice, newProductPrice);
    }
    @Test(description = "Make sure that the customer cannot add more than 2 Qty for the same product when switching to Jordan Store", priority = 16)
    public void verifyUnabilityToAddMoreThan2QtyForJOStore(){
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.switchToJOCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getInconvenienceWarningMsg(), 10);
        Assert.assertTrue(productDetailsPage.getInconvenienceWarningMsg().isDisplayed());
    }
    @Test(description = "Make sure ability to display the bundle and select all options", priority = 17)
    public void verifyAbilityToDisplayBundleAndSelectAllOptions() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.searchForBundle();
        productDetailsPage.clickOnSearchBtn();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductCard(), 20);
        productDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), 20);
        Select select=new Select(productDetailsPage.getBundleMenu());
        WebElement currentSelectedOption= select.getFirstSelectedOption();
        String currentSelectedOptionText= currentSelectedOption.getText();
        DataHelperAndWait.selectAllDropDownListOptions(select);
        WebElement newSelectedOption= select.getFirstSelectedOption();
        String newSelectedOptionText= newSelectedOption.getText();
        Assert.assertNotEquals(currentSelectedOptionText,newSelectedOptionText);
    }
    @Test(description = "Verify that the system display a label on the PDP to indicate for the customer he will get a free product", priority = 18)
    public void verifyTheresLabelInPdpToIndicateThatTheresAnOfferOnThisProduct(){
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(),10);
        productDetailsPage.clickOnFirstProductInTheCategoryList();
             DataHelperAndWait.waitToBeVisible(productDetailsPage.getFreeProductLabel(), 10);
        Assert.assertTrue(productDetailsPage.getFreeProductLabel().isDisplayed());
    }
}