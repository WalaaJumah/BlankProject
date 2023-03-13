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

import java.util.ArrayList;
//TODO: Add Country to the test case description
@Test(groups = "2.11 Header Section")
public class HeaderTestCases extends BaseTest {
    String storeCountry;
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Ability to access all stores using Country List appearing in the Header", priority = 1)
    public void accessAllCountries(){
        HeaderSection headerSection = new HeaderSection(webDriver);
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("/en-ae");
            add("/en-eg");
            add("/en-sa");
            add("/en-bh");
            add("/en-jo");
            add("/en-kw");
            add("/en-om");
            add("/en-qa");
            add("/en-lb");
            add("/en-ae");
        }};
        DataHelperAndWait.clickOnElement(headerSection.getCountryMenuIcon(),webDriver);
        DataHelperAndWait.waitForTime(3000);
        for(int i = 0; i< headerSection.getCountryList().size(); i++){
            headerSection.getCountryList().get(i).click();
            DataHelperAndWait.clickOnElement(headerSection.getCountryMenuIcon(),webDriver);
        }
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}: Make sure switching language button works correctly", priority = 2)
    public void verifySwitchLanguageWorksCorrectly(){
        HeaderSection headerSection = new HeaderSection(webDriver);
        if(webDriver.getCurrentUrl().contains("com/ar-")){
            DataHelperAndWait.clickOnElement(headerSection.getLanguageBtn(),webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("com/en-",webDriver);
            WebElementsAssertion.assertionTextIsEqual(headerSection.getLanguageSelector(),webDriver,"عربي");
        }
        else{
            DataHelperAndWait.clickOnElement(headerSection.getLanguageBtn(),webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("com/ar-",webDriver);
            WebElementsAssertion.assertionTextIsEqual(headerSection.getLanguageSelector(),webDriver,"English");
        }
    }
    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}: Make sure the Customer Service label & Phone Number appearing correctly", priority = 3)
    public void verifyCustomerServiceAppearingCorrectly() {
        HeaderSection headerSection = new HeaderSection(webDriver);
        if(webDriver.getCurrentUrl().contains("com/ar-"))
            WebElementsAssertion.assertionTextIsEqual(headerSection.getCustomerServiceLabel(),webDriver, XmlReader.getXMLData("CustomerServiceArLabel"));
        else
            WebElementsAssertion.assertionTextIsEqual(headerSection.getCustomerServiceLabel(),webDriver, XmlReader.getXMLData("CustomerServiceEnLabel"));
    }
       @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure the Search section appears correctly", priority = 4)
    public void verifySearchSectionCorrectly() {
        HeaderSection headerSection =new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getSearchSection(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getSearchField(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getSearchBtn(),webDriver);
       }
       @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure the Cart icon appears correctly", priority = 5)
    public void verifyCartIconAppearsCorrectly() {
        HeaderSection headerSection =new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getCartIcon(),webDriver);
       }
       @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "{{CountryName}}: Make sure the My Account icon appears correctly", priority = 6)
    public void verifyProfileIconAppearsCorrectly() {
        HeaderSection headerSection =new HeaderSection(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerSection.getAccountProfileIcon(),webDriver);
       }
}