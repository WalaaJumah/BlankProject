package sporter_test.homepage_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.QatarHomePage;

//@Test(groups = "2.02 Qatar HomePage")
public class QatarHomePageTestCases extends HomePageTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToQatarStore() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchCountry(qatarHomePage.getQatarCountry());
        DataHelperAndWait.scrollToPositionZero(webDriver);
        if (webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)) {
            System.out.println("You are in Qatar Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + qatarHomePage.qatarDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
//
}