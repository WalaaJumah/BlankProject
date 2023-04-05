/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.sportsSupplementsCategoryTestCases;

import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;

import java.io.IOException;

import static core.BasePage.BaseURL;

public class KSASportsSupplementsCategoryTestCases extends SportsSupplementsCategoryTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        HeaderSection headerSection = new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if (webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            System.out.println("You are in KSA Store");
        } else {
            webDriver.navigate().to(BaseURL + ksaHomePage.saudiDomain);
            CloseInitialDialog();
        }
        DataHelperAndWait.clickOnElement(headerSection.getLanguageSelector(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        System.out.println(webDriver.getCurrentUrl());
        storeCountry = "المملكة العربية السعودية";
        countryCode = "966";
    }

    @Test(enabled = false)
    public void verifyClickingOnSportsSupplementsCategoryFromShopByMenuRedirectUserToCorrectURL() throws IOException {
    }
}
