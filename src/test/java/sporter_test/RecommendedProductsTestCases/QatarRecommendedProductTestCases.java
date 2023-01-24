/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarRecommendedProductTestCases
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.QatarHomePage;
import sporter_test.productTestCases.ProductDetailsTestCases;

public class QatarRecommendedProductTestCases extends RecommendedProductTestCases {
    @BeforeClass
    public void switchToQatarStore(){
        QatarHomePage qatarHomePage=new QatarHomePage(webDriver);
        qatarHomePage.switchCountry(qatarHomePage.getQatarCountry());
        if(webDriver.getCurrentUrl().contains(qatarHomePage.qatarDomain)){
            System.out.println("You are in Qatar Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+qatarHomePage.qatarDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
}
