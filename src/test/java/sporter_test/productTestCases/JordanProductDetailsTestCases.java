/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanProductDetailsTestCases
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
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.productPage.EgyptProductDetailsPage;
import sporter_pages.productPage.JordanProductDetailsPage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "Jordan Product Details Page")

public class JordanProductDetailsTestCases  extends ProductDetailsTestCases{
    @BeforeClass(alwaysRun=true)
    public void switchToJordanStore(){
        JordanHomePage jordanHomePage=new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if(webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)){
            System.out.println("You are in Jordan Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+jordanHomePage.jordanDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getHomeBreadcrumbs(),webDriver);
//        WebElementsAssertion.assertTheUrlEqualExpectedUrl(webDriver.getCurrentUrl(),BasePage.BaseURL +jordanProductDetailsPage.jordanDomain,webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure ability to navigate to the home page by clicking on the sporter logo from the product Details Page  ", priority = 36)
//    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() {
//        HeaderSection headerSection=new HeaderSection(webDriver);
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(),webDriver);
//        WebElementsAssertion.assertTheUrlEqualExpectedUrl(webDriver.getCurrentUrl(), BasePage.BaseURL +jordanProductDetailsPage.jordanDomain+"/",webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 2)
//    public void keepShoppingAfterAddingToTheCart() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.keepShoppingAfterAddingToCart();
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Make sure the shopper is able to View the cart after adding the product to it ", priority = 3)
//    public void viewCartAfterAddingTheProductToIt() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getAddToCartBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getViewCartBtn(),webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString(jordanProductDetailsPage.cartURL,webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure the out of stock message appears when displaying out of stock product ", priority =4)
//    public void verifyOOSMessageIsDisplayed() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayOOSProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getOOSMsg(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},dependsOnMethods = "verifyOOSMessageIsDisplayed",description = "{{CountryName}}: Make sure the shopper is unable to add out of stock product to the cart", priority =5,expectedExceptions = { org.openqa.selenium.NoSuchElementException.class })
//    public void verifyInabilityToAddOosProductToTheCart(){
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        Assert.assertFalse(jordanProductDetailsPage.getAddToCartBtn().isDisplayed());
//    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure to display the product from search screen", priority = 6)
//    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getSearchBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getProductCard(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getProductName(),webDriver);
//    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the increase quantity function works fine ", priority = 7)
//    public void verifyIncreaseQuantityButtonWorkingFine() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        jordanProductDetailsPage.increaseTheQuantity();
//        Assert.assertEquals( DataHelperAndWait.getWebElementText(jordanProductDetailsPage.getQuantityField(),webDriver),"2");;
//    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the Decrease quantity function works fine ", priority = 8)
//    public void verifyDecreaseQuantityButtonWorkingFine() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.decreaseTheQuantity();
//        Assert.assertEquals( DataHelperAndWait.getWebElementText(jordanProductDetailsPage.getQuantityField(),webDriver),"1");;
////        WebElementsAssertion.assertionAttributeTrueForElement(jordanProductDetailsPage.getQuantityField(),webDriver,"value","1");
//    }
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer can submit his review successfully ", priority = 9)
//    public void verifyAbilityToSubmitTheProductReview() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.selectStarInReview();
//        jordanProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getReviewToastMsg(),webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer is unable to submit his review without selecting any star ", priority = 10)
//    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        jordanProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getReviewErrorMsgRelatedToStars(),webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 11)
//    public void verifyAbilityToFillTheReviewWIthLongLength() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        jordanProductDetailsPage.selectStarInReview();
//        jordanProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDescLong"),XmlReader.getXMLData("reviewSummaryLong"),XmlReader.getXMLData("nickNameLong"));
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getReviewToastMsg(),webDriver);
//    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the customer can add the same product more than once by clicking on the Add To Product button in each time ", priority = 13)
//    public void verifyAbilityToAddProductToCartMultiTimes() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.keepShoppingAfterAddingToCart();
//        String oldProductURL = webDriver.getCurrentUrl();
//        jordanProductDetailsPage.addToCart();
//        jordanProductDetailsPage.keepShopping();
//        String newProductURL = webDriver.getCurrentUrl();
//        WebElementsAssertion.assertTheUrlEqualExpectedUrl(oldProductURL, newProductURL,webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the product price is changed when you change the quantity ", priority = 14)
//    public void verifyTheProductPriceChangesBasedOnTheSelectedQty() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getFinalProductPrice(),webDriver);
//        String currentProductPrice = jordanProductDetailsPage.getFinalProductPrice().getText();
//        jordanProductDetailsPage.increaseTheQuantity();
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getFinalProductPrice(),webDriver);
//        String newProductPrice = jordanProductDetailsPage.getFinalProductPrice().getText();
//        Assert.assertNotEquals(currentProductPrice, newProductPrice);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Make sure ability to display the bundle and select all options", priority = 15)
//    public void verifyAbilityToDisplayBundleAndSelectAllOptions() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayBundle();
//        DataHelperAndWait.waitToBeVisible(jordanProductDetailsPage.getBundleMenu(),webDriver);
//        Select select = new Select(jordanProductDetailsPage.getBundleMenu());
//        WebElement currentSelectedOption = select.getFirstSelectedOption();
//        String currentSelectedOptionText = currentSelectedOption.getText();
//        System.out.println(currentSelectedOptionText);
//        DataHelperAndWait.selectAllDropDownListOptions(select);
//        WebElement newSelectedOption = select.getAllSelectedOptions().get(0);
//        String newSelectedOptionText = newSelectedOption.getText();
//        System.out.println(newSelectedOptionText);
//        Assert.assertNotEquals(currentSelectedOptionText, newSelectedOptionText);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the system display a label on the PDP to indicate for the customer he will get a free product", priority = 16)
//    public void verifyTheresLabelInPdpToIndicateThatTheresAnOfferOnThisProduct() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.navigateToBogoProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getFreeProductLabelEn(),webDriver);
//    }
//    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}: Verify that the About This product section displays correctly in the PDP", priority = 17)
//    public void verifyAboutThisProductSectionDisplaysCorrectlyInProductDetailsPage() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getAboutThisProductSection(),webDriver);
//        if(webDriver.getCurrentUrl().contains("com/en")){
//            WebElementsAssertion.assertionTextIsEqual(jordanProductDetailsPage.getAboutThisProductTitle(),webDriver, "About This Product");}
//        else {
//            WebElementsAssertion.assertionTextIsEqual(jordanProductDetailsPage.getAboutThisProductTitle(),webDriver, "حول هذا المنتج");}
//    }
    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}: Verify that the Supplement Facts section displays correctly in the PDP", priority = 18,enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        jordanProductDetailsPage.displayTheProduct();
        assertTrue(jordanProductDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(jordanProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }
//    //      The following Test Cases handle displaying the Mega Menu from Product Page
//    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Verify that the ShopBy Menu Is Displayed When Hovering On It From Product Details Page", priority = 19)
//    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(jordanProductDetailsPage.getShopByMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getSubCategoriesSectionForShopBy(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Product Details Page", priority = 20)
//    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(jordanProductDetailsPage.getSportsSupplementsMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Product Details Page", priority = 21)
//    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(aeMegamenuPage.getVitaminsAndHealthMainMenu(), webDriver);
//        DataHelperAndWait.hoverOnElement(aeMegamenuPage.getVitaminsAndHealthMainMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the Healthy Food Menu Is Displayed When Hovering On It From Product Details Page", priority = 22)
//    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(aeMegamenuPage.getHealthyFoodMainMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the Sports Menu Is Displayed When Hovering On It From Product Details Page", priority = 23)
//    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(aeMegamenuPage.getSportsMainMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Verify that the account Profile icon works correctly in PDP", priority = 24)
//    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getAccountProfileIcon(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getAccountProfileOptions(), webDriver);
//    }
    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}: Verify that the Direction Of Use section displays correctly in the PDP", priority = 25,enabled = false)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        jordanProductDetailsPage.displayTheProduct();
//        assertTrue(jordanProductDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }
    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}: Verify that the About Brand section displays correctly in the PDP", priority = 26,enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        assertTrue(jordanProductDetailsPage.getAboutBrandSection().isDisplayed());
    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Verify that the header Bar in the PDP appears correctly when scrolling down", priority = 27)
//    public void verifyAddToCartBtnInHeaderBarWorksCorrectly() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        DataHelperAndWait.scrollTo(jordanProductDetailsPage.getAddReviewButton(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getProductHeaderBar(), webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Verify that the Add to Cart Button appears in the header Bar in the PDP works correctly ", priority = 28)
//    public void verifyHeaderBarDisplaysCorrectlyInProductDetailsPageWhenScrollingThePage() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        DataHelperAndWait.scrollTo(jordanProductDetailsPage.getAddReviewButton(),webDriver);
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getAddToCartBtnInProductHeaderBar(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getKeepShippingBtn(), webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify clicking on the By Brand Link appears in Product Name section will redirect the user to correct page ", priority = 29)
//    public void verifyClickingOnByBrandLinkAppearsInProductNameSectionRedirectUserToCorrectPage() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getProductBrandLink(),webDriver);
//        jordanProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Verify that Expected Delivery Date Label and its value displayed correctly", priority = 30)
//    public void verifyExpectedDeliveryDateAppearsCorrectlyAndRetrieveDateInPdp() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getExpectedDeliveryDateLabel(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getExpectedDeliveryDateValue(), webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the search button works correctly from the PDP", priority = 31)
//    public void verifySearchBtnWorksCorrectlyFromPdp() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getSearchBtn(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(jordanProductDetailsPage.getSearchPageTitle(), webDriver);
//        jordanProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Make sure that the next review page button appears in Reviews section works correctly ", priority = 32)
//    public void verifyNextReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        String reviewPages=DataHelperAndWait.getWebElementText(jordanProductDetailsPage.getReviewsPageNumber(),webDriver);
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getNextReviewPageBtn(),webDriver);
//        Assert.assertNotEquals(DataHelperAndWait.getWebElementText(jordanProductDetailsPage.getReviewsPageNumber(),webDriver),reviewPages);
//    }
//    //There's bug here
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Make sure that the Previous review page button appears in Reviews section works correctly ", priority = 33)
//    public void verifyPreviousReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        String reviewPagesInPage2=DataHelperAndWait.getWebElementText(jordanProductDetailsPage.getReviewsPageNumber(),webDriver);
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getNextReviewPageBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getPreviousReviewPageBtn(),webDriver);
//        Assert.assertEquals(reviewPagesInPage2,DataHelperAndWait.getWebElementText(jordanProductDetailsPage.getReviewsPageNumber(),webDriver));
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Make sure that the pagination control appears in Reviews section works correctly ", priority = 34)
//    public void verifyPaginationControlAppearsInReviewsSectionWorksCorrectly() {
//        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
//        jordanProductDetailsPage.displayTheProduct();
//        jordanProductDetailsPage.verifyReviewPagingWorks();
//    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the simple price changes when navigation between sizes for the config ", priority = 35,enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() throws IOException {
        JordanProductDetailsPage jordanProductDetailsPage = new JordanProductDetailsPage(webDriver);
        jordanProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = jordanProductDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(jordanProductDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = jordanProductDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice,"The simple price is not changes");
    }
}