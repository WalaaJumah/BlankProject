//package sporter_test;
//
//import core.BaseTest;
//import core.DataHelperAndWait;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//import sporter_pages.*;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertFalse;
//
//public class AeSportsCategoryTestCases extends BaseTest {
//    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
//    private AEMegaMenuTestCases aeMegaMenuTestCases;
//    private AeProductDetailsPage aeProductDetailsPage;
//    private AEFooterPageTestCases aeFooterPageTestCases;
//    private KsaHomePage ksaHomePage;
//    private AEFooterPage aeFooterPage;
//    private AeSportsCategoryPage aeSportsCategoryPage;
//    private AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage;
//    private AEGuestUserPage aeGuestUserPage;
//
//    @Test(description = "Make sure clicking on the Sports Category Appears In MegaMenu Redirect User To CorrectURL", priority = 1)
//    public void verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL() {
//        aeMegaMenuTestCases = new AEMegaMenuTestCases();
//        aeMegaMenuTestCases.verifyClickingOnSportsMainMenuRedirectUserToCorrectURL();
//    }
//
//    @Test(description = "Make sure clicking on the Sports Category from ShopBy Menu Redirect User To CorrectURL", priority = 2)
//    public void verifyClickingOnSportsCategoryFromShopByMenuRedirectUserToCorrectURL() {
//        aeMegaMenuTestCases = new AEMegaMenuTestCases();
//        aeMegaMenuTestCases.verifyClickingOnSportsOptionInsideShopByMenuRedirectUserToCorrectURL();
//    }
//
//    @Test(description = "Make sure the Footer section appears correctly in the Sports category page", priority = 3)
//    public void verifyFooterSectionAppearsCorrectlyInSportsCategoryPage() {
//        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
//    }
//
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Sports category page", priority = 4)
//        public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSportsCategoryPage() {
//        aeFooterPageTestCases = new AEFooterPageTestCases();
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//
//    @Test(description = "Make sure the Got A Question blocks appears correctly in the Sports category page", priority = 5)
//    public void verifyGotAQuestionSectionAppearsCorrectlyInSportsCategoryPage() {
//        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(ksaHomePage.getQuestionBlock().isDisplayed());
//        Assert.assertTrue(ksaHomePage.getPhoneBtn().isDisplayed());
//        Assert.assertTrue(ksaHomePage.getEmailBtn().isDisplayed());
//    }
//
//    @Test(description = "Make sure the Ability to click on email button that appears in the Got A Question section from Sports Category Page ", priority = 6)
//    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionFromSportsCategoryPage() {
//        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        ksaHomePage.clickOnEmailBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("contacts-us"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Make sure the Ability to click on phone button that appears in the Got A Question section correctly from Sports Category Page ", priority = 7)
//    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionFromSportsCategoryPage() {
//        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        ksaHomePage.clickOnPhoneBtn();
//        // store window handles in Set
//        String myWindowHandle = webDriver.getWindowHandle();
//        webDriver.switchTo().window(myWindowHandle);
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Sports Category Page ", priority = 8)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInSportsCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure the rotating slider section is displayed in Sports Category page correctly ", priority = 9)
//    public void verifyRotatingSliderIsDisplayedInTheSportsCategoryPage() {
//        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(ksaHomePage.getHomePageRotatingSlider().isDisplayed());
//        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderList().size(); i++) {
//            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderList().get(i).isDisplayed());
//        }
//    }
//    @Test(description = "Make sure the next arrow of the rotating slider section is displayed in the Sports Category Page", priority = 10)
//    public void verifyNextArrowOfRotatingSliderIsDisplayedInTheSportsCategoryPage() {
//        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(ksaHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
//    }
//        @Test(description = "Make sure the previous arrow of the rotating slider section is displayed in the Sports Category Page ", priority = 11)
//    public void verifyPreviousArrowOfRotatingSliderIsDisplayedInTheSportsCategoryPage() {
//        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(ksaHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
//    }
//    @Test(description = "Make sure the pagination control of rotating slider section is displayed in Sports Category Page", priority = 12)
//    public void verifyPaginationControlOfRotatingSliderSectionIsDisplayedInTheSportsCategoryPage() {
//        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
//        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
//            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingList().get(i).isDisplayed());
//        }
//    }
//    @Test(description = "Make sure the side Banners is displayed in the Sports Category Page ", priority = 13)
//    public void verifySideBannersIsDisplayedInTheSportsCategoryPage() {
//        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(ksaHomePage.getHomePageSideBanner().isDisplayed());
//    }
//    @Test(description = "Make sure the pagination control of rotating slider section works correctly in Sports Category Page", priority = 14)
//    public void verifyPaginationControlOfRotatingSliderSectionWorksCorrectlyInTheSportsCategoryPage() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().size(); i++) {
//            aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).click();
//            Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).getAttribute("class"),"flex-active");
//        }
//    }
//    @Test(description = "Make sure the clicking on the banners appear in rotating slider section works correctly in Sports Category Page", priority = 15)
//    public void verifyClickingOnTheBannersAppearingInRotatingSliderSectionWorksCorrectlyInTheSportsCategoryPage() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().size(); i++) {
//            aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).click();
//            aeVitaminsAndHealthCategoryPage.getBannerInRotatingSliderSection().click();
//            boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//            assertFalse(verifyTitle, "Page Not Found Is Displayed");
//            boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//            assertFalse(isTheElementPresent, "The page is empty");
//            webDriver.navigate().to(siteURL+aeMegaMenuTestCases.sportsUrl);
//        }
//    }
//    @Test(description = "Make sure the clicking on the first side banner works correctly in Sports Category Page", priority = 16)
//    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheSportsCategoryPage() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedBannerUrl=aeVitaminsAndHealthCategoryPage.getFirstSideBanner().getAttribute("href");
//        aeVitaminsAndHealthCategoryPage.getFirstSideBanner().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
////        assertEquals(webDriver.getCurrentUrl(),expectedBannerUrl.substring(0,expectedBannerUrl.length()-1));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedBannerUrl.substring(0,expectedBannerUrl.length()-1)));
//    }
//    @Test(description = "Make sure clicking on the second side banner works correctly in Sports Category Page", priority = 17)
//    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheSportsCategoryPage() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedBannerUrl=aeVitaminsAndHealthCategoryPage.getSecondSideBanner().getAttribute("href");
//        aeVitaminsAndHealthCategoryPage.getSecondSideBanner().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedBannerUrl.substring(0,expectedBannerUrl.length()-1)));
//    }
//    //Trending in Sports section Test Cases
//    @Test(description = "Make sure the Trending in Sports section is displayed ", priority = 18)
//    public void verifyTrendingInSportsInTheSportsCategoryPageIsDisplayed() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(aeSportsCategoryPage.getTrendingInSportsSectionTitle().isDisplayed());
//        Assert.assertTrue(aeSportsCategoryPage.getTrendingInSportsSection().isDisplayed());    }
//
//    @Test(description = "Make sure the next item button appears in the Trending in Sports section works correctly ", priority = 19)
//    public void verifyNextButtonAppearsInTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(aeSportsCategoryPage.getMensApparelCategory().isDisplayed());
//        Assert.assertTrue(aeSportsCategoryPage.getWomenApparelCategory().isDisplayed());
//        Assert.assertTrue(aeSportsCategoryPage.getYogaApparelCategory().isDisplayed());
//        Assert.assertTrue(aeSportsCategoryPage.getSwimmingApparelCategory().isDisplayed());
//        Assert.assertTrue(aeSportsCategoryPage.getMmaApparelCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getCricketApparelCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getToysAndGamesCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getWearableTechApparelCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getPersonalCareApparelCategory().isDisplayed());
//    }
//    @Test(description = "Make sure the previous item button appears in the Trending in Sports section works correctly ", priority = 20)
//    public void verifyPreviousButtonAppearsInTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(aeSportsCategoryPage.getMensApparelCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        DataHelperAndWait.waitToBeVisible(aeSportsCategoryPage.getPersonalCareApparelCategory(),5);
//        Assert.assertTrue(aeSportsCategoryPage.getPersonalCareApparelCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getWearableTechApparelCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getToysAndGamesCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getCricketApparelCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getMmaApparelCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getSwimmingApparelCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getYogaApparelCategory().isDisplayed());
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        Assert.assertTrue(aeSportsCategoryPage.getWomenApparelCategory().isDisplayed());
//    }
//    //Men's Apparel section Test Cases
//    @Test(description = "Make sure clicking on the Men's Apparel category inside Trending in Sports section works correctly ", priority = 21)
//    public void verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getMensApparelCategory().getAttribute("href");
//        aeSportsCategoryPage.getMensApparelCategory().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Men's Apparel category page ", priority = 22)
//    public void verifyResultFieldAndItsVaLueAppearInTheMensApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Men's Apparel category page ", priority = 23)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMensApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    @Test(description = "Make sure that the Featured option is selected by default in the Sort By menu for Men's Apparel Category Page ", priority = 24)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForMensApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Men's Apparel category page  ", priority = 25)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMensApparelCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Men's Apparel Category Page ", priority = 26)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMensApparelCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Men's Apparel Category page ", priority = 27)
//    public void verifyTitleSectionAppearingCorrectlyInMensApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Apparel , Men", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Men's Apparel category page", priority = 28)
//    public void verifySearchBtnWorksCorrectlyFromMensApparelCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Men's Apparel category page is disable when the current page is page 1 ", priority = 29)
//    public void verifyThePreviousBtnInMensApparelCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Men's Apparel category page works correctly", priority = 30)
//    public void verifyThePaginationControlInMensApparelCategoryPageWorksCorrectly(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Men's Apparel Category Page works correctly", priority = 31)
//    public void verifyPreviousPageBtnInMensApparelCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMensApparelCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Men's Apparel Category Page works correctly", priority = 32)
//    public void verifyNextPageBtnInMensApparelCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Men's Apparel category page", priority = 33)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMensApparelCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Men's Apparel category page", priority = 34)
//    public void verifyFiltrationSectionIsDisplayedInMensApparelCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//
//    //Women's Apparel section Test Cases
//    @Test(description = "Make sure clicking on the Women's Apparel category inside Trending in Sports section works correctly ", priority = 35)
//    public void verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getWomenApparelCategory().getAttribute("href");
//        aeSportsCategoryPage.getWomenApparelCategory().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Women's Apparel category page ", priority = 36)
//    public void verifyResultFieldAndItsVaLueAppearInTheWomenApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Women's Apparel category page ", priority = 37)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheWomenApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Featured option is selected by default in the Sort By menu for Women's Apparel Category Page ", priority = 38)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForWomenApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Women's category page  ", priority = 39)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInWomenApparelCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Women's Apparel Category Page ", priority = 40)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInWomenApparelCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Women's Apparel Category page ", priority = 41)
//    public void verifyTitleSectionAppearingCorrectlyInWomenApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Apparel , Women", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Women's Apparel category page", priority = 42)
//    public void verifySearchBtnWorksCorrectlyFromWomenApparelCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Women's Apparel category page is disable when the current page is page 1 ", priority = 43)
//    public void verifyThePreviousBtnInWomenApparelCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Women's Apparel category page works correctly", priority = 44)
//    public void verifyThePaginationControlInWomenApparelCategoryPageWorksCorrectly(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Women's Apparel Category Page works correctly", priority = 45)
//    public void verifyPreviousPageBtnInWomenApparelCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInWomenApparelCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Women's Apparel Category Page works correctly", priority = 46)
//    public void verifyNextPageBtnInWomenApparelCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Women's Apparel category page", priority = 47)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWomenApparelCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Women's Apparel category page", priority = 48)
//    public void verifyFiltrationSectionIsDisplayedInWomenApparelCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//    //Yoga section Test Cases
//    @Test(description = "Make sure clicking on the Yoga Apparel category inside Trending in Sports section works correctly ", priority = 49)
//    public void verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getYogaApparelCategory().getAttribute("href");
//        aeSportsCategoryPage.getYogaApparelCategory().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Yoga Apparel category page ", priority = 50)
//    public void verifyResultFieldAndItsVaLueAppearInTheYogaApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Yoga Apparel category page ", priority = 51)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheYogaApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Featured option is selected by default in the Sort By menu for Yoga Apparel Category Page ", priority = 52)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForYogaApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Yoga category page  ", priority = 53)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInYogaApparelCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Yoga Apparel Category Page ", priority = 54)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInYogaApparelCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Yoga Apparel Category page ", priority = 55)
//    public void verifyTitleSectionAppearingCorrectlyInYogaApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Apparel , Yoga", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Yoga Apparel category page", priority = 56)
//    public void verifySearchBtnWorksCorrectlyFromYogaApparelCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Yoga Apparel category page is disable when the current page is page 1 ", priority = 57)
//    public void verifyThePreviousBtnInYogaApparelCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Yoga Apparel category page works correctly", priority = 58)
//    public void verifyThePaginationControlInYogaApparelCategoryPageWorksCorrectly(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Yoga Apparel Category Page works correctly", priority = 59)
//    public void verifyPreviousPageBtnInYogaApparelCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInYogaApparelCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Yoga Apparel Category Page works correctly", priority = 60)
//    public void verifyNextPageBtnInYogaApparelCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Yoga Apparel category page", priority = 61)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInYogaApparelCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Yoga Apparel category page", priority = 62)
//    public void verifyFiltrationSectionIsDisplayedInYogaApparelCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//    //Swimming section Test Cases
//    @Test(description = "Make sure clicking on the Swimming Apparel category inside Trending in Sports section works correctly ", priority = 63)
//    public void verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getSwimmingApparelCategory().getAttribute("href");
//        aeSportsCategoryPage.getSwimmingApparelCategory().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Swimming Apparel category page ", priority = 64)
//    public void verifyResultFieldAndItsVaLueAppearInTheSwimmingApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Swimming Apparel category page ", priority = 65)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSwimmingApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Featured option is selected by default in the Sort By menu for Swimming Apparel Category Page ", priority = 66)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForSwimmingApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Swimming category page  ", priority = 67)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSwimmingApparelCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Swimming Apparel Category Page ", priority = 68)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSwimmingApparelCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Swimming Apparel Category page ", priority = 69)
//    public void verifyTitleSectionAppearingCorrectlyInSwimmingApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Mma, Sport", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Swimming Apparel category page", priority = 70)
//    public void verifySearchBtnWorksCorrectlyFromSwimmingApparelCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Swimming Apparel category page is disable when the current page is page 1 ", priority = 71)
//    public void verifyThePreviousBtnInSwimmingApparelCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Swimming Apparel category page works correctly", priority = 72)
//    public void verifyThePaginationControlInSwimmingApparelCategoryPageWorksCorrectly(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Swimming Apparel Category Page works correctly", priority = 73)
//    public void verifyPreviousPageBtnInSwimmingApparelCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInSwimmingApparelCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Swimming Apparel Category Page works correctly", priority = 74)
//    public void verifyNextPageBtnInSwimmingApparelCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Swimming Apparel category page", priority = 75)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSwimmingApparelCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Swimming Apparel category page", priority = 76)
//    public void verifyFiltrationSectionIsDisplayedInSwimmingApparelCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//    //Mma section Test Cases
//    @Test(description = "Make sure clicking on the Mma Apparel category inside Trending in Sports section works correctly ", priority = 77)
//    public void verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getMmaApparelCategory().getAttribute("href");
//        aeSportsCategoryPage.getMmaApparelCategory().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Mma Apparel category page ", priority = 78)
//    public void verifyResultFieldAndItsVaLueAppearInTheMmaApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Mma Apparel category page ", priority = 79)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMmaApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Featured option is selected by default in the Sort By menu for Mma Apparel Category Page ", priority = 80)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForMmaApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Mma category page  ", priority = 81)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMmaApparelCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Mma Apparel Category Page ", priority = 82)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMmaApparelCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Mma Apparel Category page ", priority = 83)
//    public void verifyTitleSectionAppearingCorrectlyInMmaApparelCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Mma, Sport", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Mma Apparel category page", priority = 84)
//    public void verifySearchBtnWorksCorrectlyFromMmaApparelCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Mma Apparel category page is disable when the current page is page 1 ", priority = 85)
//    public void verifyThePreviousBtnInMmaApparelCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Mma Apparel category page works correctly", priority = 86)
//    public void verifyThePaginationControlInMmaApparelCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Mma Apparel Category Page works correctly", priority = 87)
//    public void verifyPreviousPageBtnInMmaApparelCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMmaApparelCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Mma Apparel Category Page works correctly", priority = 88)
//    public void verifyNextPageBtnInMmaApparelCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Mma Apparel category page", priority = 89)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMmaApparelCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Mma Apparel category page", priority = 90)
//    public void verifyFiltrationSectionIsDisplayedInMmaApparelCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//    //Cricket section Test Cases
//    @Test(description = "Make sure clicking on the Cricket category inside Trending in Sports section works correctly ", priority = 91)
//    public void verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getCricketApparelCategory().getAttribute("href");
//        aeSportsCategoryPage.clickOnCricketCategory(webDriver);
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Cricket category page ", priority = 92)
//    public void verifyResultFieldAndItsVaLueAppearInTheCricketCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Cricket category page ", priority = 93)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheCricketCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Featured option is selected by default in the Sort By menu for Cricket Category Page ", priority = 94)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForCricketCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Cricket category page  ", priority = 95)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInCricketCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Cricket Category Page ", priority = 96)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInCricketCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Cricket Category page ", priority = 97)
//    public void verifyTitleSectionAppearingCorrectlyInCricketCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Cricket, Sport", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Cricket category page", priority = 98)
//    public void verifySearchBtnWorksCorrectlyFromCricketCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Cricket category page is disable when the current page is page 1 ", priority = 99)
//    public void verifyThePreviousBtnInCricketCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Cricket category page works correctly", priority = 100)
//    public void verifyThePaginationControlInCricketCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Cricket Category Page works correctly", priority = 101)
//    public void verifyPreviousPageBtnInCricketCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInCricketCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Cricket Category Page works correctly", priority = 102)
//    public void verifyNextPageBtnInCricketCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Cricket category page", priority = 103)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInCricketCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Cricket category page", priority = 104)
//    public void verifyFiltrationSectionIsDisplayedInCricketCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//    //Toys And Games section Test Cases
//    @Test(description = "Make sure clicking on the Toys And Games category inside Trending in Sports section works correctly ", priority = 105)
//    public void verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getToysAndGamesCategory().getAttribute("href");
//        aeSportsCategoryPage.clickOnToysAndGamesCategory(webDriver);
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Toys And Games category page ", priority = 106)
//    public void verifyResultFieldAndItsVaLueAppearInTheToysAndGamesCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Toys And Games category page ", priority = 107)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheToysAndGamesCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Featured option is selected by default in the Sort By menu for Toys And Games Category Page ", priority = 108)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForToysAndGamesCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Toys And Games category page  ", priority = 109)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInToysAndGamesCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Toys And Games Category Page ", priority = 110)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInToysAndGamesCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Toys And Games Category page ", priority = 111)
//    public void verifyTitleSectionAppearingCorrectlyInToysAndGamesCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Toys And Games, Kids", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Toys And Games category page", priority = 112)
//    public void verifySearchBtnWorksCorrectlyFromToysAndGamesCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Toys And Games category page is disable when the current page is page 1 ", priority = 113)
//    public void verifyThePreviousBtnInToysAndGamesCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Toys And Games category page works correctly", priority = 114)
//    public void verifyThePaginationControlInToysAndGamesCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Toys And Games Category Page works correctly", priority = 115)
//    public void verifyPreviousPageBtnInToysAndGamesCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInToysAndGamesCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Toys And Games Category Page works correctly", priority = 116)
//    public void verifyNextPageBtnInToysAndGamesCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Toys And Games category page", priority = 117)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInToysAndGamesCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Toys And Games category page", priority = 118)
//    public void verifyFiltrationSectionIsDisplayedInToysAndGamesCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//    // Wearable Tech section test  cases
//    @Test(description = "Make sure clicking on the Wearable Tech category inside Trending in Sports section works correctly ", priority = 119)
//    public void verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getWearableTechApparelCategory().getAttribute("href");
//        aeSportsCategoryPage.clickOnWearableTechApparelCategory(webDriver);
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Wearable Tech category page ", priority = 120)
//    public void verifyResultFieldAndItsVaLueAppearInTheWearableTechCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Wearable Tech category page ", priority = 121)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheWearableTechCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Featured option is selected by default in the Sort By menu for Wearable Tech Category Page ", priority = 122)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForWearableTechCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Wearable Tech category page  ", priority = 123)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInWearableTechCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Wearable Tech Category Page ", priority = 124)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInWearableTechCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Wearable Tech Category page ", priority = 125)
//    public void verifyTitleSectionAppearingCorrectlyInWearableTechCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Wearable Tech, Sports Tech", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Wearable Tech category page", priority = 126)
//    public void verifySearchBtnWorksCorrectlyFromWearableTechCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Wearable Tech category page is disable when the current page is page 1 ", priority = 127)
//    public void verifyThePreviousBtnInWearableTechCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Wearable Tech category page works correctly", priority = 128)
//    public void verifyThePaginationControlInWearableTechCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Wearable Tech Category Page works correctly", priority = 129)
//    public void verifyPreviousPageBtnInWearableTechCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInWearableTechCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Wearable Tech Category Page works correctly", priority = 130)
//    public void verifyNextPageBtnInWearableTechCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Wearable Tech category page", priority = 131)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWearableTechCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Wearable Tech category page", priority = 132)
//    public void verifyFiltrationSectionIsDisplayedInWearableTechCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//    // Personal Care section test  cases
//    @Test(description = "Make sure clicking on the Personal Care category inside Trending in Sports section works correctly ", priority = 133)
//    public void verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getPersonalCareApparelCategory().getAttribute("href");
//        aeSportsCategoryPage.clickOnPersonalCareCategory(webDriver);
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl.toLowerCase());
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Personal Care category page ", priority = 134)
//    public void verifyResultFieldAndItsVaLueAppearInThePersonalCareCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Personal Care category page ", priority = 135)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInThePersonalCareCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Featured option is selected by default in the Sort By menu for Personal Care Category Page ", priority = 136)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForPersonalCareCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Personal Care category page  ", priority = 137)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInPersonalCareCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Personal Care Category Page ", priority = 138)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInPersonalCareCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Personal Care Category page ", priority = 139)
//    public void verifyTitleSectionAppearingCorrectlyInPersonalCareCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Personal Care, Men", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Personal Care category page", priority = 140)
//    public void verifySearchBtnWorksCorrectlyFromPersonalCareCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Personal Care category page is disable when the current page is page 1 ", priority = 141)
//    public void verifyThePreviousBtnInPersonalCareCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Personal Care category page works correctly", priority = 142)
//    public void verifyThePaginationControlInPersonalCareCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Personal Care Category Page works correctly", priority = 143)
//    public void verifyPreviousPageBtnInPersonalCareCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInPersonalCareCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Personal Care Category Page works correctly", priority = 144)
//    public void verifyNextPageBtnInPersonalCareCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Personal Care category page", priority = 145)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInPersonalCareCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Personal Care category page", priority = 146)
//    public void verifyFiltrationSectionIsDisplayedInPersonalCareCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//
//    //Men Category Test Cases
//
//    @Test(description = "Make sure Men category section is displayed in the Sports Category Page ", priority = 147)
//    public void verifyMenCategorySectionIsDisplayedCorrectlyInTheSportsCategoryPage(){
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(aeSportsCategoryPage.getMenCategory().isDisplayed());
//
//    }
//    @Test(description = "Make sure clicking on the Men category from the Sports category Page works correctly ", priority = 148)
//    public void verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getMenCategory().getAttribute("href");
//        aeSportsCategoryPage.getMenCategory().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl.toLowerCase());
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Men category page ", priority = 149)
//    public void verifyResultFieldAndItsVaLueAppearInTheMenCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Men category page ", priority = 150)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMenCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Men Category Page ", priority = 151)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForMenCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Men category page  ", priority = 152)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMenCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Men Category Page ", priority = 153)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMenCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Men Category page ", priority = 154)
//    public void verifyTitleSectionAppearingCorrectlyInMenCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Men, Sports", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Men category page", priority = 155)
//    public void verifySearchBtnWorksCorrectlyFromMenCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Men category page is disable when the current page is page 1 ", priority = 156)
//    public void verifyThePreviousBtnInMenCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Men category page works correctly", priority = 157)
//    public void verifyThePaginationControlInMenCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Men Category Page works correctly", priority = 158)
//    public void verifyPreviousPageBtnInMenCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMenCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Men Category Page works correctly", priority = 159)
//    public void verifyNextPageBtnInMenCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Men category page", priority = 160)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMenCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Men category page", priority = 161)
//    public void verifyFiltrationSectionIsDisplayedInMenCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//
//    //Women Category Test Cases
//
//    @Test(description = "Make sure Women category section is displayed in the Sports Category Page ", priority = 162)
//    public void verifyWomenCategorySectionIsDisplayedCorrectlyInTheSportsCategoryPage(){
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(aeSportsCategoryPage.getWomenCategory().isDisplayed());
//
//    }
//    @Test(description = "Make sure clicking on the Women category from the Sports category Page works correctly ", priority = 163)
//    public void verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getWomenCategory().getAttribute("href");
//        aeSportsCategoryPage.getWomenCategory().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl.toLowerCase());
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Women category page ", priority = 164)
//    public void verifyResultFieldAndItsVaLueAppearInTheWomenCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Women category page ", priority = 165)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheWomenCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Women Category Page ", priority = 166)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForWomenCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Women category page  ", priority = 167)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInWomenCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Women Category Page ", priority = 168)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInWomenCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Women Category page ", priority = 169)
//    public void verifyTitleSectionAppearingCorrectlyInWomenCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Women, Sports", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Women category page", priority = 170)
//    public void verifySearchBtnWorksCorrectlyFromWomenCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Women category page is disable when the current page is page 1 ", priority = 171)
//    public void verifyThePreviousBtnInWomenCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Women category page works correctly", priority = 172)
//    public void verifyThePaginationControlInWomenCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Women Category Page works correctly", priority = 173)
//    public void verifyPreviousPageBtnInWomenCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInWomenCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Women Category Page works correctly", priority = 174)
//    public void verifyNextPageBtnInWomenCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Women category page", priority = 175)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWomenCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Women category page", priority = 176)
//    public void verifyFiltrationSectionIsDisplayedInWomenCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
////Sports Tech Category Test Cases
//
//    @Test(description = "Make sure Sports Tech category section is displayed in the Sports Category Page ", priority = 177)
//    public void verifySportsTechCategorySectionIsDisplayedCorrectlyInTheSportsCategoryPage(){
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(aeSportsCategoryPage.getSportsTechCategory().isDisplayed());
//
//    }
//    @Test(description = "Make sure clicking on the Sports Tech category from the Sports category Page works correctly ", priority = 178)
//    public void verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getSportsTechCategory().getAttribute("href");
//        aeSportsCategoryPage.getSportsTechCategory().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl.toLowerCase());
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Sports Tech category page ", priority = 179)
//    public void verifyResultFieldAndItsVaLueAppearInTheSportsTechCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Sports Tech category page ", priority = 180)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSportsTechCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Sports Tech Category Page ", priority = 181)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForSportsTechCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Sports Tech category page  ", priority = 182)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSportsTechCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Sports Tech Category Page ", priority = 183)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSportsTechCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Sports Tech Category page ", priority = 184)
//    public void verifyTitleSectionAppearingCorrectlyInSportsTechCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Sports Tech", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Sports Tech category page", priority = 185)
//    public void verifySearchBtnWorksCorrectlyFromSportsTechCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Sports Tech category page is disable when the current page is page 1 ", priority = 186)
//    public void verifyThePreviousBtnInSportsTechCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Sports Tech category page works correctly", priority = 187)
//    public void verifyThePaginationControlInSportsTechCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Sports Tech Category Page works correctly", priority = 188)
//    public void verifyPreviousPageBtnInSportsTechCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInSportsTechCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Sports Tech Category Page works correctly", priority = 189)
//    public void verifyNextPageBtnInSportsTechCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Sports Tech category page", priority = 190)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSportsTechCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Sports Tech category page", priority = 191)
//    public void verifyFiltrationSectionIsDisplayedInSportsTechCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//
//    //Kids Category Test Cases
//
//    @Test(description = "Make sure Kids category section is displayed in the Sports Category Page ", priority = 192)
//    public void verifyKidsCategorySectionIsDisplayedCorrectlyInTheSportsCategoryPage(){
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(aeSportsCategoryPage.getKidsCategory().isDisplayed());
//
//    }
//    @Test(description = "Make sure clicking on the Kids category from the Sports category Page works correctly ", priority = 193)
//    public void verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getKidsCategory().getAttribute("href");
//        aeSportsCategoryPage.getKidsCategory().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl.toLowerCase());
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Kids category page ", priority = 194)
//    public void verifyResultFieldAndItsVaLueAppearInTheKidsCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Kids category page ", priority = 195)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheKidsCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Kids Category Page ", priority = 196)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForKidsCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Kids category page  ", priority = 197)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInKidsCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Kids Category Page ", priority = 198)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInKidsCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Kids Category page ", priority = 199)
//    public void verifyTitleSectionAppearingCorrectlyInKidsCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Kids, Sports", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Kids category page", priority = 200)
//    public void verifySearchBtnWorksCorrectlyFromKidsCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Kids category page is disable when the current page is page 1 ", priority = 201)
//    public void verifyThePreviousBtnInKidsCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Kids category page works correctly", priority = 202)
//    public void verifyThePaginationControlInKidsCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Kids Category Page works correctly", priority = 203)
//    public void verifyPreviousPageBtnInKidsCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInKidsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Kids Category Page works correctly", priority = 204)
//    public void verifyNextPageBtnInKidsCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Kids category page", priority = 205)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInKidsCategoryPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Kids category page", priority = 206)
//    public void verifyFiltrationSectionIsDisplayedInKidsCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//
//
//    //Sports Category Test Cases
//
//    @Test(description = "Make sure Sports category section is displayed in the Sports Category Page ", priority = 207)
//    public void verifySportsCategorySectionIsDisplayedCorrectlyInTheSportsCategoryPage(){
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(aeSportsCategoryPage.getSportsCategory().isDisplayed());
//
//    }
//    @Test(description = "Make sure clicking on the Sports category from the Sports category Page works correctly ", priority = 208)
//    public void verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeSportsCategoryPage.getSportsCategory().getAttribute("href");
//        aeSportsCategoryPage.getSportsCategory().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl.toLowerCase());
//    }
//    @Test(description = "Make sure that the Result label and its value appear correctly in the Sports category page ", priority = 209)
//    public void verifyResultFieldAndItsVaLueAppearInTheSportsCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
//    //There's a bug here - some filtration options are missing
//    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Sports category page ", priority = 210)
//    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSportsCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
//        }
//    }
//    //There's a bug here
//    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Sports Category Page ", priority = 211)
//    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForSportsCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
//    }
//    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Sports category page  ", priority = 212)
//    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSportsCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//    }
//    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Sports Category Page ", priority = 213)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSportsCategoryPage() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
//    }
//    @Test(description = "Make sure each of the title section appears correctly in the Sports Category page ", priority = 214)
//    public void verifyTitleSectionAppearingCorrectlyInSportsCategoryPage(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Sport, Sports", "Wrong title appears in the sport Supplements category image");
//    }
//    @Test(description = "Verify that the search button works correctly from the Sports category page", priority = 215)
//    public void verifySearchBtnWorksCorrectlyFromSportsCategoryPage(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        aeProductDetailsPage.searchForBundle();
//        aeProductDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    @Test(description = "Verify that the previous page button in the Sports category page is disable when the current page is page 1 ", priority = 216)
//    public void verifyThePreviousBtnInSportsCategoryPageIsDisableWhenDisplayPage1(){
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
//
//    @Test(description = "Make Sure the Pagination control in the Sports category page works correctly", priority = 217)
//    public void verifyThePaginationControlInSportsCategoryPageWorksCorrectly() {
//        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//        aeSportSupplementsCategoryPage.navigateToPage3();
//        DataHelperAndWait.waitForTime(3000);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
//    }
//    @Test(description = "Make Sure the previous page button In Sports Category Page works correctly", priority = 218)
//    public void verifyPreviousPageBtnInSportsCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    //There's a performance issue when clicking on the previous button
//    @Test(description = "Make Sure the next page button In Sports Category Page works correctly", priority = 219)
//    public void verifyNextPageBtnInSportsCategoryPageWorksCorrectly() {
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Sports category page", priority = 220)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSportsSectionPage(){
//        aeFooterPageTestCases= new AEFooterPageTestCases();
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
//    }
//    @Test(description = "Make sure the Filtration Section is displayed in the Sports category page", priority = 221)
//    public void verifyFiltrationSectionIsDisplayedInSportsCategoryPage(){
//        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromSportsCategoryPageWorksCorrectly();
//        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
//
//    //Recommended Products Test Cases section
//
//    @Test(description = "Make sure the Recommended Products section is displayed in the Sports Category Page ", priority = 222)
//    public void verifyRecommendedProductsSectionIsDisplayedInTheSportsSection() {
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertEquals(aeSportsCategoryPage.getRecommendedProductsTitleSection().getText(),"Recommended Products","The Recommended Products section incorrect title");
//        Assert.assertTrue(aeSportsCategoryPage.getRecommendedProductsSection().isDisplayed());
//    }
//    @Test(description = "Make sure the previous arrow icon is not appear by default in the Recommended Products section ", priority = 223)
//    public void verifyPreviousArrowButtonInRecommendedProductsSectionIsNotDisplayedByDefault() {
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertFalse(aeSportsCategoryPage.getPreviousIconInRecommendedProductsSection().isDisplayed());
//    }
//    @Test(description = "Make sure clicking on Next Button in the Recommended Products section works correctly", priority = 224)
//    public void verifyClickingOnNextIconInRecommendedProductsSectionWorksCorrectly() {
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportsCategoryPage.getNextIconInRecommendedProductsSection().click();
//        Assert.assertTrue(aeSportsCategoryPage.getLastProductInRecommendedProductsSection().isDisplayed());
//    }
//    @Test(description = "Make sure clicking on Previous Button in the Recommended Products section works correctly", priority = 225)
//    public void verifyClickingOnPreviousIconInRecommendedProductsSectionWorksCorrectly() {
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportsCategoryPage.getNextIconInRecommendedProductsSection().click();
//        aeSportsCategoryPage.getPreviousIconInRecommendedProductsSection().click();
//        Assert.assertFalse(aeSportsCategoryPage.getPreviousIconInRecommendedProductsSection().isDisplayed());
//    }
//    @Test(description = "Make sure clicking on the product card in the Recommended Products section works correctly ", priority = 226)
//    public void verifyClickingOnProductCardInsideRecommendedProductsSectionWorksCorrectly() {
//        aeSportsCategoryPage=new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnSportsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportsCategoryPage.getProductCardInRecommendedProductsSection().click();
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed");
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty");
//    }
//    //Pagination control for all pages in the Sports Category Pages
//    @Test(description = "Make Sure the ability to access all pages inside Mens Apparel Category Page ", priority = 227)
//    public void verifyAbilityToAccessAllPagesInsideMensApparelCategoryPageCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make Sure the ability to access all pages inside Women's Apparel Category Page ", priority = 228)
//    public void verifyAbilityToAccessAllPagesInsideWomenApparelCategoryPageCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make Sure the ability to access all pages inside Yoga Apparel Category Page ", priority = 229)
//    public void verifyAbilityToAccessAllPagesInsideYogaApparelCategoryPageCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnYogaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//            String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//            DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make Sure the ability to access all pages inside Swimming Category Page ", priority = 230)
//    public void verifyAbilityToAccessAllPagesInsideSwimmingCategoryPageCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSwimmingApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make Sure the ability to access all pages inside Mma Category Page ", priority = 231)
//    public void verifyAbilityToAccessAllPagesInsideMmaCategoryPageCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMmaApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make Sure the ability to access all pages inside Cricket Category Page ", priority = 232)
//    public void verifyAbilityToAccessAllPagesInsideCricketCategoryPageCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCricketApparelCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make Sure the ability to access all pages inside Toys And Games Category Page ", priority = 233)
//    public void verifyAbilityToAccessAllPagesInsideToysAndGamesCategoryPageCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnToysAndGamesCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make Sure the ability to access all pages inside Wearable Tech Category Page ", priority = 234)
//    public void verifyAbilityToAccessAllPagesInsideWearableTechCategoryPageCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWearableTechCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make Sure the ability to access all pages inside Personal Care Category Page ", priority = 235)
//    public void verifyAbilityToAccessAllPagesInsidePersonalCareCategoryPageCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheTrendingInSportsSectionWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make Sure the ability to access all pages inside Men Category From Sports Category Page  ", priority = 236)
//    public void verifyAbilityToAccessAllPagesInsideMenCategoryFromSportsCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMenCategoryFromSportsCategoryPageWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make Sure the ability to access all pages inside Women Category From Sports Category Page  ", priority = 237)
//    public void verifyAbilityToAccessAllPagesInsideWomenCategoryFromSportsCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenCategoryFromSportsCategoryPageWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make Sure the ability to access all pages inside Sports Tech Category From Sports Category Page  ", priority = 238)
//    public void verifyAbilityToAccessAllPagesInsideSportsTechCategoryFromSportsCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsTechCategoryFromSportsCategoryPageWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//
//    @Test(description = "Make Sure the ability to access all pages inside Kids Category From Sports Category Page  ", priority = 239)
//    public void verifyAbilityToAccessAllPagesInsideKidsCategoryFromSportsCategoryPageWorksCorrectly(){
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsCategoryFromSportsCategoryPageWorksCorrectly();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
//    @Test(description = "Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 240)
//    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
//        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyClickingOnSportsCategoryFromShopByMenuRedirectUserToCorrectURL();
//        aeGuestUserPage.clickOnSporterLogo();
//        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL," The Current URL is not matched with the Cart URL" );
//    }
//}