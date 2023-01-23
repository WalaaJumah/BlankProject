/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptHomePageTestCases
 */

package sporter_test.homepage_test_cases;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import lombok.ToString;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.homepage_classes.QatarHomePage;
@Test(groups = "Egypt HomePage")
public class EgyptHomePageTestCases extends HomePageTestCases {

    @BeforeClass
    public void switchToEgyptStore(){
        EgyptHomePage egyptHomePage=new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if(webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)){
            System.out.println("You are in Jordan Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+egyptHomePage.egyptDomain);
            CloseInitialDialog();          }
    }
    @Test(enabled = false)
    public void verifyHomePageUnderShopByCategoryBannersAreDisplayed() {}
    @Test(enabled = false)
    public void verifyTopSellingStacksSectionAreDisplayed() {}
    @Test(enabled = false)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {}
    @Test(enabled = false)
    public void verifyTopSellersSectionAreDisplayed() { }
    @Test(enabled = false)
    public void verifyAllLinksInTopSellersSectionAreDisplayed() {}
    @Test(enabled = false)
    public void verifyAbilityToClickOnAllCategoriesTabInTopSellersSection(){}
    @Test(enabled = false)
    public void verifyNextBtnInTopSellerSectionWorks() { }
    @Test(enabled = false)
    public void verifyPreviousBtnWillAppearInTopSellersSectionOnceClickingOnNextBtn() {}
    @Test(enabled = false)
    public void verifyTrendingOnSporterSectionAreDisplayed() { }
    @Test(enabled = false)
    public void verifyNewArrivalsSectionAreDisplayed() { }
    @Test(enabled = false)
    public void verifyAbilityToClickOnAllCategoriesTabInNewArrivalsSection(){ }
    @Test(enabled = false)
    public void verifyPreviousAndNextBtnInNewArrivalsSectionWorksCorrectly() {}
    @Test(enabled = false)
    public void verifyGotQuestionSectionIsDisplayed() {}
    @Test(enabled = false)
    public void verifyAbilityToClickOnEmailBtnInGotQuestionSectionCorrectly() { }
    @Test(enabled = false)
    public void verifyClickingOnSportswearAndAccessoriesCategoryRedirectTheUserToCorrectPage() { }
    @Test(enabled = false)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() { }
    @Test(enabled = false)
    public void verifyClickOnTheProductsAppearingInTheTopSellersSectionRedirectTheUserToCorrectUrl() {}
    @Test(enabled = false)
    public void verifyClickOnTheProductsAppearingInTheNewArrivalsSectionRedirectTheUserToCorrectUrl() {}
    @Test(enabled = false)
    public void verifyClickOnTheCategoriesAppearingInTheTrendingOnSporterSectionRedirectTheUserToCorrectUrl() {}
    @Test(enabled = false)
    public void verifyAbilityToClickOnPhoneBtnInGotQuestionSectionCorrectly() {}
}