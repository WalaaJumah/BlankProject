/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptHomePageTestCases
 */

package sporter_test.homepage_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;

//@Test(groups = "2.05 Egypt HomePage")
public class EgyptHomePageTestCases extends HomePageTestCases {

    @BeforeClass(alwaysRun = true)
//    @Test
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        DataHelperAndWait.scrollToPositionZero(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        DataHelperAndWait.scrollToPositionZero(webDriver);
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            CloseInitialDialog();
        }
    }

    @Test(enabled = false)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed() {
    }

    @Test(enabled = false)
    public void verifyTopSellingStacksSectionAreDisplayed() {
    }

    @Test(enabled = false)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {
    }

    @Test(enabled = false)
    public void verifyTrendingOnSporterSectionAreDisplayed() {
    }
    @Test(enabled = false)
    public void verifyGotQuestionSectionIsDisplayed() {
    }

    @Test(enabled = false)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() {
    }

    @Test(enabled = false)
    public void verifyClickingOnSportswearAndAccessoriesCategoryRedirectTheUserToCorrectPage() {
    }

    @Test(enabled = false)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {
    }
    @Test(enabled = false)
    public void verifyPreviousAndNextBtnInNewArrivalsSectionWorksCorrectly() {
    }
        @Test(enabled = false)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {
    }
        @Test(enabled = false)
    public void verifyNextBtnInTopSellerSectionWorks(){}

    @Test(enabled = false)
    public void verifyClickOnTheCategoriesAppearingInTheTrendingOnSporterSectionRedirectTheUserToCorrectUrl() {
    }

    @Test(enabled = false)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {
    }
}