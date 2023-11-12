/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class contains all test cases related to the HomePage
 */

package sporter_test.homepage_test_cases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.footerSections.FooterSection;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.productPage.ProductDetailsPage;
import xml_reader.XmlReader;

import java.io.IOException;

@Test(groups = "2.05 HomePage")
public class HomePageTestCases extends BaseTest {
    String storeCountry;

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the next button at the HomePage rotating slider section is displayed ", priority = 1)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() throws IOException {
        HomePage homePage = new HomePage(webDriver);
            homePage.navigateToHomePage();
            Assert.assertTrue(DataHelperAndWait.IsElementPresent(homePage.getNextArrowInHomePageRotatingSlider()));
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the previous button at the HomePage rotating slider section is displayed ", priority = 2)
    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed(){
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(DataHelperAndWait.IsElementPresent(homePage.getPreviousArrowInHomePageRotatingSlider()));
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 3)
    public void verifyPaginationControlOnHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        if(DataHelperAndWait.IsElementPresent(homePage.getHomePageRotatingSliderPagingControl())){
        for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
        }
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on the banners inside the rotating slider section works correctly", priority = 23)
    public void verifyClickingOnTheBannersInsideTheHomePageRotatingSliderWillRedirectTheUserToCorrectPage() throws IOException {
        HomePage homePage = new HomePage(webDriver);
            homePage.navigateToHomePage();
        if(DataHelperAndWait.IsElementPresent(homePage.getHomePageRotatingSliderPagingList().get(0))) {
            for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
                DataHelperAndWait.scrollToPositionZero(webDriver);
                DataHelperAndWait.clickOnElement(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
                homePage.clickOnBannerInRotatingSliderSection();
                homePage.verifyTheDisplayedPageDoesNotHaveErrors();
                homePage.navigateToHomePage();
            }
        }
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure the HomePage side Banners is displayed ", priority = 4)
    public void verifyHomePageSideBannerIsDisplayed() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageSideBanner(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the HomePage Horizontal Banner is displayed ", priority = 5)
    public void verifyHomePageHorizontalBannerIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageHorizontalBanner(), webDriver);
    }

    //TODO: Activate the validation rule when deployed the site into production as discussed with Moamen
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on the first side banner works correctly", priority = 20)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectly() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        homePage.clickOnFirstSideBanner();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    //TODO: Activate the validation rule when deployed the site into production as discussed with Moamen
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on the second side banner works correctly", priority = 22)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectly() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        homePage.clickOnSecondSideBanner();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on the HomePage Horizontal Banner works correctly", priority = 24)
    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageHorizontalBanner(), webDriver);
        homePage.clickOnHomePageHorizontalBanner();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Shop By Category section is displayed ", priority =  6)
    public void verifyShopByCategoryIsDisplayed() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getShopByCategoryHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getShopByCategorySections(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the main options in the Mega Menu are retrieved correctly", priority = 7)
    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        DataHelperAndWait.waitTillPageFullyLoaded(webDriver,10);
        if(webDriver.getCurrentUrl().contains(".com/en-")) {
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getShopByOption(), webDriver, XmlReader.getXMLData("ShopByEn"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getSportSupplementsOption(), webDriver, XmlReader.getXMLData("SportsSupplementsEn"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getVitaminsAndHealthOption(), webDriver, XmlReader.getXMLData("VitaminsAndHealthEn"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getHealthyFoodOption(), webDriver, XmlReader.getXMLData("HealthyFoodEn"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getSportsOption(), webDriver, XmlReader.getXMLData("SPORTSEn"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getWomenOnlyOption(), webDriver, XmlReader.getXMLData("WomenOnlyEn"));
        }
        else{
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getShopByOption(), webDriver, XmlReader.getXMLData("ShopByAr"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getSportSupplementsOption(), webDriver, XmlReader.getXMLData("SportsSupplementsAr"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getVitaminsAndHealthOption(), webDriver, XmlReader.getXMLData("VitaminsAndHealthAr"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getHealthyFoodOption(), webDriver, XmlReader.getXMLData("HealthyFoodAr"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getSportsOption(), webDriver, XmlReader.getXMLData("SPORTSAr"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getWomenOnlyOption(), webDriver, XmlReader.getXMLData("WomenOnlyAr"));
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Banners appearing under shop by category are displayed", priority = 8)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        for (int i = 0; i < homePage.getHomePageUnderShopByCategoryBanners().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageUnderShopByCategoryBanners().get(i), webDriver);
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure the Top Selling Stacks section is displayed ", priority = 9)
    public void verifyTopSellingStacksSectionAreDisplayed() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellingStacksHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellingStacksSections(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"},description = "{{CountryName}}: Make sure clicking on the view all button from the Top Selling Stacks section works correctly ", priority = 19)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() throws IOException {
        HomePage homePage = new HomePage(webDriver);
//        String expectedUrl = homePage.getViewAllBtnInTopSellingStacksSection().getAttribute("href");
        homePage.clickOnViewAllBtnInTopSellingStacksSection();
//        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Top Sellers sections are displayed ", priority = 10)
    public void verifyTopSellersSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellerHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellerSections(), webDriver);
    }
//TODO:Needs to checked on all countries
    @Test(enabled = false,groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that all links appear correctly in the Top Sellers section ", priority = 18)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getAllLinkInTopSellers(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportSupplementsLinkInTopSellers(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHealthyFoodLinkInTopSellers(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthLinkInTopSellers(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportswearAndAccessoriesLinkInTopSellers(), webDriver);
    }

    @Test(groups = {"1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on the Categories tabs appearing in the Top Sellers section are working correctly", priority = 26)
    public void verifyAbilityToClickOnAllCategoriesTabInTopSellersSection() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        for (int i = 0; i < homePage.getTopSellerCategoriesTabs().size(); i++) {
            DataHelperAndWait.clickOnElement(homePage.getTopSellerCategoriesTabs().get(i), webDriver);
            Assert.assertTrue(homePage.getTopSellerCategoriesTabs().get(i).getAttribute("class").startsWith("options_active"), "Clicking on The Categories tabs are not working correctly");
        }
    }

    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the next button appearing in the Top Seller section works Correctly ", priority = 24)
    public void verifyNextBtnInTopSellerSectionWorks() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.validateNextOrPreviousBtnInPanelWork(homePage.getProductsInTopSellersSection(), homePage.getProductsInTopSellersSection().get(5), homePage.getNextButtonInTopSellerSection(), webDriver);

    }

    //ToDo: Needs to recheck it
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that previous button in the Top Seller Section works correctly ", priority = 16)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
        HomePage homePage = new HomePage(webDriver);
        try {
            DataHelperAndWait.validateNextOrPreviousBtnInPanelWork(homePage.getProductsInTopSellersSection(), homePage.getProductsInTopSellersSection().get(0), homePage.getPreviousButtonInTopSellerSection(), webDriver);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}: Make sure the Trending On Sporter sections are displayed ", priority = 11)
    public void verifyTrendingOnSporterSectionAreDisplayed() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTrendingOnSporterHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTrendingOnSporterSection(), webDriver);
    }

    @Test(groups = {"1.2 High Severity"}, description = "{{CountryName}}: Make sure the New Arrivals sections are displayed ", priority = 12)
    public void verifyNewArrivalsSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsSection(), webDriver);
    }

    @Test(groups = {"1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on the Categories tabs appearing in the New Arrivals section are working correctly", priority = 25)
    public void verifyAbilityToClickOnAllCategoriesTabInNewArrivalsSection() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        for (int i = 0; i < homePage.getNewArrivalsCategoriesTabs().size(); i++) {
            DataHelperAndWait.clickOnElement(homePage.getNewArrivalsCategoriesTabs().get(i), webDriver);
            Assert.assertTrue(homePage.getNewArrivalsCategoriesTabs().get(i).getAttribute("class").startsWith("options_active"), "Clicking on The Categories tabs are not working correctly");
        }
    }

    //ToDo:Needs to recheck
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that previous and next button in the New Arrivals Section works correctly", priority = 17)
    public void verifyPreviousAndNextBtnInNewArrivalsSectionWorksCorrectly() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        try {
            DataHelperAndWait.validateNextOrPreviousBtnInPanelWork(homePage.getProductsInTopSellersSection(), homePage.getProductsInNewArrivalsSection().get(5), homePage.getNextBtnInNewArrivalsSection(), webDriver);
            DataHelperAndWait.validateNextOrPreviousBtnInPanelWork(homePage.getProductsInTopSellersSection(), homePage.getProductsInNewArrivalsSection().get(0), homePage.getPreviousBtnInNewArrivalsSection(), webDriver);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the Got A Question section is displayed ", priority = 18)
    public void verifyGotQuestionSectionIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getGetQuestionBlock(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getPhoneBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getEmailBtn(), webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the clicking on email button from the Got A Question section works correctly ", priority = 37)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickOnEmailBtn();
        WebElementsAssertion.validateTheCurrentUrlContainsString(homePage.contactUsUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on the Sports Supplements category from the HomePage works correctly ", priority = 27)
    public void verifyClickingOnSportsSupplementsCategoryRedirectTheUserToCorrectPage() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnSportsSupplementsCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on the Healthy Food category from the HomePage works correctly ", priority = 28)
    public void verifyClickingOnHealthyFoodCategoryRedirectTheUserToCorrectPage() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnHealthyFoodCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on the Vitamins And Health category from the HomePage works correctly ", priority = 29)
    public void verifyClickingOnVitaminsAndHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnVitaminsAndHealthCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on the Sportswear & Accessories category from the HomePage works correctly ", priority = 30)
    public void verifyClickingOnSportswearAndAccessoriesCategoryRedirectTheUserToCorrectPage() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnSportswearAndAccessoriesCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure clicking on the products appearing in the Top Selling Stacks section works correctly", priority = 33)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        DataHelperAndWait.accessAllProductsInWidget(homePage.getProductsInTopSellingStacksSection(), homePage.getNextBtnInTopSellingStacksSection(), webDriver, homePage);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure clicking on the products appearing in the Top Sellers section works correctly", priority = 34)
    public void verifyClickOnTheProductsAppearingInTheTopSellersSectionRedirectTheUserToCorrectUrl() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        DataHelperAndWait.accessAllProductsInWidget(homePage.getProductsInTopSellersSection(), homePage.getNextButtonInTopSellerSection(), webDriver, homePage);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure clicking on the products appearing in the New Arrivals section works correctly", priority = 35)
    public void verifyClickOnTheProductsAppearingInTheNewArrivalsSectionRedirectTheUserToCorrectUrl() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        DataHelperAndWait.accessAllProductsInWidget(homePage.getProductsInNewArrivalsSection(), homePage.getNextBtnInNewArrivalsSection(), webDriver, homePage);
    }

    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to access all categories inside Trending On Sporter Section Correctly", priority = 36)
    public void verifyClickOnTheCategoriesAppearingInTheTrendingOnSporterSectionRedirectTheUserToCorrectUrl() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        if (homePage.getCategoriesInsideTrendingOnSporterSection().size() > 0) {
            System.out.println("There's no any products in the list");
        } else {
            for (int i = 0; i < homePage.getCategoriesInsideTrendingOnSporterSection().size(); i++) {
//                String expectedUrl = homePage.getCategoriesInsideTrendingOnSporterSection().get(i).getAttribute("href");
                DataHelperAndWait.clickOnElement(homePage.getCategoriesInsideTrendingOnSporterSection().get(i), webDriver);
                homePage.verifyTheDisplayedPageDoesNotHaveErrors();
                homePage.navigateToHomePage();
            }
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure clicking on phone button from the Got A Question section works correctly ", priority = 200)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnPhoneBtn();
    }

    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"}, description = "{{CountryName}}: Make sure clicking on all banners appear under shop by category work correctly", priority = 38)
    public void verifyAbilityToClickOnUnderShopByCategoryWorksCorrectly() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        for (int i = 0; i < homePage.getUnderShopByCategoryBanners().size(); i++) {
            DataHelperAndWait.waitToBeClickable(homePage.getUnderShopByCategoryBanners().get(i), webDriver);
            DataHelperAndWait.JsExecutorToClickOnElement(homePage.getUnderShopByCategoryBanners().get(i), webDriver);
           homePage.verifyTheDisplayedPageDoesNotHaveErrors();
           homePage.navigateToHomePage();
           homePage.waitTillLoaderComplete();
        }
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Search section appears correctly", priority = 13)
    public void verifySearchSectionIsDisplayedCorrectly() {
        HeaderSection headerSection = new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getSearchSectionForm(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Cart icon appears correctly", priority = 14)
    public void verifyCartIconAppearsCorrectly() {
        HeaderSection headerSection = new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getCartIcon(), webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the My Account icon appears correctly", priority = 15)
    public void verifyProfileIconAppearsCorrectly() throws IOException {
        HeaderSection headerSection = new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getAccountProfileIcon(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Verify that the search button works correctly from the PDP", priority = 21)
    public void verifySearchBtnWorksCorrectlyFromPdp() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        if(DataHelperAndWait.IsElementPresent(productDetailsPage.getSearchField())) {
            DataHelperAndWait.typeTextInElement(productDetailsPage.getSearchField(), webDriver, "Basic");
            DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(), webDriver);
            DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(), webDriver);
            productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
            productDetailsPage.waitTillCartSpinnerIconDisappear(webDriver);
            DataHelperAndWait.waitForTime(1000);
            if(!DataHelperAndWait.IsElementPresent(productDetailsPage.getProductCard()))
                throw new AssertionError("The Search page is empty");
        }
    }
// New Test Cases:
@Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure the Next Arrow appears on the HomePage rotating slider is not displayed in case there's one Banner Only", priority = 40,expectedExceptions = NoSuchElementException.class)
public void verifyTheNextArrowAppearsAtRotatingBannersIsNotDisplayedWhenTheresOnlyOneBanner() {
    HomePage homePage = new HomePage(webDriver);
    if(homePage.getHomePageRotatingSliderPagingControlSection().isDisplayed()){
        DataHelperAndWait.IsElementPresent(homePage.getNextArrowInHomePageRotatingSlider());
    }
   else{
        for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
        }
    }
}
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 41)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInVitaminsAndHealthCategoryPage() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
//        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        for (int i = 0; i < footerSection.getPageBottomBlocksList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getPageBottomBlocksList().get(i), webDriver);
        }
    }
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the copy Right label appears correctly ", priority = 42)
    public void verifyCopyRightLabelAppearCorrectly(){
        FooterSection footerSection = new FooterSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getCopyRightLabel(),webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Join Our NewsLetter Section appears correctly ", priority = 43)
    public void verifyJoinNewsLetterSectionAppears(){
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getJoinNewsLetterSection(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the text of Header & description inside Join Our NewsLetter Section appearing correctly ", priority = 44)
    public void verifyAllTextInsideJoinNewsLetterSectionAppearsCorrectly(){
        HomePage homePage = new HomePage(webDriver);
        if(webDriver.getCurrentUrl().contains(".com/ar-")) {
            WebElementsAssertion.assertionTextIsEqual(homePage.getNewsLetterHeader(), webDriver, XmlReader.getXMLData("NewsLetterHeaderAr"));
            WebElementsAssertion.assertionTextIsEqual(homePage.getNewsLettertail(), webDriver, XmlReader.getXMLData("NewsLetterTailAr"));
        }
        else {
            WebElementsAssertion.assertionTextIsEqual(homePage.getNewsLetterHeader(), webDriver, XmlReader.getXMLData("NewsLetterHeaderEN"));
            WebElementsAssertion.assertionTextIsEqual(homePage.getNewsLettertail(), webDriver, XmlReader.getXMLData("NewsLetterTailEn"));
        }

    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure inability to join Newsletter without filling the email field ", priority = 45)
    public void verifyInAbilityToJoinNewsLetterWithoutFillingEmailField(){
        HomePage homePage = new HomePage(webDriver);
        DataHelperAndWait.clickOnElement(homePage.getJoinButton(),webDriver);
        if(webDriver.getCurrentUrl().contains(".com/ar-"))
            WebElementsAssertion.assertionTextIsEqual(homePage.getEmailErrorMsg(), webDriver, XmlReader.getXMLData("EmailRequiredMsgAr"));
        else
            WebElementsAssertion.assertionTextIsEqual(homePage.getEmailErrorMsg(), webDriver, XmlReader.getXMLData("EmailRequiredMsgEn"));
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure inability to join Newsletter with incorrect Email formate ", priority = 46)
    public void verifyInAbilityToJoinNewsLetterWithIncorrectEmailFormate() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.fillInEmailField(XmlReader.getXMLData("incorrectEmailFormate"));
        DataHelperAndWait.clickOnElement(homePage.getJoinButton(),webDriver);
        if(webDriver.getCurrentUrl().contains(".com/ar-"))
            WebElementsAssertion.assertionTextIsEqual(homePage.getEmailErrorMsg(), webDriver, XmlReader.getXMLData("emailFormatErrorAr"));
        else
            WebElementsAssertion.assertionTextIsEqual(homePage.getEmailErrorMsg(), webDriver, XmlReader.getXMLData("emailFormatErrorEn"));
    }
    String email="";
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to join Newsletter when selected Female Gender ", priority = 47)
    public void verifyAbilityToJoinNewsLetterWithSelectingFemaleOption() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        email=DataHelperAndWait.generateRandomEmail();
        DataHelperAndWait.clickOnElement(homePage.getFemaleRadioButton(),webDriver);
        homePage.fillInEmailField(email);
        System.out.println(email);
        DataHelperAndWait.clickOnElement(homePage.getJoinButton(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSubscriptionErrorMsg(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure ability to join Newsletter when selected Male Gender ", priority = 48)
    public void verifyAbilityToJoinNewsLetterWithSelectingMaleOption() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(homePage.getMaleRadioButton(),webDriver);
        homePage.fillInEmailField(DataHelperAndWait.generateRandomEmail());
        DataHelperAndWait.clickOnElement(homePage.getJoinButton(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSubscriptionErrorMsg(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure inability to join Newsletter when used email already subscribed with selected Female Option", priority = 49)
    public void verifyInAbilityToJoinNewsLetterWithSelectingFemaleOptionForEmailAlreadySubscribed() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(homePage.getFemaleRadioButton(),webDriver);
        homePage.fillInEmailField(email);
        System.out.println(email);
        DataHelperAndWait.clickOnElement(homePage.getJoinButton(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getErrorMsgPopUp(),webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure inability to join Newsletter when used email already subscribed with selected Male Option", priority = 50)
    public void verifyInAbilityToJoinNewsLetterWithSelectingMaleOptionForEmailAlreadySubscribed() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(homePage.getMaleRadioButton(),webDriver);
        homePage.fillInEmailField(email);
        System.out.println(email);
        DataHelperAndWait.clickOnElement(homePage.getJoinButton(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getErrorMsgPopUp(),webDriver);
    }
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the correct placeholder appears in the Search field", priority = 51)
    public void verifyTheCorrectPlaceHolderAppearsInTheSearchFieldFromHomePageModule() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        HeaderSection headerSection= new HeaderSection(webDriver);
        homePage.navigateToHomePage();
        if(webDriver.getCurrentUrl().contains(".com/en-"))
            WebElementsAssertion.assertionAttributeTrueForElement(headerSection.getSearchField(), webDriver, "placeholder",XmlReader.getXMLData("SearchPlaceHolderEn") );
        else
            WebElementsAssertion.assertionAttributeTrueForElement(headerSection.getSearchField(), webDriver, "placeholder",XmlReader.getXMLData("SearchPlaceHolderAr") );
    }
    @Test(groups = { "1.4 Medium Severity"}, description = "{{CountryName}}: Make sure Switching Language from HomePage is not display any error", priority = 300)
    public void verifySwitchLanguageFromHomePageIsNotDisplayAnyError() throws IOException {
        HomePage homePage = new HomePage(webDriver);
        HeaderSection headerSection= new HeaderSection(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(headerSection.getLanguageBtn(),webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }












}
//    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the next button appearing in the Trending On Sporter section works Correctly ", priority = 27)
//    public void verifyNextBtnInTrendingOnSporterSectionWorks() {
//        HomePage homePage = new HomePage(webDriver);
////        homePage.navigateToHomePage();
//        homePage.clickOnNextButtonInTrendingOnSporterSection();
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTrendingOnSporterSectionPositionAfterClickingOnNext(), webDriver);
//    }

//    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the previous button appearing in the Trending On Sporter section works Correctly ", priority = 28)
//    public void verifyPreviousBtnInTrendingOnSporterSectionWorks() {
//        HomePage homePage = new HomePage(webDriver);
////        homePage.navigateToHomePage();
//        homePage.clickOnNextButtonInTrendingOnSporterSection();
//        homePage.clickOnPreviousButtonInTrendingOnSporterSection();
//    }
