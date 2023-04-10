/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.sports_category_test_cases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.Test;
import sporter_pages.footerSections.FooterSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.sportsSupplementsCategoryPages.SportsSupplementsCategoryPage;
import sporter_pages.sports_category_pages.SportsCategoryPage;
import sporter_pages.womens_only_category_pages.WomensOnlyCategoryPage;

import java.io.IOException;
@Test(groups = "2.17 Sports Category")

public class SportsCategoryTestCases extends BaseTest {
    String storeCountry;
    String countryCode;

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Sports Category Appears In MegaMenu Redirect User To CorrectURL", priority = 1)
    public void verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.clickOnSportsMainMenu();
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(sportsCategoryPage.sportUrl, webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Sports Category from ShopBy Menu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnSportsCategoryFromShopByMenuRedirectUserToCorrectURL() throws IOException {
        SportsCategoryPage sportsCategoryPage=new SportsCategoryPage(webDriver);
        sportsCategoryPage.clickOnSportsFromShopByMenu();
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(sportsCategoryPage.sportsUrl, webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Sports Category from HomePage Redirect User To CorrectURL", priority = 3)
    public void verifyClickingOnSportsCategoryFromHomePageRedirectUserToCorrectURL() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(homePage.getSportsSupplementsCategory(), webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Sports Category- Make sure  the Sports footer appears correctly  ", priority = 4)
    public void verifySportsCategoryFooterSectionAppearsCorrectly() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        SportsCategoryPage sportsCategoryPage= new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getMainFooter(), webDriver);
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Sports Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 5)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSportsCategoryCategoryPage() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        SportsCategoryPage sportsCategoryPage= new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        for (int i = 0; i < footerSection.getPageBottomBlocksList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getPageBottomBlocksList().get(i), webDriver);
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Sports Category- Make sure the pagination control appears on the Sports rotating slider is displayed", priority = 6)
    public void verifyPaginationControlOnSportsRotatingSliderIsDisplayed() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage= new WomensOnlyCategoryPage(webDriver);
        SportsCategoryPage sportsCategoryPage= new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getRotatingSliderPagingControl(), webDriver);
        for (int i = 0; i < womensOnlyCategoryPage.getRotatingSliderPagingControlList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getRotatingSliderPagingControlList().get(i), webDriver);
        }
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the banners inside the rotating slider section works correctly", priority = 7)
    public void verifyClickingOnTheBannersInsideTheSportsRotatingSliderWillRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        SportsCategoryPage sportsCategoryPage= new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        for (int i = 0; i < womensOnlyCategoryPage.getRotatingSliderPagingControlList().size(); i++) {
            DataHelperAndWait.scrollToPositionZero(webDriver);
            DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getRotatingSliderPagingControlList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getBannerInRotatingSliderSection(), webDriver);
            womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
            womensOnlyCategoryPage.navigateToWomenOnlyPage();
        }
    }
    @Test(groups = {"1.1 Critical Severity"}, description = "{{CountryName}}:Sports Category- Make sure the Sports side Banners is displayed ", priority = 8)
    public void verifySportsSideBannerIsDisplayed() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        SportsCategoryPage sportsCategoryPage= new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getFirstSideBanner(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getSecondSideBanner(), webDriver);
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the first side banner works correctly", priority = 9)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheSportsCategoryPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        SportsCategoryPage sportsCategoryPage= new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getFirstSideBanner(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Second side banner works correctly", priority = 10)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheSportsCategoryPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        SportsCategoryPage sportsCategoryPage= new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getSecondSideBanner(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure the Trending in Sports section is displayed correctly", priority = 11)
    public void verifyTrendingOnSportsSectionAppearsCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsCategoryPage.getTrendingInSportsSectionTitle(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(sportsCategoryPage.getTrendingInSportsSection(), webDriver);
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Mens Apparel works correctly", priority = 12)
    public void verifyClickingOnMensApparelCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.clickOnElement(sportsCategoryPage.getMensApparelCategory(),webDriver);
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Women's Apparel works correctly", priority = 13)
    public void verifyClickingOnWomensApparelCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.clickOnElement(sportsCategoryPage.getWomenApparelCategory(),webDriver);
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Shakers & Bottles category works correctly", priority = 14)
    public void verifyClickingOnShakersAndBottlesCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.clickOnElement(sportsCategoryPage.getShakersAndBottelsCategory(),webDriver);
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Swimming category works correctly", priority = 15)
    public void verifyClickingOnSwimmingCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.clickOnElement(sportsCategoryPage.getSwimmingCategory(),webDriver);
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Boxing & MMA category works correctly", priority = 16)
    public void verifyClickingOnBoxingAndMMACategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.clickOnElement(sportsCategoryPage.getBoxingAndMMACategory(),webDriver);
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Caps And Hats category works correctly", priority = 17)
    public void verifyClickingOnCapsAndHatsCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        sportsCategoryPage.clickOnCapsAndHatsCategory();
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Bags And Backpacks category works correctly", priority = 18)
    public void verifyClickingOnBagsAndBackpacksCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        sportsCategoryPage.clickOnBagsAndBackpacksCategory();
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Sports Tech category works correctly", priority = 19)
    public void verifyClickingOnSportsTechCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        sportsCategoryPage.clickOnSportsTechCategory();
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Mens Personal Care category works correctly", priority = 20)
    public void verifyClickingOnMensPersonalCareCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        sportsCategoryPage.clickOnMensPersonalCareCategory();
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Sports category works correctly", priority = 21)
    public void verifyClickingOnSportsCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.clickOnElement(sportsCategoryPage.getSportsCategory(),webDriver);
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
      @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Men category works correctly", priority = 22)
    public void verifyClickingOnMenCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.clickOnElement(sportsCategoryPage.getMenCategory(),webDriver);
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
         @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Women category works correctly", priority = 23)
    public void verifyClickingOnWomenCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.clickOnElement(sportsCategoryPage.getWomenCategory(),webDriver);
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
            @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Kids category works correctly", priority = 24)
    public void verifyClickingOnKidsCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.clickOnElement(sportsCategoryPage.getKidsCategory(),webDriver);
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
              @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure clicking on the Sports Tech Main category works correctly", priority = 25)
    public void verifyClickingOnSportsTechMainCategoryWorksCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        DataHelperAndWait.clickOnElement(sportsCategoryPage.getSportsTechMainCategory(),webDriver);
        sportsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Sports Category- Make sure the Recommended Products section is displayed correctly", priority = 26)
    public void verifyRecommendedProductsSectionAppearsCorrectly() throws IOException {
        SportsCategoryPage sportsCategoryPage = new SportsCategoryPage(webDriver);
        sportsCategoryPage.navigateToSportsPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsCategoryPage.getRecommendedProductsTitleSection(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(sportsCategoryPage.getRecommendedProductsSection(), webDriver);
    }
}
