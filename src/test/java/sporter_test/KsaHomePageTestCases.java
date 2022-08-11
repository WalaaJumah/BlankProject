package sporter_test;

import core.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.KsaHomePage;

import java.util.ArrayList;
import java.util.List;

public class KsaHomePageTestCases extends BaseTest {
    private KsaHomePage ksaHomePage;
    @Test(description = "Make sure to switch to the KSA Store correctly", priority = 1)
    public void switchToKsaStore(){
        ksaHomePage= new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertEquals(webDriver.getCurrentUrl(),ksaSiteURL);
    }
    @Test(description = "Make sure the HomePage rotating slider section is displayed in Home Page", priority = 2)
    public void verifyHomePageRotatingSliderIsDisplayed(){
        ksaHomePage= new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSlider().isDisplayed());
       for (int i=0; i<ksaHomePage.getHomePageRotatingSliderlist().size();i++) {
           Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderlist().get(i).isDisplayed());
       }}
        @Test(description = "Make sure the next arrow at the HomePage rotating slider section is displayed ",priority = 3)
        public void verifyNextArrowAtHomePageRotatingSliderIsDisplayed(){
            ksaHomePage= new KsaHomePage(webDriver);
            ksaHomePage.switchToKsaCountry();
            Assert.assertTrue(ksaHomePage.getNextArrowInHomePageRotatingSlider().isDisplayed());
        }
    @Test(description = "Make sure the previous arrow at the HomePage rotating slider section is displayed ",priority = 4)
    public void verifyPreviousArrowAtHomePageRotatingSliderIsDisplayed(){
        ksaHomePage= new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getPreviousArrowInHomePageRotatingSlider().isDisplayed());
    }
    @Test(description = "Make sure the pagination control appears on the HomePage rotating slider is displayed", priority = 5)
    public void verifyPagenationControlOnHomePageRotatingSliderIsDisplayed(){
        ksaHomePage= new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPagingControl().isDisplayed());
        for (int i=0; i<ksaHomePage.getHomePageRotatingSliderPaginglist().size();i++) {
            Assert.assertTrue(ksaHomePage.getHomePageRotatingSliderPaginglist().get(i).isDisplayed());
        }}
    @Test(description = "Make sure the HomePage side Banner is displayed ",priority = 6)
    public void verifyHomePageSideBannerIsDisplayed(){
        ksaHomePage= new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getHomePageSideBanner().isDisplayed());
    }
    @Test(description = "Make sure the HomePage Horizontal Banner is displayed ",priority = 7)
    public void verifyHomePageHorizontalBannerIsDisplayed(){
        ksaHomePage= new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getHorizontalBanner().isDisplayed());
    }
    @Test(description = "Make sure the Shop By Category section is displayed ",priority = 8)
    public void verifyShopByCategoryIsDisplayed(){
        ksaHomePage= new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        Assert.assertTrue(ksaHomePage.getShopByCategoryHeader().isDisplayed());
        Assert.assertTrue(ksaHomePage.getShopByCategorySections().isDisplayed());
    }
    @Test(description = "Make sure the main options in the Mega Menu are displayed", priority = 9)
    public void verifyMainOptionsInTheMegaMenyAreDisplayed() {
        ksaHomePage = new KsaHomePage(webDriver);
        ksaHomePage.switchToKsaCountry();
        for (int i = 0; i < ksaHomePage.getMegaMenuMainList().size(); i++) {
            System.out.println(ksaHomePage.getMegaMenuMainList().get(i).getText());
            Assert.assertTrue(ksaHomePage.getMegaMenuMainList().get(i).isDisplayed());}

//////////////////////////////////////////////////////////////////////////
            List<String> expectedMegaMenuValues = new ArrayList<String>() {
                {
                    add("Shop By");
                    add("Sport Supplements");
                    add("Vitamins & Health");
                    add("Healthy Food");
                    add("SPORTS");
                    add("Women's Only");
                }
            };
            List<WebElement> actualDropDownValues = ksaHomePage.getMegaMenuMainList();

            for (int i = 0; i < actualDropDownValues.size(); i++) {

                if (actualDropDownValues.get(i).getText().equals(expectedMegaMenuValues.get(i).toString())) {

                    System.out.println("Value Matching :" + "Actual List Value=" + actualDropDownValues.get(i).getText() + " And Expected Value=" + expectedMegaMenuValues.get(i));
                } else {
                    System.out.println("Value Not Matching :" + "Actual List Value=" + actualDropDownValues.get(i).getText() + " And Expected Value=" + expectedMegaMenuValues.get(i));
                }
            }
        }}




















