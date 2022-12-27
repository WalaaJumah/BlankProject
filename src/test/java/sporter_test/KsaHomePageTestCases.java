package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.KsaHomePage;

public class KsaHomePageTestCases extends BaseTest {
    //    private KsaHomePage ksaHomePage;

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Switching to the KSA Store", priority = 1)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
    }

    @Test(description = "KSA HomePage- Make sure the Banners appear correctly in the HomePage rotating slider section ", priority = 2)
    public void verifyHomePageRotatingSliderIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        Assert.assertTrue(ksaHomePage.getHomePageRotatingSlider().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderList().get(i).isDisplayed());
        }
    }

    @Test(description = "KSA HomePage- Make sure the next button at the HomePage rotating slider section is displayed ", priority = 3)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure the previous button at the HomePage rotating slider section is displayed ", priority = 4)
    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 5)
    public void verifyPaginationControlOnHomePageRotatingSliderIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingList().get(i).isDisplayed());
        }
    }

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure clicking on the banners inside the rotating slider section works correctly", priority = 6)
    public void verifyClickingOnTheBannersInsideTheHomePageRotatingSliderWillRedirectTheUserToCorrectPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            ksaHomePage.getHomePageRotatingSliderPagingList().get(i).click();
            ksaHomePage.getBannerInRotatingSliderSection().click();
            ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
            ksaHomePage.navigate();
        }
    }

    @Test(description = "KSA HomePage- Make sure the HomePage side Banner is displayed ", priority = 7)
    public void verifyHomePageSideBannerIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getHomePageSideBanner().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure the HomePage Horizontal Banner is displayed ", priority = 8)
    public void verifyHomePageHorizontalBannerIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getHorizontalBanner().isDisplayed(), "The HomePage Horizontal Banner is missing");
    }

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure clicking on the first side banner works correctly", priority = 9)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        String expectedUrl = ksaHomePage.getFirstSideBanner().getAttribute("href");
        ksaHomePage.getFirstSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure clicking on the second side banner works correctly", priority = 10)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        String expectedUrl = ksaHomePage.getSecondSideBanner().getAttribute("href");
        ksaHomePage.getSecondSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure clicking on the HomePage Horizontal Banner works correctly", priority = 11)
    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getHorizontalBanner().isDisplayed(), "The HomePage Horizontal Banner is missing");
        String expectedUrl = ksaHomePage.getHorizontalBanner().getAttribute("href");
        ksaHomePage.clickOnHomePageHorizontalBanner();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure the Shop By Category section is displayed ", priority = 12)
    public void verifyShopByCategoryIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getShopByCategorySections().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure the main options in the Mega Menu are retrieved correctly", priority = 13)
    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertEquals(ksaHomePage.getShopByOption().getText(), "Shop By");
        Assert.assertEquals(ksaHomePage.getSportSupplementsOption().getText(), "Sport Supplements");
        Assert.assertEquals(ksaHomePage.getVitaminsAndHealthOption().getText(), "Vitamins & Health");
        Assert.assertEquals(ksaHomePage.getHealthyFoodOption().getText(), "Healthy Food");
        Assert.assertEquals(ksaHomePage.getSportsOption().getText(), "SPORTS");
        Assert.assertEquals(ksaHomePage.getWomenOnlyOption().getText(), "Women's Only");
    }

    @Test(description = "KSA HomePage- Make sure the Banners appearing under shop by category are displayed", priority = 14)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        for (int i = 0; i < ksaHomePage.getHomePageUnderShopByCategoryBanners().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageUnderShopByCategoryBanners().get(i).isDisplayed());
        }
    }

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure the Top Selling Stacks section is displayed ", priority = 15)
    public void verifyTopSellingStacksSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getTopSellingStacksHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getTopSellingStacksSections().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the view all button from the Top Selling Stacks section works correctly ", priority = 16)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        String expectedUrl = ksaHomePage.getViewAllBtnInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnViewAllBtnInTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure the Top Sellers sections are displayed ", priority = 17)
    public void verifyTopSellersSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getTopSellerHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getTopSellerSections().isDisplayed());
    }

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure that all links appear correctly in the Top Sellers section ", priority = 18)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getAllLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getSportSupplementsLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getHealthyFoodLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getSportswearAndAccessoriesLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the All tab from the Top Seller Section works correctly ", priority = 19)
    public void verifyAbilityToClickOnTheAllLinkInTopSellersSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnAllLinkInTopSellerSection();
        Assert.assertTrue(ksaHomePage.getAllLActiveLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Sport Supplements tab from the Top Seller Section works correctly", priority = 20)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInTopSellersSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnSportSupplementsLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getSportSupplementsActiveLink(), 3, webDriver);
        Assert.assertTrue(ksaHomePage.getSportSupplementsActiveLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Healthy Food tab from the Top Seller Section works correctly ", priority = 21)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInTopSellersSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnHealthyFoodLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getHealthyFoodActiveLink(), 3, webDriver);
        Assert.assertTrue(ksaHomePage.getHealthyFoodActiveLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Vitamins And Health tab from the Top Seller Section works correctly ", priority = 22)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInTopSellersSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnVitaminsAndHealthLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getVitaminsAndHealthActiveLinkInTopSellersSection(), 3, webDriver);
        Assert.assertTrue(ksaHomePage.getVitaminsAndHealthActiveLinkInTopSellersSection().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Sportswear And Accessories tab from the Top Seller Section works correctly ", priority = 23)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInTopSellersSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnSportswearAndAccessoriesLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getSportswearAndAccessoriesActiveLink(), 3, webDriver);
        Assert.assertTrue(ksaHomePage.getSportswearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure that previous button in the Top Seller Section works correctly ", priority = 24)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnNextButtonInTopSellerSectionInTopSellerSection();
        Assert.assertTrue(ksaHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure the next button appearing in the Top Seller section works Correctly ", priority = 25)
    public void verifyNextBtnInTopSellerSectionWorks() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnPreviousButtonInTopSellersSection();
        ksaHomePage.clickOnNextButtonInTopSellersSection();
        Assert.assertTrue(ksaHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
    }


    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure the Trending On Sporter sections are displayed ", priority = 26)
    public void verifyTrendingOnSporterSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getTrendingOnSporterHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getTrendingOnSporterSection().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure the next button appearing in the Trending On Sporter section works Correctly ", priority = 27)
    public void verifyNextBtnInTrendingOnSporterSectionWorks() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnNextButtonInTrendingOnSporterSection();
        Assert.assertTrue(ksaHomePage.getTrendingOnSporterSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure the previous button appearing in the Trending On Sporter section works Correctly ", priority = 28)
    public void verifyPreviousBtnInTrendingOnSporterSectionWorks() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnNextButtonInTrendingOnSporterSection();
        ksaHomePage.clickOnPreviousButtonInTrendingOnSporterSection();
    }

    @Test(description = "KSA HomePage- Make sure the New Arrivals sections are displayed ", priority = 29)
    public void verifyNewArrivalsSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getNewArrivalsHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsSection().isDisplayed());
    }

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure that all links appearing correctly in the New Arrivals section ", priority = 30)
    public void verifyAllLinksInNewArrivalsSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getNewArrivalsAllLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportSupplementsLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsHealthyFoodLinkLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportWearAndAccessoriesLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the all tab from the New Arrivals Section works correctly", priority = 31)
    public void verifyAbilityToClickOnTheAllLinkInNewArrivalsSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnAllLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsAllActiveLink(), 3, webDriver);
        Assert.assertTrue(ksaHomePage.getNewArrivalsAllActiveLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Sport Supplements tab from the New Arrivals Section works correctly ", priority = 32)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInNewArrivalsSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnSportSupplementsLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsSportSupplementsActiveLink(), 3, webDriver);
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportSupplementsActiveLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Healthy Food tab that appear in the New Arrivals Section works correctly ", priority = 33)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInNewArrivalsSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnHealthyFoodLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsHealthyFoodActiveLink(), 3, webDriver);
        Assert.assertTrue(ksaHomePage.getNewArrivalsHealthyFoodActiveLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Vitamins And Health tab from the New Arrivals Section works correctly", priority = 34)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInNewArrivalsSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnVitaminsAndHealthLinkInNewArrivalsSection();
        Assert.assertTrue(ksaHomePage.getVitaminsAndHealthActiveLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Sportswear And Accessories tab from the New Arrivals Section works correctly ", priority = 35)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInNewArrivalsSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnSportswearAndAccessoriesLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink(), 3, webDriver);
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(description = "KSA HomePage- Make sure that previous and next button in the New Arrivals Section works correctly", priority = 36)
    public void verifyPreviousBtnWillAppearInNewArrivalsSectionOnceClickingOnNextBtn() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(ksaHomePage.getPreviousBtnInNewArrivalsSection().isDisplayed());
    }


    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure the Got A Question section is displayed ", priority = 37)
    public void verifyGotQuestionSectionIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getQuestionBlock().isDisplayed());
        Assert.assertTrue(ksaHomePage.getPhoneBtn().isDisplayed());
        Assert.assertTrue(ksaHomePage.getEmailBtn().isDisplayed());
    }

    @Test(groups = "Smoke Testing Report",description = "KSA HomePage- Make sure the clicking on email button from the Got A Question section works correctly ", priority = 38)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnEmailBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("contacts-us"));
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(description = "KSA HomePage- Make sure clicking on the Sports Supplements category from the HomePage works correctly ", priority = 39)
    public void verifyClickingOnSportsSupplementsCategoryRedirectTheUserToCorrectPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnSportsSupplementsCategory();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Healthy Food category from the HomePage works correctly ", priority = 40)
    public void verifyClickingOnHealthyFoodCategoryDoeNotRedirectTheUserToCorrectPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnHealthyFoodCategory();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Vitamins And Health category from the HomePage works correctly ", priority = 41)
    public void verifyClickingOnVitaminsAndHealthCategoryDoeNotRedirectTheUserToCorrectPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnVitaminsAndHealthCategory();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "KSA HomePage- Make sure clicking on the Sportswear & Accessories category from the HomePage works correctly ", priority = 42)
    public void verifyClickingOnSportswearAndAccessoriesCategoryDoeNotRedirectTheUserToCorrectPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnSportswearAndAccessoriesCategory();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "KSA HomePage- Make sure clicking on the products appearing in the Top Selling Stacks section works correctly", priority = 43)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        String expectedUrl = ksaHomePage.getFirstProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnFirstProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        expectedUrl = ksaHomePage.getSecondProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnSecondProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnThirdProductInTheTopSellingStacksSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        expectedUrl = ksaHomePage.getFourthProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnFourthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        expectedUrl = ksaHomePage.getFiveProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnFifthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "KSA HomePage- Make sure clicking on the products appearing in the Top Sellers section works correctly", priority = 44)
    public void verifyClickOnTheProductsAppearingInTheTopSellersSectionRedirectTheUserToCorrectUrl() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnFirstProductInTheTopSellersSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnSecondProductInTheTopSellersSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnThirdProductInTheTopSellersSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnFourthProductInTheTopSellersSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnFifthProductInTheTopSellersSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "KSA HomePage- Make sure clicking on the products appearing in the New Arrivals section works correctly", priority = 45)
    public void verifyClickOnTheProductsAppearingInTheNewArrivalsSectionRedirectTheUserToCorrectUrl() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnFirstProductInTheNewArrivalsSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnSecondProductInTheNewArrivalsSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnThirdProductInTheNewArrivalsSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnFourthProductInTheNewArrivalsSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnFifthProductInTheNewArrivalsSection();
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "KSA HomePage- Make sure clicking on phone button from the Got A Question section works correctly ", priority = 46)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnPhoneBtn();
        // store window handles in Set
        String myWindowHandle = webDriver.getWindowHandle();
        webDriver.switchTo().window(myWindowHandle);
    }
    @Test(description = "KSA HomePage- Make sure ability to access all pages inside the Top Selling Stacks category correctly ", priority = 47)
    public void verifyAbilityToAccessAllPagesInsideTheTopSellingStacksCategoryCorrectly(){
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        String expectedUrl = ksaHomePage.getViewAllBtnInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnViewAllBtnInTopSellingStacksSection();
        DataHelperAndWait.waitForUrlContains("/sporter-stacks",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("/sporter-stacks"), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=ksaHomePage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,ksaHomePage.getNextPageBtn(),webDriver);
    }
}