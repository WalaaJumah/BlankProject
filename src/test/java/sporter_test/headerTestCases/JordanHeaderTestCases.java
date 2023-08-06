/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanHeaderTestCases
 */

package sporter_test.headerTestCases;

import core.BasePage;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.JordanHomePage;
import xml_reader.XmlReader;

//@Test(groups = "2.09 Jordan Header Section")

public class JordanHeaderTestCases extends HeaderTestCases {
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
    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(Jordan Store/English Version): Ability to access all stores using Country List appearing in the Header", priority = 1)
//    public void accessAllCountries(){}
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(Jordan Store/English Version): Make sure switching language button works correctly", priority = 2)
//    public void verifySwitchLanguageWorksCorrectly(){ }
//    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "(Jordan Store/English Version): Make sure the Customer Service label & Phone Number appearing correctly", priority = 3)
//    public void verifyCustomerServiceAppearingCorrectly() {}
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(Jordan Store/English Version): Make sure the Search section appears correctly", priority = 4)
//    public void verifySearchSectionCorrectly() { }
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(Jordan Store/English Version): Make sure the Cart icon appears correctly", priority = 5)
//    public void verifyCartIconAppearsCorrectly() {}
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(Jordan Store/English Version): Make sure the My Account icon appears correctly", priority = 6)
//    public void verifyProfileIconAppearsCorrectly() {}
@Test(groups = { "1.4 Low Severity"}, description = "{{CountryName}}: Make sure the Customer Service label & Phone Number appearing correctly", priority = 3)
public void verifyCustomerServiceAppearingCorrectly() {
    HeaderSection headerSection = new HeaderSection(webDriver);
    if (webDriver.getCurrentUrl().contains("com/ar-"))
        WebElementsAssertion.assertionTextIsEqual(headerSection.getCustomerServiceLabel(), webDriver, XmlReader.getXMLData("CustomerServiceArLabelJordan"));
    else
        WebElementsAssertion.assertionTextIsEqual(headerSection.getCustomerServiceLabel(), webDriver, XmlReader.getXMLData("CustomerServiceEnLabel"));
}
}
