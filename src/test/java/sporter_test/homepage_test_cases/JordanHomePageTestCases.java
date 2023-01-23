/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class for JordanHomePageTestCases
 */

package sporter_test.homepage_test_cases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.JordanHomePage;

@Test(groups = "Jordan HomePage")
public class JordanHomePageTestCases extends HomePageTestCases {
    @BeforeClass
    public void switchToJordanStore(){
        JordanHomePage jordanHomePage=new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if(webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)){
            System.out.println("You are in Jordan Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+jordanHomePage.jordanDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
    @Test(enabled = false)
    public void verifyTopSellingStacksSectionAreDisplayed() {}
    @Test(enabled = false)
    public void verifyViewAllBtnInTopSellingStacksSectionWorking() {}
    @Test(enabled = false)
    public void verifyClickOnTheProductsAppearingInTheTopSellingStacksSectionRedirectTheUserToCorrectUrl() {}


}
