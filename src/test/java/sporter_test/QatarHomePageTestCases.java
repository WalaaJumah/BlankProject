package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AeSportSupplementsCategoryPage;
import sporter_pages.KsaHomePage;
import sporter_pages.QatarHomePage;
import static org.testng.Assert.assertFalse;

public class QatarHomePageTestCases extends BaseTest {
    private QatarHomePage qatarHomePage;
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    String allProductsInTopSellingStacksSectionURL = "https://www.sporter.com/en-qa/";
    String contactUsUrl = "https://www.sporter.com/en-qa/contacts-us/#contact-form";


    @Test(description = "Make sure the HomePage rotating slider section is displayed in Home Page", priority = 2)
    public void verifyHomePageRotatingSliderIsDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getHomePageRotatingSlider().isDisplayed());
        for (int i = 0; i < qatarHomePage.getHomePageRotatingSliderList().size(); i++) {
            Assert.assertTrue(qatarHomePage.getHomePageRotatingSliderList().get(i).isDisplayed());
        }
    }

    @Test(description = "Make sure the next arrow at the HomePage rotating slider section is displayed ", priority = 3)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
    }

    @Test(description = "Make sure the previous arrow at the HomePage rotating slider section is displayed ", priority = 4)
    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }

    @Test(description = "Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 5)
    public void verifyPaginationControlOnHomePageRotatingSliderIsDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
        for (int i = 0; i < qatarHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            Assert.assertTrue(qatarHomePage.getHomePageRotatingSliderPagingList().get(i).isDisplayed());
        }
    }
    @Test(description = "Make sure clicking on the banners inside the HomePage rotating slider section will redirect the user to correct page", priority = 3)
    public void verifyClickingOnTheBannersInsideTheHomePageRotatingSliderWillRedirectTheUserToCorrectPage(){
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        for (int i = 0; i < qatarHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            qatarHomePage.getHomePageRotatingSliderPagingList().get(i).click();
            qatarHomePage.getBannerInRotatingSliderSection().click();
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
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getHomePageSideBanner().isDisplayed());
    }
    @Test(description = "Make sure the clicking on the first side banner works correctly in Qatar HomePage", priority = 11)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFirstSideBanner().getAttribute("href");
        qatarHomePage.getFirstSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description = "Make sure the clicking on the second side banner works correctly in Qatar HomePage", priority = 11)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getSecondSideBanner().getAttribute("href");
        qatarHomePage.getSecondSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure the HomePage Horizontal Banner is displayed ", priority = 7)
    public void verifyHomePageHorizontalBannerIsDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getHorizontalBanner().isDisplayed());
    }

    @Test(description = "Make sure the Shop By Category section is displayed ", priority = 8)
    public void verifyShopByCategoryIsDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getShopByCategorySections().isDisplayed());
    }

    @Test(description = "Make sure the main options in the Mega Menu are retrieved correctly", priority = 9)
    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertEquals(qatarHomePage.getShopByOption().getText(), "Shop By");
        Assert.assertEquals(qatarHomePage.getSportSupplementsOption().getText(), "Sport Supplements");
        Assert.assertEquals(qatarHomePage.getVitaminsAndHealthOption().getText(), "Vitamins & Health");
        Assert.assertEquals(qatarHomePage.getHealthyFoodOption().getText(), "Healthy Food");
        Assert.assertEquals(qatarHomePage.getSportsOption().getText(), "SPORTS");
        Assert.assertEquals(qatarHomePage.getWomenOnlyOption().getText(), "Women's Only");
    }

    @Test(description = "Make sure the HomePage under shop by category banners are displayed", priority = 10)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        for (int i = 0; i < qatarHomePage.getHomePageUnderShopByCategoryBanners().size(); i++) {
            Assert.assertTrue(qatarHomePage.getHomePageUnderShopByCategoryBanners().get(i).isDisplayed());
        }
    }

    @Test(description = "Make sure the Top Selling Stacks sections are displayed ", priority = 11)
    public void verifyTopSellingStacksSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getTopSellingStacksHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTopSellingStacksSections().isDisplayed());
    }

    @Test(description = "Make sure the view all button appearing in the Top Selling Stacks section works correctly ", priority = 12)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getViewAllBtnInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnViewAllBtnInTopSellingStacksSection();
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
        qatarHomePage = new QatarHomePage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyViewAllBtnInTopSellingStacksSectionWorking();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }

    @Test(description = "Make sure the Top Sellers sections are displayed ", priority = 13)
    public void verifyTopSellersSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getTopSellerHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTopSellerSections().isDisplayed());
    }

    @Test(description = "Make sure that all links appear correctly in the Top Sellers section ", priority = 14)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getAllLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getSportSupplementsLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getHealthyFoodLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getSportswearAndAccessoriesLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the all link that appear in the Top Seller Section ", priority = 15)
    public void verifyAbilityToClickOnTheAllLinkInTopSellersSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnAllLinkInTopSellerSection();
        Assert.assertTrue(qatarHomePage.getAllLActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the Top Seller Section ", priority = 16)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInTopSellersSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportSupplementsLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getSportSupplementsActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getSportSupplementsActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Healthy Food link that appear in the Top Seller Section ", priority = 17)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInTopSellersSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnHealthyFoodLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getHealthyFoodActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getHealthyFoodActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the Top Seller Section ", priority = 18)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInTopSellersSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnVitaminsAndHealthLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getVitaminsAndHealthActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getVitaminsAndHealthActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the Top Seller Section ", priority = 19)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInTopSellersSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportswearAndAccessoriesLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getSportswearAndAccessoriesActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getSportswearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(description = "Make sure that previous button will Appears in the Top Seller Section when clicking on the next button ", priority = 20)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTopSellerSectionInTopSellerSection();
        Assert.assertTrue(qatarHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
    }

    @Test(description = "Make sure the next button appearing in the Top Seller section works Correctly ", priority = 21)
    public void verifyNextBtnInTopSellerSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTopSellersSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTopSellerSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(description = "Make sure the previous button appearing in the Top Seller section works Correctly ", priority = 22)
    public void verifyPreviousBtnInTopSellerSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTopSellersSection();
        qatarHomePage.clickOnPreviousButtonInTopSellersSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTopSellerSectionPositionAfterClickingOnPrevious().isDisplayed());
    }

    @Test(description = "Make sure the Trending On Sporter sections are displayed ", priority = 23)
    public void verifyTrendingOnSporterSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSection().isDisplayed());
    }

    @Test(description = "Make sure the next button appearing in the Trending On Sporter section works Correctly ", priority = 24)
    public void verifyNextBtnInTrendingOnSporterSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTrendingOnSporterSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(description = "Make sure the previous button appearing in the Trending On Sporter section works Correctly ", priority = 25)
    public void verifyPreviousBtnInTrendingOnSporterSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTrendingOnSporterSection();
        qatarHomePage.clickOnPreviousButtonInTrendingOnSporterSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSectionPositionAfterClickingOnPrevious().isDisplayed());
    }

    @Test(description = "Make sure the New Arrivals sections are displayed ", priority = 26)
    public void verifyNewArrivalsSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getNewArrivalsHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSection().isDisplayed());
    }

    @Test(description = "Make sure that all links appear correctly in the New Arrivals section ", priority = 27)
    public void verifyAllLinksInNewArrivalsSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getNewArrivalsAllLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportSupplementsLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsHealthyFoodLinkLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportWearAndAccessoriesLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the all link that appear in the New Arrivals Section ", priority = 28)
    public void verifyAbilityToClickOnTheAllLinkInNewArrivalsSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnAllLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsAllActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsAllActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the New Arrivals Section ", priority = 29)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInNewArrivalsSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportSupplementsLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsSportSupplementsActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportSupplementsActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Healthy Food link that appear in the New Arrivals Section ", priority = 30)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInNewArrivalsSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnHealthyFoodLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsHealthyFoodActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsHealthyFoodActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the New Arrivals Section ", priority = 31)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInNewArrivalsSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnVitaminsAndHealthLinkInNewArrivalsSection();
        Assert.assertTrue(qatarHomePage.getNewArrivalVitaminsAndHealthActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the New Arrivals Section ", priority = 32)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInNewArrivalsSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportswearAndAccessoriesLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(description = "Make sure that previous button will appear in the New Arrivals Section when clicking on the next button ", priority = 33)
    public void verifyPreviousBtnWillAppearInNewArrivalsSectionOnceClickingOnNextBtn() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(qatarHomePage.getPreviousBtnInNewArrivalsSection().isDisplayed());
    }

    @Test(description = "Make sure the next button appearing in the New Arrivals section works Correctly ", priority = 34)
    public void verifyNextBtnInNewArrivalsSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(description = "Make sure the previous button appearing in the New Arrivals section works Correctly ", priority = 35)
    public void verifyPreviousBtnInNewArrivalsSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        qatarHomePage.clickOnPreviousButtonInNewArrivalSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSectionPositionAfterClickingOnPrevious().isDisplayed());
    }

    @Test(description = "Make sure the Got A Question section is displayed ", priority = 36)
    public void verifyGotQuestionSectionIsDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getQuestionBlock().isDisplayed());
        Assert.assertTrue(qatarHomePage.getPhoneBtn().isDisplayed());
        Assert.assertTrue(qatarHomePage.getEmailBtn().isDisplayed());
    }

    @Test(description = "Make sure the Ability to click on email button that appears in the Got A Question section correctly ", priority = 37)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnEmailBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains( contactUsUrl));
    }

    @Test(description = "Make sure the Ability to click on phone button that appears in the Got A Question section correctly ", priority = 38)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnPhoneBtn();
        // store window handles in Set
        String currentWindow = webDriver.getWindowHandle();
        webDriver.switchTo().window(currentWindow);
    }

    @Test(description = "Make sure clicking on the Sports Supplements category does not redirect the user to 404 page or No Content Found Page ", priority = 39)
    public void verifyClickingOnSportsSupplementsCategoryDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportsSupplementsCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Food category does not redirect the user to 404 page or No Content Found Page ", priority = 40)
    public void verifyClickingOnHealthyFoodCategoryDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnHealthyFoodCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamins And Health category does not redirect the user to 404 page or No Content Found Page ", priority = 41)
    public void verifyClickingOnVitaminsAndHealthCategoryDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnVitaminsAndHealthCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sportswear & Accessories category does not redirect the user to 404 page or No Content Found Page ", priority = 42)
    public void verifyClickingOnSportswearAndAccessoriesCategoryDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportswearAndAccessoriesCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the HomePage Horizontal Banner redirect the user to the correct URL ", priority = 43)
    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getHorizontalBanner().isDisplayed(), "The HomePage Horizontal Banner is missing");
        String expectedUrl=qatarHomePage.getHorizontalBanner().getAttribute("href");
        qatarHomePage.clickOnHomePageHorizontalBanner();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the first product appearing in the Top Selling Stacks section correctly", priority = 43)
    public void verifyAbilityToClickOnTheFirstProductAppearingInTheTopSellingStacksSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFirstProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnFirstProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the second product appearing in the Top Selling Stacks section correctly", priority = 43)
    public void verifyAbilityToClickOnTheSecondProductAppearingInTheTopSellingStacksSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getSecondProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnSecondProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the third product appearing in the Top Selling Stacks section correctly", priority = 43)
    public void verifyAbilityToClickOnTheThirdProductAppearingInTheTopSellingStacksSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getThirdProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnThirdProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the fourth product appearing in the Top Selling Stacks section correctly", priority = 43)
    public void verifyAbilityToClickOnTheFourthProductAppearingInTheTopSellingStacksSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFourthProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnFourthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the fifth product appearing in the Top Selling Stacks section correctly", priority = 43)
    public void verifyAbilityToClickOnTheFifthProductAppearingInTheTopSellingStacksSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFiveProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnFifthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the first product appearing in the Top Sellers section correctly", priority = 43)
    public void verifyAbilityToClickOnTheFirstProductAppearingInTheTopSellersSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFirstProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnFirstProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the second product appearing in the Top Sellers section correctly", priority = 43)
    public void verifyAbilityToClickOnTheSecondProductAppearingInTheTopSellersSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getSecondProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnSecondProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the third product appearing in the Top Sellers section correctly", priority = 43)
    public void verifyAbilityToClickOnTheThirdProductAppearingInTheTopSellersSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getThirdProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnThirdProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the fourth product appearing in the Top Sellers section correctly", priority = 43)
    public void verifyAbilityToClickOnTheFourthProductAppearingInTheTopSellersSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFourthProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnFourthProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the fifth product appearing in the Top Sellers section correctly", priority = 43)
    public void verifyAbilityToClickOnTheFifthProductAppearingInTheTopSellersSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFiveProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnFifthProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the first product appearing in the New Arrivals section correctly", priority = 43)
    public void verifyAbilityToClickOnTheFirstProductAppearingInTheNewArrivalsSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFirstProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnFirstProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the second product appearing in the New Arrivals section correctly", priority = 43)
    public void verifyAbilityToClickOnTheSecondProductAppearingInTheNewArrivalsSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getSecondProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnSecondProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the third product appearing in the New Arrivals section correctly", priority = 43)
    public void verifyAbilityToClickOnTheThirdProductAppearingInTheNewArrivalsSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getThirdProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnThirdProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the fourth product appearing in the New Arrivals section correctly", priority = 43)
    public void verifyAbilityToClickOnTheFourthProductAppearingInTheNewArrivalsSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFourthProductInNewArrivalsSection().getAttribute("href");
        ksaHomePage.clickOnFourthProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }
    @Test(description ="Make sure the customer is able to click on the fifth product appearing in the New Arrivals section correctly", priority = 43)
    public void verifyAbilityToClickOnTheFifthProductAppearingInTheNewArrivalsSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFiveProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnFifthProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

}