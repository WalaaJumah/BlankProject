/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.womens_only_category_test_cases;

import core.BasePage;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.megaMenuPages.MegaMenuPage;

import java.io.IOException;
//TODO: We can access the category using the URL noting that the main menu is missing

public class EgyptWomensOnlyCategoryTestCases extends WomensOnlyCategoryTestCases {
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
    @Test(enabled = false)
    public void verifyClickingOnWomenOnlyCategoryAppearsInMegaMenuRedirectUserToCorrectURL() throws IOException {
        MegaMenuPage megaMenuPage= new MegaMenuPage(webDriver);
        megaMenuPage.clickOnWomensOnlyMainMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.womenOnlyUrl, webDriver);
    }

@Test(enabled = false)
public void verifyClickingOnWomenOnlyCategoryFromShopByMenuRedirectUserToCorrectURL() throws IOException {
        MegaMenuPage megaMenuPage= new MegaMenuPage(webDriver);
        megaMenuPage.clickOnWomensOnlyFromShopByMenu();
        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.womenOnlyUrl, webDriver);
    }
}
