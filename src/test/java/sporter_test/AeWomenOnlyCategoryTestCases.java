package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sporter_pages.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class AeWomenOnlyCategoryTestCases extends BaseTest {
    private AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage;
    private AEMegaMenuTestCases aeMegaMenuTestCases;
    private AeProductDetailsPage aeProductDetailsPage;
    private AEFooterPageTestCases aeFooterPageTestCases;
    private KsaHomePage ksaHomePage;
    private AEFooterPage aeFooterPage;
    private AeSportsCategoryPage aeSportsCategoryPage;
    private AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage;
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;


    @Test(description = "Make sure clicking on the Women's Only Category Appears In MegaMenu Redirect User To CorrectURL", priority = 1)
    public void verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyClickingOnWomensOnlyMainMenuRedirectUserToCorrectURL();
    }
    @Test(description = "Make sure clicking on the Women's Only Category from ShopBy Menu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnWomenOnlyCategoryFromShopByMenuRedirectUserToCorrectURL() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyClickingOnWomanOnlyOptionInsideShopByMenuRedirectUserToCorrectURL();
    }
    @Test(description = "Make sure the Footer section appears correctly in the Women's Only category page", priority = 3)
    public void verifyFooterSectionAppearsCorrectlyInWomenOnlyCategoryPage() {
        aeFooterPage = new AEFooterPage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Women's Only category page", priority = 4)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWomenOnlyCategoryPage() {
        aeFooterPageTestCases = new AEFooterPageTestCases();
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Women's Only Category Page ", priority = 5)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInWomenOnlyCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure the rotating slider section is displayed in Women's Only Category page correctly ", priority = 6)
    public void verifyRotatingSliderIsDisplayedInTheWomenOnlyCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSlider().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderList().get(i).isDisplayed());
        }
    }
    //There's a bug here due to the next arrow icon is missing
    @Test(description = "Make sure the next arrow of the rotating slider section is displayed in the Women's Only Category Page", priority = 7)
    public void verifyNextArrowOfRotatingSliderIsDisplayedInTheWomenOnlyCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
    }
    //There's a bug here due to the previous arrow icon is missing
    @Test(description = "Make sure the previous arrow of the rotating slider section is displayed in the Women's Only Category Page ", priority = 8)
    public void verifyPreviousArrowOfRotatingSliderIsDisplayedInTheWomenOnlyCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }
    @Test(description = "Make sure the pagination control of rotating slider section is displayed in Women's Only Category Page", priority = 9)
    public void verifyPaginationControlOfRotatingSliderSectionIsDisplayedInTheWomenOnlyCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingList().get(i).isDisplayed());
        }
    }
    @Test(description = "Make sure the side Banners is displayed in the Women's Only Category Page ", priority = 10)
    public void verifySideBannersIsDisplayedInTheWomenOnlyCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getHomePageSideBanner().isDisplayed());
    }
    @Test(description = "Make sure the pagination control of rotating slider section works correctly in Women's Only Category Page", priority = 11)
    public void verifyPaginationControlOfRotatingSliderSectionWorksCorrectlyInTheWomenOnlyCategoryPage() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().size(); i++) {
            aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).click();
            Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).getAttribute("class"),"flex-active");
        }
    }
    @Test(description = "Make sure the clicking on the banners appear in rotating slider section works correctly in Women's Only Category Page", priority = 12)
    public void verifyClickingOnTheBannersAppearingInRotatingSliderSectionWorksCorrectlyInTheWomenOnlyCategoryPage() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().size(); i++) {
            aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).click();
            aeVitaminsAndHealthCategoryPage.getBannerInRotatingSliderSection().click();
            boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
            assertFalse(verifyTitle, "Page Not Found Is Displayed");
            boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
            assertFalse(isTheElementPresent, "The page is empty");
            webDriver.navigate().to(siteURL+aeMegaMenuTestCases.womenOnlyUrl);
        }
    }
    @Test(description = "Make sure the clicking on the first side banner works correctly in Women's Only Category Page", priority = 13)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheWomenOnlyCategoryPage() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedBannerUrl=aeVitaminsAndHealthCategoryPage.getFirstSideBanner().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getFirstSideBanner().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedBannerUrl.substring(0,expectedBannerUrl.length()-1));
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedBannerUrl.substring(0,expectedBannerUrl.length()-1)));
    }
    @Test(description = "Make sure clicking on the second side banner works correctly in  Women's Only Category Page", priority = 14)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheWomenOnlyCategoryPage() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedBannerUrl=aeVitaminsAndHealthCategoryPage.getSecondSideBanner().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getSecondSideBanner().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedBannerUrl.replace(siteURL,siteURL+aeDomain)));
    }
    //Shop By Category Test Cases
    @Test(description = "Make sure the Shop By Category section is displayed ", priority = 15)
    public void verifyShopByCategoryInTheWomenOnlyCategoryPageIsDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getShopByCategorySections().isDisplayed());    }
    //Supplements For Her Category page Test Cases
    @Test(description = "Make sure clicking on the Supplements For Her category inside Shop By Category section works correctly ", priority = 16)
    public void verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(0).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(0).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl.replace(siteURL,siteURL+aeDomain)));
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Supplements For Her category page ", priority = 17)
    public void verifyResultFieldAndItsVaLueAppearInTheSupplementsForHerCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here due to some filtration is missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Supplements For Her category page ", priority = 18)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSupplementsForHerCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Newly added items");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Supplements For Her Category Page ", priority = 19)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForSupplementsForHerCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Supplements For Her category page  ", priority = 20)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSupplementsForHerCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Supplements For Her Category Page ", priority = 21)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSupplementsForHerCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Supplements For Her Category page ", priority = 22)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInSupplementsForHerCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Supplements For Her, Categories", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Verify that the search button works correctly from the Supplements For Her category page", priority = 23)
    public void verifySearchBtnWorksCorrectlyFromSupplementsForHerCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Supplements For Her category page is disable when the current page is page 1 ", priority = 24)
    public void verifyThePreviousBtnInSupplementsForHerCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    //There's a performance issue in the Navigation
    @Test(description = "Make Sure the Pagination control in the Supplements For Her category page works correctly", priority = 25)
    public void verifyThePaginationControlInSupplementsForHerCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Thread.sleep(4000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(4000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make Sure the previous page button In Supplements For Her Category Page works correctly", priority = 26)
    public void verifyPreviousPageBtnInSupplementsForHerCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInSupplementsForHerCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the next page button In Supplements For Her Category Page works correctly", priority = 27)
    public void verifyNextPageBtnInSupplementsForHerCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInSupplementsForHerCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Supplements For Her category page", priority = 28)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSupplementsForHerCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();}
    @Test(description = "Make sure the Filtration Section is displayed in the Supplements For Her category page", priority = 29)
    public void verifyFiltrationSectionIsDisplayedInSupplementsForHerCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Women's Daily Vitamins Category page Test Cases
    @Test(description = "Make sure clicking on the Women's Daily Vitamins category inside Shop By Category section works correctly ", priority = 30)
    public void verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(1).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(1).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl.replace(siteURL,siteURL+aeDomain)));
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Women's Daily Vitamins category page ", priority = 31)
    public void verifyResultFieldAndItsVaLueAppearInTheWomenDailyVitaminsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here due to some filtration is missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Women's Daily Vitamins category page ", priority = 32)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheWomenDailyVitaminsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Women's Daily Vitamins Category Page ", priority = 33)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForWomenDailyVitaminsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Women's Daily Vitamins category page  ", priority = 34)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInWomenDailyVitaminsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Women's Daily Vitamins Category Page ", priority = 35)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInWomenDailyVitaminsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Women's Daily Vitamins Category page ", priority = 36)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInWomenDailyVitaminsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Womens Daily Vitamins, Categories", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Verify that the search button works correctly from the Women's Daily Vitamins category page", priority = 37)
    public void verifySearchBtnWorksCorrectlyFromWomenDailyVitaminsCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Women's Daily Vitamins category page is disable when the current page is page 1 ", priority = 38)
    public void verifyThePreviousBtnInWomenDailyVitaminsCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    //There's a performance issue in the Navigation
    @Test(description = "Make Sure the Pagination control in the Women's Daily Vitamins category page works correctly", priority = 39)
    public void verifyThePaginationControlInWomenDailyVitaminsCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Thread.sleep(4000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(4000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make Sure the previous page button In Women's Daily Vitamins Category Page works correctly", priority = 40)
    public void verifyPreviousPageBtnInWomenDailyVitaminsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInWomenDailyVitaminsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the next page button In Women's Daily Vitamins Category Page works correctly", priority = 41)
    public void verifyNextPageBtnInWomenDailyVitaminsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInWomenDailyVitaminsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Women's Daily Vitamins category page", priority = 42)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWomenDailyVitaminsCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();}
    @Test(description = "Make sure the Filtration Section is displayed in the Women's Daily Vitamins category page", priority = 43)
    public void verifyFiltrationSectionIsDisplayedInWomenDailyVitaminsCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Lady-Friendly Snacks & Food Category page Test Cases
    @Test(description = "Make sure clicking on the Lady-Friendly Snacks & Food inside Shop By Category section works correctly ", priority = 44)
    public void verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(2).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(2).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl.replace(siteURL,siteURL+aeDomain)));
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Lady-Friendly Snacks & Food category page ", priority = 45)
    public void verifyResultFieldAndItsVaLueAppearInTheLadyFriendlySnacksAndFoodCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here due to some filtration is missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Lady-Friendly Snacks & Food category page ", priority = 46)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheLadyFriendlySnacksAndFoodCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Lady-Friendly Snacks & Food Category Page ", priority = 47)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForLadyFriendlySnacksAndFoodCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Lady-Friendly Snacks & Food category page  ", priority = 48)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInLadyFriendlySnacksAndFoodCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Lady-Friendly Snacks & Food Category Page ", priority = 49)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInLadyFriendlySnacksAndFoodCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Lady-Friendly Snacks & Food Category page ", priority = 50)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInLadyFriendlySnacksAndFoodCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Lady-friendly Snacks & Food, Categories", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Verify that the search button works correctly from the Lady-Friendly Snacks & Food category page", priority = 51)
    public void verifySearchBtnWorksCorrectlyFromLadyFriendlySnacksAndFoodCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Lady-Friendly Snacks & Food category page is disable when the current page is page 1 ", priority = 52)
    public void verifyThePreviousBtnInLadyFriendlySnacksAndFoodCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    //There's a performance issue in the Navigation
    @Test(description = "Make Sure the Pagination control in the Lady-Friendly Snacks & Food category page works correctly", priority = 53)
    public void verifyThePaginationControlInLadyFriendlySnacksAndFoodCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Thread.sleep(4000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(4000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make Sure the previous page button In Lady-Friendly Snacks & Food Category Page works correctly", priority = 54)
    public void verifyPreviousPageBtnInLadyFriendlySnacksAndFoodCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInLadyFriendlySnacksAndFoodCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the next page button In Lady-Friendly Snacks & Food Category Page works correctly", priority = 55)
    public void verifyNextPageBtnInLadyFriendlySnacksAndFoodCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInLadyFriendlySnacksAndFoodCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Lady-Friendly Snacks & Food category page", priority = 56)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInLadyFriendlySnacksAndFoodCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();}
    @Test(description = "Make sure the Filtration Section is displayed in the Lady-Friendly Snacks & Food category page", priority = 57)
    public void verifyFiltrationSectionIsDisplayedInLadyFriendlySnacksAndFoodCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Makeup for Active Lifestyles Category page Test Cases
    @Test(description = "Make sure clicking on the Makeup for Active Lifestyles inside Shop By Category section works correctly ", priority = 58)
    public void verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(3).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(3).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl.replace(siteURL,siteURL+aeDomain)));
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Makeup for Active Lifestyles category page ", priority = 59)
    public void verifyResultFieldAndItsVaLueAppearInTheMakeupForActiveLifestylesCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here due to some filtration is missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Makeup for Active Lifestyles category page ", priority = 60)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMakeupForActiveLifestylesCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Makeup for Active Lifestyles Category Page ", priority = 61)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForMakeupForActiveLifestylesCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Makeup for Active Lifestyles category page  ", priority = 62)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMakeupForActiveLifestylesCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Makeup for Active Lifestyles Category Page ", priority = 63)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMakeupForActiveLifestylesCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description section is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Makeup for Active Lifestyles Category page ", priority = 64)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInMakeupForActiveLifestylesCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Makeup & Beauty, Categories", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Verify that the search button works correctly from the Makeup for Active Lifestyles category page", priority = 65)
    public void verifySearchBtnWorksCorrectlyFromMakeupForActiveLifestylesCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Makeup for Active Lifestyles category page is disable when the current page is page 1 ", priority = 66)
    public void verifyThePreviousBtnInMakeupForActiveLifestylesCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    //There's a performance issue in the Navigation
    @Test(description = "Make Sure the Pagination control in the Makeup for Active Lifestyles category page works correctly", priority = 67)
    public void verifyThePaginationControlInMakeupForActiveLifestylesCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Thread.sleep(4000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(4000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make Sure the previous page button In Makeup for Active Lifestyles Category Page works correctly", priority = 68)
    public void verifyPreviousPageBtnInMakeupForActiveLifestylesCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInMakeupForActiveLifestylesCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the next page button In Makeup for Active Lifestyles Category Page works correctly", priority = 69)
    public void verifyNextPageBtnInMakeupForActiveLifestylesCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInMakeupForActiveLifestylesCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Makeup for Active Lifestyles category page", priority = 70)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMakeupForActiveLifestylesCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();}
    @Test(description = "Make sure the Filtration Section is displayed in the Makeup for Active Lifestyles category page", priority = 71)
    public void verifyFiltrationSectionIsDisplayedInMakeupForActiveLifestylesCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Shop By Goal Section Test Cases






}
