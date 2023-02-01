/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptHomePageTestCases
 */

package sporter_test.homepage_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.*;
import xml_reader.XmlReader;

//@Test(groups = "2.05 Egypt HomePage")
public class EgyptHomePageTestCases extends HomePageTestCases {

    @BeforeClass(alwaysRun=true)
//    @Test
    public void switchToEgyptStore(){
        EgyptHomePage egyptHomePage=new EgyptHomePage(webDriver);
        DataHelperAndWait.scrollToPositionZero(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        DataHelperAndWait.scrollToPositionZero(webDriver);
        if(webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)){
            System.out.println("You are in Jordan Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+egyptHomePage.egyptDomain);
            CloseInitialDialog();          }
    }
    @Test(enabled = false)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed() {}
    @Test(enabled = false)
    public void verifyTopSellingStacksSectionAreDisplayed() {}
    @Test(enabled = false)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {}
    @Test(enabled = false)
    public void verifyTopSellersSectionAreDisplayed() { }
    @Test(enabled = false)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {}
    @Test(enabled = false)
    public void verifyAbilityToClickOnAllCategoriesTabInTopSellersSection(){}
    @Test(enabled = false)
    public void verifyNextBtnInTopSellerSectionWorks() { }
    @Test(enabled = false)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {}
    @Test(enabled = false)
    public void verifyTrendingOnSporterSectionAreDisplayed() { }
    @Test(enabled = false)
    public void verifyNewArrivalsSectionAreDisplayed() { }
    @Test(enabled = false)
    public void verifyAbilityToClickOnAllCategoriesTabInNewArrivalsSection(){ }
    @Test(enabled = false)
    public void verifyPreviousAndNextBtnInNewArrivalsSectionWorksCorrectly() {}
    @Test(enabled = false)
    public void verifyGotQuestionSectionIsDisplayed() {}
    @Test(enabled = false)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() { }
    @Test(enabled = false)
    public void verifyClickingOnSportswearAndAccessoriesCategoryRedirectTheUserToCorrectPage() { }
    @Test(enabled = false)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() { }
    @Test(enabled = false)
    public void verifyClickOnTheProductsAppearingInTheTopSellersSectionRedirectTheUserToCorrectUrl() {}
    @Test(enabled = false)
    public void verifyClickOnTheProductsAppearingInTheNewArrivalsSectionRedirectTheUserToCorrectUrl() {}
    @Test(enabled = false)
    public void verifyClickOnTheCategoriesAppearingInTheTrendingOnSporterSectionRedirectTheUserToCorrectUrl() {}
    @Test(enabled = false)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {}
//    @Test(groups = { "1.3 Medium Severity"}, description = "(Egypt Store/English Version):Make sure the next button at the HomePage rotating slider section is displayed ", priority = 3)
//    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
//        HomePage homePage = new HomePage(webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNextArrowInHomePageRotatingSlider(), webDriver);
//    }
//
//    @Test(groups = { "1.3 Medium Severity"}, description = "(Egypt Store/English Version):Make sure the previous button at the HomePage rotating slider section is displayed ", priority = 4)
//    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed() {
//        HomePage homePage = new HomePage(webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getPreviousArrowInHomePageRotatingSlider(), webDriver);
//    }
//
//    @Test(groups = { "1.3 Medium Severity"}, description = "(Egypt Store/English Version):Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 5)
//    public void verifyPaginationControlOnHomePageRotatingSliderIsDisplayed() {
//        HomePage homePage = new HomePage(webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderPagingControl(), webDriver);
//        for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
//            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
//        }
//    }
//
//    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(Egypt Store/English Version):Make sure clicking on the banners inside the rotating slider section works correctly", priority = 6)
//    public void verifyClickingOnTheBannersInsideTheHomePageRotatingSliderWillRedirectTheUserToCorrectPage() {
//        HomePage homePage = new HomePage(webDriver);
//        for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
//            DataHelperAndWait.scrollToPositionZero(webDriver);
//            DataHelperAndWait.clickOnElement(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
//            homePage.clickOnBannerInRotatingSliderSection();
//            homePage.verifyTheDisplayedPageDoesNotHaveErrors();
//            homePage.navigateToHomePage();
//        }
//    }
//
//    @Test(groups = { "1.1 Critical Severity"}, description = "(Egypt Store/English Version):Make sure the HomePage side Banners is displayed ", priority = 7)
//    public void verifyHomePageSideBannerIsDisplayed() {
//        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageSideBanner(), webDriver);
//    }
//
//    @Test(groups = { "1.1 Critical Severity"}, description = "(Egypt Store/English Version):Make sure the HomePage Horizontal Banner is displayed ", priority = 8)
//    public void verifyHomePageHorizontalBannerIsDisplayed() {
//        HomePage homePage = new HomePage(webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageHorizontalBanner(), webDriver);
//    }
//    //TODO: Activate the validation rule when deployed the site into production as discussed with Moamen
//    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(Egypt Store/English Version):Make sure clicking on the first side banner works correctly", priority = 9)
//    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
//        HomePage homePage = new HomePage(webDriver);
//        DataHelperAndWait.scrollToPositionZero(webDriver);
//        String expectedUrl = homePage.getFirstSideBanner().getAttribute("href");
//        homePage.clickOnFirstSideBanner();
////        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
//        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//
//    //TODO: Activate the validation rule when deployed the site into production as discussed with Moamen
//    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(Egypt Store/English Version):Make sure clicking on the second side banner works correctly", priority = 10)
//    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
//        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
//        DataHelperAndWait.scrollToPositionZero(webDriver);
//        String expectedUrl = homePage.getSecondSideBanner().getAttribute("href");
//        homePage.clickOnSecondSideBanner();
////        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
//        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//
//    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(Egypt Store/English Version):Make sure clicking on the HomePage Horizontal Banner works correctly", priority = 11)
//    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
//        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageHorizontalBanner(), webDriver);
//        String expectedUrl = homePage.getHomePageHorizontalBanner().getAttribute("href");
//        homePage.clickOnHomePageHorizontalBanner();
////        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
//        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//
//    @Test(groups = { "All Smoke Testing Result", "1.2 High Severity"}, description = "(Egypt Store/English Version):Make sure the Shop By Category section is displayed ", priority = 12)
//    public void verifyShopByCategoryIsDisplayed() {
//        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getShopByCategoryHeader(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getShopByCategorySections(), webDriver);
//    }
//
//    @Test(groups = { "1.3 Medium Severity"}, description = "(Egypt Store/English Version):Make sure the main options in the Mega Menu are retrieved correctly", priority = 13)
//    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
//        HomePage homePage = new HomePage(webDriver);
//        if(webDriver.getCurrentUrl().contains(".com/en-")){
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getShopByOption(), webDriver, XmlReader.getXMLData("ShopByEn"));
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getSportSupplementsOption(), webDriver,XmlReader.getXMLData( "SportsSupplementsEn"));
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getVitaminsAndHealthOption(), webDriver, XmlReader.getXMLData("VitaminsAndHealthEn"));
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getHealthyFoodOption(), webDriver, XmlReader.getXMLData("HealthyFoodEn"));
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getSportsOption(), webDriver, XmlReader.getXMLData("SPORTSEn"));
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getWomenOnlyOption(), webDriver, XmlReader.getXMLData("WomenOnlyEn"));}
//
//        else{
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getShopByOption(), webDriver, XmlReader.getXMLData("ShopByAr"));
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getSportSupplementsOption(), webDriver,XmlReader.getXMLData( "SportsSupplementsAr"));
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getVitaminsAndHealthOption(), webDriver, XmlReader.getXMLData("VitaminsAndHealthAr"));
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getHealthyFoodOption(), webDriver, XmlReader.getXMLData("HealthyFoodAr"));
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getSportsOption(), webDriver, XmlReader.getXMLData("SPORTSAr"));
//            WebElementsAssertion.assertionEqualsForElementAttribute(homePage.getWomenOnlyOption(), webDriver, XmlReader.getXMLData("WomenOnlyAr"));}
//    }
//
//    @Test(groups = { "1.1 Critical Severity"}, description = "(Egypt Store/English Version):Make sure clicking on the Sports Supplements category from the HomePage works correctly ", priority = 39)
//    public void verifyClickingOnSportsSupplementsCategoryRedirectTheUserToCorrectPage() {
//        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
//        homePage.clickOnSportsSupplementsCategory();
//        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//
//    @Test(groups = { "1.1 Critical Severity"}, description = "(Egypt Store/English Version):Make sure clicking on the Healthy Food category from the HomePage works correctly ", priority = 40)
//    public void verifyClickingOnHealthyFoodCategoryRedirectTheUserToCorrectPage() {
//        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
//        homePage.clickOnHealthyFoodCategory();
//        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
//
//    @Test(groups = { "1.1 Critical Severity"}, description = "(Egypt Store/English Version):Make sure clicking on the Vitamins And Health category from the HomePage works correctly ", priority = 41)
//    public void verifyClickingOnVitaminsAndHealthCategoryRedirectTheUserToCorrectPage() {
//        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
//        homePage.clickOnVitaminsAndHealthCategory();
//        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }

}