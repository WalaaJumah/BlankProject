/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription AccessAllStoresCountriesTestCases
 */

package sporter_test;

import core.BasePage;
import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AccessAllStoresCountriesPage;
import sporter_pages.AeProductDetailsPage;
import sporter_pages.KsaHomePage;
import sporter_pages.QatarHomePage;

public class AccessAllStoresCountriesTestCases extends BaseTest {
    @Test(groups = "Smoke Testing Report",description = "Ability switching to Qatar Store", priority = 1)
    public void switchToQatarStore() {
        QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
        qatarHomePage.switchToQatarCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +qatarHomePage.qatarDomain+"/");
        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
       @Test(groups = "Smoke Testing Report",description = "Ability switching between store language (Arabic & English) in Qatar Store", priority = 2)
    public void switchLanguageInQatarStore() {
           AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
           QatarHomePage qatarHomePage = new QatarHomePage(webDriver);
           qatarHomePage.switchToQatarCountry();
           accessAllStoresCountriesPage.getArabicLanguageBtn().click();
           Assert.assertTrue(accessAllStoresCountriesPage.getEnglishLanguageBtn().isDisplayed());
        qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
           accessAllStoresCountriesPage.getEnglishLanguageBtn().click();
           Assert.assertTrue(accessAllStoresCountriesPage.getArabicLanguageBtn().isDisplayed());
           qatarHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

     @Test(groups = "Smoke Testing Report",description = "Ability switching to UAE Store", priority = 3)
    public void switchToUAEStore() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
         aeProductDetailsPage.switchToAECountry();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeProductDetailsPage.aeDomain+"/");
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = "Smoke Testing Report",description = "Ability switching between store language (Arabic & English) in UAE Store", priority = 4)
    public void switchLanguageInUAEStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAECountry();
        accessAllStoresCountriesPage.getArabicLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getEnglishLanguageBtn().isDisplayed());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        accessAllStoresCountriesPage.getEnglishLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getArabicLanguageBtn().isDisplayed());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
       @Test(groups = "Smoke Testing Report",description = "Ability switching to Jordan Store", priority = 5)
    public void switchToJordanStore() {
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
         aeProductDetailsPage.switchToJOCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeProductDetailsPage.jordanDomain+"/");
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = "Smoke Testing Report",description = "Ability switching between store language (Arabic & English) in Jordan Store", priority = 6)
    public void switchLanguageInJordanStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToJOCountry();
        accessAllStoresCountriesPage.getArabicLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getEnglishLanguageBtn().isDisplayed());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        accessAllStoresCountriesPage.getEnglishLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getArabicLanguageBtn().isDisplayed());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
       @Test(groups = "Smoke Testing Report",description = "Ability switching to KSA Store", priority = 7)
    public void switchToKSAStore() {
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
           ksaHomePage.switchToKsaCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +ksaHomePage.saudiDomain+"/");
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = "Smoke Testing Report",description = "Ability switching between store language (Arabic & English) in KSA Store", priority = 8)
    public void switchLanguageInKSAStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        accessAllStoresCountriesPage.getArabicLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getEnglishLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        accessAllStoresCountriesPage.getEnglishLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getArabicLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = "Smoke Testing Report",description = "Ability switching to Bahrain Store", priority = 9)
    public void switchToBahrainStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
            accessAllStoresCountriesPage.switchToBahrainCountryCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +accessAllStoresCountriesPage.bahrainDomain+"/");
        accessAllStoresCountriesPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = "Smoke Testing Report",description = "Ability switching between store language (Arabic & English) in Bahrain Store", priority = 10)
    public void switchLanguageInBahrainStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        accessAllStoresCountriesPage.switchToBahrainCountryCountry();
        accessAllStoresCountriesPage.getArabicLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getEnglishLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        accessAllStoresCountriesPage.getEnglishLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getArabicLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = "Smoke Testing Report",description = "Ability switching to Oman Store", priority = 11)
    public void switchToOmanStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
            accessAllStoresCountriesPage.switchToOmanCountryCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +accessAllStoresCountriesPage.omanDomain+"/");
        accessAllStoresCountriesPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = "Smoke Testing Report",description = "Ability switching between store language (Arabic & English) in Oman Store", priority = 12)
    public void switchLanguageInOmanStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        accessAllStoresCountriesPage.switchToOmanCountryCountry();
        accessAllStoresCountriesPage.getArabicLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getEnglishLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        accessAllStoresCountriesPage.getEnglishLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getArabicLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = "Smoke Testing Report",description = "Ability switching to Kuwait Store", priority = 13)
    public void switchToKuwaitStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
            accessAllStoresCountriesPage.switchToKuwaitCountryCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +accessAllStoresCountriesPage.kuwaitDomain+"/");
        accessAllStoresCountriesPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = "Smoke Testing Report",description = "Ability switching between store language (Arabic & English) in Kuwait Store", priority = 14)
    public void switchLanguageInKuwaitStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        accessAllStoresCountriesPage.switchToKuwaitCountryCountry();
        accessAllStoresCountriesPage.getArabicLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getEnglishLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        accessAllStoresCountriesPage.getEnglishLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getArabicLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = "Smoke Testing Report",description = "Ability switching to Egypt Store", priority = 15)
    public void switchToEqyptStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
            accessAllStoresCountriesPage.switchToEgyptCountryCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +accessAllStoresCountriesPage.egyptDomain+"/");
        accessAllStoresCountriesPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = "Smoke Testing Report",description = "Ability switching between store language (Arabic & English) in Egypt Store", priority = 16)
    public void switchLanguageIEgyptStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        accessAllStoresCountriesPage.switchToEgyptCountryCountry();
        accessAllStoresCountriesPage.getArabicLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getEnglishLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        accessAllStoresCountriesPage.getEnglishLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getArabicLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

        @Test(groups = "Smoke Testing Report",description = "Ability switching to International Store", priority = 17)
    public void switchToInternationalStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
            accessAllStoresCountriesPage.switchToInternationalCountryCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +accessAllStoresCountriesPage.aeDomain+"/");
        accessAllStoresCountriesPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = "Smoke Testing Report",description = "Ability switching between store language (Arabic & English) in International Store", priority = 18)
    public void switchLanguageIInternationalStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        accessAllStoresCountriesPage.switchToInternationalCountryCountry();
        accessAllStoresCountriesPage.getArabicLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getEnglishLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        accessAllStoresCountriesPage.getEnglishLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getArabicLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
        @Test(groups = "Smoke Testing Report",description = "Ability switching to Lebanon Store", priority = 19)
    public void switchToLebanonlStore() {
            AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
            aeProductDetailsPage.switchToLebanonCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(), BasePage.BaseURL +aeProductDetailsPage.lebanonDomain+"/");
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = "Smoke Testing Report",description = "Ability switching between store language (Arabic & English) in Lebanon Store", priority = 20)
    public void switchLanguageLebanonStore() {
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
        KsaHomePage ksaHomePage = new KsaHomePage(webDriver);
        accessAllStoresCountriesPage.switchToInternationalCountryCountry();
        accessAllStoresCountriesPage.getArabicLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getEnglishLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
        accessAllStoresCountriesPage.getEnglishLanguageBtn().click();
        Assert.assertTrue(accessAllStoresCountriesPage.getArabicLanguageBtn().isDisplayed());
        ksaHomePage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
