/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.footer_test_cases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.Test;
import sporter_pages.footerSections.FooterSection;

import java.io.IOException;

@Test(groups = "2.18 Footer Section")

public class FooterTestCases extends BaseTest {
    String storeCountry;

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Orders & Shipping List correctly ", priority = 1)
    public void verifyAbilityToAccessAllOrdersAndShippingLinksCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        for (int i = 0; i < footerSection.getOrdersAndShippingList().size(); i++) {
            DataHelperAndWait.waitToBeVisible(footerSection.getOrdersAndShippingList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(footerSection.getOrdersAndShippingList().get(i), webDriver);
            footerSection.verifyTheDisplayedPageDoesNotHaveErrors();
            footerSection.navigateToHomePage();
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Lets Us Help you List correctly ", priority = 2)
    public void verifyAbilityToAccessAllLetsHelpYouLinksCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        for (int i = 0; i < footerSection.getOrdersAndShippingList().size(); i++) {
            footerSection.navigateToHomePage();
            DataHelperAndWait.waitToBeVisible(footerSection.getLetsUsHelpYouList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(footerSection.getLetsUsHelpYouList().get(i), webDriver);
            footerSection.verifyTheDisplayedPageDoesNotHaveErrors();
            footerSection.navigateToHomePage();
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Protein And Fitness you List correctly ", priority = 3)
    public void verifyAbilityToAccessAllProteinAndFitnessCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        for (int i = 0; i < footerSection.getOrdersAndShippingList().size(); i++) {
            DataHelperAndWait.waitToBeVisible(footerSection.getProteinAndFitnessList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(footerSection.getProteinAndFitnessList().get(i), webDriver);
            footerSection.verifyTheDisplayedPageDoesNotHaveErrors();
            footerSection.navigateToHomePage();
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Vitamins And Health you List correctly ", priority = 4)
    public void verifyAbilityToAccessAllVitaminsAndHealthCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        for (int i = 0; i < footerSection.getOrdersAndShippingList().size(); i++) {
            DataHelperAndWait.waitToBeVisible(footerSection.getVitaminsAndHealthList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(footerSection.getVitaminsAndHealthList().get(i), webDriver);
            footerSection.verifyTheDisplayedPageDoesNotHaveErrors();
            footerSection.navigateToHomePage();
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Accessories And Apparel you List correctly ", priority = 5)
    public void verifyAbilityToAccessAllAccessoriesAndApparelCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        for (int i = 0; i < footerSection.getOrdersAndShippingList().size(); i++) {
            DataHelperAndWait.waitToBeVisible(footerSection.getAccessoriesAndApparelList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(footerSection.getAccessoriesAndApparelList().get(i), webDriver);
            footerSection.verifyTheDisplayedPageDoesNotHaveErrors();
            footerSection.navigateToHomePage();
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Most Selling Products you List correctly ", priority = 6)
    public void verifyAbilityToAccessAllMostSellingProductsCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        for (int i = 0; i < footerSection.getOrdersAndShippingList().size(); i++) {
            DataHelperAndWait.waitToBeVisible(footerSection.getMostSellingProductsList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(footerSection.getMostSellingProductsList().get(i), webDriver);
            footerSection.verifyTheDisplayedPageDoesNotHaveErrors();
            footerSection.navigateToHomePage();
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Get To KnowUs you List correctly ", priority = 7)
    public void verifyAbilityToAccessAllGetToKnowUsCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        for (int i = 0; i < footerSection.getOrdersAndShippingList().size(); i++) {
            DataHelperAndWait.waitToBeVisible(footerSection.getGetToKnowUsList().get(i), webDriver);
            DataHelperAndWait.clickOnElement(footerSection.getGetToKnowUsList().get(i), webDriver);
            footerSection.verifyTheDisplayedPageDoesNotHaveErrors();
            footerSection.navigateToHomePage();
        }
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the all links below Contact us appears correctly ", priority = 8)
    public void verifyContactUsListAppearsCorrectlyCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        for (int i = 1; i < footerSection.getOrdersAndShippingList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getContactUsList().get(i), webDriver);

        }
    }

}
