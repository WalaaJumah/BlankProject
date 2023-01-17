package sporter_test.homepage_test_cases;

import core.BasePage;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.QatarHomePage;

@Test(groups = "Qatar HomePage")
public class QatarHomePageTestCases extends HomePageTestCases {


//    QatarHomePage qatarHomePage;
//The below code used when we did not define the QatarHomePageObject inside each method
//    @BeforeClass
//    @Override
//    @Parameters({"environment"})
//    public void setupBrowser( String environment) throws Exception {
//        super.setupBrowser(environment);
//        qatarHomePage= new QatarHomePage(webDriver);
//    }
@Test(groups = { "All Smoke Testing Result"},description = " Qatar HomePage- Switching to Qatar store", priority = 1)
public void switchToQatarStore(){
    QatarHomePage qatarHomePage=new QatarHomePage(webDriver);
    qatarHomePage.switchCountry(qatarHomePage.getQatarCountry());
    if(webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)){
        System.out.println("You are in Qatar Store");
    }
    else {
        webDriver.navigate().to(BasePage.BaseURL+qatarHomePage.saudiDomain);
        CloseInitialDialog();          }
}

}