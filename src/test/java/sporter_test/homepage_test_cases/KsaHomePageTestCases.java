package sporter_test.homepage_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.homepage_classes.KsaHomePage;
import xml_reader.XmlReader;

//@Test(groups = "2.03 KSA HomePage")
public class KsaHomePageTestCases  extends HomePageTestCases {

    @BeforeClass(alwaysRun=true)
    public void switchToKsaStore(){
        KsaHomePage ksaHomePage=new KsaHomePage(webDriver);
        HeaderSection headerSection =new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        DataHelperAndWait.scrollToPositionZero(webDriver);
        if(webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)){
            System.out.println("You are in KSA Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+ksaHomePage.saudiDomain);
            CloseInitialDialog();          }
        DataHelperAndWait.clickOnElement(headerSection.getLanguageSelector(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage,webDriver);
        System.out.println(webDriver.getCurrentUrl());

    }
    @Test(groups = { "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure the next button at the HomePage rotating slider section is displayed ", priority = 3)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNextArrowInHomePageRotatingSlider(), webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure the previous button at the HomePage rotating slider section is displayed ", priority = 4)
    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getPreviousArrowInHomePageRotatingSlider(), webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 5)
    public void verifyPaginationControlOnHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderPagingControl(), webDriver);
        for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
        }
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the banners inside the rotating slider section works correctly", priority = 6)
    public void verifyClickingOnTheBannersInsideTheHomePageRotatingSliderWillRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
            DataHelperAndWait.scrollToPositionZero(webDriver);
            DataHelperAndWait.clickOnElement(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
            homePage.clickOnBannerInRotatingSliderSection();
            homePage.verifyTheDisplayedPageDoesNotHaveErrors();
            homePage.navigateToHomePage();
        }
    }
    @Test(groups = { "1.1 Critical Severity"}, description = "(KSA Store/Arabic Version):Make sure the HomePage side Banners is displayed ", priority = 7)
    public void verifyHomePageSideBannerIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageSideBanner(), webDriver);
    }
    @Test(groups = { "1.1 Critical Severity"}, description = "(KSA Store/Arabic Version):Make sure the HomePage Horizontal Banner is displayed ", priority = 8)
    public void verifyHomePageHorizontalBannerIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageHorizontalBanner(), webDriver);
    }
    //TODO: Activate the validation rule when deployed the site into production as discussed with Moamen
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the first side banner works correctly", priority = 9)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        HomePage homePage = new HomePage(webDriver);
        DataHelperAndWait.scrollToPositionZero(webDriver);
        String expectedUrl = homePage.getFirstSideBanner().getAttribute("href");
        homePage.clickOnFirstSideBanner();
//        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //TODO: Activate the validation rule when deployed the site into production as discussed with Moamen
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the second side banner works correctly", priority = 10)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        String expectedUrl = homePage.getSecondSideBanner().getAttribute("href");
        homePage.clickOnSecondSideBanner();
//        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the HomePage Horizontal Banner works correctly", priority = 11)
    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageHorizontalBanner(), webDriver);
        String expectedUrl = homePage.getHomePageHorizontalBanner().getAttribute("href");
        homePage.clickOnHomePageHorizontalBanner();
//        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure the Shop By Category section is displayed ", priority = 12)
    public void verifyShopByCategoryIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getShopByCategoryHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getShopByCategorySections(), webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure the main options in the Mega Menu are retrieved correctly", priority = 13)
    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        if(webDriver.getCurrentUrl().contains(".com/en-")){
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getShopByOption(), webDriver, XmlReader.getXMLData("ShopByEn"));
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getSportSupplementsOption(), webDriver,XmlReader.getXMLData( "SportsSupplementsEn"));
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getVitaminsAndHealthOption(), webDriver, XmlReader.getXMLData("VitaminsAndHealthEn"));
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getHealthyFoodOption(), webDriver, XmlReader.getXMLData("HealthyFoodEn"));
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getSportsOption(), webDriver, XmlReader.getXMLData("SPORTSEn"));
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getWomenOnlyOption(), webDriver, XmlReader.getXMLData("WomenOnlyEn"));}

        else{
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getShopByOption(), webDriver, XmlReader.getXMLData("ShopByAr"));
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getSportSupplementsOption(), webDriver,XmlReader.getXMLData( "SportsSupplementsAr"));
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getVitaminsAndHealthOption(), webDriver, XmlReader.getXMLData("VitaminsAndHealthAr"));
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getHealthyFoodOption(), webDriver, XmlReader.getXMLData("HealthyFoodAr"));
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getSportsOption(), webDriver, XmlReader.getXMLData("SPORTSAr"));
            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getWomenOnlyOption(), webDriver, XmlReader.getXMLData("WomenOnlyAr"));}
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure the Banners appearing under shop by category are displayed", priority = 14)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        for (int i = 0; i < homePage.getHomePageUnderShopByCategoryBanners().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageUnderShopByCategoryBanners().get(i), webDriver);
        }
    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure the Top Selling Stacks section is displayed ", priority = 15)
    public void verifyTopSellingStacksSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellingStacksHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellingStacksSections(), webDriver);}
    @Test(groups = { "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the view all button from the Top Selling Stacks section works correctly ", priority = 16)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {
        HomePage homePage = new HomePage(webDriver);
        String expectedUrl = homePage.getViewAllBtnInTopSellingStacksSection().getAttribute("href");
        homePage.clickOnViewAllBtnInTopSellingStacksSection();
        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }
    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure the Top Sellers sections are displayed ", priority = 17)
    public void verifyTopSellersSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellerHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellerSections(), webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure that all links appear correctly in the Top Sellers section ", priority = 18)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getAllLinkInTopSellers(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportSupplementsLinkInTopSellers(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHealthyFoodLinkInTopSellers(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthLinkInTopSellers(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportswearAndAccessoriesLinkInTopSellers(), webDriver);
    }
    @Test(groups = { "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the Categories tabs appearing in the Top Sellers section are working correctly", priority = 19)
    public void verifyAbilityToClickOnAllCategoriesTabInTopSellersSection(){
        HomePage homePage = new HomePage(webDriver);
        for (int i = 0; i < homePage.getTopSellerCategoriesTabs().size(); i++) {
            DataHelperAndWait.clickOnElement(homePage.getTopSellerCategoriesTabs().get(i), webDriver);
            Assert.assertTrue(homePage.getTopSellerCategoriesTabs().get(i).getAttribute("class").startsWith("options_active"),"Clicking on The Categories tabs are not working correctly");
        }
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure the next button appearing in the Top Seller section works Correctly ", priority = 24)
    public void verifyNextBtnInTopSellerSectionWorks() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.validateNextOrPreviousBtnInPanelWork(homePage.getProductsInTopSellersSection(),homePage.getProductsInTopSellersSection().get(5),homePage.getNextButtonInTopSellerSection(),webDriver);

    }
    @Test(groups = { "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure that previous button in the Top Seller Section works correctly ", priority = 25)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
        HomePage homePage = new HomePage(webDriver);
        DataHelperAndWait.validateNextOrPreviousBtnInPanelWork(homePage.getProductsInTopSellersSection(),homePage.getProductsInTopSellersSection().get(0),homePage.getPreviousButtonInTopSellerSection(),webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure the Trending On Sporter sections are displayed ", priority = 26)
    public void verifyTrendingOnSporterSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTrendingOnSporterHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTrendingOnSporterSection(), webDriver);
    }
    @Test(groups = { "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure the New Arrivals sections are displayed ", priority = 29)
    public void verifyNewArrivalsSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsSection(), webDriver);
    }
    @Test(groups = { "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the Categories tabs appearing in the New Arrivals section are working correctly", priority = 19)
    public void verifyAbilityToClickOnAllCategoriesTabInNewArrivalsSection(){
        HomePage homePage = new HomePage(webDriver);
        for (int i = 0; i < homePage.getNewArrivalsCategoriesTabs().size(); i++) {
            DataHelperAndWait.clickOnElement(homePage.getNewArrivalsCategoriesTabs().get(i), webDriver);
            DataHelperAndWait.waitForTime(1500);
            Assert.assertTrue(homePage.getNewArrivalsCategoriesTabs().get(i).getAttribute("class").startsWith("options_active"),"Clicking on The Categories tabs are not working correctly");
        }
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure that previous and next button in the New Arrivals Section works correctly", priority = 36)
    public void verifyPreviousAndNextBtnInNewArrivalsSectionWorksCorrectly() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.validateNextOrPreviousBtnInPanelWork(homePage.getProductsInTopSellersSection(),homePage.getProductsInNewArrivalsSection().get(5),homePage.getNextBtnInNewArrivalsSection(),webDriver);
        DataHelperAndWait.validateNextOrPreviousBtnInPanelWork(homePage.getProductsInTopSellersSection(),homePage.getProductsInNewArrivalsSection().get(0),homePage.getPreviousBtnInNewArrivalsSection(),webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure the Got A Question section is displayed ", priority = 37)
    public void verifyGotQuestionSectionIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getGetQuestionBlock(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getPhoneBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getEmailBtn(), webDriver);
    }
    @Test(groups = { "All Smoke Testing Result", "1.3 Medium Severity"}, description = "(KSA Store/Arabic Version):Make sure the clicking on email button from the Got A Question section works correctly ", priority = 38)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickOnEmailBtn();
        WebElementsAssertion.validateTheCurrentUrlContainsString(homePage.contactUsUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }
    @Test(groups = { "1.1 Critical Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the Sports Supplements category from the HomePage works correctly ", priority = 39)
    public void verifyClickingOnSportsSupplementsCategoryRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnSportsSupplementsCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.1 Critical Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the Healthy Food category from the HomePage works correctly ", priority = 40)
    public void verifyClickingOnHealthyFoodCategoryRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnHealthyFoodCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.1 Critical Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the Vitamins And Health category from the HomePage works correctly ", priority = 41)
    public void verifyClickingOnVitaminsAndHealthCategoryRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnVitaminsAndHealthCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.1 Critical Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the Sportswear & Accessories category from the HomePage works correctly ", priority = 42)
    public void verifyClickingOnSportswearAndAccessoriesCategoryRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnSportswearAndAccessoriesCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = { "1.1 Critical Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the products appearing in the Top Selling Stacks section works correctly", priority = 43)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.accessAllProductsInWidget(homePage.getProductsInTopSellingStacksSection(),homePage.getNextBtnInTopSellingStacksSection(),webDriver,homePage);
    }
    @Test(groups = { "1.1 Critical Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the products appearing in the Top Sellers section works correctly", priority = 44)
    public void verifyClickOnTheProductsAppearingInTheTopSellersSectionRedirectTheUserToCorrectUrl() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
            DataHelperAndWait.accessAllProductsInWidget(homePage.getProductsInTopSellersSection(),homePage.getNextButtonInTopSellerSection(),webDriver,homePage);
    }
    @Test(groups = { "1.1 Critical Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on the products appearing in the New Arrivals section works correctly", priority = 45)
    public void verifyClickOnTheProductsAppearingInTheNewArrivalsSectionRedirectTheUserToCorrectUrl() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.accessAllProductsInWidget(homePage.getProductsInNewArrivalsSection(),homePage.getNextBtnInNewArrivalsSection(),webDriver,homePage);
    }
    @Test(groups = { "1.1 Critical Severity"}, description = "(KSA Store/Arabic Version):Make sure ability to access all categories inside Trending On Sporter Section Correctly", priority = 46)
    public void verifyClickOnTheCategoriesAppearingInTheTrendingOnSporterSectionRedirectTheUserToCorrectUrl() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        Assert.assertTrue(homePage.getCategoriesInsideTrendingOnSporterSection().size()>0,"There's no any products in the list");
        for (int i = 0; i < homePage.getCategoriesInsideTrendingOnSporterSection().size(); i++) {
            String expectedUrl = homePage.getCategoriesInsideTrendingOnSporterSection().get(i).getAttribute("href");
            DataHelperAndWait.clickOnElement(homePage.getCategoriesInsideTrendingOnSporterSection().get(i), webDriver);
            homePage.verifyTheDisplayedPageDoesNotHaveErrors();
            homePage.navigateToHomePage();
        }
    }
    @Test(groups = { "1.2 High Severity"}, description = "(KSA Store/Arabic Version):Make sure clicking on phone button from the Got A Question section works correctly ", priority = 47)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnPhoneBtn();
        // store window handles in Set
        String myWindowHandle = webDriver.getWindowHandle();
        webDriver.switchTo().window(myWindowHandle);
    }

}