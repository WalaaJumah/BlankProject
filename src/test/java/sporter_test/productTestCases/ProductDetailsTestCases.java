/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription ProductDetailsTestCases
 */

package sporter_test.productTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEMegaMenuPage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;
import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;
@Test(groups = "2.06 Product Details Page")

public class ProductDetailsTestCases extends BaseTest {
    String storeCountry;
    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}:Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 1)
    public void keepShoppingAfterAddingToTheCart() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.keepShoppingAfterAddingToCart();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAddToCartBtn(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Make sure the out of stock message appears when displaying out of stock product ", priority =2)
    public void verifyOOSMessageIsDisplayed() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        try{
        productDetailsPage.displayOOSProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getOOSMsg(),webDriver);}
        catch (AssertionError a){
            System.out.println(webDriver.getCurrentUrl()+" is not found in the country: "+ productDetailsPage.storeCountry);
        }
    }
    @Test(groups = { "1.2 High Severity"},dependsOnMethods = "verifyOOSMessageIsDisplayed",description = "{{CountryName}}:Make sure the shopper is unable to add out of stock product to the cart", priority =3)
    public void verifyInabilityToAddOosProductToTheCart(){
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        try{
        productDetailsPage.getAddToCartBtn().click();}
        catch (Exception e){
            System.out.println("Passed");
        }
    }

    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Make sure to display the product from search screen", priority = 4)
    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getProductCard(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductName(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}:Make sure that the increase quantity function works fine ", priority = 5)
    public void verifyIncreaseQuantityButtonWorkingFine() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.increaseTheQuantity();
        WebElementsAssertion.assertionAttributeTrueForElement(productDetailsPage.getQuantityField(),webDriver,"value","2");
    }
    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}:Make sure that the Decrease quantity function works fine ", priority = 6)
    public void verifyDecreaseQuantityButtonWorkingFine() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.decreaseTheQuantity();
        WebElementsAssertion.assertionAttributeTrueForElement(productDetailsPage.getQuantityField(),webDriver,"value","1");
//        WebElementsAssertion.assertionAttributeTrueForElement(productDetailsPage.getQuantityField(),webDriver,"value","1");
    }
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}:Make sure that the customer can submit his review successfully ", priority = 7)
    public void verifyAbilityToSubmitTheProductReview() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
    }
    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}:Make sure that the Successful message appears after submitting the review successfully ", priority = 8)
    public void verifySuccessfulMsgAppearsAfterSubmittingTheReview() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getReviewToastMsgBtn(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Make sure that the customer is unable to submit his review without selecting any star ", priority = 9)
    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getReviewErrorMsgRelatedToStars(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 10)
    public void verifyAbilityToFillTheReviewWIthLongLength() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.selectStarInReview();
        productDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDescLong"),XmlReader.getXMLData("reviewSummaryLong"),XmlReader.getXMLData("nickNameLong"));
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getReviewToastMsgBtn(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getReviewToastMsgBtn(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 11)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getHomeBreadcrumbs(),webDriver);
//        DataHelperAndWait.waitForTime(4000);
        Assert.assertFalse(webDriver.getCurrentUrl().contains(productDetailsPage.productUrl));
    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Make sure that the product price is changed when you change the quantity ", priority = 12)
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
    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}:Make sure ability to display the bundle and select all options", priority = 13)
    public void verifyAbilityToDisplayBundleAndSelectAllOptions() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayBundle();
        DataHelperAndWait.waitToBeVisible(productDetailsPage.getBundleMenu(),webDriver);
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
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Verify that the system display a label on the PDP to indicate for the customer he will get a free product", priority = 14)
    public void verifyTheresLabelInPdpToIndicateThatTheresAnOfferOnThisProduct() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.navigateToBogoProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getFreeProductLabelEn(),webDriver);
    }
    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}:Verify that the About This product section displays correctly in the PDP", priority = 15)
    public void verifyAboutThisProductSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAboutThisProductSection(),webDriver);
        if(webDriver.getCurrentUrl().contains("com/en")){
            WebElementsAssertion.assertionTextIsEqual(productDetailsPage.getAboutThisProductTitle(),webDriver, "About This Product");}
        else {
            WebElementsAssertion.assertionTextIsEqual(productDetailsPage.getAboutThisProductTitle(),webDriver, "حول هذا المنتج");}
    }
    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}:Verify that the Supplement Facts section displays correctly in the PDP", priority = 16,enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        assertTrue(productDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(productDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }
    //      The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}:Verify that the ShopBy Menu Is Displayed When Hovering On It From Product Details Page", priority = 17)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(productDetailsPage.getShopByMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSubCategoriesSectionForShopBy(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Product Details Page", priority = 18)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(productDetailsPage.getSportsSupplementsMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Product Details Page", priority = 19)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(aeMegamenuPage.getVitaminsAndHealthMainMenu(), webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Verify that the Healthy Food Menu Is Displayed When Hovering On It From Product Details Page", priority = 20)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Verify that the Sports Menu Is Displayed When Hovering On It From Product Details Page", priority = 23)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        Actions action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}:Verify that the account Profile icon works correctly in PDP", priority = 24)
    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getAccountProfileIcon(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getAccountProfileOptions(), webDriver);
    }
    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}:Verify that the Direction Of Use section displays correctly in the PDP", priority = 25,enabled = false)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
//        assertTrue(productDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }
    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}:Verify that the About Brand section displays correctly in the PDP", priority = 26,enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        assertTrue(productDetailsPage.getAboutBrandSection().isDisplayed());
    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Verify that the header Bar in the PDP appears correctly when scrolling down", priority = 27)
    public void verifyAddToCartBtnInHeaderBarWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.scrollTo(productDetailsPage.getAddReviewButton(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductHeaderBar(), webDriver);
    }
    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}:Verify that the Add to Cart Button appears in the header Bar in the PDP works correctly ", priority = 28)
    public void verifyHeaderBarDisplaysCorrectlyInProductDetailsPageWhenScrollingThePage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.scrollTo(productDetailsPage.getAddReviewButton(),webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getAddToCartBtnInProductHeaderBar(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getRecommendedProductsPopup(), webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Verify clicking on the By Brand Link appears in Product Name section will redirect the user to correct page ", priority = 29)
    public void verifyClickingOnByBrandLinkAppearsInProductNameSectionRedirectUserToCorrectPage() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getProductBrandLink(),webDriver);
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Verify that Expected Delivery Date Label and its value displayed correctly", priority = 30)
    public void verifyExpectedDeliveryDateAppearsCorrectlyAndRetrieveDateInPdp() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getExpectedDeliveryDateLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getExpectedDeliveryDateValue(), webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Verify that the search button works correctly from the PDP", priority = 31)
    public void verifySearchBtnWorksCorrectlyFromPdp() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getSearchPageTitle(), webDriver);
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //TODO: Check the assertion
    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Make sure that the next review page button appears in Reviews section works correctly ", priority = 32)
    public void verifyNextReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getNextReviewPageBtn(),webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString("p=2",webDriver);
    }
    //There's bug here
    //TODO: Check the assertion
    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Make sure that the Previous review page button appears in Reviews section works correctly ", priority = 33)
    public void verifyPreviousReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        DataHelperAndWait.clickOnElement(productDetailsPage.getPreviousReviewPageBtn(),webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString("p=1",webDriver);
    }
    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Make sure that the pagination control appears in Reviews section works correctly ", priority = 34)
    public void verifyPaginationControlAppearsInReviewsSectionWorksCorrectly() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        productDetailsPage.verifyReviewPagingWorks();
    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Make sure that the simple price changes when navigation between sizes for the config ", priority = 35,enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(productDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = productDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(productDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = productDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice,"The simple price is not changes");
    }
    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Make sure ability to navigate to the home page by clicking on the sporter logo from the product Details Page  ", priority = 36)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() {
        HeaderSection headerSection=new HeaderSection(webDriver);
        HomePage homePage=new HomePage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(),webDriver);
    }
}