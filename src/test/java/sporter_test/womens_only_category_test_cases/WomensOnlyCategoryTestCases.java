/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.womens_only_category_test_cases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.Test;
import sporter_pages.footerSections.FooterSection;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.megaMenuPages.MegaMenuPage;
import sporter_pages.sportsSupplementsCategoryPages.SportsSupplementsCategoryPage;
import sporter_pages.womens_only_category_pages.WomensOnlyCategoryPage;

import java.io.IOException;

@Test(groups = "2.15 Women's Only Category")


public class WomensOnlyCategoryTestCases extends BaseTest {
    String storeCountry;
    String countryCode;
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Women's Only Category Appears In MegaMenu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL() throws IOException {
        MegaMenuPage megaMenuPage= new MegaMenuPage(webDriver);
        megaMenuPage.clickOnWomensOnlyMainMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.womenOnlyUrl, webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Women's Only Category from ShopBy Menu Redirect User To CorrectURL", priority = 3)
    public void verifyClickingOnWomenOnlyCategoryFromShopByMenuRedirectUserToCorrectURL() throws IOException {
        MegaMenuPage megaMenuPage= new MegaMenuPage(webDriver);
        megaMenuPage.clickOnWomensOnlyFromShopByMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.womenOnlyUrl, webDriver);
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure that the BreadCrumb appears correctly after sorting the product ", priority = 17)
    public void verifyTheBreadCrumbAppearingCorrectlyAfterSortingTheProducts() {
       WomensOnlyCategoryPage womensOnlyCategoryPage= new WomensOnlyCategoryPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        HomePage homePage = new HomePage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getHomePageBreadCrumb(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportsSupplementsCategory(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 18)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage= new WomensOnlyCategoryPage(webDriver);
        HeaderSection headerSection = new HeaderSection(webDriver);
        HomePage homePage = new HomePage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure  the Women's Only footer appears correctly  ", priority = 11)
    public void verifyWomenOnlyFooterSectionAppearsCorrectly() {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        WomensOnlyCategoryPage womensOnlyCategoryPage= new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getMainFooter(), webDriver);
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 16)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWomenOnlyCategoryPage() {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        FooterSection footerSection = new FooterSection(webDriver);
        sportsSupplementsCategoryPage.navigateToSportsSupplementPage();
        for (int i = 0; i < footerSection.getPageBottomBlocksList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getPageBottomBlocksList().get(i), webDriver);
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure the pagination control appears on the Women's Only rotating slider is displayed", priority = 5)
    public void verifyPaginationControlOnWomenOnlyRotatingSliderIsDisplayed() {
        WomensOnlyCategoryPage womensOnlyCategoryPage= new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getRotatingSliderPagingControl(), webDriver);
        for (int i = 0; i < womensOnlyCategoryPage.getRotatingSliderPagingControlList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getRotatingSliderPagingControlList().get(i), webDriver);
        }
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the banners inside the rotating slider section works correctly", priority = 6)
    public void verifyClickingOnTheBannersInsideTheWomenOnlyRotatingRotatingSliderWillRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        for (int i = 0; i < womensOnlyCategoryPage.getRotatingSliderPagingControlList().size(); i++) {
            DataHelperAndWait.scrollToPositionZero(webDriver);
            DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getRotatingSliderPagingControlList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getBannerInRotatingSliderSection(), webDriver);
            womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
            womensOnlyCategoryPage.navigateToWomenOnlyPage();
        }
    }
    @Test(groups = {"1.1 Critical Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure the Women's Only side Banners is displayed ", priority = 7)
    public void verifyWomenOnlySideBannerIsDisplayed() {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getFirstSideBanner(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getSecondSideBanner(), webDriver);
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the first side banner works correctly", priority = 9)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheWomenOnlyCategoryPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getFirstSideBanner(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Second side banner works correctly", priority = 9)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheWomenOnlyCategoryPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getSecondSideBanner(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Supplements For Her Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheSupplementsForHerCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getSupplementForHerCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Women's Daily Vitamins Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheWomensDailyVitaminsCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getWomensDailyVitaminsCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Lady-Friendly Snacks & Food Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheLadyFriendlySnacksFoodCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getLadyFriendlySnacksAndFoodCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Makeup & Beauty Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheMakeupAndBeautyCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getMakeupForActiveLifeStyleCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Hair,Skin & Nails Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheHairSkinAndNailsCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getHairSkinAndNailsCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Weight Loss Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheWeightLossCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getWeightLossCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Mood Support Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheMoodSupportCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getMoodSupportCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Detox & cleanse Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheDetoxAndCleanseCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getDetoxAndCleanseCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the PMS Relief Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnThePMSReliefCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getPmsReliefCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Energy & Endurance Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheEnergyAndEnduranceCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getEnergyAndEnduranceCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Prenatal Care Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnThePrenatalCareCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getPrenatalCareCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Muscle And Weight Gain Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheMuscleAndWeightGainCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getMuscleAndWeightGainCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the Fashion And Style Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnTheFashionAndStyleCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getFashionAndStyleCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the PersonalCare Category redirect the user to the correct page", priority = 9)
    public void verifyClickingOnThePersonalCareCategoryRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getPersonalCareCategory(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }


}
