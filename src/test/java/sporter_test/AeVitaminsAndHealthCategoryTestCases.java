package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.checkerframework.checker.units.qual.A;
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

public class AeVitaminsAndHealthCategoryTestCases extends BaseTest {
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    private AEMegaMenuTestCases aeMegaMenuTestCases;
    private AeProductDetailsPage aeProductDetailsPage;
    private AEFooterPageTestCases aeFooterPageTestCases;
    private KsaHomePage ksaHomePage;
    private AEFooterPage aeFooterPage;
    private AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage;
    private AEGuestUserPage aeGuestUserPage;

    @Test(description = "Make sure clicking on the Vitamins And Health Category Appears In MegaMenu Redirect User To CorrectURL", priority = 1)
    public void verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyClickingOnVitaminsAndHealthManiMenuRedirectUserToCorrectURL();
    }
    @Test(description = "Make sure clicking on the Vitamins And Health Category from ShopBy Menu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnVitaminsAndHealthCategoryFromShopByMenuRedirectUserToCorrectURL() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyClickingOnVitaminsAndHealthOptionInsideShopByMenuRedirectUserToCorrectURL();
    }
    @Test(description = "Make sure clicking on the Vitamins And Health Category from HomePage Redirect User To CorrectURL", priority = 3)
    public void verifyClickingOnVitaminsAndHealthCategoryFromHomePageRedirectUserToCorrectURL() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage.switchToAeCountry();
        DataHelperAndWait.waitToBeClickable(aeVitaminsAndHealthCategoryPage.getVitaminsAndHealthCategoryInHomePage(), 5);
        aeVitaminsAndHealthCategoryPage.getVitaminsAndHealthCategoryInHomePage().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeMegaMenuTestCases.healthVitaminsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure the rotating slider section is displayed in vitamins And Health Category ", priority = 4)
    public void verifyRotatingSliderIsDisplayedInTheVitaminsAndHealthCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSlider().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderList().get(i).isDisplayed());
        }
    }
    //There's a bug here since the next arrow icon is missing
    @Test(description = "Make sure the next arrow of the rotating slider section is displayed in the vitamins And Health Category ", priority = 5)
    public void verifyNextArrowOfRotatingSliderIsDisplayedInTheVitaminsAndHealthCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
    }
    //There's a bug here since the previous arrow icon is missing
    @Test(description = "Make sure the previous arrow of the rotating slider section is displayed in the vitamins And Health Category ", priority = 6)
    public void verifyPreviousArrowOfRotatingSliderIsDisplayedInTheVitaminsAndHealthCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }
    @Test(description = "Make sure the pagination control of rotating slider section is displayed in Vitamins And Health Category Page", priority = 7)
    public void verifyPaginationControlOfRotatingSliderSectionIsDisplayedInTheVitaminsAndHealthCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingList().get(i).isDisplayed());
        }
    }
    @Test(description = "Make sure the side Banners is displayed in the Vitamins And Health Category Page ", priority = 8)
    public void verifySideBannersIsDisplayedInTheVitaminsAndHealthCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getHomePageSideBanner().isDisplayed());
    }
    @Test(description = "Make sure the pagination control of rotating slider section works correctly in Vitamins And Health Category Page", priority = 9)
    public void verifyPaginationControlOfRotatingSliderSectionWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().size(); i++) {
           aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).click();
           Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).getAttribute("class"),"flex-active");
        }
    }
    @Test(description = "Make sure the clicking on the banners appear in rotating slider section works correctly in Vitamins And Health Category Page", priority = 10)
    public void verifyClickingOnTheBannersAppearingInRotatingSliderSectionWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().size(); i++) {
            aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).click();
            aeVitaminsAndHealthCategoryPage.getBannerInRotatingSliderSection().click();
            boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
            assertFalse(verifyTitle, "Page Not Found Is Displayed");
            boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
            assertFalse(isTheElementPresent, "The page is empty");
            webDriver.navigate().to(siteURL+aeMegaMenuTestCases.healthVitaminsUrl);
        }
    }
    @Test(description = "Make sure the clicking on the first side banner works correctly in Vitamins And Health Category Page", priority = 11)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedBannerUrl=aeVitaminsAndHealthCategoryPage.getFirstSideBanner().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getFirstSideBanner().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedBannerUrl);
    }
    @Test(description = "Make sure clicking on the second side banner works correctly in Vitamins And Health Category Page", priority = 12)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedBannerUrl=aeVitaminsAndHealthCategoryPage.getSecondSideBanner().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getSecondSideBanner().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedBannerUrl);
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Vitamins AndHealth Category Page ", priority = 13)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //Shop By Category Test Cases
    @Test(description = "Make sure the Shop By Category section is displayed ", priority = 14)
    public void verifyShopByCategoryInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getShopByCategorySections().isDisplayed());    }
    //Fish Oil & Omegas Category page Test Cases
    @Test(description = "Make sure clicking on the Fish Oil & Omegas category inside Shop By Category section works correctly ", priority = 15)
    public void verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(0).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(0).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Fish Oil & Omegas category page ", priority = 16)
    public void verifyResultFieldAndItsVaLueAppearInTheFishOilAndOmegasCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Fish Oil & Omegas category page ", priority = 17)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheFishOilAndOmegasCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Fish Oil And Omegas Category Page ", priority = 18)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForFishOilAndOmegasCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Fish Oil & Omegas category page  ", priority = 19)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInFishOilAndOmegasCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Fish Oil & Omegas Category Page ", priority = 20)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInFishOilAndOmegasCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Fish Oil & Omegas Category page ", priority = 21)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInFishOilAndOmegasCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Fish Oil & Omegas, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Fish Oil & Omegas footer appears correctly  ", priority = 22)
    public void verifyFishOilAndOmegasFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Make sure the text appears in the Fish Oil & Omegas footer appears correctly  ", priority = 23)
    public void verifyTheTextAppearInTheFishOilAndOmegasFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterParagraph1().getText(),"Fish Oil & Omegas","The footer has incorrect title");
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterParagraph2().getText(),"We are positive about the fact that you heard about the benefits of oils and omegas before. Oils and omegas like fish oil and omega-3 could make wonders! It is vital for your body to get the right balance of omegas and good fatty acids. Dry skin, brittle hair, frequent urination, sleep and attention problems and emotional sensitivity, are all some of the symptoms you may suffer from in case you were lacking fish oil (omega-3), while lacking other essential fatty acids and oils could come in the shape of slow-growing nails, dry eyes and stiff joints.","The footer has incorrect Paragraph");
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterParagraph3().getText(),"Fish oil, Flaxseed oil, Black seed oil, Krill oil, Chia seed oil and other omega mixes are key nutrients for improving your heart health, fighting inflammation, getting a healthy, great-looking skin, weight loss, improving brain function and reducing joints pain.\n" +
                "\n" +
                "Getting your hands on all of these essential oils and omegas including fish oil with their magical benefits is now between your hands! Sporter has made huge efforts to give you the best natural fish oil, essential oils and omegas, as part of completing its mission of serving all types of goals and satisfying needs.","The footer has incorrect Paragraph");
    }
    @Test(description = "Verify that the search button works correctly from the Fish Oil & Omegas category page", priority = 24)
    public void verifySearchBtnWorksCorrectlyFromFishOilAndOmegasCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Fish Oil & Omegas category page is disable when the current page is page 1 ", priority = 25)
    public void verifyThePreviousBtnInFishOilAndOmegasCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    @Test(description = "Make Sure the Pagination control in the Fish Oil & Omegas category page works correctly", priority = 26)
    public void verifyThePaginationControlInFishOilAndOmegasCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make Sure the previous page button In Fish Oil And Omegas Category Page works correctly", priority = 27)
    public void verifyPreviousPageBtnInFishOilAndOmegasCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInFishOilAndOmegasCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the next page button In Fish Oil And Omegas Category Page works correctly", priority = 28)
    public void verifyNextPageBtnInFishOilAndOmegasCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInFishOilAndOmegasCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Fish Oil And Omegas category page", priority = 29)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInFishOilAndOmegasCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
       aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //Multivitamins Category page Test Cases
    @Test(description = "Make sure clicking on the Multivitamins category inside Shop By Category section works correctly ", priority = 30)
    public void verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(1).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(1).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Multivitamins category page ", priority = 31)
    public void verifyResultFieldAndItsVaLueAppearInTheMultivitaminsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Multivitamins category page ", priority = 32)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMultivitaminsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Multivitamins Category Page ", priority = 33)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForMultivitaminsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Multivitamins category page  ", priority = 34)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMultivitaminsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Multivitamins Category Page ", priority = 35)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMultivitaminsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Multivitamins Category page ", priority = 36)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInMultivitaminsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Multivitamins, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Multivitamins footer appears correctly  ", priority = 37)
    public void verifyMultivitaminsFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Multivitamins category page", priority = 38)
    public void verifySearchBtnWorksCorrectlyFromMultivitaminsCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Multivitamins category page is disable when the current page is page 1 ", priority = 39)
    public void verifyThePreviousBtnInMultivitaminsCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Multivitamins category page works correctly", priority = 40)
    public void verifyThePaginationControlInMultivitaminsCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the previous page button In Multivitamins Category Page works correctly", priority = 41)
    public void verifyPreviousPageBtnInMultivitaminsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInMultivitaminsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the next page button In Multivitamins Category Page works correctly", priority = 42)
    public void verifyNextPageBtnInMultivitaminsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInMultivitaminsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Multivitamins category page", priority = 43)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMultivitaminsCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //Vitamins A-Z Category page Test Cases
    @Test(description = "Make sure clicking on the Vitamins A-Z category inside Shop By Category section works correctly ", priority = 44)
    public void verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(2).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(2).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Vitamins A_Z category page ", priority = 45)
    public void verifyResultFieldAndItsVaLueAppearInTheVitaminsA_ZCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the VitaminsA_Z category page ", priority = 46)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheVitaminsA_ZCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for VitaminsA_Z Category Page ", priority = 47)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForVitaminsA_ZCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the VitaminsA_Z category page  ", priority = 48)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInVitaminsA_ZCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the VitaminsA_Z Category Page ", priority = 49)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInVitaminsA_ZCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the VitaminsA_Z Category page ", priority = 50)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInVitaminsA_ZCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Essential Vitamins, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the VitaminsA_Z footer appears correctly  ", priority = 51)
    public void verifyVitaminsA_ZFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the VitaminsA_Z category page", priority = 52)
    public void verifySearchBtnWorksCorrectlyFromVitaminsA_ZCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the VitaminsA_Z category page is disable when the current page is page 1 ", priority = 53)
    public void verifyThePreviousBtnInVitaminsA_ZCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    @Test(description = "Make Sure the Pagination control in the VitaminsA_Z category page works correctly", priority = 54)
    public void verifyThePaginationControlInVitaminsA_ZCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make Sure the previous page button In VitaminsA_Z Category Page works correctly", priority = 55)
    public void verifyPreviousPageBtnInVitaminsA_ZCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInVitaminsA_ZCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the next page button In VitaminsA_Z Category Page works correctly", priority = 56)
    public void verifyNextPageBtnInVitaminsA_ZCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInVitaminsA_ZCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the VitaminsA_Z category page", priority = 57)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInVitaminsA_ZCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //Minerals Category page Test Cases
    @Test(description = "Make sure clicking on the Minerals category inside Shop By Category section works correctly ", priority = 58)
    public void verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(3).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(3).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Minerals category page ", priority = 59)
    public void verifyResultFieldAndItsVaLueAppearInTheMineralsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Minerals category page ", priority = 60)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMineralsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            add("Name");
            add("Best Selling");
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
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Minerals Category Page ", priority = 61)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForMineralsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Minerals category page  ", priority = 62)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMineralsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Minerals Category Page ", priority = 63)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMineralsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Minerals Category page ", priority = 64)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInMineralsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Minerals, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Minerals footer appears correctly  ", priority = 65)
    public void verifyMineralsFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Minerals category page", priority = 66)
    public void verifySearchBtnWorksCorrectlyFromMineralsCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Minerals category page is disable when the current page is page 1 ", priority = 67)
    public void verifyThePreviousBtnInMineralsCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    //There's a performance issue in the pagination control
    @Test(description = "Make Sure the Pagination control in the Minerals category page works correctly", priority = 68)
    public void verifyThePaginationControlInMineralsCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the previous page button In Minerals Category Page works correctly", priority = 69)
    public void verifyPreviousPageBtnInMineralsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInMineralsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Minerals Category Page works correctly", priority = 70)
    public void verifyNextPageBtnInMineralsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInMineralsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Minerals category page", priority = 71)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMineralsCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //Antioxidants Category page Test Cases
    @Test(description = "Make sure clicking on the Antioxidants category inside Shop By Category section works correctly ", priority = 72)
    public void verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(4).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(4).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Antioxidants category page ", priority = 73)
    public void verifyResultFieldAndItsVaLueAppearInTheAntioxidantsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Antioxidants category page ", priority = 74)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheAntioxidantsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Antioxidants Category Page ", priority = 75)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForAntioxidantsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Antioxidants category page  ", priority = 76)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInAntioxidantsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Antioxidants Category Page ", priority = 77)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInAntioxidantsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description that should appear in the image is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Antioxidants Category page ", priority = 78)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInAntioxidantsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Antioxidants, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Antioxidants footer appears correctly  ", priority = 79)
    public void verifyAntioxidantsFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Antioxidants category page", priority = 80)
    public void verifySearchBtnWorksCorrectlyFromAntioxidantsCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Antioxidants category page is disable when the current page is page 1 ", priority = 81)
    public void verifyThePreviousBtnInAntioxidantsCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    //There's a performance issue in the pagination control
    @Test(description = "Make Sure the Pagination control in the Antioxidants category page works correctly", priority = 82)
    public void verifyThePaginationControlInAntioxidantsCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the previous page button In Antioxidants Category Page works correctly", priority = 83)
    public void verifyPreviousPageBtnInAntioxidantsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInAntioxidantsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Antioxidants Category Page works correctly", priority = 84)
    public void verifyNextPageBtnInAntioxidantsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInAntioxidantsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Antioxidants category page", priority = 85)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInAntioxidantsCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //Superfoods Category page Test Cases
    @Test(description = "Make sure clicking on the Superfoods category inside Shop By Category section works correctly ", priority = 86)
    public void verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(5).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(5).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Superfoods category page ", priority = 86)
    public void verifyResultFieldAndItsVaLueAppearInTheSuperfoodsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Superfoods category page ", priority = 87)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSuperfoodsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Superfoods Category Page ", priority = 88)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForSuperfoodsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Superfoods category page  ", priority = 89)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSuperfoodsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Superfoods Category Page ", priority = 90)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSuperfoodsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description that should appear in the image is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Superfoods Category page ", priority = 91)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInSuperfoodsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Superfoods, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    //There's a bug here due to the footer section is missing
    @Test(description = "Make sure  the Superfoods footer appears correctly  ", priority = 92)
    public void verifySuperfoodsFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Superfoods category page", priority = 93)
    public void verifySearchBtnWorksCorrectlyFromSuperfoodsCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Superfoods category page is disable when the current page is page 1 ", priority = 94)
    public void verifyThePreviousBtnInSuperfoodsCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}

    //There's a performance issue in the pagination control
    @Test(description = "Make Sure the Pagination control in the Superfoods category page works correctly", priority = 95)
    public void verifyThePaginationControlInSuperfoodsCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make Sure the previous page button In Superfoods Category Page works correctly", priority = 96)
    public void verifyPreviousPageBtnInSuperfoodsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInSuperfoodsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Superfoods Category Page works correctly", priority = 97)
    public void verifyNextPageBtnInSuperfoodsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInSuperfoodsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Superfoods category page", priority = 98)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSuperfoodsCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //Collagen Category page Test Cases
    @Test(description = "Make sure clicking on the Collagen category inside Shop By Category section works correctly ", priority = 99)
    public void verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(6).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(6).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Collagen category page ", priority = 100)
    public void verifyResultFieldAndItsVaLueAppearInTheCollagenCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Collagen category page ", priority = 101)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheCollagenCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Collagen Category Page ", priority = 102)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForCollagenCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Collagen category page  ", priority = 103)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInCollagenCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Collagen Category Page ", priority = 104)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInCollagenCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description that should appear in the image is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Collagen Category page ", priority = 105)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInCollagenCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Superfoods, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Collagen footer appears correctly  ", priority = 106)
    public void verifyCollagenFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Collagen category page", priority = 107)
    public void verifySearchBtnWorksCorrectlyFromCollagenCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Collagen category page is disable when the current page is page 1 ", priority = 108)
    public void verifyThePreviousBtnInCollagenCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Collagen category page works correctly", priority = 109)
    public void verifyThePaginationControlInCollagenCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue here
    @Test(description = "Make Sure the previous page button In Collagen Category Page works correctly", priority = 110)
    public void verifyPreviousPageBtnInCollagenCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInCollagenCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the next page button In Collagen Category Page works correctly", priority = 111)
    public void verifyNextPageBtnInCollagenCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInCollagenCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Collagen category page", priority = 112)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInCollagenCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //Melatonin Category page Test Cases
    @Test(description = "Make sure clicking on the Melatonin category inside Shop By Category section works correctly ", priority = 113)
    public void verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(7).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(7).click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),siteURL+"/en-ae/vitamin-health/vitamins-sleep-mood-solutions/melatonin/");
        //There's a bug here in the DOM becuase the URL appears incorrectly
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Melatonin category page ", priority = 114)
    public void verifyResultFieldAndItsVaLueAppearInTheMelatoninCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Melatonin category page ", priority = 115)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMelatoninCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Melatonin Category Page ", priority = 116)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForMelatoninCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Melatonin category page  ", priority = 117)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMelatoninCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Melatonin Category Page ", priority = 118)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMelatoninCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description that should appear in the image is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Melatonin Category page ", priority = 119)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInMelatoninCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Melatonin, Sleep & Mood Solutions", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    //There's a bug here due to the footer section is missing
    @Test(description = "Make sure  the Melatonin footer appears correctly  ", priority = 120)
    public void verifyMelatoninFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Melatonin category page", priority = 121)
    public void verifySearchBtnWorksCorrectlyFromMelatoninCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Melatonin category page is disable when the current page is page 1 ", priority = 122)
    public void verifyThePreviousBtnInMelatoninCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Melatonin category page works correctly", priority = 123)
    public void verifyThePaginationControlInMelatoninCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue here
    @Test(description = "Make Sure the previous page button In Melatonin Category Page works correctly", priority = 124)
    public void verifyPreviousPageBtnInMelatoninCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInMelatoninCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the next page button In Melatonin Category Page works correctly", priority = 125)
    public void verifyNextPageBtnInMelatoninCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInMelatoninCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Melatonin category page", priority = 126)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMelatoninCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //Herbal Reference Guide Test Cases

    @Test(description = "Make sure that Herbal Reference Guide section is displayed correctly ", priority = 127)
    public void verifyHerbalReferenceGuideSectionIsDisplayedCorrectly(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideTitle().getText(), "Herbal Reference Guide");
        ArrayList<String> expectedOptions = new ArrayList<String>() {{
            add("Tumeric");
            add("Dandelion");
            add("Ginseng");
            add("Milk Thistle");
            add("Alfalfa");
        }};
        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().size(); i++) {
            Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(i).getText(), expectedOptions.get(i));
            System.out.println("Actual: "+aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(i).getText()+"  Expected: "+expectedOptions.get(i));
        }
    }
    //There's a bug here
    @Test(description = "Make sure clicking on the Tumeric Redirect User To CorrectURL", priority = 128)
    public void verifyClickingOnTumericPageRedirectUserToCorrectURL() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedUrl=aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(0).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(0).click();
        Assert.assertEquals(webDriver.getCurrentUrl().replace(aeDomain,""),expectedUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //There's a bug here
    @Test(description = "Make sure clicking on the Dandelion Redirect User To CorrectURL", priority = 129)
    public void verifyClickingOnDandelionPageRedirectUserToCorrectURL() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedUrl=aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(1).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(1).click();
        Assert.assertEquals(webDriver.getCurrentUrl().replace(aeDomain,""),expectedUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //There's a bug here
    @Test(description = "Make sure clicking on the Ginseng Redirect User To CorrectURL", priority = 130)
    public void verifyClickingOnGinsengPageRedirectUserToCorrectURL() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedUrl=aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(2).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(2).click();
        Assert.assertEquals(webDriver.getCurrentUrl().replace(aeDomain,""),expectedUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //There's a bug here
    @Test(description = "Make sure clicking on the Milk Thistle Redirect User To CorrectURL", priority = 131)
    public void verifyClickingOnMilkThistlePageRedirectUserToCorrectURL() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedUrl=aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(3).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(3).click();
        Assert.assertEquals(webDriver.getCurrentUrl().replace(aeDomain,""),expectedUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //There's a bug here
    @Test(description = "Make sure clicking on the Alfalfa Redirect User To CorrectURL", priority = 132)
    public void verifyClickingOnAlfalfaPageRedirectUserToCorrectURL() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedUrl=aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(4).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(4).click();
        Assert.assertEquals(webDriver.getCurrentUrl().replace(aeDomain,""),expectedUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Tumeric Page ", priority = 133)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInTheTumericPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnTumericPageRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Dandelion Page ", priority = 134)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInTheDandelionPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDandelionPageRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Ginseng Page ", priority = 135)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInTheGinsengPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnGinsengPageRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Milk Thistle Page ", priority = 136)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInTheMilkThistlePage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMilkThistlePageRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Alfalfa Page ", priority = 137)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInTheAlfalfaPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAlfalfaPageRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Tumeric page", priority = 138)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInTumericPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnTumericPageRedirectUserToCorrectURL();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Dandelion page", priority = 139)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInDandelionPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnDandelionPageRedirectUserToCorrectURL();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Ginseng page", priority = 140)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInGinsengPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnGinsengPageRedirectUserToCorrectURL();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Milk Thistle page", priority = 141)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMilkThistlPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnMilkThistlePageRedirectUserToCorrectURL();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Alfalfa page", priority = 142)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInAlfalfaPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnAlfalfaPageRedirectUserToCorrectURL();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Verify that the search button works correctly from the Tumeric page", priority = 143)
    public void verifySearchBtnWorksCorrectlyFromTumericPage(){
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnTumericPageRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Verify that the search button works correctly from the Dandelion  page", priority = 144)
    public void verifySearchBtnWorksCorrectlyFromDandelionPage(){
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnDandelionPageRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Verify that the search button works correctly from the Ginseng  page", priority = 145)
    public void verifySearchBtnWorksCorrectlyFromGinsengPage(){
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnGinsengPageRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Verify that the search button works correctly from the Milk Thistle  page", priority = 146)
    public void verifySearchBtnWorksCorrectlyFromMilkThistlePage(){
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnMilkThistlePageRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //There's a bug here because the page is not opened correctly
    @Test(description = "Verify that the search button works correctly from the Alfalfa  page", priority = 147)
    public void verifySearchBtnWorksCorrectlyFromAlfalfaePage(){
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnAlfalfaPageRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //Shop By Health Need Test Cases
    @Test(description = "Make sure the Shop By Health Need section is displayed ", priority = 148)
    public void verifyShopByHealthNeedInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getShopByHealthNeedTitle().getText(),"Shop By Health Need","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getShopByHealthNeedSection().isDisplayed());
    }
    @Test(description = "Make sure the next item button appears in the Shop By Health Need section works correctly ", priority = 149)
    public void verifyNextButtonAppearsInTheShopByHealthNeedSectionWorksCorrectly() throws InterruptedException {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getBeautyCategory().isDisplayed());
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getBoneAndJointCategory().isDisplayed());
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getBrainSupportCategory().isDisplayed());
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getDetoxAndLiverSupportCategory().isDisplayed());
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getDigestiveSupportCategory(),3);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getDigestiveSupportCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getEnergyFormulasCategory(),3);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getEnergyFormulasCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getHairAndSkinAndNailsCategory(),3);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getHairAndSkinAndNailsCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getHeartHealthCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getHeartHealthCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getImmunitySupporCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getImmunitySupporCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getKidsHealthCategory(),6);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getKidsHealthCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMensHealthCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getSexualHealthCategory(),6);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getSexualHealthCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getSleepSupportCategory(),6);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getSleepSupportCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getDietWeightManagementCategory(),6);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getDietWeightManagementCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getWomenHealthCategory(),6);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getWomenHealthCategory().isDisplayed());
    }
//There's a performance issue here
    @Test(description = "Make sure the Previous item button appears in the Shop By Health Need section works correctly ", priority = 150)
    public void verifyPreviousButtonAppearsInTheShopByHealthNeedSectionWorksCorrectly() throws InterruptedException {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getBeautyCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getWomenHealthCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getWomenHealthCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getDietWeightManagementCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getDietWeightManagementCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getSleepSupportCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getSleepSupportCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getSexualHealthCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getSexualHealthCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getMensHealthCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMensHealthCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getKidsHealthCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getKidsHealthCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getImmunitySupporCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getImmunitySupporCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getHeartHealthCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getHeartHealthCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getHairAndSkinAndNailsCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getHairAndSkinAndNailsCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getEnergyFormulasCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getEnergyFormulasCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getDigestiveSupportCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getDigestiveSupportCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getDetoxAndLiverSupportCategory(),5);
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getDetoxAndLiverSupportCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
        DataHelperAndWait.waitToBeVisible(aeVitaminsAndHealthCategoryPage.getBrainSupportCategory(),5);
    }
    //Beauty Category Test Cases
    @Test(description = "Make sure clicking on the Beauty category inside Shop By Health Need works correctly ", priority = 151)
    public void verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getBeautyCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getBeautyCategory().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Beauty category page ", priority = 152)
    public void verifyResultFieldAndItsVaLueAppearInTheBeautyCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Beauty category page ", priority = 153)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheBeautyCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Beauty Category Page ", priority = 154)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForBeautyCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Beauty category page  ", priority = 155)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInBeautyCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Beauty Category Page ", priority = 156)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInBeautyCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Beauty Category page ", priority = 157)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInBeautyCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Beauty, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Beauty footer appears correctly  ", priority = 158)
    public void verifyBeautyFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Beauty category page", priority = 159)
    public void verifySearchBtnWorksCorrectlyFromBeautyCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Beauty category page is disable when the current page is page 1 ", priority = 160)
    public void verifyThePreviousBtnInBeautyCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Beauty category page works correctly", priority = 161)
    public void verifyThePaginationControlInBeautyCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the previous page button In Beauty Category Page works correctly", priority = 162)
    public void verifyPreviousPageBtnInBeautyCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Beauty Category Page works correctly", priority = 163)
    public void verifyNextPageBtnInBeautyCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Beauty category page", priority = 164)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInBeautyCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the Beauty category page", priority = 165)
    public void verifyFiltrationSectionIsDisplayedInBeautyCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
     Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Bone & Joint Category Test Cases
    @Test(description = "Make sure clicking on the Bone And Joint category inside Shop By Health Need works correctly ", priority = 166)
    public void verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getBoneAndJointCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getBoneAndJointCategory().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Bone And Joint category page ", priority = 167)
    public void verifyResultFieldAndItsVaLueAppearInTheBoneAndJointCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Bone And Joint category page ", priority = 168)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheBoneAndJointCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Bone And Joint Category Page ", priority = 169)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForBoneAndJointCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Bone And Joint category page  ", priority = 170)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInBoneAndJointCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Bone And Joint Category Page ", priority = 171)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInBoneAndJointCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Bone And Joint Category page ", priority = 172)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInBoneAndJointCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Bone & Joint, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Bone And Joint footer appears correctly  ", priority = 173)
    public void verifyBoneAndJointFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Bone And Joint category page", priority = 174)
    public void verifySearchBtnWorksCorrectlyFromBoneAndJointCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Bone And Joint category page is disable when the current page is page 1 ", priority = 175)
    public void verifyThePreviousBtnInBoneAndJointCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Bone And Joint category page works correctly", priority = 176)
    public void verifyThePaginationControlInBoneAndJointCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the previous page button In Bone And Joint Category Page works correctly", priority = 177)
    public void verifyPreviousPageBtnInBoneAndJointCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the Next button
    @Test(description = "Make Sure the next page button In Bone And Joint Category Page works correctly", priority = 178)
    public void verifyNextPageBtnInBoneAndJointCategoryPageWorksCorrectly(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Bone And Joint category page", priority = 179)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInBoneAndJointCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the Bone And Joint category page", priority = 180)
    public void verifyFiltrationSectionIsDisplayedInBoneAndJointCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Brain Support Category Test Cases
    @Test(description = "Make sure clicking on the Brain Support category inside Shop By Health Need works correctly ", priority = 181)
    public void verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getBrainSupportCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getBrainSupportCategory().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Brain Support category page ", priority = 182)
    public void verifyResultFieldAndItsVaLueAppearInTheBrainSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Brain Support category page ", priority = 183)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheBrainSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Brain Support Category Page ", priority = 184)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForBrainSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the BrainSupport category page  ", priority = 185)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInBrainSupportCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Brain Support Category Page ", priority = 186)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInBrainSupportCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Brain Support Category page ", priority = 187)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInBrainSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Brain Support, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Brain Support  footer appears correctly  ", priority = 188)
    public void verifyBrainSupportFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Brain Support category page", priority = 189)
    public void verifySearchBtnWorksCorrectlyFromBrainSupportCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the BrainSupport category page is disable when the current page is page 1 ", priority = 190)
    public void verifyThePreviousBtnInBrainSupportCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Brain Support category page works correctly", priority = 191)
    public void verifyThePaginationControlInBrainSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the previous page button In Brain Support Category Page works correctly", priority = 192)
    public void verifyPreviousPageBtnInBrainSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Brain Support Category Page works correctly", priority = 193)
    public void verifyNextPageBtnInBrainSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Brain Support category page", priority = 194)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInBrainSupportCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the BrainSupport category page", priority = 195)
    public void verifyFiltrationSectionIsDisplayedInBrainSupportCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Detox & Liver Support Category Test Cases
    @Test(description = "Make sure clicking on the Detox & Liver Support category inside Shop By Health Need works correctly ", priority = 196)
    public void verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getDetoxAndLiverSupportCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getDetoxAndLiverSupportCategory().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Detox & Liver Support category page ", priority = 197)
    public void verifyResultFieldAndItsVaLueAppearInTheDetoxAndLiverSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Detox & Liver Support category page ", priority = 198)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheDetoxAndLiverSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Detox & Liver Support Category Page ", priority = 199)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForDetoxAndLiverSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Detox & Liver Support category page  ", priority = 200)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInDetoxAndLiverSupportCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Detox & Liver Support Category Page ", priority = 201)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInDetoxAndLiverSupportCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Detox & Liver Support Category page ", priority = 202)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInDetoxAndLiverSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Detox & Cleanse, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Detox & Liver Support  footer appears correctly  ", priority = 203)
    public void verifyDetoxAndLiverSupportFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Detox & Liver Support category page", priority = 204)
    public void verifySearchBtnWorksCorrectlyFromDetoxAndLiverSupportCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Detox & Liver Support category page is disable when the current page is page 1 ", priority = 205)
    public void verifyThePreviousBtnInDetoxAndLiverSupportCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Detox & Liver Support category page works correctly", priority = 206)
    public void verifyThePaginationControlInDetoxAndLiverSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the previous page button In Detox & Liver Support Category Page works correctly", priority = 207)
    public void verifyPreviousPageBtnInDetoxAndLiverCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Detox & Liver Support Category Page works correctly", priority = 208)
    public void verifyNextPageBtnInDetoxAndLiverSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Detox & Liver Support category page", priority = 209)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInDetoxAndLiverSupportCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the Detox & Liver Support category page", priority = 210)
    public void verifyFiltrationSectionIsDisplayedInDetoxAndLiverSupportCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Digestive Support Category Test Cases
    @Test(description = "Make sure clicking on the Digestive Support category inside Shop By Health Need works correctly ", priority = 211)
    public void verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getDigestiveSupportCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getDigestiveSupportCategory().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Digestive Support category page ", priority = 212)
    public void verifyResultFieldAndItsVaLueAppearInTheDigestiveSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Digestive Support category page ", priority = 213)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheDigestiveSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Digestive Support Category Page ", priority = 214)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForDigestiveSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Detox & Liver Support category page  ", priority = 215)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInDigestiveSupportCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Digestive Support Category Page ", priority = 216)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInDigestiveSupportCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Digestive Support Category page ", priority = 217)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInDigestiveSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Detox & Cleanse, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Digestive Support  footer appears correctly  ", priority = 218)
    public void verifyDigestiveSupportFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Digestive Support category page", priority = 219)
    public void verifySearchBtnWorksCorrectlyFromDigestiveSupportCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Digestive Support category page is disable when the current page is page 1 ", priority = 220)
    public void verifyThePreviousBtnInDigestiveSupportCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Digestive Support category page works correctly", priority = 221)
    public void verifyThePaginationControlInDigestiveSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the previous page button In Digestive Support Category Page works correctly", priority = 222)
    public void verifyPreviousPageBtnInDigestiveSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Digestive Support Category Page works correctly", priority = 223)
    public void verifyNextPageBtnInDigestiveSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Digestive Support category page", priority = 224)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInDigestiveSupportCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the Digestive Support category page", priority = 225)
    public void verifyFiltrationSectionIsDisplayedInDigestiveSupportCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Energy Formulas Category Test Cases
    @Test(description = "Make sure clicking on the Energy Formulas category inside Shop By Health Need works correctly ", priority = 226)
    public void verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInShopByHealthNeedSection().click();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getEnergyFormulasCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getEnergyFormulasCategory().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Energy Formulas category page ", priority = 227)
    public void verifyResultFieldAndItsVaLueAppearInTheEnergyFormulasCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Energy Formulas category page ", priority = 228)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheEnergyFormulasCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Energy Formulas Category Page ", priority = 229)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForEnergyFormulasCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Energy Formulas Category Page  ", priority = 230)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInEnergyFormulasCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Energy Formulas Category Page ", priority = 231)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInEnergyFormulasCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Energy Formulas Category page ", priority = 232)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInEnergyFormulasCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Energy Formulas, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Energy Formulas  footer appears correctly  ", priority = 233)
    public void verifyEnergyFormulasFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Energy Formulas category page", priority = 234)
    public void verifySearchBtnWorksCorrectlyFromEnergyFormulasCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Energy Formulas category page is disable when the current page is page 1 ", priority = 235)
    public void verifyThePreviousBtnInEnergyFormulasCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Energy Formulas category page works correctly", priority = 236)
    public void verifyThePaginationControlInEnergyFormulasCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the previous page button In Energy Formulas Category Page works correctly", priority = 237)
    public void verifyPreviousPageBtnInEnergyFormulasCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Energy Formulas Category Page works correctly", priority = 238)
    public void verifyNextPageBtnInEnergyFormulasCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Energy Formulas category page", priority = 239)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInEnergyFormulasCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the Energy Formulas category page", priority = 240)
    public void verifyFiltrationSectionIsDisplayedInEnergyFormulasCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Hair, Skin & Nails, Beauty Category Test Cases
    @Test(description = "Make sure clicking on the Hair, Skin & Nails, Beauty category inside Shop By Health Need works correctly ", priority = 241)
    public void verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInShopByHealthNeedSection().click();
        aeVitaminsAndHealthCategoryPage.getNextIconInShopByHealthNeedSection().click();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getHairAndSkinAndNailsCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHairAndSkinAndNailsCategory().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Hair, Skin & Nails, Beauty category page ", priority = 242)
    public void verifyResultFieldAndItsVaLueAppearInTheHairAndSkinAndNailsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Hair, Skin & Nails, Beauty category page ", priority = 243)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheHairAndSkinAndNailsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Hair, Skin & Nails, Beauty Category Page ", priority = 244)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForHairAndSkinAndNailsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Hair, Skin & Nails, Beauty Category Page  ", priority = 245)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInHairAndSkinAndNailsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Hair, Skin & Nails, Beauty Category Page ", priority = 246)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInHairAndSkinAndNailsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Hair, Skin & Nails, Beauty Category page ", priority = 247)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInHairAndSkinAndNailsCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Hair, Skin & Nails, Beauty", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Hair, Skin & Nails, Beauty  footer appears correctly  ", priority = 248)
    public void verifyHairAndSkinAndNailsFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Hair, Skin & Nails, Beauty category page", priority = 249)
    public void verifySearchBtnWorksCorrectlyFromHairAndSkinAndNailsCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Hair, Skin & Nails, Beauty category page is disable when the current page is page 1 ", priority = 250)
    public void verifyThePreviousBtnInHairAndSkinAndNailsCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Hair, Skin & Nails, Beauty category page works correctly", priority = 251)
    public void verifyThePaginationControlInHairAndSkinAndNailsCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the previous page button In Hair, Skin & Nails, Beauty Category Page works correctly", priority = 252)
    public void verifyPreviousPageBtnInHairAndSkinAndNailsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Hair, Skin & Nails, Beauty Category Page works correctly", priority = 253)
    public void verifyNextPageBtnInHairAndSkinAndNailsCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Hair, Skin & Nails, Beauty category page", priority = 254)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInHairAndSkinAndNailsCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the Hair, Skin & Nails, Beauty category page", priority = 255)
    public void verifyFiltrationSectionIsDisplayedInHairAndSkinAndNailsCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Heart Health Category Test Cases
    @Test(description = "Make sure clicking on the Heart Health category inside Shop By Health Need works correctly ", priority = 256)
    public void verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getHeartHealthCategory().getAttribute("href");
        DataHelperAndWait.waitToBeClickable(aeVitaminsAndHealthCategoryPage.getHeartHealthCategory(),5);
        aeVitaminsAndHealthCategoryPage.getHeartHealthCategory().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Heart Health category page ", priority = 257)
    public void verifyResultFieldAndItsVaLueAppearInTheHeartHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Heart Health category page ", priority = 258)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheHeartHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Heart Health Category Page ", priority = 259)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForHeartHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Heart Health Category Page  ", priority = 260)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInHeartHealthCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Heart Health Category Page ", priority = 261)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInHeartHealthCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Heart Health Category page ", priority = 262)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInHeartHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Heart Health, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Heart Health  footer appears correctly  ", priority = 263)
    public void verifyHeartHealthFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Heart Health category page", priority = 264)
    public void verifySearchBtnWorksCorrectlyFromHeartHealthCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Heart Health category page is disable when the current page is page 1 ", priority = 265)
    public void verifyThePreviousBtnInHeartHealthCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Heart Health category page works correctly", priority = 266)
    public void verifyThePaginationControlInHeartHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the previous page button In Heart Health Category Page works correctly", priority = 267)
    public void verifyPreviousPageBtnInHeartHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyThePaginationControlInHeartHealthCategoryPageWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Heart Health Category Page works correctly", priority = 268)
    public void verifyNextPageBtnInHeartHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Heart Health category page", priority = 269)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInHeartHealthCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the Heart Health category page", priority = 270)
    public void verifyFiltrationSectionIsDisplayedInHeartHealthCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Immunity Support Category Test Cases
    @Test(description = "Make sure clicking on the Immunity Support category inside Shop By Health Need works correctly ", priority = 271)
    public void verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getImmunitySupporCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnImmunitySupportCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Immunity Support category page ", priority = 272)
    public void verifyResultFieldAndItsVaLueAppearInTheImmunitySupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Immunity Support category page ", priority = 273)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheImmunitySupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Immunity Support Category Page ", priority = 274)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForImmunitySupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Immunity Support Category Page  ", priority = 275)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInImmunitySupportCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Immunity Support Category Page ", priority = 276)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInImmunitySupportCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Immunity Support Category page ", priority = 277)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInImmunitySupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Immune Support, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Immunity Support footer appears correctly  ", priority = 278)
    public void verifyImmunitySupportFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Immunity Support category page", priority = 279)
    public void verifySearchBtnWorksCorrectlyFromImmunitySupportCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Immunity Support category page is disable when the current page is page 1 ", priority = 280)
    public void verifyThePreviousBtnInImmunitySupportCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Immunity Support category page works correctly", priority = 281)
    public void verifyThePaginationControlInImmunitySupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the previous page button In Immunity Support Category Page works correctly", priority = 282)
    public void verifyPreviousPageBtnInImmunitySupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Immunity Support Category Page works correctly", priority = 283)
    public void verifyNextPageBtnInImmunitySupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Immunity Support category page", priority = 284)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInImmunitySupportCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the Immunity Support category page", priority = 285)
    public void verifyFiltrationSectionIsDisplayedInImmunitySupportCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Kid's Health Category Test Cases
    @Test(description = "Make sure clicking on the Kids Health category inside Shop By Health Need works correctly ", priority = 286)
    public void verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getKidsHealthCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnKidsHealthCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Kids Health category page ", priority = 287)
    public void verifyResultFieldAndItsVaLueAppearInTheKidsHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Kids Health category page ", priority = 288)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheKidsHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Kids Health Category Page ", priority = 289)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForKidsHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Kids Health Category Page  ", priority = 290)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInKidsHealthCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Kids Health Category Page ", priority = 291)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInKidsHealthCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Kids Health Category page ", priority = 292)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInKidsHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Immune Support, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Kids Health footer appears correctly  ", priority = 293)
    public void verifyKidsHealthFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Kids Health category page", priority = 294)
    public void verifySearchBtnWorksCorrectlyFromKidsHealthCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Kids Health category page is disable when the current page is page 1 ", priority = 295)
    public void verifyThePreviousBtnInKidsHealthCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Kids Health category page works correctly", priority = 296)
    public void verifyThePaginationControlInKidsHealthategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the previous page button In Kids Health Category Page works correctly", priority = 297)
    public void verifyPreviousPageBtnInKidsHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Kids Health Category Page works correctly", priority = 298)
    public void verifyNextPageBtnInKidsHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Kids Health category page", priority = 299)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInKidsHealthCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the Kids Health category page", priority = 300)
    public void verifyFiltrationSectionIsDisplayedInKidsHealthCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Men's Health Category Test Cases
    @Test(description = "Make sure clicking on the Mens Health category inside Shop By Health Need works correctly ", priority = 301)
    public void verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getMensHealthCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnMensHealthCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Mens Health category page ", priority = 302)
    public void verifyResultFieldAndItsVaLueAppearInTheMensHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Mens Health category page ", priority = 303)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMensHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Mens Health Category Page ", priority = 304)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForMensHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Mens Health Category Page  ", priority = 305)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMensHealthCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Mens Health Category Page ", priority = 306)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMensHealthCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Mens Health Category page ", priority = 307)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInMensHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Mens Health, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Mens Health footer appears correctly  ", priority = 308)
    public void verifyMensHealthFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Mens Health category page", priority = 309)
    public void verifySearchBtnWorksCorrectlyFromMensHealthCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Mens Health category page is disable when the current page is page 1 ", priority = 310)
    public void verifyThePreviousBtnInMensHealthCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Mens Health category page works correctly", priority = 311)
    public void verifyThePaginationControlInMensHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the previous page button In Mens Health Category Page works correctly", priority = 312)
    public void verifyPreviousPageBtnInMensHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Mens Health Category Page works correctly", priority = 313)
    public void verifyNextPageBtnInMensHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Mens Health category page", priority = 314)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMensHealthCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    @Test(description = "Make sure the Filtration Section is displayed in the Mens Health category page", priority = 315)
    public void verifyFiltrationSectionIsDisplayedInMensHealthCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Sexual Health Category Test Cases
    @Test(description = "Make sure clicking on the Sexual Health category inside Shop By Health Need works correctly ", priority = 316)
    public void verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getSexualHealthCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnSexualHealthCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        Assert.assertTrue(webDriver.getCurrentUrl().contains("sexual-health"));
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Sexual Health category page ", priority = 317)
    public void verifyResultFieldAndItsVaLueAppearInTheSexualHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Sexual Health category page ", priority = 318)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSexualHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Sexual Health Category Page ", priority = 319)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForSexualHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Sexual Health Category Page  ", priority = 320)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSexualHealthCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Sexual Health Category Page ", priority = 321)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSexualHealthCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Sexual Health Category page ", priority = 322)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInSexualHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Sexual Health, Featured", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Sexual Health footer appears correctly  ", priority = 323)
    public void verifySexualHealthFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Sexual Health category page", priority = 324)
    public void verifySearchBtnWorksCorrectlyFromSexualHealthCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Sexual Health category page is disable when the current page is page 1 ", priority = 325)
    public void verifyThePreviousBtnInSexualHealthCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
        @Test(description = "Make Sure the Pagination control in the Sexual Health category page works correctly", priority = 326)
    public void verifyThePaginationControlInSexualHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the previous page button In Sexual Health Category Page works correctly", priority = 327)
    public void verifyPreviousPageBtnInSexualHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Sexual Health Category Page works correctly", priority = 328)
    public void verifyNextPageBtnInSexualHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Sexual Health category page", priority = 329)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSexualHealthCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //There's a bug here, due to the filtration section is missing
    @Test(description = "Make sure the Filtration Section is displayed in the Sexual Health category page", priority = 330)
    public void verifyFiltrationSectionIsDisplayedInSexualHealthCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Sleep Support Category Test Cases
    @Test(description = "Make sure clicking on the Sleep Support category inside Shop By Health Need works correctly ", priority = 331)
    public void verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getSexualHealthCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnSleepSupportCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        Assert.assertTrue(webDriver.getCurrentUrl().contains("sleep-support"));
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Sleep Support category page ", priority = 332)
    public void verifyResultFieldAndItsVaLueAppearInTheSleepSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Sleep Support category page ", priority = 333)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSleepSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Sleep Support Category Page ", priority = 334)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForSleepSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Sleep Support Category Page  ", priority = 335)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSleepSupportCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Sleep Support Category Page ", priority = 336)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSleepSupportCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Sleep Support Category page ", priority = 337)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInSleepSupportCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Sleep Support, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Sleep Support footer appears correctly  ", priority = 338)
    public void verifySleepSupportFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Sleep Support category page", priority = 339)
    public void verifySearchBtnWorksCorrectlyFromSleepSupportCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Sleep Support category page is disable when the current page is page 1 ", priority = 340)
    public void verifyThePreviousBtnInSleepSupportCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Sleep Support category page works correctly", priority = 341)
    public void verifyThePaginationControlInSleepSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the previous page button In Sleep Support Category Page works correctly", priority = 342)
    public void verifyPreviousPageBtnInSleepSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Sleep Support Category Page works correctly", priority = 343)
    public void verifyNextPageBtnInSleepSupportCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Sleep Support category page", priority = 344)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSleepSupportCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //There's a bug here, due to the filtration section is missing
    @Test(description = "Make sure the Filtration Section is displayed in the Sleep Support category page", priority = 345)
    public void verifyFiltrationSectionIsDisplayedInSleepSupportCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Diet Weight Management Category Test Cases
    @Test(description = "Make sure clicking on the Diet Weight Management category inside Shop By Health Need works correctly ", priority = 346)
    public void verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getSexualHealthCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnDietWeightManagementCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        Assert.assertTrue(webDriver.getCurrentUrl().contains("weight-management"));
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Diet Weight Management category page ", priority = 347)
    public void verifyResultFieldAndItsVaLueAppearInTheDietWeightManagementCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Diet Weight Management category page ", priority = 348)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheDietWeightManagementCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
        @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Diet Weight Management Category Page ", priority = 349)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForDietWeightManagementCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Diet Weight Management Category Page  ", priority = 350)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInDietWeightManagementCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Diet Weight Management Category Page ", priority = 351)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInDietWeightManagementCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Diet Weight Management Category page ", priority = 352)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInDietWeightManagementCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Weight Management , Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Diet Weight Management footer appears correctly  ", priority = 353)
    public void verifyDietWeightManagementFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Diet Weight Management category page", priority = 354)
    public void verifySearchBtnWorksCorrectlyFromDietWeightManagementCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Diet Weight Management category page is disable when the current page is page 1 ", priority = 355)
    public void verifyThePreviousBtnInDietWeightManagementCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Diet Weight Management category page works correctly", priority = 356)
    public void verifyThePaginationControlInDietWeightManagementCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the previous page button In Diet Weight Management Category Page works correctly", priority = 357)
    public void verifyPreviousPageBtnInDietWeightManagementCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Diet Weight Management Category Page works correctly", priority = 358)
    public void verifyNextPageBtnInDietWeightManagementCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Diet Weight Management category page", priority = 359)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInDietWeightManagementCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //There's a bug here, due to the filtration section is missing
    @Test(description = "Make sure the Filtration Section is displayed in the Diet Weight Management category page", priority = 360)
    public void verifyFiltrationSectionIsDisplayedInDietWeightManagementCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Women Health Category Test Cases
    @Test(description = "Make sure clicking on the Women Health category inside Shop By Health Need works correctly ", priority = 361)
    public void verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getSexualHealthCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnWomenHealthCategory();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        Assert.assertTrue(webDriver.getCurrentUrl().contains("women-s-health/"));
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Women Health category page ", priority = 362)
    public void verifyResultFieldAndItsVaLueAppearInTheWomenHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(description = "Make sure that Sort By menu and its options appear correctly in the Women Health category page ", priority = 363)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheWomenHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: "+options.get(i).getText()+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu for Women Health Category Page ", priority = 364)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForWomenHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Women Health Category Page  ", priority = 365)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInWomenHealthCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Women Health Category Page ", priority = 366)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInDietWomenHealthCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Women Health Category page ", priority = 367)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInWomenHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Womens Health, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure  the Women Health footer appears correctly  ", priority = 368)
    public void verifyWomenHealthFooterSectionAppearsCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Verify that the search button works correctly from the Women Health category page", priority = 369)
    public void verifySearchBtnWorksCorrectlyFromDietWomenHealthCategoryPage(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button in the Women Health category page is disable when the current page is page 1 ", priority = 370)
    public void verifyThePreviousBtnInWomenHealthCategoryPageIsDisableWhenDisplayPage1(){
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(description = "Make Sure the Pagination control in the Women Health category page works correctly", priority = 371)
    public void verifyThePaginationControlInWomenHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the previous page button In Women Health Category Page works correctly", priority = 372)
    public void verifyPreviousPageBtnInWomenHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(description = "Make Sure the next page button In Women Health Category Page works correctly", priority = 373)
    public void verifyNextPageBtnInWomenHealthCategoryPageWorksCorrectly() throws InterruptedException{
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Women Health category page", priority = 374)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWomenHealthCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //There's a bug here, due to the filtration section is missing
    @Test(description = "Make sure the Filtration Section is displayed in the Women Health category page", priority = 375)
    public void verifyFiltrationSectionIsDisplayedInWomenHealthCategoryPage(){
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Fish Oil And Omegas Section Test Cases
    @Test(description = "Make sure the Fish Oil And Omegas section is displayed ", priority = 376)
    public void verifyFishOilAndOmegasSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionTitle().getText(),"Fish Oil & Omegas","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSection().isDisplayed());
    }
    @Test(description = "Make sure the previous arrow icon is not appear by default in the Fish Oil And Omegas section ", priority = 377)
    public void verifyPreviousArrowButtonInFishOilAndOmegasSectionIsNotDisplayedByDefault() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInFishOilAndOmegasSection().isDisplayed());
    }
    @Test(description = "Make sure clicking on Next Button in the Fish Oil And Omegas section works correctly", priority = 378)
    public void verifyClickingOnNextIconInFishOilAndOmegasSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInFishOilAndOmegasSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(description = "Make sure clicking on Previous Button in the Fish Oil And Omegas section works correctly", priority = 379)
        public void verifyClickingOnPreviousIconInFishOilAndOmegasSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInFishOilAndOmegasSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInFishOilAndOmegasSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionDefaultPosition().isDisplayed());
    }
    @Test(description = "Make sure clicking on the View All button in the Fish Oil And Omegas section works correctly ", priority = 380)
    public void verifyClickingOnViewAllBtnInsideFishOilAndOmegasSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInFishOilAndOmegasSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInFishOilAndOmegasSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure clicking on the product card in the Fish Oil And Omegas section works correctly ", priority = 381)
    public void verifyClickingOnProductCardInsideFishOilAndOmegasSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getProductCardInFishOilAndOmegasSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //Multi Vitamins Section Test Cases
    @Test(description = "Make sure the MultiVitamins section is displayed ", priority = 382)
    public void verifyMultiVitaminsSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionTitle().getText(),"Multivitamins","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSection().isDisplayed());
    }
    @Test(description = "Make sure the previous arrow icon is not appear by default in the MultiVitamins section ", priority = 383)
    public void verifyPreviousArrowButtonInMultiVitaminsSectionIsNotDisplayedByDefault() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInMultiVitaminsSection().isDisplayed());
    }
    @Test(description = "Make sure clicking on Next Button in the MultiVitamins section works correctly", priority = 384)
    public void verifyClickingOnNextIconInMultiVitaminsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInMultiVitaminsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(description = "Make sure clicking on Previous Button in the MultiVitamins section works correctly", priority = 385)
    public void verifyClickingOnPreviousIconInMultiVitaminsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInMultiVitaminsSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInMultiVitaminsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(description = "Make sure clicking on the View All button in the MultiVitamins section works correctly ", priority = 386)
    public void verifyClickingOnViewAllBtnInsideMultiVitaminsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInMultiVitaminsSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInMultiVitaminsSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure clicking on the product card in the MultiVitamins section works correctly ", priority = 387)
    public void verifyClickingOnProductCardInsideMultiVitaminsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getProductCardInMultiVitaminsSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //Vitamins A-Z Section Test Cases
    @Test(description = "Make sure the Vitamins A-Z section is displayed ", priority = 388)
    public void verifyVitaminsAZSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getVitaminsAZSectionTitle().getText(),"Vitamins A-Z","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getVitaminsAZSection().isDisplayed());
    }
    @Test(description = "Make sure the previous arrow icon is not appear by default in the Vitamins A-Z section ", priority = 389)
    public void verifyPreviousArrowButtonInVitaminsAZSectionIsNotDisplayedByDefault() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInVitaminsAZSection().isDisplayed());
    }
    @Test(description = "Make sure clicking on Next Button in the Vitamins A-Z section works correctly", priority = 390)
    public void verifyClickingOnNextIconInVitaminsAZSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInVitaminsAZSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(description = "Make sure clicking on Previous Button in the Vitamins A-Z section works correctly", priority = 391)
    public void verifyClickingOnPreviousIconInVitaminsAZSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInVitaminsAZSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInVitaminsAZSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(description = "Make sure clicking on the View All button in the Vitamins A-Z section works correctly ", priority = 392)
    public void verifyClickingOnViewAllBtnInsideVitaminsAZSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInVitaminsAZSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInVitaminsAZSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure clicking on the product card in the Vitamins A-Z section works correctly ", priority = 393)
    public void verifyClickingOnProductCardInsideVitaminsAZSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getProductCardIVitaminsAZSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //Minerals Section Test Cases
    @Test(description = "Make sure the Minerals section is displayed ", priority = 394)
    public void verifyMineralsSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getMineralsSectionTitle().getText(),"Minerals","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMineralsSection().isDisplayed());
    }
    @Test(description = "Make sure the previous arrow icon is not appear by default in the Minerals section ", priority = 395)
    public void verifyPreviousArrowButtonInMineralsSectionIsNotDisplayedByDefault() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInMineralsSection().isDisplayed());
    }
    @Test(description = "Make sure clicking on Next Button in the Minerals section works correctly", priority = 396)
    public void verifyClickingOnNextIconInMineralsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInMineralsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(description = "Make sure clicking on Previous Button in the Minerals section works correctly", priority = 397)
    public void verifyClickingOnPreviousIconInMineralsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInMineralsSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInMineralsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(description = "Make sure clicking on the View All button in the Minerals section works correctly ", priority = 398)
    public void verifyClickingOnViewAllBtnInsideMineralsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInMineralsSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInMineralsSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure clicking on the product card in the Minerals section works correctly ", priority = 399)
    public void verifyClickingOnProductCardInsideMineralsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getProductCardInMineralsSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //Antioxidants Section Test Cases
    @Test(description = "Make sure the Antioxidants section is displayed ", priority = 400)
    public void verifyAntioxidantsSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getAntioxidantsSectionTitle().getText(),"Antioxidants","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getAntioxidantsSection().isDisplayed());
    }
    @Test(description = "Make sure the previous arrow icon is not appear by default in the Antioxidants section ", priority = 401)
    public void verifyPreviousArrowButtonInAntioxidantsSectionIsNotDisplayedByDefault() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInAntioxidantsSection().isDisplayed());
    }
    @Test(description = "Make sure clicking on Next Button in the Antioxidants section works correctly", priority = 402)
    public void verifyClickingOnNextIconInAntioxidantsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInAntioxidantsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(description = "Make sure clicking on Previous Button in the Antioxidants section works correctly", priority = 403)
    public void verifyClickingOnPreviousIconInAntioxidantsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInAntioxidantsSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInAntioxidantsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(description = "Make sure clicking on the View All button in the Antioxidants section works correctly ", priority = 404)
    public void verifyClickingOnViewAllBtnInsideAntioxidantsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInAntioxidantsSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInAntioxidantsSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure clicking on the product card in the Antioxidants section works correctly ", priority = 405)
    public void verifyClickingOnProductCardInsideAntioxidantsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getProductCardInAntioxidantsSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //Superfoods Section Test Cases
    @Test(description = "Make sure the Superfoods section is displayed ", priority = 406)
    public void verifySuperfoodsSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getSuperFoodSectionTitle().getText(),"Superfoods","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getSuperFoodSection().isDisplayed());
    }
    @Test(description = "Make sure the previous arrow icon is not appear by default in the Superfoods section ", priority = 407)
    public void verifyPreviousArrowButtonInSuperfoodsSectionIsNotDisplayedByDefault() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInSuperFoodSection().isDisplayed());
    }
    @Test(description = "Make sure clicking on Next Button in the Superfoods section works correctly", priority = 408)
    public void verifyClickingOnNextIconInSuperfoodsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInSuperFoodSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(description = "Make sure clicking on Previous Button in the Superfoods section works correctly", priority = 409)
    public void verifyClickingOnPreviousIconInSuperfoodsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInSuperFoodSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInSuperFoodSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(description = "Make sure clicking on the View All button in the Superfoods section works correctly ", priority = 410)
    public void verifyClickingOnViewAllBtnInsideSuperfoodsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInSuperFoodSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInSuperFoodSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure clicking on the product card in the Superfoods section works correctly ", priority = 411)
    public void verifyClickingOnProductCardInsideSuperfoodsSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getProductCardInSuperFoodSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //Melatonin Section Test Cases
    @Test(description = "Make sure the Melatonin section is displayed ", priority = 412)
    public void verifyMelatoninSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getMelatoninSectionTitle().getText(),"Melatonin","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMelatoninSection().isDisplayed());
    }
    @Test(description = "Make sure the previous arrow icon is not appear by default in the Melatonin section ", priority = 413)
    public void verifyPreviousArrowButtonInMelatoninSectionIsNotDisplayedByDefault() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInMelatoninSection().isDisplayed());
    }
    @Test(description = "Make sure clicking on Next Button in the Melatonin section works correctly", priority = 414)
    public void verifyClickingOnNextIconInMelatoninSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInMelatoninSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(description = "Make sure clicking on Previous Button in the Melatonin section works correctly", priority = 415)
    public void verifyClickingOnPreviousIconInMelatoninSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInMelatoninSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInMelatoninSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(description = "Make sure clicking on the View All button in the Melatonin section works correctly ", priority = 416)
    public void verifyClickingOnViewAllBtnInsideMelatoninSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInMelatoninSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInMelatoninSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure clicking on the product card in the Melatonin section works correctly ", priority = 417)
    public void verifyClickingOnProductCardInsideMelatoninSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getProductCardInMelatoninSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    //Collagen Section Test Cases
    @Test(description = "Make sure the Collagen section is displayed ", priority = 418)
    public void verifyCollagenSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getCollagenSectionTitle().getText(),"Collagen","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getCollagenSection().isDisplayed());
    }
    @Test(description = "Make sure the previous arrow icon is not appear by default in the Collagen section ", priority = 419)
    public void verifyPreviousArrowButtonInCollagenSectionIsNotDisplayedByDefault() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInCollagenSection().isDisplayed());
    }
    @Test(description = "Make sure clicking on Next Button in the Collagen section works correctly", priority = 420)
    public void verifyClickingOnNextIconInCollagenSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInCollagenSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(description = "Make sure clicking on Previous Button in the Collagen section works correctly", priority = 421)
    public void verifyClickingOnPreviousIconInCollagenSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage=new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInCollagenSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInCollagenSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(description = "Make sure clicking on the View All button in the Collagen section works correctly ", priority = 422)
    public void verifyClickingOnViewAllBtnInsideCollagenSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInCollagenSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInCollagenSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(description = "Make sure clicking on the product card in the Collagen section works correctly ", priority = 423)
    public void verifyClickingOnProductCardInsideCollagenSectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getProductCardInCollagenSection().click();
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Vitamins And Health category page", priority = 424)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInVitaminsAndHealthCategoryPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }

    @Test(description = "Make sure the Footer section appears correctly in the Vitamins And Health category page", priority = 425)
    public void verifyFooterSectionAppearsCorrectlyInVitaminsAndHealthCategoryPage(){
        aeFooterPage= new AEFooterPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }
    //Pagination control for all pages in the Vitamins And Health category page

    @Test(description = "Make Sure the ability to access all pages inside Fish Oil And Omegas Category From Vitamins And Health Category Page  ", priority = 426)
    public void verifyAbilityToAccessAllPagesInsideFishOilAndOmegasCategoryFromVitaminsAndHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    //There's a bug here
    @Test(description = "Make Sure the ability to access all pages inside Multivitamins Category From Vitamins And Health Category Page  ", priority = 427)
    public void verifyAbilityToAccessAllPagesInsideMultivitaminsCategoryFromVitaminsAndHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "Make Sure the ability to access all pages inside VitaminsA_Z Category From Vitamins And Health Category Page  ", priority = 428)
    public void verifyAbilityToAccessAllPagesInsideVitaminsA_ZCategoryFromVitaminsAndHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "Make Sure the ability to access all pages inside Minerals Category From Vitamins And Health Category Page  ", priority = 429)
    public void verifyAbilityToAccessAllPagesInsideMineralsCategoryFromVitaminsAndHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "Make Sure the ability to access all pages inside Antioxidants Category From Vitamins And Health Category Page  ", priority = 430)
    public void verifyAbilityToAccessAllPagesInsideAntioxidantsCategoryFromVitaminsAndHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "Make Sure the ability to access all pages inside Superfoods Category From Vitamins And Health Category Page  ", priority = 431)
    public void verifyAbilityToAccessAllPagesInsideSuperfoodsCategoryFromVitaminsAndHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    //There's a bug here
   @Test(description = "Make Sure the ability to access all pages inside Collagen Category From Vitamins And Health Category Page  ", priority = 432)
    public void verifyAbilityToAccessAllPagesInsideCollagenCategoryFromVitaminsAndHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Melatonin Category From Vitamins And Health Category Page  ", priority = 433)
    public void verifyAbilityToAccessAllPagesInsideMelatoninCategoryFromVitaminsAndHealthCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    //There's a bug here
   @Test(description = "Make Sure the ability to access all pages inside Beauty Category Inside The Shop By Health Need  ", priority = 434)
    public void verifyAbilityToAccessAllPagesInsideBeautyCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Bone And Joint Category Inside The Shop By Health Need  ", priority = 435)
    public void verifyAbilityToAccessAllPagesInsideBoneAndJointCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Brain Support Category Inside The Shop By Health Need  ", priority = 436)
    public void verifyAbilityToAccessAllPagesInsideBrainSupportCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Detox And Liver Support Inside The Shop By Health Need  ", priority = 437)
    public void verifyAbilityToAccessAllPagesInsideDetoxAndLiverSupportCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Digestive Support Inside The Shop By Health Need  ", priority = 438)
    public void verifyAbilityToAccessAllPagesInsideDigestiveSupportCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    //There's a bug here
   @Test(description = "Make Sure the ability to access all pages inside Energy Formulas Inside The Shop By Health Need  ", priority = 439)
    public void verifyAbilityToAccessAllPagesInsideEnergyFormulasCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Hair And Skin And Nails Inside The Shop By Health Need  ", priority = 440)
    public void verifyAbilityToAccessAllPagesInsideHairAndSkinAndNailsCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Heart Health Inside The Shop By Health Need  ", priority = 441)
    public void verifyAbilityToAccessAllPagesInsideHeartHealthCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Immunity Support Inside The Shop By Health Need  ", priority = 442)
    public void verifyAbilityToAccessAllPagesInsideImmunitySupportCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Kid's Health Inside The Shop By Health Need  ", priority = 443)
    public void verifyAbilityToAccessAllPagesInsideKidsHealthCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Men's Health Inside The Shop By Health Need  ", priority = 444)
    public void verifyAbilityToAccessAllPagesInsideMensHealthCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Sexual Health Inside The Shop By Health Need  ", priority = 445)
    public void verifyAbilityToAccessAllPagesInsideSexualHealthCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Sleep Support The Shop By Health Need  ", priority = 446)
    public void verifyAbilityToAccessAllPagesInsideSleepSupportCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }

   @Test(description = "Make Sure the ability to access all pages inside Diet Weight Management The Shop By Health Need  ", priority = 447)
    public void verifyAbilityToAccessAllPagesInsideDietWeightManagementCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
   @Test(description = "Make Sure the ability to access all pages inside Women Health The Shop By Health Need  ", priority = 448)
    public void verifyAbilityToAccessAllPagesInsideWomenHealthCategoryInsideTheShopByHealthNeed(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 449)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
        aeGuestUserPage = new AEGuestUserPage(webDriver);
        this.verifyClickingOnVitaminsAndHealthCategoryFromHomePageRedirectUserToCorrectURL();
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL," The Current URL is not matched with the Cart URL" );
    }
    }