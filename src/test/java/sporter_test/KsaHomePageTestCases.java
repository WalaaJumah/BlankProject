package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AeSportSupplementsCategoryPage;
import sporter_pages.AeVitaminsAndHealthCategoryPage;
import sporter_pages.KsaHomePage;
import sporter_pages.QatarHomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class KsaHomePageTestCases extends BaseTest {
    private KsaHomePage ksaHomePage;
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    String allProductsInTopSellingStacksSectionURL = "https://www.sporter.com/en-sa/";

    @Test(description = "Make sure the HomePage rotating slider section is displayed correctly in Home Page", priority = 2)
    public void verifyHomePageRotatingSliderIsDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSlider().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderList().get(i).isDisplayed());
        }
    }

    @Test(description = "Make sure the next arrow at the HomePage rotating slider section is displayed ", priority = 3)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
    }

    @Test(description = "Make sure the previous arrow at the HomePage rotating slider section is displayed ", priority = 4)
    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }

    @Test(description = "Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 5)
    public void verifyPaginationControlOnHomePageRotatingSliderIsDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingList().get(i).isDisplayed());
        }
    }
    @Test(description = "Make sure clicking on the banners inside the HomePage rotating slider section will redirect the user to correct page", priority = 3)
    public void verifyClickingOnTheBannersInsideTheHomePageRotatingSliderWillRedirectTheUserToCorrectPage(){
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            ksaHomePage.getHomePageRotatingSliderPagingList().get(i).click();
            ksaHomePage.getBannerInRotatingSliderSection().click();
            boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
            assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
            boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
            assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
            boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
            assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
            webDriver.navigate().to(siteURL);
        }
    }

    @Test(description = "Make sure the HomePage side Banner is displayed ", priority = 6)
    public void verifyHomePageSideBannerIsDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getHomePageSideBanner().isDisplayed());
    }

    @Test(description = "Make sure the HomePage Horizontal Banner is displayed ", priority = 7)
    public void verifyHomePageHorizontalBannerIsDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getHorizontalBanner().isDisplayed(), "The HomePage Horizontal Banner is missing");
    }
    @Test(description = "Make sure the clicking on the first side banner works correctly in KSA HomePage", priority = 11)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        String expectedUrl=ksaHomePage.getFirstSideBanner().getAttribute("href");
        ksaHomePage.getFirstSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
        @Test(description = "Make sure the clicking on the second side banner works correctly in KSA HomePage", priority = 11)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        String expectedUrl=ksaHomePage.getSecondSideBanner().getAttribute("href");
        ksaHomePage.getSecondSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the HomePage Horizontal Banner redirect the user to the correct URL ", priority = 8)
    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getHorizontalBanner().isDisplayed(), "The HomePage Horizontal Banner is missing");
        String expectedUrl=ksaHomePage.getHorizontalBanner().getAttribute("href");
        ksaHomePage.clickOnHomePageHorizontalBanner();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure the Shop By Category section is displayed ", priority = 9)
    public void verifyShopByCategoryIsDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getShopByCategorySections().isDisplayed());
    }

    @Test(description = "Make sure the main options in the Mega Menu are retrieved correctly", priority = 10)
    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertEquals(ksaHomePage.getShopByOption().getText(), "Shop By");
        Assert.assertEquals(ksaHomePage.getSportSupplementsOption().getText(), "Sport Supplements");
        Assert.assertEquals(ksaHomePage.getVitaminsAndHealthOption().getText(), "Vitamins & Health");
        Assert.assertEquals(ksaHomePage.getHealthyFoodOption().getText(), "Healthy Food");
        Assert.assertEquals(ksaHomePage.getSportsOption().getText(), "SPORTS");
        Assert.assertEquals(ksaHomePage.getWomenOnlyOption().getText(), "Women's Only");
    }

    @Test(description = "Make sure the HomePage under shop by category banners are displayed", priority = 11)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        for (int i = 0; i < ksaHomePage.getHomePageUnderShopByCategoryBanners().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageUnderShopByCategoryBanners().get(i).isDisplayed());
        }
    }

    @Test(description = "Make sure the Top Selling Stacks sections are displayed ", priority = 12)
    public void verifyTopSellingStacksSectionAreDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getTopSellingStacksHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getTopSellingStacksSections().isDisplayed());
    }

    @Test(description = "Make sure the view all button appearing in the Top Selling Stacks section works correctly ", priority = 13)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        String expectedUrl=ksaHomePage.getViewAllBtnInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnViewAllBtnInTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description = "Make sure ability to access all pages inside the Top Selling Stacks category correctly ")
    public void verifyAbilityToAccessAllPagesInsideTheTopSellingStacksCategoryCorrectly(){
        ksaHomePage = new KsaHomePage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyViewAllBtnInTopSellingStacksSectionWorking();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }

    @Test(description = "Make sure the Top Sellers sections are displayed ", priority = 14)
    public void verifyTopSellersSectionAreDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getTopSellerHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getTopSellerSections().isDisplayed());
    }

    @Test(description = "Make sure that all links appear correctly in the Top Sellers section ", priority = 15)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getAllLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getSportSupplementsLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getHealthyFoodLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getSportswearAndAccessoriesLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the all link that appear in the Top Seller Section ", priority = 16)
    public void verifyAbilityToClickOnTheAllLinkInTopSellersSection() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnAllLinkInTopSellerSection();
        Assert.assertTrue(ksaHomePage.getAllLActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the Top Seller Section ", priority = 17)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInTopSellersSection() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnSportSupplementsLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getSportSupplementsActiveLink(), 10);
        Assert.assertTrue(ksaHomePage.getSportSupplementsActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Healthy Food link that appear in the Top Seller Section ", priority = 18)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInTopSellersSection() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnHealthyFoodLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getHealthyFoodActiveLink(), 10);
        Assert.assertTrue(ksaHomePage.getHealthyFoodActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the Top Seller Section ", priority = 19)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInTopSellersSection() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnVitaminsAndHealthLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getVitaminsAndHealthActiveLinkInTopSellersSection(), 10);
        Assert.assertTrue(ksaHomePage.getVitaminsAndHealthActiveLinkInTopSellersSection().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the Top Seller Section ", priority = 20)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInTopSellersSection() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnSportswearAndAccessoriesLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getSportswearAndAccessoriesActiveLink(), 3);
        Assert.assertTrue(ksaHomePage.getSportswearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(description = "Make sure that previous button will Appears in the Top Seller Section when clicking on the next button ", priority = 21)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnNextButtonInTopSellerSectionInTopSellerSection();
        Assert.assertTrue(ksaHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
    }

    @Test(description = "Make sure the next button appearing in the Top Seller section works Correctly ", priority = 22)
    public void verifyNextBtnInTopSellerSectionWorks() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnNextButtonInTopSellersSection();
        Assert.assertTrue(ksaHomePage.getTopSellerSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(description = "Make sure the previous button appearing in the Top Seller section works Correctly ", priority = 23)
    public void verifyPreviousBtnInTopSellerSectionWorks() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnNextButtonInTopSellersSection();
        ksaHomePage.clickOnPreviousButtonInTopSellersSection();
        Assert.assertTrue(ksaHomePage.getTopSellerSectionPositionAfterClickingOnPrevious().isDisplayed());
    }

    @Test(description = "Make sure the Trending On Sporter sections are displayed ", priority = 24)
    public void verifyTrendingOnSporterSectionAreDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getTrendingOnSporterHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getTrendingOnSporterSection().isDisplayed());
    }

    @Test(description = "Make sure the next button appearing in the Trending On Sporter section works Correctly ", priority = 25)
    public void verifyNextBtnInTrendingOnSporterSectionWorks() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnNextButtonInTrendingOnSporterSection();
        Assert.assertTrue(ksaHomePage.getTrendingOnSporterSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(description = "Make sure the previous button appearing in the Trending On Sporter section works Correctly ", priority = 26)
    public void verifyPreviousBtnInTrendingOnSporterSectionWorks() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnNextButtonInTrendingOnSporterSection();
        ksaHomePage.clickOnPreviousButtonInTrendingOnSporterSection();
        Assert.assertTrue(ksaHomePage.getTrendingOnSporterSectionPositionAfterClickingOnPrevious().isDisplayed());
    }

    @Test(description = "Make sure the New Arrivals sections are displayed ", priority = 27)
    public void verifyNewArrivalsSectionAreDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getNewArrivalsHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsSection().isDisplayed());
    }

    @Test(description = "Make sure that all links appear correctly in the New Arrivals section ", priority = 28)
    public void verifyAllLinksInNewArrivalsSectionAreDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getNewArrivalsAllLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportSupplementsLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsHealthyFoodLinkLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportWearAndAccessoriesLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the all link that appear in the New Arrivals Section ", priority = 29)
    public void verifyAbilityToClickOnTheAllLinkInNewArrivalsSection() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnAllLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsAllActiveLink(), 10);
        Assert.assertTrue(ksaHomePage.getNewArrivalsAllActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the New Arrivals Section ", priority = 30)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInNewArrivalsSection() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnSportSupplementsLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsSportSupplementsActiveLink(), 10);
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportSupplementsActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Healthy Food link that appear in the New Arrivals Section ", priority = 31)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInNewArrivalsSection() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnHealthyFoodLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsHealthyFoodActiveLink(), 10);
        Assert.assertTrue(ksaHomePage.getNewArrivalsHealthyFoodActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the New Arrivals Section ", priority = 32)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInNewArrivalsSection() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnVitaminsAndHealthLinkInNewArrivalsSection();
        Assert.assertTrue(ksaHomePage.getVitaminsAndHealthActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the New Arrivals Section ", priority = 33)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInNewArrivalsSection() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnSportswearAndAccessoriesLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(ksaHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink(), 10);
        Assert.assertTrue(ksaHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(description = "Make sure that previous button will appear in the New Arrivals Section when clicking on the next button ", priority = 34)
    public void verifyPreviousBtnWillAppearInNewArrivalsSectionOnceClickingOnNextBtn() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(ksaHomePage.getPreviousBtnInNewArrivalsSection().isDisplayed());
    }

    @Test(description = "Make sure the next button appearing in the New Arrivals section works Correctly ", priority = 35)
    public void verifyNextBtnInNewArrivalsSectionWorks() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(ksaHomePage.getNewArrivalsSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(description = "Make sure the previous button appearing in the New Arrivals section works Correctly ", priority = 36)
    public void verifyPreviousBtnInNewArrivalsSectionWorks() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnNextButtonInNewArrivalSection();
        ksaHomePage.clickOnPreviousButtonInNewArrivalSection();
        Assert.assertTrue(ksaHomePage.getNewArrivalsSectionPositionAfterClickingOnPrevious().isDisplayed());
    }

    @Test(description = "Make sure the Got A Question section is displayed ", priority = 37)
    public void verifyGotQuestionSectionIsDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getQuestionBlock().isDisplayed());
        Assert.assertTrue(ksaHomePage.getPhoneBtn().isDisplayed());
        Assert.assertTrue(ksaHomePage.getEmailBtn().isDisplayed());
    }

    @Test(description = "Make sure the Ability to click on email button that appears in the Got A Question section correctly ", priority = 38)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnEmailBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("contacts-us"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure the Ability to click on phone button that appears in the Got A Question section correctly ", priority = 39)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnPhoneBtn();
        // store window handles in Set
        String myWindowHandle = webDriver.getWindowHandle();
        webDriver.switchTo().window(myWindowHandle);
    }

    @Test(description = "Make sure clicking on the Sports Supplements category redirect the user to correct URL ", priority = 40)
    public void verifyClickingOnSportsSupplementsCategoryDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnSportsSupplementsCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Food category redirect the user to correct URLL ", priority = 41)
    public void verifyClickingOnHealthyFoodCategoryDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnHealthyFoodCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamins And Health category  redirect the user to correct URL ", priority = 42)
    public void verifyClickingOnVitaminsAndHealthCategoryDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnVitaminsAndHealthCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sportswear & Accessories category redirect the user to correct URL ", priority = 43)
    public void verifyClickingOnSportswearAndAccessoriesCategoryDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        ksaHomePage.clickOnSportswearAndAccessoriesCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure clicking on the products appearing in the Top Selling Stacks section redirect the user to the correct URL", priority = 39)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        String expectedUrl=ksaHomePage.getFirstProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnFirstProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getSecondProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnSecondProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getThirdProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnThirdProductInTheTopSellingStacksSection();
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getFourthProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnFourthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getFiveProductInTopSellingStacksSection().getAttribute("href");
        ksaHomePage.clickOnFifthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure clicking on the products appearing in the Top Sellers section redirect the user to the correct URL", priority = 40)
    public void verifyClickOnTheProductsAppearingInTheTopSellersSectionRedirectTheUserToCorrectUrl() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        String expectedUrl=ksaHomePage.getFirstProductInTopSellersSection().getAttribute("href");
        ksaHomePage.clickOnFirstProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getSecondProductInTopSellersSection().getAttribute("href");
        ksaHomePage.clickOnSecondProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getThirdProductInTopSellersSection().getAttribute("href");
        ksaHomePage.clickOnThirdProductInTheTopSellersSection();
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getFourthProductInTopSellersSection().getAttribute("href");
        ksaHomePage.clickOnFourthProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getFiveProductInTopSellersSection().getAttribute("href");
        ksaHomePage.clickOnFifthProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure clicking on the products appearing in the New Arrivals section redirect the user to the correct URL", priority = 41)
    public void verifyClickOnTheProductsAppearingInTheNewArrivalsSectionRedirectTheUserToCorrectUrl() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        String expectedUrl=ksaHomePage.getFirstProductInNewArrivalsSection().getAttribute("href");
        ksaHomePage.clickOnFirstProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getSecondProductInNewArrivalsSection().getAttribute("href");
        ksaHomePage.clickOnSecondProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getThirdProductInNewArrivalsSection().getAttribute("href");
        ksaHomePage.clickOnThirdProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getFourthProductInNewArrivalsSection().getAttribute("href");
        ksaHomePage.clickOnFourthProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=ksaHomePage.getFiveProductInNewArrivalsSection().getAttribute("href");
        ksaHomePage.clickOnFifthProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }






}