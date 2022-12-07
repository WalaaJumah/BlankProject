package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEMegaMenuPage;
import sporter_pages.AeAllPagesInsideCategoriesInMegaMenuPage;

import static org.testng.Assert.assertFalse;

public class AEMegaMenuTestCases extends BaseTest {
    Actions action;
    AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
    AeAllPagesInsideCategoriesInMegaMenuPage aeAllPagesInsideCategoriesInMegaMenuPage;
    String sportSupplementsUrl = "/en-ae/sport-supplements/";
    String healthVitaminsUrl = "/en-ae/health-vitamins/";
    String sportsUrl = "/en-ae/sports/";
     String healthyFoodsUrl = "/en-ae/healthy-food/";
    String womenOnlyUrl = "/en-ae/female/";

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
    public void verifyShopByMenuDisplayTheCorrectOptions() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        Assert.assertEquals(aeMegamenuPage.getShopeByMenu().getText(), "Shop By");
        Assert.assertEquals(aeMegamenuPage.getSportsSupplementsOption().getAttribute("textContent"), " Sports Supplements\n\n");
        Assert.assertEquals(aeMegamenuPage.getVitaminsAndHealthOption().getAttribute("textContent"), " Vitamins & Health\n\n");
        Assert.assertEquals(aeMegamenuPage.getHealthFoodOption().getAttribute("textContent"), " Healthy Food\n\n");
        Assert.assertEquals(aeMegamenuPage.getSportsOption().getAttribute("textContent"), " SPORTS\n\n");
        Assert.assertEquals(aeMegamenuPage.getWomenOnlyOption().getAttribute("textContent"), " Women's Only\n\n");
        Assert.assertEquals(aeMegamenuPage.getByBrandOption().getAttribute("textContent"), " By Brand\n\n");
        Assert.assertEquals(aeMegamenuPage.getByGoalOption().getAttribute("textContent"), " By Goal\n\n");
        Assert.assertEquals(aeMegamenuPage.getSalesAndOffersOption().getAttribute("textContent"), " Sales & Offers\n\n");
        Assert.assertEquals(aeMegamenuPage.getSporterStacksOption().getAttribute("textContent"), " Sporter Stacks\n\n");
    }

    @Test(description = "Make sure the Hamburger Menu Icon display correctly in the ShopBy menu ", priority = 3)
    public void verifyTheHamburgerMenuIconAppearsCorrectlyInShopByMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        Assert.assertTrue(aeMegamenuPage.getHamburgerMenuIcon().isDisplayed());
    }

    @Test(description = "Make sure the arrow Icon display correctly next to the options appearing in the ShopBy menu ", priority = 4)
    public void verifyTheArrowIconAppearsCorrectlyNextToTheOptionInTheInShopByMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getHealthFoodArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getByBrandArrowIcon().isDisplayed());
        Assert.assertTrue(aeMegamenuPage.getSportsArrowIcon().isDisplayed());
    }

    @Test(description = "Make sure the background color of the ShopBy menu is Gray", priority = 5)
    public void verifyTheBackgroundColorOfTheShopByMenuInGrayColor() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertEquals(aeMegamenuPage.getShopByList().getCssValue("background-color"), "rgba(236, 236, 236, 1)", "The ShopBy Menu does not appears in the gray color");
    }

    @Test(description = "Make sure the Category sub menu will appear once hovering on any option appearing in the ShopBy Menu", priority = 6)
    public void verifyTheCategorySubMenuAppearsWhenHoveringOnAnyOptionInsideShopByMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        DataHelperAndWait.isDisplayed(aeMegamenuPage.getSubMenuSection(), 10);
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sports Supplements sub menu is missing");
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        DataHelperAndWait.isDisplayed(aeMegamenuPage.getSubMenuSection(), 10);
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Vitamins And Health sub menu is missing");
        action.moveToElement(aeMegamenuPage.getHealthFoodOption()).perform();
        DataHelperAndWait.isDisplayed(aeMegamenuPage.getSubMenuSection(), 10);
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Health Food sub menu is missing");
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        DataHelperAndWait.isDisplayed(aeMegamenuPage.getSubMenuSection(), 10);
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sports sub menu is missing");
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        DataHelperAndWait.isDisplayed(aeMegamenuPage.getSubMenuSection(), 10);
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The By Brand sub menu is missing");
    }

    @Test(description = "Make sure clicking on the Sports Supplements menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 7)
    public void verifyClickingOnSportsSupplementsOptionInShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        String expectedUrl=aeMegamenuPage.getSportsSupplementsOption().getAttribute("href");
        aeMegamenuPage.getSportsSupplementsOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportSupplementsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamins And Health menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 8)
    public void verifyClickingOnVitaminsAndHealthOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsAndHealthOption().getAttribute("href");
        aeMegamenuPage.getVitaminsAndHealthOption().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthVitaminsUrl));
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Food menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 9)
    public void verifyClickingOnHealthyFoodOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthFoodOption()).perform();
        String expectedUrl=aeMegamenuPage.getHealthFoodOption().getAttribute("href");
        aeMegamenuPage.getHealthFoodOption().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthyFoodsUrl));
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sports menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 10)
    public void verifyClickingOnSportsOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        String expectedUrl=aeMegamenuPage.getSportsOption().getAttribute("href");
        aeMegamenuPage.getSportsOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Woman's only menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 11)
    public void verifyClickingOnWomanOnlyOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenOnlyOption()).perform();
        String expectedUrl=aeMegamenuPage.getWomenOnlyOption().getAttribute("href");
        aeMegamenuPage.getWomenOnlyOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(womenOnlyUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    //There's a bug here, clicking on the By Brand Menu wil redirect the user to the homePage
    @Test(description = "Make sure clicking on the By Brand menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 12)
    public void verifyClickingOnByBrandOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        String expectedUrl=aeMegamenuPage.getByBrandOption().getAttribute("href");
        action.moveToElement(aeMegamenuPage.getByBrandOption()).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(byBrandUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the By Goal menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 13)
    public void verifyClickingOnByGoalOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByGoalOption()).perform();
        String expectedUrl=aeMegamenuPage.getByGoalOption().getAttribute("href");
        aeMegamenuPage.getByGoalOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(byGoalUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sales And Offers menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 14)
    public void verifyClickingOnSalesAndOffersOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSalesAndOffersOption()).perform();
        String expectedUrl=aeMegamenuPage.getSalesAndOffersOption().getAttribute("href");
        aeMegamenuPage.getSalesAndOffersOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(salesAndOffersUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sport Stacks menu appearing in the ShopBy Menu will redirect the User to the correct URL", priority = 15)
    public void verifyClickingOnSportsStacksOptionInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSporterStacksOption()).perform();
        String expectedUrl=aeMegamenuPage.getSporterStacksOption().getAttribute("href");
        aeMegamenuPage.getSporterStacksOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportStacksUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure the MegaMenu section appears correctly when navigation to any option appearing in the ShopBy Menu", priority = 16)
    public void verifyMegaMenuSectionAppearsCorrectlyWhenClickingOnAnyOptionInTheShopByMenu() {
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
        action = new Actions(webDriver);
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
    public void verifyTheMainCategoriesInTheSportsSupplementsMenuInsideShopByMenuAppearingInBoldFont() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
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
    public void verifyTheMainCategoriesInTheSportsSupplementsMenuInsideShopByMenuAppearingInUppercase() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        Assert.assertEquals(aeMegamenuPage.getProteinOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getCssValue("text-transform"), "uppercase");
    }

    @Test(description = "Make sure clicking on the Protein option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 20)
    public void verifyClickingOnProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsSupplementsOption()).perform();
        String expectedUrl=aeMegamenuPage.getProteinOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getProteinOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Creatine option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 21)
    public void verifyClickingOnCreatineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), creatineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino Acids appearing in the Sports Supplements inside menu ShopBy Menu will redirect the User to the correct URL", priority = 22)
    public void verifyClickingOnAminoAcidsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Muscle Boosters option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 23)
    public void verifyClickingOnMuscleBoostersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), muscleBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Weight Management option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 24)
    public void verifyClickingOnWeightManagementOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Recovery option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 25)
    public void verifyClickingOnRecoveryOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Carbohydrates option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 26)
    public void verifyClickingOnCarbohydratesOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratesOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Energy And Endurance Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 27)
    public void verifyClickingOnEnergyAndEnduranceOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), energyAndEnduranceOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gaming And Focus Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 28)
    public void verifyClickingOnGamingAndFocusOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), gamingAndFocusOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Whey Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 29)
    public void verifyClickingOnWheyProteinOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWheyProteinOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getWheyProteinOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), wheyProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Whey Protein Isolate Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 30)
    public void verifyClickingOnWheyProteinIsolateOptionOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), WheyProteinIsolateOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the protein Blends Option  appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 31)
    public void verifyClickingOnProteinBlendsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBlendsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Non Dairy Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 32)
    public void verifyClickingOnNonDairyProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nonDairyProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the casein Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 33)
    public void verifyClickingOnCaseinProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), caseinProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the diet Protein Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 34)
    public void verifyClickingOnDietProteinOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDietProteinOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDietProteinOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getDietProteinOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), dietProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Mass Gainers Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 35)
    public void verifyClickingOnMassGainersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMassGainersOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMassGainersOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getMassGainersOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), massGainersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Creatine Monohydrate Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 36)
    public void verifyClickingOnCreatineMonohydrateOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), creatineMonohydrateOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Creatine Blends Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 37)
    public void verifyClickingOnCreatineBlendsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), creatineBlendsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the BCAA Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 38)
    public void verifyClickingOnBCAAOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getbCAAOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getbCAAOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getbCAAOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bCAAOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the EAA Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 39)
    public void verifyClickingOnEAAOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEAAOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEAAOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getEAAOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        //  Assert.assertEquals(webDriver.getCurrentUrl(), eAAOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Arginine Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 40)
    public void verifyClickingOnArginineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getArginineOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getArginineOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getArginineOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), arginineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Beta Alanine Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 41)
    public void verifyClickingOnBetaAlanineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), betaAlanineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the HMB Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 42)
    public void verifyClickingOnHMbOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHMBOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHMBOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getHMBOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hMBOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino Acid Powders Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 43)
    public void verifyClickingOnAminoAcidPowdersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPowdersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino Acid Pills Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 44)
    public void verifyClickingOnAminoAcidPillsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPillsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Citrulline Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 45)
    public void verifyClickingOnCitrullineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCitrullineOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCitrullineOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getCitrullineOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), citrullineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino Acid Liquids Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 46)
    public void verifyClickingOnAminoAcidLiquidsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidLiquidsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Testosterone Boosters Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 47)
    public void verifyClickingOnTestosteroneBoostersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), testosteroneBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gh Boosters Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 48)
    public void verifyClickingOnGhBoostersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGhBoostersOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGhBoostersOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getGhBoostersOptionInSportSupplementsMenu().click();
//        Assert.assertEquals(webDriver.getCurrentUrl(), ghBoostersOptionInSportSupplementsMenuUrl);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Stimulant Weight Loss Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 49)
    public void verifyClickingOnStimulantWeightLossOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantWeightLossOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Non Stimulant Weight Loss Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 50)
    public void verifyClickingOnNonStimulantWeightLossOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantWeightLossOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Meal Replacements Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 51)
    public void verifyClickingOnMealReplacementsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mealReplacementsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Metabolism Support Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 52)
    public void verifyClickingOnMetabolismSupportOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),expectedUrl);
//        Assert.assertEquals(webDriver.getCurrentUrl(), metabolismSupportOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Toning Creams Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 53)
    public void verifyClickingOnToningCreamsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getToningCreamsOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getToningCreamsOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getToningCreamsOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), toningCreamsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the MCT Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 54)
    public void verifyClickingOnMctOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMctOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMctOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getMctOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mctOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Glutamine Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 55)
    public void verifyClickingOnGlutamineOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGlutamineOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGlutamineOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getGlutamineOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), glutamineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Recovery Blend Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 56)
    public void verifyClickingOnRecoveryBlendOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryBlendOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 57)
    public void verifyClickingOnElectrolytesAndHydrationOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Carbohydrate Powders Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 58)
    public void verifyClickingOnCarbohydratePowdersOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratePowdersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Stimulant Energy Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 59)
    public void verifyClickingOnStimulantEnergyOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantEnergyOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Non Stimulant Energy Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 60)
    public void verifyClickingOnNonStimulantEnergyOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantEnergyOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gaming Essentials Option appearing in the Sports Supplements menu inside ShopBy Menu will redirect the User to the correct URL", priority = 61)
    public void verifyClickingOnGamingEssentialsOptionInSportsSupplementsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMenu().getAttribute("href");
        aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), gamingEssentialsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure the Vitamins & Health menu Inside ShopBy Menu display the correct categories and sub-categories", priority = 62)
    public void verifyVitaminsAndHealthMenuInsideShopByMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getOptionList().get(0).getText(), "FEATURED\n" + "Alive! Vitamins\n" + "Sexual Health\n" + "ESSENTIAL VITAMINS\n" +
                "Folic Acid\n" + "Vitamin A\n" + "Vitamin B\n" + "Vitamin C\n" + "Vitamin D\n" + "Vitamin E\n" + "Vitamin K\n" + "MULTIVITAMINS\n" + "Vitamins For Kids\n" +
                "Multivitamins For Men\n" + "Multivitamins For Women\n" + "BONE & JOINT\n" + "Bone Health\n" + "Joint Health\n" + "BEAUTY\n" + "Collagen\n" + "Hair, Skin & Nails\n" +
                "FISH OIL & OMEGAS\n" + "Fish Oil\n" + "Omega 3 6 9\n" + "HEALTHY LIFESTYLE\n" + "Antioxidants\n" + "Blood Sugar Support\n" + "Brain Support\n" + "Heart Health\n" +
                "Detox & Cleanse\n" + "Energy Formulas\n" + "Eye Health\n" + "Herbs\n" + "Hormones Balance\n" + "Immune Support\n" + "Mens Health\n" + "Stress Relief\n" +
                "Sleep Support\n" + "Superfoods\n" + "Urinary Tract Support\n" + "Weight Management\n" + "Womens Health\n" + "DIGESTION\n" + "Digestive Support\n" + "Probiotics\n" +
                "SPORT VITAMINS\n" + "Amino Acids\n" + "MINERALS\n" + "Calcium\n" + "Iron\n" + "Magnesium\n" + "Multimineral Formulas\n" + "Zinc\n" + "Potassium\n" + "HEALTHY DRINKS\n" +
                "Drinkable Vitamins\n" + "PETS\n" + "Supplements & More");
    }

    @Test(description = "Make sure the main categories in the Vitamins & Health menu Inside ShopBy Menu appearing in Bold Font", priority = 63)
    public void verifyTheMainCategoriesInTheVitaminsAndHealthMenuInsideShopByMenuAppearingInBoldFont() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu().getCssValue("font-weight").contains("700"));
    }

    @Test(description = "Make sure the main categories in the Vitamins & Health menu Inside ShopBy Menu menu appearing in uppercase", priority = 64)
    public void verifyTheMainCategoriesInTheVitaminsAndHealthMenuInsideShopByMenuAppearingInUppercase() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        Assert.assertEquals(aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu().getCssValue("text-transform"), "uppercase");
    }

    @Test(description = "Make sure clicking on the Featured Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 65)
    public void verifyClickingOnFeaturedOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), featuredOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Alive Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 66)
    public void verifyClickingOnAliveVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aliveVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sexual Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 67)
    public void verifyClickingOnSexualHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sexualHealthOptionInVitaminsAndHealthUrl);
        System.out.println(webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Essential Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 68)
    public void verifyClickingOnEssentialVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), essentialVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Folic Acid Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 69)
    public void verifyClickingOnFolicAcidOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), folicAcidOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin A Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 70)
    public void verifyClickingOnVitaminAOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminAOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin B Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 71)
    public void verifyClickingOnVitaminBOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminBOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin C Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 72)
    public void verifyClickingOnVitaminCOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminCOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin D Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 73)
    public void verifyClickingOnVitaminDOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminDOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin E Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 74)
    public void verifyClickingOnVitaminEOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMenu().click();
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminEOptionInVitaminsAndHealthUrl);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin K Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 75)
    public void verifyClickingOnVitaminKOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminKOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Multi Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 76)
    public void verifyClickingOnMultiVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), multiVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamins For Kids Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 77)
    public void verifyClickingOnVitaminsForKidsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForKidsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamins For Men Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 78)
    public void verifyClickingOnVitaminsForMenOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForMenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamins For Women Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 79)
    public void verifyClickingOnVitaminsForWomenOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForWomenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Bone And Joint Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 80)
    public void verifyClickingOnBoneAndJointOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), boneJointOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Bone Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 81)
    public void verifyClickingOnBoneHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), boneHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Joint Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 82)
    public void verifyClickingOnJointHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), jointHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Beauty Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 83)
    public void verifyClickingOnBeautyOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), beautyOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Collagen Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 84)
    public void verifyClickingOnCollagenOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), collagenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Hair, Skin AndNails Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 85)
    public void verifyClickingOnHairSkinAndNailsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hairSkinAndNailsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Fish Oil Omegas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 86)
    public void verifyClickingOnFishOilOmegasOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilAndOmegasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Fish Oil Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 87)
    public void verifyClickingOnFishOilOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Omega369 Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 88)
    public void verifyClickingOnOmega369OptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), omegaMixOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Health Lifestyle Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 89)
    public void verifyClickingOnHealthLifestyleOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyLifestyleOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Antioxidants Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 90)
    public void verifyClickingOnAntioxidantsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), antioxidantOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Blood Sugar Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 91)
    public void verifyClickingOnBloodSugarSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bloodSugarSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Brain Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 92)
    public void verifyClickingOnBrainSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), brainSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Detox And Cleanse Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 93)
    public void verifyClickingOnDetoxAndCleanseOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), detoxCleanseOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Energy Formulas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 94)
    public void verifyClickingOnEnergyFormulasOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), energyFormulasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Eye Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 95)
    public void verifyClickingOnEyeHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), eyeHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Herbs Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 96)
    public void verifyClickingOnHerbsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), herbsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Hormones Balance Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 97)
    public void verifyClickingOnHormonesBalanceOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hormonesBalanceOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Immune Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 98)
    public void verifyClickingOnImmuneSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), immuneSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Mens Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 99)
    public void verifyClickingOnMensHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mensHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Stress Relief Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 100)
    public void verifyClickingOnStressReliefOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), stressReliefOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sleep Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 101)
    public void verifyClickingOnSleepSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sleepSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Super Foods Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 102)
    public void verifyClickingOnSuperFoodsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Urinary Tract Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 103)
    public void verifyClickingOnUrinaryTractSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), urinaryTractSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Weight Management Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 104)
    public void verifyClickingOnWeightManagementOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Womens Health Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 105)
    public void verifyClickingOnWomensHealthOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womensHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Digestion Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 106)
    public void verifyClickingOnDigestionOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), digestionOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Digestion Support Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 107)
    public void verifyClickingOnDigestionSupportOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), digestionSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Probiotics Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 108)
    public void verifyClickingOnProbioticsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), probioticsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sport Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 109)
    public void verifyClickingOnSportVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sportVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino Acid Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 110)
    public void verifyClickingOnAminoAcidOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Minerals Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 111)
    public void verifyClickingOnMineralsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mineralsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Calcium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 112)
    public void verifyClickingOnCalciumOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), calciumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Iron Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 113)
    public void verifyClickingOnIronOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getIronOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getIronOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getIronOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ironOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Magnesium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 114)
    public void verifyClickingOnMagnesiumOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), magnesiumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Multi mineral Formulas Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 115)
    public void verifyClickingOnMultimineralFormulasOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), multimineralFormulasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Zinc Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 116)
    public void verifyClickingOnZincOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getZincOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getZincOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getZincOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), zincOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Potassium Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 117)
    public void verifyClickingOnPotassiumOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), potassiumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Drinks Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 118)
    public void verifyClickingOnHealthyDrinksOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyDrinksOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Drinkable Vitamins Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 119)
    public void verifyClickingOnDrinkableVitaminsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), drinkableVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Pets Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 120)
    public void verifyClickingOnPetsOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getPetsOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), petsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Supplements More Option appearing in the Vitamins & Health menu inside ShopBy Menu will redirect the User to the correct URL", priority = 121)
    public void verifyClickingOnSupplementsMoreOptionInVitaminsAndHealthMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthOption()).perform();
        action.moveToElement(aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMenu().getAttribute("href");
        aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), supplementsMoreOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure the Healthy Food menu Inside ShopBy Menu display the correct categories and sub-categories", priority = 122)
    public void verifyHealthyFoodMenuInsideShopByMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getOptionList().get(0).getText(), "GROCERY\n" + "Baking & Cooking\n" + "Canned\n" + "Coffee\n" + "Condiments\n" +
                "Milk & Cream\n" + "Nuts & Oats\n" + "Oils\n" + "Pasta\n" + "Rice & Grains\n" + "Seasonings & Spices\n" + "Sugar & Sweeteners\n" + "Syrups\n" + "Tea & Herbs\n" +
                "Superfoods\n" + "Ready Mixes\n" + "Breakfast & Cereal\n" + "READY TO DRINK\n" + "Amino & Bcaas\n" + "Energy Drinks\n" + "Protein Shakes\n" + "Electrolytes & Hydration\n" + "HEALTHY SNACKS\n" + "Protein Bars\n" +
                "Cookies\n" + "Chips\n" + "Brownies & Pancakes\n" + "Snack Bars\n" + "Spreads\n" + "Other Healthy Snacks\n" + "READY TO EAT\n" + "Healthy Meals\n" + "FEATURED\n" +
                "Healthy Meal Replacement\n" + "Protein Coffee\n" + "Candies\n" + "Flavoring Agents\n" + "Keto Snacks\n" + "Manuka Honey\n" + "Meat Snacks");
    }

    @Test(description = "Make sure clicking on the Grocery Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 123)
    public void verifyClickingOnGroceryOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getGroceryOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGroceryOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getGroceryOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), groceryOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Baking And Cooking Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 124)
    public void verifyClickingOnBakingAndCookingOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bakingAndCookingOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Canned Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 125)
    public void verifyClickingOnCannedOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCannedOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCannedOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getCannedOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), cannedOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Coffee Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 126)
    public void verifyClickingOnCoffeeOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCoffeeOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCoffeeOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getCoffeeOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), coffeeOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Condiments Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 127)
    public void verifyClickingOnCondimentsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCondimentsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCondimentsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getCondimentsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), condimentsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Milk And Cream Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 128)
    public void verifyClickingOnMilkAndCreamOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), milkAndCreamOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Nuts And Oats Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 129)
    public void verifyClickingOnNutsAndOatsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nutsAndOatsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Oils Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 130)
    public void verifyClickingOnOilsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getOilsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOilsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getOilsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), oilsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Pasta Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 131)
    public void verifyClickingOnPastaOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getPastaOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPastaOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getPastaOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), pastaOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Rice And Grains Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 132)
    public void verifyClickingOnRiceAndGrainsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), riceAndGrainsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Seasonings And Spices Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 133)
    public void verifyClickingOnSeasoningsAndSpicesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), seasoningsAndSpicessOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sugar And Sweeteners Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 134)
    public void verifyClickingOnSugarSweetenersOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sugarAndSweetenersOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Syrups Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 135)
    public void verifyClickingOnSyrupsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSyrupsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSyrupsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getSyrupsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), syrupsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Tea And Herbs Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 136)
    public void verifyClickingOnTeaAndHerbsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), teaAndHerbsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Superfoods Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 137)
    public void verifyClickingOnSuperfoodsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Ready Mixes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 138)
    public void verifyClickingOnReadyMixesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getReadyMixesOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getReadyMixesOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getReadyMixesOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), readyMixInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Breakfast And Cereal Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 139)
    public void verifyClickingOnBreakfastAndCerealOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), breakfastAndCerealInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Ready To Drink Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 140)
    public void verifyClickingOnReadyToDrinkOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), readyToDrinkInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino And Bcaas Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 141)
    public void verifyClickingOnAminoAndBcaasOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoBcaasInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Energy Drinks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 142)
    public void verifyClickingOnEnergyDrinksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), energyDrinksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Protein Shakes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 143)
    public void verifyClickingOnProteinShakesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinShakesOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinShakesOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getProteinShakesOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinShakesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 144)
    public void verifyClickingOnElectrolytesAndHydrationOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 145)
    public void verifyClickingOnHealthySnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthySnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Protein Bars Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 146)
    public void verifyClickingOnProteinBarsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBarsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinBarsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getProteinBarsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBarsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Cookies Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 147)
    public void verifyClickingOnCookiesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCookiesOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCookiesOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getCookiesOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), cookiesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Chips Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 148)
    public void verifyClickingOnChipsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getChipsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getChipsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getChipsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), chipsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Brownies And Pancakes Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 149)
    public void verifyClickingOnBrowniesAndPancakesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), browniesAndPancakesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Snack Bars Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 150)
    public void verifyClickingOnSnackBarsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSnackBarsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSnackBarsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getSnackBarsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), snackBarsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Spreads Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 151)
    public void verifyClickingOnSpreadsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getSpreadsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSpreadsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getSpreadsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), spreadsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Other Healthy Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 152)
    public void verifyClickingOnOtherHealthySnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), otherHealthySnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Ready To Eat Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 153)
    public void verifyClickingOnReadyToEatOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToEatOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getReadyToEatOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getReadyToEatOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), readyToEatInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Meals Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 154)
    public void verifyClickingOnHealthyMealsOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Featured Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 155)
    public void verifyClickingOnFeaturedOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFeaturedOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getFeaturedOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), featuredInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Meal Replacement Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 156)
    public void verifyClickingOnHealthyMealReplacementOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealReplacementInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Protein Coffee Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 157)
    public void verifyClickingOnProteinCoffeeOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinCoffeeInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Candies Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 158)
    public void verifyClickingOnCandiesOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getCandiesOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCandiesOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getCandiesOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), candiesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Flavoring Agents Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 159)
    public void verifyClickingOnFlavoringAgentsOptionOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), flavoringAgentsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Keto Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 160)
    public void verifyClickingOnKetoSnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ketoSnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Manuka Honey Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 161)
    public void verifyClickingOnManukaHoneyOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), manukaHoneyInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Meat Snacks Option appearing in the Healthy Food menu inside ShopBy Menu will redirect the User to the correct URL", priority = 162)
    public void verifyClickingOnMeatSnacksOptionInHealthyFoodMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodOption()).perform();
        action.moveToElement(aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMenu().getAttribute("href");
        aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), meatSnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure the Sports menu Inside ShopBy Menu display the correct categories and sub-categories", priority = 163)
    public void verifySportsMenuInsideShopByMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getOptionList().get(0).getText(), "MEN\n" + "CLOTHING\n" + "Tops\n" + "Pants\n" + "Shorts\n" + "Jackets And Coats\n" +
                "Safety Masks\n" + "FOOTWEAR\n" + "Sneakers\n" + "Training Shoes\n" + "Running Shoes\n" + "Hiking Shoes\n" + "ACCESSORIES\n" + "Gloves\n" + "Belts\n" +
                "CAPS & HATS\n" + "Cap\n" + "SHAKERS\n" + "Water Bottles\n" + "Water Bottles\n" + "Socks\n" + "Towels\n" + "Sunglasses\n" + "Mixer\n" + "BAGS\n" + "Backpacks\n" +
                "Shoulder Bags\n" + "WEARABLE TECH\n" + "Watches\n" + "Gaming Accessories\n" + "EQUIPMENT\n" + "Grips\n" + "Balls\n" + "Rollers\n" + "Weights\n" + "WOMEN\n" +
                "CLOTHING\n" + "Tops\n" + "Shorts\n" + "Safety Masks\n" + "ACCESSORIES\n" + "GLOVES\n" + "Gloves\n" + "Belts\n" + "CAPS & HATS\n" + "Cap\n" + "SHAKERS\n" +
                "Water Bottles\n" + "Socks\n" + "Towels\n" + "Sunglasses\n" + "Mixer\n" + "BAGS\n" + "Backpacks\n" + "Shoulder Bags");
    }

    @Test(description = "Make sure the main categories in the Sports  menu Inside ShopBy Menu appearing in Bold Font", priority = 164)
    public void verifyTheMainCategoriesInTheSportsMenuInsideShopByMenuAppearingInBoldFont() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        Assert.assertTrue(aeMegamenuPage.getMenOptionInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getClothingInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getFootwearInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getAccessoriesInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getCapsAndHatsInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getShakersInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getBagsInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWearableTechInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.geEquipmentInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenClothingInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenAccessoriesInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenGlovesInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenCapsAndHatsInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenShakersInSportsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getWomenBagsInSportsMenu().getCssValue("font-weight").contains("700"));

    }

    @Test(description = "Make sure the main categories in the Sports  menu Inside ShopBy Menu menu appearing in uppercase", priority = 165)
    public void verifyTheMainCategoriesInTheSportsMenuInsideShopByMenuAppearingInUppercase() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        Assert.assertEquals(aeMegamenuPage.getMenOptionInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getClothingInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getFootwearInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getAccessoriesInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getCapsAndHatsInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getShakersInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getBagsInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWearableTechInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.geEquipmentInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenClothingInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenAccessoriesInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenGlovesInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenCapsAndHatsInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenShakersInSportsMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWomenBagsInSportsMenu().getCssValue("text-transform"), "uppercase");
    }

    @Test(description = "Make sure clicking on the Men Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 166)
    public void verifyClickingOnMenOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getMenOptionInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMenOptionInSportsMenu().getAttribute("href");
        aeMegamenuPage.getMenOptionInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), menInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Clothing Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 167)
    public void verifyClickingOnClothingOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getClothingInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getClothingInSportsMenu().getAttribute("href");
        aeMegamenuPage.getClothingInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), clothingInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Tops Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 168)
    public void verifyClickingOnTopsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getTopsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTopsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getTopsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), topsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Pants Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 169)
    public void verifyClickingOnPantsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getPantsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPantsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getPantsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), pantsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Shorts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 170)
    public void verifyClickingOnShortsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getShortsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getShortsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getShortsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), shortsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Jackets And Coats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 171)
    public void verifyClickingOnJacketsAndCoatsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getJacketsAndCoatsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getJacketsAndCoatsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getJacketsAndCoatsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), jacketsAndCoatsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Safety Masks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 172)
    public void verifyClickingOnSafetyMasksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSafetyMasksInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSafetyMasksInSportsMenu().getAttribute("href");
        aeMegamenuPage.getSafetyMasksInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), safetyMasksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Footwear Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 173)
    public void verifyClickingOnFootwearOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getFootwearInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFootwearInSportsMenu().getAttribute("href");
        aeMegamenuPage.getFootwearInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), footwearInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sneakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 174)
    public void verifyClickingOnSneakersOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSneakersInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSneakersInSportsMenu().getAttribute("href");
        aeMegamenuPage.getSneakersInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sneakersInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Training Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 175)
    public void verifyClickingOnTrainingShoesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getTrainingShoesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTrainingShoesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getTrainingShoesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), trainingShoesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Running Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 176)
    public void verifyClickingOnRunningShoesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getRunningShoesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRunningShoesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getRunningShoesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), runningShoesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Hiking Shoes Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 177)
    public void verifyClickingOnHikingShoesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getHikingShoesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHikingShoesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getHikingShoesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hikingShoesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 178)
    public void verifyClickingOnAccessoriesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getAccessoriesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAccessoriesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getAccessoriesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), accessoriesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gloves Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 179)
    public void verifyClickingOnGlovesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getGlovesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGlovesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getGlovesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), glovesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Belts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 180)
    public void verifyClickingOnBeltsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBeltsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBeltsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getBeltsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), beltsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Caps And Hats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 181)
    public void verifyClickingOnCapsAndHatsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getCapsAndHatsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCapsAndHatsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getCapsAndHatsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), capsAndHatsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Caps Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 182)
    public void verifyClickingOnCapsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getCapInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCapInSportsMenu().getAttribute("href");
        aeMegamenuPage.getCapInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), capInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Shakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 183)
    public void verifyClickingOnShakersOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getShakersInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getShakersInSportsMenu().getAttribute("href");
        aeMegamenuPage.getShakersInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), shakersInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Water Bottles Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 184)
    public void verifyClickingOnWaterBottlesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWaterBottlesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWaterBottlesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWaterBottlesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), waterBottlesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    //There's A Bug Here Due To Water Bottles Option Appearing Duplicated ut I added this test case to save the qoption position
    @Test(description = "Theres A Bug Here Due To Water Bottles Option Appearing Duplicated", priority = 185)
    public void theresABugHereDueToWaterBottlesOptionAppearingDuplicated() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBugHereInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBugHereInSportsMenu().getAttribute("href");
        aeMegamenuPage.getBugHereInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), "Theres A Bug Here Due To Water Bottles Option Appearing Duplicated");
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
        System.out.println("Theres A Bug Here Due To Water Bottles Option Appearing Duplicated");
    }

    @Test(description = "Make sure clicking on the Socks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 186)
    public void verifyClickingOnSocksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSocksInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSocksInSportsMenu().getAttribute("href");
        aeMegamenuPage.getSocksInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), socksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Towels Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 187)
    public void verifyClickingOnTowelsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getTowelsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTowelsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getTowelsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), towelsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sunglasses Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 188)
    public void verifyClickingOnSunglassesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getSunglassesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSunglassesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getSunglassesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sunglassesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Mixer Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 189)
    public void verifyClickingOnMixterOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getMixerInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMixerInSportsMenu().getAttribute("href");
        aeMegamenuPage.getMixerInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mixerInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 190)
    public void verifyClickingOnBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBagsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBagsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getBagsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bagsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Back Packs Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 191)
    public void verifyClickingOnBackPacksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBackPacksInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBackPacksInSportsMenu().getAttribute("href");
        aeMegamenuPage.getBackPacksInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), backPacksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Shoulder Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 192)
    public void verifyClickingOnShoulderBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getShoulderBagsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getShoulderBagsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getShoulderBagsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), shoulderBagsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Wearable Tech Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 193)
    public void verifyClickingOnWearableTechOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWearableTechInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWearableTechInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWearableTechInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), wearableTechInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Watches Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 194)
    public void verifyClickingOnWatchesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWatchesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWatchesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWatchesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), watchesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gaming Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 195)
    public void verifyClickingOnGamingAccessoriesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getGamingAccessoriesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGamingAccessoriesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getGamingAccessoriesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), gamingAccessoriesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Equipment Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 196)
    public void verifyClickingOnEquipmentOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.geEquipmentInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.geEquipmentInSportsMenu().getAttribute("href");
        aeMegamenuPage.geEquipmentInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), equipmentInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Grips Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 197)
    public void verifyClickingOnGripstOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getGripsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGripsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getGripsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), gripsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Balls Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 198)
    public void verifyClickingOnBallstOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBallsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBallsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getBallsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ballsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Rollers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 199)
    public void verifyClickingOnRollerstOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getRollersInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRollersInSportsMenu().getAttribute("href");
        aeMegamenuPage.getRollersInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), rollersInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Weights Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 200)
    public void verifyClickingOnWeightsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWeightsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWeightsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWeightsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), weightsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 201)
    public void verifyClickingOnWomenOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Clothing Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 202)
    public void verifyClickingOnWomenClothingOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenClothingInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenClothingInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenClothingInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
       // Assert.assertEquals(webDriver.getCurrentUrl(), womenClothingInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Tops Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 203)
    public void verifyClickingOnWomenTopsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTopsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenTopsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenTopsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenTopsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Shorts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 204)
    public void verifyClickingOnWomenShortsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenShortsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenShortsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenShortsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenShortsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Safety Masks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 205)
    public void verifyClickingOnWomenSafetyMasksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSafetyMasksInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenSafetyMasksInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenSafetyMasksInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenSafetyMasksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Accessories Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 206)
    public void verifyClickingOnWomenAccessoriesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenAccessoriesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenAccessoriesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenAccessoriesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenAccessoriesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Theres A Bug Here Due To Gloves Option Appearing Duplicated", priority = 207)
    public void theresABugHereDueToGlovesOptionAppearingDuplicated() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getBugGlovesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBugGlovesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getBugGlovesInSportsMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), "Theres A Bug Here Due To Gloves Option Appearing Duplicated");
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
        System.out.println("Theres A Bug Here Due To Gloves Option Appearing Duplicated");
    }

    @Test(description = "Make sure clicking on the Women Gloves Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 208)
    public void verifyClickingOnWomenGlovesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenGlovesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenGlovesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenGlovesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenGlovesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Belts Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 209)
    public void verifyClickingOnWomenBeltsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBeltsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenBeltsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenBeltsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenBeltsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Caps And Hats Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 210)
    public void verifyClickingOnWomenCapsAndHatsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenCapsAndHatsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenCapsAndHatsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenCapsAndHatsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenCapsAndHatsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Caps Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 211)
    public void verifyClickingOnWomenCapsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenCapsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenCapsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenCapsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenCapsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Shakers Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 212)
    public void verifyClickingOnWomenShakersOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenShakersInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenShakersInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenShakersInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenShakersInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Water Bottles Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 213)
    public void verifyClickingOnWomenWaterBottlesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenWaterBottlesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenWaterBottlesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenWaterBottlesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenWaterBottlesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Socks Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 214)
    public void verifyClickingOnWomenSocksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSocksInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenSocksInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenSocksInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenSocksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Towels Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 215)
    public void verifyClickingOnWomenTowelsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTowelsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenTowelsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenTowelsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenTowelsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Sunglasses Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 216)
    public void verifyClickingOnWomenSunglassesOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSunglassesInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenSunglassesInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenSunglassesInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenSunglassesInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Mixer Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 217)
    public void verifyClickingOnWomenMixerOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenMixerInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenMixerInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenMixerInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenMixerInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());

    }

    @Test(description = "Make sure clicking on the Women Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 218)
    public void verifyClickingOnWomenBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBagsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenBagsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenBagsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenBagsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Back Packs Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 219)
    public void verifyClickingOnWomenBackPacksOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBackPacksInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenBackPacksInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenBackPacksInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenBackPacksInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Sholders Bags Option appearing in the Sports menu inside ShopBy Menu will redirect the User to the correct URL", priority = 220)
    public void verifyClickingOnWomenSholdersBagsOptionInSportsMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSholdersBagsInSportsMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenSholdersBagsInSportsMenu().getAttribute("href");
        aeMegamenuPage.getWomenSholdersBagsInSportsMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenSholdersBagsInSportsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    ///// By Brand
    @Test(description = "Make sure clicking on the Supplements Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 221)
    public void verifyClickingOnSupplementsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getSupplementsOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSupplementsOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getSupplementsOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), supplementsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Optimum Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 222)
    public void verifyClickingOnOptimumNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOptimumNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOptimumNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getOptimumNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), optimumNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Muscletech Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 223)
    public void verifyClickingOnMuscletechOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMuscletechOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMuscletechOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getMuscletechOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), muscletechInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Cellucor Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 224)
    public void verifyClickingOnCellucorOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getCellucorOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCellucorOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getCellucorOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), cellucorInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Dymatize Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 225)
    public void verifyClickingOnDymatizeOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getDymatizeOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDymatizeOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getDymatizeOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), dymatizeInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Xtend Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 226)
    public void verifyClickingOnXtendOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getXtendOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getXtendOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getXtendOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), xtendInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Animal Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 227)
    public void verifyClickingOnAnimalNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getAnimalNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAnimalNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getAnimalNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), animalNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Muscle Pharm Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 228)
    public void verifyClickingOnMusclePharmOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMusclePharmOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMusclePharmOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getMusclePharmOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), musclePharmInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Universal Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 229)
    public void verifyClickingOnUniversalNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getUniversalNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getUniversalNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getUniversalNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), universalNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the BSN Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 230)
    public void verifyClickingOnBSNOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBsnOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBsnOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getBsnOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bsnInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the EHPLABS Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 231)
    public void verifyClickingOnEhplabsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getEhplabsOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEhplabsOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getEhplabsOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ehplabsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Jym Supplement Science Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 232)
    public void verifyClickingOnJymSupplementScienceOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getJymSupplementScienceOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getJymSupplementScienceOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getJymSupplementScienceOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), jymSupplementScienceInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Bpi Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 233)
    public void verifyClickingOnBpiSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBpiSportsOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBpiSportsOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getBpiSportsOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bpiSportsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Russian Bear Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 234)
    public void verifyClickingOnRussianBearOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getRussianBearOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRussianBearOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getRussianBearOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), russianBearInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Iso Pure Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 235)
    public void verifyClickingOnIsopureOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getIsopureOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getIsopureOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getIsopureOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), isopureInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the 1 Up Nutrition  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 236)
    public void verifyClickingOnOneUpNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOneUpNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOneUpNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getOneUpNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), oneUpNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Musclemen  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 237)
    public void verifyClickingOnMusclemedsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMusclemedsOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMusclemedsOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getMusclemedsOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), musclemedInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the MHP  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 238)
    public void verifyClickingOnMhpOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.gethMhpOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.gethMhpOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.gethMhpOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mhpInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Evl Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 239)
    public void verifyClickingOnEvlNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getEvlNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEvlNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getEvlNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), evlNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Nla For Her Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 240)
    public void verifyClickingOnNlaForHerOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNlaForHerOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNlaForHerOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getNlaForHerOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nlaForHerInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Muscle Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 241)
    public void verifyClickingOnMuscleNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMuscleNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMuscleNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getMuscleNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), muscleNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gat Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 242)
    public void verifyClickingOnGatNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGatNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGatNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getGatNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), gatNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Labrador Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 243)
    public void verifyClickingOnLabradorOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getLabradaOptionInByBrandMenu()).perform();
        aeMegamenuPage.getMuscleNutritionOptionInByBrandMenu().click();
        String expectedUrl=aeMegamenuPage.getLabradaOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getLabradaOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), labradaInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Orgain Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 244)
    public void verifyClickingOnOrgainOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOrgainOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOrgainOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getOrgainOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), orgainInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Nutrex Research Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 245)
    public void verifyClickingOnNutrexResearchOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNutrexResearchOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNutrexResearchOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getNutrexResearchOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nutrexResearchInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Scitec Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 246)
    public void verifyClickingOnScitecNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getScitecNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getScitecNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getScitecNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), scitecNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Prolab Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 247)
    public void verifyClickingOnProlabOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getProlabOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProlabOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getProlabOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), prolabInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the SOTRU Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 248)
    public void verifyClickingOnSotruOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getSotruOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSotruOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getSotruOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sotruInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Divine Health Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 249)
    public void verifyClickingOnDivineHealthOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getDivineHealthOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDivineHealthOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getDivineHealthOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), divineHealthInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Ghost Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 250)
    public void verifyClickingOnGhostOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGhostOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGhostOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getGhostOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ghostInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women's Best Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 251)
    public void verifyClickingOnWomensBestOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getWomensBestOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomensBestOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getWomensBestOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womensBestInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Efx Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 252)
    public void verifyClickingOnEfxSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getEfxSportsOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEfxSportsOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getEfxSportsOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), efxSportsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Basix Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 253)
    public void verifyClickingOnBasixOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBasixOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBasixOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getBasixOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), basixInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the AK-47 Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 254)
    public void verifyClickingOnAK47OptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getAk47OptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAk47OptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getAk47OptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ak47InByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Nf Sports Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 255)
    public void verifyClickingOnNfSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNfSportsOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNfSportsOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getNfSportsOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nfSportsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Fully Dosed Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 256)
    public void verifyClickingOnFullyDosedOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getFullyDosedOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFullyDosedOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getFullyDosedOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fullyDosedInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the 5% Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 257)
    public void verifyClickingOnFivePercentNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getFivePercentNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFivePercentNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getFivePercentNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fivePercentNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Olimp Sport Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 258)
    public void verifyClickingOnOlimpSportNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOlimpSportNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOlimpSportNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getOlimpSportNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), olimpSportNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Jnx Sports Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 259)
    public void verifyClickingOnJnxSportsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getJnxSportsOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getJnxSportsOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getJnxSportsOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), jnxSportsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Fit & Lean Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 260)
    public void verifyClickingOnFitAndLeanOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getFitAndLeanOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFitAndLeanOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getFitAndLeanOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fitAndLeanInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gym queen Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 261)
    public void verifyClickingOnGymQueenOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGymqueenOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGymqueenOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getGymqueenOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), gymqueenInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the The Pack Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 262)
    public void verifyClickingOnThePackOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getThePackOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getThePackOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getThePackOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), thePackInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Betancourt Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 263)
    public void verifyClickingOnBetancourtNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBetancourtNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBetancourtNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getBetancourtNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), betancourtNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Yalla Protein Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 264)
    public void verifyClickingOnYallaProteinOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getYallaProteinOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getYallaProteinOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getYallaProteinOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), yallaProteinInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Protein World Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 265)
    public void verifyClickingOnProteinWorldOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getProteinWorldOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinWorldOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getProteinWorldOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinWorldInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Obvi Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 266)
    public void verifyClickingOnObviOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getObviOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getObviOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getObviOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), obviInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Naughty Boy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 267)
    public void verifyClickingOnNaughtyBoyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNaughtyBoyOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNaughtyBoyOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getNaughtyBoyOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), naughtyBoyInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Steel Fit Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 268)
    public void verifyClickingOnSteelFitOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getSteelFitOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSteelFitOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getSteelFitOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), steelFitInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the USN Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 269)
    public void verifyClickingOnUsnOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getUsnOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getUsnOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getUsnOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), usnInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the X-Gamer Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 270)
    public void verifyClickingOnXGamerOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getXGamerOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getXGamerOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getXGamerOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), xGamerInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Innosupps Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 271)
    public void verifyClickingOnInnosuppsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getInnosuppsOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getInnosuppsOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getInnosuppsOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), innosuppsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Outbreak Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 272)
    public void verifyClickingOnOutbreakNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOutbreakNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOutbreakNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getOutbreakNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), outbreakNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Insane Labz Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 273)
    public void verifyClickingOnInsaneLabzOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getInsaneLabzOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getInsaneLabzOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getInsaneLabzOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), insaneLabzInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the All Max Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 274)
    public void verifyClickingOnAllMaxOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getAllMaxOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAllMaxOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getAllMaxOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), allMaxInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Glaxon Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 275)
    public void verifyClickingOnGlaxonOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGlaxonOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGlaxonOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getGlaxonOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), glaxonInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Redcon1 Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 276)
    public void verifyClickingOnRedconOneOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getRedcon1OptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRedcon1OptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getRedcon1OptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), redcon1InByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Panda Supplements Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 277)
    public void verifyClickingOnPandaSupplementsOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getPandaSupplementsOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPandaSupplementsOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getPandaSupplementsOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), pandaSupplementsInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Nutrend Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 278)
    public void verifyClickingOnNutrendOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getNutrendOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNutrendOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getNutrendOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nutrendInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Ostrovit Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 279)
    public void verifyClickingOnOstrovitOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getOstrovitOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOstrovitOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getOstrovitOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ostrovitInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Bettery Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 280)
    public void verifyClickingOnBetteryOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getBetteryOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBetteryOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getBetteryOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), betteryInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Food, Snacks & Meal Replacement Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 281)
    public void verifyClickingOnHealthyFoodSnacksAndMealReplacementOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyFoodSnacksAndMealReplacementOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthyFoodSnacksAndMealReplacementOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getHealthyFoodSnacksAndMealReplacementOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyFoodSnacksAndMealReplacementInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Wow Hydrate Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 282)
    public void verifyClickingOnWowHydrateOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getWowHydrateOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWowHydrateOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getWowHydrateOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), wowHydrateInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Quest Nutrition Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 283)
    public void verifyClickingOnQuestNutritionOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getQuestNutritionOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getQuestNutritionOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getQuestNutritionOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), questNutritionInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Grenade Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 284)
    public void verifyClickingOnGrenadeOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getGrenadeOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGrenadeOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getGrenadeOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), grenadeInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Reign Energy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 285)
    public void verifyClickingOnReignEnergyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getReignEnergyOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getReignEnergyOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getReignEnergyOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), reignEnergyInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Monster Energy Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 286)
    public void verifyClickingOnMonsterEnergyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getMonsterEnergyOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMonsterEnergyOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getMonsterEnergyOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), monsterEnergyInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the 3d Energy  Option appearing in the By Brand menu inside ShopBy Menu will redirect the User to the correct URL", priority = 287)
    public void verifyClickingOnThirdEnergyOptionInBrandByMenuInsideShopByMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        action.moveToElement(aeMegamenuPage.getByBrandOption()).perform();
        action.moveToElement(aeMegamenuPage.getThirdEnergyOptionInByBrandMenu()).perform();
        String expectedUrl=aeMegamenuPage.getThirdEnergyOptionInByBrandMenu().getAttribute("href");
        aeMegamenuPage.getThirdEnergyOptionInByBrandMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), thirdEnergyInByBrandMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    ///////SportSupplementsMainMenuTCs///////////////////
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Sport Supplements main menu", priority = 288)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheSportSupplementsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInSportSupplementsMenu().isDisplayed());
    }

    @Test(description = "Make sure the system will display the sub Menu once hovering on the Sport Supplements main menu", priority = 289)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnSportSupplementsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Make sure the Sports Supplements main menu display the correct categories and sub-categories", priority = 290)
    public void verifySportsSupplementsMainMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getSportsSupplementMainMenuList().get(0).getText(), "PROTEIN\n" + "Whey Protein\n" + "Whey Protein Isolate\n" +
                "Protein Blends\n" + "Non-dairy Protein\n" + "Casein Protein\n" + "Diet Protein\n" + "Mass Gainers\n" + "CREATINE\n" +
                "Creatine Monohydrate\n" + "Creatine Blends\n" + "AMINO ACIDS\n" + "BCAA\n" + "EAA\n" + "Arginine\n" + "Beta Alanine\n" +
                "HMB\n" + "Amino Acid Powders\n" + "Amino Acid Pills\n" + "Citrulline\n" + "Amino Acid Liquids\n" + "MUSCLE BOOSTERS\n" +
                "Testosterone Boosters\n" + "Gh Boosters\n" + "WEIGHT MANAGEMENT\n" + "Stimulant Weight Loss\n" + "Non-stimulant Weight Loss\n" +
                "Meal Replacements\n" + "Metabolism Support\n" + "Toning Creams\n" + "MCT\n" + "RECOVERY\n" + "Glutamine\n" + "Recovery Blends\n" +
                "Electrolytes & Hydration\n" + "CARBOHYDRATES\n" + "Carbohydrate Powders\n" + "ENERGY & ENDURANCE\n" + "Stimulant Energy\n" +
                "Non-stimulant Energy\n" + "GAMING & FOCUS\n" + "Gaming Essentials");
    }

    @Test(description = "Make sure clicking on the Sports Supplements main menu will redirect the User to the correct URL", priority = 291)
    public void verifyClickingOnSportsSupplementsManiMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportSupplementsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure the main categories in the Sports Supplements main menu appearing in Bold Font", priority = 293)
    public void verifyTheMainCategoriesInTheSportsSupplementsMainMenuAppearingInBoldFont() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getProteinOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getCreatineOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertEquals(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertTrue(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getRecoveryOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
        Assert.assertTrue(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMenu().getCssValue("font-weight").contains("700"));
    }

    @Test(description = "Make sure the main categories in the Sports Supplements main menu appearing in uppercase", priority = 294)
    public void verifyTheMainCategoriesInTheSportsSupplementsMainMenuAppearingInUppercase() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertEquals(aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
        Assert.assertEquals(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu().getCssValue("text-transform"), "uppercase");
    }

    @Test(description = "Make sure clicking on the Protein option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 295)
    public void verifyClickingOnProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Whey Protein Option appearing in the Sports Supplements main menu  will redirect the User to the correct URL", priority = 296)
    public void verifyClickingOnWheyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getWheyProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), wheyProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Whey Protein Isolate Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 297)
    public void verifyClickingOnWheyProteinIsolateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getWheyProteinIsolateOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), WheyProteinIsolateOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the protein Blends Option  appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 298)
    public void verifyClickingOnProteinBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getProteinBlendsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBlendsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Non Dairy Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 299)
    public void verifyClickingOnNonDairyProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getNonDairyProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nonDairyProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the casein Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 300)
    public void verifyClickingOnCaseinProteinOptionInSportsSupplementsMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCaseinProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), caseinProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the diet Protein Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 301)
    public void verifyClickingOnDietProteinOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDietProteinOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDietProteinOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getDietProteinOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), dietProteinOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Mass Gainers Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 302)
    public void verifyClickingOnMassGainersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMassGainersOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMassGainersOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getMassGainersOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), massGainersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Creatine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 303)
    public void verifyClickingOnCreatineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCreatineOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), creatineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Creatine Monohydrate Option appearing in the Sports Supplements Main menu will redirect the User to the correct URL", priority = 304)
    public void verifyClickingOnCreatineMonohydrateOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCreatineMonohydrateOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), creatineMonohydrateOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Creatine Blends Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 305)
    public void verifyClickingOnCreatineBlendsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCreatineBlendsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), creatineBlendsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino Acids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 306)
    public void verifyClickingOnAminoAcidsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the BCAA Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 307)
    public void verifyClickingOnBCAAOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getbCAAOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getbCAAOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getbCAAOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bCAAOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the EAA Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 308)
    public void verifyClickingOnEAAOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.geteAAOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.geteAAOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.geteAAOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), eAAOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Arginine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 309)
    public void verifyClickingOnArginineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getArginineOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getArginineOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getArginineOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), arginineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Beta Alanine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 310)
    public void verifyClickingOnBetaAlanineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getBetaAlanineOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), betaAlanineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the HMB Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 311)
    public void verifyClickingOnHMbOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.gethMBOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.gethMBOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.gethMBOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hMBOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino Acid Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 312)
    public void verifyClickingOnAminoAcidPowdersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidPowdersOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPowdersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino Acid Pills Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 313)
    public void verifyClickingOnAminoAcidPillsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidPillsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidPillsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Citrulline Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 314)
    public void verifyClickingOnCitrullineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCitrullineOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCitrullineOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCitrullineOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), citrullineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino Acid Liquids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 315)
    public void verifyClickingOnAminoAcidLiquidsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidLiquidsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidLiquidsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Muscle Boosters Liquids Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 316)
    public void verifyClickingOnMuscleBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getMuscleBoostersOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), muscleBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Testosterone Boosters Option appearing in the Sports Supplements main menu  will redirect the User to the correct URL", priority = 317)
    public void verifyClickingOnTestosteroneBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getTestosteroneBoostersOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), testosteroneBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gh Boosters Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 318)
    public void verifyClickingOnGhBoostersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getGhBoostersOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ghBoostersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Weight Management Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 319)
    public void verifyClickingOnWeightManagementOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getWeightManagementOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Stimulant Weight Loss Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 320)
    public void verifyClickingOnStimulantWeightLossOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getStimulantWeightLossOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantWeightLossOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Non Stimulant Weight Loss Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 321)
    public void verifyClickingOnNonStimulantWeightLossOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getNonStimulantWeightLossOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantWeightLossOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Meal Replacements Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 322)
    public void verifyClickingOnMealReplacementsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getMealReplacementsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mealReplacementsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Metabolism Support Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 323)
    public void verifyClickingOnMetabolismSupportOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getMetabolismSupportOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), metabolismSupportOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Toning Creams Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 324)
    public void verifyClickingOnToningCreamsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getToningCreamsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), toningCreamsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the MCT Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 325)
    public void verifyClickingOnMctOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMctOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMctOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getMctOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mctOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Recovery Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 326)
    public void verifyClickingOnRecoveryOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getRecoveryOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Glutamine Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 327)
    public void verifyClickingOnGlutamineOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGlutamineOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGlutamineOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getGlutamineOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), glutamineOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Recovery Blend Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 328)
    public void verifyClickingOnRecoveryBlendOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getRecoveryBlendOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), recoveryBlendOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 329)
    public void verifyClickingOnElectrolytesAndHydrationOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getElectrolytesAndHydrationOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Carbohydrates Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 330)
    public void verifyClickingOnCarbohydratesOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCarbohydratesOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratesOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Carbohydrate Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 331)
    public void verifyClickingOnCarbohydratePowdersOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getCarbohydratePowdersOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), carbohydratePowdersOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Energy And Endurance Powders Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 332)
    public void verifyClickingOnEnergyAndEnduranceOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getEnergyAndEnduranceOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), energyAndEnduranceOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Stimulant Energy Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 333)
    public void verifyClickingOnStimulantEnergyOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getStimulantEnergyOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), stimulantEnergyOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Non Stimulant Energy Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 334)
    public void verifyClickingOnNonStimulantEnergyOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getNonStimulantEnergyOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nonStimulantEnergyOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gaming And Focus Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 335)
    public void verifyClickingOnGamingAndFocusOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getGamingAndFocusOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), gamingAndFocusOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gaming Essentials Option appearing in the Sports Supplements main menu will redirect the User to the correct URL", priority = 336)
    public void verifyClickingOnGamingEssentialsOptionInSportsSupplementsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu().getAttribute("href");
        aeMegamenuPage.getGamingEssentialsOptionInSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), gamingEssentialsOptionInSportSupplementsMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    /////Vitamins & Health TCS////
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Vitamins & Health main menu", priority = 337)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheVitaminsAndHealthMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInVitaminsAndHealthMenu().isDisplayed());
    }

    @Test(description = "Make sure the system will display the sub Menu once hovering on the Vitamins & Health main menu", priority = 338)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnVitaminsAndHealthMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Make sure the Vitamins & Health main menu display the correct categories and sub-categories", priority = 339)
    public void verifyVitaminsAndHealthMainMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getVitaminsAndHealthMainMenuList().get(0).getText(), "FEATURED\n" + "Alive! Vitamins\n" + "Sexual Health\n" + "ESSENTIAL VITAMINS\n" +
                "Folic Acid\n" + "Vitamin A\n" + "Vitamin B\n" + "Vitamin C\n" + "Vitamin D\n" + "Vitamin E\n" + "Vitamin K\n" + "MULTIVITAMINS\n" + "Vitamins For Kids\n" +
                "Multivitamins For Men\n" + "Multivitamins For Women\n" + "BONE & JOINT\n" + "Bone Health\n" + "Joint Health\n" + "BEAUTY\n" + "Collagen\n" + "Hair, Skin & Nails\n" +
                "FISH OIL & OMEGAS\n" + "Fish Oil\n" + "Omega 3 6 9\n" + "HEALTHY LIFESTYLE\n" + "Antioxidants\n" + "Blood Sugar Support\n" + "Brain Support\n" + "Heart Health\n" +
                "Detox & Cleanse\n" + "Energy Formulas\n" + "Eye Health\n" + "Herbs\n" + "Hormones Balance\n" + "Immune Support\n" + "Mens Health\n" + "Stress Relief\n" +
                "Sleep Support\n" + "Superfoods\n" + "Urinary Tract Support\n" + "Weight Management\n" + "Womens Health\n" + "DIGESTION\n" + "Digestive Support\n" + "Probiotics\n" +
                "SPORT VITAMINS\n" + "Amino Acids\n" + "MINERALS\n" + "Calcium\n" + "Iron\n" + "Magnesium\n" + "Multimineral Formulas\n" + "Zinc\n" + "Potassium\n" + "HEALTHY DRINKS\n" +
                "Drinkable Vitamins\n" + "PETS\n" + "Supplements & More");
    }

    @Test(description = "Make sure clicking on the Vitamins & Health main menu will redirect the User to the correct URL", priority = 340)
    public void verifyClickingOnVitaminsAndHealthManiMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthVitaminsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the FEATURED Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 341)
    public void verifyClickingOnFeaturedOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getFeaturedOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), featuredOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Alive Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 342)
    public void verifyClickingOnAliveVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getAliveVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aliveVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sexual Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 343)
    public void verifyClickingOnSexualHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getSexualHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sexualHealthOptionInVitaminsAndHealthUrl);
        System.out.println(webDriver.getCurrentUrl());
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Essential Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 344)
    public void verifyClickingOnEssentialVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getEssentialVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), essentialVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Folic Acid Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 354)
    public void verifyClickingOnFolicAcidOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getFolicAcidOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), folicAcidOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin A Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 355)
    public void verifyClickingOnVitaminAOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminAOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminAOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin B Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 356)
    public void verifyClickingOnVitaminBOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminBOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminBOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin C Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 357)
    public void verifyClickingOnVitaminCOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminCOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminCOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin D Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 358)
    public void verifyClickingOnVitaminDOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminDOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminDOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin E Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 359)
    public void verifyClickingOnVitaminEOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminEOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminEOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamin K Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 360)
    public void verifyClickingOnVitaminKOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminKOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminKOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Multi Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 361)
    public void verifyClickingOnMultiVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getMultiVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), multiVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamins For Kids Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 362)
    public void verifyClickingOnVitaminsForKidsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsForKidsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForKidsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamins For Men Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 363)
    public void verifyClickingOnVitaminsForMenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsForMenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForMenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Vitamins For Women Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 364)
    public void verifyClickingOnVitaminsForWomenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getVitaminsForWomenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), vitaminsForWomenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Bone And Joint Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 365)
    public void verifyClickingOnBoneAndJointOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getBoneAndJointOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), boneJointOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Bone Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 366)
    public void verifyClickingOnBoneHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getBoneHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), boneHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Joint Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 367)
    public void verifyClickingOnJointHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getJointHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), jointHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Beauty Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 368)
    public void verifyClickingOnBeautyOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getBeautyOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), beautyOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Collagen Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 369)
    public void verifyClickingOnCollagenOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getCollagenOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), collagenOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Hair, Skin AndNails Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 370)
    public void verifyClickingOnHairSkinAndNailsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getHairSkinAndNailsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hairSkinAndNailsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Fish Oil Omegas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 371)
    public void verifyClickingOnFishOilOmegasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getFishOilOmegasOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilAndOmegasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Fish Oil Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 372)
    public void verifyClickingOnFishOilOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getFishOilOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fishOilOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Omega369 Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 373)
    public void verifyClickingOnOmega369OptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getOmega369OptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), omegaMixOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Health Lifestyle Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 374)
    public void verifyClickingOnHealthLifestyleOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getHealthLifestyleOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyLifestyleOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Antioxidants Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 375)
    public void verifyClickingOnAntioxidantsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getAntioxidantsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), antioxidantOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Blood Sugar Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 376)
    public void verifyClickingOnBloodSugarSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getBloodSugarSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bloodSugarSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Brain Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 377)
    public void verifyClickingOnBrainSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getBrainSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), brainSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Detox And Cleanse Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 378)
    public void verifyClickingOnDetoxAndCleanseOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getDetoxAndCleanseOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), detoxCleanseOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Energy Formulas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 379)
    public void verifyClickingOnEnergyFormulasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getEnergyFormulasOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), energyFormulasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Eye Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 380)
    public void verifyClickingOnEyeHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getEyeHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), eyeHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Herbs Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 381)
    public void verifyClickingOnHerbsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getHerbsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), herbsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Hormones Balance Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 382)
    public void verifyClickingOnHormonesBalanceOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getHormonesBalanceOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hormonesBalanceOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Immune Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 382)
    public void verifyClickingOnImmuneSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getImmuneSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), immuneSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Mens Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 383)
    public void verifyClickingOnMensHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getMensHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mensHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Stress Relief Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 384)
    public void verifyClickingOnStressReliefOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getStressReliefOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), stressReliefOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sleep Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 385)
    public void verifyClickingOnSleepSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getSleepSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sleepSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Super Foods Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 386)
    public void verifyClickingOnSuperFoodsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getSuperFoodsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Urinary Tract Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 387)
    public void verifyClickingOnUrinaryTractSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getUrinaryTractSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), urinaryTractSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Weight Management Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 388)
    public void verifyClickingOnWeightManagementOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getWeightManagementOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), weightManagementOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Women Health Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 389)
    public void verifyClickingOnWomensHealthOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getWomensHealthOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenesHealthOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Digestion Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 390)
    public void verifyClickingOnDigestionOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getDigestionOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), digestionOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Digestion Support Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 391)
    public void verifyClickingOnDigestionSupportOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getDigestiveSupportOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), digestionSupportOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Probiotics Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 392)
    public void verifyClickingOnProbioticsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getProbioticsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), probioticsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sport Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 393)
    public void verifyClickingOnSportVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getSportVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sportVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino Acid Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 394)
    public void verifyClickingOnAminoAcidOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getAminoAcidOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoAcidOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Minerals Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 395)
    public void verifyClickingOnMineralsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getMineralsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mineralsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Calcium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 396)
    public void verifyClickingOnCalciumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getCalciumOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), calciumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Iron Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 397)
    public void verifyClickingOnIronOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getIronOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getIronOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getIronOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ironOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Magnesium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 398)
    public void verifyClickingOnMagnesiumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getMagnesiumOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), magnesiumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Multi mineral Formulas Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 399)
    public void verifyClickingOnMultimineralFormulasOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getMultimineralFormulasOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), multimineralFormulasOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Zinc Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 400)
    public void verifyClickingOnZincOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getZincOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getZincOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getZincOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), zincOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Potassium Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 401)
    public void verifyClickingOnPotassiumOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getPotassiumOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), potassiumOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Drinks Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 402)
    public void verifyClickingOnHealthyDrinksOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getHealthyDrinksOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyDrinksOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Drinkable Vitamins Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 403)
    public void verifyClickingOnDrinkableVitaminsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getDrinkableVitaminsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), drinkableVitaminsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Pets Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 404)
    public void verifyClickingOnPetsOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getPetsOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), petsOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Supplements More Option appearing in the Vitamins & Health main menu will redirect the User to the correct URL", priority = 405)
    public void verifyClickingOnSupplementsMoreOptionInVitaminsAndHealthMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu().getAttribute("href");
        aeMegamenuPage.getSupplementsMoreOptionInVitaminsAndHealthMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), supplementsMoreOptionInVitaminsAndHealthUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    ////HealthyFood Test Cases
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Healthy Food main menu", priority = 406)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheHealthyFoodMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInHealthyFoodMenu().isDisplayed());
    }

    @Test(description = "Make sure the system will display the sub Menu once hovering on the Healthy Food main menu", priority = 407)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnHealthyFoodMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Make sure the Healthy Food main menu display the correct categories and sub-categories", priority = 408)
    public void verifyHealthFoodMainMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getHealthyFoodMainMenuList().get(0).getText(), "GROCERY\n" + "Baking & Cooking\n" + "Canned\n" + "Coffee\n" + "Condiments\n" +
                "Milk & Cream\n" + "Nuts & Oats\n" + "Oils\n" + "Pasta\n" + "Rice & Grains\n" + "Seasonings & Spices\n" + "Sugar & Sweeteners\n" + "Syrups\n" + "Tea & Herbs\n" +
                "Superfoods\n" + "Ready Mixes\n" + "Breakfast & Cereal\n" + "READY TO DRINK\n" + "Amino & Bcaas\n" + "Energy Drinks\n" + "Protein Shakes\n" + "Electrolytes & Hydration\n" +
                "HEALTHY SNACKS\n" + "Protein Bars\n" + "Cookies\n" + "Chips\n" + "Brownies & Pancakes\n" + "Snack Bars\n" + "Spreads\n" + "Other Healthy Snacks\n" + "READY TO EAT\n" +
                "Healthy Meals\n" + "FEATURED\n" + "Healthy Meal Replacement\n" + "Protein Coffee\n" + "Candies\n" + "Flavoring Agents\n" + "Keto Snacks\n" + "Manuka Honey\n" +
                "Meat Snacks");
    }

    @Test(description = "Make sure clicking on the Healthy Food main menu will redirect the User to the correct URL", priority = 409)
    public void verifyClickingOnHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getHealthyFoodMainMenu().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(healthyFoodsUrl));
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Grocery Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 410)
    public void verifyClickingOnGroceryOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGroceryOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGroceryOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getGroceryOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), groceryOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Baking And Cooking Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 411)
    public void verifyClickingOnBakingAndCookingOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getBakingAndCookingOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bakingAndCookingOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Canned Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 412)
    public void verifyClickingOnCannedOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCannedOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCannedOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getCannedOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), cannedOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Coffee Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 413)
    public void verifyClickingOnCoffeeOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCoffeeOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCoffeeOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getCoffeeOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), coffeeOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Condiments Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 414)
    public void verifyClickingOnCondimentsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCondimentsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCondimentsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getCondimentsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), condimentsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Milk And Cream Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 415)
    public void verifyClickingOnMilkAndCreamOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getMilkAndCreamOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), milkAndCreamOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Nuts And Oats Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 416)
    public void verifyClickingOnNutsAndOatsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getNutsAndOatsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), nutsAndOatsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Oils Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 417)
    public void verifyClickingOnOilsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOilsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOilsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getOilsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), oilsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Pasta Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 418)
    public void verifyClickingOnPastaOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPastaOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPastaOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getPastaOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), pastaOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Rice And Grains Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 419)
    public void verifyClickingOnRiceAndGrainsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getRiceAndGrainsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), riceAndGrainsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Seasonings And Spices Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 420)
    public void verifyClickingOnSeasoningsAndSpicesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getSeasoningsAndSpicesOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), seasoningsAndSpicessOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sugar And Sweeteners Option appearing in the Healthy Food main menu inside ShopBy Menu will redirect the User to the correct URL", priority = 421)
    public void verifyClickingOnSugarSweetenersOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getSugarSweetenersOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sugarAndSweetenersOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Syrups Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 422)
    public void verifyClickingOnSyrupsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSyrupsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSyrupsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getSyrupsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), syrupsOptionInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Tea And Herbs Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 423)
    public void verifyClickingOnTeaAndHerbsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getTeaAndHerbsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), teaAndHerbsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Superfoods Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 424)
    public void verifyClickingOnSuperfoodsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getSuperfoodsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), superFoodsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Ready Mixes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 425)
    public void verifyClickingOnReadyMixesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getReadyMixesOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), readyMixInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Breakfast And Cereal Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 426)
    public void verifyClickingOnBreakfastAndCerealOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getBreakfastAndCerealOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), breakfastAndCerealInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Ready To Drink Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 427)
    public void verifyClickingOnReadyToDrinkOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getReadyToDrinkOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), readyToDrinkInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Amino And Bcaas Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 428)
    public void verifyClickingOnAminoAndBcaasOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getAminoAndBcaasOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), aminoBcaasInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Energy Drinks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 429)
    public void verifyClickingOnEnergyDrinksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getEnergyDrinksOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), energyDrinksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Protein Shakes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 430)
    public void verifyClickingOnProteinShakesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getProteinShakesOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinShakesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Electrolytes And Hydration Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 431)
    public void verifyClickingOnElectrolytesAndHydrationOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getElectrolytesAndHydrationOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), electrolytesAndHydrationInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 432)
    public void verifyClickingOnHealthySnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getHealthySnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthySnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Protein Bars Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 433)
    public void verifyClickingOnProteinBarsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getProteinBarsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinBarsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Cookies Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 434)
    public void verifyClickingOnCookiesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCookiesOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCookiesOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getCookiesOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), cookiesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Chips Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 435)
    public void verifyClickingOnChipsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getChipsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getChipsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getChipsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), chipsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Brownies And Pancakes Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 436)
    public void verifyClickingOnBrowniesAndPancakesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getBrowniesAndPancakesOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), browniesAndPancakesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Snack Bars Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 437)
    public void verifyClickingOnSnackBarsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getSnackBarsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), snackBarsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Spreads Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 438)
    public void verifyClickingOnSpreadsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSpreadsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSpreadsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getSpreadsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), spreadsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Other Healthy Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 439)
    public void verifyClickingOnOtherHealthySnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getOtherHealthySnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), otherHealthySnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Ready To Eat Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 440)
    public void verifyClickingOnReadyToEatOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getReadyToEatOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), readyToEatInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Meals Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 441)
    public void verifyClickingOnHealthyMealsOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getHealthyMealsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Featured Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 442)
    public void verifyClickingOnFeaturedOptionInHealthyFoodMianMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFeaturedOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFeaturedOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getFeaturedOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), featuredInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Healthy Meal Replacement Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 443)
    public void verifyClickingOnHealthyMealReplacementOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getHealthyMealReplacementOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), healthyMealReplacementInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Protein Coffee Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 444)
    public void verifyClickingOnProteinCoffeeOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getProteinCoffeeOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), proteinCoffeeInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Candies Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 445)
    public void verifyClickingOnCandiesOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCandiesOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCandiesOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getCandiesOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), candiesInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Flavoring Agents Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 446)
    public void verifyClickingOnFlavoringAgentsOptionOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getFlavoringAgentsOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), flavoringAgentsInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Keto Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 447)
    public void verifyClickingOnKetoSnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getKetoSnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), ketoSnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Manuka Honey Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 448)
    public void verifyClickingOnManukaHoneyOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getManukaHoneyOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), manukaHoneyInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Meat Snacks Option appearing in the Healthy Food main menu will redirect the User to the correct URL", priority = 449)
    public void verifyClickingOnMeatSnacksOptionInHealthyFoodMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu().getAttribute("href");
        aeMegamenuPage.getMeatSnacksOptionInHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), meatSnacksInHealthyFoodUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    ////Sports Test Cases
    @Test(description = "Make sure the Down-arrow Icon display correctly next to the Sports main menu", priority = 450)
    public void verifyTheDownArrowIconAppearsCorrectlyNextToTheSportsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getDownArrowKeyInSportsMenu().isDisplayed());
    }

    @Test(description = "Make sure the system will display the sub Menu once hovering on the Sports main menu", priority = 451)
    public void verifyTheSubMenuWillAppearsCorrectlyOnceHoveringOnSportsMainMenu() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Make sure the Sports main menu display the correct categories and sub-categories", priority = 452)
    public void verifySportsMainMenuDisplayTheCorrectCategoriesAndSubCategories() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        DataHelperAndWait.implicitWait(5);
        Assert.assertEquals(aeMegamenuPage.getSportsMainMenuList().get(0).getText(), "MEN\n" + "SPORT\n" + "Football\n" + "Basketball\n" + "Baseball\n" + "Running\n" +
                "Swimming\n" + "Yoga\n" + "Fitness And Training\n" + "MMA\n" + "Jiu Jitsu\n" + "Board Games\n" + "SPORTS TECH\n" + "Wearable Tech\n" + "Cameras\n" + "Phone Accessories\n" +
                "PERSONAL CARE\n" + "Showering\n" + "Shaving\n" + "Skin Care\n" + "Body Care\n" + "Oral Care\n" + "Therapy\n" + "Masks\n" + "FITNESS AND TRAINING\n" + "FITNESS EQUIPMENT\n" +
                "Skipping Ropes\n" + "Weight Belts\n" + "Scooters\n" + "TRAINING ACCESSORIES\n" + "Shakers & Bottles\n" + "Bags\n" + "Gloves\n" + "Braces & Sleeves\n" + "Mouthguard\n" +
                "APPAREL\n" + "SPORTSWEAR\n" + "Pants\n" + "Shorts\n" + "Hoodies\n" + "T-shirts\n" + "Tanks\n" + "FOOTWEAR\n" + "Sneakers\n" + "Training Shoes\n" + "Running Shoes\n" +
                "WOMEN\n" + "SPORTS TECH\n" + "Wearable Tech\n" + "Cameras\n" + "Phone Accessories\n" + "PERSONAL CARE\n" + "Showering\n" + "Skin Care\n" + "Body Care\n" +
                "Oral Care\n" + "Therapy\n" + "Masks\n" + "FITNESS AND TRAINING\n" + "TRAINING ACCESSORIES");
    }

    @Test(description = "Make sure clicking on the Sports main menu will redirect the User to the correct URL", priority = 453)
    public void verifyClickingOnSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        action = new Actions(webDriver);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Men Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 454)
    public void verifyClickingOnMenOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMenOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMenOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getMenOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), menInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sport Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 455)
    public void verifyClickingOnSportOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSportOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getSportOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sportInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Football Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 456)
    public void verifyClickingOnFootballOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFootballOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFootballOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getFootballOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), footballInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Basketball Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 457)
    public void verifyClickingOnBasketballOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBasketballOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBasketballOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getBasketballOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), basketballInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Baseball Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 458)
    public void verifyClickingOnBaseballOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBaseballOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBaseballOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getBaseballOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), baseballInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Running Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 459)
    public void verifyClickingOnRunningOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRunningOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRunningOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getRunningOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), runningInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Swimming Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 460)
    public void verifyClickingOnSwimmingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSwimmingOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSwimmingOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getSwimmingOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), swimmingInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Yoga Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 461)
    public void verifyClickingOnYogaOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getYogaOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getYogaOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getYogaOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), yogaInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Fitness And Training Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 462)
    public void verifyClickingOnFitnessAndTrainingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getFitnessAndTrainingOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fitnessAndTrainingInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the MMA Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 463)
    public void verifyClickingOnMmaOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMmaOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMmaOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getMmaOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mmaInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Jiu Jitsu Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 464)
    public void verifyClickingOnJiuJitsuOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getJiuJitsuOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getJiuJitsuOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getJiuJitsuOptionInSportsMainMenu().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),expectedUrl);
//        Assert.assertEquals(webDriver.getCurrentUrl(), jiuJitsuInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Board Games Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 465)
    public void verifyClickingOnBoardGamesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBoardGamesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBoardGamesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getBoardGamesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), boardGamesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the SPORTS TECH Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 466)
    public void verifyClickingOnSportsTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportsTechOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSportsTechOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getSportsTechOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sportsTechInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Wearable Tech Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 467)
    public void verifyClickingOnWearableTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWearableTechOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWearableTechOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWearableTechOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), wearableTechInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Cameras Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 468)
    public void verifyClickingOnCamerasOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getCamerasOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getCamerasOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getCamerasOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), camerasInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Phone Accessories Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 469)
    public void verifyClickingOnPhoneAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getPhoneAccessoriesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), phoneAccessoriesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the PERSONAL CARE Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 470)
    public void verifyClickingOnPersonalCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPersonalCareOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPersonalCareOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getPersonalCareOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), personalCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Showering Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 471)
    public void verifyClickingOnShoweringOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShoweringOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getShoweringOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getShoweringOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), showeringInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Shaving Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 472)
    public void verifyClickingOnShavingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShavingOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getShavingOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getShavingOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), shavingInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Skin Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 473)
    public void verifyClickingOnSkinCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSkinCareOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSkinCareOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getSkinCareOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), skinCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Body Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 474)
    public void verifyClickingOnBodyCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBodyCareOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBodyCareOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getBodyCareOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bodyCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Oral Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 475)
    public void verifyClickingOnOralCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getOralCareOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getOralCareOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getOralCareOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), oralCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Therapy Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 476)
    public void verifyClickingOnTherapyOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTherapyOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTherapyOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getTherapyOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), therapyInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Masks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 477)
    public void verifyClickingOnMasksOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMasksOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMasksOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getMasksOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), masksInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the FITNESS AND TRAINING Category Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 480)
    public void verifyClickingOnFitnessAndTrainingCategoryOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getFitnessAndTrainingCategoryOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fitnessAndTrainingCategoryInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the FITNESS EQUIPMENT Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 481)
    public void verifyClickingOnFitnessEquipmentOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFitnessEquipmentOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFitnessEquipmentOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getFitnessEquipmentOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), fitnessEquipmentInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Skipping Ropes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 482)
    public void verifyClickingOnSkippingRopesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSkippingRopesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSkippingRopesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getSkippingRopesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), skippingRopesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Weight Belts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 483)
    public void verifyClickingOnWeightBeltsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWeightBeltsOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWeightBeltsOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWeightBeltsOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), weightBeltsInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Scooters Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 484)
    public void verifyClickingOnScootersOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getScootersOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getScootersOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getScootersOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), scootersInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the TRAINING ACCESSORIES Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 485)
    public void verifyClickingOnTrainingAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getTrainingAccessoriesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), trainingAccessoriesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Shakers & Bottles Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 486)
    public void verifyClickingOnShakersAndBottlesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShakersAndBottlesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getShakersAndBottlesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getShakersAndBottlesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), shakersBottlesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Bags Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 487)
    public void verifyClickingOnBagsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBagsOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBagsOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getBagsOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bagsInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Gloves Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 488)
    public void verifyClickingOnGlovesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getGlovesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getGlovesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getGlovesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), glovesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Braces & Sleeves Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 489)
    public void verifyClickingOnBracesAndSleevesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getBracesAndSleevesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getBracesAndSleevesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getBracesAndSleevesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), bracesSleevesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Mouthguard Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 490)
    public void verifyClickingOnMouthguardOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getMouthguardOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getMouthguardOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getMouthguardOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), mouthguardInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the APPAREL Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 491)
    public void verifyClickingOnApparelOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getApparelOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getApparelOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getApparelOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), apparelInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the SPORTSWEAR Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 492)
    public void verifyClickingOnSportswearOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSportswearOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSportswearOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getSportswearOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sportsWearInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Pants Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 493)
    public void verifyClickingOnPantsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getPantsOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getPantsOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getPantsOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), pantsInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Shorts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 494)
    public void verifyClickingOnShortsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getShortsOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getShortsOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getShortsOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), shortsInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Hoodies Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 495)
    public void verifyClickingOnHoodiesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getHoodiesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getHoodiesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getHoodiesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), hoodiesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the T-Shirts Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 496)
    public void verifyClickingOnTShirtsOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.gettShirtsOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.gettShirtsOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.gettShirtsOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), tShirtsInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Tanks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 497)
    public void verifyClickingOnTanksOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTanksOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTanksOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getTanksOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), tanksInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the FOOTWEAR Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 498)
    public void verifyClickingOnFootwearOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getFootwearOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getFootwearOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getFootwearOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), footwearInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Sneakers Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 499)
    public void verifyClickingOnSneakersOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getSneakersOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getSneakersOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getSneakersOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), sneakersInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Training Shoes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 500)
    public void verifyClickingOnTrainingShoesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getTrainingShoesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getTrainingShoesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getTrainingShoesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), trainingShoesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the Running Shoes Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 501)
    public void verifyClickingOnRunningShoesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getRunnigShoesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getRunnigShoesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getRunnigShoesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), runningShoesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 502)
    public void verifyClickingOnWomenOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN SPORTS TECH Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 503)
    public void verifyClickingOnWomenSportsTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSportsTechOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenSportsTechOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenSportsTechOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenSportsTechInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN Wearable Tech Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 504)
    public void verifyClickingOnWomenWearableTechOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenWearableTechOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenWearableTechOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenWearableTechOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenWearableTechInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN Cameras Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 505)
    public void verifyClickingOnWomenCamerasOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenCamerasOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenCamerasOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenCamerasOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenCamerasInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN Phone Accessories Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 506)
    public void verifyClickingOnWomenPhoneAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenPhoneAccessoriesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenPhoneAccessoriesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN PERSONAL CARE Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 507)
    public void verifyClickingOnWomenPersonalCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenPersonalCareOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenPersonalCareOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenPersonalCareOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenPersonalCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN Showering Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 508)
    public void verifyClickingOnWomenShoweringOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenShoweringOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenShoweringOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenShoweringOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenShoweringInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN Skin Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 509)
    public void verifyClickingOnWomenSkinCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenSkinCareOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenSkinCareOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenSkinCareOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenSkinCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN Body Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 510)
    public void verifyClickingOnWomenBodyCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenBodyCareOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenBodyCareOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenBodyCareOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenBodyCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN Oral Care Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 511)
    public void verifyClickingOnWomenOralCareOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenOralCareOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenOralCareOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenOralCareOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenOralCareInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN Therapy Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 512)
    public void verifyClickingOnWomenTherapyOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTherapyOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenTherapyOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenTherapyOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenTherapyInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN Masks Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 513)
    public void verifyClickingOnWomenMasksOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenMasksOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenMasksOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenMasksOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenMasksInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN FITNESS AND TRAINING Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 514)
    public void verifyClickingOnWomenFitnessAndTrainingOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenFitnessAndTrainingOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenFitnessAndTrainingInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    @Test(description = "Make sure clicking on the WOMEN TRAINING ACCESSORIES Option appearing in the Sports main menu will redirect the User to the correct URL", priority = 515)
    public void verifyClickingOnWomenTrainingAccessoriesOptionInSportsMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        action.moveToElement(aeMegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenTrainingAccessoriesOptionInSportsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenTrainingAccessoriesInSportsMainMenuUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    //Women's Only Test Cases
    @Test(description = "Make sure clicking on the Women's Only main menu will redirect the User to the correct URL", priority = 516)
    public void verifyClickingOnWomenOnlyMainMenuRedirectUserToCorrectURL() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        action.moveToElement(aeMegamenuPage.getWomenOnlyMainMenu()).perform();
        String expectedUrl=aeMegamenuPage.getWomenOnlyMainMenu().getAttribute("href");
        aeMegamenuPage.getWomenOnlyMainMenu().click();
        DataHelperAndWait.implicitWait(3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertEquals(webDriver.getCurrentUrl(), womenOnlyUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
    }

    //The following test cases to handle (#8456 - Main menu not working when you try to open it from OOS product page)
    @Test(description = "Make sure the ShopBy menu is displayed when hovering on it from OOS Product page ", priority = 517)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromOosProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(siteURL+outOfStockProduct);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Sport Supplements menu is displayed when hovering on it from OOS Product page ", priority = 518)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromOosProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(siteURL+outOfStockProduct);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Vitamins & Health menu is displayed when hovering on it from OOS Product page ", priority = 519)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromOosProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(siteURL+outOfStockProduct);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Healthy Food menu is displayed when hovering on it from OOS Product page ", priority = 520)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromOosProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(siteURL+outOfStockProduct);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getHealthyFoodSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Sports menu is displayed when hovering on it from OOS Product page ", priority = 521)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromOosProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(siteURL+outOfStockProduct);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    //The following Test Cases handle displaying the Mega Menu from Product Page
    @Test(description = "Make sure the ShopBy menu is displayed when hovering on it from OOS Product page ", priority = 522)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(siteURL+product);
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }

    @Test(description = "Make sure the Sport Supplements menu is displayed when hovering on it from OOS Product page ", priority = 523)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(siteURL+product);
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSupplementsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from Product Page");
    }

    @Test(description = "Make sure the Vitamins & Health menu is displayed when hovering on it from OOS Product page ", priority = 524)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(siteURL+product);
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getVitaminsAndHealthSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Healthy Food menu is displayed when hovering on it from Product page ", priority = 525)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(siteURL+product);
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getHealthyFoodSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }

    @Test(description = "Make sure the Sports menu is displayed when hovering on it from Product page ", priority = 526)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromProductPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        aeMegamenuPage.switchToAECountry();
        webDriver.navigate().to(siteURL+product);
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSportsSubMenuSection().isDisplayed(), "The Sport Supplements menu is not displayed when Hovering on it from OOS Product Page");
    }
//Banners inside the MegaMenu lists
@Test(description = "Make sure clicking on the first banner that appears inside the sport supplements menu works correctly ", priority = 527)
public void verifyClickingOnFirstBannerInTheSportSupplementsMenuWorksCorrectly() {
    aeMegamenuPage = new AEMegaMenuPage(webDriver);
    aeAllPagesInsideCategoriesInMegaMenuPage= new AeAllPagesInsideCategoriesInMegaMenuPage(webDriver);
    action = new Actions(webDriver);
    aeMegamenuPage.switchToAECountry();
    action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
    action.moveToElement(aeAllPagesInsideCategoriesInMegaMenuPage.getFirstBannerInsideTheSportSupplementsMenu()).perform();
    aeAllPagesInsideCategoriesInMegaMenuPage.getFirstBannerInsideTheSportSupplementsMenu().click();
    boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
    assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
    boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
    assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
    boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
    assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
}
@Test(description = "Make sure clicking on the second banner that appears inside the sport supplements menu works correctly ", priority = 528)
public void verifyClickingOnSecondBannerInTheSportSupplementsMenuWorksCorrectly() {
    aeMegamenuPage = new AEMegaMenuPage(webDriver);
    aeAllPagesInsideCategoriesInMegaMenuPage= new AeAllPagesInsideCategoriesInMegaMenuPage(webDriver);
    action = new Actions(webDriver);
    aeMegamenuPage.switchToAECountry();
    action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
    action.moveToElement(aeAllPagesInsideCategoriesInMegaMenuPage.getSecondBannerInsideTheSportSupplementsMenu()).perform();
    aeAllPagesInsideCategoriesInMegaMenuPage.getSecondBannerInsideTheSportSupplementsMenu().click();
    boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
    assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
    boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
    assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
    boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
    assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
}
@Test(description = "Make sure clicking on the first banner that appears inside the Vitamins And Health menu works correctly ", priority = 529)
public void verifyClickingOnFirstBannerInTheVitaminsAndHealthMenuWorksCorrectly() {
    aeMegamenuPage = new AEMegaMenuPage(webDriver);
    aeAllPagesInsideCategoriesInMegaMenuPage= new AeAllPagesInsideCategoriesInMegaMenuPage(webDriver);
    action = new Actions(webDriver);
    aeMegamenuPage.switchToAECountry();
    action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
    action.moveToElement(aeAllPagesInsideCategoriesInMegaMenuPage.getFirstBannerInsideTheVitaminsAndHealthMenu()).perform();
    aeAllPagesInsideCategoriesInMegaMenuPage.getFirstBannerInsideTheVitaminsAndHealthMenu().click();
    boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
    assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
    boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
    assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
    boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
    assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
}
@Test(description = "Make sure clicking on the second banner that appears inside the Vitamins And Health menu works correctly ", priority = 530)
public void verifyClickingOnSecondBannerInTheVitaminsAndHealthMenuWorksCorrectly() {
    aeMegamenuPage = new AEMegaMenuPage(webDriver);
    aeAllPagesInsideCategoriesInMegaMenuPage= new AeAllPagesInsideCategoriesInMegaMenuPage(webDriver);
    action = new Actions(webDriver);
    aeMegamenuPage.switchToAECountry();
    action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
    action.moveToElement(aeAllPagesInsideCategoriesInMegaMenuPage.getSecondBannerInsideTheVitaminsAndHealthMenu()).perform();
    aeAllPagesInsideCategoriesInMegaMenuPage.getSecondBannerInsideTheVitaminsAndHealthMenu().click();
    boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
    assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
    boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
    assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
    boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
    assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
}
@Test(description = "Make sure clicking on the first banner that appears inside the Healthy Food menu works correctly ", priority = 531)
public void verifyClickingOnFirstBannerInTheHealthyFoodMenuWorksCorrectly() {
    aeMegamenuPage = new AEMegaMenuPage(webDriver);
    aeAllPagesInsideCategoriesInMegaMenuPage= new AeAllPagesInsideCategoriesInMegaMenuPage(webDriver);
    action = new Actions(webDriver);
    aeMegamenuPage.switchToAECountry();
    action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
    action.moveToElement(aeAllPagesInsideCategoriesInMegaMenuPage.getFirstBannerInsideTheHealthyFoodMenu()).perform();
    aeAllPagesInsideCategoriesInMegaMenuPage.getFirstBannerInsideTheHealthyFoodMenu().click();
    boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
    assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
    boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
    assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
    boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
    assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
}
@Test(description = "Make sure clicking on the second banner that appears inside the Healthy Food menu works correctly ", priority = 532)
public void verifyClickingOnSecondBannerInTheHealthyFoodMenuWorksCorrectly() {
    aeMegamenuPage = new AEMegaMenuPage(webDriver);
    aeAllPagesInsideCategoriesInMegaMenuPage= new AeAllPagesInsideCategoriesInMegaMenuPage(webDriver);
    action = new Actions(webDriver);
    aeMegamenuPage.switchToAECountry();
    action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
    action.moveToElement(aeAllPagesInsideCategoriesInMegaMenuPage.getSecondBannerInsideTheHealthyFoodMenu()).perform();
    aeAllPagesInsideCategoriesInMegaMenuPage.getSecondBannerInsideTheHealthyFoodMenu().click();
    boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
    assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
    boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
    assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
    boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
    assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
}
@Test(description = "Make sure clicking on the first banner that appears inside the Sports menu works correctly ", priority = 533)
public void verifyClickingOnFirstBannerInTheSportsMenuWorksCorrectly() {
    aeMegamenuPage = new AEMegaMenuPage(webDriver);
    aeAllPagesInsideCategoriesInMegaMenuPage= new AeAllPagesInsideCategoriesInMegaMenuPage(webDriver);
    action = new Actions(webDriver);
    aeMegamenuPage.switchToAECountry();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeAllPagesInsideCategoriesInMegaMenuPage.getFirstBannerInsideTheSportsMenu()).perform();
    aeAllPagesInsideCategoriesInMegaMenuPage.getFirstBannerInsideTheSportsMenu().click();
    boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
    assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
    boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
    assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
    boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
    assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
}
@Test(description = "Make sure clicking on the second banner that appears inside the Sports menu works correctly ", priority = 534)
public void verifyClickingOnSecondBannerInTheSportsMenuWorksCorrectly() {
    aeMegamenuPage = new AEMegaMenuPage(webDriver);
    aeAllPagesInsideCategoriesInMegaMenuPage= new AeAllPagesInsideCategoriesInMegaMenuPage(webDriver);
    action = new Actions(webDriver);
    aeMegamenuPage.switchToAECountry();
    action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
    action.moveToElement(aeAllPagesInsideCategoriesInMegaMenuPage.getSecondBannerInsideTheSportsMenu()).perform();
    aeAllPagesInsideCategoriesInMegaMenuPage.getSecondBannerInsideTheSportsMenu().click();
    boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
    assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
    boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
    assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
    boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
    assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page and the URL is "+webDriver.getCurrentUrl());
}
}