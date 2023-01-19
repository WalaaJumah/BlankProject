/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription AccessAllStoresCountriesTestCases
 */

package sporter_test;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AccessAllStoresCountriesPage;

import java.util.ArrayList;

public class AccessAllStoresCountriesTestCases extends BaseTest {
    @Test(groups = {"All Smoke Testing Result","1. Critical Severity"},description = "Ability to access all stores", priority = 1)
    public void accessAllCountries(){
        AccessAllStoresCountriesPage accessAllStoresCountriesPage = new AccessAllStoresCountriesPage(webDriver);
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("/en-ae");
            add("/en-eg");
            add("/en-sa");
            add("/en-bh");
            add("/en-jo");
            add("/en-kw");
            add("/en-om");
            add("/en-qa");
            add("/en-lb");
            add("/en-ae");
        }};
        DataHelperAndWait.clickOnElement(accessAllStoresCountriesPage.getCountryMenuIcon(),webDriver);
        DataHelperAndWait.waitForTime(3000);

        for(int i=0; i<accessAllStoresCountriesPage.getCountryList().size();i++){

            accessAllStoresCountriesPage.getCountryList().get(i).click();
            DataHelperAndWait.clickOnElement(accessAllStoresCountriesPage.getCountryMenuIcon(),webDriver);



        }
        }

    }


