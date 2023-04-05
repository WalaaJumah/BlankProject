/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.vitaminsAndHealthCategoryTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.megaMenuPages.EgyptMegaMenuPage;
import sporter_pages.megaMenuPages.MegaMenuPage;
import sporter_pages.sportsSupplementsCategoryPages.SportsSupplementsCategoryPage;
import sporter_pages.vitamins_and_health_category_pages.VitaminsAndHealthCategoryPage;

import java.io.IOException;

public class EgyptVitaminsAndHealthCategoryTestCases extends VitaminsAndHealthCategoryTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Egypt Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            CloseInitialDialog();
        }
        storeCountry = "Egypt";
        countryCode = "20";
    }
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Vitamins & Health Category Appears In MegaMenu Redirect User To CorrectURL", priority = 1)
    public void verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL() throws IOException {
        EgyptMegaMenuPage megaMenuPage = new EgyptMegaMenuPage(webDriver);
        megaMenuPage.clickOnVitaminsAndHealthMainMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl, webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Vitamins & Health Category from ShopBy Menu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnVitaminsAndHealthCategoryFromShopByMenuRedirectUserToCorrectURL() throws IOException {
        EgyptMegaMenuPage megaMenuPage = new EgyptMegaMenuPage(webDriver);
        megaMenuPage.clickOnVitaminsAndHealthFromShopByMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl, webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category Page- Make sure that the Result label and its value appear correctly ", priority = 59)
    public void verifyResultFieldAndItsVaLueAppearInTheVitaminsAndHealthCategoryPage() {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getResultLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getSearchResultValue(), webDriver);
        Assert.assertNotEquals(sportsSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero " + " The URL is: " + webDriver.getCurrentUrl());
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Vitamins & Health Category Category Page- Make sure that Sort By menu appears correctly ", priority = 60)
    public void verifySortByMenuAndItsOptionsAppearCorrectly() {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getSortByMenu(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category Category Page- Make Sure the next page button works correctly", priority = 61)
    public void verifyNextPageBtnWorksCorrectly() {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        if (sportsSupplementsCategoryPage.getPaginationBtns().size() > 3) {
            DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getNextPageBtn(), webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("p=2", webDriver);
        } else {
            System.out.println("There's only one page in the list");
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category Category Page- Make Sure the previous page button works correctly", priority = 62)
    public void verifyPreviousPageBtnWorksCorrectly() {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        if (sportsSupplementsCategoryPage.getPaginationBtns().size() > 3) {
            DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getNextPageBtn(), webDriver);
            DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getPreviousPageBtn(), webDriver);
            DataHelperAndWait.waitForTime(2000);
            Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
        } else {
            System.out.println("There's only one page in the list");
        }
    }
    @Test(groups = "All Smoke Testing Result", description = "{{CountryName}}:Vitamins & Health Category Category Page- Make Sure the ability to access all pages inside Sport Supplements Category Page  ", priority = 63)
    public void verifyAbilityToAccessAllPagesInsideVitaminsAndHealthCategoryPage() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.waitToBeVisible(sportsSupplementsCategoryPage.getSearchResultValue(), webDriver);
        String numberOfProductInTheList = sportsSupplementsCategoryPage.getSearchResultValue().getText();
        if (sportsSupplementsCategoryPage.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else {
            sportsSupplementsCategoryPage.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList, sportsSupplementsCategoryPage.getNextPageBtn(), webDriver);
        }

    }

    @Test(enabled = false)
    public void verifyPaginationControlOnVitaminsAndHealthRotatingSliderIsDisplayed() {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheBannersInsideTheVitaminsAndHealthRotatingRotatingSliderWillRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyVitaminsAndHealthSideBannerIsDisplayed() {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheFishOilAndOmegasCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheMultiVitaminsCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheVitaminsA_ZCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheMineralsCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheAntioxidantCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheSuperFoodCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheCollagenCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheMelatoninCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheTumericCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheDandelionCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheGinsengCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheMilkThistleCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheAlFalfaCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheBeautyCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheBoneAndJointCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheBrainSupportCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheDetoxAndLiverSupportCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheDigestiveSupportCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheEnergyFormulasCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheHairAndSkinAndNailsCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheHeartHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheImmunitySupportCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheKidsHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheMensHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheSexualHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheSleepSupportCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheDietWeightManagementCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnTheDietWomenHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
    }

    @Test(enabled = false)
    public void verifyTheFishOilAndOmegasHaveAtLeastAProduct() {
    }

    @Test(enabled = false)
    public void verifyTheMultivitaminsHaveAtLeastAProduct() {
    }

    @Test(enabled = false)
    public void verifyTheVitaminsA_zAtLeastAProduct() {
    }

    @Test(enabled = false)
    public void verifyTheMineralsAtLeastAProduct() {
    }

    @Test(enabled = false)
    public void verifyTheAntioxodantsAtLeastAProduct() {
    }

    @Test(enabled = false)
    public void verifyTheSuperFoodsAtLeastAProduct() {
    }

    @Test(enabled = false)
    public void verifyTheMelatoninAtLeastAProduct() {
    }

    @Test(enabled = false)
    public void verifyTheCollagenAtLeastAProduct() {
    }

    @Test(enabled = false)
    public void verifyClickingOnViewAllBtnFromFishOilAndOmegasSectionWorksCorrectly() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnViewAllBtnFromMultivitaminsSectionWorksCorrectly() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnViewAllBtnFromVitaminsA_ZSectionWorksCorrectly() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnViewAllBtnFromMineralsSectionWorksCorrectly() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnViewAllBtnFromAntioxidantsSectionWorksCorrectly() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnViewAllBtnFromSuperFoodsSectionWorksCorrectly() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnViewAllBtnFromMelatoninSectionWorksCorrectly() throws IOException {
    }

    @Test(enabled = false)
    public void verifyClickingOnViewAllBtnFromCollagenSectionWorksCorrectly() throws IOException {
    }
}
