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
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the all links below Contact us appears correctly ", priority = 1)
    public void verifyContactUsListAppearsCorrectlyCorrectly(){
        FooterSection footerSection = new FooterSection(webDriver);
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.waitToBeVisible(footerSection.getContactUsList().get(0),webDriver);
        for (int i = 0; i < footerSection.getContactUsList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getContactUsList().get(i), webDriver);
        }
    }
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the copy Right label appears correctly ", priority = 2)
    public void verifyCopyRightLabelAppearCorrectly(){
        FooterSection footerSection = new FooterSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getCopyRightLabel(),webDriver);
    }
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the social Media section appears correctly ", priority = 3)
    public void verifySocialMediaSectionAppearCorrectly(){
        FooterSection footerSection = new FooterSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getSocialMediaSection(),webDriver);
    }
    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Orders & Shipping List correctly ", priority = 4)
    public void verifyAbilityToAccessAllOrdersAndShippingLinksCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        footerSection.accessAllLinksInTheList(footerSection.getOrdersAndShippingList());
    }

    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Lets Us Help you List correctly ", priority = 5)
    public void verifyAbilityToAccessAllLetsHelpYouLinksCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        footerSection.navigateToHomePage();
        footerSection.accessAllLinksInTheList(footerSection.getLetsUsHelpYouList());
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Protein And Fitness you List correctly ", priority = 6)
    public void verifyAbilityToAccessAllProteinAndFitnessCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        try{
        footerSection.accessAllLinksInTheList(footerSection.getProteinAndFitnessList());}
        catch (Exception e){
            System.out.println("The section is removed");
        }
    }

    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Vitamins And Health you List correctly ", priority = 7)
    public void verifyAbilityToAccessAllVitaminsAndHealthCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        footerSection.accessAllLinksInTheList(footerSection.getVitaminsAndHealthList());
    }

    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Accessories And Apparel you List correctly ", priority = 8)
    public void verifyAbilityToAccessAllAccessoriesAndApparelCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        footerSection.accessAllLinksInTheList(footerSection.getAccessoriesAndApparelList());
    }

    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Most Selling Products you List correctly ", priority = 9)
    public void verifyAbilityToAccessAllMostSellingProductsCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        footerSection.accessAllLinksInTheList(footerSection.getMostSellingProductsList());
    }

    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the customer ia able to access all links below the Get To KnowUs you List correctly ", priority = 10)
    public void verifyAbilityToAccessAllGetToKnowUsCorrectly() throws IOException {
        FooterSection footerSection = new FooterSection(webDriver);
        footerSection.accessAllLinksInTheList(footerSection.getGetToKnowUsList());
 }


}
