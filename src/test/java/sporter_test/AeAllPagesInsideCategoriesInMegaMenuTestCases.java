/**
 * @author w.jumaa
 */

package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.annotations.Test;
import sporter_pages.AEMegaMenuPage;
import sporter_pages.AeSportSupplementsCategoryPage;

public class AeAllPagesInsideCategoriesInMegaMenuTestCases  extends BaseTest {
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    private AeSportSupplementsCategoryTestCases aeSportSupplementsCategoryTestCases;
    private AEMegaMenuTestCases aeMegaMenuTestCases;
    private AEMegaMenuPage aeMegaMenuPage;
    private AeAllPagesInsideCategoriesInMegaMenuTestCases aeAllPagesInsideCategoriesInMegaMenuTestCases;

//Sport Supplements Category Pages
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Sport Supplements Category Page", priority = 1)
    public void verifyAbilityToAccessAllPagesInsideSportSupplementsCategoryPageFromMegaMenu(){
        aeSportSupplementsCategoryTestCases=new AeSportSupplementsCategoryTestCases();
        aeSportSupplementsCategoryTestCases.verifyAbilityToAccessAllPagesInsideSportSupplementsCategoryPage();
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Protein Sub-Category related to the Sport Supplements Category ", priority = 2)
    public void verifyAbilityToAccessAllPagesInsideProteinCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Whey Protein Sub-Category related to the Sport Supplements Category ", priority = 3)
    public void verifyAbilityToAccessAllPagesInsideWheyProteinCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnWheyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Whey Protein Isolate Sub-Category related to the Sport Supplements Category ", priority = 4)
    public void verifyAbilityToAccessAllPagesInsideWheyProteinIsolateCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnWheyProteinIsolateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Protein Blends Sub-Category related to the Sport Supplements Category ", priority = 5)
    public void verifyAbilityToAccessAllPagesInsideProteinBlendsCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnProteinBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Non Dairy Protein Sub-Category related to the Sport Supplements Category ", priority = 6)
    public void verifyAbilityToAccessAllPagesInsideNonDairyProteinCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnNonDairyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Casein Protein Sub-Category related to the Sport Supplements Category ", priority = 7)
    public void verifyAbilityToAccessAllPagesInsideCaseinProteinCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnCaseinProteinOptionInSportsSupplementsMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Diet Protein Sub-Category related to the Sport Supplements Category ", priority = 3)
    public void verifyAbilityToAccessAllPagesInsideDietProteinCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnDietProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Mass Gainers Sub-Category related to the Sport Supplements Category ", priority = 3)
    public void verifyAbilityToAccessAllPagesInsideMassGainersCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnMassGainersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Creatine Sub-Category related to the Sport Supplements Category ", priority = 3)
    public void verifyAbilityToAccessAllPagesInsideCreatineCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnCreatineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Creatine Monohydrate Sub-Category related to the Sport Supplements Category ", priority = 3)
    public void verifyAbilityToAccessAllPagesInsideCreatineMonohydrateCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnCreatineMonohydrateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }
    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Creatine Blends Sub-Category related to the Sport Supplements Category ", priority = 3)
    public void verifyAbilityToAccessAllPagesInsideCreatineBlendsCategoryRelatedToSportSupplementsCategoryPage(){
        aeMegaMenuTestCases=new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases.verifyClickingOnCreatineBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
    }




}
