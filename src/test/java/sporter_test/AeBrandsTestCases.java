///**
// * @author w.jumaa
// * @projectName sporter-web-automation
// * @classDescription This class make sure all pages related to the Brand pages from search screen works fine
// */
//
//package sporter_test;
//
//import core.BaseTest;
//import core.DataHelperAndWait;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import sporter_pages.AEMegaMenuPage;
//import sporter_pages.AeProductDetailsPage;
//import sporter_pages.AeSearchPage;
//import sporter_pages.AeSportSupplementsCategoryPage;
//
//import static org.testng.Assert.assertFalse;
//
//public class AeBrandsTestCases extends BaseTest {
//    private AeSearchPage aeSearchPage;
//    private AeBrandsTestCases aeBrandsTestCases;
//    private AeProductDetailsPage aeProductDetailsPage;
//    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
//    private AEMegaMenuPage aeMegaMenuPage;
//
//    @Test(description = "Make sure the ability to access all pages related to the Jym supplementJym supplement brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToJymSupplementJymSupplementBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(0),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(0).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(0).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Blender Bottle brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToBlenderBottleBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(1),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(1).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(1).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the V3 Apparel brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToV3ApparelBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(2),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(2).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(2).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Yoga Design Lab brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToYogaDesignLabBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(3),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(3).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(3).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Terry Naturally brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToTerryNaturallyBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(4),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(4).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(4).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Swanson Vitamins brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToSwansonVitaminsBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(5),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(5).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(5).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Efx Sports brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToEfxSportsBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(6),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(6).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(6).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Planetary Herbals brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToPlanetaryHerbalsBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(7),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(7).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(7).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the nivea brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToNiveaBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(8),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(8).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(8).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the puma brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToPumaBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(9),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(9).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(9).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Women Best brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToWomensBestBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(10),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(10).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(10).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Health Aid brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToHealthAidBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(11),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(11).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(11).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the O.a Foods brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToOAFoodsBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(12),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(12).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(12).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Rainbow Light brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToRainbowLightBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(13),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(13).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(13).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the Swisse brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToSwisseBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(14),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(14).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(14).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Ghost brand correctly", priority =1 )
//    public void VerifyAbilityToAccessAllPagesRelatedToGhostBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(15),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(15).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(15).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the Oomf-nutrition brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedTOoomfNutritionBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(16),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(16).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(16).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Full Green brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedTFullGreenBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(17),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(17).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(17).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the Planet Organic brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToPlanetOrganicBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(18),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(18).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(18).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Life Extension brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToLifeExtensionBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(19),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(19).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(19).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Sporter brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToSporterBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(20),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(20).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(20).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the Divine Health brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToDivineHealthBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(21),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(21).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(21).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Titin Force brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToTitinForceBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(22),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(22).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(22).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Sotru brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToSotruBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(23),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(23).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(23).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the Super Nutrition brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToSuperNutritionBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(24),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(24).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(24).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the Lizi’s Granola brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToLiziGranolaBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(25),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(25).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(25).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Nairn’s brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToNairnBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(26),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(26).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(26).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the IRemedies brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToIRemediesBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(27),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(27).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(27).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Chike Nutrition brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToChikeNutritionBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(28),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(28).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(28).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Fitmark brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToFitmarkBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(29),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(29).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(29).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Quest Nutrition brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToQuestNutritionBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(30),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(30).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(30).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Xtend brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToXtendBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(31),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(31).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(31).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Cellucor brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToCellucorBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(32),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(32).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(32).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Bpi Sports brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToBpiSportsBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(33),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(33).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(33).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Animal Nutrition brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToAnimalNutritionBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(34),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(34).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(34).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the Sahale Snacks brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToSahaleSnacksBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(35),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(35).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(35).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Universal Nutrition brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToUniversalNutritionBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(36),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(36).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(36).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Flahavan's brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToFlahavansBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(37),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(37).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(37).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Bobs Red Mill brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToBobsRedMillBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(38),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(38).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(38).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Nu Hair brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToNuHairBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(39),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(39).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(39).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to theShen Min brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToShenMinBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(40),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(40).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(40).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Natrol brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToNatrolBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(41),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(41).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(41).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Pandomar brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToPandomarBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(42),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(42).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(42).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Organic Larder brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToOrganicLarderBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(43),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(43).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(43).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Russian Bear brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToRussianBearBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(44),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(44).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(44).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Performa brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToPerformaBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(45),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(45).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(45).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Webber Naturals brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToWebberNaturalsBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(46),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(46).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(46).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Prolab brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToProlabBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(47),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(47).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(47).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Jobedu brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToJobeduBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(48),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(48).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(48).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Windmill brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToWindmillBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(49),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(49).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(49).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Orgain brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToOrgainBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(50),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(50).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(50).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Optimum Nutrition brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToOptimumNutritionBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(51),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(51).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(51).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    //There's a bug here
//    @Test(description = "Make sure the ability to access all pages related to the Applied Nutrition brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToAppliedNutritionBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(52),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(52).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(52).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Hunter Foods brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToHunterFoodsBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(53),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(53).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(53).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//    @Test(description = "Make sure the ability to access all pages related to the Nutrex Research brand correctly", priority =16 )
//    public void VerifyAbilityToAccessAllPagesRelatedToNutrexResearchBrandCorrectly()
//    {   aeSearchPage=new AeSearchPage(webDriver);
//        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
//        aeMegaMenuPage= new AEMegaMenuPage(webDriver);
//        aeMegaMenuPage.switchToAECountry();
//        aeProductDetailsPage.getSearchBtn().click();
//        aeSearchPage.getBrandsTab().click();
//        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(54),3);
//        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(54).getAttribute("href");
//        aeSearchPage.getBrandsListInBrandPage().get(54).click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
//        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//        assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//        assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//        boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//        boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//        assertFalse(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//        assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "and the URL is"+webDriver.getCurrentUrl());
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());
//    }
//
//
//
//
//}
