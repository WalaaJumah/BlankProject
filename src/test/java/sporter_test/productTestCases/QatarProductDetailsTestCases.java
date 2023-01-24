/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarProductDetailsTestCases
 */

package sporter_test.productTestCases;

import core.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.QatarHomePage;

@Test(groups = "Qatar Product Details Page")

public class QatarProductDetailsTestCases  extends ProductDetailsTestCases{
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
    }}
