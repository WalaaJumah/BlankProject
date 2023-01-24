/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription ProductDetailsTestCases
 */

package sporter_test.productTestCases;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEGuestUserPage;
import sporter_pages.AEMegaMenuPage;
import sporter_pages.productPage.ProductDetailsPage;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;


public class ProductDetailsTestCases extends BaseTest {
    @Test(groups = {"Product Page", "1. Critical Severity"},description = "Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 2)
    public void keepShoppingAfterAddingToTheCart() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        String currentURL = webDriver.getCurrentUrl() + "#";
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL);
    }

    @Test(groups = {"Product Page", "1. Critical Severity"},description = "Make sure the shopper is able to View the cart after adding the product to it ", priority = 3)
    public void viewCartAfterAddingTheProductToIt() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.addToCart();
        productDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +productDetailsPage.aeDomain+productDetailsPage.cartURL );
    }

    @Test(groups = {"Product Page", "2. High Severity"},description = "Make sure the out of stock message appears when displaying out of stock product ", priority =4)
    public void verifyOOSMessageIsDisplayed() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayOOSProduct();
        assertTrue(productDetailsPage.getOOSMsg().isDisplayed());
    }

    @Test(groups = {"Product Page", "2. High Severity"},dependsOnMethods = "verifyOOSMessageIsDisplayed",description = "Make sure the shopper is unable to add out of stock product to the cart", priority =5,expectedExceptions = { org.openqa.selenium.NoSuchElementException.class })
    public void verifyInabilityToAddOosProductToTheCart() throws Exception{
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        Assert.assertFalse(productDetailsPage.getAddToCartSectionForOOSProduct().isDisplayed());
    }

    @Test(groups = {"Product Page","All Smoke Testing Result","2. High Severity"},description = "Make sure to display the product from search screen", priority = 6)
    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.clickOnSearchBtn();
        productDetailsPage.clickOnTheProductCard();
        assertTrue(productDetailsPage.getAddToCartBtn().isDisplayed());
    }



    @Test(groups = {"Product Page","All Smoke Testing Result","2. High Severity"},description = "Make sure that the increase quantity function works fine ", priority = 7)
    public void verifyIncreaseQuantityButtonWorkingFine() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        Assert.assertEquals(productDetailsPage.getQuantityField().getAttribute("value"), "2");
    }

    @Test(groups = {"Product Page","All Smoke Testing Result","2. High Severity"},description = "Make sure that the Decrease quantity function works fine ", priority = 8)
    public void verifyDecreaseQuantityButtonWorkingFine() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.decreaseTheQuantity();
        Assert.assertEquals(productDetailsPage.getQuantityField().getAttribute("value"), "1");
    }

    @Test(groups = {"Product Page","All Smoke Testing Result","3. Medium Severity"},description = "Make sure that the customer can submit his review successfully ", priority = 9)
    public void verifyAbilityToSubmitTheProductReview() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview("Review Description", "Review Summary", "Walaa Mohammad");
        assertTrue(productDetailsPage.getReviewToastMsg().isDisplayed());
    }

    @Test(groups = {"Product Page", "2. High Severity"},description = "Make sure that the customer is unable to submit his review without selecting any star ", priority = 10)
    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.submitProductReview("Review Description", "Review Summary", "Wala'a Mohammad");
        assertTrue(productDetailsPage.getReviewErrorMsg().isDisplayed());
    }

    @Test(groups = {"Product Page", "1. Critical Severity"},description = "Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 11)
    public void verifyAbilityToFillTheReviewWIthLongLength() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview("Review Description With Long Length Review Description With Long LengthReReview Description With Long Length Review Description With Long Length view Description With Long Length ", "Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length ", "Abd-Alrahman Abd Alazez Abdullah Mohammad Khair");
        assertTrue(productDetailsPage.getReviewToastMsg().isDisplayed());
    }

    @Test(groups = {"Product Page", "3. Medium Severity"},description = "Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Product Page","All Smoke Testing Result","2. High Severity"},description = "Make sure that the customer can add the same product more than once by clicking on the Add To Product button in each time ", priority = 13)
    public void verifyAbilityToAddProductToCartMultiTimes() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        String oldProductURL = webDriver.getCurrentUrl();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        String newProductURL = webDriver.getCurrentUrl();
        Assert.assertEquals(webDriver.getCurrentUrl(), newProductURL);
    }

    @Test(groups = {"Product Page", "3. Medium Severity"},description = "Make sure that the product price is changed when you change the quantity ", priority = 14)
    public void verifyTheProductPriceChangesBasedOnTheSelectedQty() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        String currentProductPrice = productDetailsPage.getProductPrice().getText();
        productDetailsPage.increaseTheQuantity();
        String newProductPrice = productDetailsPage.getProductPrice().getText();
        Assert.assertNotEquals(currentProductPrice, newProductPrice);
    }


    @Test(groups = {"Product Page", "1. Critical Severity"},description = "Make sure ability to display the bundle and select all options", priority = 15)
    public void verifyAbilityToDisplayBundleAndSelectAllOptions() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.searchForBundle();
        productDetailsPage.clickOnSearchBtn();
        productDetailsPage.clickOnTheProductCard();
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

    @Test(groups = {"Product Page", "2. High Severity"},description = "Verify that the system display a label on the PDP to indicate for the customer he will get a free product", priority = 16)
    public void verifyTheresLabelInPdpToIndicateThatTheresAnOfferOnThisProduct() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.navigateToBogoProduct();
        assertTrue(productDetailsPage.getFreeProductLabel().isDisplayed());
    }

    @Test(groups = {"Product Page", "4. Low Severity"},description = "Verify that the About This product section displays correctly in the PDP", priority = 17)
    public void verifyAboutThisProductSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        assertTrue(productDetailsPage.getAboutThisProductSection().isDisplayed());
        assertEquals(productDetailsPage.getAboutThisProductTitle().getText(), "About This Product");
    }

    @Test(groups = {"Product Page", "4. Low Severity"},description = "Verify that the Supplement Facts section displays correctly in the PDP", priority = 18)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        assertTrue(productDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(productDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }

    //      The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(groups = {"Product Page","All Smoke Testing Result","4. Low Severity"},description = "Verify that the ShopBy Menu Is Displayed When Hovering On It From Product Details Page", priority = 19)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");

    }

    @Test(groups = {"Product Page", "2. High Severity"},description = "Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Product Details Page", priority = 20)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        DataHelperAndWait.waitToBeVisible(aeMegamenuPage.getSportsSupplementMainMenuList().get(0),webDriver);
        Assert.assertEquals(aeMegamenuPage.getSportsSupplementMainMenuList().get(0).getText(), "PROTEIN\n" + "Whey Protein\n" + "Whey Protein Isolate\n" +
                "Protein Blends\n" + "Non-dairy Protein\n" + "Casein Protein\n" + "Diet Protein\n" + "Mass Gainers\n" + "CREATINE\n" +
                "Creatine Monohydrate\n" + "Creatine Blends\n" + "AMINO ACIDS\n" + "BCAA\n" + "EAA\n" + "Arginine\n" + "Beta Alanine\n" +
                "HMB\n" + "Amino Acid Powders\n" + "Amino Acid Pills\n" + "Citrulline\n" + "Amino Acid Liquids\n" + "MUSCLE BOOSTERS\n" +
                "Testosterone Boosters\n" + "Gh Boosters\n" + "WEIGHT MANAGEMENT\n" + "Stimulant Weight Loss\n" + "Non-stimulant Weight Loss\n" +
                "Meal Replacements\n" + "Metabolism Support\n" + "Toning Creams\n" + "MCT\n" + "RECOVERY\n" + "Glutamine\n" + "Recovery Blends\n" +
                "Electrolytes & Hydration\n" + "CARBOHYDRATES\n" + "Carbohydrate Powders\n" + "ENERGY & ENDURANCE\n" + "Stimulant Energy\n" +
                "Non-stimulant Energy\n" + "GAMING & FOCUS\n" + "Gaming Essentials");    }

    @Test(groups = {"Product Page", "2. High Severity"},description = "Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Product Details Page", priority = 21)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        webDriver.navigate().to(aeMegamenuPage.BaseURL +product);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");    }

    @Test(groups = {"Product Page", "2. High Severity"},description = "Verify that the Healthy Food Menu Is Displayed When Hovering On It From Product Details Page", priority = 22)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getHealthyFoodSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it");    }

    @Test(groups = {"Product Page", "2. High Severity"},description = "Verify that the Sports Menu Is Displayed When Hovering On It From Product Details Page", priority = 23)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it");    }

    @Test(groups = {"Product Page", "1. Critical Severity"},description = "Verify that the account Profile icon works correctly in PDP", priority = 24)
    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.clickOnAccountProfileIcon();
        assertTrue(productDetailsPage.getAccountProfileOptions().isDisplayed());
    }

    @Test(groups = {"Product Page", "4. Low Severity"},description = "Verify that the Direction Of Use section displays correctly in the PDP", priority = 25)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        assertTrue(productDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }

    @Test(groups = {"Product Page", "4. Low Severity"},description = "Verify that the About Brand section displays correctly in the PDP", priority = 26)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        assertTrue(productDetailsPage.getAboutBrandSection().isDisplayed());
    }

    @Test(groups = {"Product Page", "3. Medium Severity"},description = "Verify that the header Bar in the PDP appears correctly when scrolling down", priority = 27)
    public void verifyAddToCartBtnInHeaderBarWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        Actions act = new Actions(webDriver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        productDetailsPage.clickOnAddToCartBtnInProductHeaderBar();
        assertTrue(productDetailsPage.getProductHeaderBar().isDisplayed());
    }

    @Test(groups = {"Product Page", "1. Critical Severity"},description = "Verify that the Add to Cart Button appears in the header Bar in the PDP works correctly ", priority = 28)
    public void verifyHeaderBarDisplaysCorrectlyInProductDetailsPageWhenScrollingThePage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        Actions act = new Actions(webDriver);
        productDetailsPage.displayTheProduct();
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        productDetailsPage.clickOnAddToCartBtnInProductHeaderBar();
        assertTrue(productDetailsPage.getKeepShippingBtn().isDisplayed());
    }

    @Test(groups = {"Product Page", "2. High Severity"},description = "Verify clicking on the By Brand Link appears in Product Name section will redirect the user to correct page ", priority = 29)
    public void verifyClickingOnByBrandLinkAppearsInProductNameSectionRedirectUserToCorrectPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.clickOnProductBrandLink();
        DataHelperAndWait.waitForUrlContains("brands",webDriver);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("brands"));
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"Product Page", "3. Medium Severity"},description = "Verify that Expected Delivery Date Label and its value displayed correctly", priority = 30)
    public void verifyExpectedDeliveryDateAppearsCorrectlyAndRetrieveDateInPdp() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        assertTrue(productDetailsPage.getExpectedDeliveryDateLabel().isDisplayed());
        assertTrue(productDetailsPage.getExpectedDeliveryDateValue().isDisplayed());
    }

    @Test(groups = {"Product Page", "2. High Severity"},description = "Verify that the search button works correctly from the PDP", priority = 31)
    public void verifySearchBtnWorksCorrectlyFromPdp() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.getSearchBtn().click();
        Assert.assertTrue(productDetailsPage.getSearchPageTitle().isDisplayed());
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"Product Page", "2. High Severity"},description = "Make sure that the next review page button appears in Reviews section works correctly ", priority = 32)
    public void verifyNextReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.clickOnNextReviewPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's bug here
    @Test(groups = {"Product Page", "2. High Severity"},description = "Make sure that the Previous review page button appears in Reviews section works correctly ", priority = 33)
    public void verifyPreviousReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.clickOnPreviousReviewPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=1"));
    }

    @Test(groups = {"Product Page", "2. High Severity"},description = "Make sure that the pagination control appears in Reviews section works correctly ", priority = 34)
    public void verifyPaginationControlAppearsInReviewsSectionWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.clickOnPageBtnInReviewSection();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(groups = {"Product Page", "3. Medium Severity"},description = "Make sure that the simple price changes when navigation between sizes for the config ", priority = 35)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.clickOnFirstsimple();
        String firstPrice = productDetailsPage.getFinalProductPrice().getText();
        productDetailsPage.clickOnSecondimple();
        String secondPrice = productDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice,"The simple price is not changes");
    }

    @Test(groups = {"Product Page", "3. Medium Severity"},description = "Make sure ability to navigate to the home page by clicking on the sporter logo from the product Details Page  ", priority = 36)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeDomain+"/");
    }

    @Test(groups = {"Product Page", "3. Medium Severity"},description = "Make sure the system will display a message when the offer is not available in the selected country", priority = 37)
    public void verifyInabilityToDisplayUnAvailableOffer() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayNotAvailableOfferProduct();
        productDetailsPage.switchToJOCountry();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "The exception page is displayed "+webDriver.getCurrentUrl());
        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
        assertTrue(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
    }
    //    @Test(description = "Make sure that the customer cannot add more than 2 Qty for the same product when switching to Jordan Store", priority = 38)
//    public void verifyInabilityToAddMoreThan2QtyForJOStore() {
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        productDetailsPage.switchToJOCountry();
//        productDetailsPage.displayTheProduct();
//        productDetailsPage.increaseTheQuantity();
//        productDetailsPage.increaseTheQuantity();
//        productDetailsPage.addToCart();
//        assertTrue(productDetailsPage.getInconvenienceWarningMsg().isDisplayed());
//    }
    @Test(groups = {"Product Page", "1. Critical Severity"},description = "Make sure that the customer can switch to Arabic Language from PDP ", priority = 39)
    public void verifyAbilityToSwitchToArabicVersionFromPDP() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.switchToAECountry();
        productDetailsPage.displayTheProduct();
        productDetailsPage.switchToArabicVersion();
        assertTrue(productDetailsPage.getEnglishLangBtn().isDisplayed());
    }

}
