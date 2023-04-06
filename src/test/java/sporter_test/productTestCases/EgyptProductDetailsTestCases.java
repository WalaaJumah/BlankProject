/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptProductDetailsTestCases]
 */

package sporter_test.productTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.megaMenuPages.MegaMenuPage;
import sporter_pages.productPage.EgyptProductDetailsPage;
import sporter_pages.productPage.ProductDetailsPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "Egypt Product Details Page")
public class EgyptProductDetailsTestCases extends ProductDetailsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            CloseInitialDialog();
//            productDetailsPage.storeCountry="/en-eg";
            productDetailsPage.storeCountry = "/en-eg";
        }
    }
@Test(enabled = false)
public void verifyAbilityToClickOnSportsMenuIsDisplayedFromProductDetailsPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        try{
            megaMenuPage.clickOnSportsMainMenu();}
        catch (Exception e){
            DataHelperAndWait.clickOnElement(megaMenuPage.getSportsMenu(),webDriver);
        }

        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.sportsUrl, webDriver);
        } catch (Exception e) {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.sportsUrl + "/", webDriver);
        }
    }
    //    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getHomeBreadcrumbs(),webDriver);
//        WebElementsAssertion.assertTheUrlEqualExpectedUrl(webDriver.getCurrentUrl(),BasePage.BaseURL +egyptProductDetailsPage.egyptDomain,webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure ability to navigate to the home page by clicking on the sporter logo from the product Details Page  ", priority = 36)
//    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() {
//        HeaderSection headerSection=new HeaderSection(webDriver);
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(),webDriver);
//        WebElementsAssertion.assertTheUrlEqualExpectedUrl(webDriver.getCurrentUrl(), BasePage.BaseURL +egyptProductDetailsPage.egyptDomain+"/",webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 2)
//    public void keepShoppingAfterAddingToTheCart() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.keepShoppingAfterAddingToCart();
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Make sure the shopper is able to View the cart after adding the product to it ", priority = 3)
//    public void viewCartAfterAddingTheProductToIt() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getAddToCartBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getViewCartBtn(),webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString(egyptProductDetailsPage.cartURL,webDriver);
//    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure the out of stock message appears when displaying out of stock product ", priority =4)
    public void verifyOOSMessageIsDisplayed() {
        try{
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        egyptProductDetailsPage.displayOOSProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getOOSMsg(),webDriver);}
        catch (AssertionError r){
            System.out.println("The Product is not available in this store");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    @Test(groups = { "1.2 High Severity"},dependsOnMethods = "verifyOOSMessageIsDisplayed",description = "{{CountryName}}: Make sure the shopper is unable to add out of stock product to the cart", priority =5,expectedExceptions = { org.openqa.selenium.NoSuchElementException.class })
//    public void verifyInabilityToAddOosProductToTheCart(){
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        Assert.assertFalse(egyptProductDetailsPage.getAddToCartBtn().isDisplayed());
//    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure to display the product from search screen", priority = 6)
//    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getSearchBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getProductCard(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getProductName(),webDriver);
//    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the increase quantity function works fine ", priority = 7)
//    public void verifyIncreaseQuantityButtonWorkingFine() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        egyptProductDetailsPage.increaseTheQuantity();
//        Assert.assertEquals( DataHelperAndWait.getWebElementText(egyptProductDetailsPage.getQuantityField(),webDriver),"2");;
//    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the Decrease quantity function works fine ", priority = 8)
//    public void verifyDecreaseQuantityButtonWorkingFine() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.decreaseTheQuantity();
//        Assert.assertEquals( DataHelperAndWait.getWebElementText(egyptProductDetailsPage.getQuantityField(),webDriver),"1");;
////        WebElementsAssertion.assertionAttributeTrueForElement(egyptProductDetailsPage.getQuantityField(),webDriver,"value","1");
//    }
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer can submit his review successfully ", priority = 9)
//    public void verifyAbilityToSubmitTheProductReview() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.selectStarInReview();
//        egyptProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getReviewToastMsg(),webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer is unable to submit his review without selecting any star ", priority = 10)
//    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        egyptProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getReviewErrorMsgRelatedToStars(),webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 11)
//    public void verifyAbilityToFillTheReviewWIthLongLength() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        egyptProductDetailsPage.selectStarInReview();
//        egyptProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDescLong"),XmlReader.getXMLData("reviewSummaryLong"),XmlReader.getXMLData("nickNameLong"));
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getReviewToastMsg(),webDriver);
//    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the customer can add the same product more than once by clicking on the Add To Product button in each time ", priority = 13)
//    public void verifyAbilityToAddProductToCartMultiTimes() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.keepShoppingAfterAddingToCart();
//        String oldProductURL = webDriver.getCurrentUrl();
//        egyptProductDetailsPage.addToCart();
//        egyptProductDetailsPage.keepShopping();
//        String newProductURL = webDriver.getCurrentUrl();
//        WebElementsAssertion.assertTheUrlEqualExpectedUrl(oldProductURL, newProductURL,webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the product price is changed when you change the quantity ", priority = 14)
//    public void verifyTheProductPriceChangesBasedOnTheSelectedQty() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getFinalProductPrice(),webDriver);
//        String currentProductPrice = egyptProductDetailsPage.getFinalProductPrice().getText();
//        egyptProductDetailsPage.increaseTheQuantity();
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getFinalProductPrice(),webDriver);
//        String newProductPrice = egyptProductDetailsPage.getFinalProductPrice().getText();
//        Assert.assertNotEquals(currentProductPrice, newProductPrice);
//    }
    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Make sure ability to display the bundle and select all options", priority = 15)
    public void verifyAbilityToDisplayBundleAndSelectAllOptions() throws IOException {
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        egyptProductDetailsPage.displayBundle();
        DataHelperAndWait.waitToBeVisible(egyptProductDetailsPage.getBundleMenu(), webDriver);
        Select select = new Select(egyptProductDetailsPage.getBundleMenu());
        WebElement currentSelectedOption = select.getFirstSelectedOption();
        String currentSelectedOptionText = currentSelectedOption.getText();
        System.out.println(currentSelectedOptionText);
        DataHelperAndWait.selectAllDropDownListOptions(select);
        WebElement newSelectedOption = select.getAllSelectedOptions().get(0);
        String newSelectedOptionText = newSelectedOption.getText();
        System.out.println(newSelectedOptionText);
        Assert.assertNotEquals(currentSelectedOptionText, newSelectedOptionText);
    }
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the system display a label on the PDP to indicate for the customer he will get a free product", priority = 16)
//    public void verifyTheresLabelInPdpToIndicateThatTheresAnOfferOnThisProduct() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.navigateToBogoProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getFreeProductLabelEn(),webDriver);
//    }
//    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}: Verify that the About This product section displays correctly in the PDP", priority = 17)
//    public void verifyAboutThisProductSectionDisplaysCorrectlyInProductDetailsPage() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getAboutThisProductSection(),webDriver);
//        if(webDriver.getCurrentUrl().contains("com/en")){
//            WebElementsAssertion.assertionTextIsEqual(egyptProductDetailsPage.getAboutThisProductTitle(),webDriver, "About This Product");}
//        else {
//            WebElementsAssertion.assertionTextIsEqual(egyptProductDetailsPage.getAboutThisProductTitle(),webDriver, "حول هذا المنتج");}
//    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Supplement Facts section displays correctly in the PDP", priority = 18, enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        egyptProductDetailsPage.displayTheProduct();
        assertTrue(egyptProductDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(egyptProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }

    //    //      The following Test Cases handle displaying the Mega Menu from Product Page
//    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "(KSA Store/ Arabic Version): Verify that the ShopBy Menu Is Displayed When Hovering On It From Product Details Page", priority = 19)
//    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(egyptProductDetailsPage.getShopByMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getSubCategoriesSectionForShopBy(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "(KSA Store/ Arabic Version): Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Product Details Page", priority = 20)
//    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(egyptProductDetailsPage.getSportsSupplementsMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "(KSA Store/ Arabic Version): Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Product Details Page", priority = 21)
//    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(aeMegamenuPage.getVitaminsAndHealthMainMenu(), webDriver);
//        DataHelperAndWait.hoverOnElement(aeMegamenuPage.getVitaminsAndHealthMainMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "(KSA Store/ Arabic Version): Verify that the Healthy Food Menu Is Displayed When Hovering On It From Product Details Page", priority = 22)
//    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(aeMegamenuPage.getHealthyFoodMainMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "(KSA Store/ Arabic Version): Verify that the Sports Menu Is Displayed When Hovering On It From Product Details Page", priority = 23)
//    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(aeMegamenuPage.getSportsMainMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Verify that the account Profile icon works correctly in PDP", priority = 24)
//    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getAccountProfileIcon(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getAccountProfileOptions(), webDriver);
//    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Direction Of Use section displays correctly in the PDP", priority = 25, enabled = false)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        egyptProductDetailsPage.displayTheProduct();
//        assertTrue(egyptProductDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the About Brand section displays correctly in the PDP", priority = 26, enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        assertTrue(egyptProductDetailsPage.getAboutBrandSection().isDisplayed());
    }

    //    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Verify that the header Bar in the PDP appears correctly when scrolling down", priority = 27)
//    public void verifyAddToCartBtnInHeaderBarWorksCorrectly() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        DataHelperAndWait.scrollTo(egyptProductDetailsPage.getAddReviewButton(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getProductHeaderBar(), webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Verify that the Add to Cart Button appears in the header Bar in the PDP works correctly ", priority = 28)
//    public void verifyHeaderBarDisplaysCorrectlyInProductDetailsPageWhenScrollingThePage() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        DataHelperAndWait.scrollTo(egyptProductDetailsPage.getAddReviewButton(),webDriver);
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getAddToCartBtnInProductHeaderBar(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getKeepShippingBtn(), webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify clicking on the By Brand Link appears in Product Name section will redirect the user to correct page ", priority = 29)
//    public void verifyClickingOnByBrandLinkAppearsInProductNameSectionRedirectUserToCorrectPage() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getProductBrandLink(),webDriver);
//        egyptProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Verify that Expected Delivery Date Label and its value displayed correctly", priority = 30)
//    public void verifyExpectedDeliveryDateAppearsCorrectlyAndRetrieveDateInPdp() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getExpectedDeliveryDateLabel(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getExpectedDeliveryDateValue(), webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the search button works correctly from the PDP", priority = 31)
//    public void verifySearchBtnWorksCorrectlyFromPdp() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getSearchBtn(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getSearchPageTitle(), webDriver);
//        egyptProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Make sure that the next review page button appears in Reviews section works correctly ", priority = 32)
//    public void verifyNextReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        String reviewPages=DataHelperAndWait.getWebElementText(egyptProductDetailsPage.getReviewsPageNumber(),webDriver);
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getNextReviewPageBtn(),webDriver);
//        Assert.assertNotEquals(DataHelperAndWait.getWebElementText(egyptProductDetailsPage.getReviewsPageNumber(),webDriver),reviewPages);
//
//    }
//    //There's bug here
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Make sure that the Previous review page button appears in Reviews section works correctly ", priority = 33)
//    public void verifyPreviousReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getNextReviewPageBtn(),webDriver);
//        String reviewPagesInPage2=DataHelperAndWait.getWebElementText(egyptProductDetailsPage.getReviewsPageNumber(),webDriver);
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getPreviousReviewPageBtn(),webDriver);
//        DataHelperAndWait.waitForTime(1000);
//        String reviewPagesInPage1=DataHelperAndWait.getWebElementText(egyptProductDetailsPage.getReviewsPageNumber(),webDriver);
//        Assert.assertNotEquals(reviewPagesInPage2,reviewPagesInPage1);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Make sure that the pagination control appears in Reviews section works correctly ", priority = 34)
//    public void verifyPaginationControlAppearsInReviewsSectionWorksCorrectly() {
//        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
//        egyptProductDetailsPage.displayTheProduct();
//        egyptProductDetailsPage.verifyReviewPagingWorks();
//    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the simple price changes when navigation between sizes for the config ", priority = 35, enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() throws IOException {
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = egyptProductDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = egyptProductDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice, "The simple price is not changes");
    }
}