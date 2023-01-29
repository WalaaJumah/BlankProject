/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarProductDetailsTestCases
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
import sporter_pages.homepage_classes.QatarHomePage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_pages.productPage.QatarProductDetailsPage;
import xml_reader.XmlReader;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "Qatar Product Details Page")

public class QatarProductDetailsTestCases  extends ProductDetailsTestCases{
    @BeforeClass(alwaysRun=true)
    public void switchToQatarStore(){
        QatarHomePage qatarHomePage=new QatarHomePage(webDriver);
        qatarHomePage.switchCountry(qatarHomePage.getQatarCountry());
        if(webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)){
            System.out.println("You are in Qatar Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+qatarHomePage.qatarDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getHomeBreadcrumbs(),webDriver);
        WebElementsAssertion.assertTheUrlEqualExpectedUrl(webDriver.getCurrentUrl(),BasePage.BaseURL +qatarProductDetailsPage.qatarDomain,webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure ability to navigate to the home page by clicking on the sporter logo from the product Details Page  ", priority = 36)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() {
        HeaderSection headerSection=new HeaderSection(webDriver);
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(),webDriver);
        WebElementsAssertion.assertTheUrlEqualExpectedUrl(webDriver.getCurrentUrl(), BasePage.BaseURL +qatarProductDetailsPage.qatarDomain+"/",webDriver);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "(Qatar Store/ English Version): Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 2)
    public void keepShoppingAfterAddingToTheCart() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.keepShoppingAfterAddingToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "(Qatar Store/ English Version): Make sure the shopper is able to View the cart after adding the product to it ", priority = 3)
    public void viewCartAfterAddingTheProductToIt() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getAddToCartBtn(),webDriver);
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getViewCartBtn(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(qatarProductDetailsPage.cartURL,webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure the out of stock message appears when displaying out of stock product ", priority =4)
    public void verifyOOSMessageIsDisplayed() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayOOSProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getOOSMsg(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},dependsOnMethods = "verifyOOSMessageIsDisplayed",description = "(Qatar Store/ English Version): Make sure the shopper is unable to add out of stock product to the cart", priority =5,expectedExceptions = { org.openqa.selenium.NoSuchElementException.class })
    public void verifyInabilityToAddOosProductToTheCart(){
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        Assert.assertFalse(qatarProductDetailsPage.getAddToCartBtn().isDisplayed());
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(Qatar Store/ English Version): Make sure to display the product from search screen", priority = 6)
    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getSearchBtn(),webDriver);
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getProductCard(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getProductName(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(Qatar Store/ English Version): Make sure that the increase quantity function works fine ", priority = 7)
    public void verifyIncreaseQuantityButtonWorkingFine() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        qatarProductDetailsPage.increaseTheQuantity();
        Assert.assertEquals( DataHelperAndWait.getWebElementText(qatarProductDetailsPage.getQuantityField(),webDriver),"2");;
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(Qatar Store/ English Version): Make sure that the Decrease quantity function works fine ", priority = 8)
    public void verifyDecreaseQuantityButtonWorkingFine() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.decreaseTheQuantity();
        Assert.assertEquals( DataHelperAndWait.getWebElementText(qatarProductDetailsPage.getQuantityField(),webDriver),"1");;
//        WebElementsAssertion.assertionAttributeTrueForElement(qatarProductDetailsPage.getQuantityField(),webDriver,"value","1");
    }
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure that the customer can submit his review successfully ", priority = 9)
    public void verifyAbilityToSubmitTheProductReview() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.selectStarInReview();
        qatarProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getReviewToastMsg(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure that the customer is unable to submit his review without selecting any star ", priority = 10)
    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        qatarProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getReviewErrorMsgRelatedToStars(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 11)
    public void verifyAbilityToFillTheReviewWIthLongLength() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        qatarProductDetailsPage.selectStarInReview();
        qatarProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDescLong"),XmlReader.getXMLData("reviewSummaryLong"),XmlReader.getXMLData("nickNameLong"));
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getReviewToastMsg(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "(Qatar Store/ English Version): Make sure that the customer can add the same product more than once by clicking on the Add To Product button in each time ", priority = 13)
    public void verifyAbilityToAddProductToCartMultiTimes() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.keepShoppingAfterAddingToCart();
        String oldProductURL = webDriver.getCurrentUrl();
        qatarProductDetailsPage.addToCart();
        qatarProductDetailsPage.keepShopping();
        String newProductURL = webDriver.getCurrentUrl();
        WebElementsAssertion.assertTheUrlEqualExpectedUrl(oldProductURL, newProductURL,webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure that the product price is changed when you change the quantity ", priority = 14)
    public void verifyTheProductPriceChangesBasedOnTheSelectedQty() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getFinalProductPrice(),webDriver);
        String currentProductPrice = qatarProductDetailsPage.getFinalProductPrice().getText();
        qatarProductDetailsPage.increaseTheQuantity();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getFinalProductPrice(),webDriver);
        String newProductPrice = qatarProductDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(currentProductPrice, newProductPrice);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "(Qatar Store/ English Version): Make sure ability to display the bundle and select all options", priority = 15)
    public void verifyAbilityToDisplayBundleAndSelectAllOptions() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayBundle();
        DataHelperAndWait.waitToBeVisible(qatarProductDetailsPage.getBundleMenu(),webDriver);
        Select select = new Select(qatarProductDetailsPage.getBundleMenu());
        WebElement currentSelectedOption = select.getFirstSelectedOption();
        String currentSelectedOptionText = currentSelectedOption.getText();
        System.out.println(currentSelectedOptionText);
        DataHelperAndWait.selectAllDropDownListOptions(select);
        WebElement newSelectedOption = select.getAllSelectedOptions().get(0);
        String newSelectedOptionText = newSelectedOption.getText();
        System.out.println(newSelectedOptionText);
        Assert.assertNotEquals(currentSelectedOptionText, newSelectedOptionText);
    }
    @Test(groups = { "1.2 High Severity"},description = "(Qatar Store/ English Version): Verify that the system display a label on the PDP to indicate for the customer he will get a free product", priority = 16)
    public void verifyTheresLabelInPdpToIndicateThatTheresAnOfferOnThisProduct() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.navigateToBogoProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getFreeProductLabelEn(),webDriver);
    }
    @Test(groups = { "1.4 Low Severity"},description = "(Qatar Store/ English Version): Verify that the About This product section displays correctly in the PDP", priority = 17)
    public void verifyAboutThisProductSectionDisplaysCorrectlyInProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getAboutThisProductSection(),webDriver);
        if(webDriver.getCurrentUrl().contains("com/en")){
            WebElementsAssertion.assertionTextIsEqual(qatarProductDetailsPage.getAboutThisProductTitle(),webDriver, "About This Product");}
        else {
            WebElementsAssertion.assertionTextIsEqual(qatarProductDetailsPage.getAboutThisProductTitle(),webDriver, "حول هذا المنتج");}
    }
    @Test(groups = { "1.4 Low Severity"},description = "(Qatar Store/ English Version): Verify that the Supplement Facts section displays correctly in the PDP", priority = 18,enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        assertTrue(qatarProductDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(qatarProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }
    //      The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "(Qatar Store/ English Version): Verify that the ShopBy Menu Is Displayed When Hovering On It From Product Details Page", priority = 19)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(qatarProductDetailsPage.getShopByMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getSubCategoriesSectionForShopBy(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(Qatar Store/ English Version): Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Product Details Page", priority = 20)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(qatarProductDetailsPage.getSportsSupplementsMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(Qatar Store/ English Version): Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Product Details Page", priority = 21)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(aeMegamenuPage.getVitaminsAndHealthMainMenu(), webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(Qatar Store/ English Version): Verify that the Healthy Food Menu Is Displayed When Hovering On It From Product Details Page", priority = 22)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(Qatar Store/ English Version): Verify that the Sports Menu Is Displayed When Hovering On It From Product Details Page", priority = 23)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "(Qatar Store/ English Version): Verify that the account Profile icon works correctly in PDP", priority = 24)
    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getAccountProfileIcon(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getAccountProfileOptions(), webDriver);
    }
    @Test(groups = { "1.4 Low Severity"},description = "(Qatar Store/ English Version): Verify that the Direction Of Use section displays correctly in the PDP", priority = 25,enabled = false)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
//        assertTrue(qatarProductDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }
    @Test(groups = { "1.4 Low Severity"},description = "(Qatar Store/ English Version): Verify that the About Brand section displays correctly in the PDP", priority = 26,enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        assertTrue(qatarProductDetailsPage.getAboutBrandSection().isDisplayed());
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(Qatar Store/ English Version): Verify that the header Bar in the PDP appears correctly when scrolling down", priority = 27)
    public void verifyAddToCartBtnInHeaderBarWorksCorrectly() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        DataHelperAndWait.scrollTo(qatarProductDetailsPage.getAddReviewButton(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getProductHeaderBar(), webDriver);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "(Qatar Store/ English Version): Verify that the Add to Cart Button appears in the header Bar in the PDP works correctly ", priority = 28)
    public void verifyHeaderBarDisplaysCorrectlyInProductDetailsPageWhenScrollingThePage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        DataHelperAndWait.scrollTo(qatarProductDetailsPage.getAddReviewButton(),webDriver);
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getAddToCartBtnInProductHeaderBar(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getKeepShippingBtn(), webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(Qatar Store/ English Version): Verify clicking on the By Brand Link appears in Product Name section will redirect the user to correct page ", priority = 29)
    public void verifyClickingOnByBrandLinkAppearsInProductNameSectionRedirectUserToCorrectPage() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getProductBrandLink(),webDriver);
        qatarProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(Qatar Store/ English Version): Verify that Expected Delivery Date Label and its value displayed correctly", priority = 30)
    public void verifyExpectedDeliveryDateAppearsCorrectlyAndRetrieveDateInPdp() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getExpectedDeliveryDateLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getExpectedDeliveryDateValue(), webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "(Qatar Store/ English Version): Verify that the search button works correctly from the PDP", priority = 31)
    public void verifySearchBtnWorksCorrectlyFromPdp() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getSearchBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(qatarProductDetailsPage.getSearchPageTitle(), webDriver);
        qatarProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.2 High Severity"},description = "(Qatar Store/ English Version): Make sure that the next review page button appears in Reviews section works correctly ", priority = 32)
    public void verifyNextReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        String reviewPages=DataHelperAndWait.getWebElementText(qatarProductDetailsPage.getReviewsPageNumber(),webDriver);
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getNextReviewPageBtn(),webDriver);
        Assert.assertNotEquals(DataHelperAndWait.getWebElementText(qatarProductDetailsPage.getReviewsPageNumber(),webDriver),reviewPages);

    }
    //There's bug here
    @Test(groups = { "1.2 High Severity"},description = "(Qatar Store/ English Version): Make sure that the Previous review page button appears in Reviews section works correctly ", priority = 33)
    public void verifyPreviousReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getNextReviewPageBtn(),webDriver);
        String reviewPagesInPage2=DataHelperAndWait.getWebElementText(qatarProductDetailsPage.getReviewsPageNumber(),webDriver);
        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getPreviousReviewPageBtn(),webDriver);
        DataHelperAndWait.waitForTime(1000);
        String reviewPagesInPage1=DataHelperAndWait.getWebElementText(qatarProductDetailsPage.getReviewsPageNumber(),webDriver);
        Assert.assertNotEquals(reviewPagesInPage2,reviewPagesInPage1);
    }
    @Test(groups = { "1.2 High Severity"},description = "(Qatar Store/ English Version): Make sure that the pagination control appears in Reviews section works correctly ", priority = 34)
    public void verifyPaginationControlAppearsInReviewsSectionWorksCorrectly() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
        qatarProductDetailsPage.verifyReviewPagingWorks();
    }
    @Test(groups = { "1.3 Medium Severity"},description = "(Qatar Store/ English Version): Make sure that the simple price changes when navigation between sizes for the config ", priority = 35,enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() {
        QatarProductDetailsPage qatarProductDetailsPage = new QatarProductDetailsPage(webDriver);
        qatarProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = qatarProductDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(qatarProductDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = qatarProductDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice,"The simple price is not changes");
    }
}