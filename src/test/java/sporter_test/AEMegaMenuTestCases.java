package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEMegaMenuPage;

import static org.testng.Assert.assertFalse;

public class AEMegaMenuTestCases extends BaseTest {
    Actions action;
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    String sportSupplementsUrl="https://www.sporter.com/en-ae/sport-supplements";
    String healthVitaminsUrl="https://www.sporter.com/en-ae/health-vitamins/";
    String sportsUrl="https://www.sporter.com/en-ae/sports/";
    String healthyFoodsUrl="https://www.sporter.com/en-ae/healthy-food/";
    String womenOnlyUrl="https://www.sporter.com/en-ae/female/";
    String salesAndOffersUrl="https://www.sporter.com/en-ae/salesoffers/";
    String byGoalUrl="https://www.sporter.com/en-ae/goal/";
    String sportStacksUrl="https://www.sporter.com/en-ae/sporter-stacks/";
    String byBrandUrl="https://www.sporter.com/en-ae/brands";
    String proteinOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/protein/";
    String creatineOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/creatine/";
    String aminoAcidsOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/amino-acids/";
    String muscleBoostersOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/muscles-boosters/";
    String weightManagementOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/weight-management/";
    String recoveryOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/recovery/";
    String carbohydratesOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/carbohydrates/";
    String energyAndEnduranceOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/energy-endurance/";
    String gamingAndFocusOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements//gaming-focus";
    String wheyProteinOptionInSportSupplementsMenuUrl ="https://www.sporter.com/en-ae/sport-supplements/protein/whey-protein/";
    String WheyProteinIsolateOptionInSportSupplementsMenuUrl ="https://www.sporter.com/en-ae/sport-supplements/protein/whey-protein-isolate/";
    String proteinBlendsOptionInSportSupplementsMenuUrl ="https://www.sporter.com/en-ae/sport-supplements/protein/protein-blends/";
    String nonDairyProteinOptionInSportSupplementsMenuUrl ="https://www.sporter.com/en-ae/sport-supplements/protein/non-dairy-protein/";
    String caseinProteinOptionInSportSupplementsMenuUrl ="https://www.sporter.com/en-ae/sport-supplements/protein/casein-protein/";
    String dietProteinOptionInSportSupplementsMenuUrl ="https://www.sporter.com/en-ae/sport-supplements/protein/diet-protein/";
    String massGainersOptionInSportSupplementsMenuUrl ="https://www.sporter.com/en-ae/sport-supplements/protein/mass-gainer/";
    String creatineMonohydrateOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/creatine/creatine-monohydrate/";
    String creatineBlendsOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/creatine/creatine-blends/";
    String bCAAOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/amino-acids/bcaa/";
    String eAAOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/amino-acids//eaa";
    String arginineOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/amino-acids/arginine/";
    String betaAlanineOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/amino-acids/beta-alanine/";
    String hMBOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/amino-acids/hmb/";
    String aminoAcidPowdersOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/amino-acids/powders/";
    String aminoAcidPillsOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/amino-acids/capsules/";
    String citrullineOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/amino-acids/citrulline/";
    String aminoAcidLiquidsOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/amino-acids/liquids/";
    String testosteroneBoostersOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/muscles-boosters/testosterone-booster/";
    String ghBoostersOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/muscles-boosters/gh-booster/";
    String stimulantWeightLossOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/weight-management/stimulant-weight-loss/";
    String nonStimulantWeightLossOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/weight-management/non-stimulant-weight-loss/";
    String mealReplacementsOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/weight-management/meal-replacement/";
    String metabolismSupportOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/weight-management/metabolism-support/";
    String toningCreamsOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/weight-management/toning-cream/";
    String mctOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/weight-management/mct/";
    String glutamineOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/recovery/glutamine/";
    String recoveryBlendOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/recovery/recovery-blend/";
    String electrolytesAndHydrationOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/recovery//electrolytes";
    String carbohydratePowdersOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/carbohydrates/carbohydrates-powders/";
    String stimulantEnergyOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/energy-endurance/stimulant-energy/";
    String nonStimulantEnergyOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements/energy-endurance/non-stimulant-energy/";
    String gamingSupplementsOptionInSportSupplementsMenuUrl="https://www.sporter.com/en-ae/sport-supplements//gaming-focus/gaming-supplements";


    @Test(description = "Make sure the MegaMenu Section display correctly with all main columns", priority = 1)
    public void verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
        Assert.assertEquals(aeMegamenuPage.getMegaMenuList().get(0).getText(), "Shop By\n" +
                "Sport Supplements\n" +
                "Vitamins & Health\n" +
                "Healthy Food\n" +
                "SPORTS\n" +
                "Women's Only", "The MegaMenu is not correct");
    }
    @Test(description = "Make sure the Shop By menu display the correct options ", priority = 2)
    public void verifyShopByMenuDisplayTheCorrectOptions(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        Assert.assertEquals(aeMegamenuPage.getShopeByMenu().getText(),"Shop By");
        Assert.assertEquals(aeMegamenuPage.getSportsSupplementsOption().getAttribute("textContent")," Sports Supplements\n\n");
        Assert.assertEquals(aeMegamenuPage.getVitaminsAndHealthOption().getAttribute("textContent")," Vitamins & Health\n\n");
        Assert.assertEquals(aeMegamenuPage.getHealthFoodOption().getAttribute("textContent")," Healthy Food\n\n");
        Assert.assertEquals(aeMegamenuPage.getSportsOption().getAttribute("textContent")," SPORTS\n\n");
        Assert.assertEquals(aeMegamenuPage.getWomensOnlyOption().getAttribute("textContent")," Women's Only\n\n");
        Assert.assertEquals(aeMegamenuPage.getByBrandOption().getAttribute("textContent")," By Brand\n\n");
        Assert.assertEquals(aeMegamenuPage.getByGoalOption().getAttribute("textContent")," By Goal\n\n");
        Assert.assertEquals(aeMegamenuPage.getSalesAndOffersOption().getAttribute("textContent")," Sales & Offers\n\n");
        Assert.assertEquals(aeMegamenuPage.getSporterStacksOption().getAttribute("textContent")," Sporter Stacks\n\n");
    }
        @Test(description = "Make sure the Hamburger Menu Icon display correctly in the ShopBy menu ", priority = 3)
        public void verifyTheHamburgerMenuIconAppearsCorrectlyInShopByMenu(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        Assert.assertTrue(aeMegamenuPage.getHamburgerMenuIcon().isDisplayed());
    }
    @Test(description = "Make sure the arrow Icon display correctly next to the options appearing in the ShopBy menu ", priority = 4)
    public void verifyTheArrowIconAppearsCorrectlyNextToTheOptionInTheInShopByMenu(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action= new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getHealthFoodArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getByBrandArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getSportsArrowIcon().isDisplayed());
    }
    @Test(description = "Make sure the background color of the ShopBy menu is Gray", priority = 5)
    public void verifyTheBackgroundColorOfTheShopByMenuInGrayColor(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action= new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertEquals(aeMegamenuPage.getShopByList().getCssValue("background-color"),"rgba(236, 236, 236, 1)", "The ShopBy Menu does not appears in the gray color");
    }
    @Test(description = "Make sure the Category sub menu will appear once hovering on any option appearing in the ShopBy Menu", priority = 6)
    public void verifyTheCategorySubMenuAppearsWhenHoveringOnAnyOptionInsideShopByMenu(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action= new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(),"The Sports Supplements sub menu is missing");
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(),"The Vitamins And Health sub menu is missing");
        action.moveToElement(aeMegamenuPage.getHealthFoodOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(),"The Health Food sub menu is missing");
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(),"The Sports sub menu is missing");
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getByBrandSubMenuSection().isDisplayed(),"The By Brand sub menu is missing");
    }
    @Test(description = "Make sure clicking on the Sports Supplements menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 7)
    public void verifyClickingOnSportsSupplementsOptionInShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        aeMegamenuPage.getSportsSupplementsOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportSupplementsUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Vitamins And Health menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 8)
    public void verifyClickingOnVitaminsAndHealthOptionInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        aeMegamenuPage.getVitaminsAndHealthOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthVitaminsUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Healthy Food menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 9)
    public void verifyClickingOnHealthyFoodOptionInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthFoodOption()).perform();
        aeMegamenuPage.getHealthFoodOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthyFoodsUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Sports menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 10)
    public void verifyClickingOnSportsOptionInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        aeMegamenuPage.getSportsOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportsUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Woman's only menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 11)
    public void verifyClickingOnWomanOnlyOptionInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomensOnlyOption()).perform();
        aeMegamenuPage.getWomensOnlyOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(womenOnlyUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    //There's a bug here, clicking on the By Brand Menu wil redirect the user to the homePage
    @Test(description = "Make sure clicking on the By Brand menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 12)
    public void verifyClickingOnByBrandOptionInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(byBrandUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the By Goal menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 13)
    public void verifyClickingOnByGoalOptionInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByGoalOption()).perform();
        aeMegamenuPage.getByGoalOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(byGoalUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Sales And Offers menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 14)
    public void verifyClickingOnSalesAndOffersOptionInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSalesAndOffersOption()).perform();
        aeMegamenuPage.getSalesAndOffersOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(salesAndOffersUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Sport Stacks menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 15)
    public void verifyClickingOnSportsStacksOptionInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSporterStacksOption()).perform();
        aeMegamenuPage.getSporterStacksOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportStacksUrl));
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure the MegaMenu section appears correctly when navigation to any option appearing in the ShopBy Menu", priority = 16)
    public void verifyMegaMenuSectionAppearsCorrectlyWhenClickingOnAnyOptionInTheShopByMenu(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        this.verifyClickingOnSportsSupplementsOptionInShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnVitaminsAndHealthOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnHealthyFoodOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnSportsOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnWomanOnlyOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnByBrandOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnByGoalOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnSalesAndOffersOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
        this.verifyClickingOnSportsStacksOptionInsideShopByMenuRedirectUserToCorrectURL();
        this.verifyMegaMenuSectionAppearsCorrectlyWithAllMainColumns();
    }
    @Test(description = "Make sure the Sports Supplements menu Inside ShopBy Menu display the correct categories and sub-categories", priority = 17)
    public void verifySportsSupplementsMenuInsideShopByMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getSubMenuList().get(0).getText(), "PROTEIN\n" + "Whey Protein\n" + "Whey Protein Isolate\n" +
                "Protein Blends\n" + "Non-dairy Protein\n" + "Casein Protein\n" + "Diet Protein\n" + "Mass Gainers\n" + "CREATINE\n" +
                "Creatine Monohydrate\n" + "Creatine Blends\n" + "AMINO ACIDS\n" + "BCAA\n" + "EAA\n" + "Arginine\n" + "Beta Alanine\n" +
                "HMB\n" + "Amino Acid Powders\n" + "Amino Acid Pills\n" + "Citrulline\n" + "Amino Acid Liquids\n" + "MUSCLE BOOSTERS\n" +
                "Testosterone Boosters\n" + "Gh Boosters\n" + "WEIGHT MANAGEMENT\n" + "Stimulant Weight Loss\n" + "Non-stimulant Weight Loss\n" +
                "Meal Replacements\n" + "Metabolism Support\n" + "Toning Creams\n" + "MCT\n" + "RECOVERY\n" + "Glutamine\n" + "Recovery Blends\n" +
                "Electrolytes & Hydration\n" + "CARBOHYDRATES\n" + "Carbohydrate Powders\n" + "ENERGY & ENDURANCE\n" + "Stimulant Energy\n" +
                "Non-stimulant Energy\n" + "GAMING & FOCUS\n" + "Gaming Essentials");
    }
    @Test(description = "Make sure the main categories in the Sports Supplements menu Inside ShopBy Menu appearing in Bold Font", priority = 18)
    public void verifyTheMainCategoriesInTheSportsSupplementsMenuInsideShopByMenuAppearingInBoldFont(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getProteinOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
    }
    @Test(description = "Make sure the main categories in the Sports Supplements menu Inside ShopBy Menu menu appearing in uppercase", priority = 19)
    public void verifyTheMainCategoriesInTheSportsSupplementsMenuInsideShopByMenuAppearingInUppercase(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        Assert.assertEquals(aeMegamenuPage.getProteinOptionInSportSupplementsMenu().getCssValue("text-transform"),"uppercase");
        Assert.assertEquals(aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().getCssValue("text-transform"),"uppercase");
        Assert.assertEquals(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getCssValue("text-transform"),"uppercase");
        Assert.assertEquals(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().getCssValue("text-transform"),"uppercase");
        Assert.assertEquals(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getCssValue("text-transform"),"uppercase");
        Assert.assertEquals(aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().getCssValue("text-transform"),"uppercase");
        Assert.assertEquals(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getCssValue("text-transform"),"uppercase");
        Assert.assertEquals(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getCssValue("text-transform"),"uppercase");
        Assert.assertEquals(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getCssValue("text-transform"),"uppercase");
    }
    @Test(description = "Make sure clicking on the Protein option  appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 20)
    public void verifyClickingOnProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        aeMegamenuPage.getProteinOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),proteinOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Creatine option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 20)
    public void verifyClickingOnCreatineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),creatineOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Amino Acids appearing in the Sports Supplements inside menu ShopBy Menu will redirect the User to the correct URL", priority = 21)
    public void verifyClickingOnAminoAcidsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),aminoAcidsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Muscle Boosters option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 22)
    public void verifyClickingOnMuscleBoostersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),muscleBoostersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Weight Management option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 23)
    public void verifyClickingOnWeightManagementOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),weightManagementOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Recovery option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 24)
    public void verifyClickingOnRecoveryOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),recoveryOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Carbohydrates option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 25)
    public void verifyClickingOnCarbohydratesOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),carbohydratesOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Energy And Endurance Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 25)
    public void verifyClickingOnEnergyAndEnduranceOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),energyAndEnduranceOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Gaming And Focus Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 26)
    public void verifyClickingOnGamingAndFocusOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),gamingAndFocusOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Whey Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 26)
    public void verifyClickingOnWheyProteinOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getWheyProteinOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), wheyProteinOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Whey Protein Isolate Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 27)
    public void verifyClickingOnWheyProteinIsolateOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), WheyProteinIsolateOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the protein Blends Option  appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 28)
    public void verifyClickingOnProteinBlendsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBlendsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Non Dairy Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 29)
    public void verifyClickingOnNonDairyProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), nonDairyProteinOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the casein Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 30)
    public void verifyClickingOnCaseinProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), caseinProteinOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the diet Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 31)
    public void verifyClickingOnDietProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDietProteinOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getDietProteinOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), dietProteinOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Mass Gainers Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 32)
    public void verifyClickingOnMassGainersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMassGainersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getMassGainersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), massGainersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Creatine Monohydrate Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 33)
    public void verifyClickingOnCreatineMonohydrateOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineMonohydrateOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Creatine Blends Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 34)
    public void verifyClickingOnCreatineBlendsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), creatineBlendsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the BCAA Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 35)
    public void verifyClickingOnBCAAOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getbCAAOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getbCAAOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), bCAAOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the EAA Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 36)
    public void verifyClickingOnEAAOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEAAOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getEAAOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), eAAOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Arginine Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 37)
    public void verifyClickingOnArginineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getArginineOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getArginineOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), arginineOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Beta Alanine Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 38)
    public void verifyClickingOnBetaAlanineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), betaAlanineOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the HMB Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 39)
    public void verifyClickingOnHMbOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHMBOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getHMBOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),hMBOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Amino Acid Powders Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 40)
    public void verifyClickingOnAminoAcidPowdersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),aminoAcidPowdersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Amino Acid Pills Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 41)
    public void verifyClickingOnAminoAcidPillsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),aminoAcidPillsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Citrulline Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 42)
    public void verifyClickingOnCitrullineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCitrullineOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCitrullineOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),citrullineOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Amino Acid Liquids Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 43)
    public void verifyClickingOnAminoAcidLiquidsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),aminoAcidLiquidsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Testosterone Boosters Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 44)
    public void verifyClickingOnTestosteroneBoostersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),testosteroneBoostersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Gh Boosters Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 45)
    public void verifyClickingOnGhBoostersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGhBoostersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getGhBoostersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),ghBoostersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Stimulant Weight Loss Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 46)
    public void verifyClickingOnStimulantWeightLossOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),stimulantWeightLossOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Non Stimulant Weight Loss Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 47)
    public void verifyClickingOnNonStimulantWeightLossOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),nonStimulantWeightLossOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Meal Replacements Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 48)
    public void verifyClickingOnMealReplacementsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),mealReplacementsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Metabolism Support Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 49)
    public void verifyClickingOnMetabolismSupportOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),metabolismSupportOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Toning Creams Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 50)
    public void verifyClickingOnToningCreamsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getToningCreamsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getToningCreamsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),toningCreamsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the MCT Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 51)
    public void verifyClickingOnMctOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMctOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getMctOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),mctOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Glutamine Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 52)
    public void verifyClickingOnGlutamineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGlutamineOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getGlutamineOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),glutamineOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Recovery Blend Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 53)
    public void verifyClickingOnRecoveryBlendOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),recoveryBlendOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 54)
    public void verifyClickingOnElectrolytesAndHydrationOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),electrolytesAndHydrationOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Carbohydrate Powders Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 55)
    public void verifyClickingOnCarbohydratePowdersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),carbohydratePowdersOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Stimulant Energy Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 56)
    public void verifyClickingOnStimulantEnergyOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),stimulantEnergyOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Non Stimulant Energy Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 57)
    public void verifyClickingOnNonStimulantEnergyOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),nonStimulantEnergyOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
    @Test(description = "Make sure clicking on the Gaming Supplements Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 58)
    public void verifyClickingOnGamingSupplementsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL(){
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action= new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingSupplementsOptionInSportSupplementsMenu()).perform();
        aeMegamenuPage.getGamingSupplementsOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),gamingSupplementsOptionInSportSupplementsMenuUrl);
        Boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle,"Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent,"The page is empty");
    }
}