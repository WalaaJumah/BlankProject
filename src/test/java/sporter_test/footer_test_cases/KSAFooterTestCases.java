/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.footer_test_cases;

import core.BasePage;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import sporter_pages.homepage_classes.KsaHomePage;

public class KSAFooterTestCases extends FooterTestCases {
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
    }
}
