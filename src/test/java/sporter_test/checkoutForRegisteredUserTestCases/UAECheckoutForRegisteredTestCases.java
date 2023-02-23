/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.checkoutForRegisteredUserTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.UAEHomePage;
import sporter_test.guestCheckoutCycleTestCases.GuestCheckoutCycleTestCases;

public class UAECheckoutForRegisteredTestCases extends CheckoutForRegisteredTestCases {
    @BeforeClass(alwaysRun=true)
    public void switchToUAEStore(){
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
        storeCountry="United Arab Emirates";
        countryCode="971";
    }
     @Test(enabled = false)
     public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID() {}
}
