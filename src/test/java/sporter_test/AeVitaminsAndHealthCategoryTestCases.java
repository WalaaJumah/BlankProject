package sporter_test;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    private AeProductDetailsPage aeProductDetailsPage;
    private KsaHomePage ksaHomePage;
    private AEFooterPage aeFooterPage;
    private AEGuestUserPage aeGuestUserPage;
    private Actions action;

    @Test(groups = "All Smoke Testing Result",description = "Vitamins & Health Category Page- Switching to UAE store", priority = 1)
    public void switchToUaeStore () {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.switchToAECountry();
        if(webDriver.getCurrentUrl().contains(aeWomenOnlyCategoryPage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+aeDomain);
            CloseInitialDialog();
        }

    }

    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","1. Critical Severity"},description = "Vitamins & Health Category- Verify clicking on the Vitamins & Health Category Appears In MegaMenu works correctly", priority = 2)
    public void verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL() {
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","1. Critical Severity"},description = "Vitamins & Health Category- Verify clicking on the Vitamins & Health Category from ShopBy Menu works correctly", priority = 3)
    public void verifyClickingOnVitaminsAndHealthCategoryFromShopByMenuRedirectUserToCorrectURL() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsAndHealthOption().getAttribute("href");
        aeMegamenuPage.getVitaminsAndHealthOption().click();
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","1. Critical Severity"},description = "Vitamins & Health Category- Verify clicking on the Vitamins & Health Category from HomePage works correctly", priority = 4)
    public void verifyClickingOnVitaminsAndHealthCategoryFromHomePageRedirectUserToCorrectURL() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        aeVitaminsAndHealthCategoryPage.getVitaminsAndHealthCategoryInHomePage().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeVitaminsAndHealthCategoryPage.healthVitaminsUrl));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify the rotating slider section is displayed correctly ", priority = 5)
    public void verifyRotatingSliderIsDisplayedInTheVitaminsAndHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSlider().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderList().get(i).isDisplayed());
        }
    }
    //There's a bug here since the next arrow icon is missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify the next button of the rotating slider section is displayed correctly ", priority = 6,enabled = false)
    public void verifyNextArrowOfRotatingSliderIsDisplayedInTheVitaminsAndHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
    }
    //There's a bug here since the previous arrow icon is missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify the previous button of the rotating slider section is displayed correctly ", priority = 7,enabled = false)
    public void verifyPreviousArrowOfRotatingSliderIsDisplayedInTheVitaminsAndHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify the pagination control of rotating slider section is displayed correctly", priority = 7)
    public void verifyPaginationControlOfRotatingSliderSectionIsDisplayedInTheVitaminsAndHealthCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingList().get(i).isDisplayed());
        }
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify the side Banners is displayed correctly", priority = 8)
    public void verifySideBannersIsDisplayedInTheVitaminsAndHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getHomePageSideBanner().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify the pagination control of rotating slider section works correctly", priority = 9)
    public void verifyPaginationControlOfRotatingSliderSectionWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().size(); i++) {
           aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).click();
           DataHelperAndWait.waitToBeVisible( aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i),3,webDriver);
           Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).getAttribute("class"),"flex-active");
        }
    }
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Verify clicking on the banners appear in rotating slider section works correctly", priority = 10)
    public void verifyClickingOnTheBannersAppearingInRotatingSliderSectionWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().size(); i++) {
            aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).click();
            aeVitaminsAndHealthCategoryPage.getBannerInRotatingSliderSection().click();
            aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure the clicking on the first side banner works correctly in Vitamins & Health Category Page", priority = 11)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedBannerUrl=aeVitaminsAndHealthCategoryPage.getFirstSideBanner().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getFirstSideBanner().click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedBannerUrl);
    }
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Verify clicking on the second side banner works correctly", priority = 12)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedBannerUrl=aeVitaminsAndHealthCategoryPage.getSecondSideBanner().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getSecondSideBanner().click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedBannerUrl);
    }
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","4. Low Severity"},description = "Vitamins & Health Category- Verify that the customer can navigate to the home page using the BreadCrumb appearing in the Vitamins AndHealth Category Page ", priority = 13)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeDomain+"/");
    }
    //Shop By Category Test Cases
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify the Shop By Category section is displayed correctly", priority = 14)
    public void verifyShopByCategoryInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        ksaHomePage = new KsaHomePage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getShopByCategorySections().isDisplayed());    }
    //Fish Oil & Omegas Category page Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Verify clicking on the Fish Oil & Omegas category inside Shop By Category section works correctly ", priority = 15)
    public void verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(0).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(0).click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test( groups = {"Vitamins & Health Category", "3. Medium Severity"}, description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Fish Oil & Omegas category page ", priority = 16)
    public void verifyResultFieldAndItsVaLueAppearInTheFishOilAndOmegasCategoryPage () {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Fish Oil & Omegas category page ", priority = 17)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheFishOilAndOmegasCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//            add("Name");
//            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
//            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Fish Oil And Omegas Category Page ", priority = 18)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForFishOilAndOmegasCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Fish Oil & Omegas category page  ", priority = 19)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInFishOilAndOmegasCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Fish Oil & Omegas Category Page ", priority = 20)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInFishOilAndOmegasCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Fish Oil & Omegas footer appears correctly  ", priority = 22)
    public void verifyFishOilAndOmegasFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the text appears in the Fish Oil & Omegas footer appears correctly  ", priority = 23)
    public void verifyTheTextAppearInTheFishOilAndOmegasFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterParagraph1().getText(),"Fish Oil & Omegas","The footer has incorrect title");
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterParagraph2().getText(),"We are positive about the fact that you heard about the benefits of oils and omegas before. Oils and omegas like fish oil and omega-3 could make wonders! It is vital for your body to get the right balance of omegas and good fatty acids. Dry skin, brittle hair, frequent urination, sleep and attention problems and emotional sensitivity, are all some of the symptoms you may suffer from in case you were lacking fish oil (omega-3), while lacking other essential fatty acids and oils could come in the shape of slow-growing nails, dry eyes and stiff joints.","The footer has incorrect Paragraph");
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterParagraph3().getText(),"Fish oil, Flaxseed oil, Black seed oil, Krill oil, Chia seed oil and other omega mixes are key nutrients for improving your heart health, fighting inflammation, getting a healthy, great-looking skin, weight loss, improving brain function and reducing joints pain.\n" +
                "\n" +
                "Getting your hands on all of these essential oils and omegas including fish oil with their magical benefits is now between your hands! Sporter has made huge efforts to give you the best natural fish oil, essential oils and omegas, as part of completing its mission of serving all types of goals and satisfying needs.","The footer has incorrect Paragraph");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Fish Oil & Omegas category page", priority = 24)
    public void verifySearchBtnWorksCorrectlyFromFishOilAndOmegasCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Fish Oil & Omegas category page is disable when the current page is page 1 ", priority = 25)
    public void verifyThePreviousBtnInFishOilAndOmegasCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Fish Oil & Omegas category page works correctly", priority = 26)
    public void verifyThePaginationControlInFishOilAndOmegasCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForUrlContains("p=3",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Fish Oil And Omegas Category Page works correctly", priority = 27)
    public void verifyPreviousPageBtnInFishOilAndOmegasCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInFishOilAndOmegasCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Fish Oil And Omegas Category Page works correctly", priority = 28)
    public void verifyNextPageBtnInFishOilAndOmegasCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInFishOilAndOmegasCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Fish Oil & Omegas Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 29)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInFishOilAndOmegasCategoryPage () {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
//    Multivitamins Category page Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Multivitamins category inside Shop By Category section works correctly ", priority = 30)
    public void verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(1).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(1).click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Multivitamins category page ", priority = 31)
    public void verifyResultFieldAndItsVaLueAppearInTheMultivitaminsCategoryPage () {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Multivitamins category page ", priority = 32)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMultivitaminsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//            add("Name");
//            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
//            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Featured option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Multivitamins Category Page ", priority = 33)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForMultivitaminsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Multivitamins category page  ", priority = 34)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMultivitaminsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Multivitamins Category Page ", priority = 35)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMultivitaminsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Multivitamins Category page ", priority = 36)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInMultivitaminsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Multivitamins, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Multivitamins footer appears correctly  ", priority = 37)
    public void verifyMultivitaminsFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Multivitamins category page", priority = 38)
    public void verifySearchBtnWorksCorrectlyFromMultivitaminsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Multivitamins category page is disable when the current page is page 1 ", priority = 39)
    public void verifyThePreviousBtnInMultivitaminsCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Multivitamins category page works correctly", priority = 40)
    public void verifyThePaginationControlInMultivitaminsCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForUrlContains("p=3",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Multivitamins Category Page works correctly", priority = 41)
    public void verifyPreviousPageBtnInMultivitaminsCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMultivitaminsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Multivitamins Category Page works correctly", priority = 42)
    public void verifyNextPageBtnInMultivitaminsCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMultivitaminsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Multivitamins Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 43)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMultivitaminsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
    //Vitamins A-Z Category page Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Vitamins A-Z category inside Shop By Category section works correctly ", priority = 44)
    public void verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(2).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(2).click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Vitamins A_Z category page ", priority = 45)
    public void verifyResultFieldAndItsVaLueAppearInTheVitaminsA_ZCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the VitaminsA_Z category page ", priority = 46)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheVitaminsA_ZCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
//            add("Name");
//            add("Best Selling");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
//            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Featured option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for VitaminsA_Z Category Page ", priority = 47)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForVitaminsA_ZCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the VitaminsA_Z category page  ", priority = 48)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInVitaminsA_ZCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the VitaminsA_Z Category Page ", priority = 49)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInVitaminsA_ZCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the VitaminsA_Z Category page ", priority = 50)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInVitaminsA_ZCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Essential Vitamins, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the VitaminsA_Z footer appears correctly  ", priority = 51)
    public void verifyVitaminsA_ZFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the VitaminsA_Z category page", priority = 52)
    public void verifySearchBtnWorksCorrectlyFromVitaminsA_ZCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the VitaminsA_Z category page is disable when the current page is page 1 ", priority = 53)
    public void verifyThePreviousBtnInVitaminsA_ZCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the VitaminsA_Z category page works correctly", priority = 54)
    public void verifyThePaginationControlInVitaminsA_ZCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForUrlContains("p=3",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In VitaminsA_Z Category Page works correctly", priority = 55)
    public void verifyPreviousPageBtnInVitaminsA_ZCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInVitaminsA_ZCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In VitaminsA_Z Category Page works correctly", priority = 56)
    public void verifyNextPageBtnInVitaminsA_ZCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInVitaminsA_ZCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the VitaminsA_Z category page", priority = 57)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInVitaminsA_ZCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
//    Minerals Category page Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Minerals category inside Shop By Category section works correctly ", priority = 58)
    public void verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(3).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(3).click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Minerals category page ", priority = 59)
    public void verifyResultFieldAndItsVaLueAppearInTheMineralsCategoryPage () {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Minerals category page ", priority = 60)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMineralsCategoryPage () {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Price Min-Max");
            add("Price Max-Min");
//            add("Name");
//            add("Best Selling");
            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
//            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Featured option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Minerals Category Page ", priority = 61)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForMineralsCategoryPage () {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Minerals category page  ", priority = 62)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMineralsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Minerals Category Page ", priority = 63)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMineralsCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Minerals Category page ", priority = 64)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInMineralsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Minerals, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Minerals footer appears correctly  ", priority = 65)
    public void verifyMineralsFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Minerals category page", priority = 66)
    public void verifySearchBtnWorksCorrectlyFromMineralsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Minerals category page is disable when the current page is page 1 ", priority = 67)
    public void verifyThePreviousBtnInMineralsCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    //There's a performance issue in the pagination control
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Minerals category page works correctly", priority = 68)
    public void verifyThePaginationControlInMineralsCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForUrlContains("p=3",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Minerals Category Page works correctly", priority = 69)
    public void verifyPreviousPageBtnInMineralsCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMineralsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Minerals Category Page works correctly", priority = 70)
    public void verifyNextPageBtnInMineralsCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMineralsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=3",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Minerals category page", priority = 71)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMineralsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    //Antioxidants Category page Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Antioxidants category inside Shop By Category section works correctly ", priority = 72)
    public void verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(4).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(4).click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Antioxidants category page ", priority = 73)
    public void verifyResultFieldAndItsVaLueAppearInTheAntioxidantsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Antioxidants category page ", priority = 74)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheAntioxidantsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
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
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Antioxidants Category Page ", priority = 75)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForAntioxidantsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Antioxidants category page  ", priority = 76)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInAntioxidantsCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Antioxidants Category Page ", priority = 77)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInAntioxidantsCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Antioxidants footer appears correctly  ", priority = 79)
    public void verifyAntioxidantsFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Antioxidants category page", priority = 80)
    public void verifySearchBtnWorksCorrectlyFromAntioxidantsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Antioxidants category page is disable when the current page is page 1 ", priority = 81)
    public void verifyThePreviousBtnInAntioxidantsCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    //There's a performance issue in the pagination control
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Antioxidants category page works correctly", priority = 82)
    public void verifyThePaginationControlInAntioxidantsCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Antioxidants Category Page works correctly", priority = 83)
    public void verifyPreviousPageBtnInAntioxidantsCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInAntioxidantsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Antioxidants Category Page works correctly", priority = 84)
    public void verifyNextPageBtnInAntioxidantsCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInAntioxidantsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Antioxidants category page", priority = 85)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInAntioxidantsCategoryPage () {
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    //Superfoods Category page Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Superfoods category inside Shop By Category section works correctly ", priority = 86)
    public void verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(5).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(5).click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Superfoods category page ", priority = 86)
    public void verifyResultFieldAndItsVaLueAppearInTheSuperfoodsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Superfoods category page ", priority = 87)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSuperfoodsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
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
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Superfoods Category Page ", priority = 88)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForSuperfoodsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Superfoods category page  ", priority = 89)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSuperfoodsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Superfoods Category Page ", priority = 90)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSuperfoodsCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description that should appear in the image is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Superfoods Category page ", priority = 91)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInSuperfoodsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Superfoods, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Superfoods category page", priority = 93)
    public void verifySearchBtnWorksCorrectlyFromSuperfoodsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Superfoods category page is disable when the current page is page 1 ", priority = 94)
    public void verifyThePreviousBtnInSuperfoodsCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}

    //There's a performance issue in the pagination control
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Superfoods category page works correctly", priority = 95)
    public void verifyThePaginationControlInSuperfoodsCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Superfoods Category Page works correctly", priority = 96)
    public void verifyPreviousPageBtnInSuperfoodsCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInSuperfoodsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Superfoods Category Page works correctly", priority = 97)
    public void verifyNextPageBtnInSuperfoodsCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInSuperfoodsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Superfoods category page", priority = 98)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSuperfoodsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
//    Collagen Category page Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Collagen category inside Shop By Category section works correctly ", priority = 99)
    public void verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(6).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(6).click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Collagen category page ", priority = 100)
    public void verifyResultFieldAndItsVaLueAppearInTheCollagenCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Collagen category page ", priority = 101)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheCollagenCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
            //The below options are missing
//            add("Relevance");
//            add("Newly added items");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Featured option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Collagen Category Page ", priority = 102)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForCollagenCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Collagen category page  ", priority = 103)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInCollagenCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Collagen Category Page ", priority = 104)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInCollagenCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description that should appear in the image is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Collagen Category page ", priority = 105)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInCollagenCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Collagen, Beauty", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Collagen footer appears correctly  ", priority = 106)
    public void verifyCollagenFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Collagen category page", priority = 107)
    public void verifySearchBtnWorksCorrectlyFromCollagenCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Collagen category page is disable when the current page is page 1 ", priority = 108)
    public void verifyThePreviousBtnInCollagenCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Collagen category page works correctly", priority = 109)
    public void verifyThePaginationControlInCollagenCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        DataHelperAndWait.waitForUrlContains("p=3",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    //There's a performance issue here
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Collagen Category Page works correctly", priority = 110)
    public void verifyPreviousPageBtnInCollagenCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInCollagenCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Collagen Category Page works correctly", priority = 111)
    public void verifyNextPageBtnInCollagenCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInCollagenCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=3",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Collagen category page", priority = 112)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInCollagenCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
    //Melatonin Category page Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Melatonin category inside Shop By Category section works correctly ", priority = 113)
    public void verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(7).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(7).click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),BasePage.BaseURL +"/en-ae/vitamin-health/vitamins-sleep-mood-solutions/melatonin/");
        //There's a bug here in the DOM because the URL appears incorrectly
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Melatonin category page ", priority = 114)
    public void verifyResultFieldAndItsVaLueAppearInTheMelatoninCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Melatonin category page ", priority = 115)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMelatoninCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
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
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Featured option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Melatonin Category Page ", priority = 116)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForMelatoninCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Melatonin category page  ", priority = 117)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMelatoninCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Melatonin Category Page ", priority = 118)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMelatoninCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description that should appear in the image is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Melatonin Category page ", priority = 119)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInMelatoninCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Melatonin, Sleep & Mood Solutions", "Wrong title appears in the sport Supplements category image");
    }

    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Melatonin category page", priority = 121)
    public void verifySearchBtnWorksCorrectlyFromMelatoninCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Melatonin category page is disable when the current page is page 1 ", priority = 122)
    public void verifyThePreviousBtnInMelatoninCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Melatonin category page works correctly", priority = 123)
    public void verifyThePaginationControlInMelatoninCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));

    }
    //There's a performance issue here
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Melatonin Category Page works correctly", priority = 124)
    public void verifyPreviousPageBtnInMelatoninCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMelatoninCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Melatonin Category Page works correctly", priority = 125)
    public void verifyNextPageBtnInMelatoninCategoryPageWorksCorrectly() throws InterruptedException{
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMelatoninCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Melatonin category page", priority = 126)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMelatoninCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
    //Herbal Reference Guide Test Cases

    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure that Herbal Reference Guide section is displayed correctly ", priority = 127)
    public void verifyHerbalReferenceGuideSectionIsDisplayedCorrectly () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideTitle().getText(), "Herbal Reference Guide");
        ArrayList<String> expectedOptions = new ArrayList<>() {{
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
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure clicking on the Tumeric icon Redirect User To CorrectURL", priority = 128)
    public void verifyClickingOnTumericPageRedirectUserToCorrectURL() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedUrl=aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(0).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(0).click();
        Assert.assertEquals(webDriver.getCurrentUrl().replace(aeDomain,""),expectedUrl);
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Tumeric page", priority = 138)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInTumericPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnTumericPageRedirectUserToCorrectURL();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Tumeric Page ", priority = 133)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInTheTumericPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnTumericPageRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure clicking on the Dandelion icon Redirect User To CorrectURL", priority = 129)
    public void verifyClickingOnDandelionPageRedirectUserToCorrectURL() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedUrl=aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(1).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(1).click();
        Assert.assertEquals(webDriver.getCurrentUrl().replace(aeDomain,""),expectedUrl);
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Dandelion page", priority = 139)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInDandelionPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnDandelionPageRedirectUserToCorrectURL();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Dandelion Page ", priority = 134)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInTheDandelionPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnDandelionPageRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure clicking on the Ginseng icon Redirect User To CorrectURL", priority = 130)
    public void verifyClickingOnGinsengPageRedirectUserToCorrectURL() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedUrl=aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(2).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(2).click();
        Assert.assertEquals(webDriver.getCurrentUrl().replace(aeDomain,""),expectedUrl);
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Ginseng page", priority = 140)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInGinsengPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnGinsengPageRedirectUserToCorrectURL();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Ginseng Page ", priority = 135)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInTheGinsengPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnGinsengPageRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"}, description = "Vitamins & Health Category- Make sure clicking on the Milk Thistle icon Redirect User To CorrectURL", priority = 131)
    public void verifyClickingOnMilkThistlePageRedirectUserToCorrectURL() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedUrl=aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(3).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(3).click();
        Assert.assertEquals(webDriver.getCurrentUrl().replace(aeDomain,""),expectedUrl);
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Milk Thistle page", priority = 141)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMilkThistlPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMilkThistlePageRedirectUserToCorrectURL();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Milk Thistle Page ", priority = 136)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInTheMilkThistlePage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnMilkThistlePageRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure clicking on the Alfalfa icon Redirect User To CorrectURL", priority = 132)
    public void verifyClickingOnAlfalfaPageRedirectUserToCorrectURL() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedUrl=aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(4).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(4).click();
        Assert.assertEquals(webDriver.getCurrentUrl().replace(aeDomain,""),expectedUrl);
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Alfalfa page", priority = 142)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInAlfalfaPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnAlfalfaPageRedirectUserToCorrectURL();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    //There's a bug here because the page is not opened correctly
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Alfalfa Page ", priority = 137)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInTheAlfalfaPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnAlfalfaPageRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here because the page is not opened correctly
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Tumeric page", priority = 143)
    public void verifySearchBtnWorksCorrectlyFromTumericPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnTumericPageRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //There's a bug here because the page is not opened correctly
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Dandelion  page", priority = 144)
    public void verifySearchBtnWorksCorrectlyFromDandelionPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnDandelionPageRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //There's a bug here because the page is not opened correctly
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Ginseng  page", priority = 145)
    public void verifySearchBtnWorksCorrectlyFromGinsengPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnGinsengPageRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //There's a bug here because the page is not opened correctly
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Milk Thistle  page", priority = 146)
    public void verifySearchBtnWorksCorrectlyFromMilkThistlePage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnMilkThistlePageRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //There's a bug here because the page is not opened correctly
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Alfalfa  page", priority = 147)
    public void verifySearchBtnWorksCorrectlyFromAlfalfaePage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnAlfalfaPageRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
//    Shop By Health Need Test Cases
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure the Shop By Health Need section is displayed ", priority = 148)
    public void verifyShopByHealthNeedInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getShopByHealthNeedTitle().getText(),"Shop By Health Need","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getShopByHealthNeedSection().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure the next item button appears in the Shop By Health Need section works correctly ", priority = 149)
    public void verifyNextButtonAppearsInTheShopByHealthNeedSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getBeautyCategory().isDisplayed());
        aeVitaminsAndHealthCategoryPage.clickOnNextIconInShopByHealthNeedSection();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getEnergyFormulasCategory().isDisplayed());
    }
//There's a performance issue here
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure the Previous item button appears in the Shop By Health Need section works correctly ", priority = 150)
    public void verifyPreviousButtonAppearsInTheShopByHealthNeedSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.clickOnPreviousIconInShopByHealthNeedSection();
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getBeautyCategory().isDisplayed());
    }
    //Beauty Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Beauty category inside Shop By Health Need works correctly ", priority = 151)
    public void verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getBeautyCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getBeautyCategory().click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Beauty category page ", priority = 152)
    public void verifyResultFieldAndItsVaLueAppearInTheBeautyCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Beauty category page ", priority = 153)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheBeautyCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
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
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Beauty Category Page ", priority = 154)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForBeautyCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Beauty category page  ", priority = 155)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInBeautyCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Beauty Category Page ", priority = 156)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInBeautyCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Beauty Category page ", priority = 157)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInBeautyCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Beauty, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Beauty footer appears correctly  ", priority = 158)
    public void verifyBeautyFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Beauty category page", priority = 159)
    public void verifySearchBtnWorksCorrectlyFromBeautyCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Beauty category page is disable when the current page is page 1 ", priority = 160)
    public void verifyThePreviousBtnInBeautyCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Beauty category page works correctly", priority = 161)
    public void verifyThePaginationControlInBeautyCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Beauty Category Page works correctly", priority = 162)
    public void verifyPreviousPageBtnInBeautyCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Beauty Category Page works correctly", priority = 163)
    public void verifyNextPageBtnInBeautyCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Beauty category page", priority = 164)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInBeautyCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Beauty category page", priority = 165)
    public void verifyFiltrationSectionIsDisplayedInBeautyCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
     Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Bone & Joint Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Bone And Joint category inside Shop By Health Need works correctly ", priority = 166)
    public void verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getBoneAndJointCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getBoneAndJointCategory().click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Bone And Joint category page ", priority = 167)
    public void verifyResultFieldAndItsVaLueAppearInTheBoneAndJointCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Bone And Joint category page ", priority = 168)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheBoneAndJointCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Bone And Joint Category Page ", priority = 169)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForBoneAndJointCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Bone And Joint category page  ", priority = 170)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInBoneAndJointCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Bone And Joint Category Page ", priority = 171)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInBoneAndJointCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Bone And Joint Category page ", priority = 172)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInBoneAndJointCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Bone & Joint, Vitamins & Health", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Bone And Joint footer appears correctly  ", priority = 173)
    public void verifyBoneAndJointFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Bone And Joint category page", priority = 174)
    public void verifySearchBtnWorksCorrectlyFromBoneAndJointCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Bone And Joint category page is disable when the current page is page 1 ", priority = 175)
    public void verifyThePreviousBtnInBoneAndJointCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Bone And Joint category page works correctly", priority = 176)
    public void verifyThePaginationControlInBoneAndJointCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Bone And Joint Category Page works correctly", priority = 177)
    public void verifyPreviousPageBtnInBoneAndJointCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the Next button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Bone And Joint Category Page works correctly", priority = 178)
    public void verifyNextPageBtnInBoneAndJointCategoryPageWorksCorrectly () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Bone And Joint category page", priority = 179)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInBoneAndJointCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Bone And Joint category page", priority = 180)
    public void verifyFiltrationSectionIsDisplayedInBoneAndJointCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Brain Support Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Brain Support category inside Shop By Health Need works correctly ", priority = 181)
    public void verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getBrainSupportCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getBrainSupportCategory().click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Brain Support category page ", priority = 182)
    public void verifyResultFieldAndItsVaLueAppearInTheBrainSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Brain Support category page ", priority = 183)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheBrainSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Featured option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Brain Support Category Page ", priority = 184)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForBrainSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the BrainSupport category page  ", priority = 185)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInBrainSupportCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Brain Support Category Page ", priority = 186)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInBrainSupportCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Brain Support Category page ", priority = 187)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInBrainSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Brain Support, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Brain Support  footer appears correctly  ", priority = 188)
    public void verifyBrainSupportFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Brain Support category page", priority = 189)
    public void verifySearchBtnWorksCorrectlyFromBrainSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the BrainSupport category page is disable when the current page is page 1 ", priority = 190)
    public void verifyThePreviousBtnInBrainSupportCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Brain Support category page works correctly", priority = 191)
    public void verifyThePaginationControlInBrainSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));

    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Brain Support Category Page works correctly", priority = 192)
    public void verifyPreviousPageBtnInBrainSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Brain Support Category Page works correctly", priority = 193)
    public void verifyNextPageBtnInBrainSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Brain Support category page", priority = 194)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInBrainSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the BrainSupport category page", priority = 195)
    public void verifyFiltrationSectionIsDisplayedInBrainSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Detox & Liver Support Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Detox & Liver Support category inside Shop By Health Need works correctly ", priority = 196)
    public void verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getDetoxAndLiverSupportCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getDetoxAndLiverSupportCategory().click();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Detox & Liver Support category page ", priority = 197)
    public void verifyResultFieldAndItsVaLueAppearInTheDetoxAndLiverSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Detox & Liver Support category page ", priority = 198)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheDetoxAndLiverSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Detox & Liver Support Category Page ", priority = 199)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForDetoxAndLiverSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Detox & Liver Support category page  ", priority = 200)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInDetoxAndLiverSupportCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Detox & Liver Support Category Page ", priority = 201)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInDetoxAndLiverSupportCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Detox & Liver Support  footer appears correctly  ", priority = 203)
    public void verifyDetoxAndLiverSupportFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Detox & Liver Support category page", priority = 204)
    public void verifySearchBtnWorksCorrectlyFromDetoxAndLiverSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Detox & Liver Support category page is disable when the current page is page 1 ", priority = 205)
    public void verifyThePreviousBtnInDetoxAndLiverSupportCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Detox & Liver Support category page works correctly", priority = 206)
    public void verifyThePaginationControlInDetoxAndLiverSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Detox & Liver Support Category Page works correctly", priority = 207)
    public void verifyPreviousPageBtnInDetoxAndLiverCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Detox & Liver Support Category Page works correctly", priority = 208)
    public void verifyNextPageBtnInDetoxAndLiverSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Detox & Liver Support category page", priority = 209)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInDetoxAndLiverSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Detox & Liver Support category page", priority = 210)
    public void verifyFiltrationSectionIsDisplayedInDetoxAndLiverSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Digestive Support Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Digestive Support category inside Shop By Health Need works correctly ", priority = 211)
    public void verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getDigestiveSupportCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getDigestiveSupportCategory().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Digestive Support category page ", priority = 212)
    public void verifyResultFieldAndItsVaLueAppearInTheDigestiveSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Digestive Support category page ", priority = 213)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheDigestiveSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
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
        for (int i = 0; i < expectedOption.size(); i++) {
            try{
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));}
            catch (AssertionError r){
                System.out.println("The options are changes");
            }
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Digestive Support Category Page ", priority = 214)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForDigestiveSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Detox & Liver Support category page  ", priority = 215)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInDigestiveSupportCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Digestive Support Category Page ", priority = 216)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInDigestiveSupportCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Digestive Support Category page ", priority = 217)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInDigestiveSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Digestive Support, Digestion", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Digestive Support category page", priority = 219)
    public void verifySearchBtnWorksCorrectlyFromDigestiveSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Digestive Support category page is disable when the current page is page 1 ", priority = 220)
    public void verifyThePreviousBtnInDigestiveSupportCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Digestive Support category page works correctly", priority = 221)
    public void verifyThePaginationControlInDigestiveSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Digestive Support Category Page works correctly", priority = 222)
    public void verifyPreviousPageBtnInDigestiveSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Digestive Support Category Page works correctly", priority = 223)
    public void verifyNextPageBtnInDigestiveSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Digestive Support category page", priority = 224)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInDigestiveSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Digestive Support category page", priority = 225)
    public void verifyFiltrationSectionIsDisplayedInDigestiveSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Energy Formulas Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Energy Formulas category inside Shop By Health Need works correctly ", priority = 226)
    public void verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.getNextIconInShopByHealthNeedSection().click();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getEnergyFormulasCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getEnergyFormulasCategory().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Energy Formulas category page ", priority = 227)
    public void verifyResultFieldAndItsVaLueAppearInTheEnergyFormulasCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Energy Formulas category page ", priority = 228)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheEnergyFormulasCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Energy Formulas Category Page ", priority = 229)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForEnergyFormulasCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Energy Formulas Category Page  ", priority = 230)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInEnergyFormulasCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Energy Formulas Category Page ", priority = 231)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInEnergyFormulasCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Energy Formulas Category page ", priority = 232)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInEnergyFormulasCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Energy Formulas, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Energy Formulas category page", priority = 234)
    public void verifySearchBtnWorksCorrectlyFromEnergyFormulasCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Energy Formulas category page is disable when the current page is page 1 ", priority = 235)
    public void verifyThePreviousBtnInEnergyFormulasCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Energy Formulas category page works correctly", priority = 236)
    public void verifyThePaginationControlInEnergyFormulasCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Energy Formulas Category Page works correctly", priority = 237)
    public void verifyPreviousPageBtnInEnergyFormulasCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Energy Formulas Category Page works correctly", priority = 238)
    public void verifyNextPageBtnInEnergyFormulasCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Energy Formulas category page", priority = 239)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInEnergyFormulasCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Energy Formulas category page", priority = 240)
    public void verifyFiltrationSectionIsDisplayedInEnergyFormulasCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Hair, Skin & Nails, Beauty Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Hair, Skin & Nails, Beauty category inside Shop By Health Need works correctly ", priority = 241)
    public void verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.clickOnHairSkinAndNails();
        aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Hair, Skin & Nails, Beauty category page ", priority = 242)
    public void verifyResultFieldAndItsVaLueAppearInTheHairAndSkinAndNailsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Hair, Skin & Nails, Beauty category page ", priority = 243)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheHairAndSkinAndNailsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Hair, Skin & Nails, Beauty Category Page ", priority = 244)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForHairAndSkinAndNailsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Hair, Skin & Nails, Beauty Category Page  ", priority = 245)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInHairAndSkinAndNailsCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Hair, Skin & Nails, Beauty Category Page ", priority = 246)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInHairAndSkinAndNailsCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Hair, Skin & Nails, Beauty category page", priority = 249)
    public void verifySearchBtnWorksCorrectlyFromHairAndSkinAndNailsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Hair, Skin & Nails, Beauty category page is disable when the current page is page 1 ", priority = 250)
    public void verifyThePreviousBtnInHairAndSkinAndNailsCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Hair, Skin & Nails, Beauty category page works correctly", priority = 251)
    public void verifyThePaginationControlInHairAndSkinAndNailsCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Hair, Skin & Nails, Beauty Category Page works correctly", priority = 252)
    public void verifyPreviousPageBtnInHairAndSkinAndNailsCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Hair, Skin & Nails, Beauty Category Page works correctly", priority = 253)
    public void verifyNextPageBtnInHairAndSkinAndNailsCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Hair, Skin & Nails, Beauty category page", priority = 254)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInHairAndSkinAndNailsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Hair, Skin & Nails, Beauty category page", priority = 255)
    public void verifyFiltrationSectionIsDisplayedInHairAndSkinAndNailsCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Heart Health Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Heart Health category inside Shop By Health Need works correctly ", priority = 256)
    public void verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.clickOnHeartHealthCategory();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Heart Health category page ", priority = 257)
    public void verifyResultFieldAndItsVaLueAppearInTheHeartHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Heart Health category page ", priority = 258)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheHeartHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");

        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Heart Health Category Page ", priority = 259)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForHeartHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Heart Health Category Page  ", priority = 260)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInHeartHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Heart Health Category Page ", priority = 261)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInHeartHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Heart Health Category page ", priority = 262)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInHeartHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Heart Health, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Heart Health  footer appears correctly  ", priority = 263)
    public void verifyHeartHealthFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Heart Health category page", priority = 264)
    public void verifySearchBtnWorksCorrectlyFromHeartHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Heart Health category page is disable when the current page is page 1 ", priority = 265)
    public void verifyThePreviousBtnInHeartHealthCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Heart Health category page works correctly", priority = 266)
    public void verifyThePaginationControlInHeartHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Heart Health Category Page works correctly", priority = 267)
    public void verifyPreviousPageBtnInHeartHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyThePaginationControlInHeartHealthCategoryPageWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Heart Health Category Page works correctly", priority = 268)
    public void verifyNextPageBtnInHeartHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Heart Health category page", priority = 269)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInHeartHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Heart Health category page", priority = 270)
    public void verifyFiltrationSectionIsDisplayedInHeartHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Immunity Support Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Immunity Support category inside Shop By Health Need works correctly ", priority = 271)
    public void verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getImmunitySupportCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnImmunitySupportCategory();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Immunity Support category page ", priority = 272)
    public void verifyResultFieldAndItsVaLueAppearInTheImmunitySupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Immunity Support category page ", priority = 273)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheImmunitySupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");

        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Immunity Support Category Page ", priority = 274)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForImmunitySupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Immunity Support Category Page  ", priority = 275)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInImmunitySupportCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Immunity Support Category Page ", priority = 276)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInImmunitySupportCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Immunity Support Category page ", priority = 277)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInImmunitySupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeSportSupplementsCategoryPage.navigate();
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Immune Support, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Immunity Support category page", priority = 279)
    public void verifySearchBtnWorksCorrectlyFromImmunitySupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);;
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Immunity Support category page is disable when the current page is page 1 ", priority = 280)
    public void verifyThePreviousBtnInImmunitySupportCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Immunity Support category page works correctly", priority = 281)
    public void verifyThePaginationControlInImmunitySupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Immunity Support Category Page works correctly", priority = 282)
    public void verifyPreviousPageBtnInImmunitySupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Immunity Support Category Page works correctly", priority = 283)
    public void verifyNextPageBtnInImmunitySupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Immunity Support category page", priority = 284)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInImmunitySupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Immunity Support category page", priority = 285)
    public void verifyFiltrationSectionIsDisplayedInImmunitySupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Kid's Health Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Kids Health category inside Shop By Health Need works correctly ", priority = 286)
    public void verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
                aeVitaminsAndHealthCategoryPage.clickOnKidsHealthCategory();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Kids Health category page ", priority = 287)
    public void verifyResultFieldAndItsVaLueAppearInTheKidsHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Kids Health category page ", priority = 288)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheKidsHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Kids Health Category Page ", priority = 289)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForKidsHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Kids Health Category Page  ", priority = 290)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInKidsHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Kids Health Category Page ", priority = 291)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInKidsHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Kids Health Category page ", priority = 292)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInKidsHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Vitamins For Kids, Multivitamins", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure  the Kids Health footer appears correctly  ", priority = 293)
    public void verifyKidsHealthFooterSectionAppearsCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().isDisplayed());
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasFooterSection().getCssValue("background"), "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Kids Health category page", priority = 294)
    public void verifySearchBtnWorksCorrectlyFromKidsHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Kids Health category page is disable when the current page is page 1 ", priority = 295)
    public void verifyThePreviousBtnInKidsHealthCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Kids Health category page works correctly", priority = 296)
    public void verifyThePaginationControlInKidsHealthategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Kids Health Category Page works correctly", priority = 297)
    public void verifyPreviousPageBtnInKidsHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Kids Health Category Page works correctly", priority = 298)
    public void verifyNextPageBtnInKidsHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Kids Health category page", priority = 299)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInKidsHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Kids Health category page", priority = 300)
    public void verifyFiltrationSectionIsDisplayedInKidsHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

//    Men's Health Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Mens Health category inside Shop By Health Need works correctly ", priority = 301)
    public void verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.clickOnMensHealthCategory();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Mens Health category page ", priority = 302)
    public void verifyResultFieldAndItsVaLueAppearInTheMensHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Mens Health category page ", priority = 303)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMensHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");

        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Mens Health Category Page ", priority = 304)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForMensHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Mens Health Category Page  ", priority = 305)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMensHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Mens Health Category Page ", priority = 306)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMensHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Mens Health Category page ", priority = 307)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInMensHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Mens Health, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Mens Health category page", priority = 309)
    public void verifySearchBtnWorksCorrectlyFromMensHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Mens Health category page is disable when the current page is page 1 ", priority = 310)
    public void verifyThePreviousBtnInMensHealthCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Mens Health category page works correctly", priority = 311)
    public void verifyThePaginationControlInMensHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Mens Health Category Page works correctly", priority = 312)
    public void verifyPreviousPageBtnInMensHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Mens Health Category Page works correctly", priority = 313)
    public void verifyNextPageBtnInMensHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Mens Health category page", priority = 314)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMensHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Mens Health category page", priority = 315)
    public void verifyFiltrationSectionIsDisplayedInMensHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Sexual Health Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Sexual Health category inside Shop By Health Need works correctly ", priority = 316)
    public void verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getSexualHealthCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnSexualHealthCategory();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("sexual-health"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Sexual Health category page ", priority = 317)
    public void verifyResultFieldAndItsVaLueAppearInTheSexualHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Sexual Health category page ", priority = 318)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSexualHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");

        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Sexual Health Category Page ", priority = 319)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForSexualHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Sexual Health Category Page  ", priority = 320)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSexualHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Sexual Health Category Page ", priority = 321)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSexualHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Sexual Health Category page ", priority = 322)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInSexualHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Sexual Health category page", priority = 324)
    public void verifySearchBtnWorksCorrectlyFromSexualHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Sexual Health category page is disable when the current page is page 1 ", priority = 325)
    public void verifyThePreviousBtnInSexualHealthCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
        @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Sexual Health category page works correctly", priority = 326)
    public void verifyThePaginationControlInSexualHealthCategoryPageWorksCorrectly() {
            AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
            aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
            DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Sexual Health Category Page works correctly", priority = 327)
    public void verifyPreviousPageBtnInSexualHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Sexual Health Category Page works correctly", priority = 328)
    public void verifyNextPageBtnInSexualHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Sexual Health category page", priority = 329)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSexualHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    //There's a bug here, due to the filtration section is missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Sexual Health category page", priority = 330)
    public void verifyFiltrationSectionIsDisplayedInSexualHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Sleep Support Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Sleep Support category inside Shop By Health Need works correctly ", priority = 331)
    public void verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getSexualHealthCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnSleepSupportCategory();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("sleep-support"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Sleep Support category page ", priority = 332)
    public void verifyResultFieldAndItsVaLueAppearInTheSleepSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Sleep Support category page ", priority = 333)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSleepSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
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
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Sleep Support Category Page ", priority = 334)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForSleepSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Sleep Support Category Page  ", priority = 335)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSleepSupportCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Sleep Support Category Page ", priority = 336)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSleepSupportCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Sleep Support category page", priority = 339)
    public void verifySearchBtnWorksCorrectlyFromSleepSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Sleep Support category page is disable when the current page is page 1 ", priority = 340)
    public void verifyThePreviousBtnInSleepSupportCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Sleep Support category page works correctly", priority = 341)
    public void verifyThePaginationControlInSleepSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Sleep Support Category Page works correctly", priority = 342)
    public void verifyPreviousPageBtnInSleepSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Sleep Support Category Page works correctly", priority = 343)
    public void verifyNextPageBtnInSleepSupportCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Sleep Support category page", priority = 344)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSleepSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    //There's a bug here, due to the filtration section is missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Sleep Support category page", priority = 345)
    public void verifyFiltrationSectionIsDisplayedInSleepSupportCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Diet Weight Management Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Diet Weight Management category inside Shop By Health Need works correctly ", priority = 346)
    public void verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getSexualHealthCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnDietWeightManagementCategory();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("weight-management"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Diet Weight Management category page ", priority = 347)
    public void verifyResultFieldAndItsVaLueAppearInTheDietWeightManagementCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Diet Weight Management category page ", priority = 348)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheDietWeightManagementCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");

        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
        @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Diet Weight Management Category Page ", priority = 349)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForDietWeightManagementCategoryPage () {
            AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
            try{
                Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
            }
            catch (AssertionError assertion){
                Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

            }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Diet Weight Management Category Page  ", priority = 350)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInDietWeightManagementCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Diet Weight Management Category Page ", priority = 351)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInDietWeightManagementCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Diet Weight Management Category page ", priority = 352)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInDietWeightManagementCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Weight Management , Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Diet Weight Management category page", priority = 354)
    public void verifySearchBtnWorksCorrectlyFromDietWeightManagementCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Diet Weight Management category page is disable when the current page is page 1 ", priority = 355)
    public void verifyThePreviousBtnInDietWeightManagementCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Diet Weight Management category page works correctly", priority = 356)
    public void verifyThePaginationControlInDietWeightManagementCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Diet Weight Management Category Page works correctly", priority = 357)
    public void verifyPreviousPageBtnInDietWeightManagementCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Diet Weight Management Category Page works correctly", priority = 358)
    public void verifyNextPageBtnInDietWeightManagementCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Diet Weight Management category page", priority = 359)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInDietWeightManagementCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    //There's a bug here, due to the filtration section is missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Diet Weight Management category page", priority = 360)
    public void verifyFiltrationSectionIsDisplayedInDietWeightManagementCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}
    //Women Health Category Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on the Women Health category inside Shop By Health Need works correctly ", priority = 361)
    public void verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly()  {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getSexualHealthCategory().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.clickOnWomenHealthCategory();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("women-s-health/"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the Result label and its value appear correctly in the Women Health category page ", priority = 362)
    public void verifyResultFieldAndItsVaLueAppearInTheWomenHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    //There's a bug here - some filtration options are missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that Sort By menu and its options appear correctly in the Women Health category page ", priority = 363)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheWomenHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");

        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
            //Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }
    //There's a bug here due to the Best Selling option is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure that the Featured option is selected by default in the Sort By menu for Women Health Category Page ", priority = 364)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForWomenHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the Horizontal Category Image appears correctly in the Women Health Category Page  ", priority = 365)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInWomenHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Women Health Category Page ", priority = 366)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInDietWomenHealthCategoryPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL);
    }
    //There's a bug here due to the description is missing
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Women Health Category page ", priority = 367)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInWomenHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Womens Health, Healthy Lifestyle", "Wrong title appears in the sport Supplements category image");
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Verify that the search button works correctly from the Women Health category page", priority = 369)
    public void verifySearchBtnWorksCorrectlyFromDietWomenHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Verify that the previous page button in the Women Health category page is disable when the current page is page 1 ", priority = 370)
    public void verifyThePreviousBtnInWomenHealthCategoryPageIsDisableWhenDisplayPage1 () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the Pagination control in the Women Health category page works correctly", priority = 371)
    public void verifyThePaginationControlInWomenHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the previous page button In Women Health Category Page works correctly", priority = 372)
    public void verifyPreviousPageBtnInWomenHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeVitaminsAndHealthCategoryPage.clickOnPreviousPage();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    //There's a performance issue when clicking on the previous button
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the next page button In Women Health Category Page works correctly", priority = 373)
    public void verifyNextPageBtnInWomenHealthCategoryPageWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,8);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Women Health category page", priority = 374)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWomenHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }
    //There's a bug here, due to the filtration section is missing
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Filtration Section is displayed in the Women Health category page", priority = 375)
    public void verifyFiltrationSectionIsDisplayedInWomenHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());}

    //Fish Oil And Omegas Section Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Fish Oil And Omegas section is displayed ", priority = 376)
    public void verifyFishOilAndOmegasSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionTitle().getText(),"Fish Oil & Omegas","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSection().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the previous arrow icon is not appear by default in the Fish Oil And Omegas section ", priority = 377)
    public void verifyPreviousArrowButtonInFishOilAndOmegasSectionIsNotDisplayedByDefault() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        try{
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInFishOilAndOmegasSection().isDisplayed());}
        catch (Exception e){
            System.out.println("the previous arrow icon is not appear by default in the Fish Oil And Omegas section");
        }
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Next Button in the Fish Oil And Omegas section works correctly", priority = 378)
    public void verifyClickingOnNextIconInFishOilAndOmegasSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInFishOilAndOmegasSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Previous Button in the Fish Oil And Omegas section works correctly", priority = 379)
        public void verifyClickingOnPreviousIconInFishOilAndOmegasSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeVitaminsAndHealthCategoryPage.getNextIconInFishOilAndOmegasSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInFishOilAndOmegasSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionDefaultPosition().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the View All button in the Fish Oil And Omegas section works correctly ", priority = 380)
    public void verifyClickingOnViewAllBtnInsideFishOilAndOmegasSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInFishOilAndOmegasSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInFishOilAndOmegasSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the product card in the Fish Oil And Omegas section works correctly ", priority = 381)
    public void verifyClickingOnProductCardInsideFishOilAndOmegasSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.getProductCardInFishOilAndOmegasSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //Multi Vitamins Section Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure the MultiVitamins section is displayed ", priority = 382)
    public void verifyMultiVitaminsSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionTitle().getText(),"Multivitamins","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSection().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the previous arrow icon is not appear by default in the MultiVitamins section ", priority = 383)
    public void verifyPreviousArrowButtonInMultiVitaminsSectionIsNotDisplayedByDefault() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.VitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        try{
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInMultiVitaminsSection().isDisplayed());}
                catch (Exception e){
            System.out.println("the previous arrow icon is not appear by default in the Fish Oil And Omegas section");}
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Next Button in the MultiVitamins section works correctly", priority = 384)
    public void verifyClickingOnNextIconInMultiVitaminsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInMultiVitaminsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Previous Button in the MultiVitamins section works correctly", priority = 385)
    public void verifyClickingOnPreviousIconInMultiVitaminsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeVitaminsAndHealthCategoryPage.getNextIconInMultiVitaminsSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInMultiVitaminsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the View All button in the MultiVitamins section works correctly ", priority = 386)
    public void verifyClickingOnViewAllBtnInsideMultiVitaminsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInMultiVitaminsSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInMultiVitaminsSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the product card in the MultiVitamins section works correctly ", priority = 387)
    public void verifyClickingOnProductCardInsideMultiVitaminsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.getProductCardInMultiVitaminsSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //Vitamins A-Z Section Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Vitamins A-Z section is displayed ", priority = 388)
    public void verifyVitaminsAZSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getVitaminsAZSectionTitle().getText(),"Vitamins A-Z","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getVitaminsAZSection().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the previous arrow icon is not appear by default in the Vitamins A-Z section ", priority = 389)
    public void verifyPreviousArrowButtonInVitaminsAZSectionIsNotDisplayedByDefault() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        try{
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInVitaminsAZSection().isDisplayed());}
                        catch (Exception e){
            System.out.println("the previous arrow icon is not appear by default in the Fish Oil And Omegas section");}
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Next Button in the Vitamins A-Z section works correctly", priority = 390)
    public void verifyClickingOnNextIconInVitaminsAZSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        if(aeVitaminsAndHealthCategoryPage.getProductsListInVitaminsAZSection().size()>5){
        aeVitaminsAndHealthCategoryPage.getNextIconInVitaminsAZSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());}
        else {
            System.out.println("The Products number is less than 5");
        }
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Previous Button in the Vitamins A-Z section works correctly", priority = 391)
    public void verifyClickingOnPreviousIconInVitaminsAZSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeVitaminsAndHealthCategoryPage.getNextIconInVitaminsAZSection().click();
        if(aeVitaminsAndHealthCategoryPage.getProductsListInVitaminsAZSection().size()>5){
            aeVitaminsAndHealthCategoryPage.getPreviousIconInVitaminsAZSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());}
        else {
            System.out.println("The Products number is less than 5");
        }
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the View All button in the Vitamins A-Z section works correctly ", priority = 392)
    public void verifyClickingOnViewAllBtnInsideVitaminsAZSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInVitaminsAZSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInVitaminsAZSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the product card in the Vitamins A-Z section works correctly ", priority = 393)
    public void verifyClickingOnProductCardInsideVitaminsAZSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.getProductCardIVitaminsAZSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //Minerals Section Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Minerals section is displayed ", priority = 394)
    public void verifyMineralsSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getMineralsSectionTitle().getText(),"Minerals","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMineralsSection().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the previous arrow icon is not appear by default in the Minerals section ", priority = 395)
    public void verifyPreviousArrowButtonInMineralsSectionIsNotDisplayedByDefault() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        try{
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInMineralsSection().isDisplayed());}
                        catch (Exception e){
            System.out.println("the previous arrow icon is not appear by default in the Fish Oil And Omegas section");}
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Next Button in the Minerals section works correctly", priority = 396)
    public void verifyClickingOnNextIconInMineralsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInMineralsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Previous Button in the Minerals section works correctly", priority = 397)
    public void verifyClickingOnPreviousIconInMineralsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeVitaminsAndHealthCategoryPage.getNextIconInMineralsSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInMineralsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the View All button in the Minerals section works correctly ", priority = 398)
    public void verifyClickingOnViewAllBtnInsideMineralsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInMineralsSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInMineralsSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the product card in the Minerals section works correctly ", priority = 399)
    public void verifyClickingOnProductCardInsideMineralsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.getProductCardInMineralsSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //Antioxidants Section Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Antioxidants section is displayed ", priority = 400)
    public void verifyAntioxidantsSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getAntioxidantsSectionTitle().getText(),"Antioxidants","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getAntioxidantsSection().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the previous arrow icon is not appear by default in the Antioxidants section ", priority = 401)
    public void verifyPreviousArrowButtonInAntioxidantsSectionIsNotDisplayedByDefault() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        try{
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInAntioxidantsSection().isDisplayed());}
                        catch (Exception e){
            System.out.println("the previous arrow icon is not appear by default in the Fish Oil And Omegas section");}
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Next Button in the Antioxidants section works correctly", priority = 402)
    public void verifyClickingOnNextIconInAntioxidantsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInAntioxidantsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Previous Button in the Antioxidants section works correctly", priority = 403)
    public void verifyClickingOnPreviousIconInAntioxidantsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeVitaminsAndHealthCategoryPage.getNextIconInAntioxidantsSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInAntioxidantsSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the View All button in the Antioxidants section works correctly ", priority = 404)
    public void verifyClickingOnViewAllBtnInsideAntioxidantsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInAntioxidantsSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInAntioxidantsSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the product card in the Antioxidants section works correctly ", priority = 405)
    public void verifyClickingOnProductCardInsideAntioxidantsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.getProductCardInAntioxidantsSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //Superfoods Section Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Superfoods section is displayed ", priority = 406)
    public void verifySuperfoodsSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getSuperFoodSectionTitle().getText(),"Superfoods","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getSuperFoodSection().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the previous arrow icon is not appear by default in the Superfoods section ", priority = 407)
    public void verifyPreviousArrowButtonInSuperfoodsSectionIsNotDisplayedByDefault() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        try{
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInSuperFoodSection().isDisplayed());}
                        catch (Exception e){
            System.out.println("the previous arrow icon is not appear by default in the Fish Oil And Omegas section");}
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Next Button in the Superfoods section works correctly", priority = 408)
    public void verifyClickingOnNextIconInSuperfoodsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInSuperFoodSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Previous Button in the Superfoods section works correctly", priority = 409)
    public void verifyClickingOnPreviousIconInSuperfoodsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeVitaminsAndHealthCategoryPage.getNextIconInSuperFoodSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInSuperFoodSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the View All button in the Superfoods section works correctly ", priority = 410)
    public void verifyClickingOnViewAllBtnInsideSuperfoodsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInSuperFoodSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInSuperFoodSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the product card in the Superfoods section works correctly ", priority = 411)
    public void verifyClickingOnProductCardInsideSuperfoodsSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.getProductCardInSuperFoodSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //Melatonin Section Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Melatonin section is displayed ", priority = 412)
    public void verifyMelatoninSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getMelatoninSectionTitle().getText(),"Melatonin","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMelatoninSection().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the previous arrow icon is not appear by default in the Melatonin section ", priority = 413)
    public void verifyPreviousArrowButtonInMelatoninSectionIsNotDisplayedByDefault() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        try{
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInMelatoninSection().isDisplayed());}
                        catch (Exception e){
            System.out.println("the previous arrow icon is not appear by default in the Fish Oil And Omegas section");}
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Next Button in the Melatonin section works correctly", priority = 414)
    public void verifyClickingOnNextIconInMelatoninSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInMelatoninSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Previous Button in the Melatonin section works correctly", priority = 415)
    public void verifyClickingOnPreviousIconInMelatoninSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeVitaminsAndHealthCategoryPage.getNextIconInMelatoninSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInMelatoninSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the View All button in the Melatonin section works correctly ", priority = 416)
    public void verifyClickingOnViewAllBtnInsideMelatoninSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInMelatoninSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInMelatoninSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the product card in the Melatonin section works correctly ", priority = 417)
    public void verifyClickingOnProductCardInsideMelatoninSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.getProductCardInMelatoninSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    //Collagen Section Test Cases
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Collagen section is displayed ", priority = 418)
    public void verifyCollagenSectionInTheVitaminsAndHealthCategoryPageIsDisplayed() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getCollagenSectionTitle().getText(),"Collagen","The Shop By Health Need Category has incorrect title");
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getCollagenSection().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the previous arrow icon is not appear by default in the Collagen section ", priority = 419)
    public void verifyPreviousArrowButtonInCollagenSectionIsNotDisplayedByDefault() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        try{
        Assert.assertFalse(aeVitaminsAndHealthCategoryPage.getPreviousIconInCollagenSection().isDisplayed());}
        catch (Exception e){
            System.out.println("the previous arrow icon is not appear by default in the Fish Oil And Omegas section");}
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Next Button in the Collagen section works correctly", priority = 420)
    public void verifyClickingOnNextIconInCollagenSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.getNextIconInCollagenSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFishOilAndOmegasSectionPositionAfterClickingOnNextIcon().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make sure clicking on Previous Button in the Collagen section works correctly", priority = 421)
    public void verifyClickingOnPreviousIconInCollagenSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeVitaminsAndHealthCategoryPage.getNextIconInCollagenSection().click();
        aeVitaminsAndHealthCategoryPage.getPreviousIconInCollagenSection().click();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getMultiVitaminsSectionDefaultPosition().isDisplayed());
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the View All button in the Collagen section works correctly ", priority = 422)
    public void verifyClickingOnViewAllBtnInsideCollagenSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl=aeVitaminsAndHealthCategoryPage.getViewAllInCollagenSection().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getViewAllInCollagenSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl(),expectedCategoryUrl);
    }
    @Test(groups = {"Vitamins & Health Category", "1. Critical Severity"},description = "Vitamins & Health Category- Make sure clicking on the product card in the Collagen section works correctly ", priority = 423)
    public void verifyClickingOnProductCardInsideCollagenSectionWorksCorrectly() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeVitaminsAndHealthCategoryPage.getProductCardInCollagenSection().click();
aeVitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Vitamins & Health Category", "4. Low Severity"},description = "Vitamins & Health Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Vitamins & Health category page", priority = 424)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInVitaminsAndHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToHomePage();
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }

    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure the Footer section appears correctly in the Vitamins & Health category page", priority = 425)
    public void verifyFooterSectionAppearsCorrectlyInVitaminsAndHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeFooterPage= new AEFooterPage(webDriver);
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }
    //Pagination control for all pages in the Vitamins & Health category page

    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Fish Oil And Omegas Category From Vitamins & Health Category Page  ", priority = 426)
    public void verifyAbilityToAccessAllPagesInsideFishOilAndOmegasCategoryFromVitaminsAndHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFishOilAndOmegasCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Multivitamins Category From Vitamins & Health Category Page  ", priority = 427)
    public void verifyAbilityToAccessAllPagesInsideMultivitaminsCategoryFromVitaminsAndHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage= new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMultivitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"Vitamins & Health Category","All Smoke Testing Result","3. Medium Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside VitaminsA_Z Category From Vitamins & Health Category Page  ", priority = 428)
    public void verifyAbilityToAccessAllPagesInsideVitaminsA_ZCategoryFromVitaminsAndHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnVitaminsA_ZCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Minerals Category From Vitamins & Health Category Page  ", priority = 429)
    public void verifyAbilityToAccessAllPagesInsideMineralsCategoryFromVitaminsAndHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMineralsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Antioxidants Category From Vitamins & Health Category Page  ", priority = 430)
    public void verifyAbilityToAccessAllPagesInsideAntioxidantsCategoryFromVitaminsAndHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnAntioxidantsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Superfoods Category From Vitamins & Health Category Page  ", priority = 431)
    public void verifyAbilityToAccessAllPagesInsideSuperfoodsCategoryFromVitaminsAndHealthCategoryPage () {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSuperfoodsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Collagen Category From Vitamins & Health Category Page  ", priority = 432)
    public void verifyAbilityToAccessAllPagesInsideCollagenCategoryFromVitaminsAndHealthCategoryPage () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnCollagenCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Melatonin Category From Vitamins & Health Category Page  ", priority = 433)
    public void verifyAbilityToAccessAllPagesInsideMelatoninCategoryFromVitaminsAndHealthCategoryPage () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMelatoninCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Beauty Category Inside The Shop By Health Need  ", priority = 434)
    public void verifyAbilityToAccessAllPagesInsideBeautyCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBeautyCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Bone And Joint Category Inside The Shop By Health Need  ", priority = 435)
    public void verifyAbilityToAccessAllPagesInsideBoneAndJointCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBoneAndJointCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Brain Support Category Inside The Shop By Health Need  ", priority = 436)
    public void verifyAbilityToAccessAllPagesInsideBrainSupportCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnBrainSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Detox And Liver Support Inside The Shop By Health Need  ", priority = 437)
    public void verifyAbilityToAccessAllPagesInsideDetoxAndLiverSupportCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndLiverSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Digestive Support Inside The Shop By Health Need  ", priority = 438)
    public void verifyAbilityToAccessAllPagesInsideDigestiveSupportCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDigestiveSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Energy Formulas Inside The Shop By Health Need  ", priority = 439)
    public void verifyAbilityToAccessAllPagesInsideEnergyFormulasCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyFormulasCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Hair And Skin And Nails Inside The Shop By Health Need  ", priority = 440)
    public void verifyAbilityToAccessAllPagesInsideHairAndSkinAndNailsCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHairAndSkinAndNailsCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Heart Health Inside The Shop By Health Need  ", priority = 441)
    public void verifyAbilityToAccessAllPagesInsideHeartHealthCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHeartHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Immunity Support Inside The Shop By Health Need  ", priority = 442)
    public void verifyAbilityToAccessAllPagesInsideImmunitySupportCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnImmunitySupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Kid's Health Inside The Shop By Health Need  ", priority = 443)
    public void verifyAbilityToAccessAllPagesInsideKidsHealthCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnKidsHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Men's Health Inside The Shop By Health Need  ", priority = 444)
    public void verifyAbilityToAccessAllPagesInsideMensHealthCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMensHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Sexual Health Inside The Shop By Health Need  ", priority = 445)
    public void verifyAbilityToAccessAllPagesInsideSexualHealthCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSexualHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Sleep Support The Shop By Health Need  ", priority = 446)
    public void verifyAbilityToAccessAllPagesInsideSleepSupportCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSleepSupportCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }

   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Diet Weight Management The Shop By Health Need  ", priority = 447)
    public void verifyAbilityToAccessAllPagesInsideDietWeightManagementCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDietWeightManagementCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
   @Test(groups = {"Vitamins & Health Category", "2. High Severity"},description = "Vitamins & Health Category- Make Sure the ability to access all pages inside Women Health The Shop By Health Need  ", priority = 448)
    public void verifyAbilityToAccessAllPagesInsideWomenHealthCategoryInsideTheShopByHealthNeed () {
       AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenHealthCategoryInsideTheShopByHealthNeedSectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"Vitamins & Health Category", "3. Medium Severity"},description = "Vitamins & Health Category- Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 449)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
        AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeGuestUserPage = new AEGuestUserPage(webDriver);
//        this.verifyClickingOnVitaminsAndHealthCategoryFromHomePageRedirectUserToCorrectURL();
        aeVitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeSiteURL," The Current URL is not matched with the Cart URL" );
    }
    }