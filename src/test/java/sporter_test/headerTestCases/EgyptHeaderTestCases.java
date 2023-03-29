/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription Egypt Test Cases
 */

package sporter_test.headerTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.EgyptHomePage;

//@Test(groups = "2.10 Egypt Header Section")
public class EgyptHeaderTestCases extends HeaderTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Egypt Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            CloseInitialDialog();
        }
    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(Egypt Store/English Version): Ability to access all stores using Country List appearing in the Header", priority = 1)
//    public void accessAllCountries(){ }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(Egypt Store/English Version): Make sure switching language button works correctly", priority = 2)
//    public void verifySwitchLanguageWorksCorrectly(){}
//    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "(Egypt Store/English Version): Make sure the Customer Service label & Phone Number appearing correctly", priority = 3)
//    public void verifyCustomerServiceAppearingCorrectly() {}
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(Egypt Store/English Version): Make sure the Search section appears correctly", priority = 4)
//    public void verifySearchSectionCorrectly() {}
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(Egypt Store/English Version): Make sure the Cart icon appears correctly", priority = 5)
//    public void verifyCartIconAppearsCorrectly() { }
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(Egypt Store/English Version): Make sure the My Account icon appears correctly", priority = 6)
//    public void verifyProfileIconAppearsCorrectly() {}
}