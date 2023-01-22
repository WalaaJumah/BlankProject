/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class for UAE Home Page
 */

package sporter_test.homepage_test_cases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.UAEHomePage;

@Test(groups = "UAE HomePage")
public class UAEHomePageTestCases extends HomePageTestCases {
    @BeforeClass
    public void switchToQatarStore(){
        UAEHomePage uaeHomePage=new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if(webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+uaeHomePage.aeDomain);
            CloseInitialDialog();          }
    }
}
