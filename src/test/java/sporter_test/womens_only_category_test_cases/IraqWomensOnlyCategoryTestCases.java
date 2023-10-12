/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.womens_only_category_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.IraqHomePage;
import sporter_pages.womens_only_category_pages.WomensOnlyCategoryPage;

import java.io.IOException;

@Getter
public class IraqWomensOnlyCategoryTestCases extends WomensOnlyCategoryTestCases{

    @BeforeClass(alwaysRun = true)
    public void switchToIraqStore() {
        IraqHomePage iraqHomePage = new IraqHomePage(webDriver);
        iraqHomePage.switchCountry(iraqHomePage.getIraqCountry());
        if (!webDriver.getCurrentUrl().contains(iraqHomePage.iraqDomain)) {
            webDriver.navigate().to(BasePage.BaseURL + iraqHomePage.iraqDomain);
        }
    }
    @Test(enabled = false,groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:Women's Only Category- Make sure clicking on the banners inside the rotating slider section works correctly", priority = 8)
    public void verifyClickingOnTheBannersInsideTheWomenOnlyRotatingRotatingSliderWillRedirectTheUserToCorrectPage() throws IOException {
        WomensOnlyCategoryPage womensOnlyCategoryPage = new WomensOnlyCategoryPage(webDriver);
//        womensOnlyCategoryPage.navigateToWomenOnlyPage();
        for (int i = 0; i < womensOnlyCategoryPage.getRotatingSliderPagingControlList().size(); i++) {
            DataHelperAndWait.scrollToPositionZero(webDriver);
            DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getRotatingSliderPagingControlList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(womensOnlyCategoryPage.getBannerInRotatingSliderSection(), webDriver);
            womensOnlyCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
            womensOnlyCategoryPage.navigateToWomenOnlyPage();
        }
    }
}
