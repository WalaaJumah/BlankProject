/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarHeaderTestCases
 */

package sporter_test.headerTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.QatarHomePage;
import xml_reader.XmlReader;

import java.util.ArrayList;

//@Test(groups = "2.07 Qatar Header Section")
public class QatarHeaderTestCases extends HeaderTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToQatarStore() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchCountry(qatarHomePage.getQatarCountry());
        if (webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)) {
            System.out.println("You are in Qatar Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + qatarHomePage.qatarDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }

    }

//    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "(Qatar Store/English Version): Ability to access all stores using Country List appearing in the Header", priority = 1)
//    public void accessAllCountries() {
//    }
//
//    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "(Qatar Store/English Version): Make sure switching language button works correctly", priority = 2)
//    public void verifySwitchLanguageWorksCorrectly() {
//    }
//
//    @Test(groups = {"All Smoke Testing Result", "1.4 Low Severity"}, description = "(Qatar Store/English Version): Make sure the Customer Service label & Phone Number appearing correctly", priority = 3)
//    public void verifyCustomerServiceAppearingCorrectly() {
//    }
//
//    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "(Qatar Store/English Version): Make sure the Search section appears correctly", priority = 4)
//    public void verifySearchSectionCorrectly() {
//    }
//
//    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "(Qatar Store/English Version): Make sure the Cart icon appears correctly", priority = 5)
//    public void verifyCartIconAppearsCorrectly() {
//    }
//
//    @Test(groups = {"All Smoke Testing Result", "1.3 Medium Severity"}, description = "(Qatar Store/English Version): Make sure the My Account icon appears correctly", priority = 6)
//    public void verifyProfileIconAppearsCorrectly() {
//    }
}
