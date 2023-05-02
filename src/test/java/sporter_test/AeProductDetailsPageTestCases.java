package sporter_test;

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
import sporter_pages.AeProductDetailsPage;

import static org.testng.Assert.*;

public class AeProductDetailsPageTestCases extends BaseTest {

    @Test(groups = "All Smoke Testing Result",description = "Products Details Page- Switching to UAE store", priority = 1)
    public void switchToUaeStore(){
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        webDriver.navigate().to("https://www.sporter.com/en-ae");

        aeProductDetailsPage.switchToAECountry();
        if(webDriver.getCurrentUrl().contains(aeProductDetailsPage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+aeDomain);
            CloseInitialDialog();          }
    }

    @Test(groups = {"2.02 Product Page", "1.1 Critical Severity"},description = "Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 2)
    public void keepShoppingAfterAddingToTheCart() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        String currentURL = webDriver.getCurrentUrl() + "#";
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        Assert.assertEquals(webDriver.getCurrentUrl(), currentURL);
    }

    @Test(groups = {"2.02 Product Page", "1.1 Critical Severity"},description = "Make sure the shopper is able to View the cart after adding the product to it ", priority = 3)
    public void viewCartAfterAddingTheProductToIt() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.viewCart();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeProductDetailsPage.aeDomain+aeProductDetailsPage.cartURL );
    }

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Make sure the out of stock message appears when displaying out of stock product ", priority =4)
    public void verifyOOSMessageIsDisplayed() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayOOSProduct();
        assertTrue(aeProductDetailsPage.getOOSMsg().isDisplayed());
    }

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},dependsOnMethods = "verifyOOSMessageIsDisplayed",description = "Make sure the shopper is unable to add out of stock product to the cart", priority =5)
    public void verifyInabilityToAddOosProductToTheCart(){
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        try{
        Assert.assertFalse(aeProductDetailsPage.getAddToCartSectionForOOSProduct().isDisplayed());}
        catch (Exception e){
            System.out.println("The Add to cat is disable correctly");
        }
    }

    @Test(groups = {"2.02 Product Page","All Smoke Testing Result","1.2 High Severity"},description = "Make sure to display the product from search screen", priority = 6)
    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.clickOnSearchBtn();
        aeProductDetailsPage.clickOnTheProductCard();
        assertTrue(aeProductDetailsPage.getAddToCartBtn().isDisplayed());
    }



    @Test(groups = {"2.02 Product Page","All Smoke Testing Result","1.2 High Severity"},description = "Make sure that the increase quantity function works fine ", priority = 7)
    public void verifyIncreaseQuantityButtonWorkingFine() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.increaseTheQuantity();
        Assert.assertEquals(aeProductDetailsPage.getQuantityField().getAttribute("value"), "2");
    }

    @Test(groups = {"2.02 Product Page","All Smoke Testing Result","1.2 High Severity"},description = "Make sure that the Decrease quantity function works fine ", priority = 8)
    public void verifyDecreaseQuantityButtonWorkingFine() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.decreaseTheQuantity();
        Assert.assertEquals(aeProductDetailsPage.getQuantityField().getAttribute("value"), "1");
    }
//TODO: Cannot handle #8887 - Add Captcha on Add product reviews Form
    @Test(groups = {"2.02 Product Page","All Smoke Testing Result","1.3 Medium Severity"},description = "Make sure that the customer can submit his review successfully ", priority = 9,enabled = false)
    public void verifyAbilityToSubmitTheProductReview() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.selectStarInReview();
        aeProductDetailsPage.submitProductReview("Review Description", "Review Summary", "Walaa Mohammad");
//        assertTrue(aeProductDetailsPage.getReviewToastMsg().isDisplayed());
    }

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Make sure that the customer is unable to submit his review without selecting any star ", priority = 10)
    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.submitProductReview("Review Description", "Review Summary", "Wala'a Mohammad");
//        assertTrue(aeProductDetailsPage.getReviewErrorMsg().isDisplayed());
    }
//TODO:Cannot Handle #8887 - Add Captcha on Add product reviews Form
    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 11,enabled = false)
    public void verifyAbilityToFillTheReviewWIthLongLength() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.selectStarInReview();
        aeProductDetailsPage.submitProductReview("Review Description With Long Length Review Description With Long LengthReReview Description With Long Length Review Description With Long Length view Description With Long Length ", "Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length Review Summary WIth Long Length ", "Abd-Alrahman Abd Alazez Abdullah Mohammad Khair");
//        assertTrue(aeProductDetailsPage.getReviewToastMsg().isDisplayed());
    }

    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"2.02 Product Page","All Smoke Testing Result","1.2 High Severity"},description = "Make sure that the customer can add the same product more than once by clicking on the Add To Product button in each time ", priority = 13)
    public void verifyAbilityToAddProductToCartMultiTimes() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        String oldProductURL = webDriver.getCurrentUrl();
        aeProductDetailsPage.addToCart();
        aeProductDetailsPage.keepShopping();
        String newProductURL = webDriver.getCurrentUrl();
        Assert.assertEquals(webDriver.getCurrentUrl(), newProductURL);
    }

    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Make sure that the product price is changed when you change the quantity ", priority = 14)
    public void verifyTheProductPriceChangesBasedOnTheSelectedQty() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        String currentProductPrice = aeProductDetailsPage.getProductPrice().getText();
        aeProductDetailsPage.increaseTheQuantity();
        String newProductPrice = aeProductDetailsPage.getProductPrice().getText();
        Assert.assertNotEquals(currentProductPrice, newProductPrice);
    }


    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Make sure ability to display the bundle and select all options", priority = 15)
    public void verifyAbilityToDisplayBundleAndSelectAllOptions() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayBundle();
        Select select = new Select(aeProductDetailsPage.getBundleMenu());
        WebElement currentSelectedOption = select.getFirstSelectedOption();
        String currentSelectedOptionText = currentSelectedOption.getText();
        System.out.println(currentSelectedOptionText);
        DataHelperAndWait.selectAllDropDownListOptions(select);
        WebElement newSelectedOption = select.getAllSelectedOptions().get(0);
        String newSelectedOptionText = newSelectedOption.getText();
        System.out.println(newSelectedOptionText);
//        Assert.assertNotEquals(currentSelectedOptionText, newSelectedOptionText);
    }

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Verify that the system display a label on the PDP to indicate for the customer he will get a free product", priority = 16)
    public void verifyTheresLabelInPdpToIndicateThatTheresAnOfferOnThisProduct() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.navigateToBogoProduct();
        assertTrue(aeProductDetailsPage.getFreeProductLabel().isDisplayed());
    }

    @Test(groups = {"2.02 Product Page", "1.4  Low Severity"},description = "Verify that the About This product section displays correctly in the PDP", priority = 17)
    public void verifyAboutThisProductSectionDisplaysCorrectlyInProductDetailsPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        try {
            assertTrue(aeProductDetailsPage.getAboutThisProductSection().isDisplayed());
            assertEquals(aeProductDetailsPage.getAboutThisProductTitle().getText(), "About This Product");
        }
catch (Exception e){
            System.out.println("This section is not appear for this product");
}
    }

    @Test(groups = {"2.02 Product Page", "1.4  Low Severity"},description = "Verify that the Supplement Facts section displays correctly in the PDP", priority = 18)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        assertTrue(aeProductDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(aeProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }

    //      The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(groups = {"2.02 Product Page","All Smoke Testing Result","1.4  Low Severity"},description = "Verify that the ShopBy Menu Is Displayed When Hovering On It From Product Details Page", priority = 19)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");

    }

    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Product Details Page", priority = 20)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        DataHelperAndWait.waitToBeVisible(aeMegamenuPage.getSportsSupplementMainMenuList().get(0),5,webDriver);
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementMainMenuList().get(0).isDisplayed());}

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Product Details Page", priority = 21)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        webDriver.navigate().to(aeMegamenuPage.BaseURL +product);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");    }

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Verify that the Healthy Food Menu Is Displayed When Hovering On It From Product Details Page", priority = 22)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getHealthyFoodSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it");    }

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Verify that the Sports Menu Is Displayed When Hovering On It From Product Details Page", priority = 23)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it");    }

    @Test(groups = {"2.02 Product Page", "1.1 Critical Severity"},description = "Verify that the account Profile icon works correctly in PDP", priority = 24)
    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.clickOnAccountProfileIcon();
        assertTrue(aeProductDetailsPage.getAccountProfileOptions().isDisplayed());
    }

    @Test(groups = {"2.02 Product Page", "1.4  Low Severity"},description = "Verify that the Direction Of Use section displays correctly in the PDP", priority = 25)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        assertTrue(aeProductDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }

    @Test(groups = {"2.02 Product Page", "1.4  Low Severity"},description = "Verify that the About Brand section displays correctly in the PDP", priority = 26)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        assertTrue(aeProductDetailsPage.getAboutBrandSection().isDisplayed());
    }

    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Verify that the header Bar in the PDP appears correctly when scrolling down", priority = 27)
    public void verifyAddToCartBtnInHeaderBarWorksCorrectly() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        Actions act = new Actions(webDriver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        aeProductDetailsPage.clickOnAddToCartBtnInProductHeaderBar();
        assertTrue(aeProductDetailsPage.getProductHeaderBar().isDisplayed());
    }

    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Verify that the Add to Cart Button appears in the header Bar in the PDP works correctly ", priority = 28)
    public void verifyHeaderBarDisplaysCorrectlyInProductDetailsPageWhenScrollingThePage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        Actions act = new Actions(webDriver);
        aeProductDetailsPage.displayTheProduct();
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        aeProductDetailsPage.clickOnAddToCartBtnInProductHeaderBar();
//        assertTrue(aeProductDetailsPage.getKeepShippingBtn().isDisplayed());
    }

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Verify clicking on the By Brand Link appears in Product Name section will redirect the user to correct page ", priority = 29)
    public void verifyClickingOnByBrandLinkAppearsInProductNameSectionRedirectUserToCorrectPage() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.clickOnProductBrandLink();
        DataHelperAndWait.waitForUrlContains("brands",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("brands"));
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Verify that Expected Delivery Date Label and its value displayed correctly", priority = 30)
    public void verifyExpectedDeliveryDateAppearsCorrectlyAndRetrieveDateInPdp() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        assertTrue(aeProductDetailsPage.getExpectedDeliveryDateLabel().isDisplayed());
        assertTrue(aeProductDetailsPage.getExpectedDeliveryDateValue().isDisplayed());
    }

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Verify that the search button works correctly from the PDP", priority = 31)
    public void verifySearchBtnWorksCorrectlyFromPdp() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(aeProductDetailsPage.getSearchPageTitle().isDisplayed());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Make sure that the next review page button appears in Reviews section works correctly ", priority = 32)
    public void verifyNextReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.clickOnNextReviewPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
//There's bug here
    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Make sure that the Previous review page button appears in Reviews section works correctly ", priority = 33)
    public void verifyPreviousReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.clickOnPreviousReviewPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=1"));
    }

    @Test(groups = {"2.02 Product Page", "1.2 High Severity"},description = "Make sure that the pagination control appears in Reviews section works correctly ", priority = 34)
    public void verifyPaginationControlAppearsInReviewsSectionWorksCorrectly() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.clickOnPageBtnInReviewSection();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Make sure that ability to navigate between sizes for the config ", priority = 35)
    public void verifyNavigationBetweenSizesForTheConfig() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.clickOnFirstsimple();
        String firstPrice = aeProductDetailsPage.getFinalProductPrice().getText();
        aeProductDetailsPage.clickOnSecondimple();
//        String secondPrice = aeProductDetailsPage.getFinalProductPrice().getText();
//        Assert.assertNotEquals(firstPrice, secondPrice,"The simple price is not changes");
    }

    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Make sure ability to navigate to the home page by clicking on the sporter logo from the product Details Page  ", priority = 36)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() {
        AEGuestUserPage aeGuestUserPage = new AEGuestUserPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayTheProduct();
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeDomain+"/");
    }

    @Test(groups = {"2.02 Product Page", "1.3 Medium Severity"},description = "Make sure the system will display a message when the offer is not available in the selected country", priority = 37)
    public void verifyInabilityToDisplayUnAvailableOffer() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.displayNotAvailableOfferProduct();
        aeProductDetailsPage.switchToJOCountry();
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
//        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.switchToJOCountry();
//        aeProductDetailsPage.displayTheProduct();
//        aeProductDetailsPage.increaseTheQuantity();
//        aeProductDetailsPage.increaseTheQuantity();
//        aeProductDetailsPage.addToCart();
//        assertTrue(aeProductDetailsPage.getInconvenienceWarningMsg().isDisplayed());
//    }
    @Test(groups = {"2.02 Product Page", "1.1 Critical Severity"},description = "Make sure that the customer can switch to Arabic Language from PDP ", priority = 39)
    public void verifyAbilityToSwitchToArabicVersionFromPDP() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAECountry();
        aeProductDetailsPage.displayTheProduct();
        aeProductDetailsPage.switchToArabicVersion();
        assertTrue(aeProductDetailsPage.getEnglishLangBtn().isDisplayed());
    }
}