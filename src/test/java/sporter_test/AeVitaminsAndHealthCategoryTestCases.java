package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AeProductDetailsPage;
import sporter_pages.AeSportSupplementsCategoryPage;
import sporter_pages.AeVitaminsAndHealthCategoryPage;
import sporter_pages.KsaHomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class AeVitaminsAndHealthCategoryTestCases extends BaseTest {
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    private AEMegaMenuTestCases aeMegaMenuTestCases;
    private AeProductDetailsPage aeProductDetailsPage;
    private AEFooterPageTestCases aeFooterPageTestCases;
    private KsaHomePage ksaHomePage;
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
    @Test(description = "Make sure the clicking on the second side banner works correctly in Vitamins And Health Category Page", priority = 12)
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
}
