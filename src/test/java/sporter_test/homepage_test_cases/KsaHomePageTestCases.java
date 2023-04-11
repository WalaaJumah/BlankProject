package sporter_test.homepage_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.KsaHomePage;

//@Test(groups = "2.03 KSA HomePage")
public class KsaHomePageTestCases extends HomePageTestCases {

    @BeforeClass(alwaysRun = true)
    public void switchToKsaStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        HeaderSection headerSection = new HeaderSection(webDriver);
        ksaHomePage.switchCountry(ksaHomePage.getKsaCountry());
        DataHelperAndWait.scrollToPositionZero(webDriver);
        if (webDriver.getCurrentUrl().contains(ksaHomePage.saudiDomain)) {
            System.out.println("You are in KSA Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + ksaHomePage.saudiDomain);
            CloseInitialDialog();
        }
        DataHelperAndWait.clickOnElement(headerSection.getLanguageSelector(), webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(websiteArabicLanguage, webDriver);
        System.out.println(webDriver.getCurrentUrl());

    }
}