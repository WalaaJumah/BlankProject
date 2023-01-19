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

        for(int i=0; i<accessAllStoresCountriesPage.getCountryList().size();i++){
            DataHelperAndWait.clickOnElement(accessAllStoresCountriesPage.getCountryMenuIcon(),webDriver);
accessAllStoresCountriesPage.getCountryList().get(i).click();
    System.out.println(accessAllStoresCountriesPage.getCountryList().size());
            }
//            DataHelperAndWait.clickOnElement(accessAllStoresCountriesPage.getCountryList().get(i),webDriver);
//            WebElementsAssertion.validateTheCurrentUrlContainsString(expectedOption.get(i),webDriver);
//            System.out.println("The Current URL is: "+webDriver.getCurrentUrl()+"  And the Expected URL is:  "+BasePage.BaseURL+expectedOption.get(i));
        }

    }


