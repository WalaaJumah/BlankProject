/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSAHeaderTestCases
 */

package sporter_test.headerTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.headerPages.HeaderPage;
import sporter_pages.homepage_classes.KsaHomePage;

@Test(groups = "KSA Header Section")
public class KSAHeaderTestCases extends HeaderTestCases{
    @BeforeClass
    public void switchToKsaStore(){
        KsaHomePage ksaHomePage=new KsaHomePage(webDriver);
        HeaderPage headerPage=new HeaderPage(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if(webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)){
            System.out.println("You are in KSA Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+ksaHomePage.saudiDomain);
            CloseInitialDialog();          }
        DataHelperAndWait.clickOnElement(headerPage.getLanguageSelector(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage,webDriver);
        System.out.println(webDriver.getCurrentUrl());

    }
}
