/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptHomePageTestCases
 */

package sporter_test.homepage_test_cases;

import core.BasePage;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.homepage_classes.QatarHomePage;
@Test(groups = "Egypt HomePage")
public class EgyptHomePageTestCases extends HomePageTestCases {


    //    QatarHomePage qatarHomePage;
//The below code used when we did not define the QatarHomePageObject inside each method
//    @BeforeClass
//    @Override
//    @Parameters({"environment"})
//    public void setupBrowser( String environment) throws Exception {
//        super.setupBrowser(environment);
//        qatarHomePage= new QatarHomePage(webDriver);
//    }
    @Test(groups = { "All Smoke Testing Result"},description = " Qatar HomePage- Switching to Egypt store", priority = 1)
    public void switchToEgyptStore(){
        EgyptHomePage egyptHomePage=new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if(webDriver.getCurrentUrl().contains(egyptHomePage.qatarDomain)){
            System.out.println("You are in Qatar Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+egyptHomePage.saudiDomain);
            CloseInitialDialog();          }
    }
}
