package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AeVitaminsAndHealthCategoryPage;
import sporter_pages.QatarHomePage;
import xml_reader.XmlReader;

@Test(groups = "Home Page")
public class QatarHomePageTestCases extends BaseTest {


//    QatarHomePage qatarHomePage;
//The below code used when we did not define the QatarHomePageObject inside each method
//    @BeforeClass
//    @Override
//    @Parameters({"environment"})
//    public void setupBrowser( String environment) throws Exception {
//        super.setupBrowser(environment);
//        qatarHomePage= new QatarHomePage(webDriver);
//    }

    @Test(groups = "All Smoke Testing Result",description = "Qatar HomePage- Switching to the Qatar Store", priority = 1)
    public void switchToQatarStore() {
//        qatarHomePage.webDriver=this.webDriver;
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        if(webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)){
            System.out.println("You are in Qatar Store");
        }
        else {
            qatarHomePage.switchToQatarCountry();
        }
    }

    @Test( groups = {"Home Page","1. Critical Severity"},description = "Qatar HomePage- Make sure the next and previous buttons appearing in the HomePage rotating slider section are displayed ", priority = 2)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        Assert.assertTrue(qatarHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
        Assert.assertTrue(qatarHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }

    @Test(groups = {"Home Page","All Smoke Testing Result","2. High Severity"},description = "Qatar HomePage- Make sure clicking on the banners inside the rotating slider section works correctly", priority = 3)
    public void verifyClickingOnTheBannersInsideTheRotatingSliderWorksCorrectly() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        for (int i = 0; i < qatarHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            qatarHomePage.getHomePageRotatingSliderPagingList().get(i).click();
            qatarHomePage.getBannerInRotatingSliderSection().click();
            qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
            qatarHomePage.navigate();
        }
    }

    @Test(groups = {"Home Page","All Smoke Testing Result","2. High Severity"},description = "Qatar HomePage- Make sure clicking on the first and second side banners works correctly", priority = 4)
    public void verifyClickingOnTheFirstAndSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        String expectedUrl = qatarHomePage.getFirstSideBanner().getAttribute("href");
        qatarHomePage.getFirstSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        qatarHomePage.navigate();
        String expectedUrlForSecondSideBanner = qatarHomePage.getSecondSideBanner().getAttribute("href");
        qatarHomePage.getSecondSideBanner().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrlForSecondSideBanner), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"Home Page","All Smoke Testing Result","2. High Severity"},description = "Qatar HomePage- Make sure clicking on the HomePage Horizontal Banner works correctly", priority = 5)
    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getHorizontalBanner().isDisplayed(), "The HomePage Horizontal Banner is missing");
        String expectedUrl = qatarHomePage.getHorizontalBanner().getAttribute("href");
        qatarHomePage.clickOnHomePageHorizontalBanner();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure the Shop By Category section is displayed ", priority = 6)
    public void verifyShopByCategoryIsDisplayed() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getShopByCategorySections().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure the main options in the Mega Menu are retrieved correctly", priority = 7)
    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        Assert.assertEquals(qatarHomePage.getShopByOption().getText(), "Shop By");
        Assert.assertEquals(qatarHomePage.getSportSupplementsOption().getText(), "Sport Supplements");
        Assert.assertEquals(qatarHomePage.getVitaminsAndHealthOption().getText(), "Vitamins & Health");
        Assert.assertEquals(qatarHomePage.getHealthyFoodOption().getText(), "Healthy Food");
        Assert.assertEquals(qatarHomePage.getSportsOption().getText(), "SPORTS");
        Assert.assertEquals(qatarHomePage.getWomenOnlyOption().getText(), "Women's Only");
    }

    @Test(groups = {"Home Page","All Smoke Testing Result","2. High Severity"},description = "Qatar HomePage- Make sure clicking on the banners appearing under shop by category banners works correctly", priority = 8)
    public void verifyClickingOnTheBannersUnderShopByCategoryBannersRedirectTheUserToCorrectUrl() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        for (int i = 0; i < qatarHomePage.getHomePageUnderShopByCategoryBanners().size(); i++) {
            String expectedUrl = qatarHomePage.getHomePageUnderShopByCategoryBanners().get(i).getAttribute("href");
            qatarHomePage.getHomePageUnderShopByCategoryBanners().get(i).click();
            Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
            qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
            qatarHomePage.navigate();
        }
    }

    @Test(groups = {"Home Page","All Smoke Testing Result","2. High Severity"},description = "Qatar HomePage- Make sure the Top Selling Stacks section is displayed ", priority = 9)
    public void verifyTopSellingStacksSectionAreDisplayed() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getTopSellingStacksHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTopSellingStacksSections().isDisplayed());
    }

    @Test(groups = {"Home Page","All Smoke Testing Result","2. High Severity"},description = "Qatar HomePage- Make sure the Top Sellers section is displayed ", priority = 10)
    public void verifyTopSellersSectionAreDisplayed() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getTopSellerHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTopSellerSections().isDisplayed());
    }

    @Test(groups = {"3. Medium Severity","Home Page","All Smoke Testing Result"},description = "Qatar HomePage- Make sure that all links appear correctly in the Top Sellers section ", priority = 11)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
//        Assert.assertTrue(qatarHomePage.getAllLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getSportSupplementsLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getHealthyFoodLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getSportswearAndAccessoriesLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure clicking on ALL tab from the Top Seller Section works correctly ", priority = 12)
    public void verifyAbilityToClickOnTheAllLinkInTopSellersSection() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        qatarHomePage.clickOnAllLinkInTopSellerSection();
        Assert.assertTrue(qatarHomePage.getAllLActiveLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure clicking on the Sport Supplements tab from the Top Seller Section works correctly ", priority = 13)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInTopSellersSection() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        qatarHomePage.clickOnSportSupplementsLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getSportSupplementsActiveLink(), 3, webDriver);
        Assert.assertTrue(qatarHomePage.getSportSupplementsActiveLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure clicking on the Healthy Food tab from the Top Seller Section works correctly  ", priority = 14)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInTopSellersSection() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        qatarHomePage.clickOnHealthyFoodLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getHealthyFoodActiveLink(), 3, webDriver);
        Assert.assertTrue(qatarHomePage.getHealthyFoodActiveLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure clicking on the Vitamins And Health tab from the Top Seller Section works correctly", priority = 15)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInTopSellersSection() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        qatarHomePage.clickOnVitaminsAndHealthLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getVitaminsAndHealthActiveLink(), 3, webDriver);
        Assert.assertTrue(qatarHomePage.getVitaminsAndHealthActiveLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure clicking on the Sportswear And Accessories from the Top Seller Section works correctly ", priority = 16)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInTopSellersSection() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        qatarHomePage.clickOnSportswearAndAccessoriesLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getSportswearAndAccessoriesActiveLink(), 3, webDriver);
        Assert.assertTrue(qatarHomePage.getSportswearAndAccessoriesActiveLink().isDisplayed());
    }
    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure that previous and next buttons in the Top Seller Section work correctly ", priority = 17)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
        QatarHomePage qatarHomePage= new QatarHomePage(webDriver);
    //        qatarHomePage.navigate();
        qatarHomePage.clickOnNextButtonInTopSellerSectionInTopSellerSection();
        Assert.assertTrue(qatarHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
        qatarHomePage.clickOnPreviousButtonInTopSellersSection();
    }
    @Test(groups = {"Home Page","All Smoke Testing Result","2. High Severity"},description = "Qatar HomePage- Make sure the Trending On Sporter section is displayed ", priority = 18)
    public void verifyTrendingOnSporterSectionAreDisplayed() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSection().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure the next button appearing in the Trending On Sporter section works Correctly ", priority = 19)
    public void verifyNextBtnInTrendingOnSporterSectionWorks() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        //        qatarHomePage.navigate();
        qatarHomePage.clickOnNextButtonInTrendingOnSporterSection();
        Assert.assertTrue(qatarHomePage.getVitmainsForKidsCategory().isDisplayed());
//        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSectionPositionAfterClickingOnNext().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure the previous button appearing in the Trending On Sporter section works Correctly ", priority = 20)
    public void verifyPreviousBtnInTrendingOnSporterSectionWorks() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.clickOnPreviousButtonInTrendingOnSporterSection();
        Assert.assertTrue(qatarHomePage.getGamingAndFocusCategory().isDisplayed());
    }

    @Test(groups = {"Home Page","All Smoke Testing Result","2. High Severity"},description = "Qatar HomePage- Make sure the New Arrivals section is displayed ", priority = 21)
    public void verifyNewArrivalsSectionAreDisplayed() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getNewArrivalsHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSection().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure that all tabs appear correctly in the New Arrivals section ", priority = 22)
    public void verifyAllLinksInNewArrivalsSectionAreDisplayed() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getNewArrivalsAllLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportSupplementsLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsHealthyFoodLinkLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportWearAndAccessoriesLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure clicking on the ALL tab from the New Arrivals Section works correctly", priority = 23)
    public void verifyAbilityToClickOnTheAllLinkInNewArrivalsSection() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        qatarHomePage.clickOnAllLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsAllActiveLink(), 4, webDriver);
        Assert.assertTrue(qatarHomePage.getNewArrivalsAllActiveLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure clicking on the Sport Supplements tab from the New Arrivals Section works correctly ", priority = 24)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInNewArrivalsSection() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        qatarHomePage.clickOnSportSupplementsLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsSportSupplementsActiveLink(), 4, webDriver);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportSupplementsActiveLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure clicking on the Healthy Food tab from the New Arrivals Section works correctly", priority = 25)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInNewArrivalsSection() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        qatarHomePage.clickOnHealthyFoodLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsHealthyFoodActiveLink(), 4, webDriver);
        Assert.assertTrue(qatarHomePage.getNewArrivalsHealthyFoodActiveLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure clicking on the Vitamins And Health tab from the New Arrivals Section works correctly", priority = 26)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInNewArrivalsSection() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        qatarHomePage.clickOnVitaminsAndHealthLinkInNewArrivalsSection();
        Assert.assertTrue(qatarHomePage.getNewArrivalVitaminsAndHealthActiveLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure clicking on the Sportswear And Accessories tab from the New Arrivals Section works correctly ", priority = 27)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInNewArrivalsSection() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        qatarHomePage.clickOnSportswearAndAccessoriesLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink(), 4, webDriver);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportWearAndAccessoriesActiveLink().isDisplayed());
    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure that previous and next button appearing in the New Arrival section works correctly ", priority = 28)
    public void verifyPreviousBtnWillAppearInNewArrivalsSectionOnceClickingOnNextBtn() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(qatarHomePage.getPreviousBtnInNewArrivalsSection().isDisplayed());
    }

//    @Test(description = "Qatar HomePage- Make sure the next button appearing in the New Arrivals section works Correctly ", priority = 31)
//    public void verifyNextBtnInNewArrivalsSectionWorks() {
//        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
//        qatarHomePage.clickOnNextButtonInNewArrivalSection();
//        Assert.assertTrue(qatarHomePage.getNewArrivalsSectionPositionAfterClickingOnNext().isDisplayed());
//    }

//    @Test(description = "Qatar HomePage- Make sure the previous button appearing in the New Arrivals section works Correctly ", priority = 32)
//    public void verifyPreviousBtnInNewArrivalsSectionWorks() {
//        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
//        qatarHomePage.clickOnNextButtonInNewArrivalSection();
//        qatarHomePage.clickOnPreviousButtonInNewArrivalSection();
//        Assert.assertTrue(qatarHomePage.getNewArrivalsSectionPositionAfterClickingOnPrevious().isDisplayed());
//    }

    @Test(groups = {"Home Page","3. Medium Severity"},description = "Qatar HomePage- Make sure the Got A Question section is displayed ", priority = 29)
    public void verifyGotQuestionSectionIsDisplayed() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
//        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getQuestionBlock().isDisplayed());
        Assert.assertTrue(qatarHomePage.getPhoneBtn().isDisplayed());
        Assert.assertTrue(qatarHomePage.getEmailBtn().isDisplayed());
    }

    @Test(groups = {"Home Page","All Smoke Testing Result","1. Critical Severity"},description = "Qatar HomePage- Make sure clicking on email button from the Got A Question section works correctly ", priority = 30)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        qatarHomePage.clickOnEmailBtn();
        DataHelperAndWait.waitForUrlContains(qatarHomePage.contactUsUrl,webDriver,5);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(qatarHomePage.contactUsUrl), "The system redirect the user to wrong URL " + webDriver.getCurrentUrl());
    }

    @Test(groups = {"Home Page","1. Critical Severity"},description = "Qatar HomePage- Make sure clicking on the Sports Supplements category from HomePage works correctly ", priority = 31)
    public void verifyClickingOnSportsSupplementsCategoryRedirectTheUserToCorrectPage() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        qatarHomePage.clickOnSportsSupplementsCategory();
        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"Home Page","1. Critical Severity"},description = "Qatar HomePage- Make sure clicking on the Healthy Food category from HomePage works correctly ", priority = 32)
    public void verifyClickingOnHealthyFoodCategoryDoeNotRedirectTheUserToCorrectPage() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        qatarHomePage.clickOnHealthyFoodCategory();
        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"Home Page","1. Critical Severity"},description = "Qatar HomePage- Make sure clicking on the Vitamins And Health category from HomePage works correctly", priority = 33)
    public void verifyClickingOnVitaminsAndHealthCategoryDoeNotRedirectTheUserToCorrectPage() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        qatarHomePage.clickOnVitaminsAndHealthCategory();
        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"Home Page","1. Critical Severity"},description = "Qatar HomePage- Make sure clicking on the Sportswear & Accessories category from HomePage works correctly", priority = 34)
    public void verifyClickingOnSportswearAndAccessoriesCategoryDoeNotRedirectTheUserToCorrectPage() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        qatarHomePage.clickOnSportswearAndAccessoriesCategory();
        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"Home Page","1. Critical Severity"},description = "Qatar HomePage- Make sure clicking on the products appearing in the Top Selling Stacks section works correctly", priority = 35)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        for(int i=0; i<qatarHomePage.getFirstProductInTopSellingStacksSection().size();i++ ){
            do{
                qatarHomePage.clickOnNextButtonInTopSellersSection();
            }
            while(!qatarHomePage.getFirstProductInTopSellingStacksSection().get(i).isDisplayed());

            String expectedUrl = qatarHomePage.getFirstProductInTopSellingStacksSection().get(i).getAttribute("href");
            DataHelperAndWait.waitToBeVisible(qatarHomePage.getFirstProductInTopSellingStacksSection().get(i),8,webDriver);
            qatarHomePage.getFirstProductInTopSellingStacksSection().get(i).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
            qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
            qatarHomePage.navigate();

        }



//        qatarHomePage.navigate();
//        String expectedUrl = qatarHomePage.getFirstProductInTopSellingStacksSection().getAttribute("href");
//        qatarHomePage.clickOnFirstProductInTheTopSellingStacksSection();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
//        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
//        qatarHomePage.navigate();
//        expectedUrl = qatarHomePage.getSecondProductInTopSellingStacksSection().getAttribute("href");
//        qatarHomePage.clickOnSecondProductInTheTopSellingStacksSection();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
//        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
//        qatarHomePage.navigate();
//        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
//        qatarHomePage.navigate();
//        expectedUrl = qatarHomePage.getFourthProductInTopSellingStacksSection().getAttribute("href");
//        qatarHomePage.clickOnFourthProductInTheTopSellingStacksSection();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
//        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
//        qatarHomePage.navigate();
//        expectedUrl = qatarHomePage.getFiveProductInTopSellingStacksSection().getAttribute("href");
//        qatarHomePage.clickOnFifthProductInTheTopSellingStacksSection();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
//        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"Home Page","1. Critical Severity"},description = "Qatar HomePage- Make sure clicking on the products appearing in the Top Sellers section redirect the user to the correct URL", priority = 36)
    public void verifyClickOnTheProductsAppearingInTheTopSellersSectionRedirectTheUserToCorrectUrl() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getProductListInTopSellersSection().size() > 0, "There's no any products in the list");
        for (int i = 0; i < qatarHomePage.getProductListInTopSellersSection().size(); i++) {
            if( qatarHomePage.getProductListInTopSellersSection().size()>5){
            if(qatarHomePage.getProductListInTopSellersSection().get(i).isDisplayed()){
                DataHelperAndWait.waitToBeVisible(qatarHomePage.getProductListInTopSellersSection().get(i),8,webDriver);
            qatarHomePage.getProductListInTopSellersSection().get(i).click();
            qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
            qatarHomePage.navigate();}
            else{
                do{
                    qatarHomePage.clickOnNextButtonInTopSellerSectionInTopSellerSection();
                }
                while(!qatarHomePage.getProductListInTopSellersSection().get(i).isDisplayed());
                DataHelperAndWait.waitToBeVisible(qatarHomePage.getProductListInTopSellersSection().get(i),5,webDriver);
                qatarHomePage.getProductListInTopSellersSection().get(i).click();
            }
                qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
                qatarHomePage.navigate();}
        else
            {
                DataHelperAndWait.waitToBeVisible(qatarHomePage.getProductListInTopSellersSection().get(i),8,webDriver);
                qatarHomePage.getProductListInTopSellersSection().get(i).click();
                qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
            }
        }

        }


    @Test(groups = {"Home Page","1. Critical Severity"},description = "Qatar HomePage- Make sure clicking on the products appearing in the New Arrivals section redirect the user to the correct URL", priority = 37)
    public void verifyClickOnTheProductsAppearingInTheNewArrivalsSectionRedirectTheUserToCorrectUrl() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        Assert.assertTrue(qatarHomePage.getProductsListInNewArrivalsSection().size() > 0, "There's no any products in the list");
        for (int i = 0; i < qatarHomePage.getProductsListInNewArrivalsSection().size(); i++) {
            if( qatarHomePage.getProductsListInNewArrivalsSection().size()>5){
                if(qatarHomePage.getProductsListInNewArrivalsSection().get(i).isDisplayed()){
                    DataHelperAndWait.waitToBeVisible(qatarHomePage.getProductsListInNewArrivalsSection().get(i),8,webDriver);
                    qatarHomePage.getProductsListInNewArrivalsSection().get(i).click();
                    qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
                    qatarHomePage.navigate();}
                else{
                    do{
                        qatarHomePage.clickOnNextButtonInNewArrivalSection();
                    }
                    while(!qatarHomePage.getProductsListInNewArrivalsSection().get(i).isDisplayed());
                    DataHelperAndWait.waitToBeVisible(qatarHomePage.getProductsListInNewArrivalsSection().get(i),5,webDriver);
                    qatarHomePage.getProductsListInNewArrivalsSection().get(i).click();
                }
                qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
                qatarHomePage.navigate();}
            else
            {
                DataHelperAndWait.waitToBeVisible(qatarHomePage.getProductsListInNewArrivalsSection().get(i),8,webDriver);
                qatarHomePage.getProductsListInNewArrivalsSection().get(i).click();
                qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
            }
        }
    }

    @Test(groups = {"Home Page","2. High Severity"},description = "Qatar HomePage- Make sure clicking on phone button from the Got A Question section works correctly ", priority = 38)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.navigate();
        qatarHomePage.clickOnPhoneBtn();
        String currentWindow = webDriver.getWindowHandle();
        webDriver.switchTo().window(currentWindow);

    }
}