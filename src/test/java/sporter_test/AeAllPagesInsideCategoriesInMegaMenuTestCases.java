///**
// * @author w.jumaa
// * @projectName sporter-web-automation
// * @classDescription This class contains all test cases that verifying ability to access all pages inside all categories listed in the MegaMenu
// */
//
//package sporter_test;
//
//import core.BaseTest;
//import core.DataHelperAndWait;
//import org.testng.annotations.Test;
//import sporter_pages.AeSportSupplementsCategoryPage;
//
//
//public class AeAllPagesInsideCategoriesInMegaMenuTestCases  extends BaseTest {
//    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
//    private AeSportSupplementsCategoryTestCases aeSportSupplementsCategoryTestCases;
//    private AEMegaMenuTestCases aeMegaMenuTestCases;
//    private AeHealthyFoodCategoryTestCases aeHealthyFoodCategoryTestCases;
//
////Sport Supplements Category Pages
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Sport Supplements Category Page", priority = 1)
//    public void verifyAbilityToAccessAllPagesInsideSportSupplementsCategoryPageFromMegaMenu(){
//        aeSportSupplementsCategoryTestCases=new AeSportSupplementsCategoryTestCases();
//        aeSportSupplementsCategoryTestCases.verifyAbilityToAccessAllPagesInsideSportSupplementsCategoryPage();
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Protein Sub-Category related to the Sport Supplements Category ", priority = 2)
//    public void verifyAbilityToAccessAllPagesInsideProteinCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Whey Protein Sub-Category related to the Sport Supplements Category ", priority = 3)
//    public void verifyAbilityToAccessAllPagesInsideWheyProteinCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnWheyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Whey Protein Isolate Sub-Category related to the Sport Supplements Category ", priority = 4)
//    public void verifyAbilityToAccessAllPagesInsideWheyProteinIsolateCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnWheyProteinIsolateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Protein Blends Sub-Category related to the Sport Supplements Category ", priority = 5)
//    public void verifyAbilityToAccessAllPagesInsideProteinBlendsCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnProteinBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Non Dairy Protein Sub-Category related to the Sport Supplements Category ", priority = 6)
//    public void verifyAbilityToAccessAllPagesInsideNonDairyProteinCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnNonDairyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Casein Protein Sub-Category related to the Sport Supplements Category ", priority = 7)
//    public void verifyAbilityToAccessAllPagesInsideCaseinProteinCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCaseinProteinOptionInSportsSupplementsMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Diet Protein Sub-Category related to the Sport Supplements Category ", priority = 8)
//    public void verifyAbilityToAccessAllPagesInsideDietProteinCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnDietProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Mass Gainers Sub-Category related to the Sport Supplements Category ", priority = 9)
//    public void verifyAbilityToAccessAllPagesInsideMassGainersCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMassGainersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Creatine Sub-Category related to the Sport Supplements Category ", priority = 10)
//    public void verifyAbilityToAccessAllPagesInsideCreatineCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCreatineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Creatine Monohydrate Sub-Category related to the Sport Supplements Category ", priority = 11)
//    public void verifyAbilityToAccessAllPagesInsideCreatineMonohydrateCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCreatineMonohydrateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Creatine Blends Sub-Category related to the Sport Supplements Category ", priority = 12)
//    public void verifyAbilityToAccessAllPagesInsideCreatineBlendsCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCreatineBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Amino Acids Sub-Category related to the Sport Supplements Category ", priority = 13)
//    public void verifyAbilityToAccessAllPagesInsideAminoAcidsCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnAminoAcidsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside BCAA Sub-Category related to the Sport Supplements Category ", priority = 14)
//    public void verifyAbilityToAccessAllPagesInsideBCAACategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnBCAAOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside EAA Sub-Category related to the Sport Supplements Category ", priority = 15)
//    public void verifyAbilityToAccessAllPagesInsideEAACategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnEAAOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Arginine Sub-Category related to the Sport Supplements Category ", priority = 16)
//    public void verifyAbilityToAccessAllPagesInsideArginineCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnArginineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Beta Alanine Sub-Category related to the Sport Supplements Category ", priority = 17)
//    public void verifyAbilityToAccessAllPagesInsideBetaAlanineCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnBetaAlanineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside HMb Sub-Category related to the Sport Supplements Category ", priority = 18)
//    public void verifyAbilityToAccessAllPagesInsideHMbCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnHMbOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Amino Acid Powders Sub-Category related to the Sport Supplements Category ", priority = 19)
//    public void verifyAbilityToAccessAllPagesInsideAminoAcidPowdersCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnAminoAcidPowdersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Amino Acid Pills Sub-Category related to the Sport Supplements Category ", priority = 20)
//    public void verifyAbilityToAccessAllPagesInsideAminoAcidPillsCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnAminoAcidPillsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Citrulline Sub-Category related to the Sport Supplements Category ", priority = 21)
//    public void verifyAbilityToAccessAllPagesInsideCitrullineCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCitrullineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Amino Acid Liquids Sub-Category related to the Sport Supplements Category ", priority = 22)
//    public void verifyAbilityToAccessAllPagesInsideAminoAcidLiquidsCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnAminoAcidLiquidsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Muscle Boosters Sub-Category related to the Sport Supplements Category ", priority = 23)
//    public void verifyAbilityToAccessAllPagesInsideMuscleBoostersCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMuscleBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Testosterone Boosters Sub-Category related to the Sport Supplements Category ", priority = 24)
//    public void verifyAbilityToAccessAllPagesInsideTestosteroneBoostersCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnTestosteroneBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Gh Booster Sub-Category related to the Sport Supplements Category ", priority = 25)
//    public void verifyAbilityToAccessAllPagesInsideGhBoosterCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnGhBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Weight Management Sub-Category related to the Sport Supplements Category ", priority = 26)
//    public void verifyAbilityToAccessAllPagesInsideWeightManagementCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnWeightManagementOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Stimulant Weight Loss Sub-Category related to the Sport Supplements Category ", priority = 27)
//    public void verifyAbilityToAccessAllPagesInsideStimulantWeightLossCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnStimulantWeightLossOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Non Stimulant Weight Loss Sub-Category related to the Sport Supplements Category ", priority = 28)
//    public void verifyAbilityToAccessAllPagesInsideNonStimulantWeightLossCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnNonStimulantWeightLossOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Meal Replacements Sub-Category related to the Sport Supplements Category ", priority = 29)
//    public void verifyAbilityToAccessAllPagesInsideMealReplacementsCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMealReplacementsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Metabolism Support Sub-Category related to the Sport Supplements Category ", priority = 30)
//    public void verifyAbilityToAccessAllPagesInsideMetabolismSupportCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMetabolismSupportOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Toning Creams Sub-Category related to the Sport Supplements Category ", priority = 31)
//    public void verifyAbilityToAccessAllPagesInsideToningCreamsCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnToningCreamsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Mct Sub-Category related to the Sport Supplements Category ", priority = 32)
//    public void verifyAbilityToAccessAllPagesInsideMctCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMctOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Recovery Sub-Category related to the Sport Supplements Category ", priority = 33)
//    public void verifyAbilityToAccessAllPagesInsideRecoveryCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnRecoveryOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Glutamine Sub-Category related to the Sport Supplements Category ", priority = 34)
//    public void verifyAbilityToAccessAllPagesInsideGlutamineCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnGlutamineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Recovery Blend Sub-Category related to the Sport Supplements Category ", priority = 35)
//    public void verifyAbilityToAccessAllPagesInsideRecoveryBlendCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnRecoveryBlendOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Electrolytes And Hydration Sub-Category related to the Sport Supplements Category ", priority = 36)
//    public void verifyAbilityToAccessAllPagesInsideElectrolytesAndHydrationCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnElectrolytesAndHydrationOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Carbohydrates Sub-Category related to the Sport Supplements Category ", priority = 37)
//    public void verifyAbilityToAccessAllPagesInsideCarbohydratesCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCarbohydratesOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Carbohydrate Powders Sub-Category related to the Sport Supplements Category ", priority = 38)
//    public void verifyAbilityToAccessAllPagesInsideCarbohydratePowdersCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCarbohydratePowdersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Energy And Endurance Sub-Category related to the Sport Supplements Category ", priority = 39)
//    public void verifyAbilityToAccessAllPagesInsideEnergyAndEnduranceCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnEnergyAndEnduranceOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Stimulant Energy Sub-Category related to the Sport Supplements Category ", priority = 40)
//    public void verifyAbilityToAccessAllPagesInsideStimulantEnergyCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnStimulantEnergyOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Non Stimulant Energy Sub-Category related to the Sport Supplements Category ", priority = 41)
//    public void verifyAbilityToAccessAllPagesInsideNonStimulantEnergyCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnNonStimulantEnergyOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Gaming And Focus Sub-Category related to the Sport Supplements Category ", priority = 42)
//    public void verifyAbilityToAccessAllPagesInsideGamingAndFocusCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnGamingAndFocusOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Gaming Essentials Sub-Category related to the Sport Supplements Category ", priority = 43)
//    public void verifyAbilityToAccessAllPagesInsideGamingEssentialsCategoryRelatedToSportSupplementsCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnGamingEssentialsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //Vitamins & Health Category Pages
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Featured Sub-Category related to the Vitamins & Health Category ", priority = 44)
//    public void verifyAbilityToAccessAllPagesInsideFeaturedCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnFeaturedOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Best Sellers Sub-Category related to the Vitamins & Health Category ", priority = 45)
//    public void verifyAbilityToAccessAllPagesInsideBestSellersCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnAliveVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Sexual Health Sub-Category related to the Vitamins & Health Category ", priority = 46)
//    public void verifyAbilityToAccessAllPagesInsideSexualHealthCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSexualHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Essential Vitamins Sub-Category related to the Vitamins & Health Category ", priority = 47)
//    public void verifyAbilityToAccessAllPagesInsideEssentialVitaminsCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnEssentialVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Folic Acid Sub-Category related to the Vitamins & Health Category ", priority = 48)
//    public void verifyAbilityToAccessAllPagesInsideFolicAcidCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnFolicAcidOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin A Sub-Category related to the Vitamins & Health Category ", priority = 49)
//    public void verifyAbilityToAccessAllPagesInsideVitaminACategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnVitaminAOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin B Sub-Category related to the Vitamins & Health Category ", priority = 50)
//    public void verifyAbilityToAccessAllPagesInsideVitaminBCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnVitaminBOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin C Sub-Category related to the Vitamins & Health Category ", priority = 51)
//    public void verifyAbilityToAccessAllPagesInsideVitaminCCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnVitaminCOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin D Sub-Category related to the Vitamins & Health Category ", priority = 52)
//    public void verifyAbilityToAccessAllPagesInsideVitaminDCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnVitaminDOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin E Sub-Category related to the Vitamins & Health Category ", priority = 53)
//    public void verifyAbilityToAccessAllPagesInsideVitaminECategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnVitaminEOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Vitamin K Sub-Category related to the Vitamins & Health Category ", priority = 54)
//    public void verifyAbilityToAccessAllPagesInsideVitaminKCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnVitaminKOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Multi Vitamins Sub-Category related to the Vitamins & Health Category ", priority = 55)
//    public void verifyAbilityToAccessAllPagesInsideMultiVitaminsCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMultiVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Vitamins For Kids Sub-Category related to the Vitamins & Health Category ", priority = 56)
//    public void verifyAbilityToAccessAllPagesInsideVitaminsForKidsCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnVitaminsForKidsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Vitamins For Men Sub-Category related to the Vitamins & Health Category ", priority = 57)
//    public void verifyAbilityToAccessAllPagesInsideVitaminsForMenCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnVitaminsForMenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Vitamins For Women Sub-Category related to the Vitamins & Health Category ", priority = 58)
//    public void verifyAbilityToAccessAllPagesInsideVitaminsForWomenCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnVitaminsForWomenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Bone And Joint Sub-Category related to the Vitamins & Health Category ", priority = 59)
//    public void verifyAbilityToAccessAllPagesInsideBoneAndJointCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnBoneAndJointOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Bone Health Sub-Category related to the Vitamins & Health Category ", priority = 60)
//    public void verifyAbilityToAccessAllPagesInsideBoneHealthCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnBoneHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Joint Health Sub-Category related to the Vitamins & Health Category ", priority = 61)
//    public void verifyAbilityToAccessAllPagesInsideJointHealthCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnJointHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Beauty Sub-Category related to the Vitamins & Health Category ", priority = 62)
//    public void verifyAbilityToAccessAllPagesInsideBeautyCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnBeautyOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Collagen Sub-Category related to the Vitamins & Health Category ", priority = 63)
//    public void verifyAbilityToAccessAllPagesInsideCollagenCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCollagenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Hair Skin And Nails Sub-Category related to the Vitamins & Health Category ", priority = 64)
//    public void verifyAbilityToAccessAllPagesInsideHairSkinAndNailsCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnHairSkinAndNailsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Fish Oil Omegas Sub-Category related to the Vitamins & Health Category ", priority = 65)
//    public void verifyAbilityToAccessAllPagesInsideFishOilOmegasCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnFishOilOmegasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Fish Oil Sub-Category related to the Vitamins & Health Category ", priority = 66)
//    public void verifyAbilityToAccessAllPagesInsideFishOilCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnFishOilOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Omega369 Sub-Category related to the Vitamins & Health Category ", priority = 67)
//    public void verifyAbilityToAccessAllPagesInsideOmega369CategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnOmega369OptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Health Life style Sub-Category related to the Vitamins & Health Category ", priority = 68)
//    public void verifyAbilityToAccessAllPagesInsideHealthLifestyleCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnHealthLifestyleOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Antioxidants Sub-Category related to the Vitamins & Health Category ", priority = 69)
//    public void verifyAbilityToAccessAllPagesInsideAntioxidantsCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnAntioxidantsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Blood Sugar Support Sub-Category related to the Vitamins & Health Category ", priority = 70)
//    public void verifyAbilityToAccessAllPagesInsideBloodSugarSupportCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnBloodSugarSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Brain Support Sub-Category related to the Vitamins & Health Category ", priority = 71)
//    public void verifyAbilityToAccessAllPagesInsideBrainSupportCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnBrainSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Detox And Cleans Sub-Category related to the Vitamins & Health Category ", priority = 72)
//    public void verifyAbilityToAccessAllPagesInsideDetoxAndCleansCategoryCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnDetoxAndCleanseOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Energy Formulas Sub-Category related to the Vitamins & Health Category ", priority = 74)
//    public void verifyAbilityToAccessAllPagesInsideEnergyFormulasCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnEnergyFormulasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Eye Health Sub-Category related to the Vitamins & Health Category ", priority = 75)
//    public void verifyAbilityToAccessAllPagesInsideEyeHealthCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnEyeHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Herbs Option Sub-Category related to the Vitamins & Health Category ", priority = 76)
//    public void verifyAbilityToAccessAllPagesInsideHerbsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnHerbsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Hormones Balance Option Sub-Category related to the Vitamins & Health Category ", priority = 77)
//    public void verifyAbilityToAccessAllPagesInsideHormonesBalanceOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnHormonesBalanceOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Immune Support Option Sub-Category related to the Vitamins & Health Category ", priority = 78)
//    public void verifyAbilityToAccessAllPagesInsideImmuneSupportOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnImmuneSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Mens Health Option Sub-Category related to the Vitamins & Health Category ", priority = 79)
//    public void verifyAbilityToAccessAllPagesInsideMensHealthOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMensHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Stress Relief Option Sub-Category related to the Vitamins & Health Category ", priority = 80)
//    public void verifyAbilityToAccessAllPagesInsideStressReliefOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnStressReliefOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Sleep Support Option Sub-Category related to the Vitamins & Health Category ", priority = 81)
//    public void verifyAbilityToAccessAllPagesInsideSleepSupportOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSleepSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Super Foods Option Sub-Category related to the Vitamins & Health Category ", priority = 82)
//    public void verifyAbilityToAccessAllPagesInsideSuperFoodsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSuperFoodsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Urinary Tract Support Option Sub-Category related to the Vitamins & Health Category ", priority = 83)
//    public void verifyAbilityToAccessAllPagesInsideUrinaryTractSupportOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnUrinaryTractSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Weight Management Option Sub-Category related to the Vitamins & Health Category ", priority = 84)
//    public void verifyAbilityToAccessAllPagesInsideWeightManagementSupportOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnWeightManagementOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Womens Health  Option Sub-Category related to the Vitamins & Health Category ", priority = 85)
//    public void verifyAbilityToAccessAllPagesInsideWomensHealthOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnWomensHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Digestion Option Sub-Category related to the Vitamins & Health Category ", priority = 86)
//    public void verifyAbilityToAccessAllPagesInsideDigestionOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnDigestionOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Digestion Support Option Sub-Category related to the Vitamins & Health Category ", priority = 87)
//    public void verifyAbilityToAccessAllPagesInsideDigestionSupportOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnDigestionSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Probiotics Option Sub-Category related to the Vitamins & Health Category ", priority = 88)
//    public void verifyAbilityToAccessAllPagesInsideProbioticsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnProbioticsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Sport Vitamins Option Sub-Category related to the Vitamins & Health Category ", priority = 89)
//    public void verifyAbilityToAccessAllPagesInsideSportVitaminsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSportVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Amino Acid Option Sub-Category related to the Vitamins & Health Category ", priority = 90)
//    public void verifyAbilityToAccessAllPagesInsideAminoAcidOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnAminoAcidOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Minerals Option Sub-Category related to the Vitamins & Health Category ", priority = 91)
//    public void verifyAbilityToAccessAllPagesInsideMineralsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMineralsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Calcium Option Sub-Category related to the Vitamins & Health Category ", priority = 92)
//    public void verifyAbilityToAccessAllPagesInsideCalciumOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCalciumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Iron Option Sub-Category related to the Vitamins & Health Category ", priority = 93)
//    public void verifyAbilityToAccessAllPagesInsideIronOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnIronOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Magnesium Option Sub-Category related to the Vitamins & Health Category ", priority = 94)
//    public void verifyAbilityToAccessAllPagesInsideMagnesiumOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMagnesiumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Multi mineral Formulas Option Sub-Category related to the Vitamins & Health Category ", priority = 95)
//    public void verifyAbilityToAccessAllPagesInsideMultiMineralFormulasOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMultimineralFormulasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Zinc Option Sub-Category related to the Vitamins & Health Category ", priority = 96)
//    public void verifyAbilityToAccessAllPagesInsideZincOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnZincOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Potassium Option Sub-Category related to the Vitamins & Health Category ", priority = 97)
//    public void verifyAbilityToAccessAllPagesInsidePotassiumOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnPotassiumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Drinks Option Sub-Category related to the Vitamins & Health Category ", priority = 98)
//    public void verifyAbilityToAccessAllPagesInsideHealthyDrinksOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnHealthyDrinksOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Drinkable Vitamins Option Sub-Category related to the Vitamins & Health Category ", priority = 99)
//    public void verifyAbilityToAccessAllPagesInsideDrinkableVitaminsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnDrinkableVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Pets Option Sub-Category related to the Vitamins & Health Category ", priority = 100)
//    public void verifyAbilityToAccessAllPagesInsidePetsOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnPetsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//  @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Supplements More Option Sub-Category related to the Vitamins & Health Category ", priority = 101)
//    public void verifyAbilityToAccessAllPagesInsideSupplementsMoreOptionCategoryRelatedTVitaminsAndHealthCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSupplementsMoreOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
////Healthy Food Category Pages
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Food Category Page", priority = 102)
//public void verifyAbilityToAccessAllPagesInsideHealthyFoodCategoryPageFromMegaMenu(){
//    aeHealthyFoodCategoryTestCases=new AeHealthyFoodCategoryTestCases();
//    aeHealthyFoodCategoryTestCases.verifyAbilityToAccessAllPagesInsideHealthyFoodCategoryPage();
//}
//    @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Grocery Option Sub-Category related to the Healthy Food Category ", priority = 103)
//    public void verifyAbilityToAccessAllPagesInsideGroceryOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnGroceryOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Baking And Cooking Option Sub-Category related to the Healthy Food Category ", priority = 104)
//    public void verifyAbilityToAccessAllPagesInsideBakingAndCookingOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnBakingAndCookingOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Canned Option Sub-Category related to the Healthy Food Category ", priority = 105)
//    public void verifyAbilityToAccessAllPagesInsideCannedOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCannedOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Coffee Option Sub-Category related to the Healthy Food Category ", priority = 106)
//    public void verifyAbilityToAccessAllPagesInsideCoffeeOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCoffeeOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Condiments Option Sub-Category related to the Healthy Food Category ", priority = 107)
//    public void verifyAbilityToAccessAllPagesInsideCondimentsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCondimentsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Milk And Cream Option Sub-Category related to the Healthy Food Category ", priority = 108)
//    public void verifyAbilityToAccessAllPagesInsideMilkAndCreamOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMilkAndCreamOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Nuts And Oats Option Sub-Category related to the Healthy Food Category ", priority = 109)
//    public void verifyAbilityToAccessAllPagesInsideNutsAndOatsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnNutsAndOatsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Oils Option Sub-Category related to the Healthy Food Category ", priority = 110)
//    public void verifyAbilityToAccessAllPagesInsideOilsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnOilsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Pasta Option Sub-Category related to the Healthy Food Category ", priority = 111)
//    public void verifyAbilityToAccessAllPagesInsidePastaOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnPastaOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Rice And Grains Option Sub-Category related to the Healthy Food Category ", priority = 112)
//    public void verifyAbilityToAccessAllPagesInsideRiceAndGrainsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnRiceAndGrainsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Seasonings Option Sub-Category related to the Healthy Food Category ", priority = 113)
//    public void verifyAbilityToAccessAllPagesInsideSeasoningsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSeasoningsAndSpicesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Sugar Sweeteners Option Sub-Category related to the Healthy Food Category ", priority = 114)
//    public void verifyAbilityToAccessAllPagesInsideSugarSweetenersOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSugarSweetenersOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Syrups Option Sub-Category related to the Healthy Food Category ", priority = 115)
//    public void verifyAbilityToAccessAllPagesInsideSyrupsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSyrupsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Tea And Herbs Option Sub-Category related to the Healthy Food Category ", priority = 116)
//    public void verifyAbilityToAccessAllPagesInsideTeaAndHerbsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnTeaAndHerbsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Superfoods Option Sub-Category related to the Healthy Food Category ", priority = 117)
//    public void verifyAbilityToAccessAllPagesInsideSuperfoodsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSuperfoodsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Ready Mixes Option Sub-Category related to the Healthy Food Category ", priority = 118)
//    public void verifyAbilityToAccessAllPagesInsideReadyMixesOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnReadyMixesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Breakfast And Cereal Option Sub-Category related to the Healthy Food Category ", priority = 119)
//    public void verifyAbilityToAccessAllPagesInsideBreakfastAndCerealOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnBreakfastAndCerealOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Ready To Drink Option Sub-Category related to the Healthy Food Category ", priority = 120)
//    public void verifyAbilityToAccessAllPagesInsideReadyToDrinkOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnReadyToDrinkOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Amino And Bcaas Option Sub-Category related to the Healthy Food Category ", priority = 121)
//    public void verifyAbilityToAccessAllPagesInsideAminoAndBcaasOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnAminoAndBcaasOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Energy Drinks Option Sub-Category related to the Healthy Food Category ", priority = 122)
//    public void verifyAbilityToAccessAllPagesInsideEnergyDrinksOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnEnergyDrinksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Protein Shakes Option Sub-Category related to the Healthy Food Category ", priority = 123)
//    public void verifyAbilityToAccessAllPagesInsideProteinShakesOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnProteinShakesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Electrolytes And Hydration Option Sub-Category related to the Healthy Food Category ", priority = 124)
//    public void verifyAbilityToAccessAllPagesInsideElectrolytesAndHydrationOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnElectrolytesAndHydrationOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Snacks Option Sub-Category related to the Healthy Food Category ", priority = 125)
//    public void verifyAbilityToAccessAllPagesInsideHealthySnacksOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnHealthySnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Protein Bars Option Sub-Category related to the Healthy Food Category ", priority = 126)
//    public void verifyAbilityToAccessAllPagesInsideProteinBarsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnProteinBarsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Cookies Option Sub-Category related to the Healthy Food Category ", priority = 127)
//    public void verifyAbilityToAccessAllPagesInsideCookiesOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCookiesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Chips Option Sub-Category related to the Healthy Food Category ", priority = 128)
//    public void verifyAbilityToAccessAllPagesInsideChipsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnChipsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Brownies And Pancakes Option Sub-Category related to the Healthy Food Category ", priority = 129)
//    public void verifyAbilityToAccessAllPagesInsideBrowniesAndPancakesOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnBrowniesAndPancakesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Snack Bars Option Sub-Category related to the Healthy Food Category ", priority = 130)
//    public void verifyAbilityToAccessAllPagesInsideSnackBarsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSnackBarsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Spreads Option Sub-Category related to the Healthy Food Category ", priority = 131)
//    public void verifyAbilityToAccessAllPagesInsideSpreadsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnSpreadsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Other Healthy Snacks Option Sub-Category related to the Healthy Food Category ", priority = 132)
//    public void verifyAbilityToAccessAllPagesInsideOtherHealthySnacksOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnOtherHealthySnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Ready To Eat Option Sub-Category related to the Healthy Food Category ", priority = 133)
//    public void verifyAbilityToAccessAllPagesInsideReadyToEatOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnReadyToEatOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Meals Option Sub-Category related to the Healthy Food Category ", priority = 134)
//    public void verifyAbilityToAccessAllPagesInsideHealthyMealsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnHealthyMealsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        System.out.println(numberOfProductInTheList);
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Featured Option Sub-Category related to the Healthy Food Category ", priority = 135)
//    public void verifyAbilityToAccessAllPagesInsideFeaturedOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnFeaturedOptionInHealthyFoodMianMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Healthy Meal Replacement Option Sub-Category related to the Healthy Food Category ", priority = 136)
//    public void verifyAbilityToAccessAllPagesInsideHealthyMealReplacementOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnHealthyMealReplacementOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Protein Option Sub-Category related to the Healthy Food Category ", priority = 137)
//    public void verifyAbilityToAccessAllPagesInsideProteinOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnProteinCoffeeOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Candies Option Sub-Category related to the Healthy Food Category ", priority = 138)
//    public void verifyAbilityToAccessAllPagesInsideCandiesOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnCandiesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Flavoring Agents Option Sub-Category related to the Healthy Food Category ", priority = 139)
//    public void verifyAbilityToAccessAllPagesInsideFlavoringAgentsOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnFlavoringAgentsOptionOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Keto Option Sub-Category related to the Healthy Food Category ", priority = 140)
//    public void verifyAbilityToAccessAllPagesInsideKetoOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnKetoSnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Manuka Honey Option Sub-Category related to the Healthy Food Category ", priority = 141)
//    public void verifyAbilityToAccessAllPagesInsideManukaHoneyOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnManukaHoneyOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//   @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Meat Snacks Option Sub-Category related to the Healthy Food Category ", priority = 142)
//    public void verifyAbilityToAccessAllPagesInsideMeatSnacksOptionCategoryRelatedToHealthyFoodCategoryPage(){
//        aeMegaMenuTestCases=new AEMegaMenuTestCases();
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuTestCases.verifyClickingOnMeatSnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
////Sports Category Pages
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Men Option Sub-Category related to the Sports Category ", priority = 143)
//public void verifyAbilityToAccessAllPagesInsideMenOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnMenOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Sport Option Sub-Category related to the Sports Category ", priority = 144)
//public void verifyAbilityToAccessAllPagesInsideSportOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnSportOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Football Option Sub-Category related to the Sports Category ", priority = 145)
//public void verifyAbilityToAccessAllPagesInsideFootballOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnFootballOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Basketball Option Sub-Category related to the Sports Category ", priority = 146)
//public void verifyAbilityToAccessAllPagesInsideBasketballOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnBasketballOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Baseball Option Sub-Category related to the Sports Category ", priority = 147)
//public void verifyAbilityToAccessAllPagesInsideBaseballOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnBaseballOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Running Option Sub-Category related to the Sports Category ", priority = 148)
//public void verifyAbilityToAccessAllPagesInsideRunningOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnRunningOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Safety Swimming Option Sub-Category related to the Sports Category ", priority = 149)
//public void verifyAbilityToAccessAllPagesInsideSafetySwimmingOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnSwimmingOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Yoga Option Sub-Category related to the Sports Category ", priority = 150)
//public void verifyAbilityToAccessAllPagesInsideYogaOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnYogaOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Fitness And Training1 Option related to the Sports Category ", priority = 151)
//public void verifyAbilityToAccessAllPagesInsideFitnessAndTraining1OptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnFitnessAndTrainingOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Mma Option Sub-Category related to the Sports Category ", priority = 152)
//public void verifyAbilityToAccessAllPagesInsideMmaOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnMmaOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside JiuJitsu Option Sub-Category related to the Sports Category ", priority = 153)
//public void verifyAbilityToAccessAllPagesInsideJiuJitsuOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnJiuJitsuOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Board Games Option Sub-Category related to the Sports Category ", priority = 154)
//public void verifyAbilityToAccessAllPagesInsideBoardGamesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnBoardGamesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Sports Tech Option Sub-Category related to the Sports Category ", priority = 155)
//public void verifyAbilityToAccessAllPagesInsideSportsTechOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnSportsTechOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Wearable Tech Option Sub-Category related to the Sports Category ", priority = 156)
//public void verifyAbilityToAccessAllPagesInsideWearableTechOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWearableTechOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Cameras Option Sub-Category related to the Sports Category ", priority = 157)
//public void verifyAbilityToAccessAllPagesInsideCamerasOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnCamerasOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Phone Accessories Option Sub-Category related to the Sports Category ", priority = 158)
//public void verifyAbilityToAccessAllPagesInsidePhoneAccessoriesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnPhoneAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Personal Care Option Sub-Category related to the Sports Category ", priority = 159)
//public void verifyAbilityToAccessAllPagesInsidePersonalCareOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnPersonalCareOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Showering Option Sub-Category related to the Sports Category ", priority = 160)
//public void verifyAbilityToAccessAllPagesInsideShoweringOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnShoweringOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Shaving Option Sub-Category related to the Sports Category ", priority = 161)
//public void verifyAbilityToAccessAllPagesInsideShavingOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnShavingOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here due to the option is duplicated
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Skin Care Option Sub-Category related to the Sports Category ", priority = 162)
//public void verifyAbilityToAccessAllPagesInsideSkinCareOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnSkinCareOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Body Care Option Sub-Category related to the Sports Category ", priority = 163)
//public void verifyAbilityToAccessAllPagesInsideBodyCareOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnBodyCareOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Oral Care Option Sub-Category related to the Sports Category ", priority = 164)
//public void verifyAbilityToAccessAllPagesInsideOralCareOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnOralCareOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Therapy Option Sub-Category related to the Sports Category ", priority = 165)
//public void verifyAbilityToAccessAllPagesInsideTherapyOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnTherapyOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Masks Option Sub-Category related to the Sports Category ", priority = 166)
//public void verifyAbilityToAccessAllPagesInsideMasksOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnMasksOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Fitness And Training Option Sub-Category related to the Sports Category ", priority = 167)
//public void verifyAbilityToAccessAllPagesInsideFitnessAndTrainingOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnFitnessAndTrainingCategoryOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Fitness Equipment Option Sub-Category related to the Sports Category ", priority = 168)
//public void verifyAbilityToAccessAllPagesInsideFitnessEquipmentOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnFitnessEquipmentOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Skipping Ropes Option Sub-Category related to the Sports Category ", priority = 169)
//public void verifyAbilityToAccessAllPagesInsideSkippingRopesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnSkippingRopesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the " +
//         "ability to access all pages inside Weigh tBelts Tech Option Sub-Category related to the Sports Category ", priority = 170)
//public void verifyAbilityToAccessAllPagesInsideWeightBeltsOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWeightBeltsOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside Scooters Option Sub-Category related to the Sports Category ", priority = 171)
//public void verifyAbilityToAccessAllPagesInsideScootersOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnScootersOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
// @Test(description = "MegaMenu- Make Sure the ability to access all pages inside  Training Accessories Option Sub-Category related to the Sports Category ", priority = 172)
//public void verifyAbilityToAccessAllPagesInsideTrainingAccessoriesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnTrainingAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Shakers And Bottles Option Sub-Category related to the Sports Category ", priority = 173)
//public void verifyAbilityToAccessAllPagesInsideShakersAndBottlesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnShakersAndBottlesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Bags Option Sub-Category related to the Sports Category ", priority = 174)
//public void verifyAbilityToAccessAllPagesInsideBagsOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnBagsOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Gloves Option Sub-Category related to the Sports Category ", priority = 175)
//public void verifyAbilityToAccessAllPagesInsideGlovesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnGlovesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Braces And Sleeves Option Sub-Category related to the Sports Category ", priority = 176)
//public void verifyAbilityToAccessAllPagesInsideBracesAndSleevesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnBracesAndSleevesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Mouthguard Option Sub-Category related to the Sports Category ", priority = 177)
//public void verifyAbilityToAccessAllPagesInsideMouthguardOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnMouthguardOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Appeal Option Sub-Category related to the Sports Category ", priority = 178)
//public void verifyAbilityToAccessAllPagesInsideAppealOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnApparelOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Sportswear Option Sub-Category related to the Sports Category ", priority = 179)
//public void verifyAbilityToAccessAllPagesInsideSportswearOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnSportswearOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Pants Option Sub-Category related to the Sports Category ", priority = 180)
//public void verifyAbilityToAccessAllPagesInsidePantsOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnPantsOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Shorts Option Sub-Category related to the Sports Category ", priority = 181)
//public void verifyAbilityToAccessAllPagesInsideShortsOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnShortsOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Hoodies Option Sub-Category related to the Sports Category ", priority = 182)
//public void verifyAbilityToAccessAllPagesInsideHoodiesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnHoodiesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside TShirts Option Sub-Category related to the Sports Category ", priority = 183)
//public void verifyAbilityToAccessAllPagesInsideTShirtsOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnTShirtsOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Tanks Option Sub-Category related to the Sports Category ", priority = 184)
//public void verifyAbilityToAccessAllPagesInsideTanksOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnTanksOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Footwear Option Sub-Category related to the Sports Category ", priority = 185)
//public void verifyAbilityToAccessAllPagesInsideFootwearOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnFootwearOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Sneakers Option Sub-Category related to the Sports Category ", priority = 186)
//public void verifyAbilityToAccessAllPagesInsideSneakersOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnSneakersOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Training Shoes Option Sub-Category related to the Sports Category ", priority = 187)
//public void verifyAbilityToAccessAllPagesInsideTrainingShoesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnTrainingShoesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Running Shoes Option Sub-Category related to the Sports Category ", priority = 188)
//public void verifyAbilityToAccessAllPagesInsideRunningShoesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnRunningShoesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Option Sub-Category related to the Sports Category ", priority = 189)
//public void verifyAbilityToAccessAllPagesInsideWomenOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Sports Tech Option Sub-Category related to the Sports Category ", priority = 190)
//public void verifyAbilityToAccessAllPagesInsideWomenSportsTechOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenSportsTechOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Wearable Tech Option Sub-Category related to the Sports Category ", priority = 191)
//public void verifyAbilityToAccessAllPagesInsideWomenWearableTechOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenWearableTechOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Cameras Option Sub-Category related to the Sports Category ", priority = 192)
//public void verifyAbilityToAccessAllPagesInsideWomenCamerasOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenCamerasOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Phone Accessories Option Sub-Category related to the Sports Category ", priority = 193)
//public void verifyAbilityToAccessAllPagesInsideWomenPhoneAccessoriesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenPhoneAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Personal Care Option Sub-Category related to the Sports Category ", priority = 194)
//public void verifyAbilityToAccessAllPagesInsideWomenPersonalCareOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenPersonalCareOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Showering Option Sub-Category related to the Sports Category ", priority = 195)
//public void verifyAbilityToAccessAllPagesInsideWomenShoweringOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenShoweringOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Skin Care Option Sub-Category related to the Sports Category ", priority = 196)
//public void verifyAbilityToAccessAllPagesInsideWomenSkinCareOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenSkinCareOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Body Care Option Sub-Category related to the Sports Category ", priority = 197)
//public void verifyAbilityToAccessAllPagesInsideWomenBodyCareOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenBodyCareOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Oral Care Option Sub-Category related to the Sports Category ", priority = 198)
//public void verifyAbilityToAccessAllPagesInsideWomenOralCareOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenOralCareOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Therapy Option Sub-Category related to the Sports Category ", priority = 199)
//public void verifyAbilityToAccessAllPagesInsideWomenTherapyOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenTherapyOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Masks Option Sub-Category related to the Sports Category ", priority = 200)
//public void verifyAbilityToAccessAllPagesInsideWomenMasksOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenMasksOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Fitness And Training Option Sub-Category related to the Sports Category ", priority = 201)
//public void verifyAbilityToAccessAllPagesInsideWomenFitnessAndTrainingOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenFitnessAndTrainingOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
//@Test(description = "MegaMenu- Make Sure the ability to access all pages inside Women Training Accessories Option Sub-Category related to the Sports Category ", priority = 202)
//public void verifyAbilityToAccessAllPagesInsideWomenTrainingAccessoriesOptionCategoryRelatedToSportsCategoryPage(){
//    aeMegaMenuTestCases=new AEMegaMenuTestCases();
//    aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//    aeMegaMenuTestCases.verifyClickingOnWomenTrainingAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL();
//    String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//    DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//}
////Banners inside the MegaMenu lists
//
//
//}