/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class contains all test cases related to the HomePgae
 */

package sporter_test.homepage_test_cases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.HomePage;

public class HomePageTestCases extends BaseTest {

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure the Banners appear correctly in the HomePage rotating slider section ", priority = 2)
    public void verifyHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        for (int i = 0; i < homePage.getHomePageRotatingSliderList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderList().get(i), webDriver);
        }
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the next button at the HomePage rotating slider section is displayed ", priority = 3)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNextArrowInHomePageRotatingSlider(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the previous button at the HomePage rotating slider section is displayed ", priority = 4)
    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getPreviousArrowInHomePageRotatingSlider(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 5)
    public void verifyPaginationControlOnHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderPagingControl(), webDriver);
        for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
        }
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure clicking on the banners inside the rotating slider section works correctly", priority = 6)
    public void verifyClickingOnTheBannersInsideTheHomePageRotatingSliderWillRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
            DataHelperAndWait.clickOnElement(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
            homePage.clickOnBannerInRotatingSliderSection();
            homePage.verifyTheDisplayedPageDoesNotHaveErrors();
            homePage.navigateToHomePage();
        }
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure the HomePage side Banners is displayed ", priority = 7)
    public void verifyHomePageSideBannerIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageSideBanner(), webDriver);
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure the HomePage Horizontal Banner is displayed ", priority = 8)
    public void verifyHomePageHorizontalBannerIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageHorizontalBanner(), webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure clicking on the first side banner works correctly", priority = 9)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        String expectedUrl = homePage.getFirstSideBanner().getAttribute("href");
        homePage.clickOnFirstSideBanner();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure clicking on the second side banner works correctly", priority = 10)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        String expectedUrl = homePage.getSecondSideBanner().getAttribute("href");
        homePage.clickOnSecondSideBanner();
        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure clicking on the HomePage Horizontal Banner works correctly", priority = 11)
    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageHorizontalBanner(), webDriver);
        String expectedUrl = homePage.getHomePageHorizontalBanner().getAttribute("href");
        homePage.clickOnHomePageHorizontalBanner();
        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure the Shop By Category section is displayed ", priority = 12)
    public void verifyShopByCategoryIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getShopByCategoryHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getShopByCategorySections(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the main options in the Mega Menu are retrieved correctly", priority = 13)
    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        WebElementsAssertion.assertionEquals(homePage.getShopByOption(), webDriver, "Shop By");
        WebElementsAssertion.assertionEquals(homePage.getSportSupplementsOption(), webDriver, "Sport Supplements");
        WebElementsAssertion.assertionEquals(homePage.getVitaminsAndHealthOption(), webDriver, "Vitamins & Health");
        WebElementsAssertion.assertionEquals(homePage.getHealthyFoodOption(), webDriver, "Healthy Food");
        WebElementsAssertion.assertionEquals(homePage.getSportsOption(), webDriver, "SPORTS");
        WebElementsAssertion.assertionEquals(homePage.getWomenOnlyOption(), webDriver, "Women's Only");
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the Banners appearing under shop by category are displayed", priority = 14)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        for (int i = 0; i < homePage.getHomePageUnderShopByCategoryBanners().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageUnderShopByCategoryBanners().get(i), webDriver);
        }
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure the Top Selling Stacks section is displayed ", priority = 15)
    public void verifyTopSellingStacksSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellingStacksHeader(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellingStacksSections(), webDriver);}
    @Test(groups = { "2. High Severity"}, description = "HomePage- Make sure clicking on the view all button from the Top Selling Stacks section works correctly ", priority = 16)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        String expectedUrl = homePage.getViewAllBtnInTopSellingStacksSection().getAttribute("href");
        homePage.clickOnViewAllBtnInTopSellingStacksSection();
        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure the Top Sellers sections are displayed ", priority = 17)
    public void verifyTopSellersSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellerHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTopSellerSections(), webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "3. Medium Severity"}, description = "HomePage- Make sure that all links appear correctly in the Top Sellers section ", priority = 18)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getAllLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportSupplementsLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHealthyFoodLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportswearAndAccessoriesLink(), webDriver);
    }

    @Test(groups = { "2. High Severity"}, description = "HomePage- Make sure clicking on the All tab from the Top Seller Section works correctly ", priority = 19)
    public void verifyAbilityToClickOnTheAllLinkInTopSellersSection() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnAllLinkInTopSellerSection();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getAllActiveLink(), webDriver);

    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure clicking on the Sport Supplements tab from the Top Seller Section works correctly", priority = 20)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInTopSellersSection() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnSportSupplementsLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(homePage.getSportSupplementsActiveLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportSupplementsActiveLink(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure clicking on the Healthy Food tab from the Top Seller Section works correctly ", priority = 21)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInTopSellersSection() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnHealthyFoodLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(homePage.getHealthyFoodActiveLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHealthyFoodActiveLink(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure clicking on the Vitamins And Health tab from the Top Seller Section works correctly ", priority = 22)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInTopSellersSection() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnVitaminsAndHealthLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(homePage.getVitaminsAndHealthActiveLinkInTopeSellersSection(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthActiveLinkInTopeSellersSection(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure clicking on the Sportswear And Accessories tab from the Top Seller Section works correctly ", priority = 23)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInTopSellersSection() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnSportswearAndAccessoriesLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(homePage.getSportswearAndAccessoriesActiveLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportswearAndAccessoriesActiveLink(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure that previous button in the Top Seller Section works correctly ", priority = 24)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnNextButtonInTopSellerSectionInTopSellerSection();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getPreviousButtonInTopSellerSection(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the next button appearing in the Top Seller section works Correctly ", priority = 25)
    public void verifyNextBtnInTopSellerSectionWorks() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnPreviousButtonInTopSellersSection();
        homePage.clickOnNextButtonInTopSellersSection();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getPreviousButtonInTopSellerSection(), webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure the Trending On Sporter sections are displayed ", priority = 26)
    public void verifyTrendingOnSporterSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTrendingOnSporterHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTrendingOnSporterSection(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the next button appearing in the Trending On Sporter section works Correctly ", priority = 27)
    public void verifyNextBtnInTrendingOnSporterSectionWorks() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnNextButtonInTrendingOnSporterSection();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getTrendingOnSporterSectionPositionAfterClickingOnNext(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the previous button appearing in the Trending On Sporter section works Correctly ", priority = 28)
    public void verifyPreviousBtnInTrendingOnSporterSectionWorks() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnNextButtonInTrendingOnSporterSection();
        homePage.clickOnPreviousButtonInTrendingOnSporterSection();
    }

    @Test(groups = { "2. High Severity"}, description = "HomePage- Make sure the New Arrivals sections are displayed ", priority = 29)
    public void verifyNewArrivalsSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsSection(), webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "3. Medium Severity"}, description = "HomePage- Make sure that all links appearing correctly in the New Arrivals section ", priority = 30)
    public void verifyAllLinksInNewArrivalsSectionAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsAllLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsSpportSupplementsLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsHealthyFoodLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsVitaminsAndHealthLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsSportWearAndAccessoriesLink(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure clicking on the all tab from the New Arrivals Section works correctly", priority = 31)
    public void verifyAbilityToClickOnTheAllLinkInNewArrivalsSection() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnAllLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(homePage.getNewArrivalsAllActiveLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsAllActiveLink(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure clicking on the Sport Supplements tab from the New Arrivals Section works correctly ", priority = 32)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInNewArrivalsSection() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnSportSupplementsLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(homePage.getNewArrivalsSportSupplementsActiveLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsSportSupplementsActiveLink(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure clicking on the Healthy Food tab that appear in the New Arrivals Section works correctly ", priority = 33)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInNewArrivalsSection() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnHealthyFoodLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(homePage.getNewArrivalsHealthyFoodActiveLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsHealthyFoodActiveLink(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure clicking on the Vitamins And Health tab from the New Arrivals Section works correctly", priority = 34)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInNewArrivalsSection() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnVitaminsAndHealthLinkInNewArrivalsSection();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthActiveLink(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure clicking on the Sportswear And Accessories tab from the New Arrivals Section works correctly ", priority = 35)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInNewArrivalsSection() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnSportswearAndAccessoriesLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(homePage.getNewArrivalsSportswearAndAccessoriesActiveLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNewArrivalsSportswearAndAccessoriesActiveLink(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure that previous and next button in the New Arrivals Section works correctly", priority = 36)
    public void verifyPreviousBtnWillAppearInNewArrivalsSectionOnceClickingOnNextBtn() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnNextButtonInNewArrivalSection();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getPreviousBtnInNewArrivalsSection(), webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "3. Medium Severity"}, description = "HomePage- Make sure the Got A Question section is displayed ", priority = 37)
    public void verifyGotQuestionSectionIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getGetQuestionBlock(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getPhoneBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getEmailBtn(), webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "1. Critical Severity"}, description = "HomePage- Make sure the clicking on email button from the Got A Question section works correctly ", priority = 38)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() {
        HomePage homePage = new HomePage(webDriver);
//        homePage.navigateToHomePage();
        homePage.clickOnEmailBtn();
        WebElementsAssertion.validateTheCurrentUrlContainsString("contacts-us", webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the Sports Supplements category from the HomePage works correctly ", priority = 39)
    public void verifyClickingOnSportsSupplementsCategoryRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnSportsSupplementsCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the Healthy Food category from the HomePage works correctly ", priority = 40)
    public void verifyClickingOnHealthyFoodCategoryDoeNotRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnHealthyFoodCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the Vitamins And Health category from the HomePage works correctly ", priority = 41)
    public void verifyClickingOnVitaminsAndHealthCategoryDoeNotRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnVitaminsAndHealthCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the Sportswear & Accessories category from the HomePage works correctly ", priority = 42)
    public void verifyClickingOnSportswearAndAccessoriesCategoryDoeNotRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnSportswearAndAccessoriesCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the products appearing in the Top Selling Stacks section works correctly", priority = 43)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        Assert.assertTrue(homePage.getProductsInTopSellingStacksSection().size()>0,"There's no any products in the list");
        for (int i = 0; i < homePage.getProductsInTopSellingStacksSection().size(); i++) {
            do {
                homePage.clickOnNextButtonInTopSellersSection();
            }
            while (!homePage.getProductsInTopSellingStacksSection().get(i).isDisplayed());
            String expectedUrl = homePage.getProductsInTopSellingStacksSection().get(i).getAttribute("href");
            DataHelperAndWait.clickOnElement(homePage.getProductsInTopSellingStacksSection().get(i), webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
            homePage.verifyTheDisplayedPageDoesNotHaveErrors();
            homePage.navigateToHomePage();
        }
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the products appearing in the Top Sellers section works correctly", priority = 44)
    public void verifyClickOnTheProductsAppearingInTheTopSellersSectionRedirectTheUserToCorrectUrl() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        Assert.assertTrue(homePage.getProductsInTopSellersSection().size()>0,"There's no any products in the list");
        for (int i = 0; i < homePage.getProductsInTopSellersSection().size(); i++) {
            do {
                homePage.clickOnNextButtonInTopSellersSection();
            }
            while (!homePage.getProductsInTopSellersSection().get(i).isDisplayed());
            String expectedUrl = homePage.getProductsInTopSellersSection().get(i).getAttribute("href");
            DataHelperAndWait.clickOnElement(homePage.getProductsInTopSellersSection().get(i), webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
            homePage.verifyTheDisplayedPageDoesNotHaveErrors();
            homePage.navigateToHomePage();
        }
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the products appearing in the New Arrivals section works correctly", priority = 45)
    public void verifyClickOnTheProductsAppearingInTheNewArrivalsSectionRedirectTheUserToCorrectUrl() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        Assert.assertTrue(homePage.getProductsInNewArrivalsSection().size()>0,"There's no any products in the list");
        for (int i = 0; i < homePage.getProductsInNewArrivalsSection().size(); i++) {
            do {
                homePage.clickOnNextButtonInNewArrivalSection();
            }
            while (!homePage.getProductsInNewArrivalsSection().get(i).isDisplayed());
            String expectedUrl = homePage.getProductsInNewArrivalsSection().get(i).getAttribute("href");
            DataHelperAndWait.clickOnElement(homePage.getProductsInNewArrivalsSection().get(i), webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
            homePage.verifyTheDisplayedPageDoesNotHaveErrors();
            homePage.navigateToHomePage();
        }
    }
    
    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure ability to access all pages inside the Top Selling Stacks category correctly ", priority = 46)
    public void verifyAbilityToAccessAllPagesInsideTheTopSellingStacksCategoryCorrectly() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        String expectedUrl = homePage.getViewAllBtnInTopSellingStacksSection().getAttribute("href");
        homePage.clickOnViewAllBtnInTopSellingStacksSection();
        DataHelperAndWait.waitForUrlContains("/sporter-stacks", webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString("/sporter-stacks", webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList = homePage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList, homePage.getNextPageBtn(), webDriver);
    }

    @Test(groups = { "2. High Severity"}, description = "HomePage- Make sure clicking on phone button from the Got A Question section works correctly ", priority = 47)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnPhoneBtn();
        // store window handles in Set
        String myWindowHandle = webDriver.getWindowHandle();
        webDriver.switchTo().window(myWindowHandle);
    }
}