package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.CartPage;
import sporter_pages.ProductDetailsPage;

import static org.testng.Assert.*;

public class ProductDetailsPageTestCases extends BaseTest {
    private ProductDetailsPage productDetailsPage;
    AEMegaMenuTestCases aeMegaMenuTestCases  ;
    String productUrl="https://www.sporter.com/en-ae/dymatize-iso-100-6350";

    @Test(description = "Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 1)
    public void keepShoppingAfterAddingToTheCart() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        String currentURL = webDriver.getCurrentUrl() + "#";
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL);
    }

    @Test(description = "Make sure the shopper is able to View the cart after adding the product to it ", priority = 2)
    public void viewCartAfterAddingTheProductToIt() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.sporter.com/en-ae/checkout/cart/");
    }

    @Test(description = "Make sure the out of stock message appears when displaying out of stock product ", priority = 3)
    public void verifyOOSMessageIsDisplayed() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchToAeCountry();
        webDriver.navigate().to(outOfStockProduct);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getOOSMsg(), 10);
        assertTrue(productDetailsPage.getOOSMsg().isDisplayed());
    }

    @Test(description = "Make sure the shopper is unable to add out of stock product to the cart", priority = 4)
    public void verifyUnabilityToAddOosProductToTheCart() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        webDriver.navigate().to(outOfStockProduct);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getOOSMsg(), 10);
        Assert.assertFalse(DataHelperAndWait.isPresent(productDetailsPage.getAddToCartBtn()));
    }

    @Test(description = "Make sure to display the product from search screen", priority = 5)
    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnSearchBtn();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductCard(), 20);
        productDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddToCartBtn(), 10);
        assertTrue(productDetailsPage.getAddToCartBtn().isDisplayed());
    }

    @Test(description = "Make sure the system will display a message when the offer is not available in the selected country", priority = 6)
    public void verifyUnabilityToDisplayUnAvailableOffer() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.switchToLebanonCountry();
        assertTrue(productDetailsPage.getProductUnavialableForCountry().isDisplayed());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertTrue(verifyTitle, "Page Not Found Is Displayed");
    }

    @Test(description = "Make sure that the increase quantity function works fine ", priority = 7)
    public void verifyIncreaseQuantityButtonWorkingFine() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddToCartBtn(), 10);
        productDetailsPage.increaseTheQuantity();
        Assert.assertEquals(productDetailsPage.getQuantityField().getAttribute("value"), "2");
    }

    @Test(description = "Make sure that the Decrease quantity function works fine ", priority = 8)
    public void verifyDecreaseQuantityButtonWorkingFine() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
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
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddReviewButton(), 10);
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview("Review Description", "Review Summary", "Wala'a Mohammad");
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getReviewToastMsg(), 10);
        assertTrue(productDetailsPage.getReviewToastMsg().isDisplayed());
    }

    @Test(description = "Make sure that the customer is unable to submit his review without selecting any star ", priority = 10)
    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddReviewButton(), 10);
        productDetailsPage.submitProductReview("Review Description", "Review Summary", "Wala'a Mohammad");
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getReviewErrorMsg(), 5);
        assertTrue(productDetailsPage.getReviewErrorMsg().isDisplayed());
    }

    @Test(description = "Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 11)
    public void verifyAbilityToFillTheReviewWIthLongLength() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddReviewButton(), 10);
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview("Review Description With Long Length Review Description With Long LengthReReview Description With Long Length Review Description With Long Lengthview Description With Long Length ", "Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length ", "Abd-Alrahman Abd Alazez Abdullah Mohammad Khair");
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getReviewToastMsg(), 5);
        assertTrue(productDetailsPage.getReviewToastMsg().isDisplayed());
    }

    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
    public void verifyAbilityToNavigatetToHomePageUsingTheBreadCrumb() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getHomeBreadcrumbs(), 5);
        productDetailsPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), aeSiteURL);
    }

    @Test(description = "Make sure that the customer can switch to Arabic Language from PDP ", priority = 13)
    public void verifyAbilityToSwitchToArabicVersionFromPDP() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getLanguageSwitcher(), 10);
        productDetailsPage.switchToArabicVersion();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getEnglishLangBtn(), 5);
        assertTrue(productDetailsPage.getEnglishLangBtn().isDisplayed());
    }

    @Test(description = "Make sure that the customer can add the same product more than once by clicking on theAddToProduct button in each time ", priority = 14)
    public void verifyAbilityToAddProductToCartMultiTimes() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
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
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddToCartBtn(), 10);
        String currectProductPrice = productDetailsPage.getProductPrice().getText();
        productDetailsPage.increaseTheQuantity();
        String newProductPrice = productDetailsPage.getProductPrice().getText();
        Assert.assertNotEquals(currectProductPrice, newProductPrice);
    }

    @Test(description = "Make sure that the customer cannot add more than 2 Qty for the same product when switching to Jordan Store", priority = 16)
    public void verifyUnabilityToAddMoreThan2QtyForJOStore() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToJOCountry();
        productDetailsPage.clickOnJOProductInHomePage();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.increaseTheQuantity();
        productDetailsPage.addToCart();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getInconvenienceWarningMsg(), 10);
        assertTrue(productDetailsPage.getInconvenienceWarningMsg().isDisplayed());
    }

    @Test(description = "Make sure ability to display the bundle and select all options", priority = 17)
    public void verifyAbilityToDisplayBundleAndSelectAllOptions() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getCountryList(), 10);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.searchForBundle();
        productDetailsPage.clickOnSearchBtn();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductCard(), 20);
        productDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(), 20);
        Select select = new Select(productDetailsPage.getBundleMenu());
        WebElement currentSelectedOption = select.getFirstSelectedOption();
        String currentSelectedOptionText = currentSelectedOption.getText();
        System.out.println(currentSelectedOptionText);
        DataHelperAndWait.selectAllDropDownListOptions(select);
        WebElement newSelectedOption = select.getAllSelectedOptions().get(0);
        String newSelectedOptionText = newSelectedOption.getText();
        System.out.println(newSelectedOptionText);
        Assert.assertNotEquals(currentSelectedOptionText, newSelectedOptionText);
    }

    @Test(description = "Verify that the system display a label on the PDP to indicate for the customer he will get a free product", priority = 18)
    public void verifyTheresLabelInPdpToIndicateThatTheresAnOfferOnThisProduct() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSalesAndOffersMenu();
        productDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFirstProductInTheCategoryList(), 10);
        productDetailsPage.clickOnFirstProductInTheCategoryList();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getFreeProductLabel(), 10);
        assertTrue(productDetailsPage.getFreeProductLabel().isDisplayed());
    }

    @Test(description = "Verify that the About This product section displays correctly in the PDP", priority = 19)
    public void verifyAboutThisProductSecttionDisplaysCorrectlyInProductDetailsPage() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAboutThisProductSection(), 10);
        assertTrue(productDetailsPage.getAboutThisProductSection().isDisplayed());
        assertEquals(productDetailsPage.getAboutThisProductTitle().getText(), "About This Product");
    }

    @Test(description = "Verify that the Supplement Facts section displays correctly in the PDP", priority = 20)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getSupplementFactsTabel(), 10);
        assertTrue(productDetailsPage.getSupplementFactsTabel().isDisplayed());
        assertEquals(productDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }
//      The following Test Cases handle displaying the Mega Menu from Product Page
@Test(description = "Verify that the ShopBy Menu Is Displayed When Hovering On It From Product Details Page", priority = 21)
public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
aeMegaMenuTestCases=new AEMegaMenuTestCases();
aeMegaMenuTestCases.verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductPage();
}
    @Test(description = "Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Product Details Page", priority = 22)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductPage();
    }
    @Test(description = "Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Product Details Page", priority = 23)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductPage();
    }
    @Test(description = "Verify that the Healthy Food Menu Is Displayed When Hovering On It From Product Details Page", priority = 24)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductPage();
    }
    @Test(description = "Verify that the Sports Menu Is Displayed When Hovering On It From Product Details Page", priority = 25)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifySportsMenuIsDisplayedWhenHoveringOnItFromProductPage();
    }
    @Test(description = "Verify that the account Profile icon works correctly in PDP", priority = 26)
    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.clickOnAccountProfileIcon();
        assertTrue(productDetailsPage.getAccountProfileOptions().isDisplayed());
    }
    @Test(description = "Verify that the Direction Of Use section displays correctly in the PDP", priority = 27)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getDirectionsOfUseSection(), 10);
        assertTrue(productDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }
    @Test(description = "Verify that the About Brand section displays correctly in the PDP", priority = 28)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAboutBrandSection(), 10);
        assertTrue(productDetailsPage.getAboutBrandSection().isDisplayed());
    }
    @Test(description = "Verify that the header Bar in the PDP appears correctly when scrolling down", priority = 29)
    public void verifyAddToCartBtnInHeaderBarWorksCorrectly() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        Actions act = new Actions(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        productDetailsPage.clickOnAddToCartBtnInProductHeaderBar();
        assertTrue(productDetailsPage.getProductHeaderBar().isDisplayed());
    }
    @Test(description = "Verify that the Add to Cart Button appears in the header Bar in the PDP works correctly ", priority = 30)
    public void verifyHeaderBarDisplaysCorrectlyInProductDetailsPageWhenScrollingThePage() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        Actions act = new Actions(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        productDetailsPage.clickOnAddToCartBtnInProductHeaderBar();
        assertTrue(productDetailsPage.getKeepShippingBtn().isDisplayed());
    }
    @Test(description = "Verify clicking on the By Brand Link appears in Product Name section will redirect the user to correct page ", priority = 31)
    public void verifyClickingOnByBrandLinkAppearsInProductNameSectionRedirectUserToCorrectPage() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        aeMegaMenuTestCases= new AEMegaMenuTestCases();
        productDetailsPage.switchToAeCountry();
      aeMegaMenuTestCases.verifyClickingOnWheyProteinOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL();
      productDetailsPage.clickOnFirstProductInWheyProtienPage();
        String productUrl= webDriver.getCurrentUrl();
        productDetailsPage.clickOnProductBrandLink();
        String brandUrl= webDriver.getCurrentUrl();
        Assert.assertNotEquals(productUrl,brandUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");    }
    @Test(description = "Verify that Expected Delivery Date Label and its value displayed correctly", priority = 32)
    public void verifyExpectedDeliveryDateAppearsCorrectlyAndRetrieveDateInPdp() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getExpectedDeliveryDateLable(), 10);
        assertTrue(productDetailsPage.getExpectedDeliveryDateLable().isDisplayed());
        assertTrue(productDetailsPage.getExpectedDeliveryDateValue().isDisplayed());
    }
    @Test(description = "Verify that the search button works correctly from the PDP", priority = 33)
    public void verifySearchBtnWorksCorrectlyFromPdp() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnProductInHomePage();
        productDetailsPage.searchForBundle();
        productDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure that the next review page button appears in Reviews section works correctly ", priority = 34)
    public void verifyNextReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        webDriver.navigate().to(productUrl);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddReviewButton(), 10);
        productDetailsPage.clickOnNextReviewPageBtn();
        DataHelperAndWait.implicitWait(5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make sure that the Previous review page button appears in Reviews section works correctly ", priority = 35)
    public void verifyPreviousReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        webDriver.navigate().to(productUrl);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddReviewButton(), 10);
        productDetailsPage.clickOnNextReviewPageBtn();
        DataHelperAndWait.implicitWait(5);
        productDetailsPage.clickOnPreviousReviewPageBtn();
        DataHelperAndWait.implicitWait(5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=1"));
    }
    @Test(description = "Make sure that the pagination control appears in Reviews section works correctly ", priority = 36)
    public void verifyPaginationControlAppearsInReviewsSectionWorksCorrectly() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        webDriver.navigate().to(productUrl);
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getAddReviewButton(), 10);
        productDetailsPage.clickOnPageBtnInReviewSection();
        DataHelperAndWait.implicitWait(5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make sure that the simple price changes when navigation between sizes for the config ", priority = 37)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAeCountry();
        productDetailsPage.clickOnShopeByMenu();
        productDetailsPage.clickOnSportsSupplementsMenu();
        productDetailsPage.DisplayProductInTheList(0);
        String firstPrice= productDetailsPage.getProductPrice().getText();
        productDetailsPage.clickOnFirstProductSize();
        DataHelperAndWait.implicitWait(3);
        String secondPrice= productDetailsPage.getProductPrice().getText();
        System.out.println(firstPrice );
        System.out.println(secondPrice );
        Assert.assertNotEquals(firstPrice,secondPrice);
    }
}
