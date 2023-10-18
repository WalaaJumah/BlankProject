/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.healthy_food_category_test_cases;

import core.BasePage;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.healthy_food_pages.EgyptHealthyFoodPage;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.sportsSupplementsCategoryPages.SportsSupplementsCategoryPage;

import java.io.IOException;

public class EgyptHealthyFoodTestCases extends HealthyFoodTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Egypt Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            //CloseInitialDialog();
        }
        storeCountry = "Egypt";
        countryCode = "20";
    }

    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure clicking on the Healthy Food Category Appears In MegaMenu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL() throws IOException {
        EgyptHealthyFoodPage egyptHealthyFoodPage = new EgyptHealthyFoodPage(webDriver);
        egyptHealthyFoodPage.clickOnHealthyFoodMainMenu();
        egyptHealthyFoodPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(egyptHealthyFoodPage.healthyFoodsUrl, webDriver);
    }
@Test(enabled = false)    public void verifyClickingOnHealthyFoodCategoryFromHomePageRedirectUserToCorrectURL() throws IOException {
    }
}
