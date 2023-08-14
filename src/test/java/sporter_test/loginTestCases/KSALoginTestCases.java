/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSALoginTestCases
 */

package sporter_test.loginTestCases;

import core.BasePage;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.KsaHomePage;

public class KSALoginTestCases extends LoginTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if (!webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
        }
        if(!webDriver.getCurrentUrl().contains(websiteArabicLanguage)) {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        storeCountry = "المملكة العربية السعودية";
    }
}
