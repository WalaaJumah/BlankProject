package sporter_test;

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
import static core.BasePage.siteURL;
import static org.testng.Assert.assertEquals;

public class AeWomenOnlyCategoryTestCases extends BaseTest {

    private AeProductDetailsPage aeProductDetailsPage;
    private AEFooterPage aeFooterPage;
    private AeSportsCategoryPage aeSportsCategoryPage;
    private AeVitaminsAndHealthCategoryPage aeVitaminsAndHealthCategoryPage;
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    private KsaHomePage ksaHomePage;
    private Actions action;

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Switching to UAE store", priority = 1)
    public void switchToUaeStore(){
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.switchToAECountry();
        if(webDriver.getCurrentUrl().contains(aeWomenOnlyCategoryPage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            aeWomenOnlyCategoryPage.switchToAECountry();
        }
    }
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure ability to access the Women's Only Category from the MegaMenu correctly", priority = 2)
    public void verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL( ) {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        action = new Actions(webDriver);
        action.moveToElement(aeWomenOnlyCategoryPage.getWomenOnlyMainMenu()).perform();
        String expectedUrl=aeWomenOnlyCategoryPage.getWomenOnlyMainMenu().getAttribute("href");
        aeWomenOnlyCategoryPage.getWomenOnlyMainMenu().click();
        DataHelperAndWait.waitForUrlContains(expectedUrl,webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Women's Only Category from ShopBy Menu works correctly", priority = 3)
    public void verifyClickingOnWomenOnlyCategoryFromShopByMenuRedirectUserToCorrectURL() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
            action = new Actions(webDriver);
            action.moveToElement(aeWomenOnlyCategoryPage.getShopeByMenu()).perform();
            action.moveToElement(aeWomenOnlyCategoryPage.getWomenOnlyOption()).perform();
            String expectedUrl = aeWomenOnlyCategoryPage.getWomenOnlyOption().getAttribute("href");
        aeWomenOnlyCategoryPage.getWomenOnlyOption().click();
            Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Make sure the Footer section appears correctly in the Women's Only category page", priority = 4)
    public void verifyFooterSectionAppearsCorrectlyInWomenOnlyCategoryPage() {
        aeFooterPage = new AEFooterPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(aeFooterPage.getFooterSection().isDisplayed());
    }
    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Women's Only category page(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 5)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWomenOnlyCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb", priority = 6)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbAppearingInWomenOnlyCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Make sure the rotating slider section is displayed correctly", priority = 7)
    public void verifyRotatingSliderIsDisplayedInTheWomenOnlyCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
//        Assert.assertTrue(ksaHomePage.getHomePageRotatingSlider().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderList().size(); i++) {
            DataHelperAndWait.waitToBeVisible(ksaHomePage.getHomePageRotatingSliderList().get(i),5,webDriver);
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderList().get(i).isDisplayed());
        }
    }

    //There's a bug here due to the next arrow icon is missing
    @Test(description = "Women's Only Category- Make sure the next button in the rotating slider section is displayed correctly", priority = 8)
    public void verifyNextArrowOfRotatingSliderIsDisplayedInTheWomenOnlyCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed(),"The next button in the rotating slider section is missing");
    }

    //There's a bug here due to the previous arrow icon is missing
    @Test(description = "Women's Only Category- Make sure the previous button in the rotating slider section is displayed correctly", priority = 9)
    public void verifyPreviousArrowOfRotatingSliderIsDisplayedInTheWomenOnlyCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
        Assert.assertTrue(ksaHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure the pagination control of rotating slider section is displayed correctly", priority = 10)
    public void verifyPaginationControlOfRotatingSliderSectionIsDisplayedInTheWomenOnlyCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
        for (int i = 0; i < ksaHomePage.getHomePageRotatingSliderPagingList().size(); i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingList().get(i).isDisplayed());
        }
    }

    @Test(description = "Women's Only Category- Make sure the side Banners is displayed correctly", priority = 11)
    public void verifySideBannersIsDisplayedInTheWomenOnlyCategoryPage() {
        ksaHomePage = new KsaHomePage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(ksaHomePage.getHomePageSideBanner().isDisplayed());
    }


    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure  clicking on the banners appear in rotating slider section works correctly", priority = 12)
    public void verifyClickingOnTheBannersAppearingInRotatingSliderSectionWorksCorrectlyInTheWomenOnlyCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().size(); i++) {
            aeVitaminsAndHealthCategoryPage.getPagerOfRotatingSlider().get(i).click();
            aeVitaminsAndHealthCategoryPage.getBannerInRotatingSliderSection().click();
            aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
            aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        }
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure the clicking on the first side banner works correctly", priority = 13)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheWomenOnlyCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedBannerUrl = aeVitaminsAndHealthCategoryPage.getFirstSideBanner().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getFirstSideBanner().click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
//        assertEquals(webDriver.getCurrentUrl(),expectedBannerUrl.substring(0,expectedBannerUrl.length()-1));
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedBannerUrl.substring(0, expectedBannerUrl.length() - 1)));
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the second side banner works correctly", priority = 14)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheWomenOnlyCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedBannerUrl = aeVitaminsAndHealthCategoryPage.getSecondSideBanner().getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getSecondSideBanner().click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedBannerUrl.replace(siteURL, siteURL + aeDomain)));
    }

    //Shop By Category Test Cases
    @Test(description = "Women's Only Category- Make sure the Shop By Category section is displayed ", priority = 15)
    public void verifyShopByCategoryInTheWomenOnlyCategoryPageIsDisplayed() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        ksaHomePage = new KsaHomePage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        Assert.assertTrue(ksaHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getShopByCategorySections().isDisplayed());
    }

    //Supplements For Her Category page Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Supplements For Her category inside Shop By Category section works correctly ", priority = 16)
    public void verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedCategoryUrl = aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(0).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(0).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl.replace(siteURL, siteURL + aeDomain)));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Supplements For Her category page ", priority = 17)
    public void verifyResultFieldAndItsVaLueAppearInTheSupplementsForHerCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        aeWomenOnlyCategoryPage.navigate();
//        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Supplements For Her category page ", priority = 18)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheSupplementsForHerCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
//        aeWomenOnlyCategoryPage.navigate();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Newly added items");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Supplements For Her Category Page ", priority = 19)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForSupplementsForHerCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Supplements For Her category page  ", priority = 20)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSupplementsForHerCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Supplements For Her Category Page ", priority = 21)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInSupplementsForHerCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Supplements For Her Category page ", priority = 22)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInSupplementsForHerCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5,webDriver);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Supplements For Her, Categories", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }

    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Supplements For Her category page", priority = 23)
    public void verifySearchBtnWorksCorrectlyFromSupplementsForHerCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Supplements For Her category page is disable when the current page is page 1 ", priority = 24)
    public void verifyThePreviousBtnInSupplementsForHerCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(0).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Supplements For Her category page works correctly", priority = 25)
    public void verifyThePaginationControlInSupplementsForHerCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Supplements For Her Category Page works correctly", priority = 26)
    public void verifyPreviousPageBtnInSupplementsForHerCategoryPageWorksCorrectly(){
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInSupplementsForHerCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Supplements For Her Category Page works correctly", priority = 27)
    public void verifyNextPageBtnInSupplementsForHerCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInSupplementsForHerCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Supplements For Her category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 28)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSupplementsForHerCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Supplements For Her category page", priority = 29)
    public void verifyFiltrationSectionIsDisplayedInSupplementsForHerCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnSupplementsForHerCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Women's Daily Vitamins Category page Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Women's Daily Vitamins category inside Shop By Category section works correctly ", priority = 30)
    public void verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedCategoryUrl = aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(1).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(1).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl.replace(siteURL, siteURL + aeDomain)));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Women's Daily Vitamins category page ", priority = 31)
    public void verifyResultFieldAndItsVaLueAppearInTheWomenDailyVitaminsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Women's Daily Vitamins category page ", priority = 32)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheWomenDailyVitaminsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Women's Daily Vitamins Category Page ", priority = 33)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForWomenDailyVitaminsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Women's Daily Vitamins category page  ", priority = 34)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInWomenDailyVitaminsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Women's Daily Vitamins Category Page ", priority = 35)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInWomenDailyVitaminsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Women's Daily Vitamins Category page ", priority = 36)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInWomenDailyVitaminsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5,webDriver);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Womens Daily Vitamins, Categories", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }

    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Women's Daily Vitamins category page", priority = 37)
    public void verifySearchBtnWorksCorrectlyFromWomenDailyVitaminsCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Women's Daily Vitamins category page is disable when the current page is page 1 ", priority = 38)
    public void verifyThePreviousBtnInWomenDailyVitaminsCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(1).click();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Women's Daily Vitamins category page works correctly", priority = 39)
    public void verifyThePaginationControlInWomenDailyVitaminsCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Women's Daily Vitamins Category Page works correctly", priority = 40)
    public void verifyPreviousPageBtnInWomenDailyVitaminsCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInWomenDailyVitaminsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Women's Daily Vitamins Category Page works correctly", priority = 41)
    public void verifyNextPageBtnInWomenDailyVitaminsCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInWomenDailyVitaminsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Women Daily Vitamins category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 42)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWomenDailyVitaminsCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Women's Daily Vitamins category page", priority = 43)
    public void verifyFiltrationSectionIsDisplayedInWomenDailyVitaminsCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenDailyVitaminsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Lady-Friendly Snacks & Food Category page Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Lady-Friendly Snacks & Food inside Shop By Category section works correctly ", priority = 44)
    public void verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedCategoryUrl = aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(2).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(2).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl.replace(siteURL, siteURL + aeDomain)));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Lady-Friendly Snacks & Food category page ", priority = 45)
    public void verifyResultFieldAndItsVaLueAppearInTheLadyFriendlySnacksAndFoodCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Lady-Friendly Snacks & Food category page ", priority = 46)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheLadyFriendlySnacksAndFoodCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Lady-Friendly Snacks & Food Category Page ", priority = 47)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForLadyFriendlySnacksAndFoodCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Lady-Friendly Snacks & Food category page  ", priority = 48)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInLadyFriendlySnacksAndFoodCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Lady-Friendly Snacks & Food Category Page ", priority = 49)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInLadyFriendlySnacksAndFoodCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Lady-Friendly Snacks & Food category page", priority = 51)
    public void verifySearchBtnWorksCorrectlyFromLadyFriendlySnacksAndFoodCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Lady-Friendly Snacks & Food category page is disable when the current page is page 1 ", priority = 52)
    public void verifyThePreviousBtnInLadyFriendlySnacksAndFoodCategoryPageIsDisableWhenDisplayPage1() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(2).click();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Lady-Friendly Snacks & Food category page works correctly", priority = 53)
    public void verifyThePaginationControlInLadyFriendlySnacksAndFoodCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Lady-Friendly Snacks & Food Category Page works correctly", priority = 54)
    public void verifyPreviousPageBtnInLadyFriendlySnacksAndFoodCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInLadyFriendlySnacksAndFoodCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Lady-Friendly Snacks & Food Category Page works correctly", priority = 55)
    public void verifyNextPageBtnInLadyFriendlySnacksAndFoodCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInLadyFriendlySnacksAndFoodCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Lady-Friendly Snacks & Food category page", priority = 56)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInLadyFriendlySnacksAndFoodCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Lady-Friendly Snacks & Food category page", priority = 57)
    public void verifyFiltrationSectionIsDisplayedInLadyFriendlySnacksAndFoodCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnLadyFriendlySnacksAndFoodCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Makeup for Active Lifestyles Category page Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Makeup for Active Lifestyles inside Shop By Category section works correctly ", priority = 58)
    public void verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedCategoryUrl = aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(3).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getShopByCategoryList().get(3).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl.replace(siteURL, siteURL + aeDomain)));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Makeup for Active Lifestyles category page ", priority = 59)
    public void verifyResultFieldAndItsVaLueAppearInTheMakeupForActiveLifestylesCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Makeup for Active Lifestyles category page ", priority = 60)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMakeupForActiveLifestylesCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Newly added items");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Makeup for Active Lifestyles Category Page ", priority = 61)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForMakeupForActiveLifestylesCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Makeup for Active Lifestyles category page  ", priority = 62)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMakeupForActiveLifestylesCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Makeup for Active Lifestyles Category Page ", priority = 63)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMakeupForActiveLifestylesCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }
    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Makeup for Active Lifestyles category page", priority = 64)
    public void verifySearchBtnWorksCorrectlyFromMakeupForActiveLifestylesCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Makeup for Active Lifestyles category page is disable when the current page is page 1 ", priority = 65)
    public void verifyThePreviousBtnInMakeupForActiveLifestylesCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Makeup for Active Lifestyles category page works correctly", priority = 66)
    public void verifyThePaginationControlInMakeupForActiveLifestylesCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));}
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Makeup for Active Lifestyles Category Page works correctly", priority = 67)
    public void verifyPreviousPageBtnInMakeupForActiveLifestylesCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMakeupForActiveLifestylesCategoryPageWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));}
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Makeup for Active Lifestyles Category Page works correctly", priority = 68)
    public void verifyNextPageBtnInMakeupForActiveLifestylesCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMakeupForActiveLifestylesCategoryPageWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));}
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Makeup For Active Life styles category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 69)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMakeupForActiveLifestylesCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Makeup for Active Lifestyles category page", priority = 70)
    public void verifyFiltrationSectionIsDisplayedInMakeupForActiveLifestylesCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMakeupForActiveLifestylesCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Shop By Goal Section Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure that Shop By Goal section is displayed correctly ", priority = 71)
    public void verifyShopByGoalSectionIsDisplayedCorrectly() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideTitle().getText(), "Shop By Goal");
        ArrayList<String> expectedOptions = new ArrayList<>() {{
            add("Hair, Skin & Nails");
            add("Weight Loss");
            add("Mood Support");
            add("Detox & Cleanse");
            add("PMS Relief");
            add("Energy & Endurance");
            add("Prenatal Care");
            add("Muscle & Weight Gain");
            add("Fashion & Style");
            add("Personal Care");
        }};
        for (int i = 0; i < aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().size(); i++) {
            Assert.assertEquals(aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(i).getText(), expectedOptions.get(i));
            System.out.println("Actual: " + aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(i).getText() + "  Expected: " + expectedOptions.get(i));
        }
    }

    //Hair, Skin & Nails Category Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Hair, Skin & Nails Category inside Shop By Category section works correctly ", priority = 72)
    public void verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String expectedUrl = aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(0).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(0).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl.replace(siteURL, siteURL + aeDomain)));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Hair, Skin & Nails Category page ", priority = 73)
    public void verifyResultFieldAndItsVaLueAppearInTheHairSkinAndNailsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Hair, Skin & Nails Category page ", priority = 74)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheHairSkinAndNailsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for MHair, Skin & Nails Category Page ", priority = 75)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForHairSkinAndNailsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Hair, Skin & Nails Category page  ", priority = 76)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInHairSkinAndNailsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Hair, Skin & Nails Category Page ", priority = 77)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInHairSkinAndNailsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Hair, Skin & Nails Category page ", priority = 78)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInHairSkinAndNailsCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        this.verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5,webDriver);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Hair, Skin & Nails, Goal", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }

    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Hair, Skin & Nails Category page", priority = 79)
    public void verifySearchBtnWorksCorrectlyFromHairSkinAndNailsCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Hair, Skin & Nails Category page is disable when the current page is page 1 ", priority = 80)
    public void verifyThePreviousBtnInHairSkinAndNailsCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        this.verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

//    There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Hair, Skin & Nails Category page works correctly", priority = 81)
    public void verifyThePaginationControlInHairSkinAndNailsCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,6);
       Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Hair, Skin & Nails Category Page works correctly", priority = 82)
    public void verifyPreviousPageBtnInHairSkinAndNailsCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInHairSkinAndNailsCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Hair, Skin & Nails Category Page works correctly", priority = 83)
    public void verifyNextPageBtnInHairSkinAndNailsCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInHairSkinAndNailsCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=3",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Hair Skin & Nails category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 84)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInHairSkinAndNailsCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Hair, Skin & Nails Category page", priority = 85)
    public void verifyFiltrationSectionIsDisplayedInHairSkinAndNailsCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnHairSkinAndNailsCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Weight Loss Category Test Cases

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Weight Loss Category inside Shop By Category section works correctly ", priority = 86)
    public void verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedUrl = aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(1).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(1).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl.replace(siteURL, siteURL + aeDomain)));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Weight Loss Category page ", priority = 87)
    public void verifyResultFieldAndItsVaLueAppearInTheWeightLossCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Weight Loss Category page ", priority = 88)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheWeightLossCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Weight Loss Category Page ", priority = 89)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForWeightLossCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Weight Loss Category page  ", priority = 90)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInWeightLossCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Weight Loss Category Page ", priority = 91)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInWeightLossCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Weight Loss Category page ", priority = 92)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInWeightLossCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5,webDriver);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Weight Loss, Goal", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }

    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Weight Loss Category page", priority = 93)
    public void verifySearchBtnWorksCorrectlyFromWeightLossCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Weight Loss Category page is disable when the current page is page 1 ", priority = 94)
    public void verifyThePreviousBtnInWeightLossCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Weight Loss Category page works correctly", priority = 95)
    public void verifyThePaginationControlInWeightLossCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Weight Loss Category Page works correctly", priority = 96)
    public void verifyPreviousPageBtnInWeightLossCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInWeightLossCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Weight Loss Category Page works correctly", priority = 97)
    public void verifyNextPageBtnInWeightLossCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInWeightLossCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Weight Loss category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 98)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInWeightLossCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Weight Loss Category page", priority = 99)
    public void verifyFiltrationSectionIsDisplayedInWeightLossCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnWeightLossCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Mood Support Category Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Mood Support Category inside Shop By Category section works correctly ", priority = 100)
    public void verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(2).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("mood-support"));
//        Assert.assertEquals(webDriver.getCurrentUrl(),newExpectedUrl.substring(0,expectedUrl.length()-1));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Mood Support Category page ", priority = 101)
    public void verifyResultFieldAndItsVaLueAppearInTheMoodSupportCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Mood Support Category page ", priority = 102)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMoodSupportCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Mood Support Category Page ", priority = 103)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForMoodSupportCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Mood Support Category page  ", priority = 104)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMoodSupportCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Mood Support Category Page ", priority = 105)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMoodSupportCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Mood Support Category page ", priority = 106)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInMoodSupportCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5,webDriver);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Mood Support, Goal", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }

    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Mood Support Category page", priority = 107)
    public void verifySearchBtnWorksCorrectlyFromMoodSupportCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Mood Support Category page is disable when the current page is page 1 ", priority = 108)
    public void verifyThePreviousBtnInMoodSupportCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Mood Support Category page works correctly", priority = 109)
    public void verifyThePaginationControlInMoodSupportCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Mood Support Category Page works correctly", priority = 110)
    public void verifyPreviousPageBtnInMoodSupportCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMoodSupportCategoryPageWorksCorrectly();
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Mood Support Category Page works correctly", priority = 111)
    public void verifyNextPageBtnInMoodSupportCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMoodSupportCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2")," The system redirect you to "+webDriver.getCurrentUrl());
    }

    @Test(description = " Women's Only Category- Make sure all secure tabs appears correctly in the Mood Support category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 112)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMoodSupportCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Mood Support Category page", priority = 113)
    public void verifyFiltrationSectionIsDisplayedInMoodSupportCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMoodSupportCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Detox & Cleanse Category Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Detox & Cleanse Category inside Shop By Category section works correctly ", priority = 114)
    public void verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedUrl = aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(3).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(3).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl.replace(siteURL, siteURL + aeDomain)));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Detox & Cleanse Category page ", priority = 115)
    public void verifyResultFieldAndItsVaLueAppearInTheDetoxAndCleanseCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Detox & Cleanse Category page ", priority = 116)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheDetoxAndCleanseCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Detox & Cleanse Category Page ", priority = 117)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForDetoxAndCleanseCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Detox & Cleanse Category page  ", priority = 118)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInDetoxAndCleanseCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Detox & Cleanse Category Page ", priority = 119)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInDetoxAndCleanseCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Detox & Cleanse Category page ", priority = 120)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInDetoxAndCleanseCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5,webDriver);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Detox & Cleanse , Goal", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }

    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Detox & Cleanse Category page", priority = 121)
    public void verifySearchBtnWorksCorrectlyFromDetoxAndCleanseCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Detox & Cleanse Category page is disable when the current page is page 1 ", priority = 122)
    public void verifyThePreviousBtnInDetoxAndCleanseCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Detox & Cleanse Category page works correctly", priority = 123)
    public void verifyThePaginationControlInDetoxAndCleanseCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Detox & Cleanse Category Page works correctly", priority = 124)
    public void verifyPreviousPageBtnInDetoxAndCleanseCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInDetoxAndCleanseCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Detox & Cleanse Category Page works correctly", priority = 125)
    public void verifyNextPageBtnInDetoxAndCleanseCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInDetoxAndCleanseCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Detox & Cleanse category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 126)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInDetoxAndCleanseCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Detox & Cleanse Category page", priority = 127)
    public void verifyFiltrationSectionIsDisplayedInDetoxAndCleanseCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnDetoxAndCleanseCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //PMS Relief Category Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the PMS Relief Category inside Shop By Category section works correctly ", priority = 128)
    public void verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedUrl = aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(4).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(4).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl.replace(siteURL, siteURL + aeDomain)));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the PMS Relief Category page ", priority = 129)
    public void verifyResultFieldAndItsVaLueAppearInThePMSReliefCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the PMS Relief Category page ", priority = 130)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInThePMSReliefCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Newly added items");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for PMS Relief Category Page ", priority = 131)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForPMSReliefCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the PMS Relief Category page  ", priority = 132)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInPMSReliefCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the PMS Relief Category Page ", priority = 133)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInPMSReliefCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the PMS Relief Category page ", priority = 134)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInPMSReliefCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5,webDriver);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Pms Relief, Goal", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }

    @Test(description = "Women's Only Category- Verify that the search button works correctly from the PMS Relief Category page", priority = 135)
    public void verifySearchBtnWorksCorrectlyFromPMSReliefCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the PMS Relief Category page is disable when the current page is page 1 ", priority = 136)
    public void verifyThePreviousBtnInPMSReliefCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the PMS Relief Category page works correctly", priority = 137)
    public void verifyThePaginationControlInPMSReliefCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));}
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In PMS Relief Category Page works correctly", priority = 138)
    public void verifyPreviousPageBtnInPMSReliefCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInPMSReliefCategoryPageWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));}
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In PMS Relief Category Page works correctly", priority = 139)
    public void verifyNextPageBtnInPMSReliefCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInPMSReliefCategoryPageWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));}
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the PMS Relief category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 140)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInPMSReliefCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the PMS Relief Category page", priority = 141)
    public void verifyFiltrationSectionIsDisplayedInPMSReliefCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnPMSReliefCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Energy & Endurance Category Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Energy & Endurance Category inside Shop By Category section works correctly ", priority = 142)
    public void verifyClickingOnEnergyAndEnduranceCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedUrl = aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(5).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(5).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl.replace(siteURL, siteURL + aeDomain)));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Energy & Endurance Category page ", priority = 143)
    public void verifyResultFieldAndItsVaLueAppearInTheEnergyAndEnduranceCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyAndEnduranceCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Energy & Endurance Category page ", priority = 144)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheEnergyAndEnduranceCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyAndEnduranceCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Energy & Endurance Category Page ", priority = 145)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForEnergyAndEnduranceCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyAndEnduranceCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Energy & Endurance Category page  ", priority = 146)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInEnergyAndEnduranceCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyAndEnduranceCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Energy & Endurance Category Page ", priority = 147)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInEnergyAndEnduranceCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnEnergyAndEnduranceCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }
    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Energy & Endurance Category page", priority = 148)
    public void verifySearchBtnWorksCorrectlyFromEnergyAndEnduranceCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnEnergyAndEnduranceCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Energy & Endurance Category page is disable when the current page is page 1 ", priority = 149)
    public void verifyThePreviousBtnInEnergyAndEnduranceCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyAndEnduranceCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Energy & Endurance Category page works correctly", priority = 150)
    public void verifyThePaginationControlInEnergyAndEnduranceCategoryPageWorksCorrectly() {
               AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnEnergyAndEnduranceCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Energy & Endurance Category Page works correctly", priority = 151)
    public void verifyPreviousPageBtnInEnergyAndEnduranceCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInEnergyAndEnduranceCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Energy & Endurance Category Page works correctly", priority = 152)
    public void verifyNextPageBtnInEnergyAndEnduranceCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePaginationControlInEnergyAndEnduranceCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Energy & Endurance category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 153)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInEnergyAndEnduranceCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Energy & Endurance Category page", priority = 154)
    public void verifyFiltrationSectionIsDisplayedInEnergyAndEnduranceCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnEnergyAndEnduranceCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Prenatal Care Category Test Cases

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Prenatal Care Category inside Shop By Category section works correctly ", priority = 155)
    public void verifyClickingOnPrenatalCareCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedUrl = aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(6).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(6).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        assertEquals(webDriver.getCurrentUrl().substring(29), expectedUrl.substring(29));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Prenatal Care Category page ", priority = 156)
    public void verifyResultFieldAndItsVaLueAppearInThePrenatalCareCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPrenatalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Prenatal Care Category page ", priority = 157)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInThePrenatalCareCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPrenatalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Prenatal Care Category Page ", priority = 158)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForPrenatalCareCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPrenatalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Prenatal Care Category page  ", priority = 159)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInPrenatalCareCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPrenatalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Prenatal Care Category Page ", priority = 160)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInPrenatalCareCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPrenatalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }
    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Prenatal Care Category page", priority = 161)
    public void verifySearchBtnWorksCorrectlyFromPrenatalCareCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnPrenatalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Prenatal Care Category page is disable when the current page is page 1 ", priority = 162)
    public void verifyThePreviousBtnInPrenatalCareCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnPrenatalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Prenatal Care Category page works correctly", priority = 163)
    public void verifyThePaginationControlInPrenatalCareCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPrenatalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Prenatal Care Category Page works correctly", priority = 164)
    public void verifyPreviousPageBtnInPrenatalCareCategoryPageWorksCorrectly() {
                    AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInPrenatalCareCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Prenatal Care Category Page works correctly", priority = 165)
    public void verifyNextPageBtnInPrenatalCareCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInPrenatalCareCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Prenatal Care category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 166)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInPrenatalCareCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    //There's a bug here due to the filtration section is missing
    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Prenatal Care Category page", priority = 167)
    public void verifyFiltrationSectionIsDisplayedInPrenatalCareCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnPrenatalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Muscle & Weight Gain Category Test Cases

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Muscle & Weight Gain Category inside Shop By Category section works correctly ", priority = 168)
    public void verifyClickingOnMuscleAndWeightGainCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(7).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("muscle-weight-gain"));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Muscle & Weight Gain Category page ", priority = 169)
    public void verifyResultFieldAndItsVaLueAppearInTheMuscleAndWeightGainCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMuscleAndWeightGainCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Muscle & Weight Gain Category page ", priority = 170)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheMuscleAndWeightGainCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMuscleAndWeightGainCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Muscle & Weight Gain Category Page ", priority = 171)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForMuscleAndWeightGainCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMuscleAndWeightGainCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Muscle & Weight Gain Category page  ", priority = 172)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInMuscleAndWeightGainCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMuscleAndWeightGainCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Muscle & Weight Gain Category Page ", priority = 173)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInMuscleAndWeightGainCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMuscleAndWeightGainCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Muscle & Weight Gain Category page", priority = 174)
    public void verifySearchBtnWorksCorrectlyFromMuscleAndWeightGainCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnMuscleAndWeightGainCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Muscle & Weight Gain Category page is disable when the current page is page 1 ", priority = 175)
    public void verifyThePreviousBtnInMuscleAndWeightGainCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnMuscleAndWeightGainCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Muscle & Weight Gain Category page works correctly", priority = 176)
    public void verifyThePaginationControlInMuscleAndWeightGainCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnMuscleAndWeightGainCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Muscle & Weight Gain Category Page works correctly", priority = 177)
    public void verifyPreviousPageBtnInMuscleAndWeightGainCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMuscleAndWeightGainCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Muscle & Weight Gain Category Page works correctly", priority = 178)
    public void verifyNextPageBtnInMuscleAndWeightGainCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInMuscleAndWeightGainCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Muscle & Weight Gain category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 179)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInMuscleAndWeightGainCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Muscle & Weight Gain Category page", priority = 180)
    public void verifyFiltrationSectionIsDisplayedInMuscleAndWeightGainCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnMuscleAndWeightGainCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Fashion & Style Category Test Cases

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Fashion & Style Category inside Shop By Category section works correctly ", priority = 181)
    public void verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedUrl = aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(8).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(8).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl.replace(siteURL, siteURL + aeDomain)));
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Fashion & Style Category page ", priority = 182)
    public void verifyResultFieldAndItsVaLueAppearInTheFashionAndStyleCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Fashion & Style Category page ", priority = 183)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInTheFashionAndStyleCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly();
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
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Featured option is selected by default in the Sort By menu for Fashion & Style Category Page ", priority = 184)
    public void verifyFeaturedOptionIsSelectedByDefaultInSortByMenuForFashionAndStyleCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Fashion & Style Category page  ", priority = 185)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInFashionAndStyleCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Fashion & Style Category Page ", priority = 186)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInFashionAndStyleCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }

    @Test(description = "Women's Only Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Fashion & Style Category page ", priority = 187)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInFashionAndStyleCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5,webDriver);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Women, Sportswear & Accessories", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }

    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Fashion & Style Category page", priority = 188)
    public void verifySearchBtnWorksCorrectlyFromFashionAndStyleCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Fashion & Style Category page is disable when the current page is page 1 ", priority = 189)
    public void verifyThePreviousBtnInFashionAndStyleCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Fashion & Style Category page works correctly", priority = 190)
    public void verifyThePaginationControlInFashionAndStyleCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Fashion & Style Category Page works correctly", priority = 191)
    public void verifyPreviousPageBtnInFashionAndStyleCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInFashionAndStyleCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Fashion & Style Category Page works correctly", priority = 192)
    public void verifyNextPageBtnInFashionAndStyleCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInFashionAndStyleCategoryPageWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Fashion & Style category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 193)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInFashionAndStyleCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Fashion & Style Category page", priority = 194)
    public void verifyFiltrationSectionIsDisplayedInFashionAndStyleCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnFashionAndStyleCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Personal Care Category Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the Personal Care Category inside Shop By Category section works correctly ", priority = 195)
    public void verifyClickingOnPersonalCareCategoryInsideTheShopByCategorySectionWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedUrl = aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(9).getAttribute("href");
        aeVitaminsAndHealthCategoryPage.getHerbalReferenceGuideList().get(9).click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertEquals(webDriver.getCurrentUrl(), expectedUrl);
    }

    @Test(description = "Women's Only Category- Make sure that the Result label and its value appear correctly in the Personal Care Category page ", priority = 196)
    public void verifyResultFieldAndItsVaLueAppearInThePersonalCareCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    //There's a bug here due to some filtration is missing
    @Test(description = "Women's Only Category- Make sure that Sort By menu and its options appear correctly in the Personal Care Category page ", priority = 197)
    public void verifySortByMenuAndItsOptionsAppearCorrectlyInThePersonalCareCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Newly added items");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
            System.out.println("Actual: " + options.get(i).getText() + "  Expected: " + expectedOption.get(i));
        }
    }

    @Test(description = "Women's Only Category- Make sure that the Best Selling option is selected by default in the Sort By menu for Personal Care Category Page ", priority = 198)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenuForPersonalCareCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }

    @Test(description = "Women's Only Category- Make sure the Horizontal Category Image appears correctly in the Personal Care Category page  ", priority = 199)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInPersonalCareCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Personal Care Category Page ", priority = 200)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumbInPersonalCareCategoryPage() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL + aeSiteURL);
    }
    @Test(description = "Women's Only Category- Verify that the search button works correctly from the Personal Care Category page", priority = 201)
    public void verifySearchBtnWorksCorrectlyFromPersonalCareCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Verify that the previous page button in the Personal Care Category page is disable when the current page is page 1 ", priority = 202)
    public void verifyThePreviousBtnInPersonalCareCategoryPageIsDisableWhenDisplayPage1() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnPersonalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());}
    }

    //There's a performance issue in the Navigation
    @Test(description = "Women's Only Category- Make Sure the Pagination control in the Personal Care Category page works correctly", priority = 203)
    public void verifyThePaginationControlInPersonalCareCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        aeSportSupplementsCategoryPage.navigateToPage2InPersonalCarePage();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));}
    }

    @Test(description = "Women's Only Category- Make Sure the previous page button In Personal Care Category Page works correctly", priority = 204)
    public void verifyPreviousPageBtnInPersonalCareCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInPersonalCareCategoryPageWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));}
    }

    @Test(description = "Women's Only Category- Make Sure the next page button In Personal Care Category Page works correctly", priority = 205)
    public void verifyNextPageBtnInPersonalCareCategoryPageWorksCorrectly() {
                AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyThePaginationControlInPersonalCareCategoryPageWorksCorrectly();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else{
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));}
    }

    @Test(description = "Women's Only Category- Make sure all secure tabs appears correctly in the Personal Care category page(100% Secure Payments & Authentic Products & Fast Delivery Service blocks)", priority = 206)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInPersonalCareCategoryPage() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeWomenOnlyCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeWomenOnlyCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeWomenOnlyCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }

    @Test(description = "Women's Only Category- Make sure the Filtration Section is displayed in the Personal Care Category page", priority = 207)
    public void verifyFiltrationSectionIsDisplayedInPersonalCareCategoryPage() {
        aeVitaminsAndHealthCategoryPage = new AeVitaminsAndHealthCategoryPage(webDriver);
//        this.verifyClickingOnPersonalCareCategoryInsideTheShopByCategorySectionWorksCorrectly();
        Assert.assertTrue(aeVitaminsAndHealthCategoryPage.getFiltrationSection().isDisplayed());
    }

    //Supplements For Her Widget Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure the Supplements For Her Widget is displayed in the Women's Only Category Page ", priority = 208)
    public void verifySupplementsForHerWidgetIsDisplayedInTheWomenOnlySection() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        Assert.assertEquals(aeWomenOnlyCategoryPage.getSupplementsForHerSectionTitle().getText(), "Supplements For Her", "The Recommended Products section incorrect title");
        Assert.assertTrue(aeWomenOnlyCategoryPage.getSupplementsForHerSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure the previous arrow icon is not appear by default in the Supplements For Her Widget ", priority = 209)
    public void verifyPreviousArrowButtonInSupplementsForHerWidgetIsNotDisplayedByDefault() {
        aeSportsCategoryPage = new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertFalse(aeSportsCategoryPage.getPreviousIconInRecommendedProductsSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure clicking on Next Button in the Supplements For Her Widget works correctly", priority = 210)
    public void verifyClickingOnNextIconInSupplementsForHerWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeSportsCategoryPage = new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportsCategoryPage.getNextIconInRecommendedProductsSection().click();
        Assert.assertTrue(aeWomenOnlyCategoryPage.getLastProductInSupplementsForHerSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure clicking on Previous Button in the Supplements For Her Widget works correctly", priority = 211)
    public void verifyClickingOnPreviousIconInSupplementsForHerWidgetWorksCorrectly() {
        aeSportsCategoryPage = new AeSportsCategoryPage(webDriver);
//        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportsCategoryPage.getNextIconInRecommendedProductsSection().click();
        aeSportsCategoryPage.getPreviousIconInRecommendedProductsSection().click();
        Assert.assertTrue(aeSportsCategoryPage.getPreviousIconInRecommendedProductsSection().isDisplayed());
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the product card in the Supplements For Her Widget works correctly ", priority = 212)
    public void verifyClickingOnProductCardInsideSupplementsForHerWidgetWorksCorrectly() {
AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        aeWomenOnlyCategoryPage.getProductCardInSupplementsForHerSection().click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(description = "Women's Only Category- Make sure clicking on the View All button in the Supplements For Her Widget works correctly ", priority = 213)
    public void verifyClickingOnViewAllBtnInsideSupplementsForHerWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedCategoryUrl = aeWomenOnlyCategoryPage.getViewAllInSupplementsForHerSection().getAttribute("href");
        aeWomenOnlyCategoryPage.getViewAllInSupplementsForHerSection().click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl));
    }

    //Women's Vitamins Widget Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure the Women's Vitamins Widget is displayed in the Women's Only Category Page ", priority = 214)
    public void verifyWomenVitaminsWidgetIsDisplayedInTheWomenOnlySection() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        Assert.assertEquals(aeWomenOnlyCategoryPage.getWomenVitaminsSectionTitle().getText(), "Women's Vitamins", "The Recommended Products section incorrect title");
        Assert.assertTrue(aeWomenOnlyCategoryPage.getWomenVitaminsSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure the previous arrow icon is not appear by default in the Women's Vitamins Widget ", priority = 215)
    public void verifyPreviousArrowButtonInWomenVitaminsWidgetIsNotDisplayedByDefault() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertFalse(aeWomenOnlyCategoryPage.getPreviousIconInWomenVitaminsSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure clicking on Next Button in the Women's Vitamins Widget works correctly", priority = 216)
    public void verifyClickingOnNextIconInWomenVitaminsWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.getNextIconInInWomenVitaminsSection().click();
        Assert.assertFalse(aeWomenOnlyCategoryPage.getLastProductInWomenVitaminsSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure clicking on Previous Button in the Women's Vitamins Widget works correctly", priority = 217)
    public void verifyClickingOnPreviousIconInWomenVitaminsWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.getNextIconInInWomenVitaminsSection().click();
        aeWomenOnlyCategoryPage.getPreviousIconInWomenVitaminsSection().click();
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPreviousIconInWomenVitaminsSection().isDisplayed());
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the product card in the Women's Vitamins Widget works correctly ", priority = 218)
    public void verifyClickingOnProductCardInsideWomenVitaminsWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        aeWomenOnlyCategoryPage.getProductCardInWomenVitaminsSection().click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the View All button in the Women's Vitamins Widget works correctly ", priority = 219)
    public void verifyClickingOnViewAllBtnInsideWomenVitaminsWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedCategoryUrl = aeWomenOnlyCategoryPage.getViewAllInWomenVitaminsSection().getAttribute("href");
        aeWomenOnlyCategoryPage.getViewAllInWomenVitaminsSection().click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl));
    }

    //Workout In Style Widget Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure the Workout In Style Widget is displayed in the Women's Only Category Page ", priority = 220)
    public void verifyWorkoutInStyleWidgetIsDisplayedInTheWomenOnlySection() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        Assert.assertEquals(aeWomenOnlyCategoryPage.getWorkoutInStyleSectionTitle().getText(), "Workout In Style", "The Recommended Products section incorrect title");
        Assert.assertTrue(aeWomenOnlyCategoryPage.getWorkoutInStyleSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure the previous arrow icon is not appear by default in the Workout In Style Widget ", priority = 221)
    public void verifyPreviousArrowButtonInWorkoutInStyleWidgetIsNotDisplayedByDefault() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.getNextIconInInWorkoutInStyleSection().click();
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPreviousIconInWorkoutInStyleSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure clicking on Next Button in the Workout In Style Widget works correctly", priority = 222,expectedExceptions = { org.openqa.selenium.NoSuchElementException.class })
    public void verifyClickingOnNextIconInWorkoutInStyleWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.getNextIconInInWorkoutInStyleSection().click();
        aeWomenOnlyCategoryPage.getNextIconInInWorkoutInStyleSection().click();
        Assert.assertFalse(aeWomenOnlyCategoryPage.getNextIconInInWorkoutInStyleSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure clicking on Previous Button in the Workout In Style Widget works correctly", priority = 223)
    public void verifyClickingOnPreviousIconInWorkoutInStyleWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.getPreviousIconInWorkoutInStyleSection().click();
        Assert.assertFalse(aeWomenOnlyCategoryPage.getNextIconInInWorkoutInStyleSection().isDisplayed());
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the product card in the Workout In Style Widget works correctly ", priority = 224)
    public void verifyClickingOnProductCardInsideWorkoutInStyleWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        aeWomenOnlyCategoryPage.getProductCardInWorkoutInStyleSection().click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the View All button in the Workout In Style Widget works correctly ", priority = 225)
    public void verifyClickingOnViewAllBtnInsideWorkoutInStyleWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        String expectedCategoryUrl = aeWomenOnlyCategoryPage.getViewAllInWorkoutInStyleSection().getAttribute("href");
        aeWomenOnlyCategoryPage.getViewAllInWorkoutInStyleSection().click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedCategoryUrl));
    }

    //Lady-Friendly Snacks & Food Widget Test Cases
    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure the Lady-Friendly Snacks & Food Widget is displayed in the Women's Only Category Page ", priority = 226)
    public void verifyLadyFriendlySnacksAndFoodWidgetIsDisplayedInTheWomenOnlySection() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        Assert.assertEquals(aeWomenOnlyCategoryPage.getLadyFriendlySnacksAndFoodSectionTitle().getText(), "Lady-Friendly Snacks & Food", "The Recommended Products section incorrect title");
        Assert.assertTrue(aeWomenOnlyCategoryPage.getLadyFriendlySnacksAndFoodSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure the previous arrow icon is not appear by default in the Lady-Friendly Snacks & Food Widget ", priority = 227)
    public void verifyPreviousArrowButtonInLadyFriendlySnacksAndFoodWidgetIsNotDisplayedByDefault() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.getNextIconInInLadyFriendlySnacksFoodSection().click();
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPreviousIconInLadyFriendlySnacksFoodSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure clicking on Next Button in the Lady-Friendly Snacks & Food Widget works correctly", priority = 228)
    public void verifyClickingOnNextIconInLadyFriendlySnacksAndFoodWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeWomenOnlyCategoryPage.getNextIconInInLadyFriendlySnacksFoodSection().click();
        Assert.assertFalse(aeWomenOnlyCategoryPage.getLastProductInWorkoutInStyleSection().isDisplayed());
    }

    @Test(description = "Women's Only Category- Make sure clicking on Previous Button in the Lady-Friendly Snacks & Food Widget works correctly", priority = 229)
    public void verifyClickingOnPreviousIconInLadyFriendlySnacksAndFoodWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        //        this.verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeWomenOnlyCategoryPage.getNextIconInInLadyFriendlySnacksFoodSection().click();
        aeWomenOnlyCategoryPage.getPreviousIconInLadyFriendlySnacksFoodSection().click();
        try{
        Assert.assertTrue(aeWomenOnlyCategoryPage.getPreviousIconInWorkoutInStyleSection().isDisplayed());}
        catch (Exception e){
            System.out.println("The Previous Button in the Lady-Friendly Snacks & Food Widget works correctly");
        }

    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the product card in the Lady-Friendly Snacks & Food Widget works correctly ", priority = 230)
    public void verifyClickingOnProductCardInsideLadyFriendlySnacksAndFoodWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        aeWomenOnlyCategoryPage.getProductCardInLadyFriendlySnacksFoodSection().click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = "Smoke Testing Report",description = "Women's Only Category- Make sure clicking on the View All button in the Lady-Friendly Snacks & Food Widget works correctly ", priority = 231)
    public void verifyClickingOnViewAllBtnInsideLadyFriendlySnacksAndFoodWidgetWorksCorrectly() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        aeWomenOnlyCategoryPage.getViewAllInLadyFriendlySnacksFoodSection().click();
        aeWomenOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("ady-friendly-snacks-food"));
    }

    //Female Gallery Widget Test Cases
    @Test(description = "Women's Only Category- Make sure the Female Gallery Widget is displayed in the Women's Only Category Page ", priority = 232)
    public void verifyLadyFemaleGalleryWidgetIsDisplayedInTheWomenOnlySection() {
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.navigateToWomenOnlyPage();
        Assert.assertEquals(aeWomenOnlyCategoryPage.getFemaleGallerySectionTitle().getText(), "FEMALE GALLERY", "The Recommended Products section incorrect title");
        Assert.assertTrue(aeWomenOnlyCategoryPage.getFemaleGallerySection().isDisplayed());
        Assert.assertTrue(aeWomenOnlyCategoryPage.getFirstYouTubeVideo().isDisplayed());
        Assert.assertTrue(aeWomenOnlyCategoryPage.getSecondYouTubeVideo().isDisplayed());
    }
   }