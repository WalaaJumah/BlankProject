/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.sportsSupplementsCategoryTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.myAccountPages.KuwaitMyAccountPage;

public class KuwaitSportsSupplementsCategoryTestCases extends SportsSupplementsCategoryTestCases{
    @BeforeClass(alwaysRun=true)
    public void switchToKuwaitStore(){
        KuwaitMyAccountPage kuwaitMyAccountPage= new KuwaitMyAccountPage(webDriver);
        EgyptHomePage egyptHomePage=new EgyptHomePage(webDriver);
        egyptHomePage.switchCountry(kuwaitMyAccountPage.getKuwaitCountry());
        if(webDriver.getCurrentUrl().contains(egyptHomePage.kuwaitDomain)){
            System.out.println("You are in Kuwait Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+egyptHomePage.kuwaitDomain);
            CloseInitialDialog();          }
    }

}
