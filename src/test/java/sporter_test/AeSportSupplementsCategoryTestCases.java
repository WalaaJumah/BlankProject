package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sporter_pages.AEGuestUserPage;
import sporter_pages.AEMegaMenuPage;
import sporter_pages.AeProductDetailsPage;
import sporter_pages.AeSportSupplementsCategoryPage;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertFalse;

public class AeSportSupplementsCategoryTestCases extends BaseTest {
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    private AEMegaMenuTestCases aeMegaMenuTestCases;
    private AeProductDetailsPage aeProductDetailsPage;
    private AEFooterPageTestCases aeFooterPageTestCases;
    private AEGuestUserPage aeGuestUserPage;
    private AEMegaMenuPage aeMegamenuPage;
    private Actions action;
    private final String  sportSupplementsUrl="/sport-supplements/";

@Test(description = "Switching to UAE store", priority = 1)
public void switchToUaeStore(){
    aeMegamenuPage = new AEMegaMenuPage(webDriver);
    aeMegamenuPage.switchToAECountry();
}
    @Test(description = "Make sure clicking on the Sports Supplements Category Appears In MegaMenu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL() {
//        aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sports Supplements Category from ShopBy Menu Redirect User To CorrectURL", priority = 3)
    public void verifyClickingOnSportsSupplementsCategoryFromShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        webDriver.navigate().to(siteURL);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        String expectedUrl=aeMegamenuPage.getSportsSupplementsOption().getAttribute("href");
        aeMegamenuPage.getSportsSupplementsOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportSupplementsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sports Supplements Category from HomePage Redirect User To CorrectURL", priority = 4)
    public void verifyClickingOnSportsSupplementsCategoryFromHomePageRedirectUserToCorrectURL() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        webDriver.navigate().to(siteURL);
        DataHelperAndWait.waitToBeClickable(aeSportSupplementsCategoryPage.getSportSupplementsCategoryInHomePage(), 5);
        aeSportSupplementsCategoryPage.getSportSupplementsCategoryInHomePage().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeMegaMenuTestCases.sportSupplementsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure the Horizontal Category Image appears correctly in the sport Supplements landing page ", priority = 5)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSportSupplementsLandingPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the sport Supplements landing page ", priority = 6)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInSportSupplementsLandingPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Sport Supplements", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }

    @Test(description = "Make sure the Horizontal Banners appear correctly in the sport Supplements landing page ", priority = 7)
    public void verifyTheHorizontalBannersAppearCorrectlyInSportSupplementsLandingPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        DataHelperAndWait.implicitWait(5);
        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).isDisplayed());
        }
    }

    @Test(description = "Make sure clicking on the Horizontal Banners appearing in the sport Supplements landing page opens correctly ", priority = 8)
    public void verifyClickingOnHorizontalBannersAppearingInSportSupplementsLandingPageOpensCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        DataHelperAndWait.implicitWait(5);
        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
            aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).click();
            boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
            assertFalse(verifyTitle, "Page Not Found Is Displayed");
            boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
            assertFalse(isTheElementPresent, "The page is empty");
            webDriver.navigate().back();
        }
    }

    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the sport Supplements landing page ", priority = 9)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }

    @Test(description = "Make sure that the Result label and its value appear correctly in the sport Supplements Category page ", priority = 10)
    public void verifyResultFieldAndItsVaLueAppearInTheSportSupplementsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    @Test(description = "Make sure that Sort By menu and its options appear correctly ", priority = 11)
    public void verifySortByMenuAndItsOptionsAppearCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
        }
    }

    @Test(description = "Make sure that the Featured option is selected by default in the Sort By menu ", priority = 12)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenu() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
    }

    //There's a bug here when sorting the products then the Horizontal Banners are hidden
    @Test(description = "Make sure each of the Sport Supplements category image and Horizontal Banners appearing after sorting the products  ", priority = 13)
    public void verifySportSupplementsCategoryImageAndHorizontalBannersAppearingAfterSortingTheProducts() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Min-Max");
        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsSection().isDisplayed(),"The Horizontal Banners is missing after sorting the products ");
    }
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Featured  ", priority = 14)
    public void verifySortByMenuAppearingAfterSortingByBestSelling() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Featured");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }

    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Price Min-Max  ", priority = 15)
    public void verifySortByMenuAppearingAfterSortingByPriceMinMax() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Min-Max");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }

    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Price Max-Min  ", priority = 16)
    public void verifySortByMenuAppearingAfterSortingByPriceMaxMin() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Max-Min");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }

    @Test(description = "Make sure  the Sport Supplements footer appears correctly  ", priority = 17)
    public void verifySportSupplementsFooterSectionAppearsCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsFooterSection().isDisplayed());
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsFooterSection().getCssValue("background"), "rgb(242, 242, 242) none repeat scroll 0% 0% / auto padding-box border-box");
    }

    @Test(description = "Make sure the text appears in the Sport Supplements footer appears correctly  ", priority = 18)
    public void verifyTheTextAppearInTheSportSupplementsFooterSectionAppearsCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInFooterSection().getText(), "Sport Supplements");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsDescriptionInFooterSection().isDisplayed());
    }

    @Test(description = "Verify that the search button works correctly from the Sport Supplements category page", priority = 19)
    public void verifySearchBtnWorksCorrectlyFromSportSupplementsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Verify that the previous page button is disable when the current page is page 1 ", priority = 20)
    public void verifyThePreviousBtnIsDisableWhenDisplayPage1() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    @Test(description = "Make Sure the Pagination control works correctly", priority = 21)
    public void verifyThePaginationControlWorksCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }

    @Test(description = "Make Sure the previous page button works correctly", priority = 22)
    public void verifyPreviousPageBtnWorksCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
  }

    @Test(description = "Make Sure the next page button works correctly", priority = 23)
    public void verifyNextPageBtnWorksCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=3",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }

    @Test(description = "Make Sure All Search Fields Inside Form Filtration Section Appears Correctly", priority = 24)
    public void verifyAllSearchFieldsInsideFormFiltrationSectionAppearsCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        aeSportSupplementsCategoryPage.clickOnSeeAllBtnInFormSection();
//        ArrayList<String> expectedFiltration = new ArrayList<>() {{
//            add("Liquid Capsules");
//            add("Bars");
//            add("Caplets");
//            add("Capsules");
//            add("Cream");
//            add("Effervescent");
//            add("Gel");
//            add("Granulated");
//            add("Gummies");
//            add("Liquid");
//            add("Powders");
//            add("Sachet");
//            add("Softgel");
//            add("Tablets");
//            add("Pods");
//        }};
//        for (int i = 0; i < aeSportSupplementsCategoryPage.getFormFiltrationSection().size(); i++) {
//            Assert.assertEquals(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i).getText(), expectedFiltration.get(i));
//        }
        for (int i = 0; i < aeSportSupplementsCategoryPage.getFormFiltrationSection().size(); i++){
            DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i),2);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i).isDisplayed());}
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Sport Supplements category page", priority = 25)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSportSupplementsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //Pagination control for all pages in the Sport Supplements Category Pages
    @Test(description = "Make Sure the ability to access all pages inside Sport Supplements Category Page  ", priority = 26)
    public void verifyAbilityToAccessAllPagesInsideSportSupplementsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
    //There's a bug here due to the BreadCrumb is missing after sorting the products
    @Test(description = "Make sure that the BreadCrumb correctly after sorting the product ", priority = 27)
    public void verifyTheBreadCrumbAppearingCorrectlyAfterSortingTheProducts() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByIndex(1);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getHomeBreadcrumbs(),2);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getHomeBreadcrumbs().isDisplayed());
    }
    @Test(description = "Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 28)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        webDriver.navigate().to(siteURL+aeDomain+sportSupplementsUrl);
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL," The Current URL is not matched with the Cart URL" );
    }
}