/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptHomePageTestCases
 */

package sporter_test.homepage_test_cases;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.ToString;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.homepage_classes.QatarHomePage;
@Test(groups = "Egypt HomePage")
public class EgyptHomePageTestCases extends BaseTest {


    @Test(groups = { "All Smoke Testing Result"},description = " Qatar HomePage- Switching to Egypt store", priority = 1)
    public void switchToEgyptStore(){
//        EgyptHomePage egyptHomePage=new EgyptHomePage(webDriver);
//        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
//        if(webDriver.getCurrentUrl().contains(egyptHomePage.qatarDomain)){
//            System.out.println("You are in Qatar Store");
//        }
//        else {
//            webDriver.navigate().to(BasePage.BaseURL+egyptHomePage.saudiDomain);
//            CloseInitialDialog();          }
        webDriver.navigate().to("https://dev.sporter.com/en-eg");
    }
@Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure the Banners appear correctly in the HomePage rotating slider section ", priority = 2)
public void verifyHomePageRotatingSliderIsDisplayed() {
    HomePage homePage = new HomePage(webDriver);
    for (int i = 0; i < homePage.getHomePageRotatingSliderList().size(); i++) {
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderList().get(i), webDriver);
    }
}

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the next button at the HomePage rotating slider section is displayed ", priority = 3)
    public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getNextArrowInHomePageRotatingSlider(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the previous button at the HomePage rotating slider section is displayed ", priority = 4)
    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getPreviousArrowInHomePageRotatingSlider(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 5)
    public void verifyPaginationControlOnHomePageRotatingSliderIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderPagingControl(), webDriver);
        for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
        }
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure clicking on the banners inside the rotating slider section works correctly", priority = 6)
    public void verifyClickingOnTheBannersInsideTheHomePageRotatingSliderWillRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        for (int i = 0; i < homePage.getHomePageRotatingSliderPagingList().size(); i++) {
            DataHelperAndWait.clickOnElement(homePage.getHomePageRotatingSliderPagingList().get(i), webDriver);
            homePage.clickOnBannerInRotatingSliderSection();
            homePage.verifyTheDisplayedPageDoesNotHaveErrors();
            homePage.navigateToHomePage();
        }
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure the HomePage side Banners is displayed ", priority = 7)
    public void verifyHomePageSideBannerIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageSideBanner(), webDriver);
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure the HomePage Horizontal Banner is displayed ", priority = 8)
    public void verifyHomePageHorizontalBannerIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageHorizontalBanner(), webDriver);
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure clicking on the first side banner works correctly", priority = 9)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        HomePage homePage = new HomePage(webDriver);
        String expectedUrl = homePage.getFirstSideBanner().getAttribute("href");
        homePage.clickOnFirstSideBanner();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl), "Incorrect URL is displayed " + webDriver.getCurrentUrl());
        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure clicking on the second side banner works correctly", priority = 10)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        String expectedUrl = homePage.getSecondSideBanner().getAttribute("href");
        homePage.clickOnSecondSideBanner();
        //Check With Momen about the expected href
//        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure clicking on the HomePage Horizontal Banner works correctly", priority = 11)
    public void verifyClickingOnHomePageHorizontalBannerDoeNotRedirectTheUserTo404PageOrNoContentFoundPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getHomePageHorizontalBanner(), webDriver);
        String expectedUrl = homePage.getHomePageHorizontalBanner().getAttribute("href");
        homePage.clickOnHomePageHorizontalBanner();
//        WebElementsAssertion.validateTheCurrentUrlContainsString(expectedUrl, webDriver);
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "All Smoke Testing Result", "2. High Severity"}, description = "HomePage- Make sure the Shop By Category section is displayed ", priority = 12)
    public void verifyShopByCategoryIsDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getShopByCategoryHeader(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getShopByCategorySections(), webDriver);
    }

    @Test(groups = { "3. Medium Severity"}, description = "HomePage- Make sure the main options in the Mega Menu are retrieved correctly", priority = 13)
    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        WebElementsAssertion.assertionEquals(homePage.getShopByOption(), webDriver, "Shop By");
        WebElementsAssertion.assertionEquals(homePage.getSportSupplementsOption(), webDriver, "Sports Supplements");
        WebElementsAssertion.assertionEquals(homePage.getVitaminsAndHealthOption(), webDriver, "Vitamins & Health");
        WebElementsAssertion.assertionEquals(homePage.getHealthyFoodOption(), webDriver, "Healthy Food");
        WebElementsAssertion.assertionEquals(homePage.getSportsOption(), webDriver, "SPORTS");
        WebElementsAssertion.assertionEquals(homePage.getWomenOnlyOption(), webDriver, "Women's Only");
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the Sports Supplements category from the HomePage works correctly ", priority = 39)
    public void verifyClickingOnSportsSupplementsCategoryRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnSportsSupplementsCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the Healthy Food category from the HomePage works correctly ", priority = 40)
    public void verifyClickingOnHealthyFoodCategoryDoeNotRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnHealthyFoodCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the Vitamins And Health category from the HomePage works correctly ", priority = 41)
    public void verifyClickingOnVitaminsAndHealthCategoryDoeNotRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnVitaminsAndHealthCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = { "1. Critical Severity"}, description = "HomePage- Make sure clicking on the Sportswear & Accessories category from the HomePage works correctly ", priority = 42)
    public void verifyClickingOnSportswearAndAccessoriesCategoryDoeNotRedirectTheUserToCorrectPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        homePage.clickOnSportswearAndAccessoriesCategory();
        homePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

}
