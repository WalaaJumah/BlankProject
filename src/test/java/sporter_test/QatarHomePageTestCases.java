package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AeSportSupplementsCategoryPage;
import sporter_pages.QatarHomePage;
import static org.testng.Assert.assertFalse;

public class QatarHomePageTestCases extends BaseTest {
    private QatarHomePage qatarHomePage;
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    String allProductsInTopSellingStacksSectionURL = "https://www.sporter.com/en-qa/";
    String contactUsUrl = "contact-form";

    @Test(description = "Make sure the next and previous arrow at the HomePage rotating slider section are displayed ", priority = 1)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
        Assert.assertTrue(qatarHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }
    @Test(description = "Make sure clicking on the banners inside the HomePage rotating slider section will redirect the user to correct page", priority = 2)
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
    @Test(description = "Make sure the clicking on the first and second side banners works correctly in Qatar HomePage", priority = 3)
    public void verifyClickingOnTheFirstAndSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
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
        webDriver.navigate().to(siteURL);
        String expectedUrlForSecondSideBanner=qatarHomePage.getSecondSideBanner().getAttribute("href");
        qatarHomePage.getSecondSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrlForSecondSideBanner),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitleForSecondSideBanner = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitleForSecondSideBanner, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresentForSecondSideBanner = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresentForSecondSideBanner, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresentForSecondSideBanner = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());

    }
    @Test(description = "Make sure clicking on the HomePage Horizontal Banner redirect the user to the correct URL ", priority = 4)
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

    @Test(description = "Make sure the Shop By Category section is displayed ", priority = 5)
    public void verifyShopByCategoryIsDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getShopByCategorySections().isDisplayed());
    }

    @Test(description = "Make sure the main options in the Mega Menu are retrieved correctly", priority = 6)
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

    @Test(description = "Make sure the clicking on the banners appearing under shop by category banners works correctly and redirect the user to correct URL", priority = 7)
    public void verifyClickingOnTheBannersUnderShopByCategoryBannersRedirectTheUserToCorrectUrl() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        for (int i = 0; i < qatarHomePage.getHomePageUnderShopByCategoryBanners().size(); i++) {
            String expectedUrl=qatarHomePage.getHomePageUnderShopByCategoryBanners().get(i).getAttribute("href");
            qatarHomePage.getHomePageUnderShopByCategoryBanners().get(i).click();
            Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
            boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
            assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
            boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
            assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
            boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
            assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
            webDriver.navigate().to(siteURL);
        }
    }

    @Test(description = "Make sure the Top Selling Stacks sections are displayed ", priority = 8)
    public void verifyTopSellingStacksSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getTopSellingStacksHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTopSellingStacksSections().isDisplayed());
    }
    @Test(description = "Make sure the Top Sellers sections are displayed ", priority = 9)
    public void verifyTopSellersSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getTopSellerHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTopSellerSections().isDisplayed());
    }
    @Test(description = "Make sure that all links appear correctly in the Top Sellers section ", priority = 10)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getAllLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getSportSupplementsLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getHealthyFoodLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getSportswearAndAccessoriesLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the all link that appear in the Top Seller Section ", priority = 11)
    public void verifyAbilityToClickOnTheAllLinkInTopSellersSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnAllLinkInTopSellerSection();
        Assert.assertTrue(qatarHomePage.getAllLActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the Top Seller Section ", priority = 12)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInTopSellersSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportSupplementsLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getSportSupplementsActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getSportSupplementsActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Healthy Food link that appear in the Top Seller Section ", priority = 13)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInTopSellersSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnHealthyFoodLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getHealthyFoodActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getHealthyFoodActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the Top Seller Section ", priority = 14)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInTopSellersSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnVitaminsAndHealthLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getVitaminsAndHealthActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getVitaminsAndHealthActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the Top Seller Section ", priority = 15)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInTopSellersSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportswearAndAccessoriesLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getSportswearAndAccessoriesActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getSportswearAndAccessoriesActiveLink().isDisplayed());
    }
    @Test(description = "Make sure that previous button will Appears in the Top Seller Section when clicking on the next button ", priority = 16)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTopSellerSectionInTopSellerSection();
        Assert.assertTrue(qatarHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
    }
    @Test(description = "Make sure the next button appearing in the Top Seller section works Correctly ", priority = 17)
    public void verifyNextBtnInTopSellerSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTopSellersSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTopSellerSectionPositionAfterClickingOnNext().isDisplayed());
    }
    @Test(description = "Make sure the previous button appearing in the Top Seller section works Correctly ", priority = 18)
    public void verifyPreviousBtnInTopSellerSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTopSellersSection();
        qatarHomePage.clickOnPreviousButtonInTopSellersSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTopSellerSectionPositionAfterClickingOnPrevious().isDisplayed());
    }
    @Test(description = "Make sure the Trending On Sporter sections are displayed ", priority = 19)
    public void verifyTrendingOnSporterSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSection().isDisplayed());
    }
    @Test(description = "Make sure the next button appearing in the Trending On Sporter section works Correctly ", priority = 20)
    public void verifyNextBtnInTrendingOnSporterSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTrendingOnSporterSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSectionPositionAfterClickingOnNext().isDisplayed());
    }
    @Test(description = "Make sure the previous button appearing in the Trending On Sporter section works Correctly ", priority = 21)
    public void verifyPreviousBtnInTrendingOnSporterSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTrendingOnSporterSection();
        qatarHomePage.clickOnPreviousButtonInTrendingOnSporterSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSectionPositionAfterClickingOnPrevious().isDisplayed());
    }
    @Test(description = "Make sure the New Arrivals sections are displayed ", priority = 22)
    public void verifyNewArrivalsSectionAreDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getNewArrivalsHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSection().isDisplayed());
    }
    @Test(description = "Make sure that all links appear correctly in the New Arrivals section ", priority = 23)
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
    @Test(description = "Make sure ability to click on the all link that appear in the New Arrivals Section ", priority = 24)
    public void verifyAbilityToClickOnTheAllLinkInNewArrivalsSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnAllLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsAllActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsAllActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the New Arrivals Section ", priority = 25)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInNewArrivalsSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportSupplementsLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsSportSupplementsActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportSupplementsActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Healthy Food link that appear in the New Arrivals Section ", priority = 26)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInNewArrivalsSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnHealthyFoodLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsHealthyFoodActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsHealthyFoodActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the New Arrivals Section ", priority = 27)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInNewArrivalsSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnVitaminsAndHealthLinkInNewArrivalsSection();
        Assert.assertTrue(qatarHomePage.getNewArrivalVitaminsAndHealthActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the New Arrivals Section ", priority = 28)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInNewArrivalsSection() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportswearAndAccessoriesLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink(), 10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(description = "Make sure that previous button will appear in the New Arrivals Section when clicking on the next button ", priority = 29)
    public void verifyPreviousBtnWillAppearInNewArrivalsSectionOnceClickingOnNextBtn() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(qatarHomePage.getPreviousBtnInNewArrivalsSection().isDisplayed());
    }

    @Test(description = "Make sure the next button appearing in the New Arrivals section works Correctly ", priority = 30)
    public void verifyNextBtnInNewArrivalsSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(qatarHomePage.getNewArrivalsSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(description = "Make sure the previous button appearing in the New Arrivals section works Correctly ", priority = 31)
    public void verifyPreviousBtnInNewArrivalsSectionWorks() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        qatarHomePage.clickOnPreviousButtonInNewArrivalSection();
        Assert.assertTrue(qatarHomePage.getNewArrivalsSectionPositionAfterClickingOnPrevious().isDisplayed());
    }

    @Test(description = "Make sure the Got A Question section is displayed ", priority = 32)
    public void verifyGotQuestionSectionIsDisplayed() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getQuestionBlock().isDisplayed());
        Assert.assertTrue(qatarHomePage.getPhoneBtn().isDisplayed());
        Assert.assertTrue(qatarHomePage.getEmailBtn().isDisplayed());
    }

    @Test(description = "Make sure the Ability to click on email button that appears in the Got A Question section correctly ", priority = 33)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnEmailBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains( contactUsUrl),"The system redirect the user to wrong URL "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure the Ability to click on phone button that appears in the Got A Question section correctly ", priority = 34)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnPhoneBtn();
        // store window handles in Set
        String currentWindow = webDriver.getWindowHandle();
        webDriver.switchTo().window(currentWindow);
    }

    @Test(description = "Make sure clicking on the Sports Supplements category redirect the user to the correct URL ", priority = 35)
    public void verifyClickingOnSportsSupplementsCategoryRedirectTheUserToCorrectPage() {
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

    @Test(description = "Make sure clicking on the Healthy Food category redirect the user to the correct URL ", priority = 36)
    public void verifyClickingOnHealthyFoodCategoryDoeNotRedirectTheUserToCorrectPage() {
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

    @Test(description = "Make sure clicking on the Vitamins And Health category redirect the user to the correct URL ", priority = 37)
    public void verifyClickingOnVitaminsAndHealthCategoryDoeNotRedirectTheUserToCorrectPage() {
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

    @Test(description = "Make sure clicking on the Sportswear & Accessories category redirect the user to the correct URL ", priority = 38)
    public void verifyClickingOnSportswearAndAccessoriesCategoryDoeNotRedirectTheUserToCorrectPage() {
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
    @Test(description ="Make sure clicking on the products appearing in the Top Selling Stacks section redirect the user to the correct URL", priority = 39)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFirstProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnFirstProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
         expectedUrl=qatarHomePage.getSecondProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnSecondProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=qatarHomePage.getThirdProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnThirdProductInTheTopSellingStacksSection();
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=qatarHomePage.getFourthProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnFourthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=qatarHomePage.getFiveProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnFifthProductInTheTopSellingStacksSection();
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
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFirstProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnFirstProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=qatarHomePage.getSecondProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnSecondProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=qatarHomePage.getThirdProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnThirdProductInTheTopSellersSection();
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=qatarHomePage.getFourthProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnFourthProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=qatarHomePage.getFiveProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnFifthProductInTheTopSellersSection();
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
        qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        String expectedUrl=qatarHomePage.getFirstProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnFirstProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
         expectedUrl=qatarHomePage.getSecondProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnSecondProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
         verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
         isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
         isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=qatarHomePage.getThirdProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnThirdProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=qatarHomePage.getFourthProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnFourthProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
        webDriver.navigate().to(siteURL);
        expectedUrl=qatarHomePage.getFiveProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnFifthProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        Assert.assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        Assert.assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        Assert.assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is"+webDriver.getCurrentUrl());
    }

}