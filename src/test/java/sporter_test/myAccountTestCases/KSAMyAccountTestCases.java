/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.myAccountTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;

import static core.BasePage.BaseURL;

public class KSAMyAccountTestCases extends MyAccountTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        HeaderSection headerSection = new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        if (webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            System.out.println("You are in KSA Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
            //CloseInitialDialog();
        }
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        catch (Exception e){
            webDriver.navigate().to(BasePage.BaseURL +BasePage.ksaDomainArabic);
            WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        }
        System.out.println(webDriver.getCurrentUrl());
        storeCountry = "المملكة العربية السعودية";
        countryCode = "966";
    }

    @Test(enabled = false)
    public void verifyInabilityToAddNewAddressUsingInvalidNationalID() {
    }

    @Test(enabled = false)
    public void verifyInabilityToEditAddressUsingInvalidNationalID() {
    }

}
