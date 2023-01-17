/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class for JordanHomePageTestCases
 */

package sporter_test.homepage_test_cases;

import core.BasePage;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.JordanHomePage;

@Test(groups = "Jordan HomePage")
public class JordanHomePageTestCases extends HomePageTestCases {
    @Test(groups = { "All Smoke Testing Result"},description = " Jordan HomePage- Switching to Jordan store", priority = 1)
    public void switchToJordanStore(){
        JordanHomePage jordanHomePage=new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if(webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)){
            System.out.println("You are in Jordan Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+jordanHomePage.jordanDomain);
            CloseInitialDialog();          }
    }



}
