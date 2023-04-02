/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.vitaminsAndHealthCategoryTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;

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
