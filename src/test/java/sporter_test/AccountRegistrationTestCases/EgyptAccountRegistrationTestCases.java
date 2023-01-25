/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptAccountRegistrationTestCases
 */

package sporter_test.AccountRegistrationTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_test.headerTestCases.HeaderTestCases;

public class EgyptAccountRegistrationTestCases extends AccountRegistrationTestCases {
    @BeforeClass
    public void switchToEgyptStore(){
        EgyptHomePage egyptHomePage=new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if(webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)){
            System.out.println("You are in Jordan Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+egyptHomePage.egyptDomain);
            CloseInitialDialog();          }
    }
}
