package sporter_test.homepage_test_cases;

import core.BasePage;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.KsaHomePage;

@Test(groups = "KSA HomePage")
public class KsaHomePageTestCases  extends HomePageTestCases {
    @Test(groups = { "All Smoke Testing Result"},description = " KSA HomePage- Switching to KSA store", priority = 1)
    public void switchToKsaStore(){
        KsaHomePage ksaHomePage=new KsaHomePage(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if(webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)){
            System.out.println("You are in KSA Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+ksaHomePage.saudiDomain);
            CloseInitialDialog();          }
    }


}