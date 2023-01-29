/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEProductDetailsTestCases
 */

package sporter_test.productTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.AEMegaMenuPage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.homepage_classes.UAEHomePage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "UAE Product Details Page")

public class UAEProductDetailsTestCases  extends ProductDetailsTestCases{
    @BeforeClass(alwaysRun=true)
    public void switchToUAEStore(){
        UAEHomePage uaeHomePage=new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if(webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+uaeHomePage.aeDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
    @Test(groups = { "1.1 Critical Severity"},description = "(UAE Store/ English Version): Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 2)
    public void keepShoppingAfterAddingToTheCart() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.keepShoppingAfterAddingToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "(UAE Store/ English Version): Make sure the shopper is able to View the cart after adding the product to it ", priority = 3)
    public void viewCartAfterAddingTheProductToIt() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtn(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getViewCartBtn(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(productDetailsPage.cartURL,webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure the out of stock message appears when displaying out of stock product ", priority =4)
    public void verifyOOSMessageIsDisplayed() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayOOSProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getOOSMsg(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},dependsOnMethods = "verifyOOSMessageIsDisplayed",description = "(UAE Store/ English Version): Make sure the shopper is unable to add out of stock product to the cart", priority =5,expectedExceptions = { org.openqa.selenium.NoSuchElementException.class })
    public void verifyInabilityToAddOosProductToTheCart(){
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        Assert.assertFalse(productDetailsPage.getAddToCartBtn().isDisplayed());
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(UAE Store/ English Version): Make sure to display the product from search screen", priority = 6)
    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getProductCard(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductName(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(UAE Store/ English Version): Make sure that the increase quantity function works fine ", priority = 7)
    public void verifyIncreaseQuantityButtonWorkingFine() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        Assert.assertEquals( DataHelperAndWait.getWebElementText(productDetailsPage.getQuantityField(),webDriver),"2");;
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(UAE Store/ English Version): Make sure that the Decrease quantity function works fine ", priority = 8)
    public void verifyDecreaseQuantityButtonWorkingFine() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.decreaseTheQuantity();
        Assert.assertEquals( DataHelperAndWait.getWebElementText(productDetailsPage.getQuantityField(),webDriver),"1");;
//        WebElementsAssertion.assertionAttributeTrueForElement(productDetailsPage.getQuantityField(),webDriver,"value","1");
    }
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure that the customer can submit his review successfully ", priority = 9)
    public void verifyAbilityToSubmitTheProductReview() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getReviewToastMsg(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure that the customer is unable to submit his review without selecting any star ", priority = 10)
    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getReviewErrorMsgRelatedToStars(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 11)
    public void verifyAbilityToFillTheReviewWIthLongLength() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDescLong"),XmlReader.getXMLData("reviewSummaryLong"),XmlReader.getXMLData("nickNameLong"));
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getReviewToastMsg(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getHomeBreadcrumbs(),webDriver);
        WebElementsAssertion.assertTheUrlEqualExpectedUrl(webDriver.getCurrentUrl(),BasePage.BaseURL +aeDomain,webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(UAE Store/ English Version): Make sure that the customer can add the same product more than once by clicking on the Add To Product button in each time ", priority = 13)
    public void verifyAbilityToAddProductToCartMultiTimes() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.keepShoppingAfterAddingToCart();
        String oldProductURL = webDriver.getCurrentUrl();
        productDetailsPage.addToCart();
        productDetailsPage.keepShopping();
        String newProductURL = webDriver.getCurrentUrl();
        WebElementsAssertion.assertTheUrlEqualExpectedUrl(oldProductURL, newProductURL,webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure that the product price is changed when you change the quantity ", priority = 14)
    public void verifyTheProductPriceChangesBasedOnTheSelectedQty() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getFinalProductPrice(),webDriver);
        String currentProductPrice = productDetailsPage.getFinalProductPrice().getText();
        productDetailsPage.increaseTheQuantity();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getFinalProductPrice(),webDriver);
        String newProductPrice = productDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(currentProductPrice, newProductPrice);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "(UAE Store/ English Version): Make sure ability to display the bundle and select all options", priority = 15)
    public void verifyAbilityToDisplayBundleAndSelectAllOptions() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayBundle();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(),webDriver);
        Select select = new Select(productDetailsPage.getBundleMenu());
        WebElement currentSelectedOption = select.getFirstSelectedOption();
        String currentSelectedOptionText = currentSelectedOption.getText();
        DataHelperAndWait.selectAllDropDownListOptions(select);
        WebElement newSelectedOption = select.getAllSelectedOptions().get(0);
        String newSelectedOptionText = newSelectedOption.getText();
        Assert.assertNotEquals(currentSelectedOptionText, newSelectedOptionText);
    }
    @Test(groups = { "1.2 High Severity"},description = "(UAE Store/ English Version): Verify that the system display a label on the PDP to indicate for the customer he will get a free product", priority = 16)
    public void verifyTheresLabelInPdpToIndicateThatTheresAnOfferOnThisProduct() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.navigateToBogoProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getFreeProductLabelEn(),webDriver);
    }
    @Test(groups = { "1.4 Low Severity"},description = "(UAE Store/ English Version): Verify that the About This product section displays correctly in the PDP", priority = 17)
    public void verifyAboutThisProductSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAboutThisProductSection(),webDriver);
        if(webDriver.getCurrentUrl().contains("com/en")){
            WebElementsAssertion.assertionTextIsEqual(productDetailsPage.getAboutThisProductTitle(),webDriver, "About This Product");}
        else {
            WebElementsAssertion.assertionTextIsEqual(productDetailsPage.getAboutThisProductTitle(),webDriver, "حول هذا المنتج");}
    }
    @Test(groups = { "1.4 Low Severity"},description = "(UAE Store/ English Version): Verify that the Supplement Facts section displays correctly in the PDP", priority = 18,enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        assertTrue(productDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(productDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }
    //      The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "(UAE Store/ English Version): Verify that the ShopBy Menu Is Displayed When Hovering On It From Product Details Page", priority = 19)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(productDetailsPage.getShopByMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSubCategoriesSectionForShopBy(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(UAE Store/ English Version): Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Product Details Page", priority = 20)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(productDetailsPage.getSportsSupplementsMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(UAE Store/ English Version): Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Product Details Page", priority = 21)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(UAE Store/ English Version): Verify that the Healthy Food Menu Is Displayed When Hovering On It From Product Details Page", priority = 22)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(UAE Store/ English Version): Verify that the Sports Menu Is Displayed When Hovering On It From Product Details Page", priority = 23)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "(UAE Store/ English Version): Verify that the account Profile icon works correctly in PDP", priority = 24)
    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getAccountProfileIcon(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAccountProfileOptions(), webDriver);
    }
    @Test(groups = { "1.4 Low Severity"},description = "(UAE Store/ English Version): Verify that the Direction Of Use section displays correctly in the PDP", priority = 25,enabled = false)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
//        assertTrue(productDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }
    @Test(groups = { "1.4 Low Severity"},description = "(UAE Store/ English Version): Verify that the About Brand section displays correctly in the PDP", priority = 26,enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        assertTrue(productDetailsPage.getAboutBrandSection().isDisplayed());
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(UAE Store/ English Version): Verify that the header Bar in the PDP appears correctly when scrolling down", priority = 27)
    public void verifyAddToCartBtnInHeaderBarWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.scrollTo(productDetailsPage.getAddReviewButton(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductHeaderBar(), webDriver);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "(UAE Store/ English Version): Verify that the Add to Cart Button appears in the header Bar in the PDP works correctly ", priority = 28)
    public void verifyHeaderBarDisplaysCorrectlyInProductDetailsPageWhenScrollingThePage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.scrollTo(productDetailsPage.getAddReviewButton(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtnInProductHeaderBar(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getKeepShippingBtn(), webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(UAE Store/ English Version): Verify clicking on the By Brand Link appears in Product Name section will redirect the user to correct page ", priority = 29)
    public void verifyClickingOnByBrandLinkAppearsInProductNameSectionRedirectUserToCorrectPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getProductBrandLink(),webDriver);
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(UAE Store/ English Version): Verify that Expected Delivery Date Label and its value displayed correctly", priority = 30)
    public void verifyExpectedDeliveryDateAppearsCorrectlyAndRetrieveDateInPdp() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getExpectedDeliveryDateLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getExpectedDeliveryDateValue(), webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(UAE Store/ English Version): Verify that the search button works correctly from the PDP", priority = 31)
    public void verifySearchBtnWorksCorrectlyFromPdp() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSearchPageTitle(), webDriver);
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.2 High Severity"},description = "(UAE Store/ English Version): Make sure that the next review page button appears in Reviews section works correctly ", priority = 32)
    public void verifyNextReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        String reviewPages=DataHelperAndWait.getWebElementText(productDetailsPage.getReviewsPageNumber(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getNextReviewPageBtn(),webDriver);
        Assert.assertNotEquals(DataHelperAndWait.getWebElementText(productDetailsPage.getReviewsPageNumber(),webDriver),reviewPages);
    }
    //There's bug here
    @Test(groups = { "1.2 High Severity"},description = "(UAE Store/ English Version): Make sure that the Previous review page button appears in Reviews section works correctly ", priority = 33)
    public void verifyPreviousReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getNextReviewPageBtn(),webDriver);
        String reviewPagesInPage2=DataHelperAndWait.getWebElementText(productDetailsPage.getReviewsPageNumber(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getPreviousReviewPageBtn(),webDriver);
        DataHelperAndWait.waitForTime(1000);
        String reviewPagesInPage1=DataHelperAndWait.getWebElementText(productDetailsPage.getReviewsPageNumber(),webDriver);
        Assert.assertNotEquals(reviewPagesInPage2,reviewPagesInPage1);
    }
    @Test(groups = { "1.2 High Severity"},description = "(UAE Store/ English Version): Make sure that the pagination control appears in Reviews section works correctly ", priority = 34)
    public void verifyPaginationControlAppearsInReviewsSectionWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.verifyReviewPagingWorks();
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure that the simple price changes when navigation between sizes for the config ", priority = 35,enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(productDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = productDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(productDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = productDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice,"The simple price is not changes");
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(UAE Store/ English Version): Make sure ability to navigate to the home page by clicking on the sporter logo from the product Details Page  ", priority = 36)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() {
        HeaderSection headerSection=new HeaderSection(webDriver);
        HomePage homePage=new HomePage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(),webDriver);
    }
}
