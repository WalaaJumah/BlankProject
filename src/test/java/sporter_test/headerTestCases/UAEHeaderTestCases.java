/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEHeaderTestCases
 */

package sporter_test.headerTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.UAEHomePage;

//@Test(groups = "2.06 UAE Header Section")

public class UAEHeaderTestCases extends HeaderTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToUAEStore() {
        UAEHomePage uaeHomePage = new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if (webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)) {
            System.out.println("You are in UAE Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + uaeHomePage.aeDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(UAE Store/English Version): Ability to access all stores using Country List appearing in the Header", priority = 1)
//    public void accessAllCountries(){}
//    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "(UAE Store/English Version): Make sure switching language button works correctly", priority = 2)
//    public void verifySwitchLanguageWorksCorrectly(){}
//    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "(UAE Store/English Version): Make sure the Customer Service label & Phone Number appearing correctly", priority = 3)
//    public void verifyCustomerServiceAppearingCorrectly() { }
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(UAE Store/English Version): Make sure the Search section appears correctly", priority = 4)
//    public void verifySearchSectionCorrectly() {}
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(UAE Store/English Version): Make sure the Cart icon appears correctly", priority = 5)
//    public void verifyCartIconAppearsCorrectly() { }
//    @Test(groups = {"All Smoke Testing Result","1.3 Medium Severity"},description = "(UAE Store/English Version): Make sure the My Account icon appears correctly", priority = 6)
//    public void verifyProfileIconAppearsCorrectly() { }
}
