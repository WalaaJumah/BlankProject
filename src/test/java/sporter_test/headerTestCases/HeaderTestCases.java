/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription HeaderTestCases
 */

package sporter_test.headerTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import xml_reader.XmlReader;

import java.io.IOException;
import java.util.ArrayList;

//TODO: Add Country to the test case description
@Test(groups = "2.11 Header Section")
public class HeaderTestCases extends BaseTest {
    String storeCountry;

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Ability to access all stores using Country List appearing in the Header", priority = 1)
    public void verifyCountryListAppearsCorrectly()  {
        HeaderSection headerSection = new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getCountryMenuIcon(), webDriver);
    }

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure switching language button works correctly", priority = 2)
    public void verifySwitchLanguageWorksCorrectly() {
        HeaderSection headerSection = new HeaderSection(webDriver);
        if (webDriver.getCurrentUrl().contains("com/ar-")) {
            DataHelperAndWait.clickOnElement(headerSection.getLanguageBtn(), webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("com/en-", webDriver);
            headerSection.waitTillLoaderComplete();
            WebElementsAssertion.assertionTextIsEqual(headerSection.getLanguageSelector(), webDriver, "عربي");
        } else {
            DataHelperAndWait.clickOnElement(headerSection.getLanguageBtn(), webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("com/ar-", webDriver);
            headerSection.waitTillLoaderComplete();
            WebElementsAssertion.assertionTextIsEqual(headerSection.getLanguageSelector(), webDriver, "English");
        }
    }

    @Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the Customer Service label & Phone Number appearing correctly", priority = 3)
    public void verifyCustomerServiceAppearingCorrectly() {
        HeaderSection headerSection = new HeaderSection(webDriver);
        if (webDriver.getCurrentUrl().contains("com/ar-"))
            WebElementsAssertion.assertionTextIsEqual(headerSection.getCustomerServiceLabel(), webDriver, XmlReader.getXMLData("CustomerServiceArLabel"));
        else
            WebElementsAssertion.assertionTextIsEqual(headerSection.getCustomerServiceLabel(), webDriver, XmlReader.getXMLData("CustomerServiceEnLabel"));
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Search section appears correctly", priority = 7)
    public void verifySearchSectionCorrectly() throws IOException {
        HeaderSection headerSection = new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getSearchSectionForm(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Cart icon appears correctly", priority = 4)
    public void verifyCartIconAppearsCorrectly() throws IOException {
        HeaderSection headerSection = new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getCartIcon(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the My Account icon appears correctly", priority = 5)
    public void verifyProfileIconAppearsCorrectly() throws IOException {
        HeaderSection headerSection = new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getAccountProfileIcon(), webDriver);
    }
    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}: Make sure the Sporter Logo appears correctly", priority = 6)
    public void verifySporterLogoAppearsCorrectly() throws IOException {
        HeaderSection headerSection = new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getSporterLogo(), webDriver);
    }

}