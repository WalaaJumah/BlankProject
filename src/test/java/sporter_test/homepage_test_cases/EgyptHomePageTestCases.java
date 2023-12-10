/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptHomePageTestCases
 */

package sporter_test.homepage_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.homepage_classes.HomePage;
import xml_reader.XmlReader;

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
            //CloseInitialDialog();
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the main options in the Mega Menu are retrieved correctly", priority = 7)
    public void verifyMainOptionsInTheMegaMenuAreDisplayed() {
        HomePage homePage = new HomePage(webDriver);
        if(webDriver.getCurrentUrl().contains(".com/en-")) {
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getShopByOption(), webDriver, XmlReader.getXMLData("ShopByEn"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getSportSupplementsOption(), webDriver, XmlReader.getXMLData("SportsSupplementsEn"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getVitaminsAndHealthOption(), webDriver, XmlReader.getXMLData("VitaminsAndHealthEn"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getHealthyFoodOption(), webDriver, XmlReader.getXMLData("HealthyFoodEn"));
//            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getSportsOption(), webDriver, XmlReader.getXMLData("SPORTSEn"));
//            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getWomenOnlyOption(), webDriver, XmlReader.getXMLData("WomenOnlyEn"));
        }
        else{
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getShopByOption(), webDriver, XmlReader.getXMLData("ShopByAr"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getSportSupplementsOption(), webDriver, XmlReader.getXMLData("SportsSupplementsAr"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getVitaminsAndHealthOption(), webDriver, XmlReader.getXMLData("VitaminsAndHealthAr"));
            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getHealthyFoodOption(), webDriver, XmlReader.getXMLData("HealthyFoodAr"));
//            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getSportsOption(), webDriver, XmlReader.getXMLData("SPORTSAr"));
//            WebElementsAssertion.assertionTextEqualsForElementAttribute(homePage.getWomenOnlyOption(), webDriver, XmlReader.getXMLData("WomenOnlyAr"));
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