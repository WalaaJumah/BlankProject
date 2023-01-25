/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEHeaderTestCases
 */

package sporter_test.headerTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.KsaHomePage;
import sporter_pages.homepage_classes.UAEHomePage;
@Test(groups = "2.06 UAE Header Section")

public class UAEHeaderTestCases extends HeaderTestCases{
    @BeforeClass(alwaysRun=true)
    public void switchToQatarStore(){
        UAEHomePage uaeHomePage=new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if(webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+uaeHomePage.aeDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
}
