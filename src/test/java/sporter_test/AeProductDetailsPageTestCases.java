package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEGuestUserPage;
import sporter_pages.AeProductDetailsPage;

import static org.testng.Assert.*;

public class AeProductDetailsPageTestCases extends BaseTest {
    private AeProductDetailsPage aeProductDetailsPage;
    AEMegaMenuTestCases aeMegaMenuTestCases;
    AEGuestUserPage aeGuestUserPage;
    String productUrl = "https://www.sporter.com/en-ae/dymatize-iso-100-6350";

    @Test(description = "Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 1)
    public void keepShoppingAfterAddingToTheCart() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        String currentURL = webDriver.getCurrentUrl() + "#";
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL);
    }

    @Test(description = "Make sure the shopper is able to View the cart after adding the product to it ", priority = 2)
    public void viewCartAfterAddingTheProductToIt() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.sporter.com/en-ae/checkout/cart/");
    }

    @Test(description = "Make sure the out of stock message appears when displaying out of stock product ", priority = 3)
    public void verifyOOSMessageIsDisplayed() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getCountryList(), 10);
        aeProductDetailsPage.switchToAeCountry();
        webDriver.navigate().to(outOfStockProduct);
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getOOSMsg(), 10);
        assertTrue(aeProductDetailsPage.getOOSMsg().isDisplayed());
    }

    @Test(description = "Make sure the shopper is unable to add out of stock product to the cart", priority = 4)
    public void verifyUnabilityToAddOosProductToTheCart() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        webDriver.navigate().to(outOfStockProduct);
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getOOSMsg(), 10);
        Assert.assertFalse(DataHelperAndWait.isPresent(aeProductDetailsPage.getAddToCartBtn()));
    }

    @Test(description = "Make sure to display the product from search screen", priority = 5)
    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnSearchBtn();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getProductCard(), 20);
        aeProductDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAddToCartBtn(), 10);
        assertTrue(aeProductDetailsPage.getAddToCartBtn().isDisplayed());
    }

    @Test(description = "Make sure the system will display a message when the offer is not available in the selected country", priority = 6)
    public void verifyUnabilityToDisplayUnAvailableOffer() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        aeProductDetailsPage.switchToLebanonCountry();
        assertTrue(aeProductDetailsPage.getProductUnavialableForCountry().isDisplayed());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertTrue(verifyTitle, "Page Not Found Is Displayed");
    }

    @Test(description = "Make sure that the increase quantity function works fine ", priority = 7)
    public void verifyIncreaseQuantityButtonWorkingFine() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAddToCartBtn(), 10);
        aeProductDetailsPage.increaseTheQuantity();
        Assert.assertEquals(aeProductDetailsPage.getQuantityField().getAttribute("value"), "2");
    }

    @Test(description = "Make sure that the Decrease quantity function works fine ", priority = 8)
    public void verifyDecreaseQuantityButtonWorkingFine() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAddToCartBtn(), 10);
        aeProductDetailsPage.increaseTheQuantity();
        Assert.assertEquals(aeProductDetailsPage.getQuantityField().getAttribute("value"), "2");
        aeProductDetailsPage.decreaseTheQuantity();
        Assert.assertEquals(aeProductDetailsPage.getQuantityField().getAttribute("value"), "1");
    }

    @Test(description = "Make sure that the customer can submit his review successfully ", priority = 9)
    public void verifyAbilityToSubmitTheProductReview() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAddReviewButton(), 10);
        aeProductDetailsPage.selectStarInReview();
        aeProductDetailsPage.submitProductReview("Review Description", "Review Summary", "Wala'a Mohammad");
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getReviewToastMsg(), 10);
        assertTrue(aeProductDetailsPage.getReviewToastMsg().isDisplayed());
    }

    @Test(description = "Make sure that the customer is unable to submit his review without selecting any star ", priority = 10)
    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAddReviewButton(), 10);
        aeProductDetailsPage.submitProductReview("Review Description", "Review Summary", "Wala'a Mohammad");
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getReviewErrorMsg(), 5);
        assertTrue(aeProductDetailsPage.getReviewErrorMsg().isDisplayed());
    }

    @Test(description = "Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 11)
    public void verifyAbilityToFillTheReviewWIthLongLength() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAddReviewButton(), 10);
        aeProductDetailsPage.selectStarInReview();
        aeProductDetailsPage.submitProductReview("Review Description With Long Length Review Description With Long LengthReReview Description With Long Length Review Description With Long Lengthview Description With Long Length ", "Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length ", "Abd-Alrahman Abd Alazez Abdullah Mohammad Khair");
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getReviewToastMsg(), 5);
        assertTrue(aeProductDetailsPage.getReviewToastMsg().isDisplayed());
    }

    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
    public void verifyAbilityToNavigatetToHomePageUsingTheBreadCrumb() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getHomeBreadcrumbs(), 5);
        aeProductDetailsPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), aeSiteURL);
    }

    @Test(description = "Make sure that the customer can switch to Arabic Language from PDP ", priority = 13)
    public void verifyAbilityToSwitchToArabicVersionFromPDP() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getLanguageSwitcher(), 10);
        aeProductDetailsPage.switchToArabicVersion();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getEnglishLangBtn(), 5);
        assertTrue(aeProductDetailsPage.getEnglishLangBtn().isDisplayed());
    }

    @Test(description = "Make sure that the customer can add the same product more than once by clicking on theAddToProduct button in each time ", priority = 14)
    public void verifyAbilityToAddProductToCartMultiTimes() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        String oldProductURL = webDriver.getCurrentUrl();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        String newProductURL = webDriver.getCurrentUrl();
        Assert.assertEquals(oldProductURL, newProductURL);
    }

    @Test(description = "Make sure that the product price is changed when you change the quantity ", priority = 15)
    public void verifyTheProductPriceChangesBasedOnTheSelectedQty() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAddToCartBtn(), 10);
        String currectProductPrice = aeProductDetailsPage.getProductPrice().getText();
        aeProductDetailsPage.increaseTheQuantity();
        String newProductPrice = aeProductDetailsPage.getProductPrice().getText();
        Assert.assertNotEquals(currectProductPrice, newProductPrice);
    }

    @Test(description = "Make sure that the customer cannot add more than 2 Qty for the same product when switching to Jordan Store", priority = 16)
    public void verifyUnabilityToAddMoreThan2QtyForJOStore() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToJOCountry();
        aeProductDetailsPage.clickOnJOProductInHomePage();
        aeProductDetailsPage.increaseTheQuantity();
        aeProductDetailsPage.increaseTheQuantity();
        aeProductDetailsPage.addToCart();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getInconvenienceWarningMsg(), 10);
        assertTrue(aeProductDetailsPage.getInconvenienceWarningMsg().isDisplayed());
    }

    @Test(description = "Make sure ability to display the bundle and select all options", priority = 17)
    public void verifyAbilityToDisplayBundleAndSelectAllOptions() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getCountryList(), 10);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.clickOnSearchBtn();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getProductCard(), 20);
        aeProductDetailsPage.clickOnTheProductCard();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getBundleMenu(), 20);
        Select select = new Select(aeProductDetailsPage.getBundleMenu());
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
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSalesAndOffersMenu();
        aeProductDetailsPage.clickOnBuy1Get1Card();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getFirstProductInTheCategoryList(), 10);
        aeProductDetailsPage.clickOnFirstProductInTheCategoryList();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getFreeProductLabel(), 10);
        assertTrue(aeProductDetailsPage.getFreeProductLabel().isDisplayed());
    }

    @Test(description = "Verify that the About This product section displays correctly in the PDP", priority = 19)
    public void verifyAboutThisProductSecttionDisplaysCorrectlyInProductDetailsPage() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAboutThisProductSection(), 10);
        assertTrue(aeProductDetailsPage.getAboutThisProductSection().isDisplayed());
        assertEquals(aeProductDetailsPage.getAboutThisProductTitle().getText(), "About This Product");
    }

    @Test(description = "Verify that the Supplement Facts section displays correctly in the PDP", priority = 20)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getSupplementFactsTabel(), 10);
        assertTrue(aeProductDetailsPage.getSupplementFactsTabel().isDisplayed());
        assertEquals(aeProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }

    //      The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(description = "Verify that the ShopBy Menu Is Displayed When Hovering On It From Product Details Page", priority = 21)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductPage();
    }

    @Test(description = "Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Product Details Page", priority = 22)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();

        aeMegaMenuTestCases.verifySportsSupplementsMainMenuDisplayTheCorrectCategoriesAndSubCategories();
    }

    @Test(description = "Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Product Details Page", priority = 23)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductPage();
    }

    @Test(description = "Verify that the Healthy Food Menu Is Displayed When Hovering On It From Product Details Page", priority = 24)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductPage();
    }

    @Test(description = "Verify that the Sports Menu Is Displayed When Hovering On It From Product Details Page", priority = 25)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifySportsMenuIsDisplayedWhenHoveringOnItFromProductPage();
    }

    @Test(description = "Verify that the account Profile icon works correctly in PDP", priority = 26)
    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        aeProductDetailsPage.clickOnAccountProfileIcon();
        assertTrue(aeProductDetailsPage.getAccountProfileOptions().isDisplayed());
    }

    @Test(description = "Verify that the Direction Of Use section displays correctly in the PDP", priority = 27)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getDirectionsOfUseSection(), 10);
        assertTrue(aeProductDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }

    @Test(description = "Verify that the About Brand section displays correctly in the PDP", priority = 28)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAboutBrandSection(), 10);
        assertTrue(aeProductDetailsPage.getAboutBrandSection().isDisplayed());
    }

    @Test(description = "Verify that the header Bar in the PDP appears correctly when scrolling down", priority = 29)
    public void verifyAddToCartBtnInHeaderBarWorksCorrectly() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        Actions act = new Actions(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        aeProductDetailsPage.clickOnAddToCartBtnInProductHeaderBar();
        assertTrue(aeProductDetailsPage.getProductHeaderBar().isDisplayed());
    }

    @Test(description = "Verify that the Add to Cart Button appears in the header Bar in the PDP works correctly ", priority = 30)
    public void verifyHeaderBarDisplaysCorrectlyInProductDetailsPageWhenScrollingThePage() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        Actions act = new Actions(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        aeProductDetailsPage.clickOnAddToCartBtnInProductHeaderBar();
        assertTrue(aeProductDetailsPage.getKeepShippingBtn().isDisplayed());
    }

    @Test(description = "Verify clicking on the By Brand Link appears in Product Name section will redirect the user to correct page ", priority = 31)
    public void verifyClickingOnByBrandLinkAppearsInProductNameSectionRedirectUserToCorrectPage() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeProductDetailsPage.switchToAeCountry();
        aeMegaMenuTestCases.verifyClickingOnWheyProteinOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL();
        aeProductDetailsPage.clickOnFirstProductInWheyProtienPage();
        String productUrl = webDriver.getCurrentUrl();
        aeProductDetailsPage.clickOnProductBrandLink();
        String brandUrl = webDriver.getCurrentUrl();
        Assert.assertNotEquals(productUrl, brandUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Verify that Expected Delivery Date Label and its value displayed correctly", priority = 32)
    public void verifyExpectedDeliveryDateAppearsCorrectlyAndRetrieveDateInPdp() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getExpectedDeliveryDateLable(), 10);
        assertTrue(aeProductDetailsPage.getExpectedDeliveryDateLable().isDisplayed());
        assertTrue(aeProductDetailsPage.getExpectedDeliveryDateValue().isDisplayed());
    }

    @Test(description = "Verify that the search button works correctly from the PDP", priority = 33)
    public void verifySearchBtnWorksCorrectlyFromPdp() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure that the next review page button appears in Reviews section works correctly ", priority = 34)
    public void verifyNextReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        webDriver.navigate().to(productUrl);
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAddReviewButton(), 10);
        aeProductDetailsPage.clickOnNextReviewPageBtn();
        DataHelperAndWait.implicitWait(5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Make sure that the Previous review page button appears in Reviews section works correctly ", priority = 35)
    public void verifyPreviousReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        webDriver.navigate().to(productUrl);
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAddReviewButton(), 10);
        aeProductDetailsPage.clickOnNextReviewPageBtn();
        DataHelperAndWait.implicitWait(5);
        aeProductDetailsPage.clickOnPreviousReviewPageBtn();
        DataHelperAndWait.implicitWait(5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=1"));
    }

    @Test(description = "Make sure that the pagination control appears in Reviews section works correctly ", priority = 36)
    public void verifyPaginationControlAppearsInReviewsSectionWorksCorrectly() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        webDriver.navigate().to(productUrl);
        DataHelperAndWait.waitToBeVisible(aeProductDetailsPage.getAddReviewButton(), 10);
        aeProductDetailsPage.clickOnPageBtnInReviewSection();
        DataHelperAndWait.implicitWait(5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Make sure that the simple price changes when navigation between sizes for the config ", priority = 37)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnShopeByMenu();
        aeProductDetailsPage.clickOnSportsSupplementsMenu();
        aeProductDetailsPage.DisplayProductInTheList(4);
        String firstPrice = aeProductDetailsPage.getFinalProductPrice().getText();
        aeProductDetailsPage.clickOnFirstProductSize();
        DataHelperAndWait.implicitWait(3);
        String secondPrice = aeProductDetailsPage.getFinalProductPrice().getText();
        System.out.println(firstPrice);
        System.out.println(secondPrice);
        Assert.assertNotEquals(firstPrice, secondPrice);
    }

    @Test(description = "Make sure ability to navigate to the home page by clicking on the sporter logo from the product Details Page  ", priority = 38)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() {
        aeGuestUserPage = new AEGuestUserPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAeCountry();
        aeProductDetailsPage.clickOnProductInHomePage();
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.sporter.com/en-ae/");
    }
}