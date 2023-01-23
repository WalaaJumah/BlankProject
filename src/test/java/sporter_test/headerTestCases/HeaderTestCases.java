/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription HeaderTestCases
 */

package sporter_test.headerTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.headerPages.HeaderPage;
import xml_reader.XmlReader;

import java.util.ArrayList;

public class HeaderTestCases extends BaseTest {
    @Test(groups = {"All Smoke Testing Result","1. Critical Severity"},description = "Header Section- Ability to access all stores using Country List appearing in the Header", priority = 1)
    public void accessAllCountries(){
        HeaderPage headerPage = new HeaderPage(webDriver);
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
        DataHelperAndWait.clickOnElement(headerPage.getCountryMenuIcon(),webDriver);
        DataHelperAndWait.waitForTime(3000);
        for(int i=0; i<headerPage.getCountryList().size();i++){
            headerPage.getCountryList().get(i).click();
            DataHelperAndWait.clickOnElement(headerPage.getCountryMenuIcon(),webDriver);
        }
    }
    @Test(groups = {"All Smoke Testing Result","1. Critical Severity"},description = "Header Section- Make sure switching language button works correctly", priority = 2)
    public void verifySwitchLanguageWorksCorrectly(){
        HeaderPage headerPage = new HeaderPage(webDriver);
        if(webDriver.getCurrentUrl().contains("com/ar-")){
            DataHelperAndWait.clickOnElement(headerPage.getLanguageBtn(),webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("com/en-",webDriver);
            WebElementsAssertion.assertionTextIsEqual(headerPage.getLanguageSelector(),webDriver,"عربي");
        }
        else{
            DataHelperAndWait.clickOnElement(headerPage.getLanguageBtn(),webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("com/ar-",webDriver);
            WebElementsAssertion.assertionTextIsEqual(headerPage.getLanguageSelector(),webDriver,"English");
        }
    }
    @Test(groups = {"All Smoke Testing Result","1. Low Severity"},description = "Header Section- Make sure the Customer Service label & Phone Number appearing correctly", priority = 3)
    public void verifyCustomerServiceAppearingCorrectly() {
        HeaderPage headerPage = new HeaderPage(webDriver);
        if(webDriver.getCurrentUrl().contains("com/ar-"))
            WebElementsAssertion.assertionTextIsEqual(headerPage.getCustomerServiceLabel(),webDriver, XmlReader.getXMLData("CustomerServiceArLabel"));
        else
            WebElementsAssertion.assertionTextIsEqual(headerPage.getCustomerServiceLabel(),webDriver, XmlReader.getXMLData("CustomerServiceEnLabel"));
    }
       @Test(groups = {"All Smoke Testing Result","3. Medium Severity"},description = "Header Section- Make sure the Search section appears correctly", priority = 4)
    public void verifySearchSectionCorrectly() {
        HeaderPage headerPage=new HeaderPage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerPage.getSearchSection(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerPage.getSearchField(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerPage.getSearchBtn(),webDriver);
       }
       @Test(groups = {"All Smoke Testing Result","3. Medium Severity"},description = "Header Section- Make sure the Cart icon appears correctly", priority = 5)
    public void verifyCartIconAppearsCorrectly() {
        HeaderPage headerPage=new HeaderPage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerPage.getCartIcon(),webDriver);
       }
       @Test(groups = {"All Smoke Testing Result","3. Medium Severity"},description = "Header Section- Make sure the My Account icon appears correctly", priority = 6)
    public void verifyProfileIconAppearsCorrectly() {
        HeaderPage headerPage=new HeaderPage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(headerPage.getAccountProfileIcon(),webDriver);
       }

}
