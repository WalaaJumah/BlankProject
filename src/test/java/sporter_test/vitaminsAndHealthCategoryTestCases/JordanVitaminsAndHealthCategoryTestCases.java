/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.vitaminsAndHealthCategoryTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.vitamins_and_health_category_pages.JordanVitaminsAndHealthCategoryPage;
import sporter_pages.vitamins_and_health_category_pages.VitaminsAndHealthCategoryPage;

import java.io.IOException;

public class JordanVitaminsAndHealthCategoryTestCases extends VitaminsAndHealthCategoryTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToJordanStore() {
        JordanHomePage jordanHomePage = new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if (webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + jordanHomePage.jordanDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
        storeCountry = "Jordan";
        countryCode = "962";
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Melatonin section have at least a product", priority = 46)
    public void verifyTheMelatoninAtLeastAProduct() throws IOException {
        JordanVitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new JordanVitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
        DataHelperAndWait.waitForTime(3000);
        WebElementsAssertion.validateTheElementIsDisplayed(vitaminsAndHealthCategoryPage.getMelatoninSection(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Vitamins & Health Category- Make sure the Collagen section have at least a product", priority = 47)
    public void verifyTheCollagenAtLeastAProduct() throws IOException {
        JordanVitaminsAndHealthCategoryPage vitaminsAndHealthCategoryPage = new JordanVitaminsAndHealthCategoryPage(webDriver);
        vitaminsAndHealthCategoryPage.navigateToVitaminsAndHealthPage();
//        DataHelperAndWait.waitForTime(3000);
        WebElementsAssertion.validateTheElementIsDisplayed(vitaminsAndHealthCategoryPage.getCollagenSection(), webDriver);
    }
}
