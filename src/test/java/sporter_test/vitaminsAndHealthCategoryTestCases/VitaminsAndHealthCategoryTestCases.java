/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.vitaminsAndHealthCategoryTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.footerSections.FooterSection;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.megaMenuPages.MegaMenuPage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_pages.sportsSupplementsCategoryPages.SportsSupplementsCategoryPage;
import sporter_pages.vitamins_and_health_category_pages.VitaminsAndHealthCategoryPage;
import sporter_pages.womens_only_category_pages.WomensOnlyCategoryPage;

import java.io.IOException;

@Test(groups = "2.16 Vitamins & Health Category")

public class VitaminsAndHealthCategoryTestCases extends BaseTest {
    String storeCountry;
    String countryCode;

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Vitamins & Health Category Appears In MegaMenu Redirect User To CorrectURL", priority = 1)
    public void verifyClickingOnVitaminsAndHealthCategoryAppearsInMegaMenuRedirectUserToCorrectURL() throws IOException {
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        megaMenuPage.clickOnVitaminsAndHealthMainMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            megaMenuPage.waitTillLoaderComplete();
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl, webDriver);
        }

        catch (Exception e){
            megaMenuPage.waitTillLoaderComplete();
        WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl+"/", webDriver);}
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Vitamins & Health Category from ShopBy Menu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnVitaminsAndHealthCategoryFromShopByMenuRedirectUserToCorrectURL() throws IOException {
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        megaMenuPage.clickOnVitaminsAndHealthFromShopByMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try{
            megaMenuPage.waitTillLoaderComplete();
        WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl, webDriver);
        }

        catch (Exception e){
            megaMenuPage.waitTillLoaderComplete();
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.healthVitaminsUrl+"/", webDriver);}

    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure that the BreadCrumb appears correctly after sorting the product ", priority = 3)
    public void verifyTheBreadCrumbAppearingCorrectlyAfterSortingTheProducts() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        HomePage homePage = new HomePage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.waitToBeClickable(sportsSupplementsCategoryPage.getHomePageBreadCrumb(), webDriver);
        DataHelperAndWait.JsExecutorToClickOnElement(sportsSupplementsCategoryPage.getHomePageBreadCrumb(), webDriver);
        homePage.waitTillLoaderComplete();
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportsSupplementsCategory(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 4)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() throws IOException {
        HeaderSection headerSection = new HeaderSection(webDriver);
        HomePage homePage = new HomePage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure  the Vitamins & Health footer appears correctly  ", priority = 5)
    public void verifyVitaminsAndHealthFooterSectionAppearsCorrectly() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
//        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getMainFooter(), webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 6)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInVitaminsAndHealthCategoryPage() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
//        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        for (int i = 0; i < footerSection.getPageBottomBlocksList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getPageBottomBlocksList().get(i), webDriver);
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the pagination control appears on the Vitamins & Health rotating slider is displayed", priority = 7)
    public void verifyPaginationControlOnVitaminsAndHealthRotatingSliderIsDisplayed() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
//        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        for (int i = 0; i < womensOnlyCategoryPage.getRotatingSliderPagingControlList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getRotatingSliderPagingControlList().get(i), webDriver);
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the banners inside the rotating slider section works correctly", priority = 8)
    public void verifyClickingOnTheBannersInsideTheVitaminsAndHealthRotatingRotatingSliderWillRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        for (int i = 0; i < womensOnlyCategoryPage.getRotatingSliderPagingControlList().size(); i++) {
            DataHelperAndWait.scrollToPositionZero(webDriver);
            DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getRotatingSliderPagingControlList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getBannerInRotatingSliderSection(), webDriver);
            womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
            vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Vitamins & Health side Banners is displayed ", priority = 9)
    public void verifyVitaminsAndHealthSideBannerIsDisplayed() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getFirstSideBanner(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getSecondSideBanner(), webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the first side banner works correctly", priority = 10)
    public void verifyClickingOnTheFirstSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getFirstSideBanner(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Second side banner works correctly", priority = 11)
    public void verifyClickingOnTheSecondSideBannersWorksCorrectlyInTheVitaminsAndHealthCategoryPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getSecondSideBanner(), webDriver);
        womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Fish Oil & Omegas Category redirect the user to the correct page", priority = 12)
    public void verifyClickingOnTheFishOilAndOmegasCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getFishOilAndOmegasCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the MultiVitamins Category redirect the user to the correct page", priority = 13)
    public void verifyClickingOnTheMultiVitaminsCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getMultiVitaminsCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Vitamins A_Z Category redirect the user to the correct page", priority = 14)
    public void verifyClickingOnTheVitaminsA_ZCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getVitaminsAZCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Minerals Category redirect the user to the correct page", priority = 15)
    public void verifyClickingOnTheMineralsCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getMineralsCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Antioxidant Category redirect the user to the correct page", priority = 16)
    public void verifyClickingOnTheAntioxidantCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getAntioxidantsCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Super Foods Category redirect the user to the correct page", priority = 17)
    public void verifyClickingOnTheSuperFoodCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getSuperFoodsCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Collagen Category redirect the user to the correct page", priority = 18)
    public void verifyClickingOnTheCollagenCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getCollagenCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Melatonin Category redirect the user to the correct page", priority = 19)
    public void verifyClickingOnTheMelatoninCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getMelatoninCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Tumeric Category redirect the user to the correct page", priority = 20)
    public void verifyClickingOnTheTumericCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getTumericCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Dandelion Category redirect the user to the correct page", priority = 21)
    public void verifyClickingOnTheDandelionCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getDandelionCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Ginseng Category redirect the user to the correct page", priority = 22)
    public void verifyClickingOnTheGinsengCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getGinsengCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Milk Thistle Category redirect the user to the correct page", priority = 23)
    public void verifyClickingOnTheMilkThistleCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getMilkThistleCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the AlFalfa Category redirect the user to the correct page", priority = 24)
    public void verifyClickingOnTheAlFalfaCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getAlfalfaCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Beauty Category redirect the user to the correct page", priority = 25)
    public void verifyClickingOnTheBeautyCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
     DataHelperAndWait.waitToBeVisible(vitaminsAndHealthCategoryPage.getBeautyCategory(),webDriver);
            DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getBeautyCategory(), webDriver);
            vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Bone & Joint Category redirect the user to the correct page", priority = 26)
    public void verifyClickingOnTheBoneAndJointCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.waitToBeVisible(vitaminsAndHealthCategoryPage.getBoneAndJointCategory(),webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getBoneAndJointCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Brain Support Category redirect the user to the correct page", priority = 27)
    public void verifyClickingOnTheBrainSupportCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.waitToBeVisible(vitaminsAndHealthCategoryPage.getBrainSupportCategory(),webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getBrainSupportCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Detox And Liver Support Category redirect the user to the correct page", priority = 28)
    public void verifyClickingOnTheDetoxAndLiverSupportCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.waitToBeVisible(vitaminsAndHealthCategoryPage.getDetoxAndLiverSupportCategory(),webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getDetoxAndLiverSupportCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Digestive Support Category redirect the user to the correct page", priority = 29)
    public void verifyClickingOnTheDigestiveSupportCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.scrollToPositionZero(webDriver);
        DataHelperAndWait.waitToBeVisible(vitaminsAndHealthCategoryPage.getDigestiveSupportCategory(),webDriver);
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getDigestiveSupportCategory(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Energy Formulas Category redirect the user to the correct page", priority = 30)
    public void verifyClickingOnTheEnergyFormulasCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        vitaminsAndHealthCategoryPage.clickOnEnergyFormulasCategoryCategory();
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Hair And Skin And Nails Category redirect the user to the correct page", priority = 31)
    public void verifyClickingOnTheHairAndSkinAndNailsCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        vitaminsAndHealthCategoryPage.clickOnHairAndSkinAndNailsCategory();
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Heart Health Category redirect the user to the correct page", priority = 32)
    public void verifyClickingOnTheHeartHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        vitaminsAndHealthCategoryPage.clickOnHeartHealthCategory();
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Immunity Support Category redirect the user to the correct page", priority = 33)
    public void verifyClickingOnTheImmunitySupportCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        vitaminsAndHealthCategoryPage.clickOnImmunitySupportCategoryCategory();
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Kids Health Category redirect the user to the correct page", priority = 34)
    public void verifyClickingOnTheKidsHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        vitaminsAndHealthCategoryPage.clickOnKidsHealthCategoryCategory();
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Mens Health Category redirect the user to the correct page", priority = 35)
    public void verifyClickingOnTheMensHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        vitaminsAndHealthCategoryPage.clickOnMensHealthCategory();
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Sexual Health Category redirect the user to the correct page", priority = 36)
    public void verifyClickingOnTheSexualHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        vitaminsAndHealthCategoryPage.clickOnSexualHealthCategory();
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Sleep Support Category redirect the user to the correct page", priority = 37)
    public void verifyClickingOnTheSleepSupportCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        vitaminsAndHealthCategoryPage.clickOnSleepSupportCategory();
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Diet Weight Management Category redirect the user to the correct page", priority = 38)
    public void verifyClickingOnTheDietWeightManagementCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        vitaminsAndHealthCategoryPage.clickOnDietWeightManagementCategoryCategory();
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Women Health Category redirect the user to the correct page", priority = 39)
    public void verifyClickingOnTheDietWomenHealthCategoryRedirectTheUserToCorrectPage() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        vitaminsAndHealthCategoryPage.clickOnWomenHealthCategoryCategoryCategory();
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Fish Oil & Omegas section have at least a product", priority = 40)
    public void verifyTheFishOilAndOmegasHaveAtLeastAProduct() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.waitForTime(2000);
        WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getSupplementForHerSection(), webDriver);
    }

    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Multivitamins section have at least a product", priority = 41)
    public void verifyTheMultivitaminsHaveAtLeastAProduct() {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
//        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.waitForTime(2000);
        WebElementsAssertion.validateTheElementIsDisplayed(womensOnlyCategoryPage.getWomensVitaminsSection(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Vitamins A-Z section have at least a product", priority = 42)
    public void verifyTheVitaminsA_zAtLeastAProduct() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        DataHelperAndWait.waitForTime(3000);
        WebElementsAssertion.validateTheElementIsDisplayed(vitaminsAndHealthCategoryPage.getVitaminsAZSection(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Minerals section have at least a product", priority = 43)
    public void verifyTheMineralsAtLeastAProduct() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        WebElementsAssertion.validateTheElementIsDisplayed(vitaminsAndHealthCategoryPage.getMineralsSection(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Antioxidants section have at least a product", priority = 44)
    public void verifyTheAntioxodantsAtLeastAProduct() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        DataHelperAndWait.waitForTime(2000);
        WebElementsAssertion.validateTheElementIsDisplayed(vitaminsAndHealthCategoryPage.getAntioxodantsSection(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Super Foods section have at least a product", priority = 45)
    public void verifyTheSuperFoodsAtLeastAProduct() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        DataHelperAndWait.waitForTime(2000);
        WebElementsAssertion.validateTheElementIsDisplayed(vitaminsAndHealthCategoryPage.getSuperFoodsSection(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Melatonin section have at least a product", priority = 46)
    public void verifyTheMelatoninAtLeastAProduct() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        DataHelperAndWait.waitForTime(3000);
        WebElementsAssertion.validateTheElementIsDisplayed(vitaminsAndHealthCategoryPage.getMelatoninSection(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Collagen section have at least a product", priority = 47)
    public void verifyTheCollagenAtLeastAProduct() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        DataHelperAndWait.waitForTime(3000);
        WebElementsAssertion.validateTheElementIsDisplayed(vitaminsAndHealthCategoryPage.getCollagenSection(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking On View All Button from the Fish Oil & Omegas section works Correctly", priority = 48)
    public void verifyClickingOnViewAllBtnFromFishOilAndOmegasSectionWorksCorrectly() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getViewAllFishOil(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking On View All Button from the Multivitamins section works Correctly", priority = 49)
    public void verifyClickingOnViewAllBtnFromMultivitaminsSectionWorksCorrectly() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getViewAllMultivitamins(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking On View All Button from the VitaminsA_Z section works Correctly", priority = 50)
    public void verifyClickingOnViewAllBtnFromVitaminsA_ZSectionWorksCorrectly() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getViewAllVitaminsA_Z(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking On View All Button from the Minerals section works Correctly", priority = 51)
    public void verifyClickingOnViewAllBtnFromMineralsSectionWorksCorrectly() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getViewAllMinerals(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking On View All Button from the Antioxidants section works Correctly", priority = 52)
    public void verifyClickingOnViewAllBtnFromAntioxidantsSectionWorksCorrectly() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getViewAllAntioxidants(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking On View All Button from the Super Foods section works Correctly", priority = 53)
    public void verifyClickingOnViewAllBtnFromSuperFoodsSectionWorksCorrectly() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getViewAllSuperFoods(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking On View All Button from the Melatonin section works Correctly", priority = 54)
    public void verifyClickingOnViewAllBtnFromMelatoninSectionWorksCorrectly() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getViewAllMelatonin(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking On View All Button from the Collagen section works Correctly", priority = 55)
    public void verifyClickingOnViewAllBtnFromCollagenSectionWorksCorrectly() throws IOException {
        VitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new VitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.clickOnElement(vitaminsAndHealthCategoryPage.getViewAllCollagen(), webDriver);
        vitaminsAndHealthCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure clicking on the Vitamins & HealthCategory from HomePage Redirect User To CorrectURL", priority = 56)
    public void verifyClickingOnVitaminsAndHealthCategoryFromHomePageRedirectUserToCorrectURL() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(homePage.getVitaminsAndHealthCategory(), webDriver);
        try{
        WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.healthVitaminsUrl, webDriver);}
        catch (Exception e){
            WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.healthVitaminsUrl+"/", webDriver);}

    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the NewsLetter section appears correctly  ", priority = 57)
    public void verifyNewLetterSectionAppearsCorrectly() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
//        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getNewsLetterSection(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Verify that the search button works correctly from the Vitamins & Health category page", priority = 58)
    public void verifySearchBtnWorksCorrectlyFromSportSupplementsCategoryPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
//        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.typeTextInElement(productDetailsPage.getSearchField(),webDriver,"whey");
        DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(), webDriver);
        DataHelperAndWait.waitForTime(1000);
        try{
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductCard(),webDriver);}
        catch (Exception e){
            DataHelperAndWait.waitToBeVisible(productDetailsPage.getProductCard(),webDriver);
        }
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();

    }
}
