/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSAHeaderTestCases
 */

package sporter_test.headerTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;
import xml_reader.XmlReader;

import java.util.ArrayList;

//@Test(groups = "2.08 KSA Header Section")
public class KSAHeaderTestCases extends HeaderTestCases{
    @BeforeClass(alwaysRun=true)
    public void switchToKsaStore(){
        KsaHomePage ksaHomePage=new KsaHomePage(webDriver);
        HeaderSection headerSection =new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if(webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)){
            System.out.println("You are in KSA Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+ksaHomePage.saudiDomain);
            CloseInitialDialog();          }
        DataHelperAndWait.clickOnElement(headerSection.getLanguageSelector(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage,webDriver);
        System.out.println(webDriver.getCurrentUrl());

    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(KSA Store/Arabic Version): Ability to access all stores using Country List appearing in the Header", priority = 1)
    public void accessAllCountries(){}
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(KSA Store/Arabic Version): Make sure switching language button works correctly", priority = 2)
    public void verifySwitchLanguageWorksCorrectly(){}
    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "(KSA Store/Arabic Version): Make sure the Customer Service label & Phone Number appearing correctly", priority = 3)
    public void verifyCustomerServiceAppearingCorrectly() {}
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(KSA Store/Arabic Version): Make sure the Search section appears correctly", priority = 4)
    public void verifySearchSectionCorrectly() {}
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(KSA Store/Arabic Version): Make sure the Cart icon appears correctly", priority = 5)
    public void verifyCartIconAppearsCorrectly() {}
    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(KSA Store/Arabic Version): Make sure the My Account icon appears correctly", priority = 6)
    public void verifyProfileIconAppearsCorrectly()  {}
}