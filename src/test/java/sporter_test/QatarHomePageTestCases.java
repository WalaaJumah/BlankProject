package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.KsaHomePage;
import sporter_pages.QatarHomePage;

public class QatarHomePageTestCases extends BaseTest {
    private QatarHomePage qatarHomePage;
    String allProductsInTopSellingStacksSectionURL ="https://www.sporter.com/en-qa/";
    String contactUsUrl= "https://www.sporter.com/en-qa/contacts-us/#contact-form";

    @Test(description = "Make sure to switch to the Qatar Store correctly", priority = 1)
    public void switchToQatarStore(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(),qaterSiteURL);
    }
    @Test(description = "Make sure the HomePage rotating slider section is displayed in Home Page", priority = 2)
    public void verifyHomePageRotatingSliderIsDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getHomePageRotatingSlider().isDisplayed());
        for (int i=0; i<qatarHomePage.getHomePageRotatingSliderlist().size();i++) {
            Assert.assertTrue(qatarHomePage.getHomePageRotatingSliderlist().get(i).isDisplayed());
        }}
    @Test(description = "Make sure the next arrow at the HomePage rotating slider section is displayed ",priority = 3)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
    }
    @Test(description = "Make sure the previous arrow at the HomePage rotating slider section is displayed ",priority = 4)
    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }
    @Test(description = "Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 5)
    public void verifyPagenationControlOnHomePageRotatingSliderIsDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
        for (int i=0; i<qatarHomePage.getHomePageRotatingSliderPaginglist().size();i++) {
            Assert.assertTrue(qatarHomePage.getHomePageRotatingSliderPaginglist().get(i).isDisplayed());
        }}
    @Test(description = "Make sure the HomePage side Banner is displayed ",priority = 6)
    public void verifyHomePageSideBannerIsDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getHomePageSideBanner().isDisplayed());
    }
    @Test(description = "Make sure the HomePage Horizontal Banner is displayed ",priority = 7)
    public void verifyHomePageHorizontalBannerIsDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getHorizontalBanner().isDisplayed());
    }
    @Test(description = "Make sure the Shop By Category section is displayed ",priority = 8)
    public void verifyShopByCategoryIsDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getShopByCategorySections().isDisplayed());
    }
    @Test(description = "Make sure the main options in the Mega Menu are retrieved correctly", priority = 9)
    public void verifyMainOptionsInTheMegaMenyAreDisplayed() {
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertEquals(qatarHomePage.getShopeByOption().getText(), "Shop By");
        Assert.assertEquals(qatarHomePage.getSportSupplementsOption().getText(), "Sport Supplements");
        Assert.assertEquals(qatarHomePage.getVitaminsAndHealthOption().getText(), "Vitamins & Health");
        Assert.assertEquals(qatarHomePage.getHealthyFoodOption().getText(), "Healthy Food");
        Assert.assertEquals(qatarHomePage.getSportsOption().getText(), "SPORTS");
        Assert.assertEquals(qatarHomePage.getWomenOnlyOption().getText(), "Women's Only");
    }
    @Test(description = "Make sure the HomePage under shop by category banners are displayed", priority = 10)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        for (int i=0; i<qatarHomePage.getHomePageUnderShopbyCategoryBanners().size();i++) {
            Assert.assertTrue(qatarHomePage.getHomePageUnderShopbyCategoryBanners().get(i).isDisplayed());
        }}
    @Test(description = "Make sure the Top Selling Stacks sections are displayed ",priority = 11)
    public void verifyTopSellingStacksSectionAreDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getTopSellingStacksHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTopSellingStacksSections().isDisplayed());
    }
    @Test(description = "Make sure the view all button appearing in the Top Selling Stacks section works correctly ",priority = 12)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnviewAllBtnInTopSellingStacksSection();
        Assert.assertEquals(webDriver.getCurrentUrl(),allProductsInTopSellingStacksSectionURL);
    }
    @Test(description = "Make sure the Top Sellers sections are displayed ",priority = 13)
    public void verifyTopSellersSectionAreDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getTopSellerHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTopSellerSections().isDisplayed());
    }
    @Test(description = "Make sure that all links appear correctly in the Top Sellers section ",priority = 14)
    public void verifyAllLinksInTopSellersSectionAreDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getAllLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getSportSupplementsLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getHealthyFoodLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getSportswearAndAccessoriesLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the all link that appear in the Top Seller Section ",priority = 15)
    public void verifyAbilityToClickOnTheAllLinkInTopSellersSection(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnAllLinkInTopSellerSection();
        Assert.assertTrue(qatarHomePage.getAllLActiveink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the Top Seller Section ",priority = 16)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInTopSellersSection(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportSupplementsLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getSpportSupplementsActiveLink(),10);
        Assert.assertTrue(qatarHomePage.getSpportSupplementsActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Heathy Food link that appear in the Top Seller Section ",priority = 17)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInTopSellersSection(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnHealthyFoodLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getHealthyFoodActiveLink(),10);
        Assert.assertTrue(qatarHomePage.getHealthyFoodActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the Top Seller Section ",priority = 18)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInTopSellersSection(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnVitaminsAndHealthLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getVitaminsAndHealthActiveLink(),10);
        Assert.assertTrue(qatarHomePage.getVitaminsAndHealthActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the Top Seller Section ",priority = 19)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInTopSellersSection(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportswearAndAccessoriesLinkInTopSellerSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getSportswearAndAccessoriesActiveLink(),10);
        Assert.assertTrue(qatarHomePage.getSportswearAndAccessoriesActiveLink().isDisplayed());
    }
    @Test(description = "Make sure that previous button will Appers in the Top Seller Section when clicking on the next button ",priority = 20)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTopSellerSectionInTopSellerSection();
        Assert.assertTrue(qatarHomePage.getPreviousButtonInTopSellerSection().isDisplayed());
    }
    @Test(description = "Make sure the next button appearing in the Top Seller section works Correctly ",priority = 21)
    public void verifyNextBtnInTopSellerSectionWorks(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTopSellersSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTopSellerSectionpositionAfterClickingOnNext().isDisplayed() );
    }
    @Test(description = "Make sure the previous button appearing in the Top Seller section works Correctly ",priority = 22)
    public void verifyPreviousBtnInTopSellerSectionWorks(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTopSellersSection();
        qatarHomePage.clickOnPreviousButtonInTopSellersSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTopSellerSectionpositionAfterClickingOnPrevious().isDisplayed() );
    }
    @Test(description = "Make sure the Trending On Sporter sections are displayed ",priority = 23)
    public void verifyTrendingOnSporterSectionAreDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSection().isDisplayed());
    }
    @Test(description = "Make sure the next button appearing in the Trending On Sporter section works Correctly ",priority = 24)
    public void verifyNextBtnInTrendingOnSporterSectionWorks(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTrendingOnSporterSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSectionpositionAfterClickingOnNext().isDisplayed() );
    }
    @Test(description = "Make sure the previous button appearing in the Trending On Sporter section works Correctly ",priority = 25)
    public void verifyPreviousBtnInTrendingOnSporterSectionWorks(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInTrendingOnSporterSection();
        qatarHomePage.clickOnPreviousButtonInTrendingOnSporterSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getTrendingOnSporterSectionpositionAfterClickingOnPrevious().isDisplayed() );
    }
    @Test(description = "Make sure the New Arrivals sections are displayed ",priority = 26)
    public void verifyNewArrivalsSectionAreDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getNewArrivalsHeader().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSection().isDisplayed());
    }
    @Test(description = "Make sure that all links appear correctly in the New Arrivals section ",priority = 27)
    public void verifyAllLinksInNewArrivalsSectionAreDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getNewArrivalsAllLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSpportSupplementsLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsHealthyFoodLinkLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsVitaminsAndHealthLink().isDisplayed());
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportwearAndAccessoriesLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the all link that appear in the New Arrivals Section ",priority = 28)
    public void verifyAbilityToClickOnTheAllLinkInNewArrivalsSection(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnAllLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsAllActiveLink(),10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsAllActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Sport Supplements link that appear in the New Arrivals Section ",priority = 29)
    public void verifyAbilityToClickOnTheSportSupplementsLinkInNewArrivalsSection(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportSupplementsLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsSpportSupplementsActiveLink(),10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSpportSupplementsActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Heathy Food link that appear in the New Arrivals Section ",priority = 30)
    public void verifyAbilityToClickOnTheHealthyFoodLinkInNewArrivalsSection(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnHealthyFoodLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsHealthyFoodActiveLink(),10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsHealthyFoodActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Vitamins And Health link that appear in the New Arrivals Section ",priority =31)
    public void verifyAbilityToClickOnTheVitaminsAndHealthLinkInNewArrivalsSection(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnVitaminsAndHealthLinkInNewArrivalsSection();
        Assert.assertTrue(qatarHomePage.getNewArrivalVitaminsAndHealthActiveLink().isDisplayed());
    }
    @Test(description = "Make sure ability to click on the Sportswear And Accessories link that appear in the New Arrivals Section ",priority = 32)
    public void verifyAbilityToClickOnTheSportswearAndAccessoriesLinkInNewArrivalsSection(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnSportswearAndAccessoriesLinkInNewArrivalsSection();
        DataHelperAndWait.waitToBeVisible(qatarHomePage.getNewArrivalsSportwearAndAccessoriesActiveLink(),10);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSportwearAndAccessoriesActiveLink().isDisplayed());
    }
    @Test(description = "Make sure that previous button will appear in the New Arrivals Section when clicking on the next button ",priority = 33)
    public void verifyPreviousBtnWillAppearInNewArrivalsSectionOnceClickingOnNextBtn(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        Assert.assertTrue(qatarHomePage.getPreviousBtnInNewArrivalsSection().isDisplayed());
    }
    @Test(description = "Make sure the next button appearing in the New Arrivals section works Correctly ",priority = 34)
    public void verifyNextBtnInNewArrivalsSectionWorks(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSectionPositionAfterClickingOnNext().isDisplayed() );
    }
    @Test(description = "Make sure the previous button appearing in the New Arrivals section works Correctly ",priority = 35)
    public void verifyPreviousBtnInNewArrivalsSectionWorks(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnNextButtonInNewArrivalSection();
        qatarHomePage.clickOnPreviousButtonInNewArrivalSection();
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(qatarHomePage.getNewArrivalsSectionPositionAfterClickingOnPrevious().isDisplayed() );
    }
    @Test(description = "Make sure the Got A Question section is displayed ",priority = 36)
    public void verifyGotQuestionSectionIsDisplayed(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertTrue(qatarHomePage.getQuestionBlock().isDisplayed());
        Assert.assertTrue(qatarHomePage.getPhoneBtn().isDisplayed());
        Assert.assertTrue(qatarHomePage.getEmailBtn().isDisplayed());
    }
    @Test(description = "Make sure the Ability to click on email button that appears in the Got A Question section correctly ",priority = 37)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnEmailBtn();
        Assert.assertEquals(webDriver.getCurrentUrl(),contactUsUrl);
    }
    @Test(description = "Make sure the Ability to click on phone button that appears in the Got A Question section correctly ",priority = 38)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly(){
        qatarHomePage= new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        qatarHomePage.clickOnPhoneBtn();
        // store window handles in Set
        String currentwindow = webDriver.getWindowHandle();
        webDriver.switchTo().window(currentwindow);
    }
}