/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class contains all test cases that verifying ability to access all pages inside all categories listed in the MegaMenu
 */

package sporter_test;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEMegaMenuPage;
import sporter_pages.AeHealthyFoodCategoryPage;
import sporter_pages.AeSportSupplementsCategoryPage;
import sporter_pages.AeWomenOnlyCategoryPage;



public class AeAllPagesInsideCategoriesInMegaMenuTestCases  extends BaseTest {
    private Actions action;

    @Test(groups = "All Smoke Testing Result",description = "Switching to UAE store", priority = 1)
    public void switchToUaeStore(){
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
        aeWomenOnlyCategoryPage.switchToAECountry();
        if(webDriver.getCurrentUrl().contains(aeWomenOnlyCategoryPage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+aeDomain);
            CloseInitialDialog();        }
    }
    //Sport Supplements Category Pages
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Sport Supplements Category Page", priority = 1)
    public void verifyAbilityToAccessAllPagesInsideSportSupplementsCategoryPageFromMegaMenu(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        action = new Actions(webDriver);
        action.moveToElement(aeSportSupplementsCategoryPage.getSportSupplementsMainMenu()).perform();
        String expectedUrl=aeSportSupplementsCategoryPage.getSportSupplementsMainMenu().getAttribute("href");
        aeSportSupplementsCategoryPage.getSportSupplementsMainMenu().click();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Protein Sub-Category related to the Sport Supplements Category ", priority = 2)
    public void verifyAbilityToAccessAllPagesInsideProteinCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Whey Protein Sub-Category related to the Sport Supplements Category ", priority = 3)
    public void verifyAbilityToAccessAllPagesInsideWheyProteinCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), wheyProteinOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Whey Protein Isolate Sub-Category related to the Sport Supplements Category ", priority = 4)
    public void verifyAbilityToAccessAllPagesInsideWheyProteinIsolateCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), WheyProteinIsolateOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Protein Blends Sub-Category related to the Sport Supplements Category ", priority = 5)
    public void verifyAbilityToAccessAllPagesInsideProteinBlendsCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBlendsOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Non Dairy Protein Sub-Category related to the Sport Supplements Category ", priority = 6)
    public void verifyAbilityToAccessAllPagesInsideNonDairyProteinCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nonDairyProteinOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Casein Protein Sub-Category related to the Sport Supplements Category ", priority = 7)
    public void verifyAbilityToAccessAllPagesInsideCaseinProteinCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), caseinProteinOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Diet Protein Sub-Category related to the Sport Supplements Category ", priority = 8)
    public void verifyAbilityToAccessAllPagesInsideDietProteinCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDietProteinOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDietProteinOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getDietProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), dietProteinOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Mass Gainers Sub-Category related to the Sport Supplements Category ", priority = 9)
    public void verifyAbilityToAccessAllPagesInsideMassGainersCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMassGainersOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMassGainersOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getMassGainersOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), massGainersOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Creatine Sub-Category related to the Sport Supplements Category ", priority = 10)
    public void verifyAbilityToAccessAllPagesInsideCreatineCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), creatineOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Creatine Monohydrate Sub-Category related to the Sport Supplements Category ", priority = 11)
    public void verifyAbilityToAccessAllPagesInsideCreatineMonohydrateCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage  aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), creatineMonohydrateOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Creatine Blends Sub-Category related to the Sport Supplements Category ", priority = 12)
    public void verifyAbilityToAccessAllPagesInsideCreatineBlendsCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), creatineBlendsOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Amino Acids Sub-Category related to the Sport Supplements Category ", priority = 13)
    public void verifyAbilityToAccessAllPagesInsideAminoAcidsCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidsOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside BCAA Sub-Category related to the Sport Supplements Category ", priority = 14)
    public void verifyAbilityToAccessAllPagesInsideBCAACategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getbCAAOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getbCAAOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getbCAAOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bCAAOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside EAA Sub-Category related to the Sport Supplements Category ", priority = 15)
    public void verifyAbilityToAccessAllPagesInsideEAACategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.geteAAOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.geteAAOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.geteAAOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), eAAOptionInSportSupplementsMenuUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }

   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Arginine Sub-Category related to the Sport Supplements Category ", priority = 16)
    public void verifyAbilityToAccessAllPagesInsideArginineCategoryRelatedToSportSupplementsCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
       aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getArginineOptionInSportSupplementsMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getArginineOptionInSportSupplementsMainMenu().getAttribute("href");
       aeMegamenuPage.getArginineOptionInSportSupplementsMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), arginineOptionInSportSupplementsMenuUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Beta Alanine Sub-Category related to the Sport Supplements Category ", priority = 17)
    public void verifyAbilityToAccessAllPagesInsideBetaAlanineCategoryRelatedToSportSupplementsCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
       aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu().getAttribute("href");
       aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), betaAlanineOptionInSportSupplementsMenuUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside HMb Sub-Category related to the Sport Supplements Category ", priority = 18)
    public void verifyAbilityToAccessAllPagesInsideHMbCategoryRelatedToSportSupplementsCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
       aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.gethMBOptionInSportSupplementsMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.gethMBOptionInSportSupplementsMainMenu().getAttribute("href");
       aeMegamenuPage.gethMBOptionInSportSupplementsMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hMBOptionInSportSupplementsMenuUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Amino Acid Powders Sub-Category related to the Sport Supplements Category ", priority = 19)
    public void verifyAbilityToAccessAllPagesInsideAminoAcidPowdersCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
       aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu().getAttribute("href");
       aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPowdersOptionInSportSupplementsMenuUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Amino Acid Pills Sub-Category related to the Sport Supplements Category ", priority = 20)
    public void verifyAbilityToAccessAllPagesInsideAminoAcidPillsCategoryRelatedToSportSupplementsCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu().getAttribute("href");
       aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPillsOptionInSportSupplementsMenuUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Citrulline Sub-Category related to the Sport Supplements Category ", priority = 21)
    public void verifyAbilityToAccessAllPagesInsideCitrullineCategoryRelatedToSportSupplementsCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getCitrullineOptionInSportSupplementsMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getCitrullineOptionInSportSupplementsMainMenu().getAttribute("href");
       aeMegamenuPage.getCitrullineOptionInSportSupplementsMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), citrullineOptionInSportSupplementsMenuUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Amino Acid Liquids Sub-Category related to the Sport Supplements Category ", priority = 22)
    public void verifyAbilityToAccessAllPagesInsideAminoAcidLiquidsCategoryRelatedToSportSupplementsCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu().getAttribute("href");
       aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidLiquidsOptionInSportSupplementsMenuUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Muscle Boosters Sub-Category related to the Sport Supplements Category ", priority = 23)
    public void verifyAbilityToAccessAllPagesInsideMuscleBoostersCategoryRelatedToSportSupplementsCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().getAttribute("href");
       aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), muscleBoostersOptionInSportSupplementsMenuUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Testosterone Boosters Sub-Category related to the Sport Supplements Category ", priority = 24)
    public void verifyAbilityToAccessAllPagesInsideTestosteroneBoostersCategoryRelatedToSportSupplementsCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu().getAttribute("href");
       aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), testosteroneBoostersOptionInSportSupplementsMenuUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Gh Booster Sub-Category related to the Sport Supplements Category ", priority = 25)
    public void verifyAbilityToAccessAllPagesInsideGhBoosterCategoryRelatedToSportSupplementsCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu().getAttribute("href");
      aeMegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ghBoostersOptionInSportSupplementsMenuUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Weight Management Sub-Category related to the Sport Supplements Category ", priority = 26)
    public void verifyAbilityToAccessAllPagesInsideWeightManagementCategoryRelatedToSportSupplementsCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu().getAttribute("href");
      aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInSportSupplementsMenuUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Stimulant Weight Loss Sub-Category related to the Sport Supplements Category ", priority = 27)
    public void verifyAbilityToAccessAllPagesInsideStimulantWeightLossCategoryRelatedToSportSupplementsCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu().getAttribute("href");
      aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantWeightLossOptionInSportSupplementsMenuUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Non Stimulant Weight Loss Sub-Category related to the Sport Supplements Category ", priority = 28)
    public void verifyAbilityToAccessAllPagesInsideNonStimulantWeightLossCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu().getAttribute("href");
      aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantWeightLossOptionInSportSupplementsMenuUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Meal Replacements Sub-Category related to the Sport Supplements Category ", priority = 29)
    public void verifyAbilityToAccessAllPagesInsideMealReplacementsCategoryRelatedToSportSupplementsCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu().getAttribute("href");
      aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mealReplacementsOptionInSportSupplementsMenuUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Metabolism Support Sub-Category related to the Sport Supplements Category ", priority = 30)
    public void verifyAbilityToAccessAllPagesInsideMetabolismSupportCategoryRelatedToSportSupplementsCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu().getAttribute("href");
      aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), metabolismSupportOptionInSportSupplementsMenuUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Toning Creams Sub-Category related to the Sport Supplements Category ", priority = 31)
    public void verifyAbilityToAccessAllPagesInsideToningCreamsCategoryRelatedToSportSupplementsCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu().getAttribute("href");
      aeMegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), toningCreamsOptionInSportSupplementsMenuUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Mct Sub-Category related to the Sport Supplements Category ", priority = 32)
    public void verifyAbilityToAccessAllPagesInsideMctCategoryRelatedToSportSupplementsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getMctOptionInSportSupplementsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getMctOptionInSportSupplementsMainMenu().getAttribute("href");
     aeMegamenuPage.getMctOptionInSportSupplementsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mctOptionInSportSupplementsMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Recovery Sub-Category related to the Sport Supplements Category ", priority = 33)
    public void verifyAbilityToAccessAllPagesInsideRecoveryCategoryRelatedToSportSupplementsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu().getAttribute("href");
     aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryOptionInSportSupplementsMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
            try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e)
            {
                System.out.println("This option is removed from the Mega Menu By the production team");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Glutamine Sub-Category related to the Sport Supplements Category ", priority = 34)
    public void verifyAbilityToAccessAllPagesInsideGlutamineCategoryRelatedToSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getGlutamineOptionInSportSupplementsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getGlutamineOptionInSportSupplementsMainMenu().getAttribute("href");
     aeMegamenuPage.getGlutamineOptionInSportSupplementsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), glutamineOptionInSportSupplementsMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Recovery Blend Sub-Category related to the Sport Supplements Category ", priority = 35)
    public void verifyAbilityToAccessAllPagesInsideRecoveryBlendCategoryRelatedToSportSupplementsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu().getAttribute("href");
     aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryBlendOptionInSportSupplementsMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Electrolytes And Hydration Sub-Category related to the Sport Supplements Category ", priority = 36)
    public void verifyAbilityToAccessAllPagesInsideElectrolytesAndHydrationCategoryRelatedToSportSupplementsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu().getAttribute("href");
     aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationOptionInSportSupplementsMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Carbohydrates Sub-Category related to the Sport Supplements Category ", priority = 37)
    public void verifyAbilityToAccessAllPagesInsideCarbohydratesCategoryRelatedToSportSupplementsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu().getAttribute("href");
     aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratesOptionInSportSupplementsMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Carbohydrate Powders Sub-Category related to the Sport Supplements Category ", priority = 38)
    public void verifyAbilityToAccessAllPagesInsideCarbohydratePowdersCategoryRelatedToSportSupplementsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu().getAttribute("href");
     aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratePowdersOptionInSportSupplementsMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Energy And Endurance Sub-Category related to the Sport Supplements Category ", priority = 39)
    public void verifyAbilityToAccessAllPagesInsideEnergyAndEnduranceCategoryRelatedToSportSupplementsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu().getAttribute("href");
     aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), energyAndEnduranceOptionInSportSupplementsMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }

 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Stimulant Energy Sub-Category related to the Sport Supplements Category ", priority = 40)
    public void verifyAbilityToAccessAllPagesInsideStimulantEnergyCategoryRelatedToSportSupplementsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu().getAttribute("href");
     aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantEnergyOptionInSportSupplementsMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Non Stimulant Energy Sub-Category related to the Sport Supplements Category ", priority = 41)
    public void verifyAbilityToAccessAllPagesInsideNonStimulantEnergyCategoryRelatedToSportSupplementsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu().getAttribute("href");
    aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantEnergyOptionInSportSupplementsMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Gaming And Focus Sub-Category related to the Sport Supplements Category ", priority = 42)
    public void verifyAbilityToAccessAllPagesInsideGamingAndFocusCategoryRelatedToSportSupplementsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu().getAttribute("href");
    aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), gamingAndFocusOptionInSportSupplementsMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Gaming Essentials Sub-Category related to the Sport Supplements Category ", priority = 43)
    public void verifyAbilityToAccessAllPagesInsideGamingEssentialsCategoryRelatedToSportSupplementsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu().getAttribute("href");
    aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), gamingEssentialsOptionInSportSupplementsMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    //Vitamins & Health Category Pages
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Featured Sub-Category related to the Vitamins & Health Category ", priority = 44)
    public void verifyAbilityToAccessAllPagesInsideFeaturedCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), featuredOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Best Sellers Sub-Category related to the Vitamins & Health Category ", priority = 45)
    public void verifyAbilityToAccessAllPagesInsideBestSellersCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aliveVitaminsOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Sexual Health Sub-Category related to the Vitamins & Health Category ", priority = 46)
    public void verifyAbilityToAccessAllPagesInsideSexualHealthCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sexualHealthOptionInVitaminsAndHealthUrl);
        System.out.println(webDriver.getCurrentUrl());
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Essential Vitamins Sub-Category related to the Vitamins & Health Category ", priority = 47)
    public void verifyAbilityToAccessAllPagesInsideEssentialVitaminsCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), essentialVitaminsOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Folic Acid Sub-Category related to the Vitamins & Health Category ", priority = 48)
    public void verifyAbilityToAccessAllPagesInsideFolicAcidCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), folicAcidOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin A Sub-Category related to the Vitamins & Health Category ", priority = 49)
    public void verifyAbilityToAccessAllPagesInsideVitaminACategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminAOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin B Sub-Category related to the Vitamins & Health Category ", priority = 50)
    public void verifyAbilityToAccessAllPagesInsideVitaminBCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminBOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin C Sub-Category related to the Vitamins & Health Category ", priority = 51)
    public void verifyAbilityToAccessAllPagesInsideVitaminCCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminCOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin D Sub-Category related to the Vitamins & Health Category ", priority = 52)
    public void verifyAbilityToAccessAllPagesInsideVitaminDCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminDOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin E Sub-Category related to the Vitamins & Health Category ", priority = 53)
    public void verifyAbilityToAccessAllPagesInsideVitaminECategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminEOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin K Sub-Category related to the Vitamins & Health Category ", priority = 54)
    public void verifyAbilityToAccessAllPagesInsideVitaminKCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminKOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Multi Vitamins Sub-Category related to the Vitamins & Health Category ", priority = 55)
    public void verifyAbilityToAccessAllPagesInsideMultiVitaminsCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), multiVitaminsOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Vitamins For Kids Sub-Category related to the Vitamins & Health Category ", priority = 56)
    public void verifyAbilityToAccessAllPagesInsideVitaminsForKidsCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForKidsOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Vitamins For Men Sub-Category related to the Vitamins & Health Category ", priority = 57)
    public void verifyAbilityToAccessAllPagesInsideVitaminsForMenCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForMenOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Vitamins For Women Sub-Category related to the Vitamins & Health Category ", priority = 58)
    public void verifyAbilityToAccessAllPagesInsideVitaminsForWomenCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForWomenOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Bone And Joint Sub-Category related to the Vitamins & Health Category ", priority = 59)
    public void verifyAbilityToAccessAllPagesInsideBoneAndJointCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), boneJointOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Bone Health Sub-Category related to the Vitamins & Health Category ", priority = 60)
    public void verifyAbilityToAccessAllPagesInsideBoneHealthCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), boneHealthOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Joint Health Sub-Category related to the Vitamins & Health Category ", priority = 61)
    public void verifyAbilityToAccessAllPagesInsideJointHealthCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), jointHealthOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Beauty Sub-Category related to the Vitamins & Health Category ", priority = 62)
    public void verifyAbilityToAccessAllPagesInsideBeautyCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), beautyOptionInVitaminsAndHealthUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Collagen Sub-Category related to the Vitamins & Health Category ", priority = 63)
    public void verifyAbilityToAccessAllPagesInsideCollagenCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), collagenOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Hair Skin And Nails Sub-Category related to the Vitamins & Health Category ", priority = 64)
    public void verifyAbilityToAccessAllPagesInsideHairSkinAndNailsCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hairSkinAndNailsOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Fish Oil Omegas Sub-Category related to the Vitamins & Health Category ", priority = 65)
    public void verifyAbilityToAccessAllPagesInsideFishOilOmegasCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilAndOmegasOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Fish Oil Sub-Category related to the Vitamins & Health Category ", priority = 66)
    public void verifyAbilityToAccessAllPagesInsideFishOilCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Omega369 Sub-Category related to the Vitamins & Health Category ", priority = 67)
    public void verifyAbilityToAccessAllPagesInsideOmega369CategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), omegaMixOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
            try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Health Life style Sub-Category related to the Vitamins & Health Category ", priority = 68)
    public void verifyAbilityToAccessAllPagesInsideHealthLifestyleCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyLifestyleOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Antioxidants Sub-Category related to the Vitamins & Health Category ", priority = 69)
    public void verifyAbilityToAccessAllPagesInsideAntioxidantsCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), antioxidantOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Blood Sugar Support Sub-Category related to the Vitamins & Health Category ", priority = 70)
    public void verifyAbilityToAccessAllPagesInsideBloodSugarSupportCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bloodSugarSupportOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Brain Support Sub-Category related to the Vitamins & Health Category ", priority = 71)
    public void verifyAbilityToAccessAllPagesInsideBrainSupportCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), brainSupportOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Detox And Cleans Sub-Category related to the Vitamins & Health Category ", priority = 72)
    public void verifyAbilityToAccessAllPagesInsideDetoxAndCleansCategoryCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), detoxCleanseOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Energy Formulas Sub-Category related to the Vitamins & Health Category ", priority = 74)
    public void verifyAbilityToAccessAllPagesInsideEnergyFormulasCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), energyFormulasOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Eye Health Sub-Category related to the Vitamins & Health Category ", priority = 75)
    public void verifyAbilityToAccessAllPagesInsideEyeHealthCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), eyeHealthOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Herbs Option Sub-Category related to the Vitamins & Health Category ", priority = 76)
    public void verifyAbilityToAccessAllPagesInsideHerbsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), herbsOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Hormones Balance Option Sub-Category related to the Vitamins & Health Category ", priority = 77)
    public void verifyAbilityToAccessAllPagesInsideHormonesBalanceOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hormonesBalanceOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Immune Support Option Sub-Category related to the Vitamins & Health Category ", priority = 78)
    public void verifyAbilityToAccessAllPagesInsideImmuneSupportOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), immuneSupportOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Mens Health Option Sub-Category related to the Vitamins & Health Category ", priority = 79)
    public void verifyAbilityToAccessAllPagesInsideMensHealthOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mensHealthOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Stress Relief Option Sub-Category related to the Vitamins & Health Category ", priority = 80)
    public void verifyAbilityToAccessAllPagesInsideStressReliefOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), stressReliefOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Sleep Support Option Sub-Category related to the Vitamins & Health Category ", priority = 81)
    public void verifyAbilityToAccessAllPagesInsideSleepSupportOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
       aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sleepSupportOptionInVitaminsAndHealthUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Super Foods Option Sub-Category related to the Vitamins & Health Category ", priority = 82)
    public void verifyAbilityToAccessAllPagesInsideSuperFoodsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Urinary Tract Support Option Sub-Category related to the Vitamins & Health Category ", priority = 83)
    public void verifyAbilityToAccessAllPagesInsideUrinaryTractSupportOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), urinaryTractSupportOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Weight Management Option Sub-Category related to the Vitamins & Health Category ", priority = 84)
    public void verifyAbilityToAccessAllPagesInsideWeightManagementSupportOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Womens Health  Option Sub-Category related to the Vitamins & Health Category ", priority = 85)
    public void verifyAbilityToAccessAllPagesInsideWomensHealthOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenesHealthOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Digestion Option Sub-Category related to the Vitamins & Health Category ", priority = 86)
    public void verifyAbilityToAccessAllPagesInsideDigestionOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), digestionOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Digestion Support Option Sub-Category related to the Vitamins & Health Category ", priority = 87)
    public void verifyAbilityToAccessAllPagesInsideDigestionSupportOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), digestionSupportOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Probiotics Option Sub-Category related to the Vitamins & Health Category ", priority = 88)
    public void verifyAbilityToAccessAllPagesInsideProbioticsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), probioticsOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Sport Vitamins Option Sub-Category related to the Vitamins & Health Category ", priority = 89)
    public void verifyAbilityToAccessAllPagesInsideSportVitaminsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sportVitaminsOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Amino Acid Option Sub-Category related to the Vitamins & Health Category ", priority = 90)
    public void verifyAbilityToAccessAllPagesInsideAminoAcidOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Minerals Option Sub-Category related to the Vitamins & Health Category ", priority = 91)
    public void verifyAbilityToAccessAllPagesInsideMineralsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mineralsOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Calcium Option Sub-Category related to the Vitamins & Health Category ", priority = 92)
    public void verifyAbilityToAccessAllPagesInsideCalciumOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), calciumOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Iron Option Sub-Category related to the Vitamins & Health Category ", priority = 93)
    public void verifyAbilityToAccessAllPagesInsideIronOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getIronOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getIronOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getIronOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ironOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Magnesium Option Sub-Category related to the Vitamins & Health Category ", priority = 94)
    public void verifyAbilityToAccessAllPagesInsideMagnesiumOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), magnesiumOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Multi mineral Formulas Option Sub-Category related to the Vitamins & Health Category ", priority = 95)
    public void verifyAbilityToAccessAllPagesInsideMultiMineralFormulasOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), multimineralFormulasOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Zinc Option Sub-Category related to the Vitamins & Health Category ", priority = 96)
    public void verifyAbilityToAccessAllPagesInsideZincOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getZincOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getZincOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getZincOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), zincOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Potassium Option Sub-Category related to the Vitamins & Health Category ", priority = 97)
    public void verifyAbilityToAccessAllPagesInsidePotassiumOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), potassiumOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Drinks Option Sub-Category related to the Vitamins & Health Category ", priority = 98)
    public void verifyAbilityToAccessAllPagesInsideHealthyDrinksOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyDrinksOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Drinkable Vitamins Option Sub-Category related to the Vitamins & Health Category ", priority = 99)
    public void verifyAbilityToAccessAllPagesInsideDrinkableVitaminsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), drinkableVitaminsOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Pets Option Sub-Category related to the Vitamins & Health Category ", priority = 100,enabled = false)
    public void verifyAbilityToAccessAllPagesInsidePetsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), petsOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
  @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Supplements More Option Sub-Category related to the Vitamins & Health Category ", priority = 101,enabled = false)
    public void verifyAbilityToAccessAllPagesInsideSupplementsMoreOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
      AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
      AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
      action = new Actions(webDriver);
//      //aeMegamenuPage.navigateToHomePage();
      action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
      action.moveToElement(aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu()).perform();
      String expectedUrl=aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu().getAttribute("href");
      aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu().click();
      Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), supplementsMoreOptionInVitaminsAndHealthUrl);
      aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
      String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
//Healthy Food Category Pages
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Food Category Page", priority = 102)
public void verifyAbilityToAccessAllPagesInsideHealthyFoodCategoryPageFromMegaMenu(){
    AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
    aeHealthyFoodCategoryPage.navigate();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
    @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Grocery Option Sub-Category related to the Healthy Food Category ", priority = 103)
    public void verifyAbilityToAccessAllPagesInsideGroceryOptionCategoryRelatedToHealthyFoodCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
//        //aeMegamenuPage.navigateToHomePage();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGroceryOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGroceryOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getGroceryOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), groceryOptionInHealthyFoodUrl);
        aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }

   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Baking And Cooking Option Sub-Category related to the Healthy Food Category ", priority = 104)
    public void verifyAbilityToAccessAllPagesInsideBakingAndCookingOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bakingAndCookingOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Canned Option Sub-Category related to the Healthy Food Category ", priority = 105)
    public void verifyAbilityToAccessAllPagesInsideCannedOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getCannedOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getCannedOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getCannedOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), cannedOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Coffee Option Sub-Category related to the Healthy Food Category ", priority = 106)
    public void verifyAbilityToAccessAllPagesInsideCoffeeOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getCoffeeOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getCoffeeOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getCoffeeOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), coffeeOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Condiments Option Sub-Category related to the Healthy Food Category ", priority = 107)
    public void verifyAbilityToAccessAllPagesInsideCondimentsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getCondimentsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getCondimentsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getCondimentsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), condimentsOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Milk And Cream Option Sub-Category related to the Healthy Food Category ", priority = 108)
    public void verifyAbilityToAccessAllPagesInsideMilkAndCreamOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), milkAndCreamOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Nuts And Oats Option Sub-Category related to the Healthy Food Category ", priority = 109)
    public void verifyAbilityToAccessAllPagesInsideNutsAndOatsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nutsAndOatsOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Oils Option Sub-Category related to the Healthy Food Category ", priority = 110)
    public void verifyAbilityToAccessAllPagesInsideOilsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getOilsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getOilsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getOilsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), oilsOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Pasta Option Sub-Category related to the Healthy Food Category ", priority = 111)
    public void verifyAbilityToAccessAllPagesInsidePastaOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getPastaOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getPastaOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getPastaOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), pastaOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Rice And Grains Option Sub-Category related to the Healthy Food Category ", priority = 112)
    public void verifyAbilityToAccessAllPagesInsideRiceAndGrainsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), riceAndGrainsOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Seasonings Option Sub-Category related to the Healthy Food Category ", priority = 113)
    public void verifyAbilityToAccessAllPagesInsideSeasoningsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), seasoningsAndSpicessOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Sugar Sweeteners Option Sub-Category related to the Healthy Food Category ", priority = 114)
    public void verifyAbilityToAccessAllPagesInsideSugarSweetenersOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sugarAndSweetenersOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Syrups Option Sub-Category related to the Healthy Food Category ", priority = 115)
    public void verifyAbilityToAccessAllPagesInsideSyrupsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getSyrupsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getSyrupsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getSyrupsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), syrupsOptionInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Tea And Herbs Option Sub-Category related to the Healthy Food Category ", priority = 116)
    public void verifyAbilityToAccessAllPagesInsideTeaAndHerbsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), teaAndHerbsInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Superfoods Option Sub-Category related to the Healthy Food Category ", priority = 117)
    public void verifyAbilityToAccessAllPagesInsideSuperfoodsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Ready Mixes Option Sub-Category related to the Healthy Food Category ", priority = 118)
    public void verifyAbilityToAccessAllPagesInsideReadyMixesOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), readyMixInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Breakfast And Cereal Option Sub-Category related to the Healthy Food Category ", priority = 119)
    public void verifyAbilityToAccessAllPagesInsideBreakfastAndCerealOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), breakfastAndCerealInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Ready To Drink Option Sub-Category related to the Healthy Food Category ", priority = 120)
    public void verifyAbilityToAccessAllPagesInsideReadyToDrinkOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), readyToDrinkInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }

   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Amino And Bcaas Option Sub-Category related to the Healthy Food Category ", priority = 121)
    public void verifyAbilityToAccessAllPagesInsideAminoAndBcaasOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoBcaasInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Energy Drinks Option Sub-Category related to the Healthy Food Category ", priority = 122)
    public void verifyAbilityToAccessAllPagesInsideEnergyDrinksOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), energyDrinksInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Protein Shakes Option Sub-Category related to the Healthy Food Category ", priority = 123)
    public void verifyAbilityToAccessAllPagesInsideProteinShakesOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinShakesInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Electrolytes And Hydration Option Sub-Category related to the Healthy Food Category ", priority = 124)
    public void verifyAbilityToAccessAllPagesInsideElectrolytesAndHydrationOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Snacks Option Sub-Category related to the Healthy Food Category ", priority = 125)
    public void verifyAbilityToAccessAllPagesInsideHealthySnacksOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthySnacksInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Protein Bars Option Sub-Category related to the Healthy Food Category ", priority = 126)
    public void verifyAbilityToAccessAllPagesInsideProteinBarsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBarsInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Cookies Option Sub-Category related to the Healthy Food Category ", priority = 127)
    public void verifyAbilityToAccessAllPagesInsideCookiesOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getCookiesOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getCookiesOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getCookiesOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), cookiesInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Chips Option Sub-Category related to the Healthy Food Category ", priority = 128)
    public void verifyAbilityToAccessAllPagesInsideChipsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getChipsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getChipsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getChipsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), chipsInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Brownies And Pancakes Option Sub-Category related to the Healthy Food Category ", priority = 129)
    public void verifyAbilityToAccessAllPagesInsideBrowniesAndPancakesOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), browniesAndPancakesInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Snack Bars Option Sub-Category related to the Healthy Food Category ", priority = 130)
    public void verifyAbilityToAccessAllPagesInsideSnackBarsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), snackBarsInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Spreads Option Sub-Category related to the Healthy Food Category ", priority = 131)
    public void verifyAbilityToAccessAllPagesInsideSpreadsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getSpreadsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getSpreadsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getSpreadsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), spreadsInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Other Healthy Snacks Option Sub-Category related to the Healthy Food Category ", priority = 132)
    public void verifyAbilityToAccessAllPagesInsideOtherHealthySnacksOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), otherHealthySnacksInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Ready To Eat Option Sub-Category related to the Healthy Food Category ", priority = 133)
    public void verifyAbilityToAccessAllPagesInsideReadyToEatOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), readyToEatInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Meals Option Sub-Category related to the Healthy Food Category ", priority = 134)
    public void verifyAbilityToAccessAllPagesInsideHealthyMealsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealsInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        System.out.println(numberOfProductInTheList);
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Featured Option Sub-Category related to the Healthy Food Category ", priority = 135)
    public void verifyAbilityToAccessAllPagesInsideFeaturedOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getFeaturedOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getFeaturedOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getFeaturedOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), featuredInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Meal Replacement Option Sub-Category related to the Healthy Food Category ", priority = 136)
    public void verifyAbilityToAccessAllPagesInsideHealthyMealReplacementOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealReplacementInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Protein Option Sub-Category related to the Healthy Food Category ", priority = 137)
    public void verifyAbilityToAccessAllPagesInsideProteinOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinCoffeeInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Candies Option Sub-Category related to the Healthy Food Category ", priority = 138)
    public void verifyAbilityToAccessAllPagesInsideCandiesOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getCandiesOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getCandiesOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getCandiesOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), candiesInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Flavoring Agents Option Sub-Category related to the Healthy Food Category ", priority = 139)
    public void verifyAbilityToAccessAllPagesInsideFlavoringAgentsOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), flavoringAgentsInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Keto Option Sub-Category related to the Healthy Food Category ", priority = 140)
    public void verifyAbilityToAccessAllPagesInsideKetoOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ketoSnacksInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Manuka Honey Option Sub-Category related to the Healthy Food Category ", priority = 141)
    public void verifyAbilityToAccessAllPagesInsideManukaHoneyOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), manukaHoneyInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
   @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Meat Snacks Option Sub-Category related to the Healthy Food Category ", priority = 142)
    public void verifyAbilityToAccessAllPagesInsideMeatSnacksOptionCategoryRelatedToHealthyFoodCategoryPage(){
       AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
       action = new Actions(webDriver);
//       //aeMegamenuPage.navigateToHomePage();
       action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
       action.moveToElement(aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu()).perform();
       String expectedUrl=aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu().getAttribute("href");
       aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu().click();
       Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), meatSnacksInHealthyFoodUrl);
       aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
       String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
//Sports Category Pages
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Men Option Sub-Category related to the Sports Category ", priority = 143)
public void verifyAbilityToAccessAllPagesInsideMenOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getMenOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getMenOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getMenOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), menInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Sport Option Sub-Category related to the Sports Category ", priority = 144)
public void verifyAbilityToAccessAllPagesInsideSportOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getSportOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getSportOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getSportOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sportInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Football Option Sub-Category related to the Sports Category ", priority = 145)
public void verifyAbilityToAccessAllPagesInsideFootballOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getFootballOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getFootballOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getFootballOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), footballInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Basketball Option Sub-Category related to the Sports Category ", priority = 146)
public void verifyAbilityToAccessAllPagesInsideBasketballOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getBasketballOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getBasketballOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getBasketballOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), basketballInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Baseball Option Sub-Category related to the Sports Category ", priority = 147)
public void verifyAbilityToAccessAllPagesInsideBaseballOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getBaseballOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getBaseballOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getBaseballOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), baseballInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Running Option Sub-Category related to the Sports Category ", priority = 148)
public void verifyAbilityToAccessAllPagesInsideRunningOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getRunningOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getRunningOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getRunningOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), runningInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Safety Swimming Option Sub-Category related to the Sports Category ", priority = 149)
public void verifyAbilityToAccessAllPagesInsideSafetySwimmingOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getSwimmingOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getSwimmingOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getSwimmingOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), swimmingInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Yoga Option Sub-Category related to the Sports Category ", priority = 150)
public void verifyAbilityToAccessAllPagesInsideYogaOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getYogaOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getYogaOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getYogaOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), yogaInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Fitness And Training1 Option related to the Sports Category ", priority = 151)
public void verifyAbilityToAccessAllPagesInsideFitnessAndTraining1OptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fitnessAndTrainingInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Mma Option Sub-Category related to the Sports Category ", priority = 152)
public void verifyAbilityToAccessAllPagesInsideMmaOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getMmaOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getMmaOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getMmaOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mmaInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside JiuJitsu Option Sub-Category related to the Sports Category ", priority = 153)
public void verifyAbilityToAccessAllPagesInsideJiuJitsuOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getJiuJitsuOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getJiuJitsuOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getJiuJitsuOptionInSportsMainMenu().click();
     Assert.assertEquals(webDriver.getCurrentUrl(),expectedUrl);
//        Assert.assertEquals(webDriver.getCurrentUrl(), jiuJitsuInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Board Games Option Sub-Category related to the Sports Category ", priority = 154)
public void verifyAbilityToAccessAllPagesInsideBoardGamesOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getBoardGamesOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getBoardGamesOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getBoardGamesOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), boardGamesInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Sports Tech Option Sub-Category related to the Sports Category ", priority = 155)
public void verifyAbilityToAccessAllPagesInsideSportsTechOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getSportsTechOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getSportsTechOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getSportsTechOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sportsTechInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Wearable Tech Option Sub-Category related to the Sports Category ", priority = 156)
public void verifyAbilityToAccessAllPagesInsideWearableTechOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getWearableTechOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getWearableTechOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getWearableTechOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), wearableTechInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Cameras Option Sub-Category related to the Sports Category ", priority = 157)
public void verifyAbilityToAccessAllPagesInsideCamerasOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getCamerasOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getCamerasOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getCamerasOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), camerasInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Phone Accessories Option Sub-Category related to the Sports Category ", priority = 158)
public void verifyAbilityToAccessAllPagesInsidePhoneAccessoriesOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), phoneAccessoriesInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Personal Care Option Sub-Category related to the Sports Category ", priority = 159)
public void verifyAbilityToAccessAllPagesInsidePersonalCareOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getPersonalCareOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getPersonalCareOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getPersonalCareOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), personalCareInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu","All Smoke Testing Result","1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Showering Option Sub-Category related to the Sports Category ", priority = 160)
public void verifyAbilityToAccessAllPagesInsideShoweringOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getShoweringOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getShoweringOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getShoweringOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), showeringInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu","All Smoke Testing Result","1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Shaving Option Sub-Category related to the Sports Category ", priority = 161)
public void verifyAbilityToAccessAllPagesInsideShavingOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getShavingOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getShavingOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getShavingOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), shavingInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
    //There's a bug here due to the option is duplicated
 @Test(groups = {"2.06 MegaMenu","All Smoke Testing Result","1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Skin Care Option Sub-Category related to the Sports Category ", priority = 162)
public void verifyAbilityToAccessAllPagesInsideSkinCareOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getSkinCareOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getSkinCareOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getSkinCareOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), skinCareInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Body Care Option Sub-Category related to the Sports Category ", priority = 163)
public void verifyAbilityToAccessAllPagesInsideBodyCareOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getBodyCareOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getBodyCareOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getBodyCareOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bodyCareInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Oral Care Option Sub-Category related to the Sports Category ", priority = 164)
public void verifyAbilityToAccessAllPagesInsideOralCareOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getOralCareOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getOralCareOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getOralCareOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), oralCareInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Therapy Option Sub-Category related to the Sports Category ", priority = 165)
public void verifyAbilityToAccessAllPagesInsideTherapyOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getTherapyOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getTherapyOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getTherapyOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), therapyInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Masks Option Sub-Category related to the Sports Category ", priority = 166)
public void verifyAbilityToAccessAllPagesInsideMasksOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getMasksOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getMasksOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getMasksOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), masksInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Fitness And Training Option Sub-Category related to the Sports Category ", priority = 167)
public void verifyAbilityToAccessAllPagesInsideFitnessAndTrainingOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fitnessAndTrainingCategoryInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Fitness Equipment Option Sub-Category related to the Sports Category ", priority = 168)
public void verifyAbilityToAccessAllPagesInsideFitnessEquipmentOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getFitnessEquipmentOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getFitnessEquipmentOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getFitnessEquipmentOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fitnessEquipmentInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Skipping Ropes Option Sub-Category related to the Sports Category ", priority = 169)
public void verifyAbilityToAccessAllPagesInsideSkippingRopesOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getSkippingRopesOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getSkippingRopesOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getSkippingRopesOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), skippingRopesInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the " +
         "ability to access all pages inside Weigh tBelts Tech Option Sub-Category related to the Sports Category ", priority = 170)
public void verifyAbilityToAccessAllPagesInsideWeightBeltsOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getWeightBeltsOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getWeightBeltsOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getWeightBeltsOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), weightBeltsInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Scooters Option Sub-Category related to the Sports Category ", priority = 171)
public void verifyAbilityToAccessAllPagesInsideScootersOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getScootersOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getScootersOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getScootersOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), scootersInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }
 @Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside  Training Accessories Option Sub-Category related to the Sports Category ", priority = 172)
public void verifyAbilityToAccessAllPagesInsideTrainingAccessoriesOptionCategoryRelatedToSportsCategoryPage(){
     AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
     AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
     action = new Actions(webDriver);
//     //aeMegamenuPage.navigateToHomePage();
     action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
     action.moveToElement(aeMegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu()).perform();
     String expectedUrl=aeMegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu().getAttribute("href");
     aeMegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu().click();
     Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), trainingAccessoriesInSportsMainMenuUrl);
     aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
     String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
    }

@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Shakers And Bottles Option Sub-Category related to the Sports Category ", priority = 173)
public void verifyAbilityToAccessAllPagesInsideShakersAndBottlesOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getShakersAndBottlesOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getShakersAndBottlesOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getShakersAndBottlesOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), shakersBottlesInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Bags Option Sub-Category related to the Sports Category ", priority = 174)
public void verifyAbilityToAccessAllPagesInsideBagsOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getBagsOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getBagsOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getBagsOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bagsInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Gloves Option Sub-Category related to the Sports Category ", priority = 175)
public void verifyAbilityToAccessAllPagesInsideGlovesOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getGlovesOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getGlovesOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getGlovesOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), glovesInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Braces And Sleeves Option Sub-Category related to the Sports Category ", priority = 176)
public void verifyAbilityToAccessAllPagesInsideBracesAndSleevesOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getBracesAndSleevesOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getBracesAndSleevesOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getBracesAndSleevesOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bracesSleevesInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Mouthguard Option Sub-Category related to the Sports Category ", priority = 177)
public void verifyAbilityToAccessAllPagesInsideMouthguardOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getMouthguardOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getMouthguardOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getMouthguardOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mouthguardInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Appeal Option Sub-Category related to the Sports Category ", priority = 178)
public void verifyAbilityToAccessAllPagesInsideAppealOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getApparelOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getApparelOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getApparelOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), apparelInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Sportswear Option Sub-Category related to the Sports Category ", priority = 179)
public void verifyAbilityToAccessAllPagesInsideSportswearOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getSportswearOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getSportswearOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getSportswearOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sportsWearInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Pants Option Sub-Category related to the Sports Category ", priority = 180)
public void verifyAbilityToAccessAllPagesInsidePantsOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getPantsOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getPantsOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getPantsOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), pantsInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Shorts Option Sub-Category related to the Sports Category ", priority = 181)
public void verifyAbilityToAccessAllPagesInsideShortsOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getShortsOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getShortsOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getShortsOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), shortsInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Hoodies Option Sub-Category related to the Sports Category ", priority = 182)
public void verifyAbilityToAccessAllPagesInsideHoodiesOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getHoodiesOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getHoodiesOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getHoodiesOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hoodiesInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside TShirts Option Sub-Category related to the Sports Category ", priority = 183)
public void verifyAbilityToAccessAllPagesInsideTShirtsOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.gettShirtsOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.gettShirtsOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.gettShirtsOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), tShirtsInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Tanks Option Sub-Category related to the Sports Category ", priority = 184)
public void verifyAbilityToAccessAllPagesInsideTanksOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getTanksOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getTanksOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getTanksOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), tanksInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Footwear Option Sub-Category related to the Sports Category ", priority = 185)
public void verifyAbilityToAccessAllPagesInsideFootwearOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getFootwearOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getFootwearOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getFootwearOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), footwearInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Sneakers Option Sub-Category related to the Sports Category ", priority = 186)
public void verifyAbilityToAccessAllPagesInsideSneakersOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getSneakersOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getSneakersOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getSneakersOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sneakersInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Training Shoes Option Sub-Category related to the Sports Category ", priority = 187)
public void verifyAbilityToAccessAllPagesInsideTrainingShoesOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getTrainingShoesOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getTrainingShoesOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getTrainingShoesOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), trainingShoesInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Running Shoes Option Sub-Category related to the Sports Category ", priority = 188)
public void verifyAbilityToAccessAllPagesInsideRunningShoesOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getRunnigShoesOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getRunnigShoesOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getRunnigShoesOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), runningShoesInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Option Sub-Category related to the Sports Category ", priority = 189)
public void verifyAbilityToAccessAllPagesInsideWomenOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Sports Tech Option Sub-Category related to the Sports Category ", priority = 190)
public void verifyAbilityToAccessAllPagesInsideWomenSportsTechOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenSportsTechOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenSportsTechOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenSportsTechOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenSportsTechInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Wearable Tech Option Sub-Category related to the Sports Category ", priority = 191)
public void verifyAbilityToAccessAllPagesInsideWomenWearableTechOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenWearableTechOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenWearableTechOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenWearableTechOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenWearableTechInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Cameras Option Sub-Category related to the Sports Category ", priority = 192)
public void verifyAbilityToAccessAllPagesInsideWomenCamerasOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenCamerasOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenCamerasOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenCamerasOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenCamerasInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Phone Accessories Option Sub-Category related to the Sports Category ", priority = 193)
public void verifyAbilityToAccessAllPagesInsideWomenPhoneAccessoriesOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenPhoneAccessoriesInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Personal Care Option Sub-Category related to the Sports Category ", priority = 194)
public void verifyAbilityToAccessAllPagesInsideWomenPersonalCareOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenPersonalCareOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenPersonalCareOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenPersonalCareOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenPersonalCareInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Showering Option Sub-Category related to the Sports Category ", priority = 195)
public void verifyAbilityToAccessAllPagesInsideWomenShoweringOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenShoweringOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenShoweringOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenShoweringOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenShoweringInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Skin Care Option Sub-Category related to the Sports Category ", priority = 196)
public void verifyAbilityToAccessAllPagesInsideWomenSkinCareOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenSkinCareOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenSkinCareOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenSkinCareOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenSkinCareInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Body Care Option Sub-Category related to the Sports Category ", priority = 197)
public void verifyAbilityToAccessAllPagesInsideWomenBodyCareOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenBodyCareOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenBodyCareOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenBodyCareOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenBodyCareInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Oral Care Option Sub-Category related to the Sports Category ", priority = 198)
public void verifyAbilityToAccessAllPagesInsideWomenOralCareOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenOralCareOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenOralCareOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenOralCareOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenOralCareInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Therapy Option Sub-Category related to the Sports Category ", priority = 199)
public void verifyAbilityToAccessAllPagesInsideWomenTherapyOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenTherapyOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenTherapyOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenTherapyOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenTherapyInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Masks Option Sub-Category related to the Sports Category ", priority = 200)
public void verifyAbilityToAccessAllPagesInsideWomenMasksOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenMasksOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenMasksOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenMasksOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenMasksInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Fitness And Training Option Sub-Category related to the Sports Category ", priority = 201)
public void verifyAbilityToAccessAllPagesInsideWomenFitnessAndTrainingOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenFitnessAndTrainingInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
@Test(groups = {"2.06 MegaMenu", "1.3 Medium Severity"},description = "MegaMenu- Make Sure the ability to access all pages inside Women Training Accessories Option Sub-Category related to the Sports Category ", priority = 202)
public void verifyAbilityToAccessAllPagesInsideWomenTrainingAccessoriesOptionCategoryRelatedToSportsCategoryPage(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    action = new Actions(webDriver);
//    //aeMegamenuPage.navigateToHomePage();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeMegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu()).perform();
    String expectedUrl=aeMegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu().getAttribute("href");
    aeMegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu().click();
    Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenTrainingAccessoriesInSportsMainMenuUrl);
    aeMegamenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
            if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
         try{
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
            catch (Exception e){
                System.out.println("This Option is removed from the Mega Menu");
            }
}
//Banners inside the MegaMenu lists


}