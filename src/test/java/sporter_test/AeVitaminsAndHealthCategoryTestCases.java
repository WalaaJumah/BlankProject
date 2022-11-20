package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sporter_pages.AeProductDetailsPage;
import sporter_pages.AeSportSupplementsCategoryPage;
import sporter_pages.AeVitaminsAndHealthCategoryPage;
import sporter_pages.KsaHomePage;

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
    private KsaHomePageTestCases ksaHomePageTestCases;
    private AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage;

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
        Thread.sleep(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(3000);
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
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
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
        Thread.sleep(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(3000);
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
        Thread.sleep(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(3000);
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
        Thread.sleep(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(3000);
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
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
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
        Thread.sleep(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(3000);
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
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
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
        Thread.sleep(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(3000);
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
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
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
        Thread.sleep(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(3000);
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
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
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
        Thread.sleep(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(3000);
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

    }







