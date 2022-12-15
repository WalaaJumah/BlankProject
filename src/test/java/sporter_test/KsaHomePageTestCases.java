package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import error_helper.SporterErrorPage;
import org.testng.Assert;
import org.testng.annotations.Test;
//import sporter_pages.AeSportSupplementsCategoryPage;
//import sporter_pages.AeVitaminsAndHealthCategoryPage;
import sporter_pages.KsaHomePage;
//import sporter_pages.QatarHomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class KsaHomePageTestCases extends BaseTest {
//    private KsaHomePage ksaHomePage;
//    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
private void verifyTheDisplayedPageDoesNotHaveErrors(){
    KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
    Assert.assertFalse(ksaHomePage.getTitle().equalsIgnoreCase(SporterErrorPage.pageNotFoundTitle),"Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
    Assert.assertFalse(ksaHomePage.getSourcePage().contains(SporterErrorPage.productsCannotFindMsg),"The page is empty and the URL is "+webDriver.getCurrentUrl());
    Assert.assertFalse(ksaHomePage.getSourcePage().contains(SporterErrorPage.exceptionPageMsg),"An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
}

    @Test(description = "Switching to the KSA Store", priority = 1)
    public void switchToKsaStore(){
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
    }
    @Test(description = "Make sure the HomePage rotating slider section is displayed correctly in Home Page", priority = 2)
    public void verifyHomePageRotatingSliderIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSlider().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderList().get(i).isDisplayed());
        }
    }

    @Test(description = "Make sure the next arrow at the HomePage rotating slider section is displayed ", priority = 3)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
    }

    @Test(description = "Make sure the previous arrow at the HomePage rotating slider section is displayed ", priority = 4)
    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }

    @Test(description = "Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 5)
    public void verifyPaginationControlOnHomePageRotatingSliderIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingList().get(i).isDisplayed());
        }
    }
    @Test(description = "Make sure clicking on the banners inside the HomePage rotating slider section will redirect the user to correct page", priority = 6)
    public void verifyClickingOnTheBannersInsideTheHomePageRotatingSliderWillRedirectTheUserToCorrectPage(){
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            ksaHomePage.getHomePageRotatingSliderPagingList().get(i).click();
            ksaHomePage.getBannerInRotatingSliderSection().click();
//            Assert.assertFalse(ksaHomePage.getTitle().equalsIgnoreCase(SporterErrorPage.pageNotFoundTitle),"Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//            Assert.assertFalse(ksaHomePage.getSourcePage().contains(SporterErrorPage.productsCannotFindMsg),"The page is empty and the URL is "+webDriver.getCurrentUrl());
//            Assert.assertFalse(ksaHomePage.getSourcePage().contains(SporterErrorPage.exceptionPageMsg),"An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
            this.verifyTheDisplayedPageDoesNotHaveErrors();
            ksaHomePage.navigate();
        }
    }

    @Test(description = "Make sure the HomePage side Banner is displayed ", priority = 7)
    public void verifyHomePageSideBannerIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getHomePageSideBanner().isDisplayed());
    }

    @Test(description = "Make sure the HomePage Horizontal Banner is displayed ", priority = 8)
    public void verifyHomePageHorizontalBannerIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getHorizontalBanner().isDisplayed(), "The HomePage Horizontal Banner is missing");
    }
    @Test(description = "Make sure the clicking on the first side banner works correctly in KSA HomePage", priority = 9)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        String expectedUrl=ksaHomePage.getFirstSideBanner().getAttribute("href");
        ksaHomePage.getFirstSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();

    }
        @Test(description = "Make sure the clicking on the second side banner works correctly in KSA HomePage", priority = 10)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        String expectedUrl=ksaHomePage.getSecondSideBanner().getAttribute("href");
        ksaHomePage.getSecondSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
            this.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(description = "Make sure clicking on the HomePage Horizontal Banner redirect the user to the correct URL ", priority = 11)
    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getHorizontalBanner().isDisplayed(), "The HomePage Horizontal Banner is missing");
        String expectedUrl=ksaHomePage.getHorizontalBanner().getAttribute("href");
        ksaHomePage.clickOnHomePageHorizontalBanner();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(description = "Make sure the Shop By Category section is displayed ", priority = 12)
    public void verifyShopByCategoryIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getShopByCategorySections().isDisplayed());
    }

    @Test(description = "Make sure the main options in the Mega Menu are retrieved correctly", priority = 13)
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

    @Test(description = "Make sure the HomePage under shop by category banners are displayed", priority = 14)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        for (int i = 0; i < ksaHomePage.getHomePageUnderShopByCategoryBanners().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageUnderShopByCategoryBanners().get(i).isDisplayed());
        }
    }

    @Test(description = "Make sure the Top Selling Stacks sections are displayed ", priority = 15)
    public void verifyTopSellingStacksSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getTopSellingStacksHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getTopSellingStacksSections().isDisplayed());
    }

    @Test(description = "Make sure the view all button appearing in the Top Selling Stacks section works correctly ", priority = 16)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        String expectedUrl=ksaHomePage.getViewAllBtnInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnViewAllBtnInTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();

    }
    @Test(description = "Make sure the Top Sellers sections are displayed ", priority = 17)
    public void verifyTopSellersSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getTopSellerHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getTopSellerSections().isDisplayed());
    }

    @Test(description = "Make sure that all links appear correctly in the Top Sellers section ", priority = 18)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getAllLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getSportSupplementsLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getHealthyFoodLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getSportswearAndAccessoriesLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the all link that appear in the Top Seller Section ", priority = 19)
    public void verifyAbilityToClickOnTheAllLinkInTopSellersSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnAllLinkInTopSellerSection();
        Assert.assertTrue(ksaHomePage.getAllLActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the Top Seller Section ", priority = 20)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInTopSellersSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnSportSupplementsLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getSportSupplementsActiveLink(), 3,webDriver);
        Assert.assertTrue(ksaHomePage.getSportSupplementsActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Healthy Food link that appear in the Top Seller Section ", priority = 21)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInTopSellersSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnHealthyFoodLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getHealthyFoodActiveLink(), 3,webDriver);
        Assert.assertTrue(ksaHomePage.getHealthyFoodActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the Top Seller Section ", priority = 22)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInTopSellersSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnVitaminsAndHealthLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getVitaminsAndHealthActiveLinkInTopSellersSection(), 3,webDriver);
        Assert.assertTrue(ksaHomePage.getVitaminsAndHealthActiveLinkInTopSellersSection().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the Top Seller Section ", priority = 23)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInTopSellersSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnSportswearAndAccessoriesLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getSportswearAndAccessoriesActiveLink(), 3,webDriver);
        Assert.assertTrue(ksaHomePage.getSportswearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(description = "Make sure that previous button in the Top Seller Section works correctly ", priority = 24)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnNextButtonInTopSellerSectionInTopSellerSection();
        Assert.assertTrue(ksaHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
    }

    @Test(description = "Make sure the next button appearing in the Top Seller section works Correctly ", priority = 25)
    public void verifyNextBtnInTopSellerSectionWorks() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnPreviousButtonInTopSellersSection();
        ksaHomePage.clickOnNextButtonInTopSellersSection();
        Assert.assertTrue(ksaHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
    }


    @Test(description = "Make sure the Trending On Sporter sections are displayed ", priority = 26)
    public void verifyTrendingOnSporterSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getTrendingOnSporterHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getTrendingOnSporterSection().isDisplayed());
    }

    @Test(description = "Make sure the next button appearing in the Trending On Sporter section works Correctly ", priority = 27)
    public void verifyNextBtnInTrendingOnSporterSectionWorks() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnNextButtonInTrendingOnSporterSection();
        Assert.assertTrue(ksaHomePage.getTrendingOnSporterSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(description = "Make sure the previous button appearing in the Trending On Sporter section works Correctly ", priority =28)
    public void verifyPreviousBtnInTrendingOnSporterSectionWorks() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnNextButtonInTrendingOnSporterSection();
        ksaHomePage.clickOnPreviousButtonInTrendingOnSporterSection();
    }

    @Test(description = "Make sure the New Arrivals sections are displayed ", priority = 29)
    public void verifyNewArrivalsSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getNewArrivalsHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsSection().isDisplayed());
    }

    @Test(description = "Make sure that all links appear correctly in the New Arrivals section ", priority = 30)
    public void verifyAllLinksInNewArrivalsSectionAreDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getNewArrivalsAllLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportSupplementsLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsHealthyFoodLinkLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportWearAndAccessoriesLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the all link that appear in the New Arrivals Section ", priority = 31)
    public void verifyAbilityToClickOnTheAllLinkInNewArrivalsSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnAllLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsAllActiveLink(), 3,webDriver);
        Assert.assertTrue(ksaHomePage.getNewArrivalsAllActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the New Arrivals Section ", priority = 32)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInNewArrivalsSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnSportSupplementsLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsSportSupplementsActiveLink(), 3,webDriver);
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportSupplementsActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Healthy Food link that appear in the New Arrivals Section ", priority = 33)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInNewArrivalsSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnHealthyFoodLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsHealthyFoodActiveLink(), 3,webDriver);
        Assert.assertTrue(ksaHomePage.getNewArrivalsHealthyFoodActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the New Arrivals Section ", priority = 34)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInNewArrivalsSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnVitaminsAndHealthLinkInNewArrivalsSection();
        Assert.assertTrue(ksaHomePage.getVitaminsAndHealthActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the New Arrivals Section ", priority = 35)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInNewArrivalsSection() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnSportswearAndAccessoriesLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink(), 3,webDriver);
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(description = "Make sure that previous and next button  in the New Arrivals Section works correctly", priority = 36)
    public void verifyPreviousBtnWillAppearInNewArrivalsSectionOnceClickingOnNextBtn() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(ksaHomePage.getPreviousBtnInNewArrivalsSection().isDisplayed());
    }


    @Test(description = "Make sure the Got A Question section is displayed ", priority = 37)
    public void verifyGotQuestionSectionIsDisplayed() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        Assert.assertTrue(ksaHomePage.getQuestionBlock().isDisplayed());
        Assert.assertTrue(ksaHomePage.getPhoneBtn().isDisplayed());
        Assert.assertTrue(ksaHomePage.getEmailBtn().isDisplayed());
    }

    @Test(description = "Make sure the Ability to click on email button that appears in the Got A Question section correctly ", priority = 38)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        ksaHomePage.navigate();
        ksaHomePage.clickOnEmailBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("contacts-us"));
        this.verifyTheDisplayedPageDoesNotHaveErrors();

    }
    @Test(description = "Make sure clicking on the Sports Supplements category redirect the user to correct URL ", priority = 39)
    public void verifyClickingOnSportsSupplementsCategoryRedirectTheUserToCorrectPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnSportsSupplementsCategory();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Make sure clicking on the Healthy Food category redirect the user to correct URL ", priority = 40)
    public void verifyClickingOnHealthyFoodCategoryDoeNotRedirectTheUserToCorrectPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnHealthyFoodCategory();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Make sure clicking on the Vitamins And Health category  redirect the user to correct URL ", priority = 41)
    public void verifyClickingOnVitaminsAndHealthCategoryDoeNotRedirectTheUserToCorrectPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnVitaminsAndHealthCategory();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Make sure clicking on the Sportswear & Accessories category redirect the user to correct URL ", priority = 42)
    public void verifyClickingOnSportswearAndAccessoriesCategoryDoeNotRedirectTheUserToCorrectPage() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnSportswearAndAccessoriesCategory();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description ="Make sure clicking on the products appearing in the Top Selling Stacks section redirect the user to the correct URL", priority = 43)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        String expectedUrl=ksaHomePage.getFirstProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnFirstProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        expectedUrl=ksaHomePage.getSecondProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnSecondProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        expectedUrl=ksaHomePage.getThirdProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnThirdProductInTheTopSellingStacksSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        expectedUrl=ksaHomePage.getFourthProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnFourthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        expectedUrl=ksaHomePage.getFiveProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnFifthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description ="Make sure clicking on the products appearing in the Top Sellers section redirect the user to the correct URL", priority = 44)
    public void verifyClickOnTheProductsAppearingInTheTopSellersSectionRedirectTheUserToCorrectUrl() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnFirstProductInTheTopSellersSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnSecondProductInTheTopSellersSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnThirdProductInTheTopSellersSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnFourthProductInTheTopSellersSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnFifthProductInTheTopSellersSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description ="Make sure clicking on the products appearing in the New Arrivals section redirect the user to the correct URL", priority = 45)
    public void verifyClickOnTheProductsAppearingInTheNewArrivalsSectionRedirectTheUserToCorrectUrl() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnFirstProductInTheNewArrivalsSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnSecondProductInTheNewArrivalsSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnThirdProductInTheNewArrivalsSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnFourthProductInTheNewArrivalsSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        ksaHomePage.navigate();
        ksaHomePage.clickOnFifthProductInTheNewArrivalsSection();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description = "Make sure the Ability to click on phone button that appears in the Got A Question section correctly ", priority = 46)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.navigate();
        ksaHomePage.clickOnPhoneBtn();
        // store window handles in Set
        String myWindowHandle = webDriver.getWindowHandle();
        webDriver.switchTo().window(myWindowHandle);
    }
//    @Test(description = "Make sure ability to access all pages inside the Top Selling Stacks category correctly ", priority = 17)
//    public void verifyAbilityToAccessAllPagesInsideTheTopSellingStacksCategoryCorrectly(){
//        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage();
//        this.verifyViewAllBtnInTopSellingStacksSectionWorking();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }

}