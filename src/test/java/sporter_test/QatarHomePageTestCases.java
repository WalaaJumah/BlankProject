package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import error_helper.SporterErrorPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.KsaHomePage;
import sporter_pages.QatarHomePage;
import static org.testng.Assert.assertFalse;

public class QatarHomePageTestCases extends BaseTest {
    String contactUsUrl = "contact-form";

    private void verifyTheDisplayedPageDoesNotHaveErrors(){
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        Assert.assertFalse(qatarHomePage.getTitle().equalsIgnoreCase(SporterErrorPage.pageNotFoundTitle),"Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        Assert.assertFalse(qatarHomePage.getSourcePage().contains(SporterErrorPage.productsCannotFindMsg),"The page is empty and the URL is "+webDriver.getCurrentUrl());
        Assert.assertFalse(qatarHomePage.getSourcePage().contains(SporterErrorPage.exceptionPageMsg),"An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }
@Test(description = "Switching to the Qatar Store", priority = 1)
public void switchToQatarStore(){
     QatarHomePage qatarHomePage= new QatarHomePage(webDriver);
    qatarHomePage.switchToQatarCountry();
}
    @Test(description = "Make sure the next and previous arrow at the HomePage rotating slider section are displayed ", priority = 2)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
       QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
        Assert.assertTrue(qatarHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }
    @Test(description = "Make sure clicking on the banners inside the HomePage rotating slider section will redirect the user to correct page", priority = 3)
    public void verifyClickingOnTheBannersInsideTheHomePageRotatingSliderWillRedirectTheUserToCorrectPage(){
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

         qatarHomePage.navigate();
        for (int i = 0; i < qatarHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            qatarHomePage.getHomePageRotatingSliderPagingList().get(i).click();
            qatarHomePage.getBannerInRotatingSliderSection().click();
            this.verifyTheDisplayedPageDoesNotHaveErrors();
            qatarHomePage.navigate();
        }
    }
    @Test(description = "Make sure the clicking on the first and second side banners works correctly in Qatar HomePage", priority = 4)
    public void verifyClickingOnTheFirstAndSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
        String expectedUrl=qatarHomePage.getFirstSideBanner().getAttribute("href");
        qatarHomePage.getFirstSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        String expectedUrlForSecondSideBanner=qatarHomePage.getSecondSideBanner().getAttribute("href");
        qatarHomePage.getSecondSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrlForSecondSideBanner),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description = "Make sure clicking on the HomePage Horizontal Banner redirect the user to the correct URL ", priority = 5)
    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
    QatarHomePage qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getHorizontalBanner().isDisplayed(), "The HomePage Horizontal Banner is missing");
        String expectedUrl=qatarHomePage.getHorizontalBanner().getAttribute("href");
        qatarHomePage.clickOnHomePageHorizontalBanner();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Make sure the Shop By Category section is displayed ", priority = 6)
    public void verifyShopByCategoryIsDisplayed() {
    QatarHomePage qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getShopByCategorySections().isDisplayed());
    }

    @Test(description = "Make sure the main options in the Mega Menu are retrieved correctly", priority = 7)
    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        Assert.assertEquals(qatarHomePage.getShopByOption().getText(), "Shop By");
        Assert.assertEquals(qatarHomePage.getSportSupplementsOption().getText(), "Sport Supplements");
        Assert.assertEquals(qatarHomePage.getVitaminsAndHealthOption().getText(), "Vitamins & Health");
        Assert.assertEquals(qatarHomePage.getHealthyFoodOption().getText(), "Healthy Food");
        Assert.assertEquals(qatarHomePage.getSportsOption().getText(), "SPORTS");
        Assert.assertEquals(qatarHomePage.getWomenOnlyOption().getText(), "Women's Only");
    }

    @Test(description = "Make sure the clicking on the banners appearing under shop by category banners works correctly and redirect the user to correct URL", priority = 8)
    public void verifyClickingOnTheBannersUnderShopByCategoryBannersRedirectTheUserToCorrectUrl() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
        for (int i = 0; i < qatarHomePage.getHomePageUnderShopByCategoryBanners().size(); i++) {
            String expectedUrl=qatarHomePage.getHomePageUnderShopByCategoryBanners().get(i).getAttribute("href");
            qatarHomePage.getHomePageUnderShopByCategoryBanners().get(i).click();
            Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
            this.verifyTheDisplayedPageDoesNotHaveErrors();
            qatarHomePage.navigate();
        }
    }

    @Test(description = "Make sure the Top Selling Stacks sections are displayed ", priority = 9)
    public void verifyTopSellingStacksSectionAreDisplayed() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getTopSellingStacksHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTopSellingStacksSections().isDisplayed());
    }
    @Test(description = "Make sure the Top Sellers sections are displayed ", priority = 10)
    public void verifyTopSellersSectionAreDisplayed() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getTopSellerHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTopSellerSections().isDisplayed());
    }
    @Test(description = "Make sure that all links appear correctly in the Top Sellers section ", priority = 11)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
//        Assert.assertTrue(qatarHomePage.getAllLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getSportSupplementsLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getHealthyFoodLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getSportswearAndAccessoriesLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the all link that appear in the Top Seller Section ", priority = 12)
    public void verifyAbilityToClickOnTheAllLinkInTopSellersSection() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
        qatarHomePage.clickOnAllLinkInTopSellerSection();
        Assert.assertTrue(qatarHomePage.getAllLActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the Top Seller Section ", priority = 13)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInTopSellersSection() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
        qatarHomePage.clickOnSportSupplementsLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getSportSupplementsActiveLink(), 3,webDriver);
        Assert.assertTrue(qatarHomePage.getSportSupplementsActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Healthy Food link that appear in the Top Seller Section ", priority = 14)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInTopSellersSection() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
        qatarHomePage.clickOnHealthyFoodLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getHealthyFoodActiveLink(), 3,webDriver);
        Assert.assertTrue(qatarHomePage.getHealthyFoodActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the Top Seller Section ", priority = 15)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInTopSellersSection() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
        qatarHomePage.clickOnVitaminsAndHealthLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getVitaminsAndHealthActiveLink(), 3,webDriver);
        Assert.assertTrue(qatarHomePage.getVitaminsAndHealthActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the Top Seller Section ", priority = 16)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInTopSellersSection() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
        qatarHomePage.clickOnSportswearAndAccessoriesLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getSportswearAndAccessoriesActiveLink(), 3,webDriver);
        Assert.assertTrue(qatarHomePage.getSportswearAndAccessoriesActiveLink().isDisplayed());
    }
//    @Test(description = "Make sure that previous and next buttons in the Top Seller Section work correctly ", priority = 17)
//    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
//               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

////        qatarHomePage.navigate();
//        qatarHomePage.clickOnNextButtonInTopSellerSectionInTopSellerSection();
//        Assert.assertTrue(qatarHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
//        qatarHomePage.clickOnPreviousButtonInTopSellersSection();
//        Assert.assertTrue(qatarHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
//
//
//    }
    @Test(description = "Make sure the Trending On Sporter sections are displayed ", priority = 17)
    public void verifyTrendingOnSporterSectionAreDisplayed() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSection().isDisplayed());
    }
    @Test(description = "Make sure the next button appearing in the Trending On Sporter section works Correctly ", priority = 18)
    public void verifyNextBtnInTrendingOnSporterSectionWorks() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
        qatarHomePage.clickOnNextButtonInTrendingOnSporterSection();
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSectionPositionAfterClickingOnNext().isDisplayed());
    }
    @Test(description = "Make sure the previous button appearing in the Trending On Sporter section works Correctly ", priority = 19)
    public void verifyPreviousBtnInTrendingOnSporterSectionWorks() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

//        qatarHomePage.navigate();
//        qatarHomePage.clickOnNextButtonInTrendingOnSporterSection();
//        qatarHomePage.clickOnPreviousButtonInTrendingOnSporterSection();
        qatarHomePage.clickOnPreviousButtonInTrendingOnSporterSection();
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSectionPositionAfterClickingOnPrevious().isDisplayed());
    }
    @Test(description = "Make sure the New Arrivals sections are displayed ", priority = 20)
    public void verifyNewArrivalsSectionAreDisplayed() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getNewArrivalsHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSection().isDisplayed());
    }
    @Test(description = "Make sure that all links appear correctly in the New Arrivals section ", priority = 21)
    public void verifyAllLinksInNewArrivalsSectionAreDisplayed() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getNewArrivalsAllLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportSupplementsLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsHealthyFoodLinkLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportWearAndAccessoriesLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the all link that appear in the New Arrivals Section ", priority = 22)
    public void verifyAbilityToClickOnTheAllLinkInNewArrivalsSection() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnAllLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsAllActiveLink(), 4,webDriver);
        Assert.assertTrue(qatarHomePage.getNewArrivalsAllActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the New Arrivals Section ", priority = 23)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInNewArrivalsSection() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnSportSupplementsLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsSportSupplementsActiveLink(), 4,webDriver);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportSupplementsActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Healthy Food link that appear in the New Arrivals Section ", priority = 24)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInNewArrivalsSection() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnHealthyFoodLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsHealthyFoodActiveLink(), 4,webDriver);
        Assert.assertTrue(qatarHomePage.getNewArrivalsHealthyFoodActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the New Arrivals Section ", priority = 25)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInNewArrivalsSection() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnVitaminsAndHealthLinkInNewArrivalsSection();
        Assert.assertTrue(qatarHomePage.getNewArrivalVitaminsAndHealthActiveLink().isDisplayed());
    }

    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the New Arrivals Section ", priority = 26)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInNewArrivalsSection() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnSportswearAndAccessoriesLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink(), 4,webDriver);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(description = "Make sure that previous and next button appearing in the New Arrival section works correctly ", priority = 30)
    public void verifyPreviousBtnWillAppearInNewArrivalsSectionOnceClickingOnNextBtn() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(qatarHomePage.getPreviousBtnInNewArrivalsSection().isDisplayed());
    }

    @Test(description = "Make sure the next button appearing in the New Arrivals section works Correctly ", priority = 31)
    public void verifyNextBtnInNewArrivalsSectionWorks() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(qatarHomePage.getNewArrivalsSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(description = "Make sure the previous button appearing in the New Arrivals section works Correctly ", priority = 32)
    public void verifyPreviousBtnInNewArrivalsSectionWorks() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        qatarHomePage.clickOnPreviousButtonInNewArrivalSection();
        Assert.assertTrue(qatarHomePage.getNewArrivalsSectionPositionAfterClickingOnPrevious().isDisplayed());
    }

    @Test(description = "Make sure the Got A Question section is displayed ", priority = 27)
    public void verifyGotQuestionSectionIsDisplayed() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getQuestionBlock().isDisplayed());
        Assert.assertTrue(qatarHomePage.getPhoneBtn().isDisplayed());
        Assert.assertTrue(qatarHomePage.getEmailBtn().isDisplayed());
    }

    @Test(description = "Make sure the Ability to click on email button that appears in the Got A Question section correctly ", priority = 28)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnEmailBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains( contactUsUrl),"The system redirect the user to wrong URL "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sports Supplements category redirect the user to the correct URL ", priority = 29)
    public void verifyClickingOnSportsSupplementsCategoryRedirectTheUserToCorrectPage() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnSportsSupplementsCategory();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Make sure clicking on the Healthy Food category redirect the user to the correct URL ", priority = 30)
    public void verifyClickingOnHealthyFoodCategoryDoeNotRedirectTheUserToCorrectPage() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnHealthyFoodCategory();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Make sure clicking on the Vitamins And Health category redirect the user to the correct URL ", priority = 31)
    public void verifyClickingOnVitaminsAndHealthCategoryDoeNotRedirectTheUserToCorrectPage() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnVitaminsAndHealthCategory();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Make sure clicking on the Sportswear & Accessories category redirect the user to the correct URL ", priority = 32)
    public void verifyClickingOnSportswearAndAccessoriesCategoryDoeNotRedirectTheUserToCorrectPage() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnSportswearAndAccessoriesCategory();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description ="Make sure clicking on the products appearing in the Top Selling Stacks section redirect the user to the correct URL", priority = 33)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        String expectedUrl=qatarHomePage.getFirstProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnFirstProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
         expectedUrl=qatarHomePage.getSecondProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnSecondProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        expectedUrl=qatarHomePage.getFourthProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnFourthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        expectedUrl=qatarHomePage.getFiveProductInTopSellingStacksSection().getAttribute("href");
        qatarHomePage.clickOnFifthProductInTheTopSellingStacksSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description ="Make sure clicking on the products appearing in the Top Sellers section redirect the user to the correct URL", priority = 34)
    public void verifyClickOnTheProductsAppearingInTheTopSellersSectionRedirectTheUserToCorrectUrl() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        String expectedUrl=qatarHomePage.getFirstProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnFirstProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        expectedUrl=qatarHomePage.getSecondProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnSecondProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        expectedUrl=qatarHomePage.getFourthProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnFourthProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        expectedUrl=qatarHomePage.getFiveProductInTopSellersSection().getAttribute("href");
        qatarHomePage.clickOnFifthProductInTheTopSellersSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description ="Make sure clicking on the products appearing in the New Arrivals section redirect the user to the correct URL", priority = 35)
    public void verifyClickOnTheProductsAppearingInTheNewArrivalsSectionRedirectTheUserToCorrectUrl() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        String expectedUrl=qatarHomePage.getFirstProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnFirstProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
         expectedUrl=qatarHomePage.getSecondProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnSecondProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        expectedUrl=qatarHomePage.getThirdProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnThirdProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        expectedUrl=qatarHomePage.getFourthProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnFourthProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        expectedUrl=qatarHomePage.getFiveProductInNewArrivalsSection().getAttribute("href");
        qatarHomePage.clickOnFifthProductInTheNewArrivalsSection();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl),"Incorrect URL is displayed "+webDriver.getCurrentUrl());
        this.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(description = "Make sure the Ability to click on phone button that appears in the Got A Question section correctly ", priority = 36)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {
               QatarHomePage qatarHomePage= new QatarHomePage(webDriver);

        qatarHomePage.navigate();
        qatarHomePage.clickOnPhoneBtn();
        // store window handles in Set
        String currentWindow = webDriver.getWindowHandle();
        webDriver.switchTo().window(currentWindow);
    }
}