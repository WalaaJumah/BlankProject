/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSAProductDetailsTestCases
 */

package sporter_test.productTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.productPage.KSAProductDetailsPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "KSA Product Details Page")

public class KSAProductDetailsTestCases extends ProductDetailsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        HeaderSection headerSection = new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if (webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            System.out.println("You are in KSA Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + ksaHomePage.saudiDomain);
            CloseInitialDialog();
        }
        DataHelperAndWait.clickOnElement(headerSection.getLanguageSelector(), webDriver);
        System.out.println(webDriver.getCurrentUrl());
        WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        System.out.println(webDriver.getCurrentUrl());

    }

    //    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getHomeBreadcrumbs(),webDriver);
//        WebElementsAssertion.assertTheUrlEqualExpectedUrl(webDriver.getCurrentUrl(),BasePage.BaseURL +kSAProductDetailsPage.saudiDomainArabic,webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure ability to navigate to the home page by clicking on the sporter logo from the product Details Page  ", priority = 36)
//    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() {
//        HeaderSection headerSection=new HeaderSection(webDriver);
//        HomePage homePage=new HomePage(webDriver);
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
//        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSlider(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the system display a label on the PDP to indicate for the customer he will get a free product", priority = 16)
//    public void verifyTheresLabelInPdpToIndicateThatTheresAnOfferOnThisProduct() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.navigateToBogoProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getFreeProductLabelAr(),webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Make sure the shopper is able to keep the shopping after adding the product to the cart ", priority = 2)
//    public void keepShoppingAfterAddingToTheCart() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.keepShoppingAfterAddingToCart();
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getAddToCartBtn(),webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Make sure the shopper is able to View the cart after adding the product to it ", priority = 3)
//    public void viewCartAfterAddingTheProductToIt() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getAddToCartBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getViewCartBtn(),webDriver);
//        WebElementsAssertion.validateTheCurrentUrlContainsString(kSAProductDetailsPage.cartURL,webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure the out of stock message appears when displaying out of stock product ", priority =4)
//    public void verifyOOSMessageIsDisplayed() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayOOSProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getOOSMsg(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},dependsOnMethods = "verifyOOSMessageIsDisplayed",description = "{{CountryName}}: Make sure the shopper is unable to add out of stock product to the cart", priority =5,expectedExceptions = { org.openqa.selenium.NoSuchElementException.class })
//    public void verifyInabilityToAddOosProductToTheCart(){
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        Assert.assertFalse(kSAProductDetailsPage.getAddToCartBtn().isDisplayed());
//    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure to display the product from search screen", priority = 6)
//    public void verifyAbilityToDisplayTheProductFromSearchScreen() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getSearchBtn(),webDriver);
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getProductCard(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getProductName(),webDriver);
//    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the increase quantity function works fine ", priority = 7)
//    public void verifyIncreaseQuantityButtonWorkingFine() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        kSAProductDetailsPage.increaseTheQuantity();
//        Assert.assertEquals( DataHelperAndWait.getWebElementText(kSAProductDetailsPage.getQuantityField(),webDriver),"2");;
//    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the Decrease quantity function works fine ", priority = 8)
//    public void verifyDecreaseQuantityButtonWorkingFine() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.decreaseTheQuantity();
//        Assert.assertEquals( DataHelperAndWait.getWebElementText(kSAProductDetailsPage.getQuantityField(),webDriver),"1");;
////        WebElementsAssertion.assertionAttributeTrueForElement(kSAProductDetailsPage.getQuantityField(),webDriver,"value","1");
//    }
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer can submit his review successfully ", priority = 9)
//    public void verifyAbilityToSubmitTheProductReview() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.selectStarInReview();
//        kSAProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getReviewToastMsg(),webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer is unable to submit his review without selecting any star ", priority = 10)
//    public void verifyInabilityToSubmitReviewWithoutSelectingStar() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        kSAProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDesc"),XmlReader.getXMLData("reviewSummary"),XmlReader.getXMLData("nickName"));
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getReviewErrorMsgRelatedToStars(),webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the customer can submit his review when filling Review Form with Long Length", priority = 11)
//    public void verifyAbilityToFillTheReviewWIthLongLength() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        kSAProductDetailsPage.selectStarInReview();
//        kSAProductDetailsPage.submitProductReview(XmlReader.getXMLData("reviewDescLong"),XmlReader.getXMLData("reviewSummaryLong"),XmlReader.getXMLData("nickNameLong"));
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getReviewToastMsg(),webDriver);
//    }
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}: Make sure that the customer can add the same product more than once by clicking on the Add To Product button in each time ", priority = 13)
//    public void verifyAbilityToAddProductToCartMultiTimes() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.keepShoppingAfterAddingToCart();
//        String oldProductURL = webDriver.getCurrentUrl();
//        kSAProductDetailsPage.addToCart();
//        kSAProductDetailsPage.keepShopping();
//        String newProductURL = webDriver.getCurrentUrl();
//        WebElementsAssertion.assertTheUrlEqualExpectedUrl(oldProductURL, newProductURL,webDriver);
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure that the product price is changed when you change the quantity ", priority = 14)
//    public void verifyTheProductPriceChangesBasedOnTheSelectedQty() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getFinalProductPrice(),webDriver);
//        String currentProductPrice = kSAProductDetailsPage.getFinalProductPrice().getText();
//        kSAProductDetailsPage.increaseTheQuantity();
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getFinalProductPrice(),webDriver);
//        String newProductPrice = kSAProductDetailsPage.getFinalProductPrice().getText();
//        Assert.assertNotEquals(currentProductPrice, newProductPrice);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Make sure ability to display the bundle and select all options", priority = 15)
//    public void verifyAbilityToDisplayBundleAndSelectAllOptions() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayBundle();
//        DataHelperAndWait.waitToBeVisible(kSAProductDetailsPage.getBundleMenu(),webDriver);
//        Select select = new Select(kSAProductDetailsPage.getBundleMenu());
//        WebElement currentSelectedOption = select.getFirstSelectedOption();
//        String currentSelectedOptionText = currentSelectedOption.getText();
//        System.out.println(currentSelectedOptionText);
//        DataHelperAndWait.selectAllDropDownListOptions(select);
//        WebElement newSelectedOption = select.getAllSelectedOptions().get(0);
//        String newSelectedOptionText = newSelectedOption.getText();
//        System.out.println(newSelectedOptionText);
//        Assert.assertNotEquals(currentSelectedOptionText, newSelectedOptionText);
//    }
//    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}: Verify that the About This product section displays correctly in the PDP", priority = 17)
//    public void verifyAboutThisProductSectionDisplaysCorrectlyInProductDetailsPage() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getAboutThisProductSection(),webDriver);
//        if(webDriver.getCurrentUrl().contains("com/en")){
//            WebElementsAssertion.assertionTextIsEqual(kSAProductDetailsPage.getAboutThisProductTitle(),webDriver, "About This Product");}
//        else {
//            WebElementsAssertion.assertionTextIsEqual(kSAProductDetailsPage.getAboutThisProductTitle(),webDriver, "حول هذا المنتج");}
//    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Supplement Facts section displays correctly in the PDP", priority = 18, enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
        kSAProductDetailsPage.displayTheProduct();
        assertTrue(kSAProductDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(kSAProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }

    //    //      The following Test Cases handle displaying the Mega Menu from Product Page
//    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Verify that the ShopBy Menu Is Displayed When Hovering On It From Product Details Page", priority = 19)
//    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(kSAProductDetailsPage.getShopByMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getSubCategoriesSectionForShopBy(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the Sport Supplements Menu Is Displayed When Hovering On It From Product Details Page", priority = 20)
//    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(kSAProductDetailsPage.getSportsSupplementsMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From Product Details Page", priority = 21)
//    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        kSAProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(aeMegamenuPage.getVitaminsAndHealthMainMenu(), webDriver);
//        DataHelperAndWait.hoverOnElement(aeMegamenuPage.getVitaminsAndHealthMainMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the Healthy Food Menu Is Displayed When Hovering On It From Product Details Page", priority = 22)
//    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(aeMegamenuPage.getHealthyFoodMainMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the Sports Menu Is Displayed When Hovering On It From Product Details Page", priority = 23)
//    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductDetailsPage() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.hoverOnElement(aeMegamenuPage.getSportsMainMenu(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getSubCategoriesSectionInMegaMenu(),webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Verify that the account Profile icon works correctly in PDP", priority = 24)
//    public void verifyAccountProfileIconWorksCorrectlyInProductDetailsPage() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getAccountProfileIcon(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getAccountProfileOptions(), webDriver);
//    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Direction Of Use section displays correctly in the PDP", priority = 25, enabled = false)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
        kSAProductDetailsPage.displayTheProduct();
//        assertTrue(kSAProductDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the About Brand section displays correctly in the PDP", priority = 26, enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
        assertTrue(kSAProductDetailsPage.getAboutBrandSection().isDisplayed());
    }

    //    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Verify that the header Bar in the PDP appears correctly when scrolling down", priority = 27)
//    public void verifyAddToCartBtnInHeaderBarWorksCorrectly() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        DataHelperAndWait.scrollTo(kSAProductDetailsPage.getAddReviewButton(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getProductHeaderBar(), webDriver);
//    }
//    @Test(groups = { "1.1 Critical Severity"},description = "{{CountryName}}: Verify that the Add to Cart Button appears in the header Bar in the PDP works correctly ", priority = 28)
//    public void verifyHeaderBarDisplaysCorrectlyInProductDetailsPageWhenScrollingThePage() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        DataHelperAndWait.scrollTo(kSAProductDetailsPage.getAddReviewButton(),webDriver);
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getAddToCartBtnInProductHeaderBar(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getKeepShippingBtn(), webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify clicking on the By Brand Link appears in Product Name section will redirect the user to correct page ", priority = 29)
//    public void verifyClickingOnByBrandLinkAppearsInProductNameSectionRedirectUserToCorrectPage() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getProductBrandLink(),webDriver);
//        kSAProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Verify that Expected Delivery Date Label and its value displayed correctly", priority = 30)
//    public void verifyExpectedDeliveryDateAppearsCorrectlyAndRetrieveDateInPdp() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getExpectedDeliveryDateLabel(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getExpectedDeliveryDateValue(), webDriver);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Verify that the search button works correctly from the PDP", priority = 31)
//    public void verifySearchBtnWorksCorrectlyFromPdp() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getSearchBtn(),webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(kSAProductDetailsPage.getSearchPageTitle(), webDriver);
//        kSAProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Make sure that the next review page button appears in Reviews section works correctly ", priority = 32)
//    public void verifyNextReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
//        kSAProductDetailsPage.displayTheProduct();
//        String reviewPages=DataHelperAndWait.getWebElementText(kSAProductDetailsPage.getReviewsPageNumber(),webDriver);
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getNextReviewPageBtn(),webDriver);
//        Assert.assertNotEquals(DataHelperAndWait.getWebElementText(kSAProductDetailsPage.getReviewsPageNumber(),webDriver),reviewPages);
//    }
//    //There's bug here
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Make sure that the Previous review page button appears in Reviews section works correctly ", priority = 33)
//    public void verifyPreviousReviewPageBtnAppearsInReviewsSectionWorksCorrectly() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
//        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getNextReviewPageBtn(),webDriver);
//        String reviewPagesInPage2=DataHelperAndWait.getWebElementText(kSAProductDetailsPage.getReviewsPageNumber(),webDriver);
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getPreviousReviewPageBtn(),webDriver);
//        DataHelperAndWait.waitForTime(2000);
//        String reviewPagesInPage1=DataHelperAndWait.getWebElementText(kSAProductDetailsPage.getReviewsPageNumber(),webDriver);
//        Assert.assertNotEquals(reviewPagesInPage2,reviewPagesInPage1);
//    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}: Make sure that the pagination control appears in Reviews section works correctly ", priority = 34)
//    public void verifyPaginationControlAppearsInReviewsSectionWorksCorrectly() {
//        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver); 
//        kSAProductDetailsPage.displayTheProduct();
//        kSAProductDetailsPage.verifyReviewPagingWorks();
//    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the simple price changes when navigation between sizes for the config ", priority = 35, enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() throws IOException {
        KSAProductDetailsPage kSAProductDetailsPage = new KSAProductDetailsPage(webDriver);
        kSAProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = kSAProductDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(kSAProductDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = kSAProductDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice, "The simple price is not changes");
    }
}
